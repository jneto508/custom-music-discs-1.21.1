package item;

import net.josh.marcosvallemod.MarcosValleMod;
import net.minecraft.ResourceLocationException;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import sound.ModSounds;

import static net.josh.marcosvallemod.MarcosValleMod.MOD_ID;
import static net.minecraft.world.entity.Entity.MovementEmission.SOUNDS;
import static sound.ModSounds.SAMBA_SOUND;
import static sound.ModSounds.VELHOS_SOUND;


public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MOD_ID);

    public static final DeferredItem<Item> SAMBA_MUSIC_DISC = ITEMS.register("samba",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.SAMBA_KEY).stacksTo(1).rarity(Rarity.EPIC)));

    public static final DeferredItem<Item> VELHOS_MUSIC_DISC = ITEMS.register("velhos",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.VELHOS_KEY).stacksTo(1).rarity(Rarity.EPIC)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
