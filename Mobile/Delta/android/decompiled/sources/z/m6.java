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
    public final a0.c0 f37397a;
    public final Executor b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w0.f f37398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f37399d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f37400e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f37401f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f37402g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public androidx.camera.core.f f37403h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public n0.u1 f37404i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f37405j;

    public class a extends CameraCaptureSession.StateCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f37406a;

        public a(b bVar) {
            this.f37406a = bVar;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            Surface inputSurface = cameraCaptureSession.getInputSurface();
            if (inputSurface != null) {
                this.f37406a.d(t0.a.c(inputSurface, 1));
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ImageWriter f37407a;
        public final AtomicBoolean b = new AtomicBoolean(true);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Executor f37408c;

        public b(Executor executor) {
            this.f37408c = executor;
        }

        public void b() {
            this.b.set(false);
        }

        public boolean c(final androidx.camera.core.d dVar) {
            ImageWriter imageWriter;
            Image imageP = dVar.p();
            if (this.b.get() && (imageWriter = this.f37407a) != null && imageP != null) {
                try {
                    t0.a.d(imageWriter, imageP);
                    t0.a.e(this.f37407a, new ImageWriter.OnImageReleasedListener() { // from class: z.n6
                        @Override // android.media.ImageWriter.OnImageReleasedListener
                        public final void onImageReleased(ImageWriter imageWriter2) {
                            dVar.close();
                        }
                    }, this.f37408c);
                    return true;
                } catch (IllegalStateException e10) {
                    g0.r1.c("ZslControlImpl", "enqueueImageToImageWriter throws IllegalStateException = " + e10.getMessage());
                }
            }
            return false;
        }

        public void d(ImageWriter imageWriter) {
            if (this.b.get()) {
                if (this.f37407a != null) {
                    g0.r1.l("ZslControlImpl", "ImageWriter already existed in the ImageWriter holder. Closing the previous one.");
                    this.f37407a.close();
                }
                this.f37407a = imageWriter;
            }
        }

        public void e() {
            b();
            ImageWriter imageWriter = this.f37407a;
            if (imageWriter != null) {
                imageWriter.close();
            }
        }
    }

    public m6(a0.c0 c0Var, Executor executor) {
        this.f37401f = false;
        this.f37402g = false;
        this.f37397a = c0Var;
        this.b = executor;
        this.f37401f = o6.a(c0Var, 4);
        this.f37402g = c0.e.b(ZslDisablerQuirk.class) != null;
        this.f37398c = new w0.f(3, new w0.c.a() { // from class: z.l6
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
                m6Var.f37398c.b(dVarB);
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
    public void a(n0.o3.b bVar) {
        k();
        if (this.f37399d) {
            bVar.B(1);
            return;
        }
        if (this.f37402g) {
            bVar.B(1);
            return;
        }
        Map<Integer, Size> mapM = m(this.f37397a);
        if (!this.f37401f || mapM.isEmpty() || !mapM.containsKey(34) || !n(this.f37397a, 34)) {
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
        this.f37403h = fVar;
        this.f37404i = k2Var;
        this.f37405j = bVar2;
        fVar.f(new n0.j2.a() { // from class: z.j6
            @Override // n0.j2.a
            public final void a(n0.j2 j2Var) {
                m6.i(this.f37335a, j2Var);
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
    public void b() {
        k();
    }

    @Override // z.i6
    public boolean c() {
        return this.f37399d;
    }

    @Override // z.i6
    public void d(boolean z10) {
        this.f37400e = z10;
    }

    @Override // z.i6
    public void e(boolean z10) {
        if (this.f37399d != z10 && z10) {
            l();
        }
        this.f37399d = z10;
    }

    @Override // z.i6
    public androidx.camera.core.d f() {
        try {
            return this.f37398c.a();
        } catch (NoSuchElementException unused) {
            g0.r1.c("ZslControlImpl", "dequeueImageFromBuffer no such element");
            return null;
        }
    }

    @Override // z.i6
    public boolean g(androidx.camera.core.d dVar) {
        b bVar = this.f37405j;
        if (bVar != null) {
            return bVar.c(dVar);
        }
        return false;
    }

    @Override // z.i6
    public boolean h() {
        return this.f37400e;
    }

    public final void k() {
        androidx.camera.core.f fVar = this.f37403h;
        if (fVar != null) {
            fVar.d();
            this.f37403h = null;
        }
        b bVar = this.f37405j;
        if (bVar != null) {
            bVar.b();
            this.f37405j = null;
        }
        l();
        n0.u1 u1Var = this.f37404i;
        if (u1Var != null) {
            u1Var.d();
            this.f37404i = null;
        }
    }

    public final void l() {
        w0.f fVar = this.f37398c;
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
