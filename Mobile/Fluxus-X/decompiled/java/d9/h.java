package d9;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        ArrayList arrayListL = null;
        Account account = null;
        String strH = null;
        String strH2 = null;
        ArrayList arrayListL2 = null;
        String strH3 = null;
        int iW = 0;
        boolean zO = false;
        boolean zO2 = false;
        boolean zO3 = false;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            switch (p9.b.n(iU)) {
                case 1:
                    iW = p9.b.w(parcel, iU);
                    break;
                case 2:
                    arrayListL = p9.b.l(parcel, iU, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) p9.b.g(parcel, iU, Account.CREATOR);
                    break;
                case 4:
                    zO = p9.b.o(parcel, iU);
                    break;
                case 5:
                    zO2 = p9.b.o(parcel, iU);
                    break;
                case 6:
                    zO3 = p9.b.o(parcel, iU);
                    break;
                case 7:
                    strH = p9.b.h(parcel, iU);
                    break;
                case 8:
                    strH2 = p9.b.h(parcel, iU);
                    break;
                case 9:
                    arrayListL2 = p9.b.l(parcel, iU, e9.a.CREATOR);
                    break;
                case 10:
                    strH3 = p9.b.h(parcel, iU);
                    break;
                default:
                    p9.b.C(parcel, iU);
                    break;
            }
        }
        p9.b.m(parcel, iD);
        return new GoogleSignInOptions(iW, arrayListL, account, zO, zO2, zO3, strH, strH2, arrayListL2, strH3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleSignInOptions[i10];
    }
}
