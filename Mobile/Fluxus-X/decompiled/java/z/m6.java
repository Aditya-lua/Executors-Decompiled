package z;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageWriter;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class m6 implements i6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0.c0 f38502a;
    public final Executor b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w0.f f38503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f38504d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f38505e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f38506f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f38507g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public androidx.camera.core.f f38508h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public n0.u1 f38509i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f38510j;

    public class a extends CameraCaptureSession.StateCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f38511a;

        public a(b bVar) {
            this.f38511a = bVar;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            Surface inputSurface = cameraCaptureSession.getInputSurface();
            if (inputSurface != null) {
                this.f38511a.d(t0.a.c(inputSurface, 1));
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ImageWriter f38512a;
        public final AtomicBoolean b = new AtomicBoolean(true);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Executor f38513c;

        public b(Executor executor) {
            this.f38513c = executor;
        }

        public void b() {
            this.b.set(false);
        }

        public boolean c(final androidx.camera.core.d dVar) {
            ImageWriter imageWriter;
            Image imageQ = dVar.q();
            if (this.b.get() && (imageWriter = this.f38512a) != null && imageQ != null) {
                try {
                    t0.a.d(imageWriter, imageQ);
                    t0.a.e(this.f38512a, new ImageWriter.OnImageReleasedListener() { // from class: z.n6
                        @Override // android.media.ImageWriter.OnImageReleasedListener
                        public final void onImageReleased(ImageWriter imageWriter2) {
                            dVar.close();
                        }
                    }, this.f38513c);
                    return true;
                } catch (IllegalStateException e10) {
                    g0.r1.c("ZslControlImpl", "enqueueImageToImageWriter throws IllegalStateException = " + e10.getMessage());
                }
            }
            return false;
        }

        public void d(ImageWriter imageWriter) {
            if (this.b.get()) {
                if (this.f38512a != null) {
                    g0.r1.l("ZslControlImpl", "ImageWriter already existed in the ImageWriter holder. Closing the previous one.");
                    this.f38512a.close();
                }
                this.f38512a = imageWriter;
            }
        }

        public void e() {
            b();
            ImageWriter imageWriter = this.f38512a;
            if (imageWriter != null) {
                imageWriter.close();
            }
        }
    }

    public m6(a0.c0 c0Var, Executor executor) {
        this.f38506f = false;
        this.f38507g = false;
        this.f38502a = c0Var;
        this.b = executor;
        this.f38506f = o6.a(c0Var, 4);
        this.f38507g = c0.e.b(ZslDisablerQuirk.class) != null;
        this.f38503c = new w0.f(3, new w0.c.a() { // from class: z.l6
            @Override // w0.c.a
            public final void a(Object obj) {
                ((androidx.camera.core.d) obj).close();
            }
        });
    }

    public static /* synthetic */ void i(m6 m6Var, n0.j2 j2Var) {
        m6Var.getClass();
        try {
            androidx.camera.core.d dVarB = j2Var.b();
            if (dVarB != null) {
                m6Var.f38503c.b(dVarB);
            }
        } catch (IllegalStateException e10) {
            g0.r1.c("ZslControlImpl", "Failed to acquire latest image IllegalStateException = " + e10.getMessage());
        }
    }

    public static /* synthetic */ void j(androidx.camera.core.f fVar, b bVar) {
        fVar.j();
        bVar.e();
    }

    @Override // z.i6
    public boolean a() {
        return this.f38504d;
    }

    @Override // z.i6
    public void b(n0.o3.b bVar) {
        k();
        if (this.f38504d) {
            bVar.B(1);
            return;
        }
        if (this.f38507g) {
            bVar.B(1);
            return;
        }
        Map<Integer, Size> mapM = m(this.f38502a);
        if (!this.f38506f || mapM.isEmpty() || !mapM.containsKey(34) || !n(this.f38502a, 34)) {
            bVar.B(1);
            return;
        }
        Size size = mapM.get(34);
        androidx.camera.core.e eVar = new androidx.camera.core.e(size.getWidth(), size.getHeight(), 34, 9);
        final androidx.camera.core.f fVar = new androidx.camera.core.f(eVar);
        Surface surface = fVar.getSurface();
        Objects.requireNonNull(surface);
        n0.k2 k2Var = new n0.k2(surface, new Size(fVar.getWidth(), fVar.getHeight()), 34);
        final b bVar2 = new b(this.b);
        this.f38508h = fVar;
        this.f38509i = k2Var;
        this.f38510j = bVar2;
        fVar.f(new n0.j2.a() { // from class: z.j6
            @Override // n0.j2.a
            public final void a(n0.j2 j2Var) {
                m6.i(this.f38440a, j2Var);
            }
        }, q0.c.d());
        k2Var.k().a(new Runnable() { // from class: z.k6
            @Override // java.lang.Runnable
            public final void run() {
                m6.j(fVar, bVar2);
            }
        }, this.b);
        bVar.l(k2Var);
        bVar.e(eVar.m());
        bVar.k(new a(bVar2));
        bVar.x(new InputConfiguration(fVar.getWidth(), fVar.getHeight(), fVar.c()));
    }

    @Override // z.i6
    public void c() {
        k();
    }

    @Override // z.i6
    public void d(boolean z10) {
        this.f38505e = z10;
    }

    @Override // z.i6
    public void e(boolean z10) {
        if (this.f38504d != z10 && z10) {
            l();
        }
        this.f38504d = z10;
    }

    @Override // z.i6
    public androidx.camera.core.d f() {
        try {
            return this.f38503c.a();
        } catch (NoSuchElementException unused) {
            g0.r1.c("ZslControlImpl", "dequeueImageFromBuffer no such element");
            return null;
        }
    }

    @Override // z.i6
    public boolean g(androidx.camera.core.d dVar) {
        b bVar = this.f38510j;
        if (bVar != null) {
            return bVar.c(dVar);
        }
        return false;
    }

    @Override // z.i6
    public boolean h() {
        return this.f38505e;
    }

    public final void k() {
        androidx.camera.core.f fVar = this.f38508h;
        if (fVar != null) {
            fVar.d();
            this.f38508h = null;
        }
        b bVar = this.f38510j;
        if (bVar != null) {
            bVar.b();
            this.f38510j = null;
        }
        l();
        n0.u1 u1Var = this.f38509i;
        if (u1Var != null) {
            u1Var.d();
            this.f38509i = null;
        }
    }

    public final void l() {
        w0.f fVar = this.f38503c;
        while (!fVar.isEmpty()) {
            fVar.a().close();
        }
    }

    public final Map<Integer, Size> m(a0.c0 c0Var) {
        StreamConfigurationMap streamConfigurationMap;
        try {
            streamConfigurationMap = (StreamConfigurationMap) c0Var.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        } catch (AssertionError e10) {
            g0.r1.c("ZslControlImpl", "Failed to retrieve StreamConfigurationMap, error = " + e10.getMessage());
            streamConfigurationMap = null;
        }
        if (streamConfigurationMap == null || streamConfigurationMap.getInputFormats() == null) {
            return new HashMap();
        }
        HashMap map = new HashMap();
        for (int i10 : streamConfigurationMap.getInputFormats()) {
            Size[] inputSizes = streamConfigurationMap.getInputSizes(i10);
            if (inputSizes != null) {
                Arrays.sort(inputSizes, new p0.e(true));
                map.put(Integer.valueOf(i10), inputSizes[0]);
            }
        }
        return map;
    }

    public final boolean n(a0.c0 c0Var, int i10) {
        int[] validOutputFormatsForInput;
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) c0Var.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null || (validOutputFormatsForInput = streamConfigurationMap.getValidOutputFormatsForInput(i10)) == null) {
            return false;
        }
        for (int i11 : validOutputFormatsForInput) {
            if (i11 == 256) {
                return true;
            }
        }
        return false;
    }
}
