package p001a0;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: a0.q0 */
/* JADX INFO: loaded from: classes.dex */
public class C0036q0 extends C0042t0 {
    public C0036q0(Context context) {
        super(context, null);
    }

    /* JADX INFO: renamed from: j */
    public static C0036q0 m83j(Context context) {
        return new C0036q0(context);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m84l(Throwable th2) {
        StackTraceElement[] stackTrace;
        if (!th2.getClass().equals(RuntimeException.class) || (stackTrace = th2.getStackTrace()) == null || stackTrace.length < 0) {
            return false;
        }
        return "_enableShutterSound".equals(stackTrace[0].getMethodName());
    }

    @Override // p001a0.C0042t0, p001a0.C0034p0.b
    /* JADX INFO: renamed from: b */
    public void mo77b(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.f82a.registerAvailabilityCallback(executor, availabilityCallback);
    }

    @Override // p001a0.C0042t0, p001a0.C0034p0.b
    /* JADX INFO: renamed from: c */
    public CameraCharacteristics mo78c(String str) throws C0013f {
        try {
            return super.mo78c(str);
        } catch (RuntimeException e10) {
            if (m85k(e10)) {
                m86m(e10);
            }
            throw e10;
        }
    }

    @Override // p001a0.C0042t0, p001a0.C0034p0.b
    /* JADX INFO: renamed from: e */
    public void mo80e(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws C0013f {
        try {
            this.f82a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e10) {
            throw C0013f.m33e(e10);
        } catch (IllegalArgumentException e11) {
        } catch (SecurityException e12) {
            throw e12;
        } catch (RuntimeException e13) {
            if (m85k(e13)) {
                m86m(e13);
            }
            throw e13;
        }
    }

    @Override // p001a0.C0042t0, p001a0.C0034p0.b
    /* JADX INFO: renamed from: g */
    public void mo82g(CameraManager.AvailabilityCallback availabilityCallback) {
        this.f82a.unregisterAvailabilityCallback(availabilityCallback);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m85k(Throwable th2) {
        return Build.VERSION.SDK_INT == 28 && m84l(th2);
    }

    /* JADX INFO: renamed from: m */
    public final void m86m(Throwable th2) throws C0013f {
        throw new C0013f(10001, th2);
    }
}
