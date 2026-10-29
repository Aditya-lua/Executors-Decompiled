package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ThreadLocal<j> f3250e = new ThreadLocal<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Comparator<c> f3251f = new a();
    public long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f3253c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList<RecyclerView> f3252a = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList<c> f3254d = new ArrayList<>();

    public class a implements Comparator<c> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.f3260d;
            if ((recyclerView == null) != (cVar2.f3260d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z10 = cVar.f3258a;
            if (z10 != cVar2.f3258a) {
                return z10 ? -1 : 1;
            }
            int i10 = cVar2.b - cVar.b;
            if (i10 != 0) {
                return i10;
            }
            int i11 = cVar.f3259c - cVar2.f3259c;
            if (i11 != 0) {
                return i11;
            }
            return 0;
        }
    }

    @SuppressLint({"VisibleForTests"})
    public static class b implements RecyclerView.q.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3255a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int[] f3256c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f3257d;

        @Override // androidx.recyclerview.widget.RecyclerView.q.c
        public void a(int i10, int i11) {
            if (i10 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i11 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i12 = this.f3257d;
            int i13 = i12 * 2;
            int[] iArr = this.f3256c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f3256c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i13 >= iArr.length) {
                int[] iArr3 = new int[i12 * 4];
                this.f3256c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f3256c;
            iArr4[i13] = i10;
            iArr4[i13 + 1] = i11;
            this.f3257d++;
        }

        public void b() {
            int[] iArr = this.f3256c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f3257d = 0;
        }

        public void c(RecyclerView recyclerView, boolean z10) {
            this.f3257d = 0;
            int[] iArr = this.f3256c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.q qVar = recyclerView.f2948n;
            if (recyclerView.f2946m == null || qVar == null || !qVar.y0()) {
                return;
            }
            if (z10) {
                if (!recyclerView.f2930e.p()) {
                    qVar.u(recyclerView.f2946m.e(), this);
                }
            } else if (!recyclerView.v0()) {
                qVar.t(this.f3255a, this.b, recyclerView.f2941j0, this);
            }
            int i10 = this.f3257d;
            if (i10 > qVar.f3060m) {
                qVar.f3060m = i10;
                qVar.f3061n = z10;
                recyclerView.f2926c.P();
            }
        }

        public boolean d(int i10) {
            if (this.f3256c != null) {
                int i11 = this.f3257d * 2;
                for (int i12 = 0; i12 < i11; i12 += 2) {
                    if (this.f3256c[i12] == i10) {
                        return true;
                    }
                }
            }
            return false;
        }

        public void e(int i10, int i11) {
            this.f3255a = i10;
            this.b = i11;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f3258a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f3259c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public RecyclerView f3260d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f3261e;

        public void a() {
            this.f3258a = false;
            this.b = 0;
            this.f3259c = 0;
            this.f3260d = null;
            this.f3261e = 0;
        }
    }

    public static boolean e(RecyclerView recyclerView, int i10) {
        int iJ = recyclerView.f2932f.j();
        for (int i11 = 0; i11 < iJ; i11++) {
            RecyclerView.f0 f0VarN0 = RecyclerView.n0(recyclerView.f2932f.i(i11));
            if (f0VarN0.f3017c == i10 && !f0VarN0.u()) {
                return true;
            }
        }
        return false;
    }

    public void a(RecyclerView recyclerView) {
        if (RecyclerView.F0 && this.f3252a.contains(recyclerView)) {
            throw new IllegalStateException("RecyclerView already present in worker list!");
        }
        this.f3252a.add(recyclerView);
    }

    public final void b() {
        c cVar;
        int size = this.f3252a.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView = this.f3252a.get(i11);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f2939i0.c(recyclerView, false);
                i10 += recyclerView.f2939i0.f3257d;
            }
        }
        this.f3254d.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView2 = this.f3252a.get(i13);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.f2939i0;
                int iAbs = Math.abs(bVar.f3255a) + Math.abs(bVar.b);
                for (int i14 = 0; i14 < bVar.f3257d * 2; i14 += 2) {
                    if (i12 >= this.f3254d.size()) {
                        cVar = new c();
                        this.f3254d.add(cVar);
                    } else {
                        cVar = this.f3254d.get(i12);
                    }
                    int[] iArr = bVar.f3256c;
                    int i15 = iArr[i14 + 1];
                    cVar.f3258a = i15 <= iAbs;
                    cVar.b = iAbs;
                    cVar.f3259c = i15;
                    cVar.f3260d = recyclerView2;
                    cVar.f3261e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(this.f3254d, f3251f);
    }

    public final void c(c cVar, long j10) {
        RecyclerView.f0 f0VarI = i(cVar.f3260d, cVar.f3261e, cVar.f3258a ? Long.MAX_VALUE : j10);
        if (f0VarI == null || f0VarI.b == null || !f0VarI.t() || f0VarI.u()) {
            return;
        }
        h(f0VarI.b.get(), j10);
    }

    public final void d(long j10) {
        for (int i10 = 0; i10 < this.f3254d.size(); i10++) {
            c cVar = this.f3254d.get(i10);
            if (cVar.f3260d == null) {
                return;
            }
            c(cVar, j10);
            cVar.a();
        }
    }

    public void f(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.isAttachedToWindow()) {
            if (RecyclerView.F0 && !this.f3252a.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.b == 0) {
                this.b = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        recyclerView.f2939i0.e(i10, i11);
    }

    public void g(long j10) {
        b();
        d(j10);
    }

    public final void h(RecyclerView recyclerView, long j10) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.F && recyclerView.f2932f.j() != 0) {
            recyclerView.g1();
        }
        b bVar = recyclerView.f2939i0;
        bVar.c(recyclerView, true);
        if (bVar.f3257d != 0) {
            try {
                Trace.beginSection(j10 == Long.MAX_VALUE ? "RV Nested Prefetch" : "RV Nested Prefetch forced - needed next frame");
                recyclerView.f2941j0.f(recyclerView.f2946m);
                for (int i10 = 0; i10 < bVar.f3257d * 2; i10 += 2) {
                    i(recyclerView, bVar.f3256c[i10], j10);
                }
                Trace.endSection();
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }
    }

    public final RecyclerView.f0 i(RecyclerView recyclerView, int i10, long j10) {
        if (e(recyclerView, i10)) {
            return null;
        }
        RecyclerView.x xVar = recyclerView.f2926c;
        if (j10 == Long.MAX_VALUE) {
            try {
                if (u2.o.c()) {
                    Trace.beginSection("RV Prefetch forced - needed next frame");
                }
            } finally {
                recyclerView.S0(false);
                Trace.endSection();
            }
        }
        recyclerView.Q0();
        RecyclerView.f0 f0VarN = xVar.N(i10, false, j10);
        if (f0VarN != null) {
            if (!f0VarN.t() || f0VarN.u()) {
                xVar.a(f0VarN, false);
            } else {
                xVar.G(f0VarN.f3016a);
            }
        }
        return f0VarN;
    }

    public void j(RecyclerView recyclerView) {
        boolean zRemove = this.f3252a.remove(recyclerView);
        if (RecyclerView.F0 && !zRemove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Trace.beginSection("RV Prefetch");
            if (!this.f3252a.isEmpty()) {
                int size = this.f3252a.size();
                long jMax = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    RecyclerView recyclerView = this.f3252a.get(i10);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f3253c);
                }
            }
        } finally {
            this.b = 0L;
            Trace.endSection();
        }
    }
}
