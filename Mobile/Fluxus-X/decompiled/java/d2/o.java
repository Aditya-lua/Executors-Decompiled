package d2;

import com.github.luben.zstd.BuildConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f11728g;
    public int b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11731d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList<c2.e> f11729a = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11730c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList<a> f11732e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11733f = -1;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<c2.e> f11734a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f11735c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f11736d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f11737e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f11738f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f11739g;

        public a(c2.e eVar, z1.d dVar, int i10) {
            this.f11734a = new WeakReference<>(eVar);
            this.b = dVar.y(eVar.O);
            this.f11735c = dVar.y(eVar.P);
            this.f11736d = dVar.y(eVar.Q);
            this.f11737e = dVar.y(eVar.R);
            this.f11738f = dVar.y(eVar.S);
            this.f11739g = i10;
        }
    }

    public o(int i10) {
        int i11 = f11728g;
        f11728g = i11 + 1;
        this.b = i11;
        this.f11731d = i10;
    }

    public boolean a(c2.e eVar) {
        if (this.f11729a.contains(eVar)) {
            return false;
        }
        this.f11729a.add(eVar);
        return true;
    }

    public void b(ArrayList<o> arrayList) {
        int size = this.f11729a.size();
        if (this.f11733f != -1 && size > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                o oVar = arrayList.get(i10);
                if (this.f11733f == oVar.b) {
                    g(this.f11731d, oVar);
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
        return this.f11731d;
    }

    public final String e() {
        int i10 = this.f11731d;
        if (i10 == 0) {
            return "Horizontal";
        }
        if (i10 == 1) {
            return "Vertical";
        }
        return i10 == 2 ? "Both" : "Unknown";
    }

    public int f(z1.d dVar, int i10) {
        if (this.f11729a.size() == 0) {
            return 0;
        }
        return j(dVar, this.f11729a, i10);
    }

    public void g(int i10, o oVar) {
        ArrayList<c2.e> arrayList = this.f11729a;
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
        this.f11733f = oVar.b;
    }

    public void h(boolean z10) {
        this.f11730c = z10;
    }

    public void i(int i10) {
        this.f11731d = i10;
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
            System.err.println(e10.toString() + "\n" + Arrays.toString(e10.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", BuildConfig.FLAVOR));
        }
        this.f11732e = new ArrayList<>();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            this.f11732e.add(new a(arrayList.get(i12), dVar, i10));
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
        ArrayList<c2.e> arrayList = this.f11729a;
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
