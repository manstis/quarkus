package io.quarkus.datasource.deployment.spi;

import io.quarkus.builder.item.MultiBuildItem;
import io.quarkus.deployment.annotations.BuildStep;

/**
 * Marker used by {@link BuildStep}'s that launch TestContainers' containers to ensure that they join TestContainers shared
 * network.
 */
public final class DevServicesUseTestContainersSharedNetworkBuildItem extends MultiBuildItem {

}
