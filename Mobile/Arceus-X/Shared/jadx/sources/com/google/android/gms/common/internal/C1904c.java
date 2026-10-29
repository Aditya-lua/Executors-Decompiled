package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import p074db.C4519a;
import p074db.C4533o;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1904c extends C4519a implements InterfaceC1903b {
    public C1904c(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1903b
    public final Account zzb() {
        Parcel parcelM22481r2 = m22481r2(2, m22482s2());
        Account account = (Account) C4533o.m22503b(parcelM22481r2, Account.CREATOR);
        parcelM22481r2.recycle();
        return account;
    }
}
