package p589z;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p063d0.C4394y;
import p114f0.C5233l;
import p140g0.C5931r1;
import p296n0.AbstractC8827t3;
import p296n0.AbstractC8830u1;
import p296n0.C8785l1;
import p296n0.InterfaceC8743e0;
import p296n0.InterfaceC8795n1;

/* JADX INFO: renamed from: z.k2 */
/* JADX INFO: loaded from: classes.dex */
public class C13558k2 {

    /* JADX INFO: renamed from: z.k2$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static CaptureRequest.Builder m49468a(CameraDevice cameraDevice, TotalCaptureResult totalCaptureResult) {
            return cameraDevice.createReprocessCaptureRequest(totalCaptureResult);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m49460a(C8785l1 c8785l1, CaptureRequest.Builder builder) {
        Range<Integer> rangeM35242e = c8785l1.m35242e();
        if (!rangeM35242e.equals(AbstractC8827t3.f32104a)) {
            builder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, rangeM35242e);
        }
        C5931r1.m26561a("Camera2CaptureRequestBuilder", "applyAeFpsRange: expectedFrameRateRange = " + rangeM35242e);
    }

    /* JADX INFO: renamed from: b */
    public static void m49461b(CaptureRequest.Builder builder, InterfaceC8795n1 interfaceC8795n1) {
        C5233l c5233lM24216c = C5233l.a.m24215d(interfaceC8795n1).m24216c();
        for (InterfaceC8795n1.a<?> aVar : c5233lM24216c.mo35024b()) {
            CaptureRequest.Key key = (CaptureRequest.Key) aVar.mo35217d();
            try {
                builder.set(key, c5233lM24216c.mo35027e(aVar));
            } catch (IllegalArgumentException unused) {
                C5931r1.m26563c("Camera2CaptureRequestBuilder", "CaptureRequest.Key is not supported: " + key);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m49462c(CaptureRequest.Builder builder, int i10, C4394y c4394y) {
        for (Map.Entry<CaptureRequest.Key<?>, Object> entry : c4394y.m22066a(i10).entrySet()) {
            builder.set(entry.getKey(), entry.getValue());
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m49463d(C8785l1 c8785l1, CaptureRequest.Builder builder) {
        Integer numM49467h = m49467h(c8785l1);
        if (numM49467h != null) {
            builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, numM49467h);
        }
        C5931r1.m26561a("Camera2CaptureRequestBuilder", "applyVideoStabilization: mode = " + numM49467h);
    }

    /* JADX INFO: renamed from: e */
    public static CaptureRequest m49464e(C8785l1 c8785l1, CameraDevice cameraDevice, Map<AbstractC8830u1, Surface> map, boolean z10, C4394y c4394y) throws CameraAccessException {
        CaptureRequest.Builder builderCreateCaptureRequest;
        if (cameraDevice == null) {
            return null;
        }
        List<Surface> listM49466g = m49466g(c8785l1.m35246i(), map);
        if (listM49466g.isEmpty()) {
            return null;
        }
        InterfaceC8743e0 interfaceC8743e0M35241d = c8785l1.m35241d();
        if (c8785l1.m35248k() == 5 && interfaceC8743e0M35241d != null && (interfaceC8743e0M35241d.mo35073e() instanceof TotalCaptureResult)) {
            C5931r1.m26561a("Camera2CaptureRequestBuilder", "createReprocessCaptureRequest");
            builderCreateCaptureRequest = a.m49468a(cameraDevice, (TotalCaptureResult) interfaceC8743e0M35241d.mo35073e());
        } else {
            C5931r1.m26561a("Camera2CaptureRequestBuilder", "createCaptureRequest");
            if (c8785l1.m35248k() == 5) {
                builderCreateCaptureRequest = cameraDevice.createCaptureRequest(z10 ? 1 : 2);
            } else {
                builderCreateCaptureRequest = cameraDevice.createCaptureRequest(c8785l1.m35248k());
            }
        }
        m49462c(builderCreateCaptureRequest, c8785l1.m35248k(), c4394y);
        m49460a(c8785l1, builderCreateCaptureRequest);
        m49463d(c8785l1, builderCreateCaptureRequest);
        InterfaceC8795n1 interfaceC8795n1M35244g = c8785l1.m35244g();
        InterfaceC8795n1.a<Integer> aVar = C8785l1.f31943i;
        if (interfaceC8795n1M35244g.mo35023a(aVar)) {
            builderCreateCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, (Integer) c8785l1.m35244g().mo35027e(aVar));
        }
        InterfaceC8795n1 interfaceC8795n1M35244g2 = c8785l1.m35244g();
        InterfaceC8795n1.a<Integer> aVar2 = C8785l1.f31944j;
        if (interfaceC8795n1M35244g2.mo35023a(aVar2)) {
            builderCreateCaptureRequest.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) c8785l1.m35244g().mo35027e(aVar2)).byteValue()));
        }
        m49461b(builderCreateCaptureRequest, c8785l1.m35244g());
        Iterator<Surface> it = listM49466g.iterator();
        while (it.hasNext()) {
            builderCreateCaptureRequest.addTarget(it.next());
        }
        builderCreateCaptureRequest.setTag(c8785l1.m35247j());
        return builderCreateCaptureRequest.build();
    }

    /* JADX INFO: renamed from: f */
    public static CaptureRequest m49465f(C8785l1 c8785l1, CameraDevice cameraDevice, C4394y c4394y) throws CameraAccessException {
        if (cameraDevice == null) {
            return null;
        }
        C5931r1.m26561a("Camera2CaptureRequestBuilder", "template type = " + c8785l1.m35248k());
        CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice.createCaptureRequest(c8785l1.m35248k());
        m49462c(builderCreateCaptureRequest, c8785l1.m35248k(), c4394y);
        m49460a(c8785l1, builderCreateCaptureRequest);
        m49461b(builderCreateCaptureRequest, c8785l1.m35244g());
        return builderCreateCaptureRequest.build();
    }

    /* JADX INFO: renamed from: g */
    public static List<Surface> m49466g(List<AbstractC8830u1> list, Map<AbstractC8830u1, Surface> map) {
        ArrayList arrayList = new ArrayList();
        Iterator<AbstractC8830u1> it = list.iterator();
        while (it.hasNext()) {
            Surface surface = map.get(it.next());
            if (surface == null) {
                throw new IllegalArgumentException("DeferrableSurface not in configuredSurfaceMap");
            }
            arrayList.add(surface);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public static Integer m49467h(C8785l1 c8785l1) {
        if (c8785l1.m35245h() == 1 || c8785l1.m35249l() == 1) {
            return 0;
        }
        if (c8785l1.m35245h() == 2) {
            return 2;
        }
        return c8785l1.m35249l() == 2 ? 1 : null;
    }
}
