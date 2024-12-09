package com.example.kinopoiskcinemaapp.presentation.search.settings

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kinopoiskcinemaapp.R
import com.example.kinopoiskcinemaapp.entity.films.Country
import com.example.kinopoiskcinemaapp.ui.theme.SmLightGrayColor

@Composable
fun SelectCountryView(listCountries: List<Country>, nameItem: (country: Country) -> Unit) {
    val filterText = remember { mutableStateOf("") }
    val filteredList = remember { mutableStateOf(listCountries) }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, end = 20.dp)
    ) {
        Spacer(Modifier.height(20.dp))
        Surface(shape = RoundedCornerShape(20.dp), color = SmLightGrayColor) {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 10.dp, end = 10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {

                Icon(imageVector = Icons.Default.Search, contentDescription = null)
                OutlinedTextField(
                    value = filterText.value,
                    placeholder = { Text(text = stringResource(R.string.enter_name_country_placeholder)) },
                    onValueChange = {
                        filterText.value = it
                        filteredList.value =
                            if (it.length > 0) {
                                listCountries.filter { listItem ->
                                    "[${filterText.value.lowercase()}]+".toRegex()
                                        .containsMatchIn(listItem.country.lowercase())
                                }
                            } else listCountries
                    },
                    maxLines = 1,
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = SmLightGrayColor,
                        unfocusedBorderColor = SmLightGrayColor
                    )
                )
            }

        }
        Spacer(Modifier.height(30.dp))
        LazyColumn(verticalArrangement = Arrangement.spacedBy(10.dp)) {
            items(filteredList.value) { listItem ->
                Item(listItem,
                    onClickItem = { country -> nameItem(country) })
                HorizontalDivider(modifier = Modifier.padding(top = 10.dp))
            }
        }
    }
}

@Composable
private fun Item(country: Country, onClickItem: (item: Country) -> Unit) {
    ClickableText(text = AnnotatedString(country.country)) { onClickItem(country) }
}


@Preview(showBackground = true)
@Composable
fun PreviewSelectCountryView() {
    SelectCountryView(
        listOf(
            Country("First", id = 0),
            Country("Second", id = 0),
            Country("Third", id = 0)
        )
    ) { }
}