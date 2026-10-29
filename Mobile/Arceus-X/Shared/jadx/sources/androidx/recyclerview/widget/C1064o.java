package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: androidx.recyclerview.widget.o */
/* JADX INFO: loaded from: classes.dex */
public class C1064o extends AbstractC1068s {

    /* JADX INFO: renamed from: d */
    public AbstractC1063n f4316d;

    /* JADX INFO: renamed from: e */
    public AbstractC1063n f4317e;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.o$a */
    public class a extends C1061l {
        public a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C1061l, androidx.recyclerview.widget.RecyclerView.AbstractC1013a0
        /* JADX INFO: renamed from: o */
        public void mo5382o(@NonNull View view, @NonNull RecyclerView.C1015b0 c1015b0, @NonNull RecyclerView.AbstractC1013a0.a aVar) {
            C1064o c1064o = C1064o.this;
            int[] iArrMo6023c = c1064o.mo6023c(c1064o.f4324a.getLayoutManager(), view);
            int i10 = iArrMo6023c[0];
            int i11 = iArrMo6023c[1];
            int iM5994w = m5994w(Math.max(Math.abs(i10), Math.abs(i11)));
            if (iM5994w > 0) {
                aVar.m5389d(i10, i11, iM5994w, this.f4305j);
            }
        }

        @Override // androidx.recyclerview.widget.C1061l
        /* JADX INFO: renamed from: v */
        public float mo5993v(@NonNull DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.C1061l
        /* JADX INFO: renamed from: x */
        public int mo5995x(int i10) {
            return Math.min(100, super.mo5995x(i10));
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1068s
    /* JADX INFO: renamed from: c */
    public int[] mo6023c(@NonNull RecyclerView.AbstractC1034q abstractC1034q, @NonNull View view) {
        int[] iArr = new int[2];
        if (abstractC1034q.mo5191p()) {
            iArr[0] = m6027k(view, m6029m(abstractC1034q));
        } else {
            iArr[0] = 0;
        }
        if (abstractC1034q.mo5193q()) {
            iArr[1] = m6027k(view, m6031o(abstractC1034q));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // androidx.recyclerview.widget.AbstractC1068s
    /* JADX INFO: renamed from: d */
    public RecyclerView.AbstractC1013a0 mo6024d(@NonNull RecyclerView.AbstractC1034q abstractC1034q) {
        if (abstractC1034q instanceof RecyclerView.AbstractC1013a0.b) {
            return new a(this.f4324a.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.AbstractC1068s
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: f */
    public View mo6025f(RecyclerView.AbstractC1034q abstractC1034q) {
        if (abstractC1034q.mo5193q()) {
            return m6028l(abstractC1034q, m6031o(abstractC1034q));
        }
        if (abstractC1034q.mo5191p()) {
            return m6028l(abstractC1034q, m6029m(abstractC1034q));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.AbstractC1068s
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: g */
    public int mo6026g(RecyclerView.AbstractC1034q abstractC1034q, int i10, int i11) {
        AbstractC1063n abstractC1063nM6030n;
        int iM5595e = abstractC1034q.m5595e();
        if (iM5595e == 0 || (abstractC1063nM6030n = m6030n(abstractC1034q)) == null) {
            return -1;
        }
        int iM5574O = abstractC1034q.m5574O();
        View view = null;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i14 = 0; i14 < iM5574O; i14++) {
            View viewM5573N = abstractC1034q.m5573N(i14);
            if (viewM5573N != null) {
                int iM6027k = m6027k(viewM5573N, abstractC1063nM6030n);
                if (iM6027k <= 0 && iM6027k > i13) {
                    view2 = viewM5573N;
                    i13 = iM6027k;
                }
                if (iM6027k >= 0 && iM6027k < i12) {
                    view = viewM5573N;
                    i12 = iM6027k;
                }
            }
        }
        boolean zM6032p = m6032p(abstractC1034q, i10, i11);
        if (zM6032p && view != null) {
            return abstractC1034q.m5613l0(view);
        }
        if (!zM6032p && view2 != null) {
            return abstractC1034q.m5613l0(view2);
        }
        if (zM6032p) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int iM5613l0 = abstractC1034q.m5613l0(view) + (m6033q(abstractC1034q) == zM6032p ? -1 : 1);
        if (iM5613l0 < 0 || iM5613l0 >= iM5595e) {
            return -1;
        }
        return iM5613l0;
    }

    /* JADX INFO: renamed from: k */
    public final int m6027k(@NonNull View view, AbstractC1063n abstractC1063n) {
        return (abstractC1063n.mo6010g(view) + (abstractC1063n.mo6008e(view) / 2)) - (abstractC1063n.mo6016m() + (abstractC1063n.mo6017n() / 2));
    }

    /* JADX INFO: renamed from: l */
    public final View m6028l(RecyclerView.AbstractC1034q abstractC1034q, AbstractC1063n abstractC1063n) {
        int iM5574O = abstractC1034q.m5574O();
        View view = null;
        if (iM5574O == 0) {
            return null;
        }
        int iMo6016m = abstractC1063n.mo6016m() + (abstractC1063n.mo6017n() / 2);
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < iM5574O; i11++) {
            View viewM5573N = abstractC1034q.m5573N(i11);
            int iAbs = Math.abs((abstractC1063n.mo6010g(viewM5573N) + (abstractC1063n.mo6008e(viewM5573N) / 2)) - iMo6016m);
            if (iAbs < i10) {
                view = viewM5573N;
                i10 = iAbs;
            }
        }
        return view;
    }

    @NonNull
    /* JADX INFO: renamed from: m */
    public final AbstractC1063n m6029m(@NonNull RecyclerView.AbstractC1034q abstractC1034q) {
        AbstractC1063n abstractC1063n = this.f4317e;
        if (abstractC1063n == null || abstractC1063n.f4313a != abstractC1034q) {
            this.f4317e = AbstractC1063n.m6004a(abstractC1034q);
        }
        return this.f4317e;
    }

    /* JADX INFO: renamed from: n */
    public final AbstractC1063n m6030n(RecyclerView.AbstractC1034q abstractC1034q) {
        if (abstractC1034q.mo5193q()) {
            return m6031o(abstractC1034q);
        }
        if (abstractC1034q.mo5191p()) {
            return m6029m(abstractC1034q);
        }
        return null;
    }

    @NonNull
    /* JADX INFO: renamed from: o */
    public final AbstractC1063n m6031o(@NonNull RecyclerView.AbstractC1034q abstractC1034q) {
        AbstractC1063n abstractC1063n = this.f4316d;
        if (abstractC1063n == null || abstractC1063n.f4313a != abstractC1034q) {
            this.f4316d = AbstractC1063n.m6006c(abstractC1034q);
        }
        return this.f4316d;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m6032p(RecyclerView.AbstractC1034q abstractC1034q, int i10, int i11) {
        if (abstractC1034q.mo5191p()) {
            return i10 > 0;
        }
        return i11 > 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: androidx.recyclerview.widget.RecyclerView$q */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public final boolean m6033q(RecyclerView.AbstractC1034q abstractC1034q) {
        PointF pointFMo5177c;
        int iM5595e = abstractC1034q.m5595e();
        if (!(abstractC1034q instanceof RecyclerView.AbstractC1013a0.b) || (pointFMo5177c = ((RecyclerView.AbstractC1013a0.b) abstractC1034q).mo5177c(iM5595e - 1)) == null) {
            return false;
        }
        return pointFMo5177c.x < 0.0f || pointFMo5177c.y < 0.0f;
    }
}
