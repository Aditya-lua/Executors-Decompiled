package p001a0;

import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p020b0.C1183i;
import p020b0.C1189o;
import p140g0.C5931r1;
import p533x2.C12637g;

/* JADX INFO: renamed from: a0.l0 */
/* JADX INFO: loaded from: classes.dex */
public class C0026l0 implements C0010d0.a {

    /* JADX INFO: renamed from: a */
    public final CameraDevice f47a;

    /* JADX INFO: renamed from: b */
    public final Object f48b;

    /* JADX INFO: renamed from: a0.l0$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final Handler f49a;

        public a(Handler handler) {
            this.f49a = handler;
        }
    }

    public C0026l0(CameraDevice cameraDevice, Object obj) {
        this.f47a = (CameraDevice) C12637g.m47075g(cameraDevice);
        this.f48b = obj;
    }

    /* JADX INFO: renamed from: b */
    public static void m59b(CameraDevice cameraDevice, List<C1183i> list) {
        String id2 = cameraDevice.getId();
        Iterator<C1183i> it = list.iterator();
        while (it.hasNext()) {
            String strM6559c = it.next().m6559c();
            if (strM6559c != null && !strM6559c.isEmpty()) {
                C5931r1.m26572l("CameraDeviceCompat", "Camera " + id2 + ": Camera doesn't support physicalCameraId " + strM6559c + ". Ignoring.");
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m60c(CameraDevice cameraDevice, C1189o c1189o) {
        C12637g.m47075g(cameraDevice);
        C12637g.m47075g(c1189o);
        C12637g.m47075g(c1189o.m6583e());
        List<C1183i> listM6581c = c1189o.m6581c();
        if (listM6581c == null) {
            throw new IllegalArgumentException("Invalid output configurations");
        }
        if (c1189o.m6579a() == null) {
            throw new IllegalArgumentException("Invalid executor");
        }
        m59b(cameraDevice, listM6581c);
    }

    /* JADX INFO: renamed from: d */
    public static List<Surface> m61d(List<C1183i> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<C1183i> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().m6560d());
        }
        return arrayList;
    }
}
