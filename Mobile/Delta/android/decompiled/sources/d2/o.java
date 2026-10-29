package d2;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f14363g;
    public int b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14366d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList<c2.e> f14364a = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14365c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList<a> f14367e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f14368f = -1;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<c2.e> f14369a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f14370c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f14371d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f14372e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f14373f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f14374g;

        public a(c2.e eVar, z1.d dVar, int i10) {
            this.f14369a = new WeakReference<>(eVar);
            this.b = dVar.y(eVar.O);
            this.f14370c = dVar.y(eVar.P);
            this.f14371d = dVar.y(eVar.Q);
            this.f14372e = dVar.y(eVar.R);
            this.f14373f = dVar.y(eVar.S);
            this.f14374g = i10;
        }
    }

    public o(int i10) {
        int i11 = f14363g;
        f14363g = i11 + 1;
        this.b = i11;
        this.f14366d = i10;
    }

    public boolean a(c2.e eVar) {
        if (this.f14364a.contains(eVar)) {
            return false;
        }
        this.f14364a.add(eVar);
        return true;
    }

    public void b(ArrayList<o> arrayList) {
        int size = this.f14364a.size();
        if (this.f14368f != -1 && size > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                o oVar = arrayList.get(i10);
                if (this.f14368f == oVar.b) {
                    g(this.f14366d, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.f14366d;
    }

    public final String e() {
        int i10 = this.f14366d;
        if (i10 == 0) {
            return "Horizontal";
        }
        if (i10 == 1) {
            return "Vertical";
        }
        return i10 == 2 ? "Both" : "Unknown";
    }

    public int f(z1.d dVar, int i10) {
        if (this.f14364a.size() == 0) {
            return 0;
        }
        return j(dVar, this.f14364a, i10);
    }

    public void g(int i10, o oVar) {
        ArrayList<c2.e> arrayList = this.f14364a;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            c2.e eVar = arrayList.get(i11);
            i11++;
            c2.e eVar2 = eVar;
            oVar.a(eVar2);
            if (i10 == 0) {
                eVar2.I0 = oVar.c();
            } else {
                eVar2.J0 = oVar.c();
            }
        }
        this.f14368f = oVar.b;
    }

    public void h(boolean z10) {
        this.f14365c = z10;
    }

    public void i(int i10) {
        this.f14366d = i10;
    }

    public final int j(z1.d dVar, ArrayList<c2.e> arrayList, int i10) {
        int iY;
        int iY2;
        c2.f fVar = (c2.f) arrayList.get(0).K();
        dVar.E();
        fVar.g(dVar, false);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList.get(i11).g(dVar, false);
        }
        if (i10 == 0 && fVar.W0 > 0) {
            c2.b.b(fVar, dVar, arrayList, 0);
        }
        if (i10 == 1 && fVar.X0 > 0) {
            c2.b.b(fVar, dVar, arrayList, 1);
        }
        try {
            dVar.A();
        } catch (Exception e10) {
            System.err.println(e10.toString() + "\n" + Arrays.toString(e10.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.f14367e = new ArrayList<>();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            this.f14367e.add(new a(arrayList.get(i12), dVar, i10));
        }
        if (i10 == 0) {
            iY = dVar.y(fVar.O);
            iY2 = dVar.y(fVar.Q);
            dVar.E();
        } else {
            iY = dVar.y(fVar.P);
            iY2 = dVar.y(fVar.R);
            dVar.E();
        }
        return iY2 - iY;
    }

    public String toString() {
        String str = e() + " [" + this.b + "] <";
        ArrayList<c2.e> arrayList = this.f14364a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            c2.e eVar = arrayList.get(i10);
            i10++;
            str = str + " " + eVar.t();
        }
        return str + " >";
    }
}
