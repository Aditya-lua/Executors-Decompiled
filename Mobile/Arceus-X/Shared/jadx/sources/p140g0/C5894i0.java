package p140g0;

import p533x2.C12633c;

/* JADX INFO: renamed from: g0.i0 */
/* JADX INFO: loaded from: classes.dex */
public class C5894i0 {

    /* JADX INFO: renamed from: d */
    public static final C5894i0 f22527d = new b().m26495b(1.0f).m26496c(0.0f, 0.0f).m26497d(1.0f, 1.0f).m26494a();

    /* JADX INFO: renamed from: a */
    public final float f22528a;

    /* JADX INFO: renamed from: b */
    public final C12633c<Float, Float> f22529b;

    /* JADX INFO: renamed from: c */
    public final C12633c<Float, Float> f22530c;

    /* JADX INFO: renamed from: g0.i0$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public float f22531a;

        /* JADX INFO: renamed from: b */
        public C12633c<Float, Float> f22532b;

        /* JADX INFO: renamed from: c */
        public C12633c<Float, Float> f22533c;

        public b() {
            Float fValueOf = Float.valueOf(1.0f);
            this.f22531a = 1.0f;
            Float fValueOf2 = Float.valueOf(0.0f);
            this.f22532b = C12633c.m47065a(fValueOf2, fValueOf2);
            this.f22533c = C12633c.m47065a(fValueOf, fValueOf);
        }

        /* JADX INFO: renamed from: a */
        public C5894i0 m26494a() {
            return new C5894i0(this.f22531a, this.f22532b, this.f22533c);
        }

        /* JADX INFO: renamed from: b */
        public b m26495b(float f10) {
            this.f22531a = f10;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public b m26496c(float f10, float f11) {
            this.f22532b = C12633c.m47065a(Float.valueOf(f10), Float.valueOf(f11));
            return this;
        }

        /* JADX INFO: renamed from: d */
        public b m26497d(float f10, float f11) {
            this.f22533c = C12633c.m47065a(Float.valueOf(f10), Float.valueOf(f11));
            return this;
        }
    }

    /* JADX INFO: renamed from: a */
    public float m26491a() {
        return this.f22528a;
    }

    /* JADX INFO: renamed from: b */
    public C12633c<Float, Float> m26492b() {
        return this.f22529b;
    }

    /* JADX INFO: renamed from: c */
    public C12633c<Float, Float> m26493c() {
        return this.f22530c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C5894i0(float f10, C12633c<Float, Float> c12633c, C12633c<Float, Float> c12633c2) {
        this.f22528a = f10;
        this.f22529b = c12633c;
        this.f22530c = c12633c2;
    }
}
