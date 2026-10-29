package w0;

import android.util.Size;
import n0.i2;
import n0.i4;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static void a(i4.b<?, ?, ?> bVar, int i10) {
        Size sizeV;
        i2 i2Var = (i2) bVar.e();
        int iJ = i2Var.J(-1);
        if (iJ == -1 || iJ != i10) {
            ((i2.a) bVar).c(i10);
        }
        if (iJ == -1 || i10 == -1 || iJ == i10) {
            return;
        }
        if (Math.abs(p0.c.b(i10) - p0.c.b(iJ)) % 180 != 90 || (sizeV = i2Var.V(null)) == null) {
            return;
        }
        ((i2.a) bVar).d(new Size(sizeV.getHeight(), sizeV.getWidth()));
    }
}
