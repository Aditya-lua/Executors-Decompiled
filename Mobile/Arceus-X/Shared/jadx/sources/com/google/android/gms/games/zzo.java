package com.google.android.gms.games;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.zzg;
import p073da.C4517u;
import p305n9.C8947k;

/* JADX INFO: loaded from: classes.dex */
public final class zzo extends zzg implements PlayerRelationshipInfo {
    public static final Parcelable.Creator<zzo> CREATOR = new C4517u();

    /* JADX INFO: renamed from: f */
    public final int f7989f;

    /* JADX INFO: renamed from: g */
    public final String f7990g;

    /* JADX INFO: renamed from: h */
    public final String f7991h;

    /* JADX INFO: renamed from: i */
    public final String f7992i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public zzo(int i10, String str, String str2, String str3) {
        this.f7989f = i10;
        this.f7990g = str;
        this.f7991h = str2;
        this.f7992i = str3;
    }

    /* JADX INFO: renamed from: a */
    public static int m9531a(PlayerRelationshipInfo playerRelationshipInfo) {
        return C8947k.m36027c(Integer.valueOf(playerRelationshipInfo.mo9413Y()), playerRelationshipInfo.zza(), playerRelationshipInfo.zzb(), playerRelationshipInfo.zzc());
    }

    /* JADX INFO: renamed from: v3 */
    public static boolean m9532v3(PlayerRelationshipInfo playerRelationshipInfo, Object obj) {
        if (!(obj instanceof PlayerRelationshipInfo)) {
            return false;
        }
        if (obj == playerRelationshipInfo) {
            return true;
        }
        PlayerRelationshipInfo playerRelationshipInfo2 = (PlayerRelationshipInfo) obj;
        return playerRelationshipInfo2.mo9413Y() == playerRelationshipInfo.mo9413Y() && C8947k.m36026b(playerRelationshipInfo2.zza(), playerRelationshipInfo.zza()) && C8947k.m36026b(playerRelationshipInfo2.zzb(), playerRelationshipInfo.zzb()) && C8947k.m36026b(playerRelationshipInfo2.zzc(), playerRelationshipInfo.zzc());
    }

    /* JADX INFO: renamed from: w3 */
    public static String m9533w3(PlayerRelationshipInfo playerRelationshipInfo) {
        C8947k.a aVarM36028d = C8947k.m36028d(playerRelationshipInfo);
        aVarM36028d.m36029a("FriendStatus", Integer.valueOf(playerRelationshipInfo.mo9413Y()));
        if (playerRelationshipInfo.zza() != null) {
            aVarM36028d.m36029a("Nickname", playerRelationshipInfo.zza());
        }
        if (playerRelationshipInfo.zzb() != null) {
            aVarM36028d.m36029a("InvitationNickname", playerRelationshipInfo.zzb());
        }
        if (playerRelationshipInfo.zzc() != null) {
            aVarM36028d.m36029a("NicknameAbuseReportToken", playerRelationshipInfo.zzb());
        }
        return aVarM36028d.toString();
    }

    @Override // com.google.android.gms.games.PlayerRelationshipInfo
    /* JADX INFO: renamed from: Y */
    public final int mo9413Y() {
        return this.f7989f;
    }

    public final boolean equals(Object obj) {
        return m9532v3(this, obj);
    }

    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // p290m9.InterfaceC8474e
    public final /* bridge */ /* synthetic */ PlayerRelationshipInfo freeze() {
        return this;
    }

    public final int hashCode() {
        return m9531a(this);
    }

    public final String toString() {
        return m9533w3(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        C4517u.m22480a(this, parcel, i10);
    }

    @Override // com.google.android.gms.games.PlayerRelationshipInfo
    public final String zza() {
        return this.f7990g;
    }

    @Override // com.google.android.gms.games.PlayerRelationshipInfo
    public final String zzb() {
        return this.f7991h;
    }

    @Override // com.google.android.gms.games.PlayerRelationshipInfo
    public final String zzc() {
        return this.f7992i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public zzo(PlayerRelationshipInfo playerRelationshipInfo) {
        this.f7989f = playerRelationshipInfo.mo9413Y();
        this.f7990g = playerRelationshipInfo.zza();
        this.f7991h = playerRelationshipInfo.zzb();
        this.f7992i = playerRelationshipInfo.zzc();
    }
}
