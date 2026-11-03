package g0;

import android.util.Rational;

/* JADX INFO: loaded from: classes.dex */
public final class y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18169a;
    public Rational b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18171d;

    public static final class a {
        public final Rational b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f18173c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f18172a = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f18174d = 0;

        public a(Rational rational, int i10) {
            this.b = rational;
            this.f18173c = i10;
        }

        public y2 a() {
            x2.g.h(this.b, "The crop aspect ratio must be set.");
            return new y2(this.f18172a, this.b, this.f18173c, this.f18174d);
        }

        public a b(int i10) {
            this.f18174d = i10;
            return this;
        }

        public a c(int i10) {
            this.f18172a = i10;
            return this;
        }
    }

    public y2(int i10, Rational rational, int i11, int i12) {
        this.f18169a = i10;
        this.b = rational;
        this.f18170c = i11;
        this.f18171d = i12;
    }

    public Rational a() {
        return this.b;
    }

    public int b() {
        return this.f18171d;
    }

    public int c() {
        return this.f18170c;
    }

    public int d() {
        return this.f18169a;
    }
}
