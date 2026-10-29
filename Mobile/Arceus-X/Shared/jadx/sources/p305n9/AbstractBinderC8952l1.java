package p305n9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p074db.BinderC4532n;
import p074db.C4533o;
import p571y9.InterfaceC13133a;

/* JADX INFO: renamed from: n9.l1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC8952l1 extends BinderC4532n implements InterfaceC8955m1 {
    public AbstractBinderC8952l1() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    /* JADX INFO: renamed from: s2 */
    public static InterfaceC8955m1 m36035s2(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return iInterfaceQueryLocalInterface instanceof InterfaceC8955m1 ? (InterfaceC8955m1) iInterfaceQueryLocalInterface : new C8949k1(iBinder);
    }

    @Override // p074db.BinderC4532n
    /* JADX INFO: renamed from: r2 */
    public final boolean mo22501r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            InterfaceC13133a interfaceC13133aZzd = zzd();
            parcel2.writeNoException();
            C4533o.m22505d(parcel2, interfaceC13133aZzd);
        } else {
            if (i10 != 2) {
                return false;
            }
            int iZze = zze();
            parcel2.writeNoException();
            parcel2.writeInt(iZze);
        }
        return true;
    }
}
