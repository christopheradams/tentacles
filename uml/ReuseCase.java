/*
 * Reuse Case
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
 * @has "" hasPart "" CreativeWork
 */

class WebPage {
	Person reviewedBy;
}

/**
 * CreativeWork
 * @opt commentname
 */
class OriginalWork {
}

/**
 * @has "" associatedMedia "" MediaObject
 * @has "" exampleOfWork "" OriginalWork
 */

class CreativeWork {
	Text description;
}

class MediaObject {
}
