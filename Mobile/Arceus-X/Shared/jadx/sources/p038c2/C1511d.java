package p038c2;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p065d2.C4415i;
import p065d2.C4421o;
import p591z1.C13681c;
import p591z1.C13687i;

/* JADX INFO: renamed from: c2.d */
/* JADX INFO: loaded from: classes.dex */
public class C1511d {

    /* JADX INFO: renamed from: b */
    public int f5814b;

    /* JADX INFO: renamed from: c */
    public boolean f5815c;

    /* JADX INFO: renamed from: d */
    public final C1512e f5816d;

    /* JADX INFO: renamed from: e */
    public final a f5817e;

    /* JADX INFO: renamed from: f */
    public C1511d f5818f;

    /* JADX INFO: renamed from: i */
    public C13687i f5821i;

    /* JADX INFO: renamed from: a */
    public HashSet<C1511d> f5813a = null;

    /* JADX INFO: renamed from: g */
    public int f5819g = 0;

    /* JADX INFO: renamed from: h */
    public int f5820h = EditorInfoCompat.IME_FLAG_FORCE_ASCII;

    /* JADX INFO: renamed from: c2.d$a */
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

    public C1511d(C1512e c1512e, a aVar) {
        this.f5816d = c1512e;
        this.f5817e = aVar;
    }

    /* JADX INFO: renamed from: a */
    public boolean m7681a(C1511d c1511d, int i10) {
        return m7682b(c1511d, i10, EditorInfoCompat.IME_FLAG_FORCE_ASCII, false);
    }

    /* JADX INFO: renamed from: b */
    public boolean m7682b(C1511d c1511d, int i10, int i11, boolean z10) {
        if (c1511d == null) {
            m7697q();
            return true;
        }
        if (!z10 && !m7696p(c1511d)) {
            return false;
        }
        this.f5818f = c1511d;
        if (c1511d.f5813a == null) {
            c1511d.f5813a = new HashSet<>();
        }
        HashSet<C1511d> hashSet = this.f5818f.f5813a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f5819g = i10;
        this.f5820h = i11;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public void m7683c(int i10, ArrayList<C4421o> arrayList, C4421o c4421o) {
        HashSet<C1511d> hashSet = this.f5813a;
        if (hashSet != null) {
            Iterator<C1511d> it = hashSet.iterator();
            while (it.hasNext()) {
                C4415i.m22189a(it.next().f5816d, i10, arrayList, c4421o);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public HashSet<C1511d> m7684d() {
        return this.f5813a;
    }

    /* JADX INFO: renamed from: e */
    public int m7685e() {
        if (this.f5815c) {
            return this.f5814b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: f */
    public int m7686f() {
        C1511d c1511d;
        if (this.f5816d.m7745V() == 8) {
            return 0;
        }
        return (this.f5820h == Integer.MIN_VALUE || (c1511d = this.f5818f) == null || c1511d.f5816d.m7745V() != 8) ? this.f5819g : this.f5820h;
    }

    /* JADX INFO: renamed from: g */
    public final C1511d m7687g() {
        switch (this.f5817e) {
            case NONE:
            case BASELINE:
            case CENTER:
            case CENTER_X:
            case CENTER_Y:
                return null;
            case LEFT:
                return this.f5816d.f5859Q;
            case TOP:
                return this.f5816d.f5860R;
            case RIGHT:
                return this.f5816d.f5857O;
            case BOTTOM:
                return this.f5816d.f5858P;
            default:
                throw new AssertionError(this.f5817e.name());
        }
    }

    /* JADX INFO: renamed from: h */
    public C1512e m7688h() {
        return this.f5816d;
    }

    /* JADX INFO: renamed from: i */
    public C13687i m7689i() {
        return this.f5821i;
    }

    /* JADX INFO: renamed from: j */
    public C1511d m7690j() {
        return this.f5818f;
    }

    /* JADX INFO: renamed from: k */
    public a m7691k() {
        return this.f5817e;
    }

    /* JADX INFO: renamed from: l */
    public boolean m7692l() {
        HashSet<C1511d> hashSet = this.f5813a;
        if (hashSet == null) {
            return false;
        }
        Iterator<C1511d> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().m7687g().m7695o()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public boolean m7693m() {
        HashSet<C1511d> hashSet = this.f5813a;
        return hashSet != null && hashSet.size() > 0;
    }

    /* JADX INFO: renamed from: n */
    public boolean m7694n() {
        return this.f5815c;
    }

    /* JADX INFO: renamed from: o */
    public boolean m7695o() {
        return this.f5818f != null;
    }

    /* JADX INFO: renamed from: p */
    public boolean m7696p(C1511d c1511d) {
        if (c1511d == null) {
            return false;
        }
        a aVarM7691k = c1511d.m7691k();
        a aVar = this.f5817e;
        if (aVarM7691k == aVar) {
            return aVar != a.BASELINE || (c1511d.m7688h().m7753Z() && m7688h().m7753Z());
        }
        switch (aVar) {
            case NONE:
            case CENTER_X:
            case CENTER_Y:
                return false;
            case LEFT:
            case RIGHT:
                boolean z10 = aVarM7691k == a.LEFT || aVarM7691k == a.RIGHT;
                if (c1511d.m7688h() instanceof C1515h) {
                    return z10 || aVarM7691k == a.CENTER_X;
                }
                return z10;
            case TOP:
            case BOTTOM:
                boolean z11 = aVarM7691k == a.TOP || aVarM7691k == a.BOTTOM;
                if (c1511d.m7688h() instanceof C1515h) {
                    return z11 || aVarM7691k == a.CENTER_Y;
                }
                return z11;
            case BASELINE:
                return (aVarM7691k == a.LEFT || aVarM7691k == a.RIGHT) ? false : true;
            case CENTER:
                return (aVarM7691k == a.BASELINE || aVarM7691k == a.CENTER_X || aVarM7691k == a.CENTER_Y) ? false : true;
            default:
                throw new AssertionError(this.f5817e.name());
        }
    }

    /* JADX INFO: renamed from: q */
    public void m7697q() {
        HashSet<C1511d> hashSet;
        C1511d c1511d = this.f5818f;
        if (c1511d != null && (hashSet = c1511d.f5813a) != null) {
            hashSet.remove(this);
            if (this.f5818f.f5813a.size() == 0) {
                this.f5818f.f5813a = null;
            }
        }
        this.f5813a = null;
        this.f5818f = null;
        this.f5819g = 0;
        this.f5820h = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        this.f5815c = false;
        this.f5814b = 0;
    }

    /* JADX INFO: renamed from: r */
    public void m7698r() {
        this.f5815c = false;
        this.f5814b = 0;
    }

    /* JADX INFO: renamed from: s */
    public void m7699s(C13681c c13681c) {
        C13687i c13687i = this.f5821i;
        if (c13687i == null) {
            this.f5821i = new C13687i(C13687i.a.UNRESTRICTED, null);
        } else {
            c13687i.m49995e();
        }
    }

    /* JADX INFO: renamed from: t */
    public void m7700t(int i10) {
        this.f5814b = i10;
        this.f5815c = true;
    }

    public String toString() {
        return this.f5816d.m7804t() + ":" + this.f5817e.toString();
    }

    /* JADX INFO: renamed from: u */
    public void m7701u(int i10) {
        if (m7695o()) {
            this.f5820h = i10;
        }
    }
}
