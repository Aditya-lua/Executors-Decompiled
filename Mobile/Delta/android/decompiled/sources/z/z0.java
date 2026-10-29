package z;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class z0 implements n0.o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36964a;
    public final a0.c0 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f0.h f36965c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public y f36967e;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p0.v<g0.w> f36972j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final n0.k3 f36974l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final n0.z1 f36975m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a0.p0 f36976n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final s0.m f36977o;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f36966d = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p0.v<Integer> f36968f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p0.v<Integer> f36969g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p0.v<Integer> f36970h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p0.v<g0.z2> f36971i = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List<Pair<n0.u, Executor>> f36973k = null;

    public z0(String str, a0.p0 p0Var, s0.m mVar) {
        String str2 = (String) x2.g.g(str);
        this.f36964a = str2;
        this.f36976n = p0Var;
        a0.c0 c0VarC = p0Var.c(str2);
        this.b = c0VarC;
        this.f36965c = new f0.h(this);
        n0.k3 k3VarA = c0.a.a(str, c0VarC);
        this.f36974l = k3VarA;
        this.f36975m = new m2(str, k3VarA);
        this.f36972j = new p0.v<>(g0.w.a(g0.w.b.CLOSED));
        this.f36977o = mVar;
    }

    public f0.h B() {
        return this.f36965c;
    }

    public a0.c0 C() {
        return this.b;
    }

    public int D() {
        Integer num = (Integer) this.b.a(CameraCharacteristics.SENSOR_ORIENTATION);
        x2.g.g(num);
        return num.intValue();
    }

    public int E() {
        Integer num = (Integer) this.b.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        x2.g.g(num);
        return num.intValue();
    }

    public boolean F() {
        return q4.b(this.b);
    }

    public void G(y yVar) {
        synchronized (this.f36966d) {
            try {
                this.f36967e = yVar;
                p0.v<g0.z2> vVar = this.f36971i;
                if (vVar != null) {
                    vVar.u(yVar.W().j());
                }
                p0.v<Integer> vVar2 = this.f36968f;
                if (vVar2 != null) {
                    vVar2.u(this.f36967e.U().g());
                }
                p0.v<Integer> vVar3 = this.f36969g;
                if (vVar3 != null) {
                    vVar3.u(this.f36967e.U().h());
                }
                p0.v<Integer> vVar4 = this.f36970h;
                if (vVar4 != null) {
                    vVar4.u(this.f36967e.J().c());
                }
                List<Pair<n0.u, Executor>> list = this.f36973k;
                if (list != null) {
                    for (Pair<n0.u, Executor> pair : list) {
                        this.f36967e.C((Executor) pair.second, (n0.u) pair.first);
                    }
                    this.f36973k = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        H();
    }

    public final void H() {
        I();
    }

    public final void I() {
        String str;
        int iE = E();
        if (iE == 0) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED";
        } else if (iE == 1) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_FULL";
        } else if (iE == 2) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY";
        } else if (iE == 3) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_3";
        } else if (iE != 4) {
            str = "Unknown value: " + iE;
        } else {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL";
        }
        g0.r1.e("Camera2CameraInfo", "Device Level: " + str);
    }

    public void J(androidx.p000lifecycle.a0<g0.w> a0Var) {
        this.f36972j.u(a0Var);
    }

    @Override // n0.o0
    public Set<Integer> a() {
        int[] iArrE = this.b.e().e();
        if (iArrE == null) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        for (int i10 : iArrE) {
            hashSet.add(Integer.valueOf(i10));
        }
        return hashSet;
    }

    @Override // g0.t
    public androidx.p000lifecycle.a0<g0.w> b() {
        return this.f36972j;
    }

    @Override // n0.o0
    public Set<g0.k0> c() {
        return b0.e.a(this.b).c();
    }

    @Override // g0.t
    public int d() {
        return w(0);
    }

    @Override // n0.o0
    public String e() {
        return this.f36964a;
    }

    @Override // n0.o0
    public void f(Executor executor, n0.u uVar) {
        synchronized (this.f36966d) {
            try {
                y yVar = this.f36967e;
                if (yVar != null) {
                    yVar.C(executor, uVar);
                    return;
                }
                if (this.f36973k == null) {
                    this.f36973k = new ArrayList();
                }
                this.f36973k.add(new Pair<>(uVar, executor));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // n0.o0
    public Rect h() {
        Rect rect = (Rect) this.b.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        return ("robolectric".equals(Build.FINGERPRINT) && rect == null) ? new Rect(0, 0, 4000, 3000) : (Rect) x2.g.g(rect);
    }

    @Override // g0.t
    public int i() {
        Integer num = (Integer) this.b.a(CameraCharacteristics.LENS_FACING);
        x2.g.b(num != null, "Unable to get the lens facing of the camera.");
        return o4.a(num.intValue());
    }

    @Override // n0.o0
    public List<Size> j(int i10) {
        Size[] sizeArrA = this.b.e().a(i10);
        return sizeArrA != null ? Arrays.asList(sizeArrA) : Collections.EMPTY_LIST;
    }

    @Override // n0.o0
    public Object k() {
        return this.b.j();
    }

    @Override // n0.o0
    public n0.k3 l() {
        return this.f36974l;
    }

    @Override // n0.o0
    public List<Size> m(int i10) {
        Size[] sizeArrG = this.b.e().g(i10);
        return sizeArrG != null ? Arrays.asList(sizeArrG) : Collections.EMPTY_LIST;
    }

    @Override // n0.o0
    public Set<Integer> n() {
        HashSet hashSet = new HashSet();
        int[] iArr = (int[]) this.b.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i10 : iArr) {
                hashSet.add(Integer.valueOf(i10));
            }
        }
        return hashSet;
    }

    @Override // n0.o0
    public boolean o() {
        int[] iArr = (int[]) this.b.a(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
        if (iArr != null) {
            for (int i10 : iArr) {
                if (i10 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // g0.t
    public androidx.p000lifecycle.a0<Integer> p() {
        synchronized (this.f36966d) {
            try {
                y yVar = this.f36967e;
                if (yVar == null) {
                    if (this.f36968f == null) {
                        this.f36968f = new p0.v<>(0);
                    }
                    return this.f36968f;
                }
                p0.v<Integer> vVar = this.f36968f;
                if (vVar != null) {
                    return vVar;
                }
                return yVar.U().g();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // n0.o0
    public List<Size> r(Range<Integer> range) {
        Size[] sizeArrD;
        try {
            sizeArrD = this.b.e().d(range);
        } catch (IllegalArgumentException e10) {
            g0.r1.m("Camera2CameraInfo", "Can't get high speed resolutions for " + range, e10);
            sizeArrD = null;
        }
        return sizeArrD != null ? Arrays.asList(sizeArrD) : Collections.EMPTY_LIST;
    }

    @Override // n0.o0
    public boolean s() {
        return o6.a(this.b, 9);
    }

    @Override // n0.o0
    public n0.a4 t() {
        Integer num = (Integer) this.b.a(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE);
        x2.g.g(num);
        return num.intValue() != 1 ? n0.a4.UPTIME : n0.a4.REALTIME;
    }

    @Override // g0.t
    public String u() {
        return E() == 2 ? "androidx.camera.camera2.legacy" : "androidx.camera.camera2";
    }

    @Override // n0.o0
    public void v(n0.u uVar) {
        synchronized (this.f36966d) {
            try {
                y yVar = this.f36967e;
                if (yVar != null) {
                    yVar.h0(uVar);
                    return;
                }
                List<Pair<n0.u, Executor>> list = this.f36973k;
                if (list == null) {
                    return;
                }
                Iterator<Pair<n0.u, Executor>> it = list.iterator();
                while (it.hasNext()) {
                    if (it.next().first == uVar) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // g0.t
    public int w(int i10) {
        return p0.c.a(p0.c.b(i10), D(), 1 == i());
    }

    @Override // n0.o0
    public n0.z1 x() {
        return this.f36975m;
    }

    @Override // n0.o0
    public List<Size> y() {
        Size[] sizeArrC = this.b.e().c();
        return sizeArrC != null ? Arrays.asList(sizeArrC) : Collections.EMPTY_LIST;
    }

    @Override // g0.t
    public androidx.p000lifecycle.a0<g0.z2> z() {
        synchronized (this.f36966d) {
            try {
                y yVar = this.f36967e;
                if (yVar == null) {
                    if (this.f36971i == null) {
                        this.f36971i = new p0.v<>(g6.h(this.b));
                    }
                    return this.f36971i;
                }
                p0.v<g0.z2> vVar = this.f36971i;
                if (vVar != null) {
                    return vVar;
                }
                return yVar.W().j();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
