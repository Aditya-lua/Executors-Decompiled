package il;

import android.graphics.Color;
import com.roblox.protocols.designfoundationsplatforminterface.generated.ColorTokenVariants;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/roblox/protocols/designfoundationsplatforminterface/generated/ColorTokenVariants;", "Lil/a;", "b", "(Lcom/roblox/protocols/designfoundationsplatforminterface/generated/ColorTokenVariants;)Lil/a;", "universalapp_googleProdRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class e {
    public static final AndroidColorToken b(ColorTokenVariants colorTokenVariants) {
        return new AndroidColorToken(Color.valueOf((float) colorTokenVariants.getLight().getR(), (float) colorTokenVariants.getLight().getG(), (float) colorTokenVariants.getLight().getB(), (float) colorTokenVariants.getLight().getA()).toArgb(), Color.valueOf((float) colorTokenVariants.getDark().getR(), (float) colorTokenVariants.getDark().getG(), (float) colorTokenVariants.getDark().getB(), (float) colorTokenVariants.getDark().getA()).toArgb());
    }
}
