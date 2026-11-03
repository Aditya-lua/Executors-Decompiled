package com.google.android.gms.games;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.zzg;
import da.u;
import n9.k;

/* JADX INFO: loaded from: classes.dex */
public final class zzo extends zzg implements PlayerRelationshipInfo {
    public static final Parcelable.Creator<zzo> CREATOR = new u();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6342f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f6343g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f6344h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f6345i;

    public zzo(int i10, String str, String str2, String str3) {
        this.f6342f = i10;
        this.f6343g = str;
        this.f6344h = str2;
        this.f6345i = str3;
    }

    public static int a(PlayerRelationshipInfo playerRelationshipInfo) {
        return k.c(Integer.valueOf(playerRelationshipInfo.X()), playerRelationshipInfo.zza(), playerRelationshipInfo.zzb(), playerRelationshipInfo.zzc());
    }

    public static boolean v3(PlayerRelationshipInfo playerRelationshipInfo, Object obj) {
        if (!(obj instanceof PlayerRelationshipInfo)) {
            return false;
        }
        if (obj == playerRelationshipInfo) {
            return true;
        }
        PlayerRelationshipInfo playerRelationshipInfo2 = (PlayerRelationshipInfo) obj;
        return playerRelationshipInfo2.X() == playerRelationshipInfo.X() && k.b(playerRelationshipInfo2.zza(), playerRelationshipInfo.zza()) && k.b(playerRelationshipInfo2.zzb(), playerRelationshipInfo.zzb()) && k.b(playerRelationshipInfo2.zzc(), playerRelationshipInfo.zzc());
    }

    public static String w3(PlayerRelationshipInfo playerRelationshipInfo) {
        k.a aVarD = k.d(playerRelationshipInfo);
        aVarD.a("FriendStatus", Integer.valueOf(playerRelationshipInfo.X()));
        if (playerRelationshipInfo.zza() != null) {
            aVarD.a("Nickname", playerRelationshipInfo.zza());
        }
        if (playerRelationshipInfo.zzb() != null) {
            aVarD.a("InvitationNickname", playerRelationshipInfo.zzb());
        }
        if (playerRelationshipInfo.zzc() != null) {
            aVarD.a("NicknameAbuseReportToken", playerRelationshipInfo.zzb());
        }
        return aVarD.toString();
    }

    @Override // com.google.android.gms.games.PlayerRelationshipInfo
    public final int X() {
        return this.f6342f;
    }

    public final boolean equals(Object obj) {
        return v3(this, obj);
    }

    @Override // m9.e
    public final /* bridge */ /* synthetic */ PlayerRelationshipInfo freeze() {
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
        u.a(this, parcel, i10);
    }

    @Override // com.google.android.gms.games.PlayerRelationshipInfo
    public final String zza() {
        return this.f6343g;
    }

    @Override // com.google.android.gms.games.PlayerRelationshipInfo
    public final String zzb() {
        return this.f6344h;
    }

    @Override // com.google.android.gms.games.PlayerRelationshipInfo
    public final String zzc() {
        return this.f6345i;
    }

    public zzo(PlayerRelationshipInfo playerRelationshipInfo) {
        this.f6342f = playerRelationshipInfo.X();
        this.f6343g = playerRelationshipInfo.zza();
        this.f6344h = playerRelationshipInfo.zzb();
        this.f6345i = playerRelationshipInfo.zzc();
    }
}
