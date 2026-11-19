package g0;

import android.util.Rational;

/* JADX INFO: loaded from: classes.dex */
public final class y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17027a;
    public Rational b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17029d;

    public static final class a {
        public final Rational b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f17031c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f17030a = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f17032d = 0;

        public a(Rational rational, int i10) {
            this.b = rational;
            this.f17031c = i10;
        }

        public y2 a() {
            x2.g.h(this.b, "The crop aspect ratio must be set.");
            return new y2(this.f17030a, this.b, this.f17031c, this.f17032d);
        }

        public a b(int i10) {
            this.f17032d = i10;
            return this;
        }

        public a c(int i10) {
            this.f17030a = i10;
            return this;
        }
    }

    public y2(int i10, Rational rational, int i11, int i12) {
        this.f17027a = i10;
        this.b = rational;
        this.f17028c = i11;
        this.f17029d = i12;
    }

    public Rational a() {
        return this.b;
    }

    public int b() {
        return this.f17029d;
    }

    public int c() {
        return this.f17028c;
    }

    public int d() {
        return this.f17027a;
    }
}
