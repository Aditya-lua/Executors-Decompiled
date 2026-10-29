package p481v1;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: v1.e */
/* JADX INFO: loaded from: classes.dex */
public class C11997e extends Drawable {

    /* JADX INFO: renamed from: a */
    public static final double f42479a = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: a */
    public static float m44773a(float f10, float f11, boolean z10) {
        return z10 ? (float) (((double) f10) + ((1.0d - f42479a) * ((double) f11))) : f10;
    }

    /* JADX INFO: renamed from: b */
    public static float m44774b(float f10, float f11, boolean z10) {
        return z10 ? (float) (((double) (f10 * 1.5f)) + ((1.0d - f42479a) * ((double) f11))) : f10 * 1.5f;
    }
}
