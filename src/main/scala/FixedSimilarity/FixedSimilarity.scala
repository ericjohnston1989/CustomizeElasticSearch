package org.elasticsearch.index.similarity

import org.apache.lucene.search.similarities.DefaultSimilarity

/**
 * Custom similarity class
 * 
 * @author Eric Johnston
 *
  */

class FixedSimilarity extends DefaultSimilarity {
	
  override def idf(docFreq : Long, numDocs : Long) : Float = 1.0F
  override def coord(overlap : Int, maxOverlap : Int) : Float = 1.0F
  override def queryNorm(sumOfSquaredWeights : Float) : Float = 1.0F

}
