package b0;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f3766a;

    public interface a {
        void a(long j10);

        void b(Surface surface);

        void c(long j10);

        void d(String str);

        String e();

        void f();

        void g(int i10);

        Surface getSurface();

        Object h();
    }

    public i(int i10, Surface surface) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            this.f3766a = new m(i10, surface);
        } else if (i11 >= 28) {
            this.f3766a = new l(i10, surface);
        } else {
            this.f3766a = new k(i10, surface);
        }
    }

    public static i j(Object obj) {
        a aVarJ;
        if (obj == null) {
            return null;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            aVarJ = m.k((OutputConfiguration) obj);
        } else {
            aVarJ = i10 >= 28 ? l.j((OutputConfiguration) obj) : k.i((OutputConfiguration) obj);
        }
        if (aVarJ == null) {
            return null;
        }
        return new i(aVarJ);
    }

    public void a(Surface surface) {
        this.f3766a.b(surface);
    }

    public void b() {
        this.f3766a.f();
    }

    public String c() {
        return this.f3766a.e();
    }

    public Surface d() {
        return this.f3766a.getSurface();
    }

    public void e(long j10) {
        this.f3766a.c(j10);
    }

    public boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f3766a.equals(((i) obj).f3766a);
        }
        return false;
    }

    public void f(int i10) {
        this.f3766a.g(i10);
    }

    public void g(String str) {
        this.f3766a.d(str);
    }

    public void h(long j10) {
        this.f3766a.a(j10);
    }

    public int hashCode() {
        return this.f3766a.hashCode();
    }

    public Object i() {
        return this.f3766a.h();
    }

    public i(OutputConfiguration outputConfiguration) {
        this.f3766a = m.k(outputConfiguration);
    }

    public i(a aVar) {
        this.f3766a = aVar;
    }
}
