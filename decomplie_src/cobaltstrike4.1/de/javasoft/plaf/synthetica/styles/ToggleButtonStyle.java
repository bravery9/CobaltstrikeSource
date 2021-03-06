package de.javasoft.plaf.synthetica.styles;

import de.javasoft.plaf.synthetica.SyntheticaLookAndFeel;
import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.synth.ColorType;
import javax.swing.plaf.synth.Region;
import javax.swing.plaf.synth.SynthContext;
import javax.swing.plaf.synth.SynthStyle;

public class ToggleButtonStyle extends StyleWrapper {
   private static ToggleButtonStyle instance = new ToggleButtonStyle();

   private ToggleButtonStyle() {
   }

   public static SynthStyle getStyle(SynthStyle var0, JComponent var1, Region var2) {
      if (SyntheticaLookAndFeel.getStyleName(var1) == null) {
         instance.setStyle(var0);
         return instance;
      } else {
         ToggleButtonStyle var3 = new ToggleButtonStyle();
         var3.setStyle(var0);
         return var3;
      }
   }

   public Color getColor(SynthContext var1, ColorType var2) {
      JComponent var3 = var1.getComponent();
      return var2 == ColorType.TEXT_FOREGROUND && !(var3.getForeground() instanceof ColorUIResource) ? var3.getForeground() : super.getColor(var1, var2);
   }
}
