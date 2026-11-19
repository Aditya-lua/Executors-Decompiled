package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class k {
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2812e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2815h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f2816i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2809a = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2813f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2814g = 0;

    public boolean a(RecyclerView.c0 c0Var) {
        int i10 = this.f2810c;
        return i10 >= 0 && i10 < c0Var.b();
    }

    public View b(RecyclerView.x xVar) {
        View viewO = xVar.o(this.f2810c);
        this.f2810c += this.f2811d;
        return viewO;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.b + ", mCurrentPosition=" + this.f2810c + ", mItemDirection=" + this.f2811d + ", mLayoutDirection=" + this.f2812e + ", mStartLine=" + this.f2813f + ", mEndLine=" + this.f2814g + '}';
    }
}
