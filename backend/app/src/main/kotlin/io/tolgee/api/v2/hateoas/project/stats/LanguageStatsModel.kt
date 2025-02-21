package io.tolgee.api.v2.hateoas.project.stats

import org.springframework.hateoas.RepresentationModel

open class LanguageStatsModel(
  val languageId: Long?,
  val languageTag: String?,
  val languageName: String?,
  val languageOriginalName: String?,
  val languageFlagEmoji: String?,
  val translatedKeyCount: Long,
  val translatedWordCount: Long,
  val translatedPercentage: Double,
  val reviewedKeyCount: Long,
  val reviewedWordCount: Long,
  val reviewedPercentage: Double,
  val untranslatedKeyCount: Long,
  val untranslatedWordCount: Long,
  val untranslatedPercentage: Double
) : RepresentationModel<LanguageStatsModel>()
