package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class k {
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3110e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f3113h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f3114i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3107a = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3111f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3112g = 0;

    public boolean a(RecyclerView.b0 b0Var) {
        int i10 = this.f3108c;
        return i10 >= 0 && i10 < b0Var.b();
    }

    public View b(RecyclerView.x xVar) {
        View viewO = xVar.o(this.f3108c);
        this.f3108c += this.f3109d;
        return viewO;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.b + ", mCurrentPosition=" + this.f3108c + ", mItemDirection=" + this.f3109d + ", mLayoutDirection=" + this.f3110e + ", mStartLine=" + this.f3111f + ", mEndLine=" + this.f3112g + '}';
    }
}
