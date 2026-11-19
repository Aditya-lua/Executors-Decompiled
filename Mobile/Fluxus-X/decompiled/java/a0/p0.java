package a0;

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

/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f48a;
    public final Map<String, c0> b = new ArrayMap(4);

    public static final class a extends CameraManager.AvailabilityCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Executor f49a;
        public final CameraManager.AvailabilityCallback b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f50c = new Object();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f51d = false;

        public a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
            this.f49a = executor;
            this.b = availabilityCallback;
        }

        public void d() {
            synchronized (this.f50c) {
                this.f51d = true;
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAccessPrioritiesChanged() {
            synchronized (this.f50c) {
                try {
                    if (!this.f51d) {
                        this.f49a.execute(new Runnable() { // from class: a0.n0
                            @Override // java.lang.Runnable
                            public final void run() {
                                e.a(this.f44a.b);
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
            synchronized (this.f50c) {
                try {
                    if (!this.f51d) {
                        this.f49a.execute(new Runnable() { // from class: a0.m0
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f41a.b.onCameraAvailable(str);
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
            synchronized (this.f50c) {
                try {
                    if (!this.f51d) {
                        this.f49a.execute(new Runnable() { // from class: a0.o0
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f46a.b.onCameraUnavailable(str);
                            }
                        });
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public interface b {
        static b h(Context context, Handler handler) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                return new s0(context);
            }
            if (i10 >= 29) {
                return new r0(context);
            }
            return i10 >= 28 ? q0.j(context) : t0.i(context, handler);
        }

        CameraManager a();

        void b(Executor executor, CameraManager.AvailabilityCallback availabilityCallback);

        CameraCharacteristics c(String str);

        Set<Set<String>> d();

        void e(String str, Executor executor, CameraDevice.StateCallback stateCallback);

        String[] f();

        void g(CameraManager.AvailabilityCallback availabilityCallback);
    }

    public p0(b bVar) {
        this.f48a = bVar;
    }

    public static p0 a(Context context) {
        return b(context, p0.o.a());
    }

    public static p0 b(Context context, Handler handler) {
        return new p0(b.h(context, handler));
    }

    public c0 c(String str) {
        c0 c0VarK;
        synchronized (this.b) {
            c0VarK = this.b.get(str);
            if (c0VarK == null) {
                try {
                    c0VarK = c0.k(this.f48a.c(str), str);
                    this.b.put(str, c0VarK);
                } catch (AssertionError e10) {
                    throw new f(10002, e10.getMessage(), e10);
                }
            }
        }
        return c0VarK;
    }

    public String[] d() {
        return this.f48a.f();
    }

    public Set<Set<String>> e() {
        return this.f48a.d();
    }

    public void f(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        this.f48a.e(str, executor, stateCallback);
    }

    public void g(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.f48a.b(executor, availabilityCallback);
    }

    public void h(CameraManager.AvailabilityCallback availabilityCallback) {
        this.f48a.g(availabilityCallback);
    }

    public CameraManager i() {
        return this.f48a.a();
    }
}
