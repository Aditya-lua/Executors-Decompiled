package qb;

import android.os.Parcel;
import com.google.android.gms.signin.internal.zak;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends bb.b implements e {
    public d() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // bb.b
    public final boolean r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 3:
                bb.c.b(parcel);
                break;
            case 4:
                bb.c.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                bb.c.b(parcel);
                break;
            case 7:
                bb.c.b(parcel);
                break;
            case 8:
                zak zakVar = (zak) bb.c.a(parcel, zak.CREATOR);
                bb.c.b(parcel);
                F(zakVar);
                break;
            case 9:
                bb.c.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
