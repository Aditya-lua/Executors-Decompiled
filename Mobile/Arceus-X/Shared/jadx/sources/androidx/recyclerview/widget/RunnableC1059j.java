package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import p456u2.C11786o;

/* JADX INFO: renamed from: androidx.recyclerview.widget.j */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1059j implements Runnable {

    /* JADX INFO: renamed from: e */
    public static final ThreadLocal<RunnableC1059j> f4280e = new ThreadLocal<>();

    /* JADX INFO: renamed from: f */
    public static Comparator<c> f4281f = new a();

    /* JADX INFO: renamed from: b */
    public long f4283b;

    /* JADX INFO: renamed from: c */
    public long f4284c;

    /* JADX INFO: renamed from: a */
    public ArrayList<RecyclerView> f4282a = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public final ArrayList<c> f4285d = new ArrayList<>();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.j$a */
    public class a implements Comparator<c> {
        /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.f4293d;
            if ((recyclerView == null) != (cVar2.f4293d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z10 = cVar.f4290a;
            if (z10 != cVar2.f4290a) {
                return z10 ? -1 : 1;
            }
            int i10 = cVar2.f4291b - cVar.f4291b;
            if (i10 != 0) {
                return i10;
            }
            int i11 = cVar.f4292c - cVar2.f4292c;
            if (i11 != 0) {
                return i11;
            }
            return 0;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.j$b */
    @SuppressLint({"VisibleForTests"})
    public static class b implements RecyclerView.AbstractC1034q.c {

        /* JADX INFO: renamed from: a */
        public int f4286a;

        /* JADX INFO: renamed from: b */
        public int f4287b;

        /* JADX INFO: renamed from: c */
        public int[] f4288c;

        /* JADX INFO: renamed from: d */
        public int f4289d;

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q.c
        /* JADX INFO: renamed from: a */
        public void mo5647a(int i10, int i11) {
            if (i10 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i11 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i12 = this.f4289d;
            int i13 = i12 * 2;
            int[] iArr = this.f4288c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f4288c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i13 >= iArr.length) {
                int[] iArr3 = new int[i12 * 4];
                this.f4288c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f4288c;
            iArr4[i13] = i10;
            iArr4[i13 + 1] = i11;
            this.f4289d++;
        }

        /* JADX INFO: renamed from: b */
        public void m5980b() {
            int[] iArr = this.f4288c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f4289d = 0;
        }

        /* JADX INFO: renamed from: c */
        public void m5981c(RecyclerView recyclerView, boolean z10) {
            this.f4289d = 0;
            int[] iArr = this.f4288c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.AbstractC1034q abstractC1034q = recyclerView.f3909n;
            if (recyclerView.f3907m == null || abstractC1034q == null || !abstractC1034q.m5638y0()) {
                return;
            }
            if (z10) {
                if (!recyclerView.f3891e.m5844p()) {
                    abstractC1034q.mo5198u(recyclerView.f3907m.mo5473e(), this);
                }
            } else if (!recyclerView.m5350v0()) {
                abstractC1034q.mo5197t(this.f4286a, this.f4287b, recyclerView.f3902j0, this);
            }
            int i10 = this.f4289d;
            if (i10 > abstractC1034q.f4031m) {
                abstractC1034q.f4031m = i10;
                abstractC1034q.f4032n = z10;
                recyclerView.f3887c.m5690P();
            }
        }

        /* JADX INFO: renamed from: d */
        public boolean m5982d(int i10) {
            if (this.f4288c != null) {
                int i11 = this.f4289d * 2;
                for (int i12 = 0; i12 < i11; i12 += 2) {
                    if (this.f4288c[i12] == i10) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: e */
        public void m5983e(int i10, int i11) {
            this.f4286a = i10;
            this.f4287b = i11;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.j$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public boolean f4290a;

        /* JADX INFO: renamed from: b */
        public int f4291b;

        /* JADX INFO: renamed from: c */
        public int f4292c;

        /* JADX INFO: renamed from: d */
        public RecyclerView f4293d;

        /* JADX INFO: renamed from: e */
        public int f4294e;

        /* JADX INFO: renamed from: a */
        public void m5984a() {
            this.f4290a = false;
            this.f4291b = 0;
            this.f4292c = 0;
            this.f4293d = null;
            this.f4294e = 0;
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m5969e(RecyclerView recyclerView, int i10) {
        int iM5884j = recyclerView.f3893f.m5884j();
        for (int i11 = 0; i11 < iM5884j; i11++) {
            RecyclerView.AbstractC1023f0 abstractC1023f0M5232n0 = RecyclerView.m5232n0(recyclerView.f3893f.m5883i(i11));
            if (abstractC1023f0M5232n0.f3983c == i10 && !abstractC1023f0M5232n0.m5452u()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public void m5970a(RecyclerView recyclerView) {
        if (RecyclerView.f3845F0 && this.f4282a.contains(recyclerView)) {
            throw new IllegalStateException("RecyclerView already present in worker list!");
        }
        this.f4282a.add(recyclerView);
    }

    /* JADX INFO: renamed from: b */
    public final void m5971b() {
        c cVar;
        int size = this.f4282a.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView = this.f4282a.get(i11);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f3900i0.m5981c(recyclerView, false);
                i10 += recyclerView.f3900i0.f4289d;
            }
        }
        this.f4285d.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView2 = this.f4282a.get(i13);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.f3900i0;
                int iAbs = Math.abs(bVar.f4286a) + Math.abs(bVar.f4287b);
                for (int i14 = 0; i14 < bVar.f4289d * 2; i14 += 2) {
                    if (i12 >= this.f4285d.size()) {
                        cVar = new c();
                        this.f4285d.add(cVar);
                    } else {
                        cVar = this.f4285d.get(i12);
                    }
                    int[] iArr = bVar.f4288c;
                    int i15 = iArr[i14 + 1];
                    cVar.f4290a = i15 <= iAbs;
                    cVar.f4291b = iAbs;
                    cVar.f4292c = i15;
                    cVar.f4293d = recyclerView2;
                    cVar.f4294e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(this.f4285d, f4281f);
    }

    /* JADX INFO: renamed from: c */
    public final void m5972c(c cVar, long j10) {
        RecyclerView.AbstractC1023f0 abstractC1023f0M5977i = m5977i(cVar.f4293d, cVar.f4294e, cVar.f4290a ? Long.MAX_VALUE : j10);
        if (abstractC1023f0M5977i == null || abstractC1023f0M5977i.f3982b == null || !abstractC1023f0M5977i.m5451t() || abstractC1023f0M5977i.m5452u()) {
            return;
        }
        m5976h(abstractC1023f0M5977i.f3982b.get(), j10);
    }

    /* JADX INFO: renamed from: d */
    public final void m5973d(long j10) {
        for (int i10 = 0; i10 < this.f4285d.size(); i10++) {
            c cVar = this.f4285d.get(i10);
            if (cVar.f4293d == null) {
                return;
            }
            m5972c(cVar, j10);
            cVar.m5984a();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m5974f(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.isAttachedToWindow()) {
            if (RecyclerView.f3845F0 && !this.f4282a.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f4283b == 0) {
                this.f4283b = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        recyclerView.f3900i0.m5983e(i10, i11);
    }

    /* JADX INFO: renamed from: g */
    public void m5975g(long j10) {
        m5971b();
        m5973d(j10);
    }

    /* JADX INFO: renamed from: h */
    public final void m5976h(RecyclerView recyclerView, long j10) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.f3865F && recyclerView.f3893f.m5884j() != 0) {
            recyclerView.m5311g1();
        }
        b bVar = recyclerView.f3900i0;
        bVar.m5981c(recyclerView, true);
        if (bVar.f4289d != 0) {
            try {
                Trace.beginSection(j10 == Long.MAX_VALUE ? "RV Nested Prefetch" : "RV Nested Prefetch forced - needed next frame");
                recyclerView.f3902j0.m5396f(recyclerView.f3907m);
                for (int i10 = 0; i10 < bVar.f4289d * 2; i10 += 2) {
                    m5977i(recyclerView, bVar.f4288c[i10], j10);
                }
                Trace.endSection();
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final RecyclerView.AbstractC1023f0 m5977i(RecyclerView recyclerView, int i10, long j10) {
        if (m5969e(recyclerView, i10)) {
            return null;
        }
        RecyclerView.C1041x c1041x = recyclerView.f3887c;
        if (j10 == Long.MAX_VALUE) {
            try {
                if (C11786o.m44083c()) {
                    Trace.beginSection("RV Prefetch forced - needed next frame");
                }
            } finally {
                recyclerView.m5284S0(false);
                Trace.endSection();
            }
        }
        recyclerView.m5280Q0();
        RecyclerView.AbstractC1023f0 abstractC1023f0M5688N = c1041x.m5688N(i10, false, j10);
        if (abstractC1023f0M5688N != null) {
            if (!abstractC1023f0M5688N.m5451t() || abstractC1023f0M5688N.m5452u()) {
                c1041x.m5693a(abstractC1023f0M5688N, false);
            } else {
                c1041x.m5681G(abstractC1023f0M5688N.f3981a);
            }
        }
        return abstractC1023f0M5688N;
    }

    /* JADX INFO: renamed from: j */
    public void m5978j(RecyclerView recyclerView) {
        boolean zRemove = this.f4282a.remove(recyclerView);
        if (RecyclerView.f3845F0 && !zRemove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Trace.beginSection("RV Prefetch");
            if (!this.f4282a.isEmpty()) {
                int size = this.f4282a.size();
                long jMax = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    RecyclerView recyclerView = this.f4282a.get(i10);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    m5975g(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f4284c);
                }
            }
        } finally {
            this.f4283b = 0L;
            Trace.endSection();
        }
    }
}
