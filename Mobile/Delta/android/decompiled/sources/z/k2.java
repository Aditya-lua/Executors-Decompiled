package z;

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

/* JADX INFO: loaded from: classes.dex */
public class k2 {

    public static class a {
        public static CaptureRequest.Builder a(CameraDevice cameraDevice, TotalCaptureResult totalCaptureResult) {
            return cameraDevice.createReprocessCaptureRequest(totalCaptureResult);
        }
    }

    public static void a(n0.l1 l1Var, CaptureRequest.Builder builder) {
        Range<Integer> rangeE = l1Var.e();
        if (!rangeE.equals(n0.t3.f24861a)) {
            builder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, rangeE);
        }
        g0.r1.a("Camera2CaptureRequestBuilder", "applyAeFpsRange: expectedFrameRateRange = " + rangeE);
    }

    public static void b(CaptureRequest.Builder builder, n0.n1 n1Var) {
        f0.l lVarC = f0.l.a.d(n1Var).c();
        for (n0.n1.a<?> aVar : lVarC.b()) {
            CaptureRequest.Key key = (CaptureRequest.Key) aVar.d();
            try {
                builder.set(key, lVarC.e(aVar));
            } catch (IllegalArgumentException unused) {
                g0.r1.c("Camera2CaptureRequestBuilder", "CaptureRequest.Key is not supported: " + key);
            }
        }
    }

    public static void c(CaptureRequest.Builder builder, int i10, d0.y yVar) {
        for (Map.Entry<CaptureRequest.Key<?>, Object> entry : yVar.a(i10).entrySet()) {
            builder.set(entry.getKey(), entry.getValue());
        }
    }

    public static void d(n0.l1 l1Var, CaptureRequest.Builder builder) {
        Integer numH = h(l1Var);
        if (numH != null) {
            builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, numH);
        }
        g0.r1.a("Camera2CaptureRequestBuilder", "applyVideoStabilization: mode = " + numH);
    }

    public static CaptureRequest e(n0.l1 l1Var, CameraDevice cameraDevice, Map<n0.u1, Surface> map, boolean z10, d0.y yVar) throws CameraAccessException {
        CaptureRequest.Builder builderCreateCaptureRequest;
        if (cameraDevice == null) {
            return null;
        }
        List<Surface> listG = g(l1Var.i(), map);
        if (listG.isEmpty()) {
            return null;
        }
        n0.e0 e0VarD = l1Var.d();
        if (l1Var.k() == 5 && e0VarD != null && (e0VarD.e() instanceof TotalCaptureResult)) {
            g0.r1.a("Camera2CaptureRequestBuilder", "createReprocessCaptureRequest");
            builderCreateCaptureRequest = a.a(cameraDevice, (TotalCaptureResult) e0VarD.e());
        } else {
            g0.r1.a("Camera2CaptureRequestBuilder", "createCaptureRequest");
            if (l1Var.k() == 5) {
                builderCreateCaptureRequest = cameraDevice.createCaptureRequest(z10 ? 1 : 2);
            } else {
                builderCreateCaptureRequest = cameraDevice.createCaptureRequest(l1Var.k());
            }
        }
        c(builderCreateCaptureRequest, l1Var.k(), yVar);
        a(l1Var, builderCreateCaptureRequest);
        d(l1Var, builderCreateCaptureRequest);
        n0.n1 n1VarG = l1Var.g();
        n0.n1.a<Integer> aVar = n0.l1.f24728i;
        if (n1VarG.a(aVar)) {
            builderCreateCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, (Integer) l1Var.g().e(aVar));
        }
        n0.n1 n1VarG2 = l1Var.g();
        n0.n1.a<Integer> aVar2 = n0.l1.f24729j;
        if (n1VarG2.a(aVar2)) {
            builderCreateCaptureRequest.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) l1Var.g().e(aVar2)).byteValue()));
        }
        b(builderCreateCaptureRequest, l1Var.g());
        Iterator<Surface> it = listG.iterator();
        while (it.hasNext()) {
            builderCreateCaptureRequest.addTarget(it.next());
        }
        builderCreateCaptureRequest.setTag(l1Var.j());
        return builderCreateCaptureRequest.build();
    }

    public static CaptureRequest f(n0.l1 l1Var, CameraDevice cameraDevice, d0.y yVar) throws CameraAccessException {
        if (cameraDevice == null) {
            return null;
        }
        g0.r1.a("Camera2CaptureRequestBuilder", "template type = " + l1Var.k());
        CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice.createCaptureRequest(l1Var.k());
        c(builderCreateCaptureRequest, l1Var.k(), yVar);
        a(l1Var, builderCreateCaptureRequest);
        b(builderCreateCaptureRequest, l1Var.g());
        return builderCreateCaptureRequest.build();
    }

    public static List<Surface> g(List<n0.u1> list, Map<n0.u1, Surface> map) {
        ArrayList arrayList = new ArrayList();
        Iterator<n0.u1> it = list.iterator();
        while (it.hasNext()) {
            Surface surface = map.get(it.next());
            if (surface == null) {
                throw new IllegalArgumentException("DeferrableSurface not in configuredSurfaceMap");
            }
            arrayList.add(surface);
        }
        return arrayList;
    }

    public static Integer h(n0.l1 l1Var) {
        if (l1Var.h() == 1 || l1Var.l() == 1) {
            return 0;
        }
        if (l1Var.h() == 2) {
            return 2;
        }
        return l1Var.l() == 2 ? 1 : null;
    }
}
