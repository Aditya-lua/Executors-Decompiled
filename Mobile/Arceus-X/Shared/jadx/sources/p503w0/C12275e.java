package p503w0;

import android.util.Size;
import p296n0.InterfaceC8769i2;
import p296n0.InterfaceC8771i4;
import p347p0.C10087c;

/* JADX INFO: renamed from: w0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C12275e {
    /* JADX INFO: renamed from: a */
    public static void m45573a(InterfaceC8771i4.b<?, ?, ?> bVar, int i10) {
        Size sizeM35188V;
        InterfaceC8769i2 interfaceC8769i2 = (InterfaceC8769i2) bVar.mo6688e();
        int iM35185J = interfaceC8769i2.m35185J(-1);
        if (iM35185J == -1 || iM35185J != i10) {
            ((InterfaceC8769i2.a) bVar).mo24412c(i10);
        }
        if (iM35185J == -1 || i10 == -1 || iM35185J == i10) {
            return;
        }
        if (Math.abs(C10087c.m38903b(i10) - C10087c.m38903b(iM35185J)) % 180 != 90 || (sizeM35188V = interfaceC8769i2.m35188V(null)) == null) {
            return;
        }
        ((InterfaceC8769i2.a) bVar).mo24413d(new Size(sizeM35188V.getHeight(), sizeM35188V.getWidth()));
    }
}
