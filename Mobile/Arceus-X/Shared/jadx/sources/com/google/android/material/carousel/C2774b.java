package com.google.android.material.carousel;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p216jc.C7137a;

/* JADX INFO: renamed from: com.google.android.material.carousel.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C2774b {

    /* JADX INFO: renamed from: a */
    public final float f9871a;

    /* JADX INFO: renamed from: b */
    public final List<c> f9872b;

    /* JADX INFO: renamed from: c */
    public final int f9873c;

    /* JADX INFO: renamed from: d */
    public final int f9874d;

    /* JADX INFO: renamed from: com.google.android.material.carousel.b$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final float f9875a;

        /* JADX INFO: renamed from: b */
        public final float f9876b;

        /* JADX INFO: renamed from: d */
        public c f9878d;

        /* JADX INFO: renamed from: e */
        public c f9879e;

        /* JADX INFO: renamed from: c */
        public final List<c> f9877c = new ArrayList();

        /* JADX INFO: renamed from: f */
        public int f9880f = -1;

        /* JADX INFO: renamed from: g */
        public int f9881g = -1;

        /* JADX INFO: renamed from: h */
        public float f9882h = 0.0f;

        /* JADX INFO: renamed from: i */
        public int f9883i = -1;

        public b(float f10, float f11) {
            this.f9875a = f10;
            this.f9876b = f11;
        }

        /* JADX INFO: renamed from: j */
        public static float m12331j(float f10, float f11, int i10, int i11) {
            return (f10 - (i10 * f11)) + (i11 * f11);
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public b m12332a(float f10, float f11, float f12) {
            return m12335d(f10, f11, f12, false, true);
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public b m12333b(float f10, float f11, float f12) {
            return m12334c(f10, f11, f12, false);
        }

        @NonNull
        /* JADX INFO: renamed from: c */
        public b m12334c(float f10, float f11, float f12, boolean z10) {
            return m12335d(f10, f11, f12, z10, false);
        }

        @NonNull
        /* JADX INFO: renamed from: d */
        public b m12335d(float f10, float f11, float f12, boolean z10, boolean z11) {
            float fAbs;
            float f13 = f12 / 2.0f;
            float f14 = f10 - f13;
            float f15 = f13 + f10;
            float f16 = this.f9876b;
            if (f15 > f16) {
                fAbs = Math.abs(f15 - Math.max(f15 - f12, f16));
            } else {
                fAbs = 0.0f;
                if (f14 < 0.0f) {
                    fAbs = Math.abs(f14 - Math.min(f14 + f12, 0.0f));
                }
            }
            return m12336e(f10, f11, f12, z10, z11, fAbs);
        }

        @NonNull
        /* JADX INFO: renamed from: e */
        public b m12336e(float f10, float f11, float f12, boolean z10, boolean z11, float f13) {
            return m12337f(f10, f11, f12, z10, z11, f13, 0.0f, 0.0f);
        }

        @NonNull
        /* JADX INFO: renamed from: f */
        public b m12337f(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14, float f15) {
            if (f12 <= 0.0f) {
                return this;
            }
            if (z11) {
                if (z10) {
                    throw new IllegalArgumentException("Anchor keylines cannot be focal.");
                }
                int i10 = this.f9883i;
                if (i10 != -1 && i10 != 0) {
                    throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                }
                this.f9883i = this.f9877c.size();
            }
            c cVar = new c(Float.MIN_VALUE, f10, f11, f12, z11, f13, f14, f15);
            if (z10) {
                if (this.f9878d == null) {
                    this.f9878d = cVar;
                    this.f9880f = this.f9877c.size();
                }
                if (this.f9881g != -1 && this.f9877c.size() - this.f9881g > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f12 != this.f9878d.f9887d) {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
                this.f9879e = cVar;
                this.f9881g = this.f9877c.size();
            } else {
                if (this.f9878d == null && cVar.f9887d < this.f9882h) {
                    throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                }
                if (this.f9879e != null && cVar.f9887d > this.f9882h) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.f9882h = cVar.f9887d;
            this.f9877c.add(cVar);
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: g */
        public b m12338g(float f10, float f11, float f12, int i10) {
            return m12339h(f10, f11, f12, i10, false);
        }

        @NonNull
        /* JADX INFO: renamed from: h */
        public b m12339h(float f10, float f11, float f12, int i10, boolean z10) {
            if (i10 > 0 && f12 > 0.0f) {
                for (int i11 = 0; i11 < i10; i11++) {
                    m12334c((i11 * f12) + f10, f11, f12, z10);
                }
            }
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: i */
        public C2774b m12340i() {
            if (this.f9878d == null) {
                throw new IllegalStateException("There must be a keyline marked as focal.");
            }
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < this.f9877c.size(); i10++) {
                c cVar = this.f9877c.get(i10);
                arrayList.add(new c(m12331j(this.f9878d.f9885b, this.f9875a, this.f9880f, i10), cVar.f9885b, cVar.f9886c, cVar.f9887d, cVar.f9888e, cVar.f9889f, cVar.f9890g, cVar.f9891h));
            }
            return new C2774b(this.f9875a, arrayList, this.f9880f, this.f9881g);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.carousel.b$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public final float f9884a;

        /* JADX INFO: renamed from: b */
        public final float f9885b;

        /* JADX INFO: renamed from: c */
        public final float f9886c;

        /* JADX INFO: renamed from: d */
        public final float f9887d;

        /* JADX INFO: renamed from: e */
        public final boolean f9888e;

        /* JADX INFO: renamed from: f */
        public final float f9889f;

        /* JADX INFO: renamed from: g */
        public final float f9890g;

        /* JADX INFO: renamed from: h */
        public final float f9891h;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public c(float f10, float f11, float f12, float f13) {
            this(f10, f11, f12, f13, false, 0.0f, 0.0f, 0.0f);
        }

        /* JADX INFO: renamed from: a */
        public static c m12341a(c cVar, c cVar2, float f10) {
            return new c(C7137a.m29919a(cVar.f9884a, cVar2.f9884a, f10), C7137a.m29919a(cVar.f9885b, cVar2.f9885b, f10), C7137a.m29919a(cVar.f9886c, cVar2.f9886c, f10), C7137a.m29919a(cVar.f9887d, cVar2.f9887d, f10));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public c(float f10, float f11, float f12, float f13, boolean z10, float f14, float f15, float f16) {
            this.f9884a = f10;
            this.f9885b = f11;
            this.f9886c = f12;
            this.f9887d = f13;
            this.f9888e = z10;
            this.f9889f = f14;
            this.f9890g = f15;
            this.f9891h = f16;
        }
    }

    /* JADX INFO: renamed from: m */
    public static C2774b m12317m(C2774b c2774b, C2774b c2774b2, float f10) {
        if (c2774b.m12324f() != c2774b2.m12324f()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
        }
        List<c> listM12325g = c2774b.m12325g();
        List<c> listM12325g2 = c2774b2.m12325g();
        if (listM12325g.size() != listM12325g2.size()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < c2774b.m12325g().size(); i10++) {
            arrayList.add(c.m12341a(listM12325g.get(i10), listM12325g2.get(i10), f10));
        }
        return new C2774b(c2774b.m12324f(), arrayList, C7137a.m29921c(c2774b.m12320b(), c2774b2.m12320b(), f10), C7137a.m29921c(c2774b.m12327i(), c2774b2.m12327i(), f10));
    }

    /* JADX INFO: renamed from: n */
    public static C2774b m12318n(C2774b c2774b, float f10) {
        b bVar = new b(c2774b.m12324f(), f10);
        float f11 = (f10 - c2774b.m12328j().f9885b) - (c2774b.m12328j().f9887d / 2.0f);
        int size = c2774b.m12325g().size() - 1;
        while (size >= 0) {
            c cVar = c2774b.m12325g().get(size);
            bVar.m12335d((cVar.f9887d / 2.0f) + f11, cVar.f9886c, cVar.f9887d, size >= c2774b.m12320b() && size <= c2774b.m12327i(), cVar.f9888e);
            f11 += cVar.f9887d;
            size--;
        }
        return bVar.m12340i();
    }

    /* JADX INFO: renamed from: a */
    public c m12319a() {
        return this.f9872b.get(this.f9873c);
    }

    /* JADX INFO: renamed from: b */
    public int m12320b() {
        return this.f9873c;
    }

    /* JADX INFO: renamed from: c */
    public c m12321c() {
        return this.f9872b.get(0);
    }

    /* JADX INFO: renamed from: d */
    public c m12322d() {
        for (int i10 = 0; i10 < this.f9872b.size(); i10++) {
            c cVar = this.f9872b.get(i10);
            if (!cVar.f9888e) {
                return cVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public List<c> m12323e() {
        return this.f9872b.subList(this.f9873c, this.f9874d + 1);
    }

    /* JADX INFO: renamed from: f */
    public float m12324f() {
        return this.f9871a;
    }

    /* JADX INFO: renamed from: g */
    public List<c> m12325g() {
        return this.f9872b;
    }

    /* JADX INFO: renamed from: h */
    public c m12326h() {
        return this.f9872b.get(this.f9874d);
    }

    /* JADX INFO: renamed from: i */
    public int m12327i() {
        return this.f9874d;
    }

    /* JADX INFO: renamed from: j */
    public c m12328j() {
        List<c> list = this.f9872b;
        return list.get(list.size() - 1);
    }

    /* JADX INFO: renamed from: k */
    public c m12329k() {
        for (int size = this.f9872b.size() - 1; size >= 0; size--) {
            c cVar = this.f9872b.get(size);
            if (!cVar.f9888e) {
                return cVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public int m12330l() {
        Iterator<c> it = this.f9872b.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (it.next().f9888e) {
                i10++;
            }
        }
        return this.f9872b.size() - i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C2774b(float f10, List<c> list, int i10, int i11) {
        this.f9871a = f10;
        this.f9872b = Collections.unmodifiableList(list);
        this.f9873c = i10;
        this.f9874d = i11;
    }
}
