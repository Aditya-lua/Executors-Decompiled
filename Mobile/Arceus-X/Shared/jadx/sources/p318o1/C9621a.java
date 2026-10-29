package p318o1;

import android.util.Pair;
import androidx.camera.video.internal.compat.quirk.NegativeLatLongSavesIncorrectlyQuirk;
import p234k1.C7407c;

/* JADX INFO: renamed from: o1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C9621a {
    /* JADX INFO: renamed from: a */
    public static Pair<Double, Double> m37966a(double d10, double d11) {
        if (C7407c.m30691b(NegativeLatLongSavesIncorrectlyQuirk.class) != null) {
            d10 = m37967b(d10);
            d11 = m37967b(d11);
        }
        return Pair.create(Double.valueOf(d10), Double.valueOf(d11));
    }

    /* JADX INFO: renamed from: b */
    public static double m37967b(double d10) {
        return d10 >= 0.0d ? d10 : ((d10 * 10000.0d) - 1.0d) / 10000.0d;
    }
}
