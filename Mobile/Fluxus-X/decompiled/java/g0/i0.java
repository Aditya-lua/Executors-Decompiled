package g0;

/* JADX INFO: loaded from: classes.dex */
public class i0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i0 f16850d = new b().b(1.0f).c(0.0f, 0.0f).d(1.0f, 1.0f).a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f16851a;
    public final x2.c<Float, Float> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x2.c<Float, Float> f16852c;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f16853a;
        public x2.c<Float, Float> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public x2.c<Float, Float> f16854c;

        public b() {
            Float fValueOf = Float.valueOf(1.0f);
            this.f16853a = 1.0f;
            Float fValueOf2 = Float.valueOf(0.0f);
            this.b = x2.c.a(fValueOf2, fValueOf2);
            this.f16854c = x2.c.a(fValueOf, fValueOf);
        }

        public i0 a() {
            return new i0(this.f16853a, this.b, this.f16854c);
        }

        public b b(float f10) {
            this.f16853a = f10;
            return this;
        }

        public b c(float f10, float f11) {
            this.b = x2.c.a(Float.valueOf(f10), Float.valueOf(f11));
            return this;
        }

        public b d(float f10, float f11) {
            this.f16854c = x2.c.a(Float.valueOf(f10), Float.valueOf(f11));
            return this;
        }
    }

    public float a() {
        return this.f16851a;
    }

    public x2.c<Float, Float> b() {
        return this.b;
    }

    public x2.c<Float, Float> c() {
        return this.f16852c;
    }

    public i0(float f10, x2.c<Float, Float> cVar, x2.c<Float, Float> cVar2) {
        this.f16851a = f10;
        this.b = cVar;
        this.f16852c = cVar2;
    }
}
