package org.elasticsearch.index.similarity


import org.elasticsearch.plugins.AbstractPlugin
import org.elasticsearch.script.ScriptModule

/**
 * Provides a fast* score script for our primary use case
 */
class BucketScorerPlugin extends AbstractPlugin {
  override def name(): String = "BucketScorer"

  override def description(): String = "BucketScorer plugin";

  def onModule(module: ScriptModule): Unit = {
    module.registerScript("BucketScorer", classOf[BucketScorerProvider])
  }
}


// bin/plugin --url file:///home/ubuntu/elasticsearch-1.7.0/lib/customizeelasticsearch_2.11-0.1.jar --install BucketScorer

//curl -XPOST 'http://localhost:9200/_cluster/nodes/_local/_shutdown'
