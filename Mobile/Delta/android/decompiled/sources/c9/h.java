package c9;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
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
            int iU = o9.a.u(parcel);
            switch (o9.a.n(iU)) {
                case 1:
                    iW = o9.a.w(parcel, iU);
                    break;
                case 2:
                    arrayListL = o9.a.l(parcel, iU, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) o9.a.g(parcel, iU, Account.CREATOR);
                    break;
                case 4:
                    zO = o9.a.o(parcel, iU);
                    break;
                case 5:
                    zO2 = o9.a.o(parcel, iU);
                    break;
                case 6:
                    zO3 = o9.a.o(parcel, iU);
                    break;
                case 7:
                    strH = o9.a.h(parcel, iU);
                    break;
                case 8:
                    strH2 = o9.a.h(parcel, iU);
                    break;
                case 9:
                    arrayListL2 = o9.a.l(parcel, iU, GoogleSignInOptionsExtensionParcelable.CREATOR);
                    break;
                case 10:
                    strH3 = o9.a.h(parcel, iU);
                    break;
                default:
                    o9.a.C(parcel, iU);
                    break;
            }
        }
        o9.a.m(parcel, iD);
        return new GoogleSignInOptions(iW, arrayListL, account, zO, zO2, zO3, strH, strH2, arrayListL2, strH3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleSignInOptions[i10];
    }
}
