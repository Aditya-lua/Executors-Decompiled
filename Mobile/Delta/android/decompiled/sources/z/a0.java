package z;

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements n0.n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f37118a;
    public final h0.a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n0.h1 f37119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n0.g1 f37120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a0.p0 f37121e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q3 f37122f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f37123g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final s0.m f37125i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final g0.g0 f37126j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final q2 f37127k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g0.v f37128l;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map<String, z0> f37124h = new HashMap();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f37129m = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List<String> f37130n = new ArrayList();

    public a0(Context context, n0.h1 h1Var, g0.v vVar, long j10, g0.g0 g0Var, s0.m mVar) throws g0.p1 {
        this.f37118a = context;
        this.f37119c = h1Var;
        a0.p0 p0VarB = a0.p0.b(context, h1Var.c());
        this.f37121e = p0VarB;
        this.f37122f = q3.c(context);
        e0.a aVar = new e0.a(p0VarB);
        this.b = aVar;
        n0.g1 g1Var = new n0.g1(aVar, 1);
        this.f37120d = g1Var;
        aVar.c(g1Var);
        this.f37123g = j10;
        this.f37125i = mVar;
        this.f37126j = g0Var;
        this.f37128l = vVar;
        try {
            List<String> listAsList = Arrays.asList(p0VarB.d());
            this.f37127k = new q2(listAsList, p0VarB, h1Var.b());
            e(listAsList);
        } catch (a0.f e10) {
            throw new g0.p1(a3.a(e10));
        }
    }

    @Override // n0.n0
    public n0.p0 b(String str) {
        synchronized (this.f37129m) {
            if (!this.f37130n.contains(str)) {
                throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
            }
        }
        return new u0(this.f37118a, this.f37121e, str, h(str), this.b, this.f37120d, this.f37119c.b(), this.f37119c.c(), this.f37122f, this.f37123g, this.f37126j);
    }

    @Override // n0.n0
    public n0.a3<List<g0.s>> c() {
        return this.f37127k;
    }

    @Override // n0.n0
    public Set<String> d() {
        LinkedHashSet linkedHashSet;
        synchronized (this.f37129m) {
            linkedHashSet = new LinkedHashSet(this.f37130n);
        }
        return linkedHashSet;
    }

    @Override // n0.r0
    public void e(List<String> list) throws g0.p1 {
        try {
            List<String> listG = g(y2.b(this, this.f37128l, new ArrayList(list)));
            synchronized (this.f37129m) {
                try {
                    if (this.f37130n.equals(listG)) {
                        return;
                    }
                    g0.r1.a("Camera2CameraFactory", "Updated available camera list: " + this.f37130n + " -> " + listG);
                    this.f37130n = listG;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (g0.p1 e10) {
            Log.e("Camera2CameraFactory", "Unable to get backward compatible camera ids", e10);
            throw e10;
        }
    }

    @Override // n0.n0
    public h0.a f() {
        return this.b;
    }

    public final List<String> g(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str.equals("0") || str.equals("1")) {
                arrayList.add(str);
            } else if (x2.a(this.f37121e, str)) {
                arrayList.add(str);
            } else {
                g0.r1.a("Camera2CameraFactory", "Camera " + str + " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE.");
            }
        }
        return arrayList;
    }

    public z0 h(String str) throws g0.x {
        try {
            z0 z0Var = this.f37124h.get(str);
            if (z0Var != null) {
                return z0Var;
            }
            z0 z0Var2 = new z0(str, this.f37121e, this.f37125i);
            this.f37124h.put(str, z0Var2);
            return z0Var2;
        } catch (a0.f e10) {
            throw a3.a(e10);
        }
    }

    @Override // n0.n0
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public a0.p0 a() {
        return this.f37121e;
    }

    @Override // n0.n0
    public void shutdown() {
        this.b.shutdown();
        this.f37127k.h();
    }
}
