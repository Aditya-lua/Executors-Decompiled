package c2;

import d2.o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class d {
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f4345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f4346e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f4347f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public z1.i f4350i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashSet<d> f4343a = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4348g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4349h = Integer.MIN_VALUE;

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
        this.f4345d = eVar;
        this.f4346e = aVar;
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
        this.f4347f = dVar;
        if (dVar.f4343a == null) {
            dVar.f4343a = new HashSet<>();
        }
        HashSet<d> hashSet = this.f4347f.f4343a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f4348g = i10;
        this.f4349h = i11;
        return true;
    }

    public void c(int i10, ArrayList<o> arrayList, o oVar) {
        HashSet<d> hashSet = this.f4343a;
        if (hashSet != null) {
            Iterator<d> it = hashSet.iterator();
            while (it.hasNext()) {
                d2.i.a(it.next().f4345d, i10, arrayList, oVar);
            }
        }
    }

    public HashSet<d> d() {
        return this.f4343a;
    }

    public int e() {
        if (this.f4344c) {
            return this.b;
        }
        return 0;
    }

    public int f() {
        d dVar;
        if (this.f4345d.V() == 8) {
            return 0;
        }
        return (this.f4349h == Integer.MIN_VALUE || (dVar = this.f4347f) == null || dVar.f4345d.V() != 8) ? this.f4348g : this.f4349h;
    }

    public final d g() {
        switch (this.f4346e) {
            case NONE:
            case BASELINE:
            case CENTER:
            case CENTER_X:
            case CENTER_Y:
                return null;
            case LEFT:
                return this.f4345d.Q;
            case TOP:
                return this.f4345d.R;
            case RIGHT:
                return this.f4345d.O;
            case BOTTOM:
                return this.f4345d.P;
            default:
                throw new AssertionError(this.f4346e.name());
        }
    }

    public e h() {
        return this.f4345d;
    }

    public z1.i i() {
        return this.f4350i;
    }

    public d j() {
        return this.f4347f;
    }

    public a k() {
        return this.f4346e;
    }

    public boolean l() {
        HashSet<d> hashSet = this.f4343a;
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
        HashSet<d> hashSet = this.f4343a;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean n() {
        return this.f4344c;
    }

    public boolean o() {
        return this.f4347f != null;
    }

    public boolean p(d dVar) {
        if (dVar == null) {
            return false;
        }
        a aVarK = dVar.k();
        a aVar = this.f4346e;
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
                throw new AssertionError(this.f4346e.name());
        }
    }

    public void q() {
        HashSet<d> hashSet;
        d dVar = this.f4347f;
        if (dVar != null && (hashSet = dVar.f4343a) != null) {
            hashSet.remove(this);
            if (this.f4347f.f4343a.size() == 0) {
                this.f4347f.f4343a = null;
            }
        }
        this.f4343a = null;
        this.f4347f = null;
        this.f4348g = 0;
        this.f4349h = Integer.MIN_VALUE;
        this.f4344c = false;
        this.b = 0;
    }

    public void r() {
        this.f4344c = false;
        this.b = 0;
    }

    public void s(z1.c cVar) {
        z1.i iVar = this.f4350i;
        if (iVar == null) {
            this.f4350i = new z1.i(z1.i.a.UNRESTRICTED, null);
        } else {
            iVar.e();
        }
    }

    public void t(int i10) {
        this.b = i10;
        this.f4344c = true;
    }

    public String toString() {
        return this.f4345d.t() + ":" + this.f4346e.toString();
    }

    public void u(int i10) {
        if (o()) {
            this.f4349h = i10;
        }
    }
}
