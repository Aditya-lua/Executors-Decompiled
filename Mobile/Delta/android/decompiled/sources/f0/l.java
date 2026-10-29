package f0;

import android.hardware.camera2.CaptureRequest;
import g0.l0;
import n0.c3;
import n0.l3;
import n0.n1;
import n0.w2;
import n0.x2;

/* JADX INFO: loaded from: classes.dex */
public class l implements l3 {
    public final n1 P;

    public static final class a implements l0<l> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final x2 f15799a = x2.k0();

        public static /* synthetic */ boolean b(a aVar, n1 n1Var, n1.a aVar2) {
            aVar.a().D(aVar2, n1Var.g(aVar2), n1Var.e(aVar2));
            return true;
        }

        public static a d(final n1 n1Var) {
            final a aVar = new a();
            n1Var.d("camera2.captureRequest.option.", new n1.b() { // from class: f0.k
                @Override // n0.n1.b
                public final boolean a(n1.a aVar2) {
                    return l.a.b(this.f15798a, n1Var, aVar2);
                }
            });
            return aVar;
        }

        @Override // g0.l0
        public w2 a() {
            return this.f15799a;
        }

        public l c() {
            return new l(c3.j0(this.f15799a));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public <ValueT> a f(CaptureRequest.Key<ValueT> key, ValueT valuet) {
            this.f15799a.G(y.a.h0(key), valuet);
            return this;
        }
    }

    public l(n1 n1Var) {
        this.P = n1Var;
    }

    @Override // n0.l3
    public n1 n() {
        return this.P;
    }
}
