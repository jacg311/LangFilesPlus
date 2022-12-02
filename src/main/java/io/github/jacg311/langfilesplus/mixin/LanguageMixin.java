package io.github.jacg311.langfilesplus.mixin;

import com.google.gson.JsonObject;
import io.github.jacg311.langfilesplus.JsonFlattener;
import net.minecraft.util.Language;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(Language.class)
public class LanguageMixin {
    @ModifyVariable(method = "load", at = @At(value = "STORE", target = "Lcom/google/gson/Gson;fromJson(Ljava/io/Reader;Ljava/lang/Class;)Ljava/lang/Object;"))
    private static JsonObject langfiles_plus$transformObject(JsonObject object) {
        JsonObject resultObject = new JsonObject();
        JsonFlattener.flattenObject(resultObject, object, "");
        return resultObject;
    }
}
