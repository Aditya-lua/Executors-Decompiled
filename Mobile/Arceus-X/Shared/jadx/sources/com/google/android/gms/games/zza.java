package com.google.android.gms.games;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.zzg;
import p073da.C4505i;
import p305n9.C8947k;

/* JADX INFO: loaded from: classes.dex */
public final class zza extends zzg implements CurrentPlayerInfo {
    public static final Parcelable.Creator<zza> CREATOR = new C4505i();

    /* JADX INFO: renamed from: f */
    public final int f7987f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public zza(int i10) {
        this.f7987f = i10;
    }

    /* JADX INFO: renamed from: a */
    public static int m9528a(CurrentPlayerInfo currentPlayerInfo) {
        return C8947k.m36027c(Integer.valueOf(currentPlayerInfo.mo9366B1()));
    }

    /* JADX INFO: renamed from: v3 */
    public static boolean m9529v3(CurrentPlayerInfo currentPlayerInfo, Object obj) {
        if (obj instanceof CurrentPlayerInfo) {
            return obj == currentPlayerInfo || ((CurrentPlayerInfo) obj).mo9366B1() == currentPlayerInfo.mo9366B1();
        }
        return false;
    }

    /* JADX INFO: renamed from: w3 */
    public static String m9530w3(CurrentPlayerInfo currentPlayerInfo) {
        C8947k.a aVarM36028d = C8947k.m36028d(currentPlayerInfo);
        aVarM36028d.m36029a("FriendsListVisibilityStatus", Integer.valueOf(currentPlayerInfo.mo9366B1()));
        return aVarM36028d.toString();
    }

    @Override // com.google.android.gms.games.CurrentPlayerInfo
    /* JADX INFO: renamed from: B1 */
    public final int mo9366B1() {
        return this.f7987f;
    }

    public final boolean equals(Object obj) {
        return m9529v3(this, obj);
    }

    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // p290m9.InterfaceC8474e
    public final /* bridge */ /* synthetic */ CurrentPlayerInfo freeze() {
        return this;
    }

    public final int hashCode() {
        return m9528a(this);
    }

    public final String toString() {
        return m9530w3(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        C4505i.m22468a(this, parcel, i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public zza(CurrentPlayerInfo currentPlayerInfo) {
        this.f7987f = currentPlayerInfo.mo9366B1();
    }
}
