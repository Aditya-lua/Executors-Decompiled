package p063d0;

import android.graphics.PointF;
import androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk;
import p140g0.C5943u1;
import p296n0.C8782k3;

/* JADX INFO: renamed from: d0.l */
/* JADX INFO: loaded from: classes.dex */
public class C4381l {

    /* JADX INFO: renamed from: a */
    public final C8782k3 f18234a;

    public C4381l(C8782k3 c8782k3) {
        this.f18234a = c8782k3;
    }

    /* JADX INFO: renamed from: a */
    public PointF m22042a(C5943u1 c5943u1, int i10) {
        return (i10 == 1 && this.f18234a.m35233a(AfRegionFlipHorizontallyQuirk.class)) ? new PointF(1.0f - c5943u1.m26624c(), c5943u1.m26625d()) : new PointF(c5943u1.m26624c(), c5943u1.m26625d());
    }
}
