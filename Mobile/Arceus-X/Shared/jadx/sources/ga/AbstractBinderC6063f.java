package ga;

import android.os.Parcel;
import com.google.android.gms.internal.games_v2.zzaf;
import p125fb.BinderC5553q;
import p125fb.C5536k0;

/* JADX INFO: renamed from: ga.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC6063f extends BinderC5553q implements InterfaceC6064g {
    public AbstractBinderC6063f() {
        super("com.google.android.gms.games.internal.IGamesClient");
    }

    @Override // p125fb.BinderC5553q
    /* JADX INFO: renamed from: r2 */
    public final boolean mo25172r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1001) {
            return false;
        }
        zzaf zzafVarZzb = zzb();
        parcel2.writeNoException();
        int i12 = C5536k0.f21319a;
        parcel2.writeInt(1);
        zzafVarZzb.writeToParcel(parcel2, 1);
        return true;
    }
}
