package p561y;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import p114f0.C5233l;
import p140g0.InterfaceC5906l0;
import p296n0.C8734c3;
import p296n0.C8846x2;
import p296n0.InterfaceC8795n1;
import p296n0.InterfaceC8841w2;

/* JADX INFO: renamed from: y.a */
/* JADX INFO: loaded from: classes.dex */
public final class C12964a extends C5233l {

    /* JADX INFO: renamed from: Q */
    public static final InterfaceC8795n1.a<Integer> f45916Q = InterfaceC8795n1.a.m35291a("camera2.captureRequest.templateType", Integer.TYPE);

    /* JADX INFO: renamed from: R */
    public static final InterfaceC8795n1.a<Long> f45917R = InterfaceC8795n1.a.m35291a("camera2.cameraCaptureSession.streamUseCase", Long.TYPE);

    /* JADX INFO: renamed from: S */
    public static final InterfaceC8795n1.a<CameraDevice.StateCallback> f45918S = InterfaceC8795n1.a.m35291a("camera2.cameraDevice.stateCallback", CameraDevice.StateCallback.class);

    /* JADX INFO: renamed from: T */
    public static final InterfaceC8795n1.a<CameraCaptureSession.StateCallback> f45919T = InterfaceC8795n1.a.m35291a("camera2.cameraCaptureSession.stateCallback", CameraCaptureSession.StateCallback.class);

    /* JADX INFO: renamed from: U */
    public static final InterfaceC8795n1.a<CameraCaptureSession.CaptureCallback> f45920U = InterfaceC8795n1.a.m35291a("camera2.cameraCaptureSession.captureCallback", CameraCaptureSession.CaptureCallback.class);

    /* JADX INFO: renamed from: V */
    public static final InterfaceC8795n1.a<Object> f45921V = InterfaceC8795n1.a.m35291a("camera2.captureRequest.tag", Object.class);

    /* JADX INFO: renamed from: W */
    public static final InterfaceC8795n1.a<String> f45922W = InterfaceC8795n1.a.m35291a("camera2.cameraCaptureSession.physicalCameraId", String.class);

    /* JADX INFO: renamed from: y.a$a */
    public static final class a implements InterfaceC5906l0<C12964a> {

        /* JADX INFO: renamed from: a */
        public final C8846x2 f45923a = C8846x2.m35505k0();

        @Override // p140g0.InterfaceC5906l0
        /* JADX INFO: renamed from: a */
        public InterfaceC8841w2 mo6684a() {
            return this.f45923a;
        }

        /* JADX INFO: renamed from: b */
        public C12964a m48218b() {
            return new C12964a(C8734c3.m35022j0(this.f45923a));
        }

        /* JADX INFO: renamed from: c */
        public a m48219c(InterfaceC8795n1 interfaceC8795n1) {
            m48220d(interfaceC8795n1, InterfaceC8795n1.c.OPTIONAL);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public a m48220d(InterfaceC8795n1 interfaceC8795n1, InterfaceC8795n1.c cVar) {
            for (InterfaceC8795n1.a<?> aVar : interfaceC8795n1.mo35024b()) {
                this.f45923a.mo35472D(aVar, cVar, interfaceC8795n1.mo35027e(aVar));
            }
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: n0.x2 */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: f */
        public <ValueT> a m48221f(CaptureRequest.Key<ValueT> key, ValueT valuet) {
            this.f45923a.mo35473G(C12964a.m48210h0(key), valuet);
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: n0.x2 */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: g */
        public <ValueT> a m48222g(CaptureRequest.Key<ValueT> key, ValueT valuet, InterfaceC8795n1.c cVar) {
            this.f45923a.mo35472D(C12964a.m48210h0(key), cVar, valuet);
            return this;
        }
    }

    public C12964a(InterfaceC8795n1 interfaceC8795n1) {
        super(interfaceC8795n1);
    }

    /* JADX INFO: renamed from: h0 */
    public static InterfaceC8795n1.a<Object> m48210h0(CaptureRequest.Key<?> key) {
        return InterfaceC8795n1.a.m35292b("camera2.captureRequest.option." + key.getName(), Object.class, key);
    }

    /* JADX INFO: renamed from: i0 */
    public C5233l m48211i0() {
        return C5233l.a.m24215d(mo6691n()).m24216c();
    }

    /* JADX INFO: renamed from: j0 */
    public int m48212j0(int i10) {
        return ((Integer) mo6691n().mo35030h(f45916Q, Integer.valueOf(i10))).intValue();
    }

    /* JADX INFO: renamed from: k0 */
    public CameraDevice.StateCallback m48213k0(CameraDevice.StateCallback stateCallback) {
        return (CameraDevice.StateCallback) mo6691n().mo35030h(f45918S, stateCallback);
    }

    /* JADX INFO: renamed from: l0 */
    public String m48214l0(String str) {
        return (String) mo6691n().mo35030h(f45922W, str);
    }

    /* JADX INFO: renamed from: m0 */
    public CameraCaptureSession.CaptureCallback m48215m0(CameraCaptureSession.CaptureCallback captureCallback) {
        return (CameraCaptureSession.CaptureCallback) mo6691n().mo35030h(f45920U, captureCallback);
    }

    /* JADX INFO: renamed from: n0 */
    public CameraCaptureSession.StateCallback m48216n0(CameraCaptureSession.StateCallback stateCallback) {
        return (CameraCaptureSession.StateCallback) mo6691n().mo35030h(f45919T, stateCallback);
    }

    /* JADX INFO: renamed from: o0 */
    public long m48217o0(long j10) {
        return ((Long) mo6691n().mo35030h(f45917R, Long.valueOf(j10))).longValue();
    }
}
