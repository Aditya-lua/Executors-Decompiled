package j9;

import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import n9.l1;
import n9.m1;

/* JADX INFO: loaded from: classes.dex */
public abstract class x extends l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21209a;

    public x(byte[] bArr) {
        n9.m.a(bArr.length == 25);
        this.f21209a = Arrays.hashCode(bArr);
    }

    public static byte[] u2(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    public final boolean equals(Object obj) {
        y9.a aVarZzd;
        if (!(obj instanceof m1)) {
            return false;
        }
        try {
            m1 m1Var = (m1) obj;
            if (m1Var.zze() == this.f21209a && (aVarZzd = m1Var.zzd()) != null) {
                return Arrays.equals(t2(), (byte[]) y9.b.t2(aVarZzd));
            }
            return false;
        } catch (RemoteException e10) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            return false;
        }
    }

    public final int hashCode() {
        return this.f21209a;
    }

    public abstract byte[] t2();

    @Override // n9.m1
    public final y9.a zzd() {
        return y9.b.u2(t2());
    }

    @Override // n9.m1
    public final int zze() {
        return this.f21209a;
    }
}
