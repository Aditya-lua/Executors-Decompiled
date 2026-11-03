package c2;

import d2.o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class d {
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f4511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f4512e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f4513f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public z1.i f4516i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashSet<d> f4509a = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4514g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4515h = Integer.MIN_VALUE;

    public enum a {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public d(e eVar, a aVar) {
        this.f4511d = eVar;
        this.f4512e = aVar;
    }

    public boolean a(d dVar, int i10) {
        return b(dVar, i10, Integer.MIN_VALUE, false);
    }

    public boolean b(d dVar, int i10, int i11, boolean z10) {
        if (dVar == null) {
            q();
            return true;
        }
        if (!z10 && !p(dVar)) {
            return false;
        }
        this.f4513f = dVar;
        if (dVar.f4509a == null) {
            dVar.f4509a = new HashSet<>();
        }
        HashSet<d> hashSet = this.f4513f.f4509a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f4514g = i10;
        this.f4515h = i11;
        return true;
    }

    public void c(int i10, ArrayList<o> arrayList, o oVar) {
        HashSet<d> hashSet = this.f4509a;
        if (hashSet != null) {
            Iterator<d> it = hashSet.iterator();
            while (it.hasNext()) {
                d2.i.a(it.next().f4511d, i10, arrayList, oVar);
            }
        }
    }

    public HashSet<d> d() {
        return this.f4509a;
    }

    public int e() {
        if (this.f4510c) {
            return this.b;
        }
        return 0;
    }

    public int f() {
        d dVar;
        if (this.f4511d.V() == 8) {
            return 0;
        }
        return (this.f4515h == Integer.MIN_VALUE || (dVar = this.f4513f) == null || dVar.f4511d.V() != 8) ? this.f4514g : this.f4515h;
    }

    public final d g() {
        switch (this.f4512e) {
            case NONE:
            case BASELINE:
            case CENTER:
            case CENTER_X:
            case CENTER_Y:
                return null;
            case LEFT:
                return this.f4511d.Q;
            case TOP:
                return this.f4511d.R;
            case RIGHT:
                return this.f4511d.O;
            case BOTTOM:
                return this.f4511d.P;
            default:
                throw new AssertionError(this.f4512e.name());
        }
    }

    public e h() {
        return this.f4511d;
    }

    public z1.i i() {
        return this.f4516i;
    }

    public d j() {
        return this.f4513f;
    }

    public a k() {
        return this.f4512e;
    }

    public boolean l() {
        HashSet<d> hashSet = this.f4509a;
        if (hashSet == null) {
            return false;
        }
        Iterator<d> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().g().o()) {
                return true;
            }
        }
        return false;
    }

    public boolean m() {
        HashSet<d> hashSet = this.f4509a;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean n() {
        return this.f4510c;
    }

    public boolean o() {
        return this.f4513f != null;
    }

    public boolean p(d dVar) {
        if (dVar == null) {
            return false;
        }
        a aVarK = dVar.k();
        a aVar = this.f4512e;
        if (aVarK == aVar) {
            return aVar != a.BASELINE || (dVar.h().Z() && h().Z());
        }
        switch (aVar) {
            case NONE:
            case CENTER_X:
            case CENTER_Y:
                return false;
            case LEFT:
            case RIGHT:
                boolean z10 = aVarK == a.LEFT || aVarK == a.RIGHT;
                if (dVar.h() instanceof h) {
                    return z10 || aVarK == a.CENTER_X;
                }
                return z10;
            case TOP:
            case BOTTOM:
                boolean z11 = aVarK == a.TOP || aVarK == a.BOTTOM;
                if (dVar.h() instanceof h) {
                    return z11 || aVarK == a.CENTER_Y;
                }
                return z11;
            case BASELINE:
                return (aVarK == a.LEFT || aVarK == a.RIGHT) ? false : true;
            case CENTER:
                return (aVarK == a.BASELINE || aVarK == a.CENTER_X || aVarK == a.CENTER_Y) ? false : true;
            default:
                throw new AssertionError(this.f4512e.name());
        }
    }

    public void q() {
        HashSet<d> hashSet;
        d dVar = this.f4513f;
        if (dVar != null && (hashSet = dVar.f4509a) != null) {
            hashSet.remove(this);
            if (this.f4513f.f4509a.size() == 0) {
                this.f4513f.f4509a = null;
            }
        }
        this.f4509a = null;
        this.f4513f = null;
        this.f4514g = 0;
        this.f4515h = Integer.MIN_VALUE;
        this.f4510c = false;
        this.b = 0;
    }

    public void r() {
        this.f4510c = false;
        this.b = 0;
    }

    public void s(z1.c cVar) {
        z1.i iVar = this.f4516i;
        if (iVar == null) {
            this.f4516i = new z1.i(z1.i.a.UNRESTRICTED, null);
        } else {
            iVar.e();
        }
    }

    public void t(int i10) {
        this.b = i10;
        this.f4510c = true;
    }

    public String toString() {
        return this.f4511d.t() + ":" + this.f4512e.toString();
    }

    public void u(int i10) {
        if (o()) {
            this.f4515h = i10;
        }
    }
}
