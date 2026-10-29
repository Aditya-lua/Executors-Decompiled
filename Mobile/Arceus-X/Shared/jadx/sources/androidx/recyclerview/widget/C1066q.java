package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: renamed from: androidx.recyclerview.widget.q */
/* JADX INFO: loaded from: classes.dex */
public class C1066q {
    /* JADX INFO: renamed from: a */
    public static int m6038a(RecyclerView.C1015b0 c1015b0, AbstractC1063n abstractC1063n, View view, View view2, RecyclerView.AbstractC1034q abstractC1034q, boolean z10) {
        if (abstractC1034q.m5574O() == 0 || c1015b0.m5392b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return Math.abs(abstractC1034q.m5613l0(view) - abstractC1034q.m5613l0(view2)) + 1;
        }
        return Math.min(abstractC1063n.mo6017n(), abstractC1063n.mo6007d(view2) - abstractC1063n.mo6010g(view));
    }

    /* JADX INFO: renamed from: b */
    public static int m6039b(RecyclerView.C1015b0 c1015b0, AbstractC1063n abstractC1063n, View view, View view2, RecyclerView.AbstractC1034q abstractC1034q, boolean z10, boolean z11) {
        if (abstractC1034q.m5574O() == 0 || c1015b0.m5392b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z11 ? Math.max(0, (c1015b0.m5392b() - Math.max(abstractC1034q.m5613l0(view), abstractC1034q.m5613l0(view2))) - 1) : Math.max(0, Math.min(abstractC1034q.m5613l0(view), abstractC1034q.m5613l0(view2)));
        if (z10) {
            return Math.round((iMax * (Math.abs(abstractC1063n.mo6007d(view2) - abstractC1063n.mo6010g(view)) / (Math.abs(abstractC1034q.m5613l0(view) - abstractC1034q.m5613l0(view2)) + 1))) + (abstractC1063n.mo6016m() - abstractC1063n.mo6010g(view)));
        }
        return iMax;
    }

    /* JADX INFO: renamed from: c */
    public static int m6040c(RecyclerView.C1015b0 c1015b0, AbstractC1063n abstractC1063n, View view, View view2, RecyclerView.AbstractC1034q abstractC1034q, boolean z10) {
        if (abstractC1034q.m5574O() == 0 || c1015b0.m5392b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return c1015b0.m5392b();
        }
        return (int) (((abstractC1063n.mo6007d(view2) - abstractC1063n.mo6010g(view)) / (Math.abs(abstractC1034q.m5613l0(view) - abstractC1034q.m5613l0(view2)) + 1)) * c1015b0.m5392b());
    }
}
