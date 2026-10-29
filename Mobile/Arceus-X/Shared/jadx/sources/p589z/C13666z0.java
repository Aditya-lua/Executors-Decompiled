package p589z;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import androidx.p616lifecycle.AbstractC0940a0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import p001a0.C0008c0;
import p001a0.C0034p0;
import p020b0.C1179e;
import p036c0.C1496a;
import p114f0.C5229h;
import p140g0.AbstractC5949w;
import p140g0.C5902k0;
import p140g0.C5931r1;
import p140g0.InterfaceC5964z2;
import p296n0.AbstractC8828u;
import p296n0.C8782k3;
import p296n0.EnumC8723a4;
import p296n0.InterfaceC8799o0;
import p296n0.InterfaceC8855z1;
import p347p0.C10087c;
import p347p0.C10106v;
import p424s0.InterfaceC11152m;
import p533x2.C12637g;

/* JADX INFO: renamed from: z.z0 */
/* JADX INFO: loaded from: classes.dex */
public final class C13666z0 implements InterfaceC8799o0 {

    /* JADX INFO: renamed from: a */
    public final String f47876a;

    /* JADX INFO: renamed from: b */
    public final C0008c0 f47877b;

    /* JADX INFO: renamed from: c */
    public final C5229h f47878c;

    /* JADX INFO: renamed from: e */
    public C13658y f47880e;

    /* JADX INFO: renamed from: j */
    public final C10106v<AbstractC5949w> f47885j;

    /* JADX INFO: renamed from: l */
    public final C8782k3 f47887l;

    /* JADX INFO: renamed from: m */
    public final InterfaceC8855z1 f47888m;

    /* JADX INFO: renamed from: n */
    public final C0034p0 f47889n;

    /* JADX INFO: renamed from: o */
    public final InterfaceC11152m f47890o;

    /* JADX INFO: renamed from: d */
    public final Object f47879d = new Object();

    /* JADX INFO: renamed from: f */
    public C10106v<Integer> f47881f = null;

    /* JADX INFO: renamed from: g */
    public C10106v<Integer> f47882g = null;

    /* JADX INFO: renamed from: h */
    public C10106v<Integer> f47883h = null;

    /* JADX INFO: renamed from: i */
    public C10106v<InterfaceC5964z2> f47884i = null;

    /* JADX INFO: renamed from: k */
    public List<Pair<AbstractC8828u, Executor>> f47886k = null;

    public C13666z0(String str, C0034p0 c0034p0, InterfaceC11152m interfaceC11152m) {
        String str2 = (String) C12637g.m47075g(str);
        this.f47876a = str2;
        this.f47889n = c0034p0;
        C0008c0 c0008c0M64c = c0034p0.m64c(str2);
        this.f47877b = c0008c0M64c;
        this.f47878c = new C5229h(this);
        C8782k3 c8782k3M7646a = C1496a.m7646a(str, c0008c0M64c);
        this.f47887l = c8782k3M7646a;
        this.f47888m = new C13574m2(str, c8782k3M7646a);
        this.f47885j = new C10106v<>(AbstractC5949w.m26672a(AbstractC5949w.b.CLOSED));
        this.f47890o = interfaceC11152m;
    }

    /* JADX INFO: renamed from: B */
    public C5229h m49815B() {
        return this.f47878c;
    }

    /* JADX INFO: renamed from: C */
    public C0008c0 m49816C() {
        return this.f47877b;
    }

    /* JADX INFO: renamed from: D */
    public int m49817D() {
        Integer num = (Integer) this.f47877b.m9a(CameraCharacteristics.SENSOR_ORIENTATION);
        C12637g.m47075g(num);
        return num.intValue();
    }

    /* JADX INFO: renamed from: E */
    public int m49818E() {
        Integer num = (Integer) this.f47877b.m9a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        C12637g.m47075g(num);
        return num.intValue();
    }

    /* JADX INFO: renamed from: F */
    public boolean m49819F() {
        return C13607q4.m49582b(this.f47877b);
    }

