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
    public static final ThreadLocal<j> f2797e = new ThreadLocal<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Comparator<c> f2798f = new a();
    public long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f2800c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList<RecyclerView> f2799a = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList<c> f2801d = new ArrayList<>();

    public class a implements Comparator<c> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.f2807d;
            if ((recyclerView == null) != (cVar2.f2807d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z10 = cVar.f2805a;
            if (z10 != cVar2.f2805a) {
                return z10 ? -1 : 1;
            }
            int i10 = cVar2.b - cVar.b;
            if (i10 != 0) {
                return i10;
            }
            int i11 = cVar.f2806c - cVar2.f2806c;
            if (i11 != 0) {
                return i11;
            }
            return 0;
        }
    }

    @SuppressLint({"VisibleForTests"})
    public static class b implements RecyclerView.q.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2802a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int[] f2803c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f2804d;

        @Override // androidx.recyclerview.widget.RecyclerView.q.c
        public void a(int i10, int i11) {
            if (i10 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i11 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i12 = this.f2804d;
            int i13 = i12 * 2;
            int[] iArr = this.f2803c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f2803c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i13 >= iArr.length) {
                int[] iArr3 = new int[i12 * 4];
                this.f2803c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f2803c;
            iArr4[i13] = i10;
            iArr4[i13 + 1] = i11;
            this.f2804d++;
        }

        public void b() {
            int[] iArr = this.f2803c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f2804d = 0;
        }

        public void c(RecyclerView recyclerView, boolean z10) {
            this.f2804d = 0;
            int[] iArr = this.f2803c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.q qVar = recyclerView.f2495n;
            if (recyclerView.f2493m == null || qVar == null || !qVar.y0()) {
                return;
            }
            if (z10) {
                if (!recyclerView.f2477e.p()) {
                    qVar.u(recyclerView.f2493m.e(), this);
                }
            } else if (!recyclerView.v0()) {
                qVar.t(this.f2802a, this.b, recyclerView.f2488j0, this);
            }
            int i10 = this.f2804d;
            if (i10 > qVar.f2607m) {
                qVar.f2607m = i10;
                qVar.f2608n = z10;
                recyclerView.f2473c.P();
            }
        }

        public boolean d(int i10) {
            if (this.f2803c != null) {
                int i11 = this.f2804d * 2;
                for (int i12 = 0; i12 < i11; i12 += 2) {
                    if (this.f2803c[i12] == i10) {
                        return true;
                    }
                }
            }
            return false;
        }

        public void e(int i10, int i11) {
            this.f2802a = i10;
            this.b = i11;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f2805a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2806c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public RecyclerView f2807d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f2808e;

        public void a() {
            this.f2805a = false;
            this.b = 0;
            this.f2806c = 0;
            this.f2807d = null;
            this.f2808e = 0;
        }
    }

    public static boolean e(RecyclerView recyclerView, int i10) {
        int iJ = recyclerView.f2479f.j();
        for (int i11 = 0; i11 < iJ; i11++) {
            RecyclerView.g0 g0VarN0 = RecyclerView.n0(recyclerView.f2479f.i(i11));
            if (g0VarN0.f2565c == i10 && !g0VarN0.u()) {
                return true;
            }
        }
        return false;
    }

    public void a(RecyclerView recyclerView) {
        if (RecyclerView.F0 && this.f2799a.contains(recyclerView)) {
            throw new IllegalStateException("RecyclerView already present in worker list!");
        }
        this.f2799a.add(recyclerView);
    }

    public final void b() {
        c cVar;
        int size = this.f2799a.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView = this.f2799a.get(i11);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f2486i0.c(recyclerView, false);
                i10 += recyclerView.f2486i0.f2804d;
            }
        }
        this.f2801d.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView2 = this.f2799a.get(i13);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.f2486i0;
                int iAbs = Math.abs(bVar.f2802a) + Math.abs(bVar.b);
                for (int i14 = 0; i14 < bVar.f2804d * 2; i14 += 2) {
                    if (i12 >= this.f2801d.size()) {
                        cVar = new c();
                        this.f2801d.add(cVar);
                    } else {
                        cVar = this.f2801d.get(i12);
                    }
                    int[] iArr = bVar.f2803c;
                    int i15 = iArr[i14 + 1];
                    cVar.f2805a = i15 <= iAbs;
                    cVar.b = iAbs;
                    cVar.f2806c = i15;
                    cVar.f2807d = recyclerView2;
                    cVar.f2808e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(this.f2801d, f2798f);
    }

    public final void c(c cVar, long j10) {
        RecyclerView.g0 g0VarI = i(cVar.f2807d, cVar.f2808e, cVar.f2805a ? Long.MAX_VALUE : j10);
        if (g0VarI == null || g0VarI.b == null || !g0VarI.t() || g0VarI.u()) {
            return;
        }
        h(g0VarI.b.get(), j10);
    }

    public final void d(long j10) {
        for (int i10 = 0; i10 < this.f2801d.size(); i10++) {
            c cVar = this.f2801d.get(i10);
            if (cVar.f2807d == null) {
                return;
            }
            c(cVar, j10);
            cVar.a();
        }
    }

    public void f(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.isAttachedToWindow()) {
            if (RecyclerView.F0 && !this.f2799a.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.b == 0) {
                this.b = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        recyclerView.f2486i0.e(i10, i11);
    }

    public void g(long j10) {
        b();
        d(j10);
    }

    public final void h(RecyclerView recyclerView, long j10) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.F && recyclerView.f2479f.j() != 0) {
            recyclerView.g1();
        }
        b bVar = recyclerView.f2486i0;
        bVar.c(recyclerView, true);
        if (bVar.f2804d != 0) {
            try {
                Trace.beginSection(j10 == Long.MAX_VALUE ? "RV Nested Prefetch" : "RV Nested Prefetch forced - needed next frame");
                recyclerView.f2488j0.f(recyclerView.f2493m);
                for (int i10 = 0; i10 < bVar.f2804d * 2; i10 += 2) {
                    i(recyclerView, bVar.f2803c[i10], j10);
                }
                Trace.endSection();
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }
    }

    public final RecyclerView.g0 i(RecyclerView recyclerView, int i10, long j10) {
        if (e(recyclerView, i10)) {
            return null;
        }
        RecyclerView.x xVar = recyclerView.f2473c;
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
        RecyclerView.g0 g0VarN = xVar.N(i10, false, j10);
        if (g0VarN != null) {
            if (!g0VarN.t() || g0VarN.u()) {
                xVar.a(g0VarN, false);
            } else {
                xVar.G(g0VarN.f2564a);
            }
        }
        return g0VarN;
    }

    public void j(RecyclerView recyclerView) {
        boolean zRemove = this.f2799a.remove(recyclerView);
        if (RecyclerView.F0 && !zRemove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Trace.beginSection("RV Prefetch");
            if (!this.f2799a.isEmpty()) {
                int size = this.f2799a.size();
                long jMax = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    RecyclerView recyclerView = this.f2799a.get(i10);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f2800c);
                }
            }
        } finally {
            this.b = 0L;
            Trace.endSection();
        }
    }
}
