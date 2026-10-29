package com.google.android.gms.games;

import android.annotation.SuppressLint;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import p073da.C4509m;
import p073da.C4517u;
import p214ja.C7123b;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ParcelCreator"})
public final class zzq extends C4509m implements PlayerRelationshipInfo {

    /* JADX INFO: renamed from: d */
    public final C7123b f7993d;

    public zzq(DataHolder dataHolder, int i10, C7123b c7123b) {
        super(dataHolder, i10);
        this.f7993d = c7123b;
    }

    @Override // com.google.android.gms.games.PlayerRelationshipInfo
    /* JADX INFO: renamed from: Y */
    public final int mo9413Y() {
        return m22471q(this.f7993d.f27749H, -1);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return zzo.m9532v3(this, obj);
    }

    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // p290m9.InterfaceC8474e
    public final /* synthetic */ PlayerRelationshipInfo freeze() {
        return new zzo(this);
    }

    public final int hashCode() {
        return zzo.m9531a(this);
    }

    public final String toString() {
        return zzo.m9533w3(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        C4517u.m22480a(new zzo(this), parcel, i10);
    }

    @Override // com.google.android.gms.games.PlayerRelationshipInfo
    public final String zza() {
        return m22470p(this.f7993d.f27750I, null);
    }

    @Override // com.google.android.gms.games.PlayerRelationshipInfo
    public final String zzb() {
        return m22470p(this.f7993d.f27751J, null);
    }

    @Override // com.google.android.gms.games.PlayerRelationshipInfo
    public final String zzc() {
        return m22470p(this.f7993d.f27752K, null);
    }
}
