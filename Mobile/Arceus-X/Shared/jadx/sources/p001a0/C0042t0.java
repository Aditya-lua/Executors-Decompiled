package p001a0;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import p533x2.C12637g;

/* JADX INFO: renamed from: a0.t0 */
/* JADX INFO: loaded from: classes.dex */
public class C0042t0 implements C0034p0.b {

    /* JADX INFO: renamed from: a */
    public final CameraManager f82a;

    /* JADX INFO: renamed from: b */
    public final Object f83b;

    /* JADX INFO: renamed from: a0.t0$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final Map<CameraManager.AvailabilityCallback, C0034p0.a> f84a = new HashMap();

        /* JADX INFO: renamed from: b */
        public final Handler f85b;

        public a(Handler handler) {
            this.f85b = handler;
        }
    }

    public C0042t0(Context context, Object obj) {
        this.f82a = (CameraManager) context.getSystemService("camera");
        this.f83b = obj;
    }

    /* JADX INFO: renamed from: i */
    public static C0042t0 m87i(Context context, Handler handler) {
        return new C0042t0(context, new a(handler));
    }

    @Override // p001a0.C0034p0.b
    /* JADX INFO: renamed from: a */
    public CameraManager mo76a() {
        return this.f82a;
    }

    @Override // p001a0.C0034p0.b
    /* JADX INFO: renamed from: b */
    public void mo77b(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        C0034p0.a aVar;
        if (executor == null) {
            throw new IllegalArgumentException("executor was null");
        }
        a aVar2 = (a) this.f83b;
        if (availabilityCallback != null) {
            synchronized (aVar2.f84a) {
                try {
                    aVar = aVar2.f84a.get(availabilityCallback);
                    if (aVar == null) {
                        aVar = new C0034p0.a(executor, availabilityCallback);
                        aVar2.f84a.put(availabilityCallback, aVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            aVar = null;
        }
        this.f82a.registerAvailabilityCallback(aVar, aVar2.f85b);
    }

    @Override // p001a0.C0034p0.b
    /* JADX INFO: renamed from: c */
    public CameraCharacteristics mo78c(String str) throws C0013f {
        try {
            return this.f82a.getCameraCharacteristics(str);
        } catch (CameraAccessException e10) {
            throw C0013f.m33e(e10);
        }
    }

    @Override // p001a0.C0034p0.b
    /* JADX INFO: renamed from: d */
    public Set<Set<String>> mo79d() {
        return Collections.EMPTY_SET;
    }

    @Override // p001a0.C0034p0.b
    /* JADX INFO: renamed from: e */
    public void mo80e(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws C0013f {
        C12637g.m47075g(executor);
        C12637g.m47075g(stateCallback);
        try {
            this.f82a.openCamera(str, new C0010d0.b(executor, stateCallback), ((a) this.f83b).f85b);
        } catch (CameraAccessException e10) {
            throw C0013f.m33e(e10);
        }
    }

    @Override // p001a0.C0034p0.b
    /* JADX INFO: renamed from: f */
    public String[] mo81f() throws C0013f {
        try {
            return this.f82a.getCameraIdList();
        } catch (CameraAccessException e10) {
            throw C0013f.m33e(e10);
        }
    }

    @Override // p001a0.C0034p0.b
    /* JADX INFO: renamed from: g */
    public void mo82g(CameraManager.AvailabilityCallback availabilityCallback) {
        C0034p0.a aVarRemove;
        if (availabilityCallback != null) {
            a aVar = (a) this.f83b;
            synchronized (aVar.f84a) {
                aVarRemove = aVar.f84a.remove(availabilityCallback);
            }
        } else {
            aVarRemove = null;
        }
        if (aVarRemove != null) {
            aVarRemove.m74d();
        }
        this.f82a.unregisterAvailabilityCallback(aVarRemove);
    }
}
