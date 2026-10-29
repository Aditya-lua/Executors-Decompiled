package com.google.android.gms.games;

import android.annotation.SuppressLint;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import p073da.C4505i;
import p073da.C4509m;
import p214ja.C7123b;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ParcelCreator"})
public final class zzc extends C4509m implements CurrentPlayerInfo {

    /* JADX INFO: renamed from: d */
    public final C7123b f7988d;

    public zzc(DataHolder dataHolder, int i10, C7123b c7123b) {
        super(dataHolder, i10);
        this.f7988d = c7123b;
    }

    @Override // com.google.android.gms.games.CurrentPlayerInfo
    /* JADX INFO: renamed from: B1 */
    public final int mo9366B1() {
        return m22471q(this.f7988d.f27753L, 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return zza.m9529v3(this, obj);
    }

    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // p290m9.InterfaceC8474e
    public final /* synthetic */ CurrentPlayerInfo freeze() {
        return new zza(this);
    }

    public final int hashCode() {
        return zza.m9528a(this);
    }

    public final String toString() {
        return zza.m9530w3(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        C4505i.m22468a(new zza(this), parcel, i10);
    }

    public final boolean zza() {
        String str = this.f7988d.f27753L;
        return m34262k(str) && !m34263m(str);
    }
}
