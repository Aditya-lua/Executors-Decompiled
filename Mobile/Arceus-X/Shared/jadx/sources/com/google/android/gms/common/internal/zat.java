package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p305n9.C8945j0;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class zat extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zat> CREATOR = new C8945j0();

    /* JADX INFO: renamed from: f */
    public final int f7495f;

    /* JADX INFO: renamed from: g */
    public final Account f7496g;

    /* JADX INFO: renamed from: h */
    public final int f7497h;

    /* JADX INFO: renamed from: i */
    public final GoogleSignInAccount f7498i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public zat(int i10, Account account, int i11, GoogleSignInAccount googleSignInAccount) {
        this.f7495f = i10;
        this.f7496g = account;
        this.f7497h = i11;
        this.f7498i = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f7495f;
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38470n(parcel, 1, i11);
        C9718b.m38476t(parcel, 2, this.f7496g, i10, false);
        C9718b.m38470n(parcel, 3, this.f7497h);
        C9718b.m38476t(parcel, 4, this.f7498i, i10, false);
        C9718b.m38458b(parcel, iM38457a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public zat(Account account, int i10, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i10, googleSignInAccount);
    }
}
