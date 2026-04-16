package com.devmaster.allthekaiju.client.render;

import com.devmaster.allthekaiju.AllTheKaiju;
import com.devmaster.allthekaiju.entity.NotBreeBree;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.layers.BipedArmorLayer;
import net.minecraft.util.ResourceLocation;

public class NotBreeBreeRender extends BipedRenderer<NotBreeBree, {

        protected static final ResourceLocation TEXTURE = new ResourceLocation(AllTheKaiju.MOD_ID, "textures/entity/notbreebree.png");

        public NotBreeBreeRender(EntityRendererManager renderManager) {
                super(renderManager, new NotBreeBreeModel<>(0.0F, false), 0.5F);
                this.addLayer(new BipedArmorLayer<>(this, new NotBreeBreeModel<>(0.5F, true), new NotBreeBreeModel<>(1.0F, true)));
        }

        @Override
        public ResourceLocation getEntityTexture(NotBreeBree entity) {
                return TEXTURE;
        }
}