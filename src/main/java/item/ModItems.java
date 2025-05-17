package item;

import net.josh.marcosvallemod.MarcosValleMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MarcosValleMod.MOD_ID);

    public static final DeferredItem<Item> SAMBA = ITEMS.register("samba",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> VELHOS = ITEMS.register("velhos",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
