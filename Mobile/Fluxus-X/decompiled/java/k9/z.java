package k9;

import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import o9.x1;
import o9.y1;

/* JADX INFO: loaded from: classes.dex */
public abstract class z extends x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21285a;

    public z(byte[] bArr) {
        o9.s.a(bArr.length == 25);
        this.f21285a = Arrays.hashCode(bArr);
    }

    public static byte[] u2(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    public final boolean equals(Object obj) {
        z9.a aVarZzd;
        if (!(obj instanceof y1)) {
            return false;
        }
        try {
            y1 y1Var = (y1) obj;
            if (y1Var.zze() == this.f21285a && (aVarZzd = y1Var.zzd()) != null) {
                return Arrays.equals(t2(), (byte[]) z9.b.t2(aVarZzd));
            }
            return false;
        } catch (RemoteException e10) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            return false;
        }
    }

    public final int hashCode() {
        return this.f21285a;
    }

    public abstract byte[] t2();

    @Override // o9.y1
    public final z9.a zzd() {
        return z9.b.u2(t2());
    }

    @Override // o9.y1
    public final int zze() {
        return this.f21285a;
    }
}
