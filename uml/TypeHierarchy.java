/*
 * Class Hierarchy
 */

/**
 * @opt operations
 * @opt attributes
 * @opt types
 * @hidden
 */
class UMLOptions {}

/* Define some types we use */
/** @hidden */
class URL {}
/** @hidden */
class Text {}
/** @hidden */
class Person {}
/** @hidden */
class Date {}
/** @hidden */
class PublicationEvent {}
/** @hidden */
class QuantitativeValue {}

/**
 */

class Thing {
  // URL additionalType;
  // Text alternateName;
  Text description;
  // ImageObject image;
  Text name;
  // URL sameAs;
  URL url;
}

/**
 * @extends Thing
 */

class CreativeWork {
  // Thing about;
  MediaObject associatedMedia;
  Person copyrightHolder;
  Date copyrightYear;
  Person creator;
  Date datePublished;
  CreativeWork exampleOfWork;
  CreativeWork hasPart;
  URL isBasedOnUrl;
  URL license;
  Person publisher;
  // CreativeWork workExample;
}

/**
 * @extends CreativeWork
 */

class MediaObject {
  // Text contentSize;
  URL contentUrl;
  Text encodingFormat;
  // QuantitativeValue height;
  // PublicationEvent publication;
  Date uploadDate;
  // QuantitativeValue width;
}

/**
 * @extends MediaObject
 */

class ImageObject {
  Text caption;
  Text exifData;
  //ImageObject thumbnail;
}

/**
 * @extends CreativeWork
 */

class Article {
}

/**
 * @extends CreativeWork
 */

class Photograph {
}

/**
 * @extends CreativeWork
 */

class Webpage {
  Date lastReviewed;
  // ImageObject primaryImageOfPage;
  // URL relatedLink;
  Person reviewedBy;
}
