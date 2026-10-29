package p020b0;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;

/* JADX INFO: renamed from: b0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1183i {

    /* JADX INFO: renamed from: a */
    public final a f4928a;

    /* JADX INFO: renamed from: b0.i$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo6566a(long j10);

        /* JADX INFO: renamed from: b */
        void mo6567b(Surface surface);

        /* JADX INFO: renamed from: c */
        void mo6568c(long j10);

        /* JADX INFO: renamed from: d */
        void mo6569d(String str);

        /* JADX INFO: renamed from: e */
        String mo6570e();

        /* JADX INFO: renamed from: f */
        void mo6571f();

        /* JADX INFO: renamed from: g */
        void mo6572g(int i10);

        Surface getSurface();

        /* JADX INFO: renamed from: h */
        Object mo6573h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1183i(int i10, Surface surface) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            this.f4928a = new C1187m(i10, surface);
        } else if (i11 >= 28) {
            this.f4928a = new C1186l(i10, surface);
        } else {
            this.f4928a = new C1185k(i10, surface);
        }
    }

    /* JADX INFO: renamed from: j */
    public static C1183i m6556j(Object obj) {
        a aVarM6575j;
        if (obj == null) {
            return null;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            aVarM6575j = C1187m.m6576k((OutputConfiguration) obj);
        } else {
            aVarM6575j = i10 >= 28 ? C1186l.m6575j((OutputConfiguration) obj) : C1185k.m6574i((OutputConfiguration) obj);
        }
        if (aVarM6575j == null) {
            return null;
        }
        return new C1183i(aVarM6575j);
    }

    /* JADX INFO: renamed from: a */
    public void m6557a(Surface surface) {
        this.f4928a.mo6567b(surface);
    }

    /* JADX INFO: renamed from: b */
    public void m6558b() {
        this.f4928a.mo6571f();
    }

    /* JADX INFO: renamed from: c */
    public String m6559c() {
        return this.f4928a.mo6570e();
    }

    /* JADX INFO: renamed from: d */
    public Surface m6560d() {
        return this.f4928a.getSurface();
    }

    /* JADX INFO: renamed from: e */
    public void m6561e(long j10) {
        this.f4928a.mo6568c(j10);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1183i) {
            return this.f4928a.equals(((C1183i) obj).f4928a);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public void m6562f(int i10) {
        this.f4928a.mo6572g(i10);
    }

    /* JADX INFO: renamed from: g */
    public void m6563g(String str) {
        this.f4928a.mo6569d(str);
    }

    /* JADX INFO: renamed from: h */
    public void m6564h(long j10) {
        this.f4928a.mo6566a(j10);
    }

    public int hashCode() {
        return this.f4928a.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public Object m6565i() {
        return this.f4928a.mo6573h();
    }

    public C1183i(OutputConfiguration outputConfiguration) {
        this.f4928a = C1187m.m6576k(outputConfiguration);
    }

    public C1183i(a aVar) {
        this.f4928a = aVar;
    }
}
