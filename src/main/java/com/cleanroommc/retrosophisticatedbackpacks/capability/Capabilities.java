package com.cleanroommc.retrosophisticatedbackpacks.capability;

import com.cleanroommc.retrosophisticatedbackpacks.capability.upgrade.*;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("DataFlowIssue")
public final class Capabilities {
    // Implementation-specific capabilities
    @CapabilityInject(BackpackWrapper.class)
    public static final @NotNull Capability<BackpackWrapper> BACKPACK_CAPABILITY = null;

    @CapabilityInject(UpgradeWrapper.class)
    public static final @NotNull Capability<CraftingUpgradeWrapper> CRAFTING_ITEM_HANDLER_CAPABILITY = null;

    @CapabilityInject(PickupUpgradeWrapper.class)
    public static final @NotNull Capability<PickupUpgradeWrapper> PICKUP_UPGRADE_CAPABILITY = null;

    @CapabilityInject(AdvancedPickupUpgradeWrapper.class)
    public static final @NotNull Capability<AdvancedPickupUpgradeWrapper> ADVANCED_PICKUP_UPGRADE_CAPABILITY = null;

    @CapabilityInject(PickupUpgradeWrapper.class)
    public static final @NotNull Capability<FeedingUpgradeWrapper> FEEDING_UPGRADE_CAPABILITY = null;

    @CapabilityInject(AdvancedPickupUpgradeWrapper.class)
    public static final @NotNull Capability<AdvancedFeedingUpgradeWrapper> ADVANCED_FEEDING_UPGRADE_CAPABILITY = null;

    @CapabilityInject(DepositUpgradeWrapper.class)
    public static final @NotNull Capability<DepositUpgradeWrapper> DEPOSIT_UPGRADE_CAPABILITY = null;

    @CapabilityInject(AdvancedDepositUpgradeWrapper.class)
    public static final @NotNull Capability<AdvancedDepositUpgradeWrapper> ADVANCED_DEPOSIT_UPGRADE_CAPABILITY = null;

    // Abstract capabilities
    @CapabilityInject(IToggleable.class)
    public static final @NotNull Capability<IToggleable> TOGGLEABLE_CAPABILITY = null;

    @CapabilityInject(IBasicFilterable.class)
    public static final @NotNull Capability<IBasicFilterable> BASIC_FILTERABLE_CAPABILITY = null;

    @CapabilityInject(IAdvancedFilterable.class)
    public static final @NotNull Capability<IAdvancedFilterable> ADVANCED_FILTERABLE_CAPABILITY = null;

    @CapabilityInject(IBasicFilterable.class)
    public static final @NotNull Capability<IPickupUpgrade> IPICKUP_UPGRADE_CAPABILITY = null;

    @CapabilityInject(IFeedingUpgrade.class)
    public static final @NotNull Capability<IFeedingUpgrade> IFEEDING_UPGRADE_CAPABILITY = null;

    @CapabilityInject(IFeedingUpgrade.class)
    public static final @NotNull Capability<IDepositUpgrade> IDEPOSIT_UPGRADE_CAPABILITY = null;
}
