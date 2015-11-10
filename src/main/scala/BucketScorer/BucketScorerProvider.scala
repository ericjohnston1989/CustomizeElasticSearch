package org.elasticsearch.index.similarity


import org.elasticsearch.common.Nullable
import org.elasticsearch.script.ExecutableScript
import org.elasticsearch.script.NativeScriptFactory
import java.util.Map


class BucketScorerProvider extends NativeScriptFactory {
  def newScript(@Nullable params : Map[String, Object]) : ExecutableScript = {
    return new BucketScorer()
  }
}
