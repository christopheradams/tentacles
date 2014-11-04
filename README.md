About
=====

Tentacles is a basic data model for identifying and describing the use and re-use of creative works and media objects on the World Wide Web. It is based on the type hierarchy and vocabulary of [Schema.org](http://schema.org/) (~> 1.9), "an initiative... to create and support a common set of schemas for structured data markup on web pages." (*Wikipedia*)

The purpose of our data model is to record latent provenance information available on the web by asserting relationships between creators, rights-holders, creative works, web pages, and media objects.

Type Hierarchy
==============

Schema.org uses a generic data model derived from RDF Schema which comprises a [set of types and properties](http://schema.org/docs/full.html) for describing structured data. A small subset of types are of interest to our own model:

![TypeHierarchy.png](https://raw.githubusercontent.com/christopheradams/tentacles/master/uml/TypeHierarchy.png)

The diagram shows a fraction of the valid properties for each type, only those that are relevant to our model. Note that the types are arranged in an inheritance hierarchy, meaning that each class can have all of the properties of the types above it. For example, a `WebPage` can have a `url` property because `Thing` is one of its superclasses.

Data Model
==========

The centerpiece of our model is a `CreativeWork`, defined minimally by a creator, title (name), license, and URL; and at least one associated `MediaObject`.

![UseCase.png](https://raw.githubusercontent.com/christopheradams/tentacles/master/uml/UseCase.png)

If a work has been re-used on the web, we identify the `WebPage` where it is shown, and declare that the page contains the transformed work using the `hasPart` property. To the transformed work we add any meta-data we can find on the web page about the work, as well as any associated media files. Finally, we use the `exampleOfWork` property to link the transformed work to the original.

![ReuseCase.png](https://raw.githubusercontent.com/christopheradams/tentacles/master/uml/ReuseCase.png)

We can also identify which user has asserted or verified the web page contents using the `reviewedBy` property.

This data model should be sufficient for describing provenence information for creative works on the Web. The example can be extended to other media objects (like video or music recording) and more specific publishing contexts (like news article or blog posting).
