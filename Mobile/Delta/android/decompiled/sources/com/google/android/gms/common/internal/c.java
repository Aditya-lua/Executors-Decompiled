package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import db.o;

/* JADX INFO: loaded from: classes.dex */
public final class c extends db.a implements b {
    public c(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // com.google.android.gms.common.internal.b
    public final Account zzb() {
        Parcel parcelR2 = r2(2, s2());
        Account account = (Account) o.b(parcelR2, Account.CREATOR);
        parcelR2.recycle();
        return account;
    }
}
