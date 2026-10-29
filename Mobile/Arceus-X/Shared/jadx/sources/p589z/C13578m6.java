package p589z;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageWriter;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk;
import androidx.camera.core.C0495e;
import androidx.camera.core.C0496f;
import androidx.camera.core.InterfaceC0494d;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p001a0.C0008c0;
import p036c0.C1500e;
import p140g0.C5931r1;
import p296n0.AbstractC8830u1;
import p296n0.C8781k2;
import p296n0.C8802o3;
import p296n0.InterfaceC8775j2;
import p347p0.C10089e;
import p366q0.C10417c;
import p437t0.C11465a;
import p503w0.C12276f;
import p503w0.InterfaceC12273c;

/* JADX INFO: renamed from: z.m6 */
/* JADX INFO: loaded from: classes.dex */
public final class C13578m6 implements InterfaceC13546i6 {

    /* JADX INFO: renamed from: a */
    public final C0008c0 f47535a;

    /* JADX INFO: renamed from: b */
    public final Executor f47536b;

    /* JADX INFO: renamed from: c */
    public final C12276f f47537c;

    /* JADX INFO: renamed from: d */
    public boolean f47538d = false;

    /* JADX INFO: renamed from: e */
    public boolean f47539e = false;

    /* JADX INFO: renamed from: f */
    public boolean f47540f;

    /* JADX INFO: renamed from: g */
    public boolean f47541g;

    /* JADX INFO: renamed from: h */
    public C0496f f47542h;

    /* JADX INFO: renamed from: i */
    public AbstractC8830u1 f47543i;

    /* JADX INFO: renamed from: j */
    public b f47544j;

    /* JADX INFO: renamed from: z.m6$a */
    public class a extends CameraCaptureSession.StateCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ b f47545a;

