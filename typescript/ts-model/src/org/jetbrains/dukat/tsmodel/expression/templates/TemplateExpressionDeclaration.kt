package org.jetbrains.dukat.tsmodel.expression.templates

import org.jetbrains.dukat.tsmodel.expression.ExpressionDeclaration

data class TemplateExpressionDeclaration(
    val tokens: List<TemplateTokenDeclaration>
): ExpressionDeclaration
