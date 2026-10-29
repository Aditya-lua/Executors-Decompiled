package h1;

import android.util.Rational;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import m1.r1;
import n0.a2;
import n0.z1;

/* JADX INFO: loaded from: classes.dex */
public class b implements z1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z1 f18496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r1.a f18497d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<Integer, a2> f18498e = new HashMap();

    public b(z1 z1Var, r1.a aVar) {
        this.f18496c = z1Var;
        this.f18497d = aVar;
    }

    public static int d(int i10) {
        if (i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
            return 5;
        }
        throw new IllegalArgumentException("Unexpected HDR format: " + i10);
    }

    public static String e(int i10) {
        return a2.d(i10);
    }

    public static int f(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        if (i10 == 2) {
            return Barcode.FORMAT_AZTEC;
        }
        if (i10 == 3) {
            return 8192;
        }
        if (i10 == 4) {
            return -1;
        }
        throw new IllegalArgumentException("Unexpected HDR format: " + i10);
    }

    public static a2.c g(a2.c cVar, int i10, int i11) {
        if (cVar == null) {
            return null;
        }
        int iE = cVar.e();
        String strI = cVar.i();
        int iJ = cVar.j();
        if (i10 != cVar.g()) {
            iE = d(i10);
            strI = e(iE);
            iJ = f(i10);
        }
        return a2.c.a(iE, strI, j(cVar.c(), i11, cVar.b()), cVar.f(), cVar.l(), cVar.h(), iJ, i11, cVar.d(), i10);
    }

    private a2 h(int i10) {
        if (this.f18498e.containsKey(Integer.valueOf(i10))) {
            return this.f18498e.get(Integer.valueOf(i10));
        }
        if (!this.f18496c.a(i10)) {
            return null;
        }
        a2 a2VarC = c(this.f18496c.b(i10), 1, 10);
        this.f18498e.put(Integer.valueOf(i10), a2VarC);
        return a2VarC;
    }

    public static a2.c i(a2.c cVar, int i10) {
        return a2.c.a(cVar.e(), cVar.i(), i10, cVar.f(), cVar.l(), cVar.h(), cVar.j(), cVar.b(), cVar.d(), cVar.g());
    }

    public static int j(int i10, int i11, int i12) {
        if (i11 == i12) {
            return i10;
        }
        int iDoubleValue = (int) (((double) i10) * new Rational(i11, i12).doubleValue());
        if (g0.r1.f("BackupHdrProfileEncoderProfilesProvider")) {
            g0.r1.a("BackupHdrProfileEncoderProfilesProvider", String.format("Base Bitrate(%dbps) * Bit Depth Ratio (%d / %d) = %d", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(iDoubleValue)));
        }
        return iDoubleValue;
    }

    public static a2.c k(a2.c cVar, r1.a aVar) {
        r1 r1VarA;
        if (cVar == null || (r1VarA = aVar.a(cVar.i())) == null || !r1VarA.e(cVar.l(), cVar.h())) {
            return null;
        }
        int iC = cVar.c();
        int iIntValue = ((Integer) r1VarA.g().clamp(Integer.valueOf(iC))).intValue();
        return iIntValue == iC ? cVar : i(cVar, iIntValue);
    }

    @Override // n0.z1
    public boolean a(int i10) {
        return this.f18496c.a(i10) && h(i10) != null;
    }

    @Override // n0.z1
    public a2 b(int i10) {
        return h(i10);
    }

    public final a2 c(a2 a2Var, int i10, int i11) {
        a2.c next;
        if (a2Var == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(a2Var.b());
        Iterator<a2.c> it = a2Var.b().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (next.g() != 0);
        a2.c cVarK = k(g(next, i10, i11), this.f18497d);
        if (cVarK != null) {
            arrayList.add(cVarK);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return a2.b.h(a2Var.a(), a2Var.e(), a2Var.f(), arrayList);
    }
}
