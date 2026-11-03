package com.google.android.gms.games;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.zzg;
import da.i;
import n9.k;

/* JADX INFO: loaded from: classes.dex */
public final class zza extends zzg implements CurrentPlayerInfo {
    public static final Parcelable.Creator<zza> CREATOR = new i();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6340f;

    public zza(int i10) {
        this.f6340f = i10;
    }

    public static int a(CurrentPlayerInfo currentPlayerInfo) {
        return k.c(Integer.valueOf(currentPlayerInfo.z1()));
    }

    public static boolean v3(CurrentPlayerInfo currentPlayerInfo, Object obj) {
        if (obj instanceof CurrentPlayerInfo) {
            return obj == currentPlayerInfo || ((CurrentPlayerInfo) obj).z1() == currentPlayerInfo.z1();
        }
        return false;
    }

    public static String w3(CurrentPlayerInfo currentPlayerInfo) {
        k.a aVarD = k.d(currentPlayerInfo);
        aVarD.a("FriendsListVisibilityStatus", Integer.valueOf(currentPlayerInfo.z1()));
        return aVarD.toString();
    }

    public final boolean equals(Object obj) {
        return v3(this, obj);
    }

    @Override // m9.e
    public final /* bridge */ /* synthetic */ CurrentPlayerInfo freeze() {
        return this;
    }

    public final int hashCode() {
        return a(this);
    }

    public final String toString() {
        return w3(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        i.a(this, parcel, i10);
    }

    @Override // com.google.android.gms.games.CurrentPlayerInfo
    public final int z1() {
        return this.f6340f;
    }

    public zza(CurrentPlayerInfo currentPlayerInfo) {
        this.f6340f = currentPlayerInfo.z1();
    }
}
