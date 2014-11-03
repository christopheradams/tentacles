/*
 * Webpage
 */

/**
 * @opt operations
 * @opt attributes
 * @opt types
 * @hidden
 */
class UMLOptions {}

/**
 * @has "" hasPart "" CreativeWork
 */

class WebPage {
	Person reviewedBy;
}

class Photograph {
}

/**
 * @has "" associatedMedia "" MediaObject
 * @has "" exampleOfWork "" Photograph
 */

class CreativeWork {
	Person creator;
	URL license;
}

class MediaObject {
}

/** @hidden */
class Person {
}

/** @hidden */
class URL {
}

/**
 * @extends MediaObject
 */

class ImageObject {
}