    /* JADX DEBUG: Type inference failed for r1v11. Raw type applied. Possible types: androidx.lifecycle.a0<java.lang.Integer>, androidx.lifecycle.a0<I> */
    /* JADX DEBUG: Type inference failed for r1v14. Raw type applied. Possible types: androidx.lifecycle.a0<java.lang.Integer>, androidx.lifecycle.a0<I> */
    /* JADX DEBUG: Type inference failed for r1v8. Raw type applied. Possible types: androidx.lifecycle.a0<java.lang.Integer>, androidx.lifecycle.a0<I> */
    /* JADX INFO: renamed from: G */
    public void m49820G(C13658y c13658y) {
        synchronized (this.f47879d) {
            try {
                this.f47880e = c13658y;
                C10106v<InterfaceC5964z2> c10106v = this.f47884i;
                if (c10106v != null) {
                    c10106v.m38997u(c13658y.m49782W().m49358j());
                }
                C10106v<Integer> c10106v2 = this.f47881f;
                if (c10106v2 != null) {
                    c10106v2.m38997u(this.f47880e.m49780U().m49742g());
                }
                C10106v<Integer> c10106v3 = this.f47882g;
                if (c10106v3 != null) {
                    c10106v3.m38997u(this.f47880e.m49780U().m49743h());
                }
                C10106v<Integer> c10106v4 = this.f47883h;
                if (c10106v4 != null) {
                    c10106v4.m38997u(this.f47880e.m49770J().m49583c());
                }
                List<Pair<AbstractC8828u, Executor>> list = this.f47886k;
                if (list != null) {
                    for (Pair<AbstractC8828u, Executor> pair : list) {
                        this.f47880e.m49763C((Executor) pair.second, (AbstractC8828u) pair.first);
                    }
                    this.f47886k = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m49821H();
    }

    /* JADX INFO: renamed from: H */
    public final void m49821H() {
        m49822I();
    }

    /* JADX INFO: renamed from: I */
    public final void m49822I() {
        String str;
        int iM49818E = m49818E();
        if (iM49818E == 0) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED";
        } else if (iM49818E == 1) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_FULL";
        } else if (iM49818E == 2) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY";
        } else if (iM49818E == 3) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_3";
        } else if (iM49818E != 4) {
            str = "Unknown value: " + iM49818E;
        } else {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL";
        }
        C5931r1.m26565e("Camera2CameraInfo", "Device Level: " + str);
    }

    /* JADX INFO: renamed from: J */
    public void m49823J(AbstractC0940a0<AbstractC5949w> abstractC0940a0) {
        this.f47885j.m38997u(abstractC0940a0);
    }

    @Override // p296n0.InterfaceC8799o0
    /* JADX INFO: renamed from: a */
    public Set<Integer> mo35042a() {
        int[] iArrM93e = this.f47877b.m13e().m93e();
        if (iArrM93e == null) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        for (int i10 : iArrM93e) {
            hashSet.add(Integer.valueOf(i10));
        }
        return hashSet;
    }

    @Override // p140g0.InterfaceC5937t
    /* JADX INFO: renamed from: b */
    public AbstractC0940a0<AbstractC5949w> mo26582b() {
        return this.f47885j;
    }

    @Override // p296n0.InterfaceC8799o0
    /* JADX INFO: renamed from: c */
    public Set<C5902k0> mo35043c() {
        return C1179e.m6542a(this.f47877b).m6545c();
    }

    @Override // p140g0.InterfaceC5937t
    /* JADX INFO: renamed from: d */
    public int mo6749d() {
        return mo6751w(0);
    }

    @Override // p296n0.InterfaceC8799o0
    /* JADX INFO: renamed from: e */
    public String mo6750e() {
        return this.f47876a;
    }

    @Override // p296n0.InterfaceC8799o0
    /* JADX INFO: renamed from: f */
    public void mo35044f(Executor executor, AbstractC8828u abstractC8828u) {
        synchronized (this.f47879d) {
            try {
                C13658y c13658y = this.f47880e;
                if (c13658y != null) {
                    c13658y.m49763C(executor, abstractC8828u);
                    return;
                }
                if (this.f47886k == null) {
                    this.f47886k = new ArrayList();
                }
                this.f47886k.add(new Pair<>(abstractC8828u, executor));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p296n0.InterfaceC8799o0
    /* JADX INFO: renamed from: h */
    public Rect mo35046h() {
        Rect rect = (Rect) this.f47877b.m9a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        return ("robolectric".equals(Build.FINGERPRINT) && rect == null) ? new Rect(0, 0, 4000, 3000) : (Rect) C12637g.m47075g(rect);
    }

    @Override // p140g0.InterfaceC5937t
    /* JADX INFO: renamed from: i */
    public int mo26583i() {
        Integer num = (Integer) this.f47877b.m9a(CameraCharacteristics.LENS_FACING);
        C12637g.m47070b(num != null, "Unable to get the lens facing of the camera.");
        return C13592o4.m49564a(num.intValue());
    }

    @Override // p296n0.InterfaceC8799o0
    /* JADX INFO: renamed from: j */
    public List<Size> mo35047j(int i10) {
        Size[] sizeArrM89a = this.f47877b.m13e().m89a(i10);
        return sizeArrM89a != null ? Arrays.asList(sizeArrM89a) : Collections.EMPTY_LIST;
    }

    @Override // p296n0.InterfaceC8799o0
    /* JADX INFO: renamed from: k */
    public Object mo35048k() {
        return this.f47877b.m18j();
    }

    @Override // p296n0.InterfaceC8799o0
    /* JADX INFO: renamed from: l */
    public C8782k3 mo35049l() {
        return this.f47887l;
    }

    @Override // p296n0.InterfaceC8799o0
    /* JADX INFO: renamed from: m */
    public List<Size> mo35050m(int i10) {
        Size[] sizeArrM95g = this.f47877b.m13e().m95g(i10);
        return sizeArrM95g != null ? Arrays.asList(sizeArrM95g) : Collections.EMPTY_LIST;
    }

    @Override // p296n0.InterfaceC8799o0
    /* JADX INFO: renamed from: n */
    public Set<Integer> mo35051n() {
        HashSet hashSet = new HashSet();
        int[] iArr = (int[]) this.f47877b.m9a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i10 : iArr) {
                hashSet.add(Integer.valueOf(i10));
            }
        }
        return hashSet;
    }

    @Override // p296n0.InterfaceC8799o0
    /* JADX INFO: renamed from: o */
    public boolean mo35052o() {
        int[] iArr = (int[]) this.f47877b.m9a(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
        if (iArr != null) {
            for (int i10 : iArr) {
                if (i10 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p140g0.InterfaceC5937t
    /* JADX INFO: renamed from: p */
    public AbstractC0940a0<Integer> mo26584p() {
        synchronized (this.f47879d) {
            try {
                C13658y c13658y = this.f47880e;
                if (c13658y == null) {
                    if (this.f47881f == null) {
                        this.f47881f = new C10106v<>(0);
                    }
                    return this.f47881f;
                }
                C10106v<Integer> c10106v = this.f47881f;
                if (c10106v != null) {
                    return c10106v;
                }
                return c13658y.m49780U().m49742g();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p296n0.InterfaceC8799o0
    /* JADX INFO: renamed from: r */
    public List<Size> mo35054r(Range<Integer> range) {
        Size[] sizeArrM92d;
        try {
            sizeArrM92d = this.f47877b.m13e().m92d(range);
        } catch (IllegalArgumentException e10) {
            C5931r1.m26573m("Camera2CameraInfo", "Can't get high speed resolutions for " + range, e10);
            sizeArrM92d = null;
        }
        return sizeArrM92d != null ? Arrays.asList(sizeArrM92d) : Collections.EMPTY_LIST;
    }

    @Override // p296n0.InterfaceC8799o0
    /* JADX INFO: renamed from: s */
    public boolean mo35055s() {
        return C13594o6.m49565a(this.f47877b, 9);
    }

    @Override // p296n0.InterfaceC8799o0
    /* JADX INFO: renamed from: t */
    public EnumC8723a4 mo35056t() {
        Integer num = (Integer) this.f47877b.m9a(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE);
        C12637g.m47075g(num);
        return num.intValue() != 1 ? EnumC8723a4.UPTIME : EnumC8723a4.REALTIME;
    }

    @Override // p140g0.InterfaceC5937t
    /* JADX INFO: renamed from: u */
    public String mo26585u() {
        return m49818E() == 2 ? "androidx.camera.camera2.legacy" : "androidx.camera.camera2";
    }

    @Override // p296n0.InterfaceC8799o0
    /* JADX INFO: renamed from: v */
    public void mo35057v(AbstractC8828u abstractC8828u) {
        synchronized (this.f47879d) {
            try {
                C13658y c13658y = this.f47880e;
                if (c13658y != null) {
                    c13658y.m49791h0(abstractC8828u);
                    return;
                }
                List<Pair<AbstractC8828u, Executor>> list = this.f47886k;
                if (list == null) {
                    return;
                }
                Iterator<Pair<AbstractC8828u, Executor>> it = list.iterator();
                while (it.hasNext()) {
                    if (it.next().first == abstractC8828u) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p140g0.InterfaceC5937t
    /* JADX INFO: renamed from: w */
    public int mo6751w(int i10) {
        return C10087c.m38902a(C10087c.m38903b(i10), m49817D(), 1 == mo26583i());
    }

    @Override // p296n0.InterfaceC8799o0
    /* JADX INFO: renamed from: x */
    public InterfaceC8855z1 mo35058x() {
        return this.f47888m;
    }

    @Override // p296n0.InterfaceC8799o0
    /* JADX INFO: renamed from: y */
    public List<Size> mo35059y() {
        Size[] sizeArrM91c = this.f47877b.m13e().m91c();
        return sizeArrM91c != null ? Arrays.asList(sizeArrM91c) : Collections.EMPTY_LIST;
    }

    @Override // p140g0.InterfaceC5937t
    /* JADX INFO: renamed from: z */
    public AbstractC0940a0<InterfaceC5964z2> mo26586z() {
        synchronized (this.f47879d) {
            try {
                C13658y c13658y = this.f47880e;
                if (c13658y == null) {
                    if (this.f47884i == null) {
                        this.f47884i = new C10106v<>(C13530g6.m49353h(this.f47877b));
                    }
                    return this.f47884i;
                }
                C10106v<InterfaceC5964z2> c10106v = this.f47884i;
                if (c10106v != null) {
                    return c10106v;
                }
                return c13658y.m49782W().m49358j();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
