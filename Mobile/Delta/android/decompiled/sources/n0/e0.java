package n0;

import android.hardware.camera2.CaptureResult;

/* JADX INFO: loaded from: classes.dex */
public interface e0 {

    public static final class a implements e0 {
        public static e0 k() {
            return new a();
        }

        @Override // n0.e0
        public d0 b() {
            return d0.UNKNOWN;
        }

        @Override // n0.e0
        public z3 c() {
            return z3.b();
        }

        @Override // n0.e0
        public b0 d() {
            return b0.UNKNOWN;
        }

        @Override // n0.e0
        public CaptureResult e() {
            return null;
        }

        @Override // n0.e0
        public x f() {
            return x.UNKNOWN;
        }

        @Override // n0.e0
        public a0 g() {
            return a0.UNKNOWN;
        }

        @Override // n0.e0
        public long getTimestamp() {
            return -1L;
        }

        @Override // n0.e0
        public c0 h() {
            return c0.UNKNOWN;
        }

        @Override // n0.e0
        public z i() {
            return z.UNKNOWN;
        }

        @Override // n0.e0
        public y j() {
            return y.UNKNOWN;
        }
    }

    default void a(p0.i.b bVar) {
        bVar.g(b());
    }

    d0 b();

    z3 c();

    b0 d();

    default CaptureResult e() {
        return null;
    }

    x f();

    a0 g();

    long getTimestamp();

    c0 h();

    z i();

    y j();
}
