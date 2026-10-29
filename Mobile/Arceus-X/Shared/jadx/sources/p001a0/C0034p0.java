package p001a0;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.util.ArrayMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import p347p0.C10099o;

/* JADX INFO: renamed from: a0.p0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0034p0 {

    /* JADX INFO: renamed from: a */
    public final b f67a;

    /* JADX INFO: renamed from: b */
    public final Map<String, C0008c0> f68b = new ArrayMap(4);

    /* JADX INFO: renamed from: a0.p0$a */
    public static final class a extends CameraManager.AvailabilityCallback {

        /* JADX INFO: renamed from: a */
        public final Executor f69a;

        /* JADX INFO: renamed from: b */
        public final CameraManager.AvailabilityCallback f70b;

        /* JADX INFO: renamed from: c */
        public final Object f71c = new Object();

        /* JADX INFO: renamed from: d */
        public boolean f72d = false;

        public a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
            this.f69a = executor;
            this.f70b = availabilityCallback;
        }

        /* JADX INFO: renamed from: d */
        public void m74d() {
            synchronized (this.f71c) {
                this.f72d = true;
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAccessPrioritiesChanged() {
            synchronized (this.f71c) {
                try {
                    if (!this.f72d) {
                        this.f69a.execute(new Runnable() { // from class: a0.n0
                            @Override // java.lang.Runnable
                            public final void run() {
                                C0011e.m29a(this.f60a.f70b);
                            }
                        });
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(final String str) {
            synchronized (this.f71c) {
                try {
                    if (!this.f72d) {
                        this.f69a.execute(new Runnable() { // from class: a0.m0
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f55a.f70b.onCameraAvailable(str);
                            }
                        });
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(final String str) {
            synchronized (this.f71c) {
                try {
                    if (!this.f72d) {
                        this.f69a.execute(new Runnable() { // from class: a0.o0
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f63a.f70b.onCameraUnavailable(str);
                            }
                        });
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a0.p0$b */
    public interface b {
        /* JADX INFO: renamed from: h */
        static b m75h(Context context, Handler handler) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                return new C0040s0(context);
            }
            if (i10 >= 29) {
                return new C0038r0(context);
            }
            return i10 >= 28 ? C0036q0.m83j(context) : C0042t0.m87i(context, handler);
        }

        /* JADX INFO: renamed from: a */
        CameraManager mo76a();

        /* JADX INFO: renamed from: b */
        void mo77b(Executor executor, CameraManager.AvailabilityCallback availabilityCallback);

        /* JADX INFO: renamed from: c */
        CameraCharacteristics mo78c(String str);

        /* JADX INFO: renamed from: d */
        Set<Set<String>> mo79d();

        /* JADX INFO: renamed from: e */
        void mo80e(String str, Executor executor, CameraDevice.StateCallback stateCallback);

        /* JADX INFO: renamed from: f */
        String[] mo81f();

        /* JADX INFO: renamed from: g */
        void mo82g(CameraManager.AvailabilityCallback availabilityCallback);
    }

    public C0034p0(b bVar) {
        this.f67a = bVar;
    }

    /* JADX INFO: renamed from: a */
    public static C0034p0 m62a(Context context) {
        return m63b(context, C10099o.m38990a());
    }

    /* JADX INFO: renamed from: b */
    public static C0034p0 m63b(Context context, Handler handler) {
        return new C0034p0(b.m75h(context, handler));
    }

    /* JADX INFO: renamed from: c */
    public C0008c0 m64c(String str) {
        C0008c0 c0008c0M8k;
        synchronized (this.f68b) {
            c0008c0M8k = this.f68b.get(str);
            if (c0008c0M8k == null) {
                try {
                    c0008c0M8k = C0008c0.m8k(this.f67a.mo78c(str), str);
                    this.f68b.put(str, c0008c0M8k);
                } catch (AssertionError e10) {
                    throw new C0013f(10002, e10.getMessage(), e10);
                }
            }
        }
        return c0008c0M8k;
    }

    /* JADX INFO: renamed from: d */
    public String[] m65d() {
        return this.f67a.mo81f();
    }

    /* JADX INFO: renamed from: e */
    public Set<Set<String>> m66e() {
        return this.f67a.mo79d();
    }

    /* JADX INFO: renamed from: f */
    public void m67f(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        this.f67a.mo80e(str, executor, stateCallback);
    }

    /* JADX INFO: renamed from: g */
    public void m68g(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.f67a.mo77b(executor, availabilityCallback);
    }

    /* JADX INFO: renamed from: h */
    public void m69h(CameraManager.AvailabilityCallback availabilityCallback) {
        this.f67a.mo82g(availabilityCallback);
    }

    /* JADX INFO: renamed from: i */
    public CameraManager m70i() {
        return this.f67a.mo76a();
    }
}
