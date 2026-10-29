package p376qb;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import bb.C1293a;
import bb.C1295c;
import com.google.android.gms.signin.internal.zai;

/* JADX INFO: renamed from: qb.f */
/* JADX INFO: loaded from: classes.dex */
public final class C10491f extends C1293a implements IInterface {
    public C10491f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    /* JADX INFO: renamed from: u2 */
    public final void m40296u2(zai zaiVar, InterfaceC10490e interfaceC10490e) {
        Parcel parcelM7086r2 = m7086r2();
        C1295c.m7092c(parcelM7086r2, zaiVar);
        C1295c.m7093d(parcelM7086r2, interfaceC10490e);
        m7087s2(12, parcelM7086r2);
    }
}
