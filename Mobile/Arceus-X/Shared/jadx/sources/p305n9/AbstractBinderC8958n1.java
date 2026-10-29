package p305n9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.zzj;
import p074db.BinderC4532n;
import p074db.C4533o;

/* JADX INFO: renamed from: n9.n1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC8958n1 extends BinderC4532n implements InterfaceC8938h {
    public AbstractBinderC8958n1() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // p074db.BinderC4532n
    /* JADX INFO: renamed from: r2 */
    public final boolean mo22501r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            int i12 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) C4533o.m22503b(parcel, Bundle.CREATOR);
            C4533o.m22506e(parcel);
            mo36011d0(i12, strongBinder, bundle);
        } else if (i10 == 2) {
            int i13 = parcel.readInt();
            Bundle bundle2 = (Bundle) C4533o.m22503b(parcel, Bundle.CREATOR);
            C4533o.m22506e(parcel);
            mo36012i(i13, bundle2);
        } else {
            if (i10 != 3) {
                return false;
            }
            int i14 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            zzj zzjVar = (zzj) C4533o.m22503b(parcel, zzj.CREATOR);
            C4533o.m22506e(parcel);
            mo36013x1(i14, strongBinder2, zzjVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
