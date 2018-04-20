package edu.tamu.iiif.constants;

public class Constants {

    public final static String FEDORA_IDENTIFIER = "fedora";
    public final static String DSPACE_IDENTIFIER = "dspace";

    // General
    public final static String COLLECECTION_IDENTIFIER = "collection";
    public final static String PRESENTATION_IDENTIFIER = "presentation";
    public final static String SEQUENCE_IDENTIFIER = "sequence";
    public final static String CANVAS_IDENTIFIER = "canvas";
    public final static String IMAGE_IDENTIFIER = "image";

    // Fedora
    public final static String FEDORA_FCR_METADATA = "/fcr:metadata";
    public final static String FEDORA_X_TURTLE_ACCEPT_TYPE = "application/x-turtle";

    public final static String FEDORA_HAS_PARENT_PREDICATE = "http://fedora.info/definitions/v4/repository#hasParent";

    // DSpace
    public final static String DSPACE_PREFIX = "http://digital-repositories.org/ontologies/dspace/0.1.0#";

    public final static String DSPACE_HAS_BITSTREAM_PREDICATE = DSPACE_PREFIX + "hasBitstream";
    public final static String DSPACE_HAS_ITEM_PREDICATE = DSPACE_PREFIX + "hasItem";
    public final static String DSPACE_HAS_COLLECTION_PREDICATE = DSPACE_PREFIX + "hasCollection";
    public final static String DSPACE_HAS_SUB_COMMUNITY_PREDICATE = DSPACE_PREFIX + "hasSubcommunity";
    public final static String DSPACE_IS_PART_OF_COLLECTION_PREDICATE = DSPACE_PREFIX + "isPartOfCollection";
    public final static String DSPACE_IS_PART_OF_COMMUNITY_PREDICATE = DSPACE_PREFIX + "isPartOfCommunity";
    public final static String DSPACE_IS_SUB_COMMUNITY_OF_PREDICATE = DSPACE_PREFIX + "isSubcommunityOf";
    public final static String DSPACE_IS_PART_OF_REPOSITORY_PREDICATE = DSPACE_PREFIX + "isPartOfRepository";

    // IIIF
    public final static String IIIF_IMAGE_API_PREFIX = "http://iiif.io/api/image/2/";

    public final static String IIIF_IMAGE_API_CONTEXT = IIIF_IMAGE_API_PREFIX + "context.json";
    public final static String IIIF_IMAGE_API_LEVEL_ZERO_PROFILE = IIIF_IMAGE_API_PREFIX + "level0.json";
    public final static String IIIF_IMAGE_API_LEVEL_ONE_PROFILE = IIIF_IMAGE_API_PREFIX + "level1.json";
    public final static String IIIF_IMAGE_API_LEVEL_TWO_PROFILE = IIIF_IMAGE_API_PREFIX + "level2.json";

    // Dublin Core
    public final static String DUBLIN_CORE_PREFIX = "http://purl.org/dc/elements/1.1/";

    public final static String DUBLIN_CORE_TITLE_PREDICATE = DUBLIN_CORE_PREFIX + "title";
    public final static String DUBLIN_CORE_DESCRIPTION_PREDICATE = DUBLIN_CORE_PREFIX + "description";

    // Dublin Core Terms
    public final static String DUBLIN_CORE_TERMS_PREFIX = "http://purl.org/dc/terms/";

    public final static String DUBLIN_CORE_TERMS_HAS_PART = DUBLIN_CORE_TERMS_PREFIX + "hasPart";
    public final static String DUBLIN_CORE_TERMS_IS_PART_OF = DUBLIN_CORE_TERMS_PREFIX + "isPartOf";

    // W3
    public final static String W3_PREFIX = "http://www.w3.org/1999/02/22-rdf-syntax-ns#";

    public final static String W3_TYPE_PREDICATE = W3_PREFIX + "type";

    // LDP
    public final static String LDP_PREFIX = "http://www.w3.org/ns/ldp#";

    public final static String LDP_CONTAINS_PREDICATE = LDP_PREFIX + "contains";
    public final static String LDP_HAS_MEMBER_RELATION_PREDICATE = LDP_PREFIX + "hasMemberRelation";
    public final static String LDP_IS_MEMBER_OD_RELATION_PREDICATE = LDP_PREFIX + "isMemberOfRelation";

    // PCDM
    public final static String PCDM_PREFIX = "http://pcdm.org/models#";

    public final static String PCDM_HAS_FILE_PREDICATE = PCDM_PREFIX + "hasFile";
    public final static String PCDM_HAS_MEMBER_PREDICATE = PCDM_PREFIX + "hasMember";

    // IANA
    public final static String IANA_PREFIX = "http://www.iana.org/assignments/relation/";

    public final static String IANA_FIRST_PREDICATE = IANA_PREFIX + "first";
    public final static String IANA_LAST_PREDICATE = IANA_PREFIX + "last";
    public final static String IANA_NEXT_PREDICATE = IANA_PREFIX + "next";
    public final static String IANA_PREVIOUS_PREDICATE = IANA_PREFIX + "previous";

    // ORE
    public final static String ORE_PREFIX = "http://www.openarchives.org/ore/terms#";

    public final static String ORE_PROXY_FOR_PREDICATE = ORE_PREFIX + "proxyFor";

    // EBUCORE
    public final static String EBUCORE_PREFIX = "http://www.ebu.ch/metadata/ontologies/ebucore/ebucore#";

    public final static String EBUCORE_HAS_MIME_TYPE_PREDICATE = EBUCORE_PREFIX + "hasMimeType";
    public final static String EBUCORE_HEIGHT_PREDICATE = EBUCORE_PREFIX + "height";
    public final static String EBUCORE_WIDTH_PREDICATE = EBUCORE_PREFIX + "width";

    // BIBO
    public final static String BIBO_PREFIX = "http://purl.org/ontology/bibo/";

    public final static String BIBO_COLLECTION_PREDICATE = BIBO_PREFIX + "Collection";

}