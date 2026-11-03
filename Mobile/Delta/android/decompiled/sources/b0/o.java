package b0;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f3669a;

    public static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<i> f3671a;
        public final CameraCaptureSession.StateCallback b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Executor f3672c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f3673d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public h f3674e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public CaptureRequest f3675f = null;

        public b(int i10, List<i> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this.f3673d = i10;
            this.f3671a = Collections.unmodifiableList(new ArrayList(list));
            this.b = stateCallback;
            this.f3672c = executor;
        }

        @Override // b0.o.c
        public h a() {
            return this.f3674e;
        }

        @Override // b0.o.c
        public CameraCaptureSession.StateCallback b() {
            return this.b;
        }

        @Override // b0.o.c
        public List<i> c() {
            return this.f3671a;
        }

        @Override // b0.o.c
        public void d(h hVar) {
            if (this.f3673d == 1) {
                throw new UnsupportedOperationException("Method not supported for high speed session types");
            }
            this.f3674e = hVar;
        }

        @Override // b0.o.c
        public Object e() {
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (Objects.equals(this.f3674e, bVar.f3674e) && this.f3673d == bVar.f3673d && this.f3671a.size() == bVar.f3671a.size()) {
                    for (int i10 = 0; i10 < this.f3671a.size(); i10++) {
                        if (!this.f3671a.get(i10).equals(bVar.f3671a.get(i10))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        @Override // b0.o.c
        public int f() {
            return this.f3673d;
        }

        @Override // b0.o.c
        public void g(CaptureRequest captureRequest) {
            this.f3675f = captureRequest;
        }

        @Override // b0.o.c
        public Executor getExecutor() {
            return this.f3672c;
        }

        public int hashCode() {
            int iHashCode = this.f3671a.hashCode() ^ 31;
            int i10 = (iHashCode << 5) - iHashCode;
            h hVar = this.f3674e;
            int iHashCode2 = (hVar == null ? 0 : hVar.hashCode()) ^ i10;
            return this.f3673d ^ ((iHashCode2 << 5) - iHashCode2);
        }
    }

    public interface c {
        h a();

        CameraCaptureSession.StateCallback b();

        List<i> c();

        void d(h hVar);

        Object e();

        int f();

        void g(CaptureRequest captureRequest);

        Executor getExecutor();
    }

    public o(int i10, List<i> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
        if (Build.VERSION.SDK_INT < 28) {
            this.f3669a = new b(i10, list, executor, stateCallback);
        } else {
            this.f3669a = new a(i10, list, executor, stateCallback);
        }
    }

    public static List<OutputConfiguration> h(List<i> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<i> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((OutputConfiguration) it.next().i());
        }
        return arrayList;
    }

    public static List<i> i(List<OutputConfiguration> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<OutputConfiguration> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(i.j(it.next()));
        }
        return arrayList;
    }

    public Executor a() {
        return this.f3669a.getExecutor();
    }

    public h b() {
        return this.f3669a.a();
    }

    public List<i> c() {
        return this.f3669a.c();
    }

    public int d() {
        return this.f3669a.f();
    }

    public CameraCaptureSession.StateCallback e() {
        return this.f3669a.b();
    }

    public boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f3669a.equals(((o) obj).f3669a);
        }
        return false;
    }

    public void f(h hVar) {
        this.f3669a.d(hVar);
    }

    public void g(CaptureRequest captureRequest) {
        this.f3669a.g(captureRequest);
    }

    public int hashCode() {
        return this.f3669a.hashCode();
    }

    public Object j() {
        return this.f3669a.e();
    }

    public static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SessionConfiguration f3670a;
        public final List<i> b;

        public a(Object obj) {
            SessionConfiguration sessionConfiguration = (SessionConfiguration) obj;
            this.f3670a = sessionConfiguration;
            this.b = Collections.unmodifiableList(o.i(sessionConfiguration.getOutputConfigurations()));
        }

        @Override // b0.o.c
        public h a() {
            return h.b(this.f3670a.getInputConfiguration());
        }

        @Override // b0.o.c
        public CameraCaptureSession.StateCallback b() {
            return this.f3670a.getStateCallback();
        }

        @Override // b0.o.c
        public List<i> c() {
            return this.b;
        }

        @Override // b0.o.c
        public void d(h hVar) {
            this.f3670a.setInputConfiguration((InputConfiguration) hVar.a());
        }

        @Override // b0.o.c
        public Object e() {
            return this.f3670a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return Objects.equals(this.f3670a, ((a) obj).f3670a);
            }
            return false;
        }

        @Override // b0.o.c
        public int f() {
            return this.f3670a.getSessionType();
        }

        @Override // b0.o.c
        public void g(CaptureRequest captureRequest) {
            this.f3670a.setSessionParameters(captureRequest);
        }

        @Override // b0.o.c
        public Executor getExecutor() {
            return this.f3670a.getExecutor();
        }

        public int hashCode() {
            return this.f3670a.hashCode();
        }

        public a(int i10, List<i> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this(new SessionConfiguration(i10, o.h(list), executor, stateCallback));
        }
    }
}
