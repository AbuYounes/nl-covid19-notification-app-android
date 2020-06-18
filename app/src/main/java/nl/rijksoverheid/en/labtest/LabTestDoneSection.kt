/*
 * Copyright (c) 2020 De Staat der Nederlanden, Ministerie van Volksgezondheid, Welzijn en Sport.
 *  Licensed under the EUROPEAN UNION PUBLIC LICENCE v. 1.2
 *
 *  SPDX-License-Identifier: EUPL-1.2
 */
package nl.rijksoverheid.en.labtest

import com.xwray.groupie.Section
import nl.rijksoverheid.en.R
import nl.rijksoverheid.en.items.ButtonItem
import nl.rijksoverheid.en.items.HeaderItem
import nl.rijksoverheid.en.items.IllustrationItem
import nl.rijksoverheid.en.items.ParagraphItem

class LabTestDoneSection(close: () -> Unit) : Section(
    listOf(
        IllustrationItem(R.drawable.illustration_lab_test),
        HeaderItem(R.string.lab_test_done_header_1),
        ParagraphItem(R.string.lab_test_done_paragraph_2),
        ParagraphItem(R.string.lab_test_done_list_3),
        ButtonItem(R.string.lab_test_done_button, close)
    )
)