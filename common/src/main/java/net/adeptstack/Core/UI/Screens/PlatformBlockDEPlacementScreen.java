package net.adeptstack.Core.UI.Screens;

import net.minecraft.world.level.block.state.properties.IntegerProperty;

import java.util.function.Consumer;
import java.util.function.Function;

public class PlatformBlockDEPlacementScreen extends PlatformBlockScreenBase {
    public <T extends IntegerProperty> PlatformBlockDEPlacementScreen(int variant, T property, Function<Integer, TextureResult> textureGetter, Consumer<Integer> onDone, String id) {
        super(variant, property, textureGetter, onDone, id);
    }
}
