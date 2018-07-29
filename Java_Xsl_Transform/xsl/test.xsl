<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output  indent="yes" omit-xml-declaration="yes"/>
<xsl:template match="@*|node()">
  <xsl:copy>
    <xsl:apply-templates select="node()|@*"/>
  </xsl:copy>
</xsl:template>
<xsl:template match="@name">
        <xsl:attribute name="name"><xsl:value-of select="."/></xsl:attribute>
</xsl:template>
<xsl:template match="@*">
        <xsl:copy/>
</xsl:template>
<!-- <xsl:template match="personne[@name]"> -->
<!--         <personne>element avec attribut name 1</personne> -->
<!-- </xsl:template> -->

</xsl:stylesheet>