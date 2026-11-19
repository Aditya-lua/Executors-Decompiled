package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class s extends RecyclerView.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RecyclerView f2836a;
    public Scroller b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RecyclerView.v f2837c = new a();

    public class a extends RecyclerView.v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f2838a = false;

        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.v
        public void a(RecyclerView recyclerView, int i10) {
            super.a(recyclerView, i10);
            if (i10 == 0 && this.f2838a) {
                this.f2838a = false;
                s.this.j();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.v
        public void b(RecyclerView recyclerView, int i10, int i11) {
            if (i10 == 0 && i11 == 0) {
                return;
            }
            this.f2838a = true;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public boolean a(int i10, int i11) {
        RecyclerView.q layoutManager = this.f2836a.getLayoutManager();
        if (layoutManager == null || this.f2836a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f2836a.getMinFlingVelocity();
        return (Math.abs(i11) > minFlingVelocity || Math.abs(i10) > minFlingVelocity) && i(layoutManager, i10, i11);
    }

    public void b(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f2836a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            e();
        }
        this.f2836a = recyclerView;
        if (recyclerView != null) {
            h();
            this.b = new Scroller(this.f2836a.getContext(), new DecelerateInterpolator());
            j();
        }
    }

    public abstract int[] c(@NonNull RecyclerView.q qVar, @NonNull View view);

    public abstract RecyclerView.b0 d(@NonNull RecyclerView.q qVar);

    public final void e() {
        this.f2836a.k1(this.f2837c);
        this.f2836a.setOnFlingListener(null);
    }

    @SuppressLint({"UnknownNullness"})
    public abstract View f(RecyclerView.q qVar);

    @SuppressLint({"UnknownNullness"})
    public abstract int g(RecyclerView.q qVar, int i10, int i11);

    public final void h() {
        if (this.f2836a.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.f2836a.n(this.f2837c);
        this.f2836a.setOnFlingListener(this);
    }

    public final boolean i(@NonNull RecyclerView.q qVar, int i10, int i11) {
        RecyclerView.b0 b0VarD;
        int iG;
        if (!(qVar instanceof RecyclerView.b0.b) || (b0VarD = d(qVar)) == null || (iG = g(qVar, i10, i11)) == -1) {
            return false;
        }
        b0VarD.p(iG);
        qVar.O1(b0VarD);
        return true;
    }

    public void j() {
        RecyclerView.q layoutManager;
        View viewF;
        RecyclerView recyclerView = this.f2836a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewF = f(layoutManager)) == null) {
            return;
        }
        int[] iArrC = c(layoutManager, viewF);
        int i10 = iArrC[0];
        if (i10 == 0 && iArrC[1] == 0) {
            return;
        }
        this.f2836a.y1(i10, iArrC[1]);
    }
}
