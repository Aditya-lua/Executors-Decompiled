package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: androidx.core.view.x */
/* JADX INFO: loaded from: classes.dex */
public class C0642x {

    /* JADX INFO: renamed from: a */
    public int f2495a;

    /* JADX INFO: renamed from: b */
    public int f2496b;

    public C0642x(ViewGroup viewGroup) {
    }

    /* JADX INFO: renamed from: a */
    public int m3219a() {
        return this.f2495a | this.f2496b;
    }

    /* JADX INFO: renamed from: b */
    public void m3220b(View view, View view2, int i10) {
        m3221c(view, view2, i10, 0);
    }

    /* JADX INFO: renamed from: c */
    public void m3221c(View view, View view2, int i10, int i11) {
        if (i11 == 1) {
            this.f2496b = i10;
        } else {
            this.f2495a = i10;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m3222d(View view) {
        m3223e(view, 0);
    }

    /* JADX INFO: renamed from: e */
    public void m3223e(View view, int i10) {
        if (i10 == 1) {
            this.f2496b = 0;
        } else {
            this.f2495a = 0;
        }
    }
}
