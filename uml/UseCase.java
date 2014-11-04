/*
 * Use Case
 */

/**
 * @opt operations
 * @opt attributes
 * @opt types
 * @hidden
 */
class UMLOptions {}

/** @hidden */
class Date {}
/** @hidden */
class Person {}
/** @hidden */
class Text {}
/** @hidden */
class URL {}

/**
 * @has "" associatedMedia "" MediaObject
 */

class CreativeWork {
	Person creator;
	Text name;
	URL license;
	URL url;
}

class MediaObject {
	URL contentURL;
}

