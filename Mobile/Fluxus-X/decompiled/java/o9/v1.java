package o9;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class v1 extends eb.a implements l {
    public v1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // o9.l
    public final Account zzb() {
        Parcel parcelR2 = r2(2, s2());
        Account account = (Account) eb.o.b(parcelR2, Account.CREATOR);
        parcelR2.recycle();
        return account;
    }
}
