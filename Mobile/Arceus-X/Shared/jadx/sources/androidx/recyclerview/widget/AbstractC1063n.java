package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.inputmethod.EditorInfoCompat;

/* JADX INFO: renamed from: androidx.recyclerview.widget.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1063n {

    /* JADX INFO: renamed from: a */
    public final RecyclerView.AbstractC1034q f4313a;

    /* JADX INFO: renamed from: b */
    public int f4314b;

    /* JADX INFO: renamed from: c */
    public final Rect f4315c;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.n$a */
    public class a extends AbstractC1063n {
        public a(RecyclerView.AbstractC1034q abstractC1034q) {
            super(abstractC1034q, null);
        }

        @Override // androidx.recyclerview.widget.AbstractC1063n
        /* JADX INFO: renamed from: d */
        public int mo6007d(View view) {
            return this.f4313a.m5588Y(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.C1035r) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC1063n
        /* JADX INFO: renamed from: e */
        public int mo6008e(View view) {
            RecyclerView.C1035r c1035r = (RecyclerView.C1035r) view.getLayoutParams();
            return this.f4313a.m5587X(view) + ((ViewGroup.MarginLayoutParams) c1035r).leftMargin + ((ViewGroup.MarginLayoutParams) c1035r).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC1063n
        /* JADX INFO: renamed from: f */
        public int mo6009f(View view) {
            RecyclerView.C1035r c1035r = (RecyclerView.C1035r) view.getLayoutParams();
            return this.f4313a.m5586W(view) + ((ViewGroup.MarginLayoutParams) c1035r).topMargin + ((ViewGroup.MarginLayoutParams) c1035r).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC1063n
        /* JADX INFO: renamed from: g */
        public int mo6010g(View view) {
            return this.f4313a.m5584V(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.C1035r) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC1063n
        /* JADX INFO: renamed from: h */
        public int mo6011h() {
            return this.f4313a.m5627s0();
        }

        @Override // androidx.recyclerview.widget.AbstractC1063n
        /* JADX INFO: renamed from: i */
        public int mo6012i() {
            return this.f4313a.m5627s0() - this.f4313a.m5608j0();
        }

        @Override // androidx.recyclerview.widget.AbstractC1063n
        /* JADX INFO: renamed from: j */
        public int mo6013j() {
            return this.f4313a.m5608j0();
        }

        @Override // androidx.recyclerview.widget.AbstractC1063n
        /* JADX INFO: renamed from: k */
        public int mo6014k() {
            return this.f4313a.m5629t0();
        }

        @Override // androidx.recyclerview.widget.AbstractC1063n
        /* JADX INFO: renamed from: l */
        public int mo6015l() {
            return this.f4313a.m5593c0();
        }

        @Override // androidx.recyclerview.widget.AbstractC1063n
        /* JADX INFO: renamed from: m */
        public int mo6016m() {
            return this.f4313a.m5606i0();
        }

        @Override // androidx.recyclerview.widget.AbstractC1063n
        /* JADX INFO: renamed from: n */
        public int mo6017n() {
            return (this.f4313a.m5627s0() - this.f4313a.m5606i0()) - this.f4313a.m5608j0();
        }

        @Override // androidx.recyclerview.widget.AbstractC1063n
        /* JADX INFO: renamed from: p */
        public int mo6019p(View view) {
            this.f4313a.m5625r0(view, true, this.f4315c);
            return this.f4315c.right;
        }

        @Override // androidx.recyclerview.widget.AbstractC1063n
        /* JADX INFO: renamed from: q */
        public int mo6020q(View view) {
            this.f4313a.m5625r0(view, true, this.f4315c);
            return this.f4315c.left;
        }

        @Override // androidx.recyclerview.widget.AbstractC1063n
        /* JADX INFO: renamed from: r */
        public void mo6021r(int i10) {
            this.f4313a.mo5561H0(i10);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.n$b */
    public class b extends AbstractC1063n {
        public b(RecyclerView.AbstractC1034q abstractC1034q) {
            super(abstractC1034q, null);
        }

        @Override // androidx.recyclerview.widget.AbstractC1063n
        /* JADX INFO: renamed from: d */
        public int mo6007d(View view) {
            return this.f4313a.m5581T(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.C1035r) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC1063n
        /* JADX INFO: renamed from: e */
        public int mo6008e(View view) {
            RecyclerView.C1035r c1035r = (RecyclerView.C1035r) view.getLayoutParams();
            return this.f4313a.m5586W(view) + ((ViewGroup.MarginLayoutParams) c1035r).topMargin + ((ViewGroup.MarginLayoutParams) c1035r).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC1063n
        /* JADX INFO: renamed from: f */
        public int mo6009f(View view) {
            RecyclerView.C1035r c1035r = (RecyclerView.C1035r) view.getLayoutParams();
            return this.f4313a.m5587X(view) + ((ViewGroup.MarginLayoutParams) c1035r).leftMargin + ((ViewGroup.MarginLayoutParams) c1035r).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC1063n
        /* JADX INFO: renamed from: g */
        public int mo6010g(View view) {
            return this.f4313a.m5589Z(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.C1035r) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC1063n
        /* JADX INFO: renamed from: h */
        public int mo6011h() {
            return this.f4313a.m5592b0();
        }

        @Override // androidx.recyclerview.widget.AbstractC1063n
        /* JADX INFO: renamed from: i */
        public int mo6012i() {
            return this.f4313a.m5592b0() - this.f4313a.m5604h0();
        }

        @Override // androidx.recyclerview.widget.AbstractC1063n
        /* JADX INFO: renamed from: j */
        public int mo6013j() {
            return this.f4313a.m5604h0();
        }

        @Override // androidx.recyclerview.widget.AbstractC1063n
        /* JADX INFO: renamed from: k */
        public int mo6014k() {
            return this.f4313a.m5593c0();
        }

        @Override // androidx.recyclerview.widget.AbstractC1063n
        /* JADX INFO: renamed from: l */
        public int mo6015l() {
            return this.f4313a.m5629t0();
        }

        @Override // androidx.recyclerview.widget.AbstractC1063n
        /* JADX INFO: renamed from: m */
        public int mo6016m() {
            return this.f4313a.m5611k0();
        }

        @Override // androidx.recyclerview.widget.AbstractC1063n
        /* JADX INFO: renamed from: n */
        public int mo6017n() {
            return (this.f4313a.m5592b0() - this.f4313a.m5611k0()) - this.f4313a.m5604h0();
        }

        @Override // androidx.recyclerview.widget.AbstractC1063n
        /* JADX INFO: renamed from: p */
        public int mo6019p(View view) {
            this.f4313a.m5625r0(view, true, this.f4315c);
            return this.f4315c.bottom;
        }

        @Override // androidx.recyclerview.widget.AbstractC1063n
        /* JADX INFO: renamed from: q */
        public int mo6020q(View view) {
            this.f4313a.m5625r0(view, true, this.f4315c);
            return this.f4315c.top;
        }

        @Override // androidx.recyclerview.widget.AbstractC1063n
        /* JADX INFO: renamed from: r */
        public void mo6021r(int i10) {
            this.f4313a.mo5562I0(i10);
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 androidx.recyclerview.widget.RecyclerView$q) A[MD:(androidx.recyclerview.widget.RecyclerView$q):void (m)] (LINE:1) call: androidx.recyclerview.widget.n.<init>(androidx.recyclerview.widget.RecyclerView$q):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ AbstractC1063n(RecyclerView.AbstractC1034q abstractC1034q, a aVar) {
        this(abstractC1034q);
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC1063n m6004a(RecyclerView.AbstractC1034q abstractC1034q) {
        return new a(abstractC1034q);
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC1063n m6005b(RecyclerView.AbstractC1034q abstractC1034q, int i10) {
        if (i10 == 0) {
            return m6004a(abstractC1034q);
        }
        if (i10 == 1) {
            return m6006c(abstractC1034q);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC1063n m6006c(RecyclerView.AbstractC1034q abstractC1034q) {
        return new b(abstractC1034q);
    }

    /* JADX INFO: renamed from: d */
    public abstract int mo6007d(View view);

    /* JADX INFO: renamed from: e */
    public abstract int mo6008e(View view);

    /* JADX INFO: renamed from: f */
    public abstract int mo6009f(View view);

    /* JADX INFO: renamed from: g */
    public abstract int mo6010g(View view);

    /* JADX INFO: renamed from: h */
    public abstract int mo6011h();

    /* JADX INFO: renamed from: i */
    public abstract int mo6012i();

    /* JADX INFO: renamed from: j */
    public abstract int mo6013j();

    /* JADX INFO: renamed from: k */
    public abstract int mo6014k();

    /* JADX INFO: renamed from: l */
    public abstract int mo6015l();

    /* JADX INFO: renamed from: m */
    public abstract int mo6016m();

    /* JADX INFO: renamed from: n */
    public abstract int mo6017n();

    /* JADX INFO: renamed from: o */
    public int m6018o() {
        if (Integer.MIN_VALUE == this.f4314b) {
            return 0;
        }
        return mo6017n() - this.f4314b;
    }

    /* JADX INFO: renamed from: p */
    public abstract int mo6019p(View view);

    /* JADX INFO: renamed from: q */
    public abstract int mo6020q(View view);

    /* JADX INFO: renamed from: r */
    public abstract void mo6021r(int i10);

    /* JADX INFO: renamed from: s */
    public void m6022s() {
        this.f4314b = mo6017n();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AbstractC1063n(RecyclerView.AbstractC1034q abstractC1034q) {
        this.f4314b = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        this.f4315c = new Rect();
        this.f4313a = abstractC1034q;
    }
}
