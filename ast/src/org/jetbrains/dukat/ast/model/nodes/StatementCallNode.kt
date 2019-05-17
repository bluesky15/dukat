package org.jetbrains.dukat.ast.model.nodes

import org.jetbrains.dukat.astCommon.NameEntity

data class StatementCallNode(
        val value: NameEntity,
        val params: List<IdentifierNode>
) : StatementNode
