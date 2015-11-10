package org.elasticsearch.index.similarity

import org.elasticsearch.common.inject.Inject
import org.elasticsearch.common.inject.assistedinject.Assisted
import org.elasticsearch.common.settings.Settings
import org.elasticsearch.index.Index
import org.elasticsearch.index.settings.IndexSettings


class BaseSimilarityProvider @Inject() (
  @Assisted name : String
) extends AbstractSimilarityProvider(name) {

  private val similarity = new BaseSimilarity

  override def get() : BaseSimilarity = this.similarity
}
