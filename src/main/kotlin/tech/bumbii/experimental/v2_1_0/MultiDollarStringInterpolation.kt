package tech.bumbii.experimental.v2_1_0

fun main() {
    val simpleName: String? = "Simple Name"
    val qualifiedName: String? = "Qualified Name"
    val multiDollarString = $$"""
   {
      "$schema": "https://json-schema.org/draft/2020-12/schema",
      "$id": "https://example.com/product.schema.json",
      "$dynamicAnchor": "meta"
      "title": "$${simpleName ?: qualifiedName ?: "unknown"}",
      "type": "object"
    }
    """

    println(multiDollarString)
}