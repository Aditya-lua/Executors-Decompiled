package y;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import g0.l0;
import n0.c3;
import n0.n1;
import n0.w2;
import n0.x2;

/* JADX INFO: loaded from: classes.dex */
public final class a extends f0.l {
    public static final n1.a<Integer> Q = n1.a.a("camera2.captureRequest.templateType", Integer.TYPE);
    public static final n1.a<Long> R = n1.a.a("camera2.cameraCaptureSession.streamUseCase", Long.TYPE);
    public static final n1.a<CameraDevice.StateCallback> S = n1.a.a("camera2.cameraDevice.stateCallback", CameraDevice.StateCallback.class);
    public static final n1.a<CameraCaptureSession.StateCallback> T = n1.a.a("camera2.cameraCaptureSession.stateCallback", CameraCaptureSession.StateCallback.class);
    public static final n1.a<CameraCaptureSession.CaptureCallback> U = n1.a.a("camera2.cameraCaptureSession.captureCallback", CameraCaptureSession.CaptureCallback.class);
    public static final n1.a<Object> V = n1.a.a("camera2.captureRequest.tag", Object.class);
    public static final n1.a<String> W = n1.a.a("camera2.cameraCaptureSession.physicalCameraId", String.class);

    /* JADX INFO: renamed from: y.a$a, reason: collision with other inner class name */
    public static final class C0647a implements l0<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final x2 f35411a = x2.k0();

        @Override // g0.l0
        public w2 a() {
            return this.f35411a;
        }

        public a b() {
            return new a(c3.j0(this.f35411a));
        }

        public C0647a c(n1 n1Var) {
            d(n1Var, n1.c.OPTIONAL);
            return this;
        }

        public C0647a d(n1 n1Var, n1.c cVar) {
            for (n1.a<?> aVar : n1Var.b()) {
                this.f35411a.D(aVar, cVar, n1Var.e(aVar));
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public <ValueT> C0647a f(CaptureRequest.Key<ValueT> key, ValueT valuet) {
            this.f35411a.G(a.h0(key), valuet);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public <ValueT> C0647a g(CaptureRequest.Key<ValueT> key, ValueT valuet, n1.c cVar) {
            this.f35411a.D(a.h0(key), cVar, valuet);
            return this;
        }
    }

    public a(n1 n1Var) {
        super(n1Var);
    }

    public static n1.a<Object> h0(CaptureRequest.Key<?> key) {
        return n1.a.b("camera2.captureRequest.option." + key.getName(), Object.class, key);
    }

    public f0.l i0() {
        return f0.l.a.d(n()).c();
    }

    public int j0(int i10) {
        return ((Integer) n().h(Q, Integer.valueOf(i10))).intValue();
    }

    public CameraDevice.StateCallback k0(CameraDevice.StateCallback stateCallback) {
        return (CameraDevice.StateCallback) n().h(S, stateCallback);
    }

    public String l0(String str) {
        return (String) n().h(W, str);
    }

    public CameraCaptureSession.CaptureCallback m0(CameraCaptureSession.CaptureCallback captureCallback) {
        return (CameraCaptureSession.CaptureCallback) n().h(U, captureCallback);
    }

    public CameraCaptureSession.StateCallback n0(CameraCaptureSession.StateCallback stateCallback) {
        return (CameraCaptureSession.StateCallback) n().h(T, stateCallback);
    }

    public long o0(long j10) {
        return ((Long) n().h(R, Long.valueOf(j10))).longValue();
    }
}
