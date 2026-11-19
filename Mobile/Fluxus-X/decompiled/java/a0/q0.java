package a0;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class q0 extends t0 {
    public q0(Context context) {
        super(context, null);
    }

    public static q0 j(Context context) {
        return new q0(context);
    }

    public static boolean l(Throwable th2) {
        StackTraceElement[] stackTrace;
        if (!th2.getClass().equals(RuntimeException.class) || (stackTrace = th2.getStackTrace()) == null || stackTrace.length < 0) {
            return false;
        }
        return "_enableShutterSound".equals(stackTrace[0].getMethodName());
    }

    @Override // a0.t0, a0.p0.b
    public void b(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.f57a.registerAvailabilityCallback(executor, availabilityCallback);
    }

    @Override // a0.t0, a0.p0.b
    public CameraCharacteristics c(String str) throws f {
        try {
            return super.c(str);
        } catch (RuntimeException e10) {
            if (k(e10)) {
                m(e10);
            }
            throw e10;
        }
    }

    @Override // a0.t0, a0.p0.b
    public void e(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws f {
        try {
            this.f57a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e10) {
            throw f.e(e10);
        } catch (IllegalArgumentException e11) {
        } catch (SecurityException e12) {
            throw e12;
        } catch (RuntimeException e13) {
            if (k(e13)) {
                m(e13);
            }
            throw e13;
        }
    }

    @Override // a0.t0, a0.p0.b
    public void g(CameraManager.AvailabilityCallback availabilityCallback) {
        this.f57a.unregisterAvailabilityCallback(availabilityCallback);
    }

    public final boolean k(Throwable th2) {
        return Build.VERSION.SDK_INT == 28 && l(th2);
    }

    public final void m(Throwable th2) throws f {
        throw new f(10001, th2);
    }
}
