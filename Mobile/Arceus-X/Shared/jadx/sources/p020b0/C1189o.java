package p020b0;

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

/* JADX INFO: renamed from: b0.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1189o {

    /* JADX INFO: renamed from: a */
    public final c f4935a;

    /* JADX INFO: renamed from: b0.o$b */
    public static final class b implements c {

        /* JADX INFO: renamed from: a */
        public final List<C1183i> f4938a;

        /* JADX INFO: renamed from: b */
        public final CameraCaptureSession.StateCallback f4939b;

        /* JADX INFO: renamed from: c */
        public final Executor f4940c;

        /* JADX INFO: renamed from: d */
        public final int f4941d;

        /* JADX INFO: renamed from: e */
        public C1182h f4942e = null;

        /* JADX INFO: renamed from: f */
        public CaptureRequest f4943f = null;

        public b(int i10, List<C1183i> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this.f4941d = i10;
            this.f4938a = Collections.unmodifiableList(new ArrayList(list));
            this.f4939b = stateCallback;
            this.f4940c = executor;
        }

        @Override // p020b0.C1189o.c
        /* JADX INFO: renamed from: a */
        public C1182h mo6587a() {
            return this.f4942e;
        }

        @Override // p020b0.C1189o.c
        /* JADX INFO: renamed from: b */
        public CameraCaptureSession.StateCallback mo6588b() {
            return this.f4939b;
        }

        @Override // p020b0.C1189o.c
        /* JADX INFO: renamed from: c */
        public List<C1183i> mo6589c() {
            return this.f4938a;
        }

        @Override // p020b0.C1189o.c
        /* JADX INFO: renamed from: d */
        public void mo6590d(C1182h c1182h) {
            if (this.f4941d == 1) {
                throw new UnsupportedOperationException("Method not supported for high speed session types");
            }
            this.f4942e = c1182h;
        }

        @Override // p020b0.C1189o.c
        /* JADX INFO: renamed from: e */
        public Object mo6591e() {
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (Objects.equals(this.f4942e, bVar.f4942e) && this.f4941d == bVar.f4941d && this.f4938a.size() == bVar.f4938a.size()) {
                    for (int i10 = 0; i10 < this.f4938a.size(); i10++) {
                        if (!this.f4938a.get(i10).equals(bVar.f4938a.get(i10))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        @Override // p020b0.C1189o.c
        /* JADX INFO: renamed from: f */
        public int mo6592f() {
            return this.f4941d;
        }

        @Override // p020b0.C1189o.c
        /* JADX INFO: renamed from: g */
        public void mo6593g(CaptureRequest captureRequest) {
            this.f4943f = captureRequest;
        }

        @Override // p020b0.C1189o.c
        public Executor getExecutor() {
            return this.f4940c;
        }

        public int hashCode() {
            int iHashCode = this.f4938a.hashCode() ^ 31;
            int i10 = (iHashCode << 5) - iHashCode;
            C1182h c1182h = this.f4942e;
            int iHashCode2 = (c1182h == null ? 0 : c1182h.hashCode()) ^ i10;
            return this.f4941d ^ ((iHashCode2 << 5) - iHashCode2);
        }
    }

    /* JADX INFO: renamed from: b0.o$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        C1182h mo6587a();

        /* JADX INFO: renamed from: b */
        CameraCaptureSession.StateCallback mo6588b();

        /* JADX INFO: renamed from: c */
        List<C1183i> mo6589c();

        /* JADX INFO: renamed from: d */
        void mo6590d(C1182h c1182h);

        /* JADX INFO: renamed from: e */
        Object mo6591e();

        /* JADX INFO: renamed from: f */
        int mo6592f();

        /* JADX INFO: renamed from: g */
        void mo6593g(CaptureRequest captureRequest);

        Executor getExecutor();
    }

    public C1189o(int i10, List<C1183i> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
        if (Build.VERSION.SDK_INT < 28) {
            this.f4935a = new b(i10, list, executor, stateCallback);
        } else {
            this.f4935a = new a(i10, list, executor, stateCallback);
        }
    }

    /* JADX INFO: renamed from: h */
    public static List<OutputConfiguration> m6577h(List<C1183i> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<C1183i> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((OutputConfiguration) it.next().m6565i());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    public static List<C1183i> m6578i(List<OutputConfiguration> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<OutputConfiguration> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C1183i.m6556j(it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public Executor m6579a() {
        return this.f4935a.getExecutor();
    }

    /* JADX INFO: renamed from: b */
    public C1182h m6580b() {
        return this.f4935a.mo6587a();
    }

    /* JADX INFO: renamed from: c */
    public List<C1183i> m6581c() {
        return this.f4935a.mo6589c();
    }

    /* JADX INFO: renamed from: d */
    public int m6582d() {
        return this.f4935a.mo6592f();
    }

    /* JADX INFO: renamed from: e */
    public CameraCaptureSession.StateCallback m6583e() {
        return this.f4935a.mo6588b();
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1189o) {
            return this.f4935a.equals(((C1189o) obj).f4935a);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public void m6584f(C1182h c1182h) {
        this.f4935a.mo6590d(c1182h);
    }

    /* JADX INFO: renamed from: g */
    public void m6585g(CaptureRequest captureRequest) {
        this.f4935a.mo6593g(captureRequest);
    }

    public int hashCode() {
        return this.f4935a.hashCode();
    }

    /* JADX INFO: renamed from: j */
    public Object m6586j() {
        return this.f4935a.mo6591e();
    }

    /* JADX INFO: renamed from: b0.o$a */
    public static final class a implements c {

        /* JADX INFO: renamed from: a */
        public final SessionConfiguration f4936a;

        /* JADX INFO: renamed from: b */
        public final List<C1183i> f4937b;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public a(Object obj) {
            SessionConfiguration sessionConfiguration = (SessionConfiguration) obj;
            this.f4936a = sessionConfiguration;
            this.f4937b = Collections.unmodifiableList(C1189o.m6578i(sessionConfiguration.getOutputConfigurations()));
        }

        @Override // p020b0.C1189o.c
        /* JADX INFO: renamed from: a */
        public C1182h mo6587a() {
            return C1182h.m6553b(this.f4936a.getInputConfiguration());
        }

        @Override // p020b0.C1189o.c
        /* JADX INFO: renamed from: b */
        public CameraCaptureSession.StateCallback mo6588b() {
            return this.f4936a.getStateCallback();
        }

        @Override // p020b0.C1189o.c
        /* JADX INFO: renamed from: c */
        public List<C1183i> mo6589c() {
            return this.f4937b;
        }

        @Override // p020b0.C1189o.c
        /* JADX INFO: renamed from: d */
        public void mo6590d(C1182h c1182h) {
            this.f4936a.setInputConfiguration((InputConfiguration) c1182h.m6554a());
        }

        @Override // p020b0.C1189o.c
        /* JADX INFO: renamed from: e */
        public Object mo6591e() {
            return this.f4936a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return Objects.equals(this.f4936a, ((a) obj).f4936a);
            }
            return false;
        }

        @Override // p020b0.C1189o.c
        /* JADX INFO: renamed from: f */
        public int mo6592f() {
            return this.f4936a.getSessionType();
        }

        @Override // p020b0.C1189o.c
        /* JADX INFO: renamed from: g */
        public void mo6593g(CaptureRequest captureRequest) {
            this.f4936a.setSessionParameters(captureRequest);
        }

        @Override // p020b0.C1189o.c
        public Executor getExecutor() {
            return this.f4936a.getExecutor();
        }

        public int hashCode() {
            return this.f4936a.hashCode();
        }

        public a(int i10, List<C1183i> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this(new SessionConfiguration(i10, C1189o.m6577h(list), executor, stateCallback));
        }
    }
}
