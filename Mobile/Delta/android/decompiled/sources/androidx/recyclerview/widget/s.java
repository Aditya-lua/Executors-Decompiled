package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class s extends RecyclerView.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RecyclerView f3289a;
    public Scroller b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RecyclerView.v f3290c = new a();

    public class a extends RecyclerView.v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f3291a = false;

        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.v
        public void a(RecyclerView recyclerView, int i10) {
            super.a(recyclerView, i10);
            if (i10 == 0 && this.f3291a) {
                this.f3291a = false;
                s.this.j();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.v
        public void b(RecyclerView recyclerView, int i10, int i11) {
            if (i10 == 0 && i11 == 0) {
                return;
            }
            this.f3291a = true;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public boolean a(int i10, int i11) {
        RecyclerView.q layoutManager = this.f3289a.getLayoutManager();
        if (layoutManager == null || this.f3289a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f3289a.getMinFlingVelocity();
        return (Math.abs(i11) > minFlingVelocity || Math.abs(i10) > minFlingVelocity) && i(layoutManager, i10, i11);
    }

    public void b(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f3289a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            e();
        }
        this.f3289a = recyclerView;
        if (recyclerView != null) {
            h();
            this.b = new Scroller(this.f3289a.getContext(), new DecelerateInterpolator());
            j();
        }
    }

    public abstract int[] c(@NonNull RecyclerView.q qVar, @NonNull View view);

    public abstract RecyclerView.a0 d(@NonNull RecyclerView.q qVar);

    public final void e() {
        this.f3289a.k1(this.f3290c);
        this.f3289a.setOnFlingListener(null);
    }

    @SuppressLint({"UnknownNullness"})
    public abstract View f(RecyclerView.q qVar);

    @SuppressLint({"UnknownNullness"})
    public abstract int g(RecyclerView.q qVar, int i10, int i11);

    public final void h() {
        if (this.f3289a.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.f3289a.n(this.f3290c);
        this.f3289a.setOnFlingListener(this);
    }

    public final boolean i(@NonNull RecyclerView.q qVar, int i10, int i11) {
        RecyclerView.a0 a0VarD;
        int iG;
        if (!(qVar instanceof RecyclerView.a0.b) || (a0VarD = d(qVar)) == null || (iG = g(qVar, i10, i11)) == -1) {
            return false;
        }
        a0VarD.p(iG);
        qVar.O1(a0VarD);
        return true;
    }

    public void j() {
        RecyclerView.q layoutManager;
        View viewF;
        RecyclerView recyclerView = this.f3289a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewF = f(layoutManager)) == null) {
            return;
        }
        int[] iArrC = c(layoutManager, viewF);
        int i10 = iArrC[0];
        if (i10 == 0 && iArrC[1] == 0) {
            return;
        }
        this.f3289a.y1(i10, iArrC[1]);
    }
}
