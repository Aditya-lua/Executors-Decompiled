package p589z;

import android.hardware.camera2.CameraCaptureSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p296n0.AbstractC8828u;
import p296n0.C8833v;

/* JADX INFO: renamed from: z.d3 */
/* JADX INFO: loaded from: classes.dex */
public final class C13503d3 {
    /* JADX INFO: renamed from: a */
    public static CameraCaptureSession.CaptureCallback m49212a(AbstractC8828u abstractC8828u) {
        if (abstractC8828u == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        m49213b(abstractC8828u, arrayList);
        return arrayList.size() == 1 ? (CameraCaptureSession.CaptureCallback) arrayList.get(0) : C13477a1.m49166a(arrayList);
    }

    /* JADX INFO: renamed from: b */
    public static void m49213b(AbstractC8828u abstractC8828u, List<CameraCaptureSession.CaptureCallback> list) {
        if (abstractC8828u instanceof C8833v.a) {
            Iterator<AbstractC8828u> it = ((C8833v.a) abstractC8828u).m35462e().iterator();
            while (it.hasNext()) {
                m49213b(it.next(), list);
            }
        } else if (abstractC8828u instanceof C13495c3) {
            list.add(((C13495c3) abstractC8828u).m49189f());
        } else {
            list.add(new C13487b3(abstractC8828u));
        }
    }
}
