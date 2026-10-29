package p281m0;

import android.graphics.Bitmap;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import androidx.camera.core.InterfaceC0494d;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import p140g0.C5883f1;
import p140g0.C5891h1;
import p140g0.C5931r1;
import p296n0.C8782k3;
import p366q0.C10417c;
import p454u0.C11766b;
import p503w0.C12272b;
import p531x0.AbstractC12578b0;
import p531x0.C12615u;
import p531x0.C12623y;
import p531x0.InterfaceC12576a0;
import p533x2.C12637g;
import p533x2.InterfaceC12631a;

/* JADX INFO: renamed from: m0.u0 */
/* JADX INFO: loaded from: classes.dex */
public class C8325u0 {

    /* JADX INFO: renamed from: a */
    public final Executor f30679a;

    /* JADX INFO: renamed from: b */
    public final C12623y f30680b;

    /* JADX INFO: renamed from: c */
    public final CameraCharacteristics f30681c;

    /* JADX INFO: renamed from: d */
    public C8332y f30682d;

    /* JADX INFO: renamed from: e */
    public a f30683e;

    /* JADX INFO: renamed from: f */
    public InterfaceC12576a0<b, AbstractC12578b0<InterfaceC0494d>> f30684f;

    /* JADX INFO: renamed from: g */
    public InterfaceC12576a0<C8276b0.a, AbstractC12578b0<byte[]>> f30685g;

    /* JADX INFO: renamed from: h */
    public InterfaceC12576a0<C8302k.b, AbstractC12578b0<byte[]>> f30686h;

    /* JADX INFO: renamed from: i */
    public InterfaceC12576a0<C8288f0.a, C5883f1.i> f30687i;

    /* JADX INFO: renamed from: j */
    public InterfaceC12576a0<AbstractC12578b0<byte[]>, AbstractC12578b0<Bitmap>> f30688j;

    /* JADX INFO: renamed from: k */
    public InterfaceC12576a0<AbstractC12578b0<InterfaceC0494d>, InterfaceC0494d> f30689k;

    /* JADX INFO: renamed from: l */
    public InterfaceC12576a0<AbstractC12578b0<byte[]>, AbstractC12578b0<InterfaceC0494d>> f30690l;

    /* JADX INFO: renamed from: m */
    public InterfaceC12576a0<AbstractC12578b0<InterfaceC0494d>, Bitmap> f30691m;

    /* JADX INFO: renamed from: n */
    public InterfaceC12576a0<AbstractC12578b0<Bitmap>, AbstractC12578b0<Bitmap>> f30692n;

    /* JADX INFO: renamed from: o */
    public final C8782k3 f30693o;

    /* JADX INFO: renamed from: p */
    public final boolean f30694p;

    /* JADX INFO: renamed from: m0.u0$a */
    public static abstract class a {
        /* JADX INFO: renamed from: e */
        public static a m33801e(int i10, List<Integer> list) {
            return new C8290g(new C12615u(), new C12615u(), i10, list);
        }

        /* JADX INFO: renamed from: a */
        public abstract C12615u<b> mo33727a();

        /* JADX INFO: renamed from: b */
        public abstract int mo33728b();

        /* JADX INFO: renamed from: c */
        public abstract List<Integer> mo33729c();

        /* JADX INFO: renamed from: d */
        public abstract C12615u<b> mo33730d();
    }

    /* JADX INFO: renamed from: m0.u0$b */
    public static abstract class b {
        /* JADX INFO: renamed from: c */
        public static b m33802c(C8327v0 c8327v0, InterfaceC0494d interfaceC0494d) {
            return new C8293h(c8327v0, interfaceC0494d);
        }

        /* JADX INFO: renamed from: a */
        public abstract InterfaceC0494d mo33732a();

