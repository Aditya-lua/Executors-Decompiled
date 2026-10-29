package z;

import android.hardware.camera2.CameraCaptureSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d3 {
    public static CameraCaptureSession.CaptureCallback a(n0.u uVar) {
        if (uVar == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        b(uVar, arrayList);
        return arrayList.size() == 1 ? (CameraCaptureSession.CaptureCallback) arrayList.get(0) : a1.a(arrayList);
    }

    public static void b(n0.u uVar, List<CameraCaptureSession.CaptureCallback> list) {
        if (uVar instanceof n0.v.a) {
            Iterator<n0.u> it = ((n0.v.a) uVar).e().iterator();
            while (it.hasNext()) {
                b(it.next(), list);
            }
        } else if (uVar instanceof c3) {
            list.add(((c3) uVar).f());
        } else {
            list.add(new b3(uVar));
        }
    }
}
