package g0;

import android.util.Rational;

/* JADX INFO: loaded from: classes.dex */
public final class y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17630a;
    public Rational b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17632d;

    public static final class a {
        public final Rational b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f17634c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f17633a = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f17635d = 0;

        public a(Rational rational, int i10) {
            this.b = rational;
            this.f17634c = i10;
        }

        public y2 a() {
            x2.g.h(this.b, "The crop aspect ratio must be set.");
            return new y2(this.f17633a, this.b, this.f17634c, this.f17635d);
        }

        public a b(int i10) {
            this.f17635d = i10;
            return this;
        }

        public a c(int i10) {
            this.f17633a = i10;
            return this;
        }
    }

    public y2(int i10, Rational rational, int i11, int i12) {
        this.f17630a = i10;
        this.b = rational;
        this.f17631c = i11;
        this.f17632d = i12;
    }

    public Rational a() {
        return this.b;
    }

    public int b() {
        return this.f17632d;
    }

    public int c() {
        return this.f17631c;
    }

    public int d() {
        return this.f17630a;
    }
}
