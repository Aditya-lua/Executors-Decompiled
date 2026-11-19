package com.google.android.material.carousel;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f7635a;
    public final List<c> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7637d;

    /* JADX INFO: renamed from: com.google.android.material.carousel.b$b, reason: collision with other inner class name */
    public static final class C0122b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f7638a;
        public final float b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c f7640d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public c f7641e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<c> f7639c = new ArrayList();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f7642f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f7643g = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f7644h = 0.0f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f7645i = -1;

        public C0122b(float f10, float f11) {
            this.f7638a = f10;
            this.b = f11;
        }

        public static float j(float f10, float f11, int i10, int i11) {
            return (f10 - (i10 * f11)) + (i11 * f11);
        }

        @NonNull
        public C0122b a(float f10, float f11, float f12) {
            return d(f10, f11, f12, false, true);
        }

        @NonNull
        public C0122b b(float f10, float f11, float f12) {
            return c(f10, f11, f12, false);
        }

        @NonNull
        public C0122b c(float f10, float f11, float f12, boolean z10) {
            return d(f10, f11, f12, z10, false);
        }

        @NonNull
        public C0122b d(float f10, float f11, float f12, boolean z10, boolean z11) {
            float fAbs;
            float f13 = f12 / 2.0f;
            float f14 = f10 - f13;
            float f15 = f13 + f10;
            float f16 = this.b;
            if (f15 > f16) {
                fAbs = Math.abs(f15 - Math.max(f15 - f12, f16));
            } else {
                fAbs = 0.0f;
                if (f14 < 0.0f) {
                    fAbs = Math.abs(f14 - Math.min(f14 + f12, 0.0f));
                }
            }
            return e(f10, f11, f12, z10, z11, fAbs);
        }

        @NonNull
        public C0122b e(float f10, float f11, float f12, boolean z10, boolean z11, float f13) {
            return f(f10, f11, f12, z10, z11, f13, 0.0f, 0.0f);
        }

        @NonNull
        public C0122b f(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14, float f15) {
            if (f12 <= 0.0f) {
                return this;
            }
            if (z11) {
                if (z10) {
                    throw new IllegalArgumentException("Anchor keylines cannot be focal.");
                }
                int i10 = this.f7645i;
                if (i10 != -1 && i10 != 0) {
                    throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                }
                this.f7645i = this.f7639c.size();
            }
            c cVar = new c(Float.MIN_VALUE, f10, f11, f12, z11, f13, f14, f15);
            if (z10) {
                if (this.f7640d == null) {
                    this.f7640d = cVar;
                    this.f7642f = this.f7639c.size();
                }
                if (this.f7643g != -1 && this.f7639c.size() - this.f7643g > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f12 != this.f7640d.f7648d) {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
                this.f7641e = cVar;
                this.f7643g = this.f7639c.size();
            } else {
                if (this.f7640d == null && cVar.f7648d < this.f7644h) {
                    throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                }
                if (this.f7641e != null && cVar.f7648d > this.f7644h) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.f7644h = cVar.f7648d;
            this.f7639c.add(cVar);
            return this;
        }

        @NonNull
        public C0122b g(float f10, float f11, float f12, int i10) {
            return h(f10, f11, f12, i10, false);
        }

        @NonNull
        public C0122b h(float f10, float f11, float f12, int i10, boolean z10) {
            if (i10 > 0 && f12 > 0.0f) {
                for (int i11 = 0; i11 < i10; i11++) {
                    c((i11 * f12) + f10, f11, f12, z10);
                }
            }
            return this;
        }

        @NonNull
        public b i() {
            if (this.f7640d == null) {
                throw new IllegalStateException("There must be a keyline marked as focal.");
            }
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < this.f7639c.size(); i10++) {
                c cVar = this.f7639c.get(i10);
                arrayList.add(new c(j(this.f7640d.b, this.f7638a, this.f7642f, i10), cVar.b, cVar.f7647c, cVar.f7648d, cVar.f7649e, cVar.f7650f, cVar.f7651g, cVar.f7652h));
            }
            return new b(this.f7638a, arrayList, this.f7642f, this.f7643g);
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f7646a;
        public final float b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f7647c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f7648d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f7649e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f7650f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final float f7651g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final float f7652h;

        public c(float f10, float f11, float f12, float f13) {
            this(f10, f11, f12, f13, false, 0.0f, 0.0f, 0.0f);
        }

        public static c a(c cVar, c cVar2, float f10) {
            return new c(kc.a.a(cVar.f7646a, cVar2.f7646a, f10), kc.a.a(cVar.b, cVar2.b, f10), kc.a.a(cVar.f7647c, cVar2.f7647c, f10), kc.a.a(cVar.f7648d, cVar2.f7648d, f10));
        }

        public c(float f10, float f11, float f12, float f13, boolean z10, float f14, float f15, float f16) {
            this.f7646a = f10;
            this.b = f11;
            this.f7647c = f12;
            this.f7648d = f13;
            this.f7649e = z10;
            this.f7650f = f14;
            this.f7651g = f15;
            this.f7652h = f16;
        }
    }

    public static b m(b bVar, b bVar2, float f10) {
        if (bVar.f() != bVar2.f()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
        }
        List<c> listG = bVar.g();
        List<c> listG2 = bVar2.g();
        if (listG.size() != listG2.size()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < bVar.g().size(); i10++) {
            arrayList.add(c.a(listG.get(i10), listG2.get(i10), f10));
        }
        return new b(bVar.f(), arrayList, kc.a.c(bVar.b(), bVar2.b(), f10), kc.a.c(bVar.i(), bVar2.i(), f10));
    }

    public static b n(b bVar, float f10) {
        C0122b c0122b = new C0122b(bVar.f(), f10);
        float f11 = (f10 - bVar.j().b) - (bVar.j().f7648d / 2.0f);
        int size = bVar.g().size() - 1;
        while (size >= 0) {
            c cVar = bVar.g().get(size);
            c0122b.d((cVar.f7648d / 2.0f) + f11, cVar.f7647c, cVar.f7648d, size >= bVar.b() && size <= bVar.i(), cVar.f7649e);
            f11 += cVar.f7648d;
            size--;
        }
        return c0122b.i();
    }

    public c a() {
        return this.b.get(this.f7636c);
    }

    public int b() {
        return this.f7636c;
    }

    public c c() {
        return this.b.get(0);
    }

    public c d() {
        for (int i10 = 0; i10 < this.b.size(); i10++) {
            c cVar = this.b.get(i10);
            if (!cVar.f7649e) {
                return cVar;
            }
        }
        return null;
    }

    public List<c> e() {
        return this.b.subList(this.f7636c, this.f7637d + 1);
    }

    public float f() {
        return this.f7635a;
    }

    public List<c> g() {
        return this.b;
    }

    public c h() {
        return this.b.get(this.f7637d);
    }

    public int i() {
        return this.f7637d;
    }

    public c j() {
        List<c> list = this.b;
        return list.get(list.size() - 1);
    }

    public c k() {
        for (int size = this.b.size() - 1; size >= 0; size--) {
            c cVar = this.b.get(size);
            if (!cVar.f7649e) {
                return cVar;
            }
        }
        return null;
    }

    public int l() {
        Iterator<c> it = this.b.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (it.next().f7649e) {
                i10++;
            }
        }
        return this.b.size() - i10;
    }

    public b(float f10, List<c> list, int i10, int i11) {
        this.f7635a = f10;
        this.b = Collections.unmodifiableList(list);
        this.f7636c = i10;
        this.f7637d = i11;
    }
}
