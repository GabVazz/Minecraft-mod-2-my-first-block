package com.gab.myfirstblock.block;

import com.gab.myfirstblock.MyFirstBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block MINERALE_DI_RUBINO = registraBlocco("minerale_di_rubino",
            new Block(FabricBlockSettings.of(Material.STONE)
                    .strength(3.0f, 3.0f) // Imposta la resistenza alla rottura e l'esplosione
                    .breakByTool(FabricToolTags.PICKAXES, 2).requiresTool()
                    .sounds(BlockSoundGroup.STONE))); // Suono del blocco
    //blocco da piazzare nel mondo
    private static Block registraBlocco(String nome, Block blocco) {
        registraBloccoItem(nome, blocco);
        return Registry.register(Registry.BLOCK, new Identifier(MyFirstBlock.MOD_ID, nome), blocco);
    }

    //blocco da avere registrato tra gli items di gioco
    private static Item registraBloccoItem(String nome, Block blocco) {
        return Registry.register(Registry.ITEM, new Identifier(MyFirstBlock.MOD_ID, nome),
                new BlockItem(blocco, new FabricItemSettings().group(ItemGroup.MISC)));
    }
    public static  void registraBlocchiMod() {
        System.out.println("Sto registrando i blocchi per la seguente mod: " + MyFirstBlock.MOD_ID);
    }
}
