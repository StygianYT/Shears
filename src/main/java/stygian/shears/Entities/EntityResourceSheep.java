package stygian.shears.Entities;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

public class EntityResourceSheep extends EntityAnimal implements net.minecraftforge.common.IShearable {
	public EntityResourceSheep(EntityType<?> type, World world, Item resource) {
		super(type, world);
		this.resource = resource;
		this.type = type;
	}
	
	public EntityResourceSheep(EntityType<?> type, World world) {
		super(type, world);
		this.type = type;
	}
	
	@Nullable
	public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData entityLivingData, @Nullable NBTTagCompound itemNbt) {
        entityLivingData = super.onInitialSpawn(difficulty, entityLivingData, itemNbt);
        if(this.resource == null) {}
        return entityLivingData;
    }

	private Item resource;
	private EntityType<?> type;
	//private double timer = 0.0;
	
	public boolean sheared = false;
	
	public EntityResourceSheep createChild(EntityAgeable ageable) {
		double Rando = Math.random();
		Item childResource;
		EntityResourceSheep entitysheep = (EntityResourceSheep)ageable;
		
		if(Rando > 0.5) {
			childResource = entitysheep.resource;
		} else {
			childResource = this.resource;
		}
	    
	    EntityResourceSheep entitysheep1 = new EntityResourceSheep(this.type, this.world, childResource);
	    return entitysheep1;
	}
	
	public void eatGrassBonus() {
		this.sheared = false;
		if (this.isChild()) this.addGrowth(60);
	}
	
	public boolean isShearable(ItemStack item, net.minecraft.world.IWorldReader world, BlockPos pos) {
	      return !this.sheared && !this.isChild();
	   }

	@Override
	public List<ItemStack> onSheared(ItemStack item, IWorld world, BlockPos pos, int fortune) {
		java.util.List<ItemStack> ret = new java.util.ArrayList<>();
	      if (!this.world.isRemote) {
	         this.sheared = true;
	         int i = 1 + this.rand.nextInt(3);

	         for(int j = 0; j < i; ++j) {
	            ret.add(new ItemStack(resource, i));
	         }
	      }
	      return ret;
	}
}