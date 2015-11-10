package org.elasticsearch.index.similarity


import org.elasticsearch.plugins.AbstractPlugin
import org.elasticsearch.index.similarity.SimilarityModule


class BaseSimilarityPlugin extends AbstractPlugin {

  override def name() : String = "base"

  override def description() : String = "base similarity plugin"

  def onModule(module : SimilarityModule) : Unit = {
    module.addSimilarity("base", classOf[BaseSimilarityProvider])
  }

}
