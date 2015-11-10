package org.elasticsearch.index.similarity


import org.elasticsearch.plugins.AbstractPlugin
import org.elasticsearch.index.similarity.SimilarityModule


class FixedSimilarityPlugin extends AbstractPlugin {

  override def name() : String = "FixedSimilarity"

  override def description() : String = "FixedSimilarity plugin"

  def onModule(module : SimilarityModule) : Unit = {
    module.addSimilarity("FixedSimilarity", classOf[FixedSimilarityProvider])
  }

}

