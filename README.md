# DynamicInjectionBasedOnQualifiers
Showing how to do dynamic injection of a specific implementation (e.g. dummy or real implementation) depending on certain criterias (e.g. current environment is test? Or prod? Or ...) by using qualifiers.
Dynamic means: Without re-deploying your application!

Check out IsItTestOrProdEnvironmentDecider.java - this is where the decision is made (by reading from a resource that can be changed without re-deploying...)

Learned from Adam Bien. Thanks!
