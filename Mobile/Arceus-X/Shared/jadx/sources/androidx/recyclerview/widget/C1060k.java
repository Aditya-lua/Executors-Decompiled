package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: renamed from: androidx.recyclerview.widget.k */
/* JADX INFO: loaded from: classes.dex */
public class C1060k {

    /* JADX INFO: renamed from: b */
    public int f4296b;

    /* JADX INFO: renamed from: c */
    public int f4297c;

    /* JADX INFO: renamed from: d */
    public int f4298d;

    /* JADX INFO: renamed from: e */
    public int f4299e;

    /* JADX INFO: renamed from: h */
    public boolean f4302h;

    /* JADX INFO: renamed from: i */
    public boolean f4303i;

    /* JADX INFO: renamed from: a */
    public boolean f4295a = true;

    /* JADX INFO: renamed from: f */
    public int f4300f = 0;

    /* JADX INFO: renamed from: g */
    public int f4301g = 0;

    /* JADX INFO: renamed from: a */
    public boolean m5985a(RecyclerView.C1015b0 c1015b0) {
        int i10 = this.f4297c;
        return i10 >= 0 && i10 < c1015b0.m5392b();
    }

    /* JADX INFO: renamed from: b */
    public View m5986b(RecyclerView.C1041x c1041x) {
        View viewM5707o = c1041x.m5707o(this.f4297c);
        this.f4297c += this.f4298d;
        return viewM5707o;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f4296b + ", mCurrentPosition=" + this.f4297c + ", mItemDirection=" + this.f4298d + ", mLayoutDirection=" + this.f4299e + ", mStartLine=" + this.f4300f + ", mEndLine=" + this.f4301g + '}';
    }
}
