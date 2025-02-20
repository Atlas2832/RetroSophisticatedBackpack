package com.cleanroommc.retrosophisticatedbackpacks.client.gui.widget

import com.cleanroommc.modularui.api.drawable.IKey
import com.cleanroommc.modularui.widgets.TextWidget
import com.cleanroommc.retrosophisticatedbackpacks.capability.upgrade.PickupUpgradeWrapper
import com.cleanroommc.retrosophisticatedbackpacks.client.gui.RSBTextures
import com.cleanroommc.retrosophisticatedbackpacks.util.Utils.asTranslationKey

class PickupUpgradeWidget(
    slotIndex: Int,
    private val wrapper: PickupUpgradeWrapper
) : ExpandedTabWidget(3) {
    companion object {
        val FILTER_TYPE_VARIANTS = listOf(
            CyclicVariantButtonWidget.Variant(IKey.lang("gui.whitelist".asTranslationKey()), RSBTextures.CHECK_ICON),
            CyclicVariantButtonWidget.Variant(IKey.lang("gui.blacklist".asTranslationKey()), RSBTextures.CROSS_ICON),
        )
    }

    val filterWidget: BasicFilterWidget

    init {
        size(70, 120)

        filterWidget = BasicFilterWidget(wrapper, slotIndex)
            .leftRel(0.5f)
            .top(36)

        child(filterWidget)
            .child(
                TextWidget(IKey.lang("gui.pickup_settings".asTranslationKey()))
                    .size(40, 20)
                    .leftRel(0.85f)
                    .topRelAnchor(0.125f, 0.5f)
            )
    }

    override fun onInit() {
        context.jeiSettings.addJeiExclusionArea(this)
    }
}