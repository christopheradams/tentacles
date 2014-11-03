About
=====

Tentacles is a basic data model for identifying and describing the use and re-use of creative works and media objects on the World Wide Web. It is based on the type hierarchy and vocabulary of [Schema.org](http://schema.org/) (~> 1.9), "an initiative... to create and support a common set of schemas for structured data markup on web pages." (*Wikipedia*)

The purpose of our data model is to record latent provenance information available on the web by asserting relationships between creators, rights-holders, creative works, web pages, and media objects.

Type Hierarchy
==============

Schema.org uses a generic data model derived from RDF Schema which comprises a [set of types and properties](http://schema.org/docs/full.html) for describing structured data. A small subset of types are of interest to our own model:

![TypeHierarchy.png](https://raw.githubusercontent.com/christopheradams/tentacles/master/uml/TypeHierarchy.png)

Data Model
==========

The root of our data model is a `WebPage` as entered into the system and reviewed by a `Person` (e.g, a user of a system implementing this model). The user asserts that the web page contains a `CreativeWork` with attendant credit and license information and an associated `MediaObject` (e.g, an image), which is derived from some other work (e.g., a photograph).

![WebPage.png](https://raw.githubusercontent.com/christopheradams/tentacles/master/uml/WebPage.png)

This data model should be sufficient for describing provenence information for creative works on the Web. The example can be extended to other media objects (like video or music recording) and more specific publishing contexts (like news article or blog posting).
