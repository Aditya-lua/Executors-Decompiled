package p589z;

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p001a0.C0013f;
import p001a0.C0034p0;
import p089e0.C4741a;
import p140g0.C5886g0;
import p140g0.C5923p1;
import p140g0.C5931r1;
import p140g0.C5933s;
import p140g0.C5945v;
import p140g0.C5953x;
import p155h0.InterfaceC6259a;
import p296n0.AbstractC8762h1;
import p296n0.C8756g1;
import p296n0.InterfaceC8722a3;
import p296n0.InterfaceC8794n0;
import p296n0.InterfaceC8804p0;
import p424s0.InterfaceC11152m;

/* JADX INFO: renamed from: z.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C13476a0 implements InterfaceC8794n0 {

    /* JADX INFO: renamed from: a */
    public final Context f47189a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC6259a f47190b;

    /* JADX INFO: renamed from: c */
    public final AbstractC8762h1 f47191c;

    /* JADX INFO: renamed from: d */
    public final C8756g1 f47192d;

    /* JADX INFO: renamed from: e */
    public final C0034p0 f47193e;

    /* JADX INFO: renamed from: f */
    public final C13606q3 f47194f;

    /* JADX INFO: renamed from: g */
    public final long f47195g;

    /* JADX INFO: renamed from: i */
    public final InterfaceC11152m f47197i;

    /* JADX INFO: renamed from: j */
    public final C5886g0 f47198j;

    /* JADX INFO: renamed from: k */
    public final C13605q2 f47199k;

    /* JADX INFO: renamed from: l */
    public final C5945v f47200l;

    /* JADX INFO: renamed from: h */
    public final Map<String, C13666z0> f47196h = new HashMap();

    /* JADX INFO: renamed from: m */
    public final Object f47201m = new Object();

    /* JADX INFO: renamed from: n */
    public List<String> f47202n = new ArrayList();

    public C13476a0(Context context, AbstractC8762h1 abstractC8762h1, C5945v c5945v, long j10, C5886g0 c5886g0, InterfaceC11152m interfaceC11152m) throws C5923p1 {
        this.f47189a = context;
        this.f47191c = abstractC8762h1;
        C0034p0 c0034p0M63b = C0034p0.m63b(context, abstractC8762h1.mo35142c());
        this.f47193e = c0034p0M63b;
        this.f47194f = C13606q3.m49574c(context);
        C4741a c4741a = new C4741a(c0034p0M63b);
        this.f47190b = c4741a;
        C8756g1 c8756g1 = new C8756g1(c4741a, 1);
        this.f47192d = c8756g1;
        c4741a.mo23114c(c8756g1);
        this.f47195g = j10;
        this.f47197i = interfaceC11152m;
        this.f47198j = c5886g0;
        this.f47200l = c5945v;
        try {
            List<String> listAsList = Arrays.asList(c0034p0M63b.m65d());
            this.f47199k = new C13605q2(listAsList, c0034p0M63b, abstractC8762h1.mo35141b());
            mo35390e(listAsList);
        } catch (C0013f e10) {
            throw new C5923p1(C13479a3.m49169a(e10));
        }
    }

    @Override // p296n0.InterfaceC8794n0
    /* JADX INFO: renamed from: b */
    public InterfaceC8804p0 mo35283b(String str) {
        synchronized (this.f47201m) {
            if (!this.f47202n.contains(str)) {
                throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
            }
        }
        return new C13631u0(this.f47189a, this.f47193e, str, m49164h(str), this.f47190b, this.f47192d, this.f47191c.mo35141b(), this.f47191c.mo35142c(), this.f47194f, this.f47195g, this.f47198j);
    }

    @Override // p296n0.InterfaceC8794n0
    /* JADX INFO: renamed from: c */
    public InterfaceC8722a3<List<C5933s>> mo35284c() {
        return this.f47199k;
    }

    @Override // p296n0.InterfaceC8794n0
    /* JADX INFO: renamed from: d */
    public Set<String> mo35285d() {
        LinkedHashSet linkedHashSet;
        synchronized (this.f47201m) {
            linkedHashSet = new LinkedHashSet(this.f47202n);
        }
        return linkedHashSet;
    }

    @Override // p296n0.InterfaceC8814r0
    /* JADX INFO: renamed from: e */
    public void mo35390e(List<String> list) throws C5923p1 {
        try {
            List<String> listM49163g = m49163g(C13661y2.m49813b(this, this.f47200l, new ArrayList(list)));
            synchronized (this.f47201m) {
                try {
                    if (this.f47202n.equals(listM49163g)) {
                        return;
                    }
                    C5931r1.m26561a("Camera2CameraFactory", "Updated available camera list: " + this.f47202n + " -> " + listM49163g);
                    this.f47202n = listM49163g;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (C5923p1 e10) {
            Log.e("Camera2CameraFactory", "Unable to get backward compatible camera ids", e10);
            throw e10;
        }
    }

    @Override // p296n0.InterfaceC8794n0
    /* JADX INFO: renamed from: f */
    public InterfaceC6259a mo35286f() {
        return this.f47190b;
    }

    /* JADX INFO: renamed from: g */
    public final List<String> m49163g(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str.equals("0") || str.equals("1")) {
                arrayList.add(str);
            } else if (C13654x2.m49735a(this.f47193e, str)) {
                arrayList.add(str);
            } else {
                C5931r1.m26561a("Camera2CameraFactory", "Camera " + str + " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE.");
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public C13666z0 m49164h(String str) throws C5953x {
        try {
            C13666z0 c13666z0 = this.f47196h.get(str);
            if (c13666z0 != null) {
                return c13666z0;
            }
            C13666z0 c13666z1 = new C13666z0(str, this.f47193e, this.f47197i);
            this.f47196h.put(str, c13666z1);
            return c13666z1;
        } catch (C0013f e10) {
            throw C13479a3.m49169a(e10);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: a()Ljava/lang/Object; */
    @Override // p296n0.InterfaceC8794n0
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public C0034p0 mo35282a() {
        return this.f47193e;
    }

    @Override // p296n0.InterfaceC8794n0
    public void shutdown() {
        this.f47190b.shutdown();
        this.f47199k.mo35003h();
    }
}
