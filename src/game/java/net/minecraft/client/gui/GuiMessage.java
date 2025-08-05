package net.minecraft.client.gui;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;

public class GuiMessage extends GuiScreen {
    private GuiScreen field_146441_g;

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        this.drawDefaultBackground();
        this.drawCenteredString(this.fontRendererObj, "UEC Chat Unavailable!", this.width / 2, this.height / 4, -1);
        this.drawCenteredString(this.fontRendererObj, "Currently UEC Chat is Unavailable on 1.0!", this.width / 2, this.height / 3, -1);
        this.drawCenteredString(this.fontRendererObj, "This Feature will be added in the future!", this.width / 2, this.height / 2, -1);
        super.drawScreen(mouseX, mouseY, partialTicks);
        GuiButton parGuiButton;
        this.buttonList.add(new GuiButton(1, this.width / 2 - 100, this.height - 80, 200, 20,
                I18n.format("gui.back", new Object[0])));

    }
}
