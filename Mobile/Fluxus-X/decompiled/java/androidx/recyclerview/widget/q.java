package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class q {
    public static int a(RecyclerView.c0 c0Var, n nVar, View view, View view2, RecyclerView.q qVar, boolean z10) {
        if (qVar.O() == 0 || c0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return Math.abs(qVar.l0(view) - qVar.l0(view2)) + 1;
        }
        return Math.min(nVar.n(), nVar.d(view2) - nVar.g(view));
    }

    public static int b(RecyclerView.c0 c0Var, n nVar, View view, View view2, RecyclerView.q qVar, boolean z10, boolean z11) {
        if (qVar.O() == 0 || c0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z11 ? Math.max(0, (c0Var.b() - Math.max(qVar.l0(view), qVar.l0(view2))) - 1) : Math.max(0, Math.min(qVar.l0(view), qVar.l0(view2)));
        if (z10) {
            return Math.round((iMax * (Math.abs(nVar.d(view2) - nVar.g(view)) / (Math.abs(qVar.l0(view) - qVar.l0(view2)) + 1))) + (nVar.m() - nVar.g(view)));
        }
        return iMax;
    }

    public static int c(RecyclerView.c0 c0Var, n nVar, View view, View view2, RecyclerView.q qVar, boolean z10) {
        if (qVar.O() == 0 || c0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return c0Var.b();
        }
        return (int) (((nVar.d(view2) - nVar.g(view)) / (Math.abs(qVar.l0(view) - qVar.l0(view2)) + 1)) * c0Var.b());
    }
}
