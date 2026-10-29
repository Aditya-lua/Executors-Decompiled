package p589z;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk;
import androidx.camera.core.impl.utils.SurfaceUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import ne.InterfaceFutureC9440x;
import p020b0.C1177c;
import p020b0.C1179e;
import p020b0.C1182h;
import p020b0.C1183i;
import p020b0.C1189o;
import p063d0.C4388s;
import p063d0.C4391v;
import p063d0.C4394y;
import p063d0.C4395z;
import p114f0.InterfaceC5230i;
import p140g0.C5902k0;
import p140g0.C5931r1;
import p296n0.AbstractC8828u;
import p296n0.AbstractC8830u1;
import p296n0.C8782k3;
import p296n0.C8785l1;
import p296n0.C8802o3;
import p301n5.C8884a;
import p366q0.C10417c;
import p397r0.C10763d;
import p397r0.C10773n;
import p397r0.InterfaceC10760a;
import p397r0.InterfaceC10762c;
import p533x2.C12637g;
import p561y.C12964a;
import p563y1.C12997c;

/* JADX INFO: renamed from: z.k3 */
/* JADX INFO: loaded from: classes.dex */
public final class C13559k3 implements InterfaceC13567l3 {

    /* JADX INFO: renamed from: a */
    public final Object f47466a;

    /* JADX INFO: renamed from: b */
    public final List<C8785l1> f47467b;

    /* JADX INFO: renamed from: c */
    public final d f47468c;

    /* JADX INFO: renamed from: d */
    public InterfaceC13537h5.a f47469d;

    /* JADX INFO: renamed from: e */
    public InterfaceC13537h5 f47470e;

    /* JADX INFO: renamed from: f */
    public C8802o3 f47471f;

    /* JADX INFO: renamed from: g */
    public final Map<AbstractC8830u1, Surface> f47472g;

    /* JADX INFO: renamed from: h */
    public List<AbstractC8830u1> f47473h;

    /* JADX INFO: renamed from: i */
    public c f47474i;

    /* JADX INFO: renamed from: j */
    public c f47475j;

    /* JADX INFO: renamed from: k */
    public InterfaceFutureC9440x<Void> f47476k;

    /* JADX INFO: renamed from: l */
    public C12997c.a<Void> f47477l;

    /* JADX INFO: renamed from: m */
    public Map<AbstractC8830u1, Long> f47478m;

    /* JADX INFO: renamed from: n */
    public final C4391v f47479n;

    /* JADX INFO: renamed from: o */
    public final C4395z f47480o;

    /* JADX INFO: renamed from: p */
    public final C4388s f47481p;

    /* JADX INFO: renamed from: q */
    public final C1179e f47482q;

    /* JADX INFO: renamed from: r */
    public final C4394y f47483r;

    /* JADX INFO: renamed from: s */
    public final boolean f47484s;

    /* JADX INFO: renamed from: t */
    public final InterfaceC5230i f47485t;

    /* JADX INFO: renamed from: z.k3$a */
    public class a implements InterfaceC10762c<Void> {
        public a() {
        }

        /* JADX DEBUG: Method merged with bridge method: onSuccess(Ljava/lang/Object;)V */
        @Override // p397r0.InterfaceC10762c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r8) {
        }

