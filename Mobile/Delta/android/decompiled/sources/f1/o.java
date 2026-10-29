package f1;

import android.util.Size;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<x, h1.i> f15900a = new LinkedHashMap();
    public final TreeMap<Size, x> b = new TreeMap<>(new p0.e());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h1.i f15901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h1.i f15902d;

    public o(n0.z1 z1Var, int i10) {
        for (x xVar : x.b()) {
            n0.a2 a2VarE = e(xVar, z1Var, i10);
            if (a2VarE != null) {
                g0.r1.a("CapabilitiesByQuality", "profiles = " + a2VarE);
                h1.i iVarH = h(a2VarE);
                if (iVarH == null) {
                    g0.r1.l("CapabilitiesByQuality", "EncoderProfiles of quality " + xVar + " has no video validated profiles.");
                } else {
                    this.b.put(iVarH.k().k(), xVar);
                    this.f15900a.put(xVar, iVarH);
                }
            }
        }
        if (this.f15900a.isEmpty()) {
            g0.r1.c("CapabilitiesByQuality", "No supported EncoderProfiles");
            this.f15902d = null;
            this.f15901c = null;
        } else {
            ArrayDeque arrayDeque = new ArrayDeque(this.f15900a.values());
            this.f15901c = (h1.i) arrayDeque.peekFirst();
            this.f15902d = (h1.i) arrayDeque.peekLast();
        }
    }

    public static void a(x xVar) {
        x2.g.b(x.a(xVar), "Unknown quality: " + xVar);
    }

    public static boolean b(n0.z1 z1Var, int i10) {
        return !new o(z1Var, i10).g().isEmpty();
    }

    public h1.i c(Size size) {
        x xVarD = d(size);
        g0.r1.a("CapabilitiesByQuality", "Using supported quality of " + xVarD + " for size " + size);
        if (xVarD == x.f16055g) {
            return null;
        }
        h1.i iVarF = f(xVarD);
        if (iVarF != null) {
            return iVarF;
        }
        throw new AssertionError("Camera advertised available quality but did not produce EncoderProfiles for advertised quality.");
    }

    public x d(Size size) {
        x xVar = (x) w0.d.a(size, this.b);
        return xVar != null ? xVar : x.f16055g;
    }

    public final n0.a2 e(x xVar, n0.z1 z1Var, int i10) {
        x2.g.j(xVar instanceof x.b, "Currently only support ConstantQuality");
        return z1Var.b(((x.b) xVar).e(i10));
    }

    public h1.i f(x xVar) {
        a(xVar);
        if (xVar == x.f16054f) {
            return this.f15901c;
        }
        return xVar == x.f16053e ? this.f15902d : this.f15900a.get(xVar);
    }

    public List<x> g() {
        return new ArrayList(this.f15900a.keySet());
    }

    public final h1.i h(n0.a2 a2Var) {
        if (a2Var.b().isEmpty()) {
            return null;
        }
        return h1.i.i(a2Var);
    }
}
