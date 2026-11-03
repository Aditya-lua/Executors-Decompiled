package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Comparator<d> f3044a = new a();

    public class a implements Comparator<d> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(d dVar, d dVar2) {
            return dVar.f3046a - dVar2.f3046a;
        }
    }

    public static abstract class b {
        public abstract boolean a(int i10, int i11);

        public abstract boolean b(int i10, int i11);

        public Object c(int i10, int i11) {
            return null;
        }

        public abstract int d();

        public abstract int e();
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f3045a;
        public final int b;

        public c(int i10) {
            int[] iArr = new int[i10];
            this.f3045a = iArr;
            this.b = iArr.length / 2;
        }

        public int[] a() {
            return this.f3045a;
        }

        public int b(int i10) {
            return this.f3045a[i10 + this.b];
        }

        public void c(int i10, int i11) {
            this.f3045a[i10 + this.b] = i11;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f3046a;
        public final int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f3047c;

        public d(int i10, int i11, int i12) {
            this.f3046a = i10;
            this.b = i11;
            this.f3047c = i12;
        }

        public int a() {
            return this.f3046a + this.f3047c;
        }

        public int b() {
            return this.b + this.f3047c;
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<d> f3048a;
        public final int[] b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f3049c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final b f3050d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f3051e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f3052f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f3053g;

        public e(b bVar, List<d> list, int[] iArr, int[] iArr2, boolean z10) {
            this.f3048a = list;
            this.b = iArr;
            this.f3049c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f3050d = bVar;
            this.f3051e = bVar.e();
            this.f3052f = bVar.d();
            this.f3053g = z10;
            a();
            e();
        }

        public static C0051g g(Collection<C0051g> collection, int i10, boolean z10) {
            C0051g next;
            Iterator<C0051g> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.f3054a == i10 && next.f3055c == z10) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                C0051g next2 = it.next();
                if (z10) {
                    next2.b--;
                } else {
                    next2.b++;
                }
            }
            return next;
        }

        public final void a() {
            d dVar = this.f3048a.isEmpty() ? null : this.f3048a.get(0);
            if (dVar == null || dVar.f3046a != 0 || dVar.b != 0) {
                this.f3048a.add(0, new d(0, 0, 0));
            }
            this.f3048a.add(new d(this.f3051e, this.f3052f, 0));
        }

        public void b(@NonNull RecyclerView.h hVar) {
            c(new androidx.recyclerview.widget.b(hVar));
        }

        public void c(@NonNull w4.b bVar) {
            int i10;
            w4.a aVar = bVar instanceof w4.a ? (w4.a) bVar : new w4.a(bVar);
            int i11 = this.f3051e;
            ArrayDeque arrayDeque = new ArrayDeque();
            int i12 = this.f3051e;
            int i13 = this.f3052f;
            for (int size = this.f3048a.size() - 1; size >= 0; size--) {
                d dVar = this.f3048a.get(size);
                int iA = dVar.a();
                int iB = dVar.b();
                while (true) {
                    if (i12 <= iA) {
                        break;
                    }
                    i12--;
                    int i14 = this.b[i12];
                    if ((i14 & 12) != 0) {
                        int i15 = i14 >> 4;
                        C0051g c0051gG = g(arrayDeque, i15, false);
                        if (c0051gG != null) {
                            int i16 = (i11 - c0051gG.b) - 1;
                            aVar.d(i12, i16);
                            if ((i14 & 4) != 0) {
                                aVar.c(i16, 1, this.f3050d.c(i12, i15));
                            }
                        } else {
                            arrayDeque.add(new C0051g(i12, (i11 - i12) - 1, true));
                        }
                    } else {
                        aVar.b(i12, 1);
                        i11--;
                    }
                }
                while (i13 > iB) {
                    i13--;
                    int i17 = this.f3049c[i13];
                    if ((i17 & 12) != 0) {
                        int i18 = i17 >> 4;
                        C0051g c0051gG2 = g(arrayDeque, i18, true);
                        if (c0051gG2 == null) {
                            arrayDeque.add(new C0051g(i13, i11 - i12, false));
                        } else {
                            aVar.d((i11 - c0051gG2.b) - 1, i12);
                            if ((i17 & 4) != 0) {
                                aVar.c(i12, 1, this.f3050d.c(i18, i13));
                            }
                        }
                    } else {
                        aVar.a(i12, 1);
                        i11++;
                    }
                }
                int i19 = dVar.f3046a;
                int i20 = dVar.b;
                for (i10 = 0; i10 < dVar.f3047c; i10++) {
                    if ((this.b[i19] & 15) == 2) {
                        aVar.c(i19, 1, this.f3050d.c(i19, i20));
                    }
                    i19++;
                    i20++;
                }
                i12 = dVar.f3046a;
                i13 = dVar.b;
            }
            aVar.e();
        }

        public final void d(int i10) {
            int size = this.f3048a.size();
            int iB = 0;
            for (int i11 = 0; i11 < size; i11++) {
                d dVar = this.f3048a.get(i11);
                while (iB < dVar.b) {
                    if (this.f3049c[iB] == 0 && this.f3050d.b(i10, iB)) {
                        int i12 = this.f3050d.a(i10, iB) ? 8 : 4;
                        this.b[i10] = (iB << 4) | i12;
                        this.f3049c[iB] = (i10 << 4) | i12;
                        return;
                    }
                    iB++;
                }
                iB = dVar.b();
            }
        }

        public final void e() {
            for (d dVar : this.f3048a) {
                for (int i10 = 0; i10 < dVar.f3047c; i10++) {
                    int i11 = dVar.f3046a + i10;
                    int i12 = dVar.b + i10;
                    int i13 = this.f3050d.a(i11, i12) ? 1 : 2;
                    this.b[i11] = (i12 << 4) | i13;
                    this.f3049c[i12] = (i11 << 4) | i13;
                }
            }
            if (this.f3053g) {
                f();
            }
        }

        public final void f() {
            int iA = 0;
            for (d dVar : this.f3048a) {
                while (iA < dVar.f3046a) {
                    if (this.b[iA] == 0) {
                        d(iA);
                    }
                    iA++;
                }
                iA = dVar.a();
            }
        }
    }

    public static abstract class f<T> {
        public abstract boolean a(@NonNull T t8, @NonNull T t10);

        public abstract boolean b(@NonNull T t8, @NonNull T t10);

        public Object c(@NonNull T t8, @NonNull T t10) {
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.g$g, reason: collision with other inner class name */
    public static class C0051g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3054a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f3055c;

        public C0051g(int i10, int i11, boolean z10) {
            this.f3054a = i10;
            this.b = i11;
            this.f3055c = z10;
        }
    }

    public static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3056a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f3057c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f3058d;

        public h() {
        }

        public int a() {
            return this.f3058d - this.f3057c;
        }

        public int b() {
            return this.b - this.f3056a;
        }

        public h(int i10, int i11, int i12, int i13) {
            this.f3056a = i10;
            this.b = i11;
            this.f3057c = i12;
            this.f3058d = i13;
        }
    }

    public static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3059a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f3060c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f3061d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f3062e;

        public int a() {
            return Math.min(this.f3060c - this.f3059a, this.f3061d - this.b);
        }

        public boolean b() {
            return this.f3061d - this.b != this.f3060c - this.f3059a;
        }

        public boolean c() {
            return this.f3061d - this.b > this.f3060c - this.f3059a;
        }

        @NonNull
        public d d() {
            if (!b()) {
                int i10 = this.f3059a;
                return new d(i10, this.b, this.f3060c - i10);
            }
            if (this.f3062e) {
                return new d(this.f3059a, this.b, a());
            }
            return c() ? new d(this.f3059a, this.b + 1, a()) : new d(this.f3059a + 1, this.b, a());
        }
    }

    public static i a(h hVar, b bVar, c cVar, c cVar2, int i10) {
        int iB;
        int i11;
        int i12;
        boolean z10 = (hVar.b() - hVar.a()) % 2 == 0;
        int iB2 = hVar.b() - hVar.a();
        int i13 = -i10;
        for (int i14 = i13; i14 <= i10; i14 += 2) {
            if (i14 == i13 || (i14 != i10 && cVar2.b(i14 + 1) < cVar2.b(i14 - 1))) {
                iB = cVar2.b(i14 + 1);
                i11 = iB;
            } else {
                iB = cVar2.b(i14 - 1);
                i11 = iB - 1;
            }
            int i15 = hVar.f3058d - ((hVar.b - i11) - i14);
            int i16 = (i10 == 0 || i11 != iB) ? i15 : i15 + 1;
            while (i11 > hVar.f3056a && i15 > hVar.f3057c && bVar.b(i11 - 1, i15 - 1)) {
                i11--;
                i15--;
            }
            cVar2.c(i14, i11);
            if (z10 && (i12 = iB2 - i14) >= i13 && i12 <= i10 && cVar.b(i12) >= i11) {
                i iVar = new i();
                iVar.f3059a = i11;
                iVar.b = i15;
                iVar.f3060c = iB;
                iVar.f3061d = i16;
                iVar.f3062e = true;
                return iVar;
            }
        }
        return null;
    }

    @NonNull
    public static e b(@NonNull b bVar) {
        return c(bVar, true);
    }

    @NonNull
    public static e c(@NonNull b bVar, boolean z10) {
        int iE = bVar.e();
        int iD = bVar.d();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new h(0, iE, 0, iD));
        int i10 = ((((iE + iD) + 1) / 2) * 2) + 1;
        c cVar = new c(i10);
        c cVar2 = new c(i10);
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            h hVar = (h) arrayList2.remove(arrayList2.size() - 1);
            i iVarE = e(hVar, bVar, cVar, cVar2);
            if (iVarE != null) {
                if (iVarE.a() > 0) {
                    arrayList.add(iVarE.d());
                }
                h hVar2 = arrayList3.isEmpty() ? new h() : (h) arrayList3.remove(arrayList3.size() - 1);
                hVar2.f3056a = hVar.f3056a;
                hVar2.f3057c = hVar.f3057c;
                hVar2.b = iVarE.f3059a;
                hVar2.f3058d = iVarE.b;
                arrayList2.add(hVar2);
                hVar.b = hVar.b;
                hVar.f3058d = hVar.f3058d;
                hVar.f3056a = iVarE.f3060c;
                hVar.f3057c = iVarE.f3061d;
                arrayList2.add(hVar);
            } else {
                arrayList3.add(hVar);
            }
        }
        Collections.sort(arrayList, f3044a);
        return new e(bVar, arrayList, cVar.a(), cVar2.a(), z10);
    }

    public static i d(h hVar, b bVar, c cVar, c cVar2, int i10) {
        int iB;
        int i11;
        int i12;
        boolean z10 = Math.abs(hVar.b() - hVar.a()) % 2 == 1;
        int iB2 = hVar.b() - hVar.a();
        int i13 = -i10;
        for (int i14 = i13; i14 <= i10; i14 += 2) {
            if (i14 == i13 || (i14 != i10 && cVar.b(i14 + 1) > cVar.b(i14 - 1))) {
                iB = cVar.b(i14 + 1);
                i11 = iB;
            } else {
                iB = cVar.b(i14 - 1);
                i11 = iB + 1;
            }
            int i15 = (hVar.f3057c + (i11 - hVar.f3056a)) - i14;
            int i16 = (i10 == 0 || i11 != iB) ? i15 : i15 - 1;
            while (i11 < hVar.b && i15 < hVar.f3058d && bVar.b(i11, i15)) {
                i11++;
                i15++;
            }
            cVar.c(i14, i11);
            if (z10 && (i12 = iB2 - i14) >= i13 + 1 && i12 <= i10 - 1 && cVar2.b(i12) <= i11) {
                i iVar = new i();
                iVar.f3059a = iB;
                iVar.b = i16;
                iVar.f3060c = i11;
                iVar.f3061d = i15;
                iVar.f3062e = false;
                return iVar;
            }
        }
        return null;
    }

    public static i e(h hVar, b bVar, c cVar, c cVar2) {
        if (hVar.b() >= 1 && hVar.a() >= 1) {
            int iB = ((hVar.b() + hVar.a()) + 1) / 2;
            cVar.c(1, hVar.f3056a);
            cVar2.c(1, hVar.b);
            for (int i10 = 0; i10 < iB; i10++) {
                i iVarD = d(hVar, bVar, cVar, cVar2, i10);
                if (iVarD != null) {
                    return iVarD;
                }
                i iVarA = a(hVar, bVar, cVar, cVar2, i10);
                if (iVarA != null) {
                    return iVarA;
                }
            }
        }
        return null;
    }
}
