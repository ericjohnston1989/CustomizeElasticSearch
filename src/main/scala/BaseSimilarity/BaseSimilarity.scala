package org.elasticsearch.index.similarity

import org.apache.lucene.search.similarities.DefaultSimilarity

/**
 * Custom similarity class
 * 
 * @author Eric Johnston
 *
  */

class BaseSimilarity extends DefaultSimilarity {
	
  //override def coord(overlap : Int, maxOverlap : Int) : Float = 1.0F
  override def queryNorm(sumOfSquaredWeights : Float) : Float = 1.0F
  
}

