package a0;

import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.view.Surface;
import g0.r1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class l0 implements d0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CameraDevice f35a;
    public final Object b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f36a;

        public a(Handler handler) {
            this.f36a = handler;
        }
    }

    public l0(CameraDevice cameraDevice, Object obj) {
        this.f35a = (CameraDevice) x2.g.g(cameraDevice);
        this.b = obj;
    }

    public static void b(CameraDevice cameraDevice, List<b0.i> list) {
        String id2 = cameraDevice.getId();
        Iterator<b0.i> it = list.iterator();
        while (it.hasNext()) {
            String strC = it.next().c();
            if (strC != null && !strC.isEmpty()) {
                r1.l("CameraDeviceCompat", "Camera " + id2 + ": Camera doesn't support physicalCameraId " + strC + ". Ignoring.");
            }
        }
    }

    public static void c(CameraDevice cameraDevice, b0.o oVar) {
        x2.g.g(cameraDevice);
        x2.g.g(oVar);
        x2.g.g(oVar.e());
        List<b0.i> listC = oVar.c();
        if (listC == null) {
            throw new IllegalArgumentException("Invalid output configurations");
        }
        if (oVar.a() == null) {
            throw new IllegalArgumentException("Invalid executor");
        }
        b(cameraDevice, listC);
    }

    public static List<Surface> d(List<b0.i> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<b0.i> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().d());
        }
        return arrayList;
    }
}
