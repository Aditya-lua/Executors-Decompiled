package p063d0;

import androidx.camera.camera2.internal.compat.quirk.AutoFlashUnderExposedQuirk;
import p296n0.C8782k3;

/* JADX INFO: renamed from: d0.n */
/* JADX INFO: loaded from: classes.dex */
public class C4383n {

    /* JADX INFO: renamed from: a */
    public final boolean f18238a;

    /* JADX INFO: renamed from: b */
    public boolean f18239b = false;

    public C4383n(C8782k3 c8782k3) {
        this.f18238a = c8782k3.m35234b(AutoFlashUnderExposedQuirk.class) != null;
    }

    /* JADX INFO: renamed from: a */
    public void m22046a() {
        this.f18239b = false;
    }

    /* JADX INFO: renamed from: b */
    public void m22047b() {
        this.f18239b = true;
    }

    /* JADX INFO: renamed from: c */
    public boolean m22048c(int i10) {
        return this.f18239b && i10 == 0 && this.f18238a;
    }
}
