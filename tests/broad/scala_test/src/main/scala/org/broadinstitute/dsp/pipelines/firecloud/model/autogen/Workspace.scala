/**
  * FireCloud
  * Genome analysis execution service.
  *
  * OpenAPI spec version: 0.1
  *
  *
  * NOTE: This class is auto generated by the swagger code generator program.
  * https://github.com/swagger-api/swagger-codegen.git
  * Do not edit the class manually.
  */
package org.broadinstitute.dsp.pipelines.firecloud.model.autogen

import java.time.OffsetDateTime
import java.util.UUID

import io.circe.Json

case class Workspace(
    /* The namespace the workspace belongs to */
    namespace: String,
    /* The name of the workspace */
    name: String,
    /* The list of groups to form the Authorization Domain (empty if no Authorization Domain is set) */
    authorizationDomain: Seq[ManagedGroupRef],
    /* A UUID associated with the workspace */
    workspaceId: UUID,
    /* The name of the bucket associated with the workspace */
    bucketName: String,
    /* The date the workspace was created in yyyy-MM-ddTHH:mm:ss.SSSZZ format */
    createdDate: OffsetDateTime,
    /* The date the workspace was last modified in yyyy-MM-ddTHH:mm:ss.SSSZZ format */
    lastModified: OffsetDateTime,
    /* The user who created the workspace */
    createdBy: String,
    /* Map[String, Attribute] */
    attributes: Map[String, Json],
    /* Can the Workspace currently be modified? */
    isLocked: Boolean
)