package com.google.android.gms.games;

import android.annotation.SuppressLint;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import da.m;
import da.u;
import ja.b;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ParcelCreator"})
public final class zzq extends m implements PlayerRelationshipInfo {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f6273d;

    public zzq(DataHolder dataHolder, int i10, b bVar) {
        super(dataHolder, i10);
        this.f6273d = bVar;
    }

    @Override // com.google.android.gms.games.PlayerRelationshipInfo
    public final int Y() {
        return q(this.f6273d.H, -1);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return zzo.v3(this, obj);
    }

    @Override // m9.e
    public final /* synthetic */ PlayerRelationshipInfo freeze() {
        return new zzo(this);
    }

    public final int hashCode() {
        return zzo.a(this);
    }

    public final String toString() {
        return zzo.w3(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        u.a(new zzo(this), parcel, i10);
    }

    @Override // com.google.android.gms.games.PlayerRelationshipInfo
    public final String zza() {
        return p(this.f6273d.I, null);
    }

    @Override // com.google.android.gms.games.PlayerRelationshipInfo
    public final String zzb() {
        return p(this.f6273d.J, null);
    }

    @Override // com.google.android.gms.games.PlayerRelationshipInfo
    public final String zzc() {
        return p(this.f6273d.K, null);
    }
}
