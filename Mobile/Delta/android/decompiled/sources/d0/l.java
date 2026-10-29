package d0;

import android.graphics.PointF;
import androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk;
import g0.u1;
import n0.k3;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k3 f14255a;

    public l(k3 k3Var) {
        this.f14255a = k3Var;
    }

    public PointF a(u1 u1Var, int i10) {
        return (i10 == 1 && this.f14255a.a(AfRegionFlipHorizontallyQuirk.class)) ? new PointF(1.0f - u1Var.c(), u1Var.d()) : new PointF(u1Var.c(), u1Var.d());
    }
}
