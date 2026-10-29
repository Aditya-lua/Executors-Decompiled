package p376qb;

import android.os.Parcel;
import bb.BinderC1294b;
import bb.C1295c;
import com.google.android.gms.signin.internal.zak;

/* JADX INFO: renamed from: qb.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC10489d extends BinderC1294b implements InterfaceC10490e {
    public AbstractBinderC10489d() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // bb.BinderC1294b
    /* JADX INFO: renamed from: r2 */
    public final boolean mo7089r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 3:
                C1295c.m7091b(parcel);
                break;
            case 4:
                C1295c.m7091b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                C1295c.m7091b(parcel);
                break;
            case 7:
                C1295c.m7091b(parcel);
                break;
            case 8:
                zak zakVar = (zak) C1295c.m7090a(parcel, zak.CREATOR);
                C1295c.m7091b(parcel);
                mo33166F(zakVar);
                break;
            case 9:
                C1295c.m7091b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
