package p589z;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p001a0.C0007c;

/* JADX INFO: renamed from: z.u2 */
/* JADX INFO: loaded from: classes.dex */
public class C13633u2 extends CameraCaptureSession.CaptureCallback {

    /* JADX INFO: renamed from: b */
    public a f47779b = null;

    /* JADX INFO: renamed from: a */
    public final Map<CaptureRequest, List<CameraCaptureSession.CaptureCallback>> f47778a = new HashMap();

    /* JADX INFO: renamed from: z.u2$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo49287a(CameraCaptureSession cameraCaptureSession, int i10, boolean z10);
    }

    /* JADX INFO: renamed from: a */
    public void m49728a(CaptureRequest captureRequest, List<CameraCaptureSession.CaptureCallback> list) {
        List<CameraCaptureSession.CaptureCallback> list2 = this.f47778a.get(captureRequest);
        if (list2 == null) {
            this.f47778a.put(captureRequest, list);
            return;
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size());
        arrayList.addAll(list);
        arrayList.addAll(list2);
        this.f47778a.put(captureRequest, arrayList);
    }

    /* JADX INFO: renamed from: b */
    public final List<CameraCaptureSession.CaptureCallback> m49729b(CaptureRequest captureRequest) {
        List<CameraCaptureSession.CaptureCallback> list = this.f47778a.get(captureRequest);
        return list != null ? list : Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: c */
    public void m49730c(a aVar) {
        this.f47779b = aVar;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j10) {
        Iterator<CameraCaptureSession.CaptureCallback> it = m49729b(captureRequest).iterator();
        while (it.hasNext()) {
            C0007c.m7a(it.next(), cameraCaptureSession, captureRequest, surface, j10);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        Iterator<CameraCaptureSession.CaptureCallback> it = m49729b(captureRequest).iterator();
        while (it.hasNext()) {
            it.next().onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        Iterator<CameraCaptureSession.CaptureCallback> it = m49729b(captureRequest).iterator();
        while (it.hasNext()) {
            it.next().onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        Iterator<CameraCaptureSession.CaptureCallback> it = m49729b(captureRequest).iterator();
        while (it.hasNext()) {
            it.next().onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i10) {
        Iterator<List<CameraCaptureSession.CaptureCallback>> it = this.f47778a.values().iterator();
        while (it.hasNext()) {
            Iterator<CameraCaptureSession.CaptureCallback> it2 = it.next().iterator();
            while (it2.hasNext()) {
                it2.next().onCaptureSequenceAborted(cameraCaptureSession, i10);
            }
        }
        a aVar = this.f47779b;
        if (aVar != null) {
            aVar.mo49287a(cameraCaptureSession, i10, true);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i10, long j10) {
        Iterator<List<CameraCaptureSession.CaptureCallback>> it = this.f47778a.values().iterator();
        while (it.hasNext()) {
            Iterator<CameraCaptureSession.CaptureCallback> it2 = it.next().iterator();
            while (it2.hasNext()) {
                it2.next().onCaptureSequenceCompleted(cameraCaptureSession, i10, j10);
            }
        }
        a aVar = this.f47779b;
        if (aVar != null) {
            aVar.mo49287a(cameraCaptureSession, i10, false);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j10, long j11) {
        Iterator<CameraCaptureSession.CaptureCallback> it = m49729b(captureRequest).iterator();
        while (it.hasNext()) {
            it.next().onCaptureStarted(cameraCaptureSession, captureRequest, j10, j11);
        }
    }
}
