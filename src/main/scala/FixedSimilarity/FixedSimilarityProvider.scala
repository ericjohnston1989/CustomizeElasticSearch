package org.elasticsearch.index.similarity

import org.elasticsearch.common.inject.Inject
import org.elasticsearch.common.inject.assistedinject.Assisted
import org.elasticsearch.common.settings.Settings
import org.elasticsearch.index.Index
import org.elasticsearch.index.settings.IndexSettings


class FixedSimilarityProvider @Inject() (
  @Assisted name : String
) extends AbstractSimilarityProvider(name) {

  private val similarity = new FixedSimilarity

  override def get() : FixedSimilarity = this.similarity
}

