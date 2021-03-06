package quaternary.incorporeal.api;

import vazkii.botania.api.corporea.ICorporeaSpark;
import vazkii.botania.api.corporea.IWrappedInventory;
import vazkii.botania.api.corporea.InvWithLocation;

/** For tile entities that can return a custom IWrappedInventory object. 
 * Called through ASM hackery in InternalMethodHandler#wrapInventory. 
 * All I want for Christmas is an InventoryWrapEvent~ */
public interface ICustomWrappedInventory {
	IWrappedInventory wrap(InvWithLocation inv, ICorporeaSpark spork);
}