        /* JADX INFO: renamed from: b */
        public abstract C8327v0 mo33733b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C8325u0(Executor executor, CameraCharacteristics cameraCharacteristics, C12623y c12623y) {
        this(executor, cameraCharacteristics, c12623y, C11766b.m44047c());
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m33784b(final C8325u0 c8325u0, final b bVar) {
        c8325u0.getClass();
        if (bVar.mo33733b().m33814l()) {
            bVar.mo33732a().close();
        } else {
            c8325u0.f30679a.execute(new Runnable() { // from class: m0.p0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f30664a.m33793k(bVar);
                }
            });
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m33786d(final C8325u0 c8325u0, final b bVar) {
        c8325u0.getClass();
        if (!bVar.mo33733b().m33814l()) {
            c8325u0.f30679a.execute(new Runnable() { // from class: m0.o0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f30661a.m33795m(bVar);
                }
            });
        } else {
            C5931r1.m26572l("ProcessingNode", "The postview image is closed due to request aborted");
            bVar.mo33732a().close();
        }
    }

    /* JADX INFO: renamed from: i */
    public final AbstractC12578b0<byte[]> m33791i(AbstractC12578b0<byte[]> abstractC12578b0, int i10) {
        C12637g.m47077i(C12272b.m45561j(abstractC12578b0.mo46931e()));
        AbstractC12578b0<Bitmap> abstractC12578b0Apply = this.f30688j.apply(abstractC12578b0);
        InterfaceC12576a0<AbstractC12578b0<Bitmap>, AbstractC12578b0<Bitmap>> interfaceC12576a0 = this.f30692n;
        if (interfaceC12576a0 != null) {
            abstractC12578b0Apply = interfaceC12576a0.apply(abstractC12578b0Apply);
        }
        return this.f30686h.apply(C8302k.b.m33754c(abstractC12578b0Apply, i10));
    }

    /* JADX INFO: renamed from: j */
    public InterfaceC0494d m33792j(b bVar) {
        C8327v0 c8327v0Mo33733b = bVar.mo33733b();
        AbstractC12578b0<InterfaceC0494d> abstractC12578b0Apply = this.f30684f.apply(bVar);
        List<Integer> listMo33729c = this.f30683e.mo33729c();
        C12637g.m47069a(!listMo33729c.isEmpty());
        int iIntValue = listMo33729c.get(0).intValue();
        if ((abstractC12578b0Apply.mo46931e() == 35 || this.f30692n != null || this.f30694p) && iIntValue == 256) {
            AbstractC12578b0<byte[]> abstractC12578b0Apply2 = this.f30685g.apply(C8276b0.a.m33683c(abstractC12578b0Apply, c8327v0Mo33733b.m33805c()));
            if (this.f30692n != null) {
                abstractC12578b0Apply2 = m33791i(abstractC12578b0Apply2, c8327v0Mo33733b.m33805c());
            }
            abstractC12578b0Apply = this.f30690l.apply(abstractC12578b0Apply2);
        }
        InterfaceC0494d interfaceC0494dApply = this.f30689k.apply(abstractC12578b0Apply);
        if (listMo33729c.size() > 1) {
            c8327v0Mo33733b.m33813k().m33774u(interfaceC0494dApply.getFormat(), true);
        }
        return interfaceC0494dApply;
    }

    /* JADX INFO: renamed from: k */
    public void m33793k(b bVar) {
        final C8327v0 c8327v0Mo33733b = bVar.mo33733b();
        try {
            boolean z10 = true;
            if (this.f30683e.mo33729c().size() <= 1) {
                z10 = false;
            }
            if (bVar.mo33733b().m33815m()) {
                final InterfaceC0494d interfaceC0494dM33792j = m33792j(bVar);
                C10417c.m40084e().execute(new Runnable() { // from class: m0.q0
                    @Override // java.lang.Runnable
                    public final void run() {
                        c8327v0Mo33733b.m33819q(interfaceC0494dM33792j);
                    }
                });
                return;
            }
            final C5883f1.i iVarM33794l = m33794l(bVar);
            if (z10 && !c8327v0Mo33733b.m33813k().m33773s()) {
                return;
            }
            C10417c.m40084e().execute(new Runnable() { // from class: m0.r0
                @Override // java.lang.Runnable
                public final void run() {
                    c8327v0Mo33733b.m33820r(iVarM33794l);
                }
            });
        } catch (C5891h1 e10) {
            m33799q(c8327v0Mo33733b, e10);
        } catch (OutOfMemoryError e11) {
            m33799q(c8327v0Mo33733b, new C5891h1(0, "Processing failed due to low memory.", e11));
        } catch (RuntimeException e12) {
            m33799q(c8327v0Mo33733b, new C5891h1(0, "Processing failed.", e12));
        }
    }

    /* JADX INFO: renamed from: l */
    public C5883f1.i m33794l(b bVar) throws C5891h1 {
        List<Integer> listMo33729c = this.f30683e.mo33729c();
        C12637g.m47069a(!listMo33729c.isEmpty());
        boolean z10 = false;
        Integer num = listMo33729c.get(0);
        int iIntValue = num.intValue();
        C12637g.m47070b(C12272b.m45561j(iIntValue) || C12272b.m45562k(iIntValue), String.format("On-disk capture only support JPEG and JPEG/R and RAW output formats. Output format: %s", num));
        C8327v0 c8327v0Mo33733b = bVar.mo33733b();
        C12637g.m47070b(c8327v0Mo33733b.m33806d() != null, "OutputFileOptions cannot be empty");
        AbstractC12578b0<InterfaceC0494d> abstractC12578b0Apply = this.f30684f.apply(bVar);
        if (listMo33729c.size() <= 1) {
            if (iIntValue != 32) {
                C5883f1.h hVarM33806d = c8327v0Mo33733b.m33806d();
                Objects.requireNonNull(hVarM33806d);
                return m33797o(abstractC12578b0Apply, hVarM33806d, c8327v0Mo33733b.m33805c());
            }
            C5883f1.h hVarM33806d2 = c8327v0Mo33733b.m33806d();
            Objects.requireNonNull(hVarM33806d2);
            return m33798p(abstractC12578b0Apply, hVarM33806d2);
        }
        if (c8327v0Mo33733b.m33806d() != null && c8327v0Mo33733b.m33809g() != null) {
            z10 = true;
        }
        C12637g.m47070b(z10, "The number of OutputFileOptions for simultaneous capture should be at least two");
        if (abstractC12578b0Apply.mo46931e() != 32) {
            C5883f1.h hVarM33809g = c8327v0Mo33733b.m33809g();
            Objects.requireNonNull(hVarM33809g);
            C5883f1.i iVarM33797o = m33797o(abstractC12578b0Apply, hVarM33809g, c8327v0Mo33733b.m33805c());
            c8327v0Mo33733b.m33813k().m33774u(256, true);
            return iVarM33797o;
        }
        C5883f1.h hVarM33806d3 = c8327v0Mo33733b.m33806d();
        Objects.requireNonNull(hVarM33806d3);
        C5883f1.i iVarM33798p = m33798p(abstractC12578b0Apply, hVarM33806d3);
        c8327v0Mo33733b.m33813k().m33774u(32, true);
        return iVarM33798p;
    }

    /* JADX INFO: renamed from: m */
    public void m33795m(b bVar) {
        final C8327v0 c8327v0Mo33733b = bVar.mo33733b();
        try {
            AbstractC12578b0<InterfaceC0494d> abstractC12578b0Apply = this.f30684f.apply(bVar);
            int iMo46931e = abstractC12578b0Apply.mo46931e();
            C12637g.m47070b(iMo46931e == 35 || iMo46931e == 256 || iMo46931e == 4101, String.format("Postview only supports to convert YUV, JPEG and JPEG_R format image to the postview output bitmap. Image format: %s", Integer.valueOf(iMo46931e)));
            final Bitmap bitmapApply = this.f30691m.apply(abstractC12578b0Apply);
            C10417c.m40084e().execute(new Runnable() { // from class: m0.s0
                @Override // java.lang.Runnable
                public final void run() {
                    c8327v0Mo33733b.m33822t(bitmapApply);
                }
            });
        } catch (Exception e10) {
            bVar.mo33732a().close();
            C5931r1.m26564d("ProcessingNode", "process postview input packet failed.", e10);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m33796n() {
    }

    /* JADX INFO: renamed from: o */
    public final C5883f1.i m33797o(AbstractC12578b0<InterfaceC0494d> abstractC12578b0, C5883f1.h hVar, int i10) {
        AbstractC12578b0<byte[]> abstractC12578b0Apply = this.f30685g.apply(C8276b0.a.m33683c(abstractC12578b0, i10));
        if (abstractC12578b0Apply.m46939i() || this.f30692n != null) {
            abstractC12578b0Apply = m33791i(abstractC12578b0Apply, i10);
        }
        InterfaceC12576a0<C8288f0.a, C5883f1.i> interfaceC12576a0 = this.f30687i;
        Objects.requireNonNull(hVar);
        return interfaceC12576a0.apply(C8288f0.a.m33718c(abstractC12578b0Apply, hVar));
    }

    /* JADX INFO: renamed from: p */
    public final C5883f1.i m33798p(AbstractC12578b0<InterfaceC0494d> abstractC12578b0, C5883f1.h hVar) throws C5891h1 {
        if (this.f30682d == null) {
            if (this.f30681c == null) {
                throw new C5891h1(0, "CameraCharacteristics is null, DngCreator cannot be created", null);
            }
            if (abstractC12578b0.mo46927a().mo35073e() == null) {
                throw new C5891h1(0, "CameraCaptureResult is null, DngCreator cannot be created", null);
            }
            CameraCharacteristics cameraCharacteristics = this.f30681c;
            Objects.requireNonNull(cameraCharacteristics);
            CaptureResult captureResultMo35073e = abstractC12578b0.mo46927a().mo35073e();
            Objects.requireNonNull(captureResultMo35073e);
            this.f30682d = new C8332y(cameraCharacteristics, captureResultMo35073e);
        }
        C8332y c8332y = this.f30682d;
        InterfaceC0494d interfaceC0494dMo46929c = abstractC12578b0.mo46929c();
        int iMo46932f = abstractC12578b0.mo46932f();
        Objects.requireNonNull(hVar);
        return c8332y.apply(C8332y.a.m33860d(interfaceC0494dMo46929c, iMo46932f, hVar));
    }

    /* JADX INFO: renamed from: q */
    public final void m33799q(final C8327v0 c8327v0, final C5891h1 c5891h1) {
        C10417c.m40084e().execute(new Runnable() { // from class: m0.t0
            @Override // java.lang.Runnable
            public final void run() {
                c8327v0.m33823u(c5891h1);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public Void m33800r(a aVar) {
        this.f30683e = aVar;
        aVar.mo33727a().m47004a(new InterfaceC12631a() { // from class: m0.m0
            @Override // p533x2.InterfaceC12631a
            public final void accept(Object obj) {
                C8325u0.m33784b(this.f30656a, (C8325u0.b) obj);
            }
        });
        aVar.mo33730d().m47004a(new InterfaceC12631a() { // from class: m0.n0
            @Override // p533x2.InterfaceC12631a
            public final void accept(Object obj) {
                C8325u0.m33786d(this.f30659a, (C8325u0.b) obj);
            }
        });
        this.f30684f = new C8306l0();
        this.f30685g = new C8276b0(this.f30693o);
        this.f30688j = new C8285e0();
        this.f30686h = new C8302k();
        this.f30687i = new C8288f0();
        this.f30689k = new C8294h0();
        this.f30691m = new C8273a0();
        if (aVar.mo33728b() == 35 || this.f30680b != null || this.f30694p) {
            this.f30690l = new C8291g0();
        }
        C12623y c12623y = this.f30680b;
        if (c12623y == null) {
            return null;
        }
        this.f30692n = new C8305l(c12623y);
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C8325u0(Executor executor, CameraCharacteristics cameraCharacteristics, C12623y c12623y, C8782k3 c8782k3) {
        if (C11766b.m44046b(LowMemoryQuirk.class) != null) {
            this.f30679a = C10417c.m40086g(executor);
        } else {
            this.f30679a = executor;
        }
        this.f30680b = c12623y;
        this.f30681c = cameraCharacteristics;
        this.f30693o = c8782k3;
        this.f30694p = c8782k3.m35233a(IncorrectJpegMetadataQuirk.class);
    }
}
