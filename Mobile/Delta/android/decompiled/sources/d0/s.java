package d0;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import z.a1;

/* JADX INFO: loaded from: classes.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f14243a;
    public final List<ne.x<Void>> b = Collections.synchronizedList(new ArrayList());

    public static class a extends CameraCaptureSession.CaptureCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ne.x<Void> f14244a = y1.c.a(new y1.c.InterfaceC0665c() { // from class: d0.r
            @Override // y1.c.InterfaceC0665c
            public final Object a(y1.c.a aVar) {
                return s.a.a(this.f14242a, aVar);
            }
        });
        public y1.c.a<Void> b;

        public static /* synthetic */ Object a(a aVar, y1.c.a aVar2) {
            aVar.b = aVar2;
            return "RequestCompleteListener[" + aVar + "]";
        }

        public final void b() {
            y1.c.a<Void> aVar = this.b;
            if (aVar != null) {
                aVar.c(null);
                this.b = null;
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            b();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            b();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i10) {
            b();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i10, long j10) {
            b();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j10, long j11) {
            b();
        }
    }

    public s(boolean z10) {
        this.f14243a = z10;
    }

    public static /* synthetic */ void a(s sVar, a aVar, ne.x xVar) {
        sVar.getClass();
        Log.d("RequestMonitor", "RequestListener " + aVar + " done " + sVar);
        sVar.b.remove(xVar);
    }

    public static /* synthetic */ Void b(List list) {
        return null;
    }

    public final CameraCaptureSession.CaptureCallback c() {
        final a aVar = new a();
        final ne.x<Void> xVar = aVar.f14244a;
        this.b.add(xVar);
        Log.d("RequestMonitor", "RequestListener " + aVar + " monitoring " + this);
        xVar.a(new Runnable() { // from class: d0.q
            @Override // java.lang.Runnable
            public final void run() {
                s.a(this.f14240a, aVar, xVar);
            }
        }, q0.c.b());
        return aVar;
    }

    public CameraCaptureSession.CaptureCallback d(CameraCaptureSession.CaptureCallback captureCallback) {
        return f() ? a1.b(c(), captureCallback) : captureCallback;
    }

    public ne.x<Void> e() {
        return this.b.isEmpty() ? r0.n.p(null) : r0.n.s(r0.n.x(r0.n.w(new ArrayList(this.b)), new t.a() { // from class: d0.p
            @Override // t.a
            public final Object apply(Object obj) {
                return s.b((List) obj);
            }
        }, q0.c.b()));
    }

    public boolean f() {
        return this.f14243a;
    }

    public void g() {
        LinkedList linkedList = new LinkedList(this.b);
        while (!linkedList.isEmpty()) {
            ne.x xVar = (ne.x) linkedList.poll();
            Objects.requireNonNull(xVar);
            xVar.cancel(true);
        }
    }
}
