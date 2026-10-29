package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: androidx.recyclerview.widget.s */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1068s extends RecyclerView.AbstractC1037t {

    /* JADX INFO: renamed from: a */
    public RecyclerView f4324a;

    /* JADX INFO: renamed from: b */
    public Scroller f4325b;

    /* JADX INFO: renamed from: c */
    public final RecyclerView.AbstractC1039v f4326c = new a();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.s$a */
    public class a extends RecyclerView.AbstractC1039v {

        /* JADX INFO: renamed from: a */
        public boolean f4327a = false;

        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1039v
        /* JADX INFO: renamed from: a */
        public void mo5659a(RecyclerView recyclerView, int i10) {
            super.mo5659a(recyclerView, i10);
            if (i10 == 0 && this.f4327a) {
                this.f4327a = false;
                AbstractC1068s.this.m6061j();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1039v
        /* JADX INFO: renamed from: b */
        public void mo5660b(RecyclerView recyclerView, int i10, int i11) {
            if (i10 == 0 && i11 == 0) {
                return;
            }
            this.f4327a = true;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1037t
    /* JADX INFO: renamed from: a */
    public boolean mo5655a(int i10, int i11) {
        RecyclerView.AbstractC1034q layoutManager = this.f4324a.getLayoutManager();
        if (layoutManager == null || this.f4324a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f4324a.getMinFlingVelocity();
        return (Math.abs(i11) > minFlingVelocity || Math.abs(i10) > minFlingVelocity) && m6060i(layoutManager, i10, i11);
    }

    /* JADX INFO: renamed from: b */
    public void m6057b(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f4324a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            m6058e();
        }
        this.f4324a = recyclerView;
        if (recyclerView != null) {
            m6059h();
            this.f4325b = new Scroller(this.f4324a.getContext(), new DecelerateInterpolator());
            m6061j();
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract int[] mo6023c(@NonNull RecyclerView.AbstractC1034q abstractC1034q, @NonNull View view);

    /* JADX INFO: renamed from: d */
    public abstract RecyclerView.AbstractC1013a0 mo6024d(@NonNull RecyclerView.AbstractC1034q abstractC1034q);

    /* JADX INFO: renamed from: e */
    public final void m6058e() {
        this.f4324a.m5322k1(this.f4326c);
        this.f4324a.setOnFlingListener(null);
    }

    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: f */
    public abstract View mo6025f(RecyclerView.AbstractC1034q abstractC1034q);

    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: g */
    public abstract int mo6026g(RecyclerView.AbstractC1034q abstractC1034q, int i10, int i11);

    /* JADX INFO: renamed from: h */
    public final void m6059h() {
        if (this.f4324a.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.f4324a.m5329n(this.f4326c);
        this.f4324a.setOnFlingListener(this);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m6060i(@NonNull RecyclerView.AbstractC1034q abstractC1034q, int i10, int i11) {
        RecyclerView.AbstractC1013a0 abstractC1013a0Mo6024d;
        int iMo6026g;
        if (!(abstractC1034q instanceof RecyclerView.AbstractC1013a0.b) || (abstractC1013a0Mo6024d = mo6024d(abstractC1034q)) == null || (iMo6026g = mo6026g(abstractC1034q, i10, i11)) == -1) {
            return false;
        }
        abstractC1013a0Mo6024d.m5383p(iMo6026g);
        abstractC1034q.m5575O1(abstractC1013a0Mo6024d);
        return true;
    }

    /* JADX INFO: renamed from: j */
    public void m6061j() {
        RecyclerView.AbstractC1034q layoutManager;
        View viewMo6025f;
        RecyclerView recyclerView = this.f4324a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewMo6025f = mo6025f(layoutManager)) == null) {
            return;
        }
        int[] iArrMo6023c = mo6023c(layoutManager, viewMo6025f);
        int i10 = iArrMo6023c[0];
        if (i10 == 0 && iArrMo6023c[1] == 0) {
            return;
        }
        this.f4324a.m5360y1(i10, iArrMo6023c[1]);
    }
}
