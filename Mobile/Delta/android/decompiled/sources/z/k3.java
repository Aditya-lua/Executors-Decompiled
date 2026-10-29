package z;

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

/* JADX INFO: loaded from: classes.dex */
public final class k3 implements l3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f36644a;
    public final List<n0.l1> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f36645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h5.a f36646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h5 f36647e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public n0.o3 f36648f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map<n0.u1, Surface> f36649g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List<n0.u1> f36650h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c f36651i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c f36652j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public me.x<Void> f36653k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public y1.c.a<Void> f36654l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Map<n0.u1, Long> f36655m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final d0.v f36656n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final d0.z f36657o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d0.s f36658p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b0.e f36659q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d0.y f36660r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f36661s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f0.i f36662t;

    public class a implements r0.c<Void> {
        public a() {
        }

        @Override // r0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r8) {
        }

        @Override // r0.c
        public void onFailure(Throwable th2) {
            synchronized (k3.this.f36644a) {
                try {
                    k3.this.f36646d.stop();
                    int iOrdinal = k3.this.f36652j.ordinal();
                    if ((iOrdinal == 4 || iOrdinal == 5 || iOrdinal == 6) && !(th2 instanceof CancellationException)) {
                        g0.r1.m("CaptureSession", "Opening session with fail " + k3.this.f36652j, th2);
                        k3.this.s();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public class b extends CameraCaptureSession.CaptureCallback {
        public b() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            synchronized (k3.this.f36644a) {
                try {
                    n0.o3 o3Var = k3.this.f36648f;
                    if (o3Var == null) {
                        return;
                    }
                    n0.l1 l1VarL = o3Var.l();
                    g0.r1.a("CaptureSession", "Submit FLASH_MODE_OFF request");
                    k3 k3Var = k3.this;
                    k3Var.b(Collections.singletonList(k3Var.f36657o.a(l1VarL)));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

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

    public final class d extends h5.c {
        public d() {
        }

        @Override // z.h5.c
        public void s(h5 h5Var) {
            synchronized (k3.this.f36644a) {
                try {
                    switch (k3.this.f36652j) {
                        case UNINITIALIZED:
                        case INITIALIZED:
                        case GET_SURFACE:
                        case OPENED:
                            throw new IllegalStateException("onConfigureFailed() should not be possible in state: " + k3.this.f36652j);
                        case RELEASED:
                            g0.r1.a("CaptureSession", "ConfigureFailed callback after change to RELEASED state");
                            break;
                        case RELEASING:
                        case CLOSED:
                        case OPENING:
                            k3.this.s();
                            break;
                    }
                    g0.r1.c("CaptureSession", "CameraCaptureSession.onConfigureFailed() " + k3.this.f36652j);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // z.h5.c
        public void t(h5 h5Var) {
            synchronized (k3.this.f36644a) {
                try {
                    switch (k3.this.f36652j) {
                        case UNINITIALIZED:
                        case RELEASED:
                        case INITIALIZED:
                        case GET_SURFACE:
                        case OPENED:
                            throw new IllegalStateException("onConfigured() should not be possible in state: " + k3.this.f36652j);
                        case RELEASING:
                            h5Var.close();
                            break;
                        case CLOSED:
                            k3.this.f36647e = h5Var;
                            break;
                        case OPENING:
                            k3.this.A(c.OPENED);
                            k3.this.f36647e = h5Var;
                            g0.r1.a("CaptureSession", "Attempting to send capture request onConfigured");
                            k3 k3Var = k3.this;
                            k3Var.y(k3Var.f36648f);
                            k3.this.x();
                            break;
                    }
                    g0.r1.a("CaptureSession", "CameraCaptureSession.onConfigured() mState=" + k3.this.f36652j);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // z.h5.c
        public void u(h5 h5Var) {
            synchronized (k3.this.f36644a) {
                try {
                    if (k3.this.f36652j.ordinal() == 0) {
                        throw new IllegalStateException("onReady() should not be possible in state: " + k3.this.f36652j);
                    }
                    g0.r1.a("CaptureSession", "CameraCaptureSession.onReady() " + k3.this.f36652j);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // z.h5.c
        public void v(h5 h5Var) {
            synchronized (k3.this.f36644a) {
                try {
                    if (k3.this.f36652j == c.UNINITIALIZED) {
                        throw new IllegalStateException("onSessionFinished() should not be possible in state: " + k3.this.f36652j);
                    }
                    g0.r1.a("CaptureSession", "onSessionFinished()");
                    k3.this.s();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public k3(b0.e eVar) {
        this(eVar, false);
    }

    public static /* synthetic */ void j(k3 k3Var) {
        synchronized (k3Var.f36644a) {
            if (k3Var.b.isEmpty()) {
                return;
            }
            try {
                k3Var.w(k3Var.b);
                k3Var.b.clear();
            } catch (Throwable th2) {
                k3Var.b.clear();
                throw th2;
            }
        }
    }

    public static /* synthetic */ Object k(k3 k3Var, y1.c.a aVar) {
        String str;
        synchronized (k3Var.f36644a) {
            x2.g.j(k3Var.f36654l == null, "Release completer expected to be null");
            k3Var.f36654l = aVar;
            str = "Release[session=" + k3Var + "]";
        }
        return str;
    }

    public static /* synthetic */ void m(k3 k3Var, CameraCaptureSession cameraCaptureSession, int i10, boolean z10) {
        synchronized (k3Var.f36644a) {
            try {
                if (k3Var.f36652j == c.OPENED) {
                    k3Var.y(k3Var.f36648f);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static Map<n0.o3.f, b0.i> r(Map<Integer, List<n0.o3.f>> map, Map<n0.u1, Surface> map2) {
        HashMap map3 = new HashMap();
        for (Integer num : map.keySet()) {
            num.intValue();
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            for (n0.o3.f fVar : map.get(num)) {
                SurfaceUtil.a aVarA = SurfaceUtil.a(map2.get(fVar.f()));
                if (i10 == 0) {
                    i10 = aVarA.f1389a;
                }
                f3.a();
                int i11 = aVarA.b;
                int i12 = aVarA.f1390c;
                String strD = fVar.d();
                Objects.requireNonNull(strD);
                arrayList.add(e3.a(i11, i12, strD));
            }
            if (i10 == 0 || arrayList.isEmpty()) {
                g0.r1.c("CaptureSession", "Skips to create instances for multi-resolution output. imageFormat: " + i10 + ", streamInfos size: " + arrayList.size());
            } else {
                List listCreateInstancesForMultiResolutionOutput = OutputConfiguration.createInstancesForMultiResolutionOutput(arrayList, i10);
                if (listCreateInstancesForMultiResolutionOutput != null) {
                    for (n0.o3.f fVar2 : map.get(num)) {
                        OutputConfiguration outputConfiguration = (OutputConfiguration) listCreateInstancesForMultiResolutionOutput.remove(0);
                        outputConfiguration.addSurface(map2.get(fVar2.f()));
                        map3.put(fVar2, new b0.i(outputConfiguration));
                    }
                }
            }
        }
        return map3;
    }

    public static Map<Integer, List<n0.o3.f>> v(Collection<n0.o3.f> collection) {
        HashMap map = new HashMap();
        for (n0.o3.f fVar : collection) {
            if (fVar.g() > 0 && fVar.e().isEmpty()) {
                List arrayList = (List) map.get(Integer.valueOf(fVar.g()));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(Integer.valueOf(fVar.g()), arrayList);
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

    public final void A(c cVar) {
        if (cVar.ordinal() > this.f36651i.ordinal()) {
            this.f36651i = cVar;
        }
        this.f36652j = cVar;
        if (!n5.a.h() || this.f36651i.ordinal() < c.GET_SURFACE.ordinal()) {
            return;
        }
        n5.a.j("CX:C2State[" + String.format("CaptureSession@%x", Integer.valueOf(hashCode())) + "]", cVar.ordinal());
    }

    @Override // z.l3
    public me.x<Void> a(final n0.o3 o3Var, final CameraDevice cameraDevice, h5.a aVar) {
        synchronized (this.f36644a) {
            try {
                if (this.f36652j.ordinal() == 2) {
                    A(c.GET_SURFACE);
                    ArrayList arrayList = new ArrayList(o3Var.p());
                    this.f36650h = arrayList;
                    this.f36646d = aVar;
                    r0.d dVarG = r0.d.c(aVar.j(arrayList, 5000L)).g(new r0.a() { // from class: z.i3
                        @Override // r0.a
                        public final me.x apply(Object obj) {
                            return this.f36630a.z((List) obj, o3Var, cameraDevice);
                        }
                    }, this.f36646d.getExecutor());
                    r0.n.j(dVarG, new a(), this.f36646d.getExecutor());
                    return r0.n.s(dVarG);
                }
                g0.r1.c("CaptureSession", "Open not allowed in state: " + this.f36652j);
                return r0.n.n(new IllegalStateException("open() should not allow the state: " + this.f36652j));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // z.l3
    public void b(List<n0.l1> list) {
        synchronized (this.f36644a) {
            try {
                switch (this.f36652j) {
                    case UNINITIALIZED:
                        throw new IllegalStateException("issueCaptureRequests() should not be possible in state: " + this.f36652j);
                    case RELEASED:
                    case RELEASING:
                    case CLOSED:
                        throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
                    case INITIALIZED:
                    case GET_SURFACE:
                    case OPENING:
                        this.b.addAll(list);
                        break;
                    case OPENED:
                        this.b.addAll(list);
                        x();
                        break;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // z.l3
    public boolean c() {
        boolean z10;
        synchronized (this.f36644a) {
            try {
                c cVar = this.f36652j;
                z10 = cVar == c.OPENED || cVar == c.OPENING;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // z.l3
    public void close() {
        synchronized (this.f36644a) {
            try {
                int iOrdinal = this.f36652j.ordinal();
                if (iOrdinal == 0) {
                    throw new IllegalStateException("close() should not be possible in state: " + this.f36652j);
                }
                if (iOrdinal == 2) {
                    A(c.RELEASED);
                } else if (iOrdinal == 3) {
                    x2.g.h(this.f36646d, "The Opener shouldn't null in state:" + this.f36652j);
                    this.f36646d.stop();
                    A(c.RELEASED);
                } else if (iOrdinal == 6 || iOrdinal == 7) {
                    x2.g.h(this.f36646d, "The Opener shouldn't null in state:" + this.f36652j);
                    this.f36646d.stop();
                    A(c.CLOSED);
                    this.f36658p.g();
                    this.f36648f = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // z.l3
    public void d(n0.o3 o3Var) {
        synchronized (this.f36644a) {
            try {
                switch (this.f36652j) {
                    case UNINITIALIZED:
                        throw new IllegalStateException("setSessionConfig() should not be possible in state: " + this.f36652j);
                    case RELEASED:
                    case RELEASING:
                    case CLOSED:
                        throw new IllegalStateException("Session configuration cannot be set on a closed/released session.");
                    case INITIALIZED:
                    case GET_SURFACE:
                    case OPENING:
                        this.f36648f = o3Var;
                        break;
                    case OPENED:
                        this.f36648f = o3Var;
                        if (o3Var == null) {
                            return;
                        }
                        if (!this.f36649g.keySet().containsAll(o3Var.p())) {
                            g0.r1.c("CaptureSession", "Does not have the proper configured lists");
                            return;
                        } else {
                            g0.r1.a("CaptureSession", "Attempting to submit CaptureRequest after setting");
                            y(this.f36648f);
                        }
                        break;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // z.l3
    public void e() {
        ArrayList arrayList;
        synchronized (this.f36644a) {
            try {
                if (this.b.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(this.b);
                    this.b.clear();
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
                n0.l1 l1Var = (n0.l1) obj;
                Iterator<n0.u> it = l1Var.c().iterator();
                while (it.hasNext()) {
                    it.next().a(l1Var.f());
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x0054 A[Catch: all -> 0x001a, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x000b, B:29:0x008d, B:8:0x0010, B:11:0x0016, B:17:0x0025, B:16:0x001e, B:18:0x002a, B:20:0x0054, B:21:0x0058, B:23:0x005c, B:24:0x0067, B:25:0x0069, B:27:0x006b, B:28:0x0088, B:32:0x0094, B:33:0x00ac), top: B:38:0x0003, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x005c A[Catch: all -> 0x001a, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x000b, B:29:0x008d, B:8:0x0010, B:11:0x0016, B:17:0x0025, B:16:0x001e, B:18:0x002a, B:20:0x0054, B:21:0x0058, B:23:0x005c, B:24:0x0067, B:25:0x0069, B:27:0x006b, B:28:0x0088, B:32:0x0094, B:33:0x00ac), top: B:38:0x0003, inners: #0 }] */
    @Override // z.l3
    public me.x<Void> f(boolean z10) {
        synchronized (this.f36644a) {
            int iOrdinal = this.f36652j.ordinal();
            if (iOrdinal == 0) {
                throw new IllegalStateException("release() should not be possible in state: " + this.f36652j);
            }
            switch (iOrdinal) {
                case 2:
                    A(c.RELEASED);
                    return r0.n.p(null);
                case 3:
                    x2.g.h(this.f36646d, "The Opener shouldn't null in state:" + this.f36652j);
                    this.f36646d.stop();
                    A(c.RELEASED);
                    return r0.n.p(null);
                case 4:
                    if (this.f36653k == null) {
                        this.f36653k = y1.c.a(new y1.c.InterfaceC0650c() { // from class: z.h3
                            @Override // y1.c.InterfaceC0650c
                            public final Object a(y1.c.a aVar) {
                                return k3.k(this.f36591a, aVar);
                            }
                        });
                    }
                    return this.f36653k;
                case 5:
                case 7:
                    h5 h5Var = this.f36647e;
                    if (h5Var != null) {
                        if (z10) {
                            try {
                                h5Var.e();
                            } catch (CameraAccessException e10) {
                                g0.r1.d("CaptureSession", "Unable to abort captures.", e10);
                            }
                        }
                        this.f36647e.close();
                        break;
                    }
                    A(c.RELEASING);
                    this.f36658p.g();
                    x2.g.h(this.f36646d, "The Opener shouldn't null in state:" + this.f36652j);
                    if (this.f36646d.stop()) {
                        s();
                        return r0.n.p(null);
                    }
                    if (this.f36653k == null) {
                        this.f36653k = y1.c.a(new y1.c.InterfaceC0650c() { // from class: z.h3
                            @Override // y1.c.InterfaceC0650c
                            public final Object a(y1.c.a aVar) {
                                return k3.k(this.f36591a, aVar);
                            }
                        });
                    }
                    return this.f36653k;
                case 6:
                    A(c.RELEASING);
                    this.f36658p.g();
                    x2.g.h(this.f36646d, "The Opener shouldn't null in state:" + this.f36652j);
                    if (this.f36646d.stop()) {
                        s();
                        return r0.n.p(null);
                    }
                    if (this.f36653k == null) {
                        this.f36653k = y1.c.a(new y1.c.InterfaceC0650c() { // from class: z.h3
                            @Override // y1.c.InterfaceC0650c
                            public final Object a(y1.c.a aVar) {
                                return k3.k(this.f36591a, aVar);
                            }
                        });
                    }
                    return this.f36653k;
                default:
                    return r0.n.p(null);
            }
        }
    }

    @Override // z.l3
    public List<n0.l1> g() {
        List<n0.l1> listUnmodifiableList;
        synchronized (this.f36644a) {
            listUnmodifiableList = Collections.unmodifiableList(this.b);
        }
        return listUnmodifiableList;
    }

    @Override // z.l3
    public n0.o3 h() {
        n0.o3 o3Var;
        synchronized (this.f36644a) {
            o3Var = this.f36648f;
        }
        return o3Var;
    }

    @Override // z.l3
    public void i(Map<n0.u1, Long> map) {
        synchronized (this.f36644a) {
            this.f36655m = map;
        }
    }

    public final int p(List<CaptureRequest> list, u2 u2Var) {
        u2 u2Var2 = new u2();
        int iM = -1;
        for (CaptureRequest captureRequest : list) {
            h5 h5Var = this.f36647e;
            Objects.requireNonNull(h5Var);
            List<CaptureRequest> listI = h5Var.i(captureRequest);
            Iterator<CaptureRequest> it = listI.iterator();
            while (it.hasNext()) {
                u2Var2.a(it.next(), Collections.singletonList(new a5(captureRequest, u2Var)));
            }
            iM = this.f36647e.m(listI, u2Var2);
        }
        return iM;
    }

    public final CameraCaptureSession.CaptureCallback q(List<n0.u> list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        Iterator<n0.u> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(d3.a(it.next()));
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return a1.a(arrayList);
    }

    public void s() {
        c cVar = this.f36652j;
        c cVar2 = c.RELEASED;
        if (cVar == cVar2) {
            g0.r1.a("CaptureSession", "Skipping finishClose due to being state RELEASED.");
            return;
        }
        A(cVar2);
        this.f36647e = null;
        y1.c.a<Void> aVar = this.f36654l;
        if (aVar != null) {
            aVar.c(null);
            this.f36654l = null;
        }
    }

    public final b0.i t(n0.o3.f fVar, Map<n0.u1, Surface> map, String str) {
        long jLongValue;
        DynamicRangeProfiles dynamicRangeProfilesD;
        Surface surface = map.get(fVar.f());
        x2.g.h(surface, "Surface in OutputConfig not found in configuredSurfaceMap.");
        b0.i iVar = new b0.i(fVar.g(), surface);
        if (str != null) {
            iVar.g(str);
        } else {
            iVar.g(fVar.d());
        }
        if (fVar.c() == 0) {
            iVar.f(1);
        } else if (fVar.c() == 1) {
            iVar.f(2);
        }
        if (!fVar.e().isEmpty()) {
            iVar.b();
            Iterator<n0.u1> it = fVar.e().iterator();
            while (it.hasNext()) {
                Surface surface2 = map.get(it.next());
                x2.g.h(surface2, "Surface in OutputConfig not found in configuredSurfaceMap.");
                iVar.a(surface2);
            }
        }
        if (Build.VERSION.SDK_INT < 33 || (dynamicRangeProfilesD = this.f36659q.d()) == null) {
            jLongValue = 1;
        } else {
            g0.k0 k0VarB = fVar.b();
            Long lA = b0.c.a(k0VarB, dynamicRangeProfilesD);
            if (lA == null) {
                g0.r1.c("CaptureSession", "Requested dynamic range is not supported. Defaulting to STANDARD dynamic range profile.\nRequested dynamic range:\n  " + k0VarB);
                jLongValue = 1;
            } else {
                jLongValue = lA.longValue();
            }
        }
        iVar.e(jLongValue);
        return iVar;
    }

    public final List<b0.i> u(List<b0.i> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (b0.i iVar : list) {
            if (!arrayList.contains(iVar.d())) {
                arrayList.add(iVar.d());
                arrayList2.add(iVar);
            }
        }
        return arrayList2;
    }

    public int w(List<n0.l1> list) {
        synchronized (this.f36644a) {
            try {
                if (this.f36652j != c.OPENED) {
                    g0.r1.a("CaptureSession", "Skipping issueBurstCaptureRequest due to session closed");
                    return -1;
                }
                if (list.isEmpty()) {
                    return -1;
                }
                try {
                    u2 u2Var = new u2();
                    ArrayList arrayList = new ArrayList();
                    g0.r1.a("CaptureSession", "Issuing capture request.");
                    int i10 = 0;
                    boolean z10 = false;
                    for (n0.l1 l1Var : list) {
                        if (!l1Var.i().isEmpty()) {
                            Iterator<n0.u1> it = l1Var.i().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    if (l1Var.k() == 2) {
                                        z10 = true;
                                    }
                                    n0.l1.a aVarK = n0.l1.a.k(l1Var);
                                    if (l1Var.k() == 5 && l1Var.d() != null) {
                                        aVarK.p(l1Var.d());
                                    }
                                    n0.o3 o3Var = this.f36648f;
                                    if (o3Var != null) {
                                        aVarK.e(o3Var.l().g());
                                    }
                                    aVarK.e(l1Var.g());
                                    CaptureRequest captureRequestE = k2.e(aVarK.h(), this.f36647e.f(), this.f36649g, false, this.f36660r);
                                    if (captureRequestE != null) {
                                        List<CameraCaptureSession.CaptureCallback> arrayList2 = new ArrayList<>();
                                        Iterator<n0.u> it2 = l1Var.c().iterator();
                                        while (it2.hasNext()) {
                                            d3.b(it2.next(), arrayList2);
                                        }
                                        u2Var.a(captureRequestE, arrayList2);
                                        arrayList.add(captureRequestE);
                                        break;
                                    }
                                    g0.r1.a("CaptureSession", "Skipping issuing request without surface.");
                                    return -1;
                                }
                                n0.u1 next = it.next();
                                if (!this.f36649g.containsKey(next)) {
                                    g0.r1.a("CaptureSession", "Skipping capture request with invalid surface: " + next);
                                    break;
                                }
                            }
                        } else {
                            g0.r1.a("CaptureSession", "Skipping issuing empty capture request.");
                        }
                    }
                    if (arrayList.isEmpty()) {
                        g0.r1.a("CaptureSession", "Skipping issuing burst request due to no valid request elements");
                        return -1;
                    }
                    if (this.f36656n.a(arrayList, z10)) {
                        this.f36647e.a();
                        u2Var.c(new u2.a() { // from class: z.g3
                            @Override // z.u2.a
                            public final void a(CameraCaptureSession cameraCaptureSession, int i11, boolean z11) {
                                k3.m(this.f36549a, cameraCaptureSession, i11, z11);
                            }
                        });
                    }
                    if (this.f36657o.b(arrayList, z10)) {
                        u2Var.a((CaptureRequest) arrayList.get(arrayList.size() - 1), Collections.singletonList(new b()));
                    }
                    if (this.f36662t != null) {
                        int size = arrayList.size();
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            this.f36662t.a((CaptureRequest) obj);
                        }
                    }
                    n0.o3 o3Var2 = this.f36648f;
                    if (o3Var2 == null || o3Var2.n() != 1) {
                        return this.f36647e.m(arrayList, u2Var);
                    }
                    return p(arrayList, u2Var);
                } catch (CameraAccessException e10) {
                    g0.r1.c("CaptureSession", "Unable to access camera: " + e10.getMessage());
                    Thread.dumpStack();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void x() {
        this.f36658p.e().a(new Runnable() { // from class: z.j3
            @Override // java.lang.Runnable
            public final void run() {
                k3.j(this.f36637a);
            }
        }, q0.c.b());
    }

    public int y(n0.o3 o3Var) {
        synchronized (this.f36644a) {
            try {
                if (o3Var == null) {
                    g0.r1.a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no configuration case.");
                    return -1;
                }
                if (this.f36652j != c.OPENED) {
                    g0.r1.a("CaptureSession", "Skipping issueRepeatingCaptureRequests due to session closed");
                    return -1;
                }
                n0.l1 l1VarL = o3Var.l();
                if (l1VarL.i().isEmpty()) {
                    g0.r1.a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no surface.");
                    try {
                        this.f36647e.a();
                    } catch (CameraAccessException e10) {
                        g0.r1.c("CaptureSession", "Unable to access camera: " + e10.getMessage());
                        Thread.dumpStack();
                    }
                    return -1;
                }
                try {
                    g0.r1.a("CaptureSession", "Issuing request for session.");
                    CaptureRequest captureRequestE = k2.e(l1VarL, this.f36647e.f(), this.f36649g, true, this.f36660r);
                    if (captureRequestE == null) {
                        g0.r1.a("CaptureSession", "Skipping issuing empty request for session.");
                        return -1;
                    }
                    CameraCaptureSession.CaptureCallback captureCallbackD = this.f36658p.d(q(l1VarL.c(), new CameraCaptureSession.CaptureCallback[0]));
                    f0.i iVar = this.f36662t;
                    if (iVar != null) {
                        iVar.a(captureRequestE);
                    }
                    if (o3Var.n() != 1) {
                        return this.f36647e.g(captureRequestE, captureCallbackD);
                    }
                    return this.f36647e.l(this.f36647e.i(captureRequestE), captureCallbackD);
                } catch (CameraAccessException e11) {
                    g0.r1.c("CaptureSession", "Unable to access camera: " + e11.getMessage());
                    Thread.dumpStack();
                    return -1;
                }
                throw th;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final me.x<Void> z(List<Surface> list, n0.o3 o3Var, CameraDevice cameraDevice) {
        synchronized (this.f36644a) {
            try {
                int iOrdinal = this.f36652j.ordinal();
                if (iOrdinal == 0 || iOrdinal == 7 || iOrdinal == 2) {
                    return r0.n.n(new IllegalStateException("openCaptureSession() should not be possible in state: " + this.f36652j));
                }
                if (iOrdinal != 3) {
                    return r0.n.n(new CancellationException("openCaptureSession() not execute in state: " + this.f36652j));
                }
                this.f36649g.clear();
                for (int i10 = 0; i10 < list.size(); i10++) {
                    this.f36649g.put(this.f36650h.get(i10), list.get(i10));
                }
                A(c.OPENING);
                g0.r1.a("CaptureSession", "Opening capture session.");
                h5.c cVarX = s5.x(this.f36645c, new s5.a(o3Var.m()));
                y.a aVar = new y.a(o3Var.g());
                n0.l1.a aVarK = n0.l1.a.k(o3Var.l());
                Map map = new HashMap();
                if (this.f36661s && Build.VERSION.SDK_INT >= 35) {
                    map = r(v(o3Var.i()), this.f36649g);
                }
                ArrayList arrayList = new ArrayList();
                String strL0 = aVar.l0(null);
                for (n0.o3.f fVar : o3Var.i()) {
                    b0.i iVarT = (!this.f36661s || Build.VERSION.SDK_INT < 35) ? null : (b0.i) map.get(fVar);
                    if (iVarT == null) {
                        iVarT = t(fVar, this.f36649g, strL0);
                        if (this.f36655m.containsKey(fVar.f())) {
                            iVarT.h(this.f36655m.get(fVar.f()).longValue());
                        }
                    }
                    arrayList.add(iVarT);
                }
                b0.o oVarK = this.f36646d.k(o3Var.n(), u(arrayList), cVarX);
                if (o3Var.q() == 5 && o3Var.h() != null) {
                    oVarK.f(b0.h.b(o3Var.h()));
                }
                try {
                    CaptureRequest captureRequestF = k2.f(aVarK.h(), cameraDevice, this.f36660r);
                    if (captureRequestF != null) {
                        f0.i iVar = this.f36662t;
                        if (iVar != null) {
                            iVar.a(captureRequestF);
                        }
                        oVarK.g(captureRequestF);
                    }
                    return this.f36646d.h(cameraDevice, oVarK, this.f36650h);
                } catch (CameraAccessException e10) {
                    return r0.n.n(e10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public k3(b0.e eVar, boolean z10) {
        this(eVar, new n0.k3(Collections.EMPTY_LIST), z10, null);
    }

    public k3(b0.e eVar, boolean z10, f0.i iVar) {
        this(eVar, new n0.k3(Collections.EMPTY_LIST), z10, iVar);
    }

    public k3(b0.e eVar, n0.k3 k3Var, f0.i iVar) {
        this(eVar, k3Var, false, iVar);
    }

    public k3(b0.e eVar, n0.k3 k3Var, boolean z10, f0.i iVar) {
        this.f36644a = new Object();
        this.b = new ArrayList();
        this.f36649g = new HashMap();
        this.f36650h = Collections.EMPTY_LIST;
        c cVar = c.UNINITIALIZED;
        this.f36651i = cVar;
        this.f36652j = cVar;
        this.f36655m = new HashMap();
        this.f36656n = new d0.v();
        this.f36657o = new d0.z();
        A(c.INITIALIZED);
        this.f36659q = eVar;
        this.f36645c = new d();
        this.f36658p = new d0.s(k3Var.a(CaptureNoResponseQuirk.class));
        this.f36660r = new d0.y(k3Var);
        this.f36661s = z10;
        this.f36662t = iVar;
    }
}