        @Override // p397r0.InterfaceC10762c
        public void onFailure(Throwable th2) {
            synchronized (C13559k3.this.f47466a) {
                try {
                    C13559k3.this.f47469d.stop();
                    int iOrdinal = C13559k3.this.f47475j.ordinal();
                    if ((iOrdinal == 4 || iOrdinal == 5 || iOrdinal == 6) && !(th2 instanceof CancellationException)) {
                        C5931r1.m26573m("CaptureSession", "Opening session with fail " + C13559k3.this.f47475j, th2);
                        C13559k3.this.m49489s();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    /* JADX INFO: renamed from: z.k3$b */
    public class b extends CameraCaptureSession.CaptureCallback {
        public b() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            synchronized (C13559k3.this.f47466a) {
                try {
                    C8802o3 c8802o3 = C13559k3.this.f47471f;
                    if (c8802o3 == null) {
                        return;
                    }
                    C8785l1 c8785l1M35306l = c8802o3.m35306l();
                    C5931r1.m26561a("CaptureSession", "Submit FLASH_MODE_OFF request");
                    C13559k3 c13559k3 = C13559k3.this;
                    c13559k3.mo49479b(Collections.singletonList(c13559k3.f47480o.m22067a(c8785l1M35306l)));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: z.k3$c */
    public enum c {
        UNINITIALIZED,
        RELEASED,
        INITIALIZED,
        GET_SURFACE,
        RELEASING,
        CLOSED,
        OPENING,
        OPENED
    }

    /* JADX INFO: renamed from: z.k3$d */
    public final class d extends InterfaceC13537h5.c {
        public d() {
        }

        @Override // p589z.InterfaceC13537h5.c
        /* JADX INFO: renamed from: s */
        public void mo49428s(InterfaceC13537h5 interfaceC13537h5) {
            synchronized (C13559k3.this.f47466a) {
                try {
                    switch (C13559k3.this.f47475j) {
                        case UNINITIALIZED:
                        case INITIALIZED:
                        case GET_SURFACE:
                        case OPENED:
                            throw new IllegalStateException("onConfigureFailed() should not be possible in state: " + C13559k3.this.f47475j);
                        case RELEASED:
                            C5931r1.m26561a("CaptureSession", "ConfigureFailed callback after change to RELEASED state");
                            break;
                        case RELEASING:
                        case CLOSED:
                        case OPENING:
                            C13559k3.this.m49489s();
                            break;
                    }
                    C5931r1.m26563c("CaptureSession", "CameraCaptureSession.onConfigureFailed() " + C13559k3.this.f47475j);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p589z.InterfaceC13537h5.c
        /* JADX INFO: renamed from: t */
        public void mo49429t(InterfaceC13537h5 interfaceC13537h5) {
            synchronized (C13559k3.this.f47466a) {
                try {
                    switch (C13559k3.this.f47475j) {
                        case UNINITIALIZED:
                        case RELEASED:
                        case INITIALIZED:
                        case GET_SURFACE:
                        case OPENED:
                            throw new IllegalStateException("onConfigured() should not be possible in state: " + C13559k3.this.f47475j);
                        case RELEASING:
                            interfaceC13537h5.close();
                            break;
                        case CLOSED:
                            C13559k3.this.f47470e = interfaceC13537h5;
                            break;
                        case OPENING:
                            C13559k3.this.m49477A(c.OPENED);
                            C13559k3.this.f47470e = interfaceC13537h5;
                            C5931r1.m26561a("CaptureSession", "Attempting to send capture request onConfigured");
                            C13559k3 c13559k3 = C13559k3.this;
                            c13559k3.m49494y(c13559k3.f47471f);
                            C13559k3.this.m49493x();
                            break;
                    }
                    C5931r1.m26561a("CaptureSession", "CameraCaptureSession.onConfigured() mState=" + C13559k3.this.f47475j);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p589z.InterfaceC13537h5.c
        /* JADX INFO: renamed from: u */
        public void mo49430u(InterfaceC13537h5 interfaceC13537h5) {
            synchronized (C13559k3.this.f47466a) {
                try {
                    if (C13559k3.this.f47475j.ordinal() == 0) {
                        throw new IllegalStateException("onReady() should not be possible in state: " + C13559k3.this.f47475j);
                    }
                    C5931r1.m26561a("CaptureSession", "CameraCaptureSession.onReady() " + C13559k3.this.f47475j);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p589z.InterfaceC13537h5.c
        /* JADX INFO: renamed from: v */
        public void mo49431v(InterfaceC13537h5 interfaceC13537h5) {
            synchronized (C13559k3.this.f47466a) {
                try {
                    if (C13559k3.this.f47475j == c.UNINITIALIZED) {
                        throw new IllegalStateException("onSessionFinished() should not be possible in state: " + C13559k3.this.f47475j);
                    }
                    C5931r1.m26561a("CaptureSession", "onSessionFinished()");
                    C13559k3.this.m49489s();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C13559k3(C1179e c1179e) {
        this(c1179e, false);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m49469j(C13559k3 c13559k3) {
        synchronized (c13559k3.f47466a) {
            if (c13559k3.f47467b.isEmpty()) {
                return;
            }
            try {
                c13559k3.m49492w(c13559k3.f47467b);
                c13559k3.f47467b.clear();
            } catch (Throwable th2) {
                c13559k3.f47467b.clear();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ Object m49470k(C13559k3 c13559k3, C12997c.a aVar) {
        String str;
        synchronized (c13559k3.f47466a) {
            C12637g.m47078j(c13559k3.f47477l == null, "Release completer expected to be null");
            c13559k3.f47477l = aVar;
            str = "Release[session=" + c13559k3 + "]";
        }
        return str;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m49472m(C13559k3 c13559k3, CameraCaptureSession cameraCaptureSession, int i10, boolean z10) {
        synchronized (c13559k3.f47466a) {
            try {
                if (c13559k3.f47475j == c.OPENED) {
                    c13559k3.m49494y(c13559k3.f47471f);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public static Map<C8802o3.f, C1183i> m49475r(Map<Integer, List<C8802o3.f>> map, Map<AbstractC8830u1, Surface> map2) {
        HashMap map3 = new HashMap();
        for (Integer num : map.keySet()) {
            num.intValue();
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            for (C8802o3.f fVar : map.get(num)) {
                SurfaceUtil.C0497a c0497aM2228a = SurfaceUtil.m2228a(map2.get(fVar.mo35348f()));
                if (i10 == 0) {
                    i10 = c0497aM2228a.f1811a;
                }
                C13519f3.m49231a();
                int i11 = c0497aM2228a.f1812b;
                int i12 = c0497aM2228a.f1813c;
                String strMo35346d = fVar.mo35346d();
                Objects.requireNonNull(strMo35346d);
                arrayList.add(C13511e3.m49220a(i11, i12, strMo35346d));
            }
            if (i10 == 0 || arrayList.isEmpty()) {
                C5931r1.m26563c("CaptureSession", "Skips to create instances for multi-resolution output. imageFormat: " + i10 + ", streamInfos size: " + arrayList.size());
            } else {
                List listCreateInstancesForMultiResolutionOutput = OutputConfiguration.createInstancesForMultiResolutionOutput(arrayList, i10);
                if (listCreateInstancesForMultiResolutionOutput != null) {
                    for (C8802o3.f fVar2 : map.get(num)) {
                        OutputConfiguration outputConfiguration = (OutputConfiguration) listCreateInstancesForMultiResolutionOutput.remove(0);
                        outputConfiguration.addSurface(map2.get(fVar2.mo35348f()));
                        map3.put(fVar2, new C1183i(outputConfiguration));
                    }
                }
            }
        }
        return map3;
    }

    /* JADX INFO: renamed from: v */
    public static Map<Integer, List<C8802o3.f>> m49476v(Collection<C8802o3.f> collection) {
        HashMap map = new HashMap();
        for (C8802o3.f fVar : collection) {
            if (fVar.mo35349g() > 0 && fVar.mo35347e().isEmpty()) {
                List arrayList = (List) map.get(Integer.valueOf(fVar.mo35349g()));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(Integer.valueOf(fVar.mo35349g()), arrayList);
                }
                arrayList.add(fVar);
            }
        }
        HashMap map2 = new HashMap();
        for (Integer num : map.keySet()) {
            num.intValue();
            if (((List) map.get(num)).size() >= 2) {
                map2.put(num, (List) map.get(num));
            }
        }
        return map2;
    }

    /* JADX INFO: renamed from: A */
    public final void m49477A(c cVar) {
        if (cVar.ordinal() > this.f47474i.ordinal()) {
            this.f47474i = cVar;
        }
        this.f47475j = cVar;
        if (!C8884a.m35751h() || this.f47474i.ordinal() < c.GET_SURFACE.ordinal()) {
            return;
        }
        C8884a.m35753j("CX:C2State[" + String.format("CaptureSession@%x", Integer.valueOf(hashCode())) + "]", cVar.ordinal());
    }

    @Override // p589z.InterfaceC13567l3
    /* JADX INFO: renamed from: a */
    public InterfaceFutureC9440x<Void> mo49478a(final C8802o3 c8802o3, final CameraDevice cameraDevice, InterfaceC13537h5.a aVar) {
        synchronized (this.f47466a) {
            try {
                if (this.f47475j.ordinal() == 2) {
                    m49477A(c.GET_SURFACE);
                    ArrayList arrayList = new ArrayList(c8802o3.m35310p());
                    this.f47473h = arrayList;
                    this.f47469d = aVar;
                    C10763d c10763dM40977g = C10763d.m40973c(aVar.mo49422j(arrayList, 5000L)).m40977g(new InterfaceC10760a() { // from class: z.i3
                        @Override // p397r0.InterfaceC10760a
                        public final InterfaceFutureC9440x apply(Object obj) {
                            return this.f47446a.m49495z((List) obj, c8802o3, cameraDevice);
                        }
                    }, this.f47469d.getExecutor());
                    C10773n.m40987j(c10763dM40977g, new a(), this.f47469d.getExecutor());
                    return C10773n.m40996s(c10763dM40977g);
                }
                C5931r1.m26563c("CaptureSession", "Open not allowed in state: " + this.f47475j);
                return C10773n.m40991n(new IllegalStateException("open() should not allow the state: " + this.f47475j));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p589z.InterfaceC13567l3
    /* JADX INFO: renamed from: b */
    public void mo49479b(List<C8785l1> list) {
        synchronized (this.f47466a) {
            try {
                switch (this.f47475j) {
                    case UNINITIALIZED:
                        throw new IllegalStateException("issueCaptureRequests() should not be possible in state: " + this.f47475j);
                    case RELEASED:
                    case RELEASING:
                    case CLOSED:
                        throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
                    case INITIALIZED:
                    case GET_SURFACE:
                    case OPENING:
                        this.f47467b.addAll(list);
                        break;
                    case OPENED:
                        this.f47467b.addAll(list);
                        m49493x();
                        break;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p589z.InterfaceC13567l3
    /* JADX INFO: renamed from: c */
    public boolean mo49480c() {
        boolean z10;
        synchronized (this.f47466a) {
            try {
                c cVar = this.f47475j;
                z10 = cVar == c.OPENED || cVar == c.OPENING;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // p589z.InterfaceC13567l3
    public void close() {
        synchronized (this.f47466a) {
            try {
                int iOrdinal = this.f47475j.ordinal();
                if (iOrdinal == 0) {
                    throw new IllegalStateException("close() should not be possible in state: " + this.f47475j);
                }
                if (iOrdinal == 2) {
                    m49477A(c.RELEASED);
                } else if (iOrdinal == 3) {
                    C12637g.m47076h(this.f47469d, "The Opener shouldn't null in state:" + this.f47475j);
                    this.f47469d.stop();
                    m49477A(c.RELEASED);
                } else if (iOrdinal == 6 || iOrdinal == 7) {
                    C12637g.m47076h(this.f47469d, "The Opener shouldn't null in state:" + this.f47475j);
                    this.f47469d.stop();
                    m49477A(c.CLOSED);
                    this.f47481p.m22058g();
                    this.f47471f = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p589z.InterfaceC13567l3
    /* JADX INFO: renamed from: d */
    public void mo49481d(C8802o3 c8802o3) {
        synchronized (this.f47466a) {
            try {
                switch (this.f47475j) {
                    case UNINITIALIZED:
                        throw new IllegalStateException("setSessionConfig() should not be possible in state: " + this.f47475j);
                    case RELEASED:
                    case RELEASING:
                    case CLOSED:
                        throw new IllegalStateException("Session configuration cannot be set on a closed/released session.");
                    case INITIALIZED:
                    case GET_SURFACE:
                    case OPENING:
                        this.f47471f = c8802o3;
                        break;
                    case OPENED:
                        this.f47471f = c8802o3;
                        if (c8802o3 == null) {
                            return;
                        }
                        if (!this.f47472g.keySet().containsAll(c8802o3.m35310p())) {
                            C5931r1.m26563c("CaptureSession", "Does not have the proper configured lists");
                            return;
                        } else {
                            C5931r1.m26561a("CaptureSession", "Attempting to submit CaptureRequest after setting");
                            m49494y(this.f47471f);
                        }
                        break;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p589z.InterfaceC13567l3
    /* JADX INFO: renamed from: e */
    public void mo49482e() {
        ArrayList arrayList;
        synchronized (this.f47466a) {
            try {
                if (this.f47467b.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(this.f47467b);
                    this.f47467b.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                C8785l1 c8785l1 = (C8785l1) obj;
                Iterator<AbstractC8828u> it = c8785l1.m35240c().iterator();
                while (it.hasNext()) {
                    it.next().mo35425a(c8785l1.m35243f());
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x0054 A[Catch: all -> 0x001a, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x000b, B:29:0x008d, B:8:0x0010, B:11:0x0016, B:17:0x0025, B:16:0x001e, B:18:0x002a, B:20:0x0054, B:21:0x0058, B:23:0x005c, B:24:0x0067, B:25:0x0069, B:27:0x006b, B:28:0x0088, B:32:0x0094, B:33:0x00ac), top: B:38:0x0003, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x005c A[Catch: all -> 0x001a, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x000b, B:29:0x008d, B:8:0x0010, B:11:0x0016, B:17:0x0025, B:16:0x001e, B:18:0x002a, B:20:0x0054, B:21:0x0058, B:23:0x005c, B:24:0x0067, B:25:0x0069, B:27:0x006b, B:28:0x0088, B:32:0x0094, B:33:0x00ac), top: B:38:0x0003, inners: #0 }] */
    @Override // p589z.InterfaceC13567l3
    /* JADX INFO: renamed from: f */
    public InterfaceFutureC9440x<Void> mo49483f(boolean z10) {
        synchronized (this.f47466a) {
            int iOrdinal = this.f47475j.ordinal();
            if (iOrdinal == 0) {
                throw new IllegalStateException("release() should not be possible in state: " + this.f47475j);
            }
            switch (iOrdinal) {
                case 2:
                    m49477A(c.RELEASED);
                    return C10773n.m40993p(null);
                case 3:
                    C12637g.m47076h(this.f47469d, "The Opener shouldn't null in state:" + this.f47475j);
                    this.f47469d.stop();
                    m49477A(c.RELEASED);
                    return C10773n.m40993p(null);
                case 4:
                    if (this.f47476k == null) {
                        this.f47476k = C12997c.m48311a(new C12997c.c() { // from class: z.h3
                            @Override // p563y1.C12997c.c
                            /* JADX INFO: renamed from: a */
                            public final Object mo22051a(C12997c.a aVar) {
                                return C13559k3.m49470k(this.f47401a, aVar);
                            }
                        });
                    }
                    return this.f47476k;
                case 5:
                case 7:
                    InterfaceC13537h5 interfaceC13537h5 = this.f47470e;
                    if (interfaceC13537h5 != null) {
                        if (z10) {
                            try {
                                interfaceC13537h5.mo49413e();
                            } catch (CameraAccessException e10) {
                                C5931r1.m26564d("CaptureSession", "Unable to abort captures.", e10);
                            }
                        }
                        this.f47470e.close();
                        break;
                    }
                    m49477A(c.RELEASING);
                    this.f47481p.m22058g();
                    C12637g.m47076h(this.f47469d, "The Opener shouldn't null in state:" + this.f47475j);
                    if (this.f47469d.stop()) {
                        m49489s();
                        return C10773n.m40993p(null);
                    }
                    if (this.f47476k == null) {
                        this.f47476k = C12997c.m48311a(new C12997c.c() { // from class: z.h3
                            @Override // p563y1.C12997c.c
                            /* JADX INFO: renamed from: a */
                            public final Object mo22051a(C12997c.a aVar) {
                                return C13559k3.m49470k(this.f47401a, aVar);
                            }
                        });
                    }
                    return this.f47476k;
                case 6:
                    m49477A(c.RELEASING);
                    this.f47481p.m22058g();
                    C12637g.m47076h(this.f47469d, "The Opener shouldn't null in state:" + this.f47475j);
                    if (this.f47469d.stop()) {
                        m49489s();
                        return C10773n.m40993p(null);
                    }
                    if (this.f47476k == null) {
                        this.f47476k = C12997c.m48311a(new C12997c.c() { // from class: z.h3
                            @Override // p563y1.C12997c.c
                            /* JADX INFO: renamed from: a */
                            public final Object mo22051a(C12997c.a aVar) {
                                return C13559k3.m49470k(this.f47401a, aVar);
                            }
                        });
                    }
                    return this.f47476k;
                default:
                    return C10773n.m40993p(null);
            }
        }
    }

    @Override // p589z.InterfaceC13567l3
    /* JADX INFO: renamed from: g */
    public List<C8785l1> mo49484g() {
        List<C8785l1> listUnmodifiableList;
        synchronized (this.f47466a) {
            listUnmodifiableList = Collections.unmodifiableList(this.f47467b);
        }
        return listUnmodifiableList;
    }

    @Override // p589z.InterfaceC13567l3
    /* JADX INFO: renamed from: h */
    public C8802o3 mo49485h() {
        C8802o3 c8802o3;
        synchronized (this.f47466a) {
            c8802o3 = this.f47471f;
        }
        return c8802o3;
    }

    @Override // p589z.InterfaceC13567l3
    /* JADX INFO: renamed from: i */
    public void mo49486i(Map<AbstractC8830u1, Long> map) {
        synchronized (this.f47466a) {
            this.f47478m = map;
        }
    }

    /* JADX INFO: renamed from: p */
    public final int m49487p(List<CaptureRequest> list, C13633u2 c13633u2) {
        C13633u2 c13633u3 = new C13633u2();
        int iMo49418m = -1;
        for (CaptureRequest captureRequest : list) {
            InterfaceC13537h5 interfaceC13537h5 = this.f47470e;
            Objects.requireNonNull(interfaceC13537h5);
            List<CaptureRequest> listMo49416i = interfaceC13537h5.mo49416i(captureRequest);
            Iterator<CaptureRequest> it = listMo49416i.iterator();
            while (it.hasNext()) {
                c13633u3.m49728a(it.next(), Collections.singletonList(new C13481a5(captureRequest, c13633u2)));
            }
            iMo49418m = this.f47470e.mo49418m(listMo49416i, c13633u3);
        }
        return iMo49418m;
    }

    /* JADX INFO: renamed from: q */
    public final CameraCaptureSession.CaptureCallback m49488q(List<AbstractC8828u> list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        Iterator<AbstractC8828u> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C13503d3.m49212a(it.next()));
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return C13477a1.m49166a(arrayList);
    }

    /* JADX INFO: renamed from: s */
    public void m49489s() {
        c cVar = this.f47475j;
        c cVar2 = c.RELEASED;
        if (cVar == cVar2) {
            C5931r1.m26561a("CaptureSession", "Skipping finishClose due to being state RELEASED.");
            return;
        }
        m49477A(cVar2);
        this.f47470e = null;
        C12997c.a<Void> aVar = this.f47477l;
        if (aVar != null) {
            aVar.m48314c(null);
            this.f47477l = null;
        }
    }

    /* JADX INFO: renamed from: t */
    public final C1183i m49490t(C8802o3.f fVar, Map<AbstractC8830u1, Surface> map, String str) {
        long jLongValue;
        DynamicRangeProfiles dynamicRangeProfilesM6546d;
        Surface surface = map.get(fVar.mo35348f());
        C12637g.m47076h(surface, "Surface in OutputConfig not found in configuredSurfaceMap.");
        C1183i c1183i = new C1183i(fVar.mo35349g(), surface);
        if (str != null) {
            c1183i.m6563g(str);
        } else {
            c1183i.m6563g(fVar.mo35346d());
        }
        if (fVar.mo35345c() == 0) {
            c1183i.m6562f(1);
        } else if (fVar.mo35345c() == 1) {
            c1183i.m6562f(2);
        }
        if (!fVar.mo35347e().isEmpty()) {
            c1183i.m6558b();
            Iterator<AbstractC8830u1> it = fVar.mo35347e().iterator();
            while (it.hasNext()) {
                Surface surface2 = map.get(it.next());
                C12637g.m47076h(surface2, "Surface in OutputConfig not found in configuredSurfaceMap.");
                c1183i.m6557a(surface2);
            }
        }
        if (Build.VERSION.SDK_INT < 33 || (dynamicRangeProfilesM6546d = this.f47482q.m6546d()) == null) {
            jLongValue = 1;
        } else {
            C5902k0 c5902k0Mo35344b = fVar.mo35344b();
            Long lM6539a = C1177c.m6539a(c5902k0Mo35344b, dynamicRangeProfilesM6546d);
            if (lM6539a == null) {
                C5931r1.m26563c("CaptureSession", "Requested dynamic range is not supported. Defaulting to STANDARD dynamic range profile.\nRequested dynamic range:\n  " + c5902k0Mo35344b);
                jLongValue = 1;
            } else {
                jLongValue = lM6539a.longValue();
            }
        }
        c1183i.m6561e(jLongValue);
        return c1183i;
    }

    /* JADX INFO: renamed from: u */
    public final List<C1183i> m49491u(List<C1183i> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C1183i c1183i : list) {
            if (!arrayList.contains(c1183i.m6560d())) {
                arrayList.add(c1183i.m6560d());
                arrayList2.add(c1183i);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: w */
    public int m49492w(List<C8785l1> list) {
        synchronized (this.f47466a) {
            try {
                if (this.f47475j != c.OPENED) {
                    C5931r1.m26561a("CaptureSession", "Skipping issueBurstCaptureRequest due to session closed");
                    return -1;
                }
                if (list.isEmpty()) {
                    return -1;
                }
                try {
                    C13633u2 c13633u2 = new C13633u2();
                    ArrayList arrayList = new ArrayList();
                    C5931r1.m26561a("CaptureSession", "Issuing capture request.");
                    int i10 = 0;
                    boolean z10 = false;
                    for (C8785l1 c8785l1 : list) {
                        if (!c8785l1.m35246i().isEmpty()) {
                            Iterator<AbstractC8830u1> it = c8785l1.m35246i().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    if (c8785l1.m35248k() == 2) {
                                        z10 = true;
                                    }
                                    C8785l1.a aVarM35253k = C8785l1.a.m35253k(c8785l1);
                                    if (c8785l1.m35248k() == 5 && c8785l1.m35241d() != null) {
                                        aVarM35253k.m35267p(c8785l1.m35241d());
                                    }
                                    C8802o3 c8802o3 = this.f47471f;
                                    if (c8802o3 != null) {
                                        aVarM35253k.m35258e(c8802o3.m35306l().m35244g());
                                    }
                                    aVarM35253k.m35258e(c8785l1.m35244g());
                                    CaptureRequest captureRequestM49464e = C13558k2.m49464e(aVarM35253k.m35261h(), this.f47470e.mo49414f(), this.f47472g, false, this.f47483r);
                                    if (captureRequestM49464e != null) {
                                        List<CameraCaptureSession.CaptureCallback> arrayList2 = new ArrayList<>();
                                        Iterator<AbstractC8828u> it2 = c8785l1.m35240c().iterator();
                                        while (it2.hasNext()) {
                                            C13503d3.m49213b(it2.next(), arrayList2);
                                        }
                                        c13633u2.m49728a(captureRequestM49464e, arrayList2);
                                        arrayList.add(captureRequestM49464e);
                                        break;
                                    }
                                    C5931r1.m26561a("CaptureSession", "Skipping issuing request without surface.");
                                    return -1;
                                }
                                AbstractC8830u1 next = it.next();
                                if (!this.f47472g.containsKey(next)) {
                                    C5931r1.m26561a("CaptureSession", "Skipping capture request with invalid surface: " + next);
                                    break;
                                }
                            }
                        } else {
                            C5931r1.m26561a("CaptureSession", "Skipping issuing empty capture request.");
                        }
                    }
                    if (arrayList.isEmpty()) {
                        C5931r1.m26561a("CaptureSession", "Skipping issuing burst request due to no valid request elements");
                        return -1;
                    }
                    if (this.f47479n.m22063a(arrayList, z10)) {
                        this.f47470e.mo49409a();
                        c13633u2.m49730c(new C13633u2.a() { // from class: z.g3
                            @Override // p589z.C13633u2.a
                            /* JADX INFO: renamed from: a */
                            public final void mo49287a(CameraCaptureSession cameraCaptureSession, int i11, boolean z11) {
                                C13559k3.m49472m(this.f47349a, cameraCaptureSession, i11, z11);
                            }
                        });
                    }
                    if (this.f47480o.m22068b(arrayList, z10)) {
                        c13633u2.m49728a((CaptureRequest) arrayList.get(arrayList.size() - 1), Collections.singletonList(new b()));
                    }
                    if (this.f47485t != null) {
                        int size = arrayList.size();
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            this.f47485t.m24211a((CaptureRequest) obj);
                        }
                    }
                    C8802o3 c8802o4 = this.f47471f;
                    if (c8802o4 == null || c8802o4.m35308n() != 1) {
                        return this.f47470e.mo49418m(arrayList, c13633u2);
                    }
                    return m49487p(arrayList, c13633u2);
                } catch (CameraAccessException e10) {
                    C5931r1.m26563c("CaptureSession", "Unable to access camera: " + e10.getMessage());
                    Thread.dumpStack();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public void m49493x() {
        this.f47481p.m22056e().mo37173a(new Runnable() { // from class: z.j3
            @Override // java.lang.Runnable
            public final void run() {
                C13559k3.m49469j(this.f47458a);
            }
        }, C10417c.m40081b());
    }

    /* JADX INFO: renamed from: y */
    public int m49494y(C8802o3 c8802o3) {
        synchronized (this.f47466a) {
            try {
                if (c8802o3 == null) {
                    C5931r1.m26561a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no configuration case.");
                    return -1;
                }
                if (this.f47475j != c.OPENED) {
                    C5931r1.m26561a("CaptureSession", "Skipping issueRepeatingCaptureRequests due to session closed");
                    return -1;
                }
                C8785l1 c8785l1M35306l = c8802o3.m35306l();
                if (c8785l1M35306l.m35246i().isEmpty()) {
                    C5931r1.m26561a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no surface.");
                    try {
                        this.f47470e.mo49409a();
                    } catch (CameraAccessException e10) {
                        C5931r1.m26563c("CaptureSession", "Unable to access camera: " + e10.getMessage());
                        Thread.dumpStack();
                    }
                    return -1;
                }
                try {
                    C5931r1.m26561a("CaptureSession", "Issuing request for session.");
                    CaptureRequest captureRequestM49464e = C13558k2.m49464e(c8785l1M35306l, this.f47470e.mo49414f(), this.f47472g, true, this.f47483r);
                    if (captureRequestM49464e == null) {
                        C5931r1.m26561a("CaptureSession", "Skipping issuing empty request for session.");
                        return -1;
                    }
                    CameraCaptureSession.CaptureCallback captureCallbackM22055d = this.f47481p.m22055d(m49488q(c8785l1M35306l.m35240c(), new CameraCaptureSession.CaptureCallback[0]));
                    InterfaceC5230i interfaceC5230i = this.f47485t;
                    if (interfaceC5230i != null) {
                        interfaceC5230i.m24211a(captureRequestM49464e);
                    }
                    if (c8802o3.m35308n() != 1) {
                        return this.f47470e.mo49415g(captureRequestM49464e, captureCallbackM22055d);
                    }
                    return this.f47470e.mo49417l(this.f47470e.mo49416i(captureRequestM49464e), captureCallbackM22055d);
                } catch (CameraAccessException e11) {
                    C5931r1.m26563c("CaptureSession", "Unable to access camera: " + e11.getMessage());
                    Thread.dumpStack();
                    return -1;
                }
                throw th;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public final InterfaceFutureC9440x<Void> m49495z(List<Surface> list, C8802o3 c8802o3, CameraDevice cameraDevice) {
        synchronized (this.f47466a) {
            try {
                int iOrdinal = this.f47475j.ordinal();
                if (iOrdinal == 0 || iOrdinal == 7 || iOrdinal == 2) {
                    return C10773n.m40991n(new IllegalStateException("openCaptureSession() should not be possible in state: " + this.f47475j));
                }
                if (iOrdinal != 3) {
                    return C10773n.m40991n(new CancellationException("openCaptureSession() not execute in state: " + this.f47475j));
                }
                this.f47472g.clear();
                for (int i10 = 0; i10 < list.size(); i10++) {
                    this.f47472g.put(this.f47473h.get(i10), list.get(i10));
                }
                m49477A(c.OPENING);
                C5931r1.m26561a("CaptureSession", "Opening capture session.");
                InterfaceC13537h5.c cVarM49608x = C13622s5.m49608x(this.f47468c, new C13622s5.a(c8802o3.m35307m()));
                C12964a c12964a = new C12964a(c8802o3.m35301g());
                C8785l1.a aVarM35253k = C8785l1.a.m35253k(c8802o3.m35306l());
                Map map = new HashMap();
                if (this.f47484s && Build.VERSION.SDK_INT >= 35) {
                    map = m49475r(m49476v(c8802o3.m35303i()), this.f47472g);
                }
                ArrayList arrayList = new ArrayList();
                String strM48214l0 = c12964a.m48214l0(null);
                for (C8802o3.f fVar : c8802o3.m35303i()) {
                    C1183i c1183iM49490t = (!this.f47484s || Build.VERSION.SDK_INT < 35) ? null : (C1183i) map.get(fVar);
                    if (c1183iM49490t == null) {
                        c1183iM49490t = m49490t(fVar, this.f47472g, strM48214l0);
                        if (this.f47478m.containsKey(fVar.mo35348f())) {
                            c1183iM49490t.m6564h(this.f47478m.get(fVar.mo35348f()).longValue());
                        }
                    }
                    arrayList.add(c1183iM49490t);
                }
                C1189o c1189oMo49423k = this.f47469d.mo49423k(c8802o3.m35308n(), m49491u(arrayList), cVarM49608x);
                if (c8802o3.m35311q() == 5 && c8802o3.m35302h() != null) {
                    c1189oMo49423k.m6584f(C1182h.m6553b(c8802o3.m35302h()));
                }
                try {
                    CaptureRequest captureRequestM49465f = C13558k2.m49465f(aVarM35253k.m35261h(), cameraDevice, this.f47483r);
                    if (captureRequestM49465f != null) {
                        InterfaceC5230i interfaceC5230i = this.f47485t;
                        if (interfaceC5230i != null) {
                            interfaceC5230i.m24211a(captureRequestM49465f);
                        }
                        c1189oMo49423k.m6585g(captureRequestM49465f);
                    }
                    return this.f47469d.mo49421h(cameraDevice, c1189oMo49423k, this.f47473h);
                } catch (CameraAccessException e10) {
                    return C10773n.m40991n(e10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C13559k3(C1179e c1179e, boolean z10) {
        this(c1179e, new C8782k3(Collections.EMPTY_LIST), z10, null);
    }

    public C13559k3(C1179e c1179e, boolean z10, InterfaceC5230i interfaceC5230i) {
        this(c1179e, new C8782k3(Collections.EMPTY_LIST), z10, interfaceC5230i);
    }

    public C13559k3(C1179e c1179e, C8782k3 c8782k3, InterfaceC5230i interfaceC5230i) {
        this(c1179e, c8782k3, false, interfaceC5230i);
    }

    public C13559k3(C1179e c1179e, C8782k3 c8782k3, boolean z10, InterfaceC5230i interfaceC5230i) {
        this.f47466a = new Object();
        this.f47467b = new ArrayList();
        this.f47472g = new HashMap();
        this.f47473h = Collections.EMPTY_LIST;
        c cVar = c.UNINITIALIZED;
        this.f47474i = cVar;
        this.f47475j = cVar;
        this.f47478m = new HashMap();
        this.f47479n = new C4391v();
        this.f47480o = new C4395z();
        m49477A(c.INITIALIZED);
        this.f47482q = c1179e;
        this.f47468c = new d();
        this.f47481p = new C4388s(c8782k3.m35233a(CaptureNoResponseQuirk.class));
        this.f47483r = new C4394y(c8782k3);
        this.f47484s = z10;
        this.f47485t = interfaceC5230i;
    }
}
