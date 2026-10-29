package p063d0;

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
import ne.InterfaceFutureC9440x;
import p366q0.C10417c;
import p397r0.C10773n;
import p436t.InterfaceC11464a;
import p563y1.C12997c;
import p589z.C13477a1;

/* JADX INFO: renamed from: d0.s */
/* JADX INFO: loaded from: classes.dex */
public class C4388s {

    /* JADX INFO: renamed from: a */
    public final boolean f18245a;

    /* JADX INFO: renamed from: b */
    public final List<InterfaceFutureC9440x<Void>> f18246b = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: d0.s$a */
    public static class a extends CameraCaptureSession.CaptureCallback {

        /* JADX INFO: renamed from: a */
        public final InterfaceFutureC9440x<Void> f18247a = C12997c.m48311a(new C12997c.c() { // from class: d0.r
            @Override // p563y1.C12997c.c
            /* JADX INFO: renamed from: a */
            public final Object mo22051a(C12997c.a aVar) {
                return C4388s.a.m22059a(this.f18244a, aVar);
            }
        });

        /* JADX INFO: renamed from: b */
        public C12997c.a<Void> f18248b;

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ Object m22059a(a aVar, C12997c.a aVar2) {
            aVar.f18248b = aVar2;
            return "RequestCompleteListener[" + aVar + "]";
        }

        /* JADX INFO: renamed from: b */
        public final void m22060b() {
            C12997c.a<Void> aVar = this.f18248b;
            if (aVar != null) {
                aVar.m48314c(null);
                this.f18248b = null;
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            m22060b();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            m22060b();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i10) {
            m22060b();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i10, long j10) {
            m22060b();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j10, long j11) {
            m22060b();
        }
    }

    public C4388s(boolean z10) {
        this.f18245a = z10;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m22052a(C4388s c4388s, a aVar, InterfaceFutureC9440x interfaceFutureC9440x) {
        c4388s.getClass();
        Log.d("RequestMonitor", "RequestListener " + aVar + " done " + c4388s);
        c4388s.f18246b.remove(interfaceFutureC9440x);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Void m22053b(List list) {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final CameraCaptureSession.CaptureCallback m22054c() {
        final a aVar = new a();
        final InterfaceFutureC9440x<Void> interfaceFutureC9440x = aVar.f18247a;
        this.f18246b.add(interfaceFutureC9440x);
        Log.d("RequestMonitor", "RequestListener " + aVar + " monitoring " + this);
        interfaceFutureC9440x.mo37173a(new Runnable() { // from class: d0.q
            @Override // java.lang.Runnable
            public final void run() {
                C4388s.m22052a(this.f18241a, aVar, interfaceFutureC9440x);
            }
        }, C10417c.m40081b());
        return aVar;
    }

    /* JADX INFO: renamed from: d */
    public CameraCaptureSession.CaptureCallback m22055d(CameraCaptureSession.CaptureCallback captureCallback) {
        return m22057f() ? C13477a1.m49167b(m22054c(), captureCallback) : captureCallback;
    }

    /* JADX INFO: renamed from: e */
    public InterfaceFutureC9440x<Void> m22056e() {
        return this.f18246b.isEmpty() ? C10773n.m40993p(null) : C10773n.m40996s(C10773n.m41001x(C10773n.m41000w(new ArrayList(this.f18246b)), new InterfaceC11464a() { // from class: d0.p
            @Override // p436t.InterfaceC11464a
            public final Object apply(Object obj) {
                return C4388s.m22053b((List) obj);
            }
        }, C10417c.m40081b()));
    }

    /* JADX INFO: renamed from: f */
    public boolean m22057f() {
        return this.f18245a;
    }

    /* JADX INFO: renamed from: g */
    public void m22058g() {
        LinkedList linkedList = new LinkedList(this.f18246b);
        while (!linkedList.isEmpty()) {
            InterfaceFutureC9440x interfaceFutureC9440x = (InterfaceFutureC9440x) linkedList.poll();
            Objects.requireNonNull(interfaceFutureC9440x);
            interfaceFutureC9440x.cancel(true);
        }
    }
}
