package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class k {
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3265e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f3268h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f3269i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3262a = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3266f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3267g = 0;

    public boolean a(RecyclerView.b0 b0Var) {
        int i10 = this.f3263c;
        return i10 >= 0 && i10 < b0Var.b();
    }

    public View b(RecyclerView.x xVar) {
        View viewO = xVar.o(this.f3263c);
        this.f3263c += this.f3264d;
        return viewO;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.b + ", mCurrentPosition=" + this.f3263c + ", mItemDirection=" + this.f3264d + ", mLayoutDirection=" + this.f3265e + ", mStartLine=" + this.f3266f + ", mEndLine=" + this.f3267g + '}';
    }
}
