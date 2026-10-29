package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p242k9.InterfaceC7504n;
import p325o9.C9718b;
import p376qb.C10487b;

/* JADX INFO: loaded from: classes.dex */
public final class zaa extends AbstractSafeParcelable implements InterfaceC7504n {
    public static final Parcelable.Creator<zaa> CREATOR = new C10487b();

    /* JADX INFO: renamed from: f */
    public final int f9556f;

    /* JADX INFO: renamed from: g */
    public int f9557g;

    /* JADX INFO: renamed from: h */
    public Intent f9558h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public zaa() {
        this(2, 0, null);
    }

    @Override // p242k9.InterfaceC7504n
    /* JADX INFO: renamed from: m */
    public final Status mo8183m() {
        return this.f9557g == 0 ? Status.f7405k : Status.f7409o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f9556f;
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38470n(parcel, 1, i11);
        C9718b.m38470n(parcel, 2, this.f9557g);
        C9718b.m38476t(parcel, 3, this.f9558h, i10, false);
        C9718b.m38458b(parcel, iM38457a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public zaa(int i10, int i11, Intent intent) {
        this.f9556f = i10;
        this.f9557g = i11;
        this.f9558h = intent;
    }
}
