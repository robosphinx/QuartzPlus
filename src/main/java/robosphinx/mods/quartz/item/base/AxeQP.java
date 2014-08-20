package robosphinx.mods.quartz.item.base;

/**
 * @author robosphinx
 */

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;

public class AxeQP extends ItemAxe {
    
    public AxeQP (ToolMaterial material) {
        super(material);
        setMaxStackSize(1);
        setCreativeTab(CreativeTabs.tabTools);
    }
    
}
