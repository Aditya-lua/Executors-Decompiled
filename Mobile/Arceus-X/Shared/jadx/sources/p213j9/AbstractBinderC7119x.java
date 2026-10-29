package p213j9;

import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import p305n9.AbstractBinderC8952l1;
import p305n9.C8953m;
import p305n9.InterfaceC8955m1;
import p571y9.BinderC13134b;
import p571y9.InterfaceC13133a;

/* JADX INFO: renamed from: j9.x */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC7119x extends AbstractBinderC8952l1 {

    /* JADX INFO: renamed from: a */
    public final int f27737a;

    public AbstractBinderC7119x(byte[] bArr) {
        C8953m.m36036a(bArr.length == 25);
        this.f27737a = Arrays.hashCode(bArr);
    }

    /* JADX INFO: renamed from: u2 */
    public static byte[] m29915u2(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    public final boolean equals(Object obj) {
        InterfaceC13133a interfaceC13133aZzd;
        if (!(obj instanceof InterfaceC8955m1)) {
            return false;
        }
        try {
            InterfaceC8955m1 interfaceC8955m1 = (InterfaceC8955m1) obj;
            if (interfaceC8955m1.zze() == this.f27737a && (interfaceC13133aZzd = interfaceC8955m1.zzd()) != null) {
                return Arrays.equals(mo29846t2(), (byte[]) BinderC13134b.m48742t2(interfaceC13133aZzd));
            }
            return false;
        } catch (RemoteException e10) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            return false;
        }
    }

    public final int hashCode() {
        return this.f27737a;
    }

    /* JADX INFO: renamed from: t2 */
    public abstract byte[] mo29846t2();

    @Override // p305n9.InterfaceC8955m1
    public final InterfaceC13133a zzd() {
        return BinderC13134b.m48743u2(mo29846t2());
    }

    @Override // p305n9.InterfaceC8955m1
    public final int zze() {
        return this.f27737a;
    }
}
