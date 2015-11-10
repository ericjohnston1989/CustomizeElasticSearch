package org.elasticsearch.index.similarity


import org.elasticsearch.script.AbstractFloatSearchScript


case class BucketScorer() extends AbstractFloatSearchScript {

  override def runAsFloat() : Float = {
    1.0F
  }

}
