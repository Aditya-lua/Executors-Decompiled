package o1;

import android.util.Pair;
import androidx.camera.video.internal.compat.quirk.NegativeLatLongSavesIncorrectlyQuirk;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static Pair<Double, Double> a(double d10, double d11) {
        if (k1.c.b(NegativeLatLongSavesIncorrectlyQuirk.class) != null) {
            d10 = b(d10);
            d11 = b(d11);
        }
        return Pair.create(Double.valueOf(d10), Double.valueOf(d11));
    }

    public static double b(double d10) {
        return d10 >= 0.0d ? d10 : ((d10 * 10000.0d) - 1.0d) / 10000.0d;
    }
}
