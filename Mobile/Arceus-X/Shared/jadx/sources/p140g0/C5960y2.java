package p140g0;

import android.util.Rational;
import p533x2.C12637g;

/* JADX INFO: renamed from: g0.y2 */
/* JADX INFO: loaded from: classes.dex */
public final class C5960y2 {

    /* JADX INFO: renamed from: a */
    public int f22752a;

    /* JADX INFO: renamed from: b */
    public Rational f22753b;

    /* JADX INFO: renamed from: c */
    public int f22754c;

    /* JADX INFO: renamed from: d */
    public int f22755d;

    /* JADX INFO: renamed from: g0.y2$a */
    public static final class a {

        /* JADX INFO: renamed from: b */
        public final Rational f22757b;

        /* JADX INFO: renamed from: c */
        public final int f22758c;

        /* JADX INFO: renamed from: a */
        public int f22756a = 1;

        /* JADX INFO: renamed from: d */
        public int f22759d = 0;

        public a(Rational rational, int i10) {
            this.f22757b = rational;
            this.f22758c = i10;
        }

        /* JADX INFO: renamed from: a */
        public C5960y2 m26755a() {
            C12637g.m47076h(this.f22757b, "The crop aspect ratio must be set.");
            return new C5960y2(this.f22756a, this.f22757b, this.f22758c, this.f22759d);
        }

        /* JADX INFO: renamed from: b */
        public a m26756b(int i10) {
            this.f22759d = i10;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m26757c(int i10) {
            this.f22756a = i10;
            return this;
        }
    }

    public C5960y2(int i10, Rational rational, int i11, int i12) {
        this.f22752a = i10;
        this.f22753b = rational;
        this.f22754c = i11;
        this.f22755d = i12;
    }

    /* JADX INFO: renamed from: a */
    public Rational m26751a() {
        return this.f22753b;
    }

    /* JADX INFO: renamed from: b */
    public int m26752b() {
        return this.f22755d;
    }

    /* JADX INFO: renamed from: c */
    public int m26753c() {
        return this.f22754c;
    }

    /* JADX INFO: renamed from: d */
    public int m26754d() {
        return this.f22752a;
    }
}
