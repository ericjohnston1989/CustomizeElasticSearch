Custom scoring and similarity scripts that can be loaded into elasticsearch

useful commands:

elasticsearch-1.7.0/bin/plugin --url file:///home/ubuntu/elasticsearch-1.7.0/lib/customizeelasticsearch_2.11-0.1.jar --install FixedSimilarity

curl -XPOST 'http://localhost:9200/_cluster/nodes/_local/_shutdown'
