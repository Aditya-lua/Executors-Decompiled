package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n9.j0;

/* JADX INFO: loaded from: classes.dex */
public final class zat extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zat> CREATOR = new j0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5806f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Account f5807g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f5808h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final GoogleSignInAccount f5809i;

    public zat(int i10, Account account, int i11, GoogleSignInAccount googleSignInAccount) {
        this.f5806f = i10;
        this.f5807g = account;
        this.f5808h = i11;
        this.f5809i = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f5806f;
        int iA = o9.b.a(parcel);
        o9.b.n(parcel, 1, i11);
        o9.b.t(parcel, 2, this.f5807g, i10, false);
        o9.b.n(parcel, 3, this.f5808h);
        o9.b.t(parcel, 4, this.f5809i, i10, false);
        o9.b.b(parcel, iA);
    }

    public zat(Account account, int i10, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i10, googleSignInAccount);
    }
}
