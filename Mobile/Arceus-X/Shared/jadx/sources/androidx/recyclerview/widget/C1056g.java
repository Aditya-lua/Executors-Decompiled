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
import p507w4.C12306a;
import p507w4.InterfaceC12307b;

/* JADX INFO: renamed from: androidx.recyclerview.widget.g */
/* JADX INFO: loaded from: classes.dex */
public class C1056g {

    /* JADX INFO: renamed from: a */
    public static final Comparator<d> f4215a = new a();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.g$a */
    public class a implements Comparator<d> {
        /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(d dVar, d dVar2) {
            return dVar.f4218a - dVar2.f4218a;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.g$b */
    public static abstract class b {
        /* JADX INFO: renamed from: a */
        public abstract boolean mo5869a(int i10, int i11);

        /* JADX INFO: renamed from: b */
        public abstract boolean mo5870b(int i10, int i11);

        /* JADX INFO: renamed from: c */
        public Object mo5871c(int i10, int i11) {
            return null;
        }

        /* JADX INFO: renamed from: d */
        public abstract int mo5872d();

        /* JADX INFO: renamed from: e */
        public abstract int mo5873e();
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.g$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public final int[] f4216a;

        /* JADX INFO: renamed from: b */
        public final int f4217b;

        public c(int i10) {
            int[] iArr = new int[i10];
            this.f4216a = iArr;
            this.f4217b = iArr.length / 2;
        }

        /* JADX INFO: renamed from: a */
        public int[] m5923a() {
            return this.f4216a;
        }

        /* JADX INFO: renamed from: b */
        public int m5924b(int i10) {
            return this.f4216a[i10 + this.f4217b];
        }

        /* JADX INFO: renamed from: c */
        public void m5925c(int i10, int i11) {
            this.f4216a[i10 + this.f4217b] = i11;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.g$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        public final int f4218a;

        /* JADX INFO: renamed from: b */
        public final int f4219b;

        /* JADX INFO: renamed from: c */
        public final int f4220c;

        public d(int i10, int i11, int i12) {
            this.f4218a = i10;
            this.f4219b = i11;
            this.f4220c = i12;
        }

        /* JADX INFO: renamed from: a */
        public int m5926a() {
            return this.f4218a + this.f4220c;
        }

        /* JADX INFO: renamed from: b */
        public int m5927b() {
            return this.f4219b + this.f4220c;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.g$e */
    public static class e {

        /* JADX INFO: renamed from: a */
        public final List<d> f4221a;

        /* JADX INFO: renamed from: b */
        public final int[] f4222b;

        /* JADX INFO: renamed from: c */
        public final int[] f4223c;

        /* JADX INFO: renamed from: d */
        public final b f4224d;

        /* JADX INFO: renamed from: e */
        public final int f4225e;

        /* JADX INFO: renamed from: f */
        public final int f4226f;

        /* JADX INFO: renamed from: g */
        public final boolean f4227g;

        public e(b bVar, List<d> list, int[] iArr, int[] iArr2, boolean z10) {
            this.f4221a = list;
            this.f4222b = iArr;
            this.f4223c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f4224d = bVar;
            this.f4225e = bVar.mo5873e();
            this.f4226f = bVar.mo5872d();
            this.f4227g = z10;
            m5929a();
            m5933e();
        }

        /* JADX INFO: renamed from: g */
        public static g m5928g(Collection<g> collection, int i10, boolean z10) {
            g next;
            Iterator<g> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.f4228a == i10 && next.f4230c == z10) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                g next2 = it.next();
                if (z10) {
                    next2.f4229b--;
                } else {
                    next2.f4229b++;
                }
            }
            return next;
        }

        /* JADX INFO: renamed from: a */
        public final void m5929a() {
            d dVar = this.f4221a.isEmpty() ? null : this.f4221a.get(0);
            if (dVar == null || dVar.f4218a != 0 || dVar.f4219b != 0) {
                this.f4221a.add(0, new d(0, 0, 0));
            }
            this.f4221a.add(new d(this.f4225e, this.f4226f, 0));
        }

        /* JADX INFO: renamed from: b */
        public void m5930b(@NonNull RecyclerView.AbstractC1025h abstractC1025h) {
            m5931c(new C1051b(abstractC1025h));
        }

        /* JADX INFO: renamed from: c */
        public void m5931c(@NonNull InterfaceC12307b interfaceC12307b) {
            int i10;
            C12306a c12306a = interfaceC12307b instanceof C12306a ? (C12306a) interfaceC12307b : new C12306a(interfaceC12307b);
            int i11 = this.f4225e;
            ArrayDeque arrayDeque = new ArrayDeque();
            int i12 = this.f4225e;
            int i13 = this.f4226f;
            for (int size = this.f4221a.size() - 1; size >= 0; size--) {
                d dVar = this.f4221a.get(size);
                int iM5926a = dVar.m5926a();
                int iM5927b = dVar.m5927b();
                while (true) {
                    if (i12 <= iM5926a) {
                        break;
                    }
                    i12--;
                    int i14 = this.f4222b[i12];
                    if ((i14 & 12) != 0) {
                        int i15 = i14 >> 4;
                        g gVarM5928g = m5928g(arrayDeque, i15, false);
                        if (gVarM5928g != null) {
                            int i16 = (i11 - gVarM5928g.f4229b) - 1;
                            c12306a.mo5859d(i12, i16);
                            if ((i14 & 4) != 0) {
                                c12306a.mo5858c(i16, 1, this.f4224d.mo5871c(i12, i15));
                            }
                        } else {
                            arrayDeque.add(new g(i12, (i11 - i12) - 1, true));
                        }
                    } else {
                        c12306a.mo5857b(i12, 1);
                        i11--;
                    }
                }
                while (i13 > iM5927b) {
                    i13--;
                    int i17 = this.f4223c[i13];
                    if ((i17 & 12) != 0) {
                        int i18 = i17 >> 4;
                        g gVarM5928g2 = m5928g(arrayDeque, i18, true);
                        if (gVarM5928g2 == null) {
                            arrayDeque.add(new g(i13, i11 - i12, false));
                        } else {
                            c12306a.mo5859d((i11 - gVarM5928g2.f4229b) - 1, i12);
                            if ((i17 & 4) != 0) {
                                c12306a.mo5858c(i12, 1, this.f4224d.mo5871c(i18, i13));
                            }
                        }
                    } else {
                        c12306a.mo5856a(i12, 1);
                        i11++;
                    }
                }
                int i19 = dVar.f4218a;
                int i20 = dVar.f4219b;
                for (i10 = 0; i10 < dVar.f4220c; i10++) {
                    if ((this.f4222b[i19] & 15) == 2) {
                        c12306a.mo5858c(i19, 1, this.f4224d.mo5871c(i19, i20));
                    }
                    i19++;
                    i20++;
                }
                i12 = dVar.f4218a;
                i13 = dVar.f4219b;
            }
            c12306a.m45756e();
        }

        /* JADX INFO: renamed from: d */
        public final void m5932d(int i10) {
            int size = this.f4221a.size();
            int iM5927b = 0;
            for (int i11 = 0; i11 < size; i11++) {
                d dVar = this.f4221a.get(i11);
                while (iM5927b < dVar.f4219b) {
                    if (this.f4223c[iM5927b] == 0 && this.f4224d.mo5870b(i10, iM5927b)) {
                        int i12 = this.f4224d.mo5869a(i10, iM5927b) ? 8 : 4;
                        this.f4222b[i10] = (iM5927b << 4) | i12;
                        this.f4223c[iM5927b] = (i10 << 4) | i12;
                        return;
                    }
                    iM5927b++;
                }
                iM5927b = dVar.m5927b();
            }
        }

        /* JADX INFO: renamed from: e */
        public final void m5933e() {
            for (d dVar : this.f4221a) {
                for (int i10 = 0; i10 < dVar.f4220c; i10++) {
                    int i11 = dVar.f4218a + i10;
                    int i12 = dVar.f4219b + i10;
                    int i13 = this.f4224d.mo5869a(i11, i12) ? 1 : 2;
                    this.f4222b[i11] = (i12 << 4) | i13;
                    this.f4223c[i12] = (i11 << 4) | i13;
                }
            }
            if (this.f4227g) {
                m5934f();
            }
        }

        /* JADX INFO: renamed from: f */
        public final void m5934f() {
            int iM5926a = 0;
            for (d dVar : this.f4221a) {
                while (iM5926a < dVar.f4218a) {
                    if (this.f4222b[iM5926a] == 0) {
                        m5932d(iM5926a);
                    }
                    iM5926a++;
                }
                iM5926a = dVar.m5926a();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.g$f */
    public static abstract class f<T> {
        /* JADX INFO: renamed from: a */
        public abstract boolean mo5935a(@NonNull T t8, @NonNull T t10);

        /* JADX INFO: renamed from: b */
        public abstract boolean mo5936b(@NonNull T t8, @NonNull T t10);

        /* JADX INFO: renamed from: c */
        public Object mo5937c(@NonNull T t8, @NonNull T t10) {
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.g$g */
    public static class g {

        /* JADX INFO: renamed from: a */
        public int f4228a;

        /* JADX INFO: renamed from: b */
        public int f4229b;

        /* JADX INFO: renamed from: c */
        public boolean f4230c;

        public g(int i10, int i11, boolean z10) {
            this.f4228a = i10;
            this.f4229b = i11;
            this.f4230c = z10;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.g$h */
    public static class h {

        /* JADX INFO: renamed from: a */
        public int f4231a;

        /* JADX INFO: renamed from: b */
        public int f4232b;

        /* JADX INFO: renamed from: c */
        public int f4233c;

        /* JADX INFO: renamed from: d */
        public int f4234d;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public h() {
        }

        /* JADX INFO: renamed from: a */
        public int m5938a() {
            return this.f4234d - this.f4233c;
        }

        /* JADX INFO: renamed from: b */
        public int m5939b() {
            return this.f4232b - this.f4231a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public h(int i10, int i11, int i12, int i13) {
            this.f4231a = i10;
            this.f4232b = i11;
            this.f4233c = i12;
            this.f4234d = i13;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.g$i */
    public static class i {

        /* JADX INFO: renamed from: a */
        public int f4235a;

        /* JADX INFO: renamed from: b */
        public int f4236b;

        /* JADX INFO: renamed from: c */
        public int f4237c;

        /* JADX INFO: renamed from: d */
        public int f4238d;

        /* JADX INFO: renamed from: e */
        public boolean f4239e;

        /* JADX INFO: renamed from: a */
        public int m5940a() {
            return Math.min(this.f4237c - this.f4235a, this.f4238d - this.f4236b);
        }

        /* JADX INFO: renamed from: b */
        public boolean m5941b() {
            return this.f4238d - this.f4236b != this.f4237c - this.f4235a;
        }

        /* JADX INFO: renamed from: c */
        public boolean m5942c() {
            return this.f4238d - this.f4236b > this.f4237c - this.f4235a;
        }

        @NonNull
        /* JADX INFO: renamed from: d */
        public d m5943d() {
            if (!m5941b()) {
                int i10 = this.f4235a;
                return new d(i10, this.f4236b, this.f4237c - i10);
            }
            if (this.f4239e) {
                return new d(this.f4235a, this.f4236b, m5940a());
            }
            return m5942c() ? new d(this.f4235a, this.f4236b + 1, m5940a()) : new d(this.f4235a + 1, this.f4236b, m5940a());
        }
    }

    /* JADX INFO: renamed from: a */
    public static i m5917a(h hVar, b bVar, c cVar, c cVar2, int i10) {
        int iM5924b;
        int i11;
        int i12;
        boolean z10 = (hVar.m5939b() - hVar.m5938a()) % 2 == 0;
        int iM5939b = hVar.m5939b() - hVar.m5938a();
        int i13 = -i10;
        for (int i14 = i13; i14 <= i10; i14 += 2) {
            if (i14 == i13 || (i14 != i10 && cVar2.m5924b(i14 + 1) < cVar2.m5924b(i14 - 1))) {
                iM5924b = cVar2.m5924b(i14 + 1);
                i11 = iM5924b;
            } else {
                iM5924b = cVar2.m5924b(i14 - 1);
                i11 = iM5924b - 1;
            }
            int i15 = hVar.f4234d - ((hVar.f4232b - i11) - i14);
            int i16 = (i10 == 0 || i11 != iM5924b) ? i15 : i15 + 1;
            while (i11 > hVar.f4231a && i15 > hVar.f4233c && bVar.mo5870b(i11 - 1, i15 - 1)) {
                i11--;
                i15--;
            }
            cVar2.m5925c(i14, i11);
            if (z10 && (i12 = iM5939b - i14) >= i13 && i12 <= i10 && cVar.m5924b(i12) >= i11) {
                i iVar = new i();
                iVar.f4235a = i11;
                iVar.f4236b = i15;
                iVar.f4237c = iM5924b;
                iVar.f4238d = i16;
                iVar.f4239e = true;
                return iVar;
            }
        }
        return null;
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static e m5918b(@NonNull b bVar) {
        return m5919c(bVar, true);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static e m5919c(@NonNull b bVar, boolean z10) {
        int iMo5873e = bVar.mo5873e();
        int iMo5872d = bVar.mo5872d();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new h(0, iMo5873e, 0, iMo5872d));
        int i10 = ((((iMo5873e + iMo5872d) + 1) / 2) * 2) + 1;
        c cVar = new c(i10);
        c cVar2 = new c(i10);
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            h hVar = (h) arrayList2.remove(arrayList2.size() - 1);
            i iVarM5921e = m5921e(hVar, bVar, cVar, cVar2);
            if (iVarM5921e != null) {
                if (iVarM5921e.m5940a() > 0) {
                    arrayList.add(iVarM5921e.m5943d());
                }
                h hVar2 = arrayList3.isEmpty() ? new h() : (h) arrayList3.remove(arrayList3.size() - 1);
                hVar2.f4231a = hVar.f4231a;
                hVar2.f4233c = hVar.f4233c;
                hVar2.f4232b = iVarM5921e.f4235a;
                hVar2.f4234d = iVarM5921e.f4236b;
                arrayList2.add(hVar2);
                hVar.f4232b = hVar.f4232b;
                hVar.f4234d = hVar.f4234d;
                hVar.f4231a = iVarM5921e.f4237c;
                hVar.f4233c = iVarM5921e.f4238d;
                arrayList2.add(hVar);
            } else {
                arrayList3.add(hVar);
            }
        }
        Collections.sort(arrayList, f4215a);
        return new e(bVar, arrayList, cVar.m5923a(), cVar2.m5923a(), z10);
    }

    /* JADX INFO: renamed from: d */
    public static i m5920d(h hVar, b bVar, c cVar, c cVar2, int i10) {
        int iM5924b;
        int i11;
        int i12;
        boolean z10 = Math.abs(hVar.m5939b() - hVar.m5938a()) % 2 == 1;
        int iM5939b = hVar.m5939b() - hVar.m5938a();
        int i13 = -i10;
        for (int i14 = i13; i14 <= i10; i14 += 2) {
            if (i14 == i13 || (i14 != i10 && cVar.m5924b(i14 + 1) > cVar.m5924b(i14 - 1))) {
                iM5924b = cVar.m5924b(i14 + 1);
                i11 = iM5924b;
            } else {
                iM5924b = cVar.m5924b(i14 - 1);
                i11 = iM5924b + 1;
            }
            int i15 = (hVar.f4233c + (i11 - hVar.f4231a)) - i14;
            int i16 = (i10 == 0 || i11 != iM5924b) ? i15 : i15 - 1;
            while (i11 < hVar.f4232b && i15 < hVar.f4234d && bVar.mo5870b(i11, i15)) {
                i11++;
                i15++;
            }
            cVar.m5925c(i14, i11);
            if (z10 && (i12 = iM5939b - i14) >= i13 + 1 && i12 <= i10 - 1 && cVar2.m5924b(i12) <= i11) {
                i iVar = new i();
                iVar.f4235a = iM5924b;
                iVar.f4236b = i16;
                iVar.f4237c = i11;
                iVar.f4238d = i15;
                iVar.f4239e = false;
                return iVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static i m5921e(h hVar, b bVar, c cVar, c cVar2) {
        if (hVar.m5939b() >= 1 && hVar.m5938a() >= 1) {
            int iM5939b = ((hVar.m5939b() + hVar.m5938a()) + 1) / 2;
            cVar.m5925c(1, hVar.f4231a);
            cVar2.m5925c(1, hVar.f4232b);
            for (int i10 = 0; i10 < iM5939b; i10++) {
                i iVarM5920d = m5920d(hVar, bVar, cVar, cVar2, i10);
                if (iVarM5920d != null) {
                    return iVarM5920d;
                }
                i iVarM5917a = m5917a(hVar, bVar, cVar, cVar2, i10);
                if (iVarM5917a != null) {
                    return iVarM5917a;
                }
            }
        }
        return null;
    }
}