        public a(b bVar) {
            this.f47545a = bVar;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            Surface inputSurface = cameraCaptureSession.getInputSurface();
            if (inputSurface != null) {
                this.f47545a.m49532d(C11465a.m42941c(inputSurface, 1));
            }
        }
    }

    /* JADX INFO: renamed from: z.m6$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public ImageWriter f47547a;

        /* JADX INFO: renamed from: b */
        public final AtomicBoolean f47548b = new AtomicBoolean(true);

        /* JADX INFO: renamed from: c */
        public final Executor f47549c;

        public b(Executor executor) {
            this.f47549c = executor;
        }

        /* JADX INFO: renamed from: b */
        public void m49530b() {
            this.f47548b.set(false);
        }

        /* JADX INFO: renamed from: c */
        public boolean m49531c(final InterfaceC0494d interfaceC0494d) {
            ImageWriter imageWriter;
            Image imageMo2194p = interfaceC0494d.mo2194p();
            if (this.f47548b.get() && (imageWriter = this.f47547a) != null && imageMo2194p != null) {
                try {
                    C11465a.m42942d(imageWriter, imageMo2194p);
                    C11465a.m42943e(this.f47547a, new ImageWriter.OnImageReleasedListener() { // from class: z.n6
                        @Override // android.media.ImageWriter.OnImageReleasedListener
                        public final void onImageReleased(ImageWriter imageWriter2) {
                            interfaceC0494d.close();
                        }
                    }, this.f47549c);
                    return true;
                } catch (IllegalStateException e10) {
                    C5931r1.m26563c("ZslControlImpl", "enqueueImageToImageWriter throws IllegalStateException = " + e10.getMessage());
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: d */
        public void m49532d(ImageWriter imageWriter) {
            if (this.f47548b.get()) {
                if (this.f47547a != null) {
                    C5931r1.m26572l("ZslControlImpl", "ImageWriter already existed in the ImageWriter holder. Closing the previous one.");
                    this.f47547a.close();
                }
                this.f47547a = imageWriter;
            }
        }

        /* JADX INFO: renamed from: e */
        public void m49533e() {
            m49530b();
            ImageWriter imageWriter = this.f47547a;
            if (imageWriter != null) {
                imageWriter.close();
            }
        }
    }

    public C13578m6(C0008c0 c0008c0, Executor executor) {
        this.f47540f = false;
        this.f47541g = false;
        this.f47535a = c0008c0;
        this.f47536b = executor;
        this.f47540f = C13594o6.m49565a(c0008c0, 4);
        this.f47541g = C1500e.m7653b(ZslDisablerQuirk.class) != null;
        this.f47537c = new C12276f(3, new InterfaceC12273c.a() { // from class: z.l6
            @Override // p503w0.InterfaceC12273c.a
            /* JADX INFO: renamed from: a */
            public final void mo45568a(Object obj) {
                ((InterfaceC0494d) obj).close();
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m49523i(C13578m6 c13578m6, InterfaceC8775j2 interfaceC8775j2) {
        c13578m6.getClass();
        try {
            InterfaceC0494d interfaceC0494dMo2208b = interfaceC8775j2.mo2208b();
            if (interfaceC0494dMo2208b != null) {
                c13578m6.f47537c.mo45551b(interfaceC0494dMo2208b);
            }
        } catch (IllegalStateException e10) {
            C5931r1.m26563c("ZslControlImpl", "Failed to acquire latest image IllegalStateException = " + e10.getMessage());
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m49524j(C0496f c0496f, b bVar) {
        c0496f.m2225j();
        bVar.m49533e();
    }

    @Override // p589z.InterfaceC13546i6
    /* JADX INFO: renamed from: a */
    public void mo49452a(C8802o3.b bVar) {
        m49525k();
        if (this.f47538d) {
            bVar.m35314B(1);
            return;
        }
        if (this.f47541g) {
            bVar.m35314B(1);
            return;
        }
        Map<Integer, Size> mapM49527m = m49527m(this.f47535a);
        if (!this.f47540f || mapM49527m.isEmpty() || !mapM49527m.containsKey(34) || !m49528n(this.f47535a, 34)) {
            bVar.m35314B(1);
            return;
        }
        Size size = mapM49527m.get(34);
        C0495e c0495e = new C0495e(size.getWidth(), size.getHeight(), 34, 9);
        final C0496f c0496f = new C0496f(c0495e);
        Surface surface = c0496f.getSurface();
        Objects.requireNonNull(surface);
        C8781k2 c8781k2 = new C8781k2(surface, new Size(c0496f.getWidth(), c0496f.getHeight()), 34);
        final b bVar2 = new b(this.f47536b);
        this.f47542h = c0496f;
        this.f47543i = c8781k2;
        this.f47544j = bVar2;
        c0496f.mo2212f(new InterfaceC8775j2.a() { // from class: z.j6
            @Override // p296n0.InterfaceC8775j2.a
            /* JADX INFO: renamed from: a */
            public final void mo26326a(InterfaceC8775j2 interfaceC8775j2) {
                C13578m6.m49523i(this.f47462a, interfaceC8775j2);
            }
        }, C10417c.m40083d());
        c8781k2.m35437k().mo37173a(new Runnable() { // from class: z.k6
            @Override // java.lang.Runnable
            public final void run() {
                C13578m6.m49524j(c0496f, bVar2);
            }
        }, this.f47536b);
        bVar.m35327l(c8781k2);
        bVar.m35320e(c0495e.m2216m());
        bVar.m35326k(new a(bVar2));
        bVar.m35338x(new InputConfiguration(c0496f.getWidth(), c0496f.getHeight(), c0496f.mo2209c()));
    }

    @Override // p589z.InterfaceC13546i6
    /* JADX INFO: renamed from: b */
    public void mo49453b() {
        m49525k();
    }

    @Override // p589z.InterfaceC13546i6
    /* JADX INFO: renamed from: c */
    public boolean mo49454c() {
        return this.f47538d;
    }

    @Override // p589z.InterfaceC13546i6
    /* JADX INFO: renamed from: d */
    public void mo49455d(boolean z10) {
        this.f47539e = z10;
    }

    @Override // p589z.InterfaceC13546i6
    /* JADX INFO: renamed from: e */
    public void mo49456e(boolean z10) {
        if (this.f47538d != z10 && z10) {
            m49526l();
        }
        this.f47538d = z10;
    }

    @Override // p589z.InterfaceC13546i6
    /* JADX INFO: renamed from: f */
    public InterfaceC0494d mo49457f() {
        try {
            return this.f47537c.mo45550a();
        } catch (NoSuchElementException unused) {
            C5931r1.m26563c("ZslControlImpl", "dequeueImageFromBuffer no such element");
            return null;
        }
    }

    @Override // p589z.InterfaceC13546i6
    /* JADX INFO: renamed from: g */
    public boolean mo49458g(InterfaceC0494d interfaceC0494d) {
        b bVar = this.f47544j;
        if (bVar != null) {
            return bVar.m49531c(interfaceC0494d);
        }
        return false;
    }

    @Override // p589z.InterfaceC13546i6
    /* JADX INFO: renamed from: h */
    public boolean mo49459h() {
        return this.f47539e;
    }

    /* JADX INFO: renamed from: k */
    public final void m49525k() {
        C0496f c0496f = this.f47542h;
        if (c0496f != null) {
            c0496f.mo2210d();
            this.f47542h = null;
        }
        b bVar = this.f47544j;
        if (bVar != null) {
            bVar.m49530b();
            this.f47544j = null;
        }
        m49526l();
        AbstractC8830u1 abstractC8830u1 = this.f47543i;
        if (abstractC8830u1 != null) {
            abstractC8830u1.mo35430d();
            this.f47543i = null;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m49526l() {
        C12276f c12276f = this.f47537c;
        while (!c12276f.isEmpty()) {
            c12276f.mo45550a().close();
        }
    }

    /* JADX INFO: renamed from: m */
    public final Map<Integer, Size> m49527m(C0008c0 c0008c0) {
        StreamConfigurationMap streamConfigurationMap;
        try {
            streamConfigurationMap = (StreamConfigurationMap) c0008c0.m9a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        } catch (AssertionError e10) {
            C5931r1.m26563c("ZslControlImpl", "Failed to retrieve StreamConfigurationMap, error = " + e10.getMessage());
            streamConfigurationMap = null;
        }
        if (streamConfigurationMap == null || streamConfigurationMap.getInputFormats() == null) {
            return new HashMap();
        }
        HashMap map = new HashMap();
        for (int i10 : streamConfigurationMap.getInputFormats()) {
            Size[] inputSizes = streamConfigurationMap.getInputSizes(i10);
            if (inputSizes != null) {
                Arrays.sort(inputSizes, new C10089e(true));
                map.put(Integer.valueOf(i10), inputSizes[0]);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m49528n(C0008c0 c0008c0, int i10) {
        int[] validOutputFormatsForInput;
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) c0008c0.m9a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
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
