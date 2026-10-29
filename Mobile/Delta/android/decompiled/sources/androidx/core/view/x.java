package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1925a;
    public int b;

    public x(ViewGroup viewGroup) {
    }

    public int a() {
        return this.f1925a | this.b;
    }

    public void b(View view, View view2, int i10) {
        c(view, view2, i10, 0);
    }

    public void c(View view, View view2, int i10, int i11) {
        if (i11 == 1) {
            this.b = i10;
        } else {
            this.f1925a = i10;
        }
    }

    public void d(View view) {
        e(view, 0);
    }

    public void e(View view, int i10) {
        if (i10 == 1) {
            this.b = 0;
        } else {
            this.f1925a = 0;
        }
    }
}
