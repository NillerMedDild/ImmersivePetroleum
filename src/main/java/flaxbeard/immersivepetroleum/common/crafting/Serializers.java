package flaxbeard.immersivepetroleum.common.crafting;

import blusunrize.immersiveengineering.api.crafting.IERecipeSerializer;
import flaxbeard.immersivepetroleum.ImmersivePetroleum;
import flaxbeard.immersivepetroleum.api.crafting.DistillationRecipe;
import flaxbeard.immersivepetroleum.api.crafting.PumpjackHandler.ReservoirType;
import flaxbeard.immersivepetroleum.common.crafting.serializers.DistillationRecipeSerializer;
import flaxbeard.immersivepetroleum.common.crafting.serializers.ReservoirTypeSerializer;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.SpecialRecipeSerializer;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Serializers{
	public static final DeferredRegister<IRecipeSerializer<?>> RECIPE_SERIALIZERS = new DeferredRegister<>(ForgeRegistries.RECIPE_SERIALIZERS, ImmersivePetroleum.MODID);
	
	public static final RegistryObject<IERecipeSerializer<DistillationRecipe>> DISTILLATION_SERIALIZER = RECIPE_SERIALIZERS.register(
			"distillation", DistillationRecipeSerializer::new
	);
	
	public static final RegistryObject<IERecipeSerializer<ReservoirType>> RESERVOIR_SERIALIZER = RECIPE_SERIALIZERS.register(
			"reservoirs", ReservoirTypeSerializer::new
	);
	
	public static final RegistryObject<SpecialRecipeSerializer<ProjectorCraftingHandler>> PROJECTOR_SERIALIZER = RECIPE_SERIALIZERS.register(
			"projector_crafting", () -> new SpecialRecipeSerializer<>(ProjectorCraftingHandler::new)
	);
}
