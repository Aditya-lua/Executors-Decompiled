package p065d2;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import p038c2.C1509b;
import p038c2.C1512e;
import p038c2.C1513f;
import p591z1.C13682d;

/* JADX INFO: renamed from: d2.o */
/* JADX INFO: loaded from: classes.dex */
public class C4421o {

    /* JADX INFO: renamed from: g */
    public static int f18364g;

    /* JADX INFO: renamed from: b */
    public int f18366b;

    /* JADX INFO: renamed from: d */
    public int f18368d;

    /* JADX INFO: renamed from: a */
    public ArrayList<C1512e> f18365a = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    public boolean f18367c = false;

    /* JADX INFO: renamed from: e */
    public ArrayList<a> f18369e = null;

    /* JADX INFO: renamed from: f */
    public int f18370f = -1;

    /* JADX INFO: renamed from: d2.o$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public WeakReference<C1512e> f18371a;

        /* JADX INFO: renamed from: b */
        public int f18372b;

        /* JADX INFO: renamed from: c */
        public int f18373c;

        /* JADX INFO: renamed from: d */
        public int f18374d;

        /* JADX INFO: renamed from: e */
        public int f18375e;

        /* JADX INFO: renamed from: f */
        public int f18376f;

        /* JADX INFO: renamed from: g */
        public int f18377g;

        public a(C1512e c1512e, C13682d c13682d, int i10) {
            this.f18371a = new WeakReference<>(c1512e);
            this.f18372b = c13682d.m49977y(c1512e.f5857O);
            this.f18373c = c13682d.m49977y(c1512e.f5858P);
            this.f18374d = c13682d.m49977y(c1512e.f5859Q);
            this.f18375e = c13682d.m49977y(c1512e.f5860R);
            this.f18376f = c13682d.m49977y(c1512e.f5861S);
            this.f18377g = i10;
        }
    }

    public C4421o(int i10) {
        int i11 = f18364g;
        f18364g = i11 + 1;
        this.f18366b = i11;
        this.f18368d = i10;
    }

    /* JADX INFO: renamed from: a */
    public boolean m22202a(C1512e c1512e) {
        if (this.f18365a.contains(c1512e)) {
            return false;
        }
        this.f18365a.add(c1512e);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void m22203b(ArrayList<C4421o> arrayList) {
        int size = this.f18365a.size();
        if (this.f18370f != -1 && size > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                C4421o c4421o = arrayList.get(i10);
                if (this.f18370f == c4421o.f18366b) {
                    m22208g(this.f18368d, c4421o);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    /* JADX INFO: renamed from: c */
    public int m22204c() {
        return this.f18366b;
    }

    /* JADX INFO: renamed from: d */
    public int m22205d() {
        return this.f18368d;
    }

    /* JADX INFO: renamed from: e */
    public final String m22206e() {
        int i10 = this.f18368d;
        if (i10 == 0) {
            return "Horizontal";
        }
        if (i10 == 1) {
            return "Vertical";
        }
        return i10 == 2 ? "Both" : "Unknown";
    }

    /* JADX INFO: renamed from: f */
    public int m22207f(C13682d c13682d, int i10) {
        if (this.f18365a.size() == 0) {
            return 0;
        }
        return m22211j(c13682d, this.f18365a, i10);
    }

    /* JADX INFO: renamed from: g */
    public void m22208g(int i10, C4421o c4421o) {
        ArrayList<C1512e> arrayList = this.f18365a;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            C1512e c1512e = arrayList.get(i11);
            i11++;
            C1512e c1512e2 = c1512e;
            c4421o.m22202a(c1512e2);
            if (i10 == 0) {
                c1512e2.f5850I0 = c4421o.m22204c();
            } else {
                c1512e2.f5852J0 = c4421o.m22204c();
            }
        }
        this.f18370f = c4421o.f18366b;
    }

    /* JADX INFO: renamed from: h */
    public void m22209h(boolean z10) {
        this.f18367c = z10;
    }

    /* JADX INFO: renamed from: i */
    public void m22210i(int i10) {
        this.f18368d = i10;
    }

    /* JADX INFO: renamed from: j */
    public final int m22211j(C13682d c13682d, ArrayList<C1512e> arrayList, int i10) {
        int iM49977y;
        int iM49977y2;
        C1513f c1513f = (C1513f) arrayList.get(0).m7723K();
        c13682d.m49954E();
        c1513f.mo7666g(c13682d, false);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList.get(i11).mo7666g(c13682d, false);
        }
        if (i10 == 0 && c1513f.f5937W0 > 0) {
            C1509b.m7677b(c1513f, c13682d, arrayList, 0);
        }
        if (i10 == 1 && c1513f.f5938X0 > 0) {
            C1509b.m7677b(c1513f, c13682d, arrayList, 1);
        }
        try {
            c13682d.m49950A();
        } catch (Exception e10) {
            System.err.println(e10.toString() + "\n" + Arrays.toString(e10.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.f18369e = new ArrayList<>();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            this.f18369e.add(new a(arrayList.get(i12), c13682d, i10));
        }
        if (i10 == 0) {
            iM49977y = c13682d.m49977y(c1513f.f5857O);
            iM49977y2 = c13682d.m49977y(c1513f.f5859Q);
            c13682d.m49954E();
        } else {
            iM49977y = c13682d.m49977y(c1513f.f5858P);
            iM49977y2 = c13682d.m49977y(c1513f.f5860R);
            c13682d.m49954E();
        }
        return iM49977y2 - iM49977y;
    }

    public String toString() {
        String str = m22206e() + " [" + this.f18366b + "] <";
        ArrayList<C1512e> arrayList = this.f18365a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            C1512e c1512e = arrayList.get(i10);
            i10++;
            str = str + " " + c1512e.m7804t();
        }
        return str + " >";
    }
}
