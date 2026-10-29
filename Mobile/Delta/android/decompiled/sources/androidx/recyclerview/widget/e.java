package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f3153a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f3156e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3155d = 0;
    public final a b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<View> f3154c = new ArrayList();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f3157a = 0;
        public a b;

        public void a(int i10) {
            if (i10 < 64) {
                this.f3157a &= ~(1 << i10);
                return;
            }
            a aVar = this.b;
            if (aVar != null) {
                aVar.a(i10 - 64);
            }
        }

        public int b(int i10) {
            a aVar = this.b;
            if (aVar == null) {
                return i10 >= 64 ? Long.bitCount(this.f3157a) : Long.bitCount(this.f3157a & ((1 << i10) - 1));
            }
            return i10 < 64 ? Long.bitCount(this.f3157a & ((1 << i10) - 1)) : aVar.b(i10 - 64) + Long.bitCount(this.f3157a);
        }

        public final void c() {
            if (this.b == null) {
                this.b = new a();
            }
        }

        public boolean d(int i10) {
            if (i10 < 64) {
                return (this.f3157a & (1 << i10)) != 0;
            }
            c();
            return this.b.d(i10 - 64);
        }

        public void e(int i10, boolean z10) {
            if (i10 >= 64) {
                c();
                this.b.e(i10 - 64, z10);
                return;
            }
            long j10 = this.f3157a;
            boolean z11 = (Long.MIN_VALUE & j10) != 0;
            long j11 = (1 << i10) - 1;
            this.f3157a = ((j10 & (~j11)) << 1) | (j10 & j11);
            if (z10) {
                h(i10);
            } else {
                a(i10);
            }
            if (z11 || this.b != null) {
                c();
                this.b.e(0, z11);
            }
        }

        public boolean f(int i10) {
            if (i10 >= 64) {
                c();
                return this.b.f(i10 - 64);
            }
            long j10 = 1 << i10;
            long j11 = this.f3157a;
            boolean z10 = (j11 & j10) != 0;
            long j12 = j11 & (~j10);
            this.f3157a = j12;
            long j13 = j10 - 1;
            this.f3157a = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
            a aVar = this.b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.b.f(0);
            }
            return z10;
        }

        public void g() {
            this.f3157a = 0L;
            a aVar = this.b;
            if (aVar != null) {
                aVar.g();
            }
        }

        public void h(int i10) {
            if (i10 < 64) {
                this.f3157a |= 1 << i10;
            } else {
                c();
                this.b.h(i10 - 64);
            }
        }

        public String toString() {
            if (this.b == null) {
                return Long.toBinaryString(this.f3157a);
            }
            return this.b.toString() + "xx" + Long.toBinaryString(this.f3157a);
        }
    }

    public interface b {
        View a(int i10);

        void addView(View view, int i10);

        void b(View view);

        int c();

        RecyclerView.f0 d(View view);

        void e(int i10);

        void f();

        int g(View view);

        void h(View view);

        void i(int i10);

        void j(View view, int i10, ViewGroup.LayoutParams layoutParams);
    }

    public e(b bVar) {
        this.f3153a = bVar;
    }

    public void a(View view, int i10, boolean z10) {
        int iC = i10 < 0 ? this.f3153a.c() : h(i10);
        this.b.e(iC, z10);
        if (z10) {
            l(view);
        }
        this.f3153a.addView(view, iC);
    }

    public void b(View view, boolean z10) {
        a(view, -1, z10);
    }

    public void c(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        int iC = i10 < 0 ? this.f3153a.c() : h(i10);
        this.b.e(iC, z10);
        if (z10) {
            l(view);
        }
        this.f3153a.j(view, iC, layoutParams);
    }

    public void d(int i10) {
        int iH = h(i10);
        this.b.f(iH);
        this.f3153a.e(iH);
    }

    public View e(int i10) {
        int size = this.f3154c.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view = this.f3154c.get(i11);
            RecyclerView.f0 f0VarD = this.f3153a.d(view);
            if (f0VarD.n() == i10 && !f0VarD.u() && !f0VarD.w()) {
                return view;
            }
        }
        return null;
    }

    public View f(int i10) {
        return this.f3153a.a(h(i10));
    }

    public int g() {
        return this.f3153a.c() - this.f3154c.size();
    }

    public final int h(int i10) {
        if (i10 < 0) {
            return -1;
        }
        int iC = this.f3153a.c();
        int i11 = i10;
        while (i11 < iC) {
            int iB = i10 - (i11 - this.b.b(i11));
            if (iB == 0) {
                while (this.b.d(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += iB;
        }
        return -1;
    }

    public View i(int i10) {
        return this.f3153a.a(i10);
    }

    public int j() {
        return this.f3153a.c();
    }

    public void k(View view) {
        int iG = this.f3153a.g(view);
        if (iG >= 0) {
            this.b.h(iG);
            l(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public final void l(View view) {
        this.f3154c.add(view);
        this.f3153a.b(view);
    }

    public int m(View view) {
        int iG = this.f3153a.g(view);
        if (iG == -1 || this.b.d(iG)) {
            return -1;
        }
        return iG - this.b.b(iG);
    }

    public boolean n(View view) {
        return this.f3154c.contains(view);
    }

    public void o() {
        this.b.g();
        for (int size = this.f3154c.size() - 1; size >= 0; size--) {
            this.f3153a.h(this.f3154c.get(size));
            this.f3154c.remove(size);
        }
        this.f3153a.f();
    }

    public void p(View view) {
        int i10 = this.f3155d;
        if (i10 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i10 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            this.f3155d = 1;
            this.f3156e = view;
            int iG = this.f3153a.g(view);
            if (iG >= 0) {
                if (this.b.f(iG)) {
                    t(view);
                }
                this.f3153a.i(iG);
            }
        } finally {
            this.f3155d = 0;
            this.f3156e = null;
        }
    }

    public void q(int i10) {
        int i11 = this.f3155d;
        if (i11 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i11 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            int iH = h(i10);
            View viewA = this.f3153a.a(iH);
            if (viewA != null) {
                this.f3155d = 1;
                this.f3156e = viewA;
                if (this.b.f(iH)) {
                    t(viewA);
                }
                this.f3153a.i(iH);
            }
        } finally {
            this.f3155d = 0;
            this.f3156e = null;
        }
    }

    public boolean r(View view) {
        int i10 = this.f3155d;
        if (i10 == 1) {
            if (this.f3156e == view) {
                return false;
            }
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
        }
        if (i10 == 2) {
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
        }
        try {
            this.f3155d = 2;
            int iG = this.f3153a.g(view);
            if (iG == -1) {
                t(view);
                return true;
            }
            if (!this.b.d(iG)) {
                return false;
            }
            this.b.f(iG);
            t(view);
            this.f3153a.i(iG);
            return true;
        } finally {
            this.f3155d = 0;
        }
    }

    public void s(View view) {
        int iG = this.f3153a.g(view);
        if (iG < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.b.d(iG)) {
            this.b.a(iG);
            t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public final boolean t(View view) {
        if (!this.f3154c.remove(view)) {
            return false;
        }
        this.f3153a.h(view);
        return true;
    }

    public String toString() {
        return this.b.toString() + ", hidden list:" + this.f3154c.size();
    }
}
