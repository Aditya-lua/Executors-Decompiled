package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclerView.q f3279a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f3280c;

    public class a extends n {
        public a(RecyclerView.q qVar) {
            super(qVar, null);
        }

        @Override // androidx.recyclerview.widget.n
        public int d(View view) {
            return this.f3279a.Y(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.r) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.n
        public int e(View view) {
            RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
            return this.f3279a.X(view) + ((ViewGroup.MarginLayoutParams) rVar).leftMargin + ((ViewGroup.MarginLayoutParams) rVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.n
        public int f(View view) {
            RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
            return this.f3279a.W(view) + ((ViewGroup.MarginLayoutParams) rVar).topMargin + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.n
        public int g(View view) {
            return this.f3279a.V(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.r) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.n
        public int h() {
            return this.f3279a.s0();
        }

        @Override // androidx.recyclerview.widget.n
        public int i() {
            return this.f3279a.s0() - this.f3279a.j0();
        }

        @Override // androidx.recyclerview.widget.n
        public int j() {
            return this.f3279a.j0();
        }

        @Override // androidx.recyclerview.widget.n
        public int k() {
            return this.f3279a.t0();
        }

        @Override // androidx.recyclerview.widget.n
        public int l() {
            return this.f3279a.c0();
        }

        @Override // androidx.recyclerview.widget.n
        public int m() {
            return this.f3279a.i0();
        }

        @Override // androidx.recyclerview.widget.n
        public int n() {
            return (this.f3279a.s0() - this.f3279a.i0()) - this.f3279a.j0();
        }

        @Override // androidx.recyclerview.widget.n
        public int p(View view) {
            this.f3279a.r0(view, true, this.f3280c);
            return this.f3280c.right;
        }

        @Override // androidx.recyclerview.widget.n
        public int q(View view) {
            this.f3279a.r0(view, true, this.f3280c);
            return this.f3280c.left;
        }

        @Override // androidx.recyclerview.widget.n
        public void r(int i10) {
            this.f3279a.H0(i10);
        }
    }

    public class b extends n {
        public b(RecyclerView.q qVar) {
            super(qVar, null);
        }

        @Override // androidx.recyclerview.widget.n
        public int d(View view) {
            return this.f3279a.T(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.r) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.n
        public int e(View view) {
            RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
            return this.f3279a.W(view) + ((ViewGroup.MarginLayoutParams) rVar).topMargin + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.n
        public int f(View view) {
            RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
            return this.f3279a.X(view) + ((ViewGroup.MarginLayoutParams) rVar).leftMargin + ((ViewGroup.MarginLayoutParams) rVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.n
        public int g(View view) {
            return this.f3279a.Z(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.r) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.n
        public int h() {
            return this.f3279a.b0();
        }

        @Override // androidx.recyclerview.widget.n
        public int i() {
            return this.f3279a.b0() - this.f3279a.h0();
        }

        @Override // androidx.recyclerview.widget.n
        public int j() {
            return this.f3279a.h0();
        }

        @Override // androidx.recyclerview.widget.n
        public int k() {
            return this.f3279a.c0();
        }

        @Override // androidx.recyclerview.widget.n
        public int l() {
            return this.f3279a.t0();
        }

        @Override // androidx.recyclerview.widget.n
        public int m() {
            return this.f3279a.k0();
        }

        @Override // androidx.recyclerview.widget.n
        public int n() {
            return (this.f3279a.b0() - this.f3279a.k0()) - this.f3279a.h0();
        }

        @Override // androidx.recyclerview.widget.n
        public int p(View view) {
            this.f3279a.r0(view, true, this.f3280c);
            return this.f3280c.bottom;
        }

        @Override // androidx.recyclerview.widget.n
        public int q(View view) {
            this.f3279a.r0(view, true, this.f3280c);
            return this.f3280c.top;
        }

        @Override // androidx.recyclerview.widget.n
        public void r(int i10) {
            this.f3279a.I0(i10);
        }
    }

    public /* synthetic */ n(RecyclerView.q qVar, a aVar) {
        this(qVar);
    }

    public static n a(RecyclerView.q qVar) {
        return new a(qVar);
    }

    public static n b(RecyclerView.q qVar, int i10) {
        if (i10 == 0) {
            return a(qVar);
        }
        if (i10 == 1) {
            return c(qVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static n c(RecyclerView.q qVar) {
        return new b(qVar);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public int o() {
        if (Integer.MIN_VALUE == this.b) {
            return 0;
        }
        return n() - this.b;
    }

    public abstract int p(View view);

    public abstract int q(View view);

    public abstract void r(int i10);

    public void s() {
        this.b = n();
    }

    public n(RecyclerView.q qVar) {
        this.b = Integer.MIN_VALUE;
        this.f3280c = new Rect();
        this.f3279a = qVar;
    }
}
