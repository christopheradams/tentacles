/*
 * Model Relationships
 * Octopus.org
 */

/**
 * @opt operations
 * @opt attributes
 * @opt types
 * @hidden
 */
class UMLOptions {}

class Thing {
}

/**
 * @has "" associatedMedia "" MediaObject
 * @has "" exampleOfWork "" CreativeWork
 * @has ""  about "" Thing
 * @has "" creator "" Person
 */

class CreativeWork {
}

/**
 * @has "" associatedArticle "" NewsArticle
 */

class MediaObject {
}

class Person {
}

/**
 * @extends MediaObject
 */

class ImageObject {
}
