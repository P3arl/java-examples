# java-examples
Coding examples in java.

-- Builder Pattern: A less verbose example of builder pattern in java in which you don't need to define member variables twice.

-- BooleanDeserializer: Custom Deserializer for boolean values in the DTO, will accept true, false, 0 and 1

-- TestLambda: Handle checked exception when using inside lambda, as Functional interfaces in Java 8 doesn't throw any checked exception, so will need to wrap your exception in RuntimeException before throwing. For this you can make a custom @FunctionalInterface which throws Exception like I have made in this example.
