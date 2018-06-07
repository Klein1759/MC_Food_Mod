package gga.food_mod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemShears;
import net.minecraft.item.ItemStack;

@Mod(modid = "fo", name = "Food Mod", version = "1.0")

public class FoodMod {
	
	public static Item itemFrenchFries;
	public static Item itemChickenNuggets;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		// Item/Block init and registering
		// Config handling
		itemFrenchFries = new ItemFood(2, 0.5F, true).setUnlocalizedName("ItemFrenchFries").setTextureName("fo:itemfrenchfries");
		itemChickenNuggets = new ItemFood(3, 0.8F, true).setUnlocalizedName("ItemChickenNuggets").setTextureName("fo:itemchickennuggets");
		GameRegistry.registerItem(itemFrenchFries, itemFrenchFries.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemChickenNuggets, itemChickenNuggets.getUnlocalizedName().substring(5));
		GameRegistry.addShapelessRecipe(new ItemStack(itemFrenchFries, 2), new Object[]{new ItemStack(Items.baked_potato), Items.shears});	
		GameRegistry.addShapelessRecipe(new ItemStack(itemChickenNuggets, 8), new Object[]{new ItemStack(Items.cooked_chicken), Items.shears});	
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		// Proxy, TileEntity, entity, GUI and Pacaket Registering
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}

}
