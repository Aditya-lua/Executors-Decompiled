package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.games.internal.zzg;
import p214ja.C7122a;
import p305n9.C8947k;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public final class MostRecentGameInfoEntity extends zzg implements zza {

    @NonNull
    public static final Parcelable.Creator<MostRecentGameInfoEntity> CREATOR = new C7122a();

    /* JADX INFO: renamed from: f */
    public final String f7865f;

    /* JADX INFO: renamed from: g */
    public final String f7866g;

    /* JADX INFO: renamed from: h */
    public final long f7867h;

    /* JADX INFO: renamed from: i */
    public final Uri f7868i;

    /* JADX INFO: renamed from: j */
    public final Uri f7869j;

    /* JADX INFO: renamed from: k */
    public final Uri f7870k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MostRecentGameInfoEntity(zza zzaVar) {
        this.f7865f = zzaVar.zza();
        this.f7866g = zzaVar.zzb();
        this.f7867h = zzaVar.zzc();
        this.f7868i = zzaVar.zzd();
        this.f7869j = zzaVar.zze();
        this.f7870k = zzaVar.zzf();
    }

    /* JADX INFO: renamed from: a */
    public static int m9440a(zza zzaVar) {
        return C8947k.m36027c(zzaVar.zza(), zzaVar.zzb(), Long.valueOf(zzaVar.zzc()), zzaVar.zzd(), zzaVar.zze(), zzaVar.zzf());
    }

    /* JADX INFO: renamed from: v3 */
    public static boolean m9441v3(zza zzaVar, Object obj) {
        if (!(obj instanceof zza)) {
            return false;
        }
        if (zzaVar == obj) {
            return true;
        }
        zza zzaVar2 = (zza) obj;
        return C8947k.m36026b(zzaVar2.zza(), zzaVar.zza()) && C8947k.m36026b(zzaVar2.zzb(), zzaVar.zzb()) && C8947k.m36026b(Long.valueOf(zzaVar2.zzc()), Long.valueOf(zzaVar.zzc())) && C8947k.m36026b(zzaVar2.zzd(), zzaVar.zzd()) && C8947k.m36026b(zzaVar2.zze(), zzaVar.zze()) && C8947k.m36026b(zzaVar2.zzf(), zzaVar.zzf());
    }

    /* JADX INFO: renamed from: w3 */
    public static String m9442w3(zza zzaVar) {
        return C8947k.m36028d(zzaVar).m36029a("GameId", zzaVar.zza()).m36029a("GameName", zzaVar.zzb()).m36029a("ActivityTimestampMillis", Long.valueOf(zzaVar.zzc())).m36029a("GameIconUri", zzaVar.zzd()).m36029a("GameHiResUri", zzaVar.zze()).m36029a("GameFeaturedUri", zzaVar.zzf()).toString();
    }

    public final boolean equals(Object obj) {
        return m9441v3(this, obj);
    }

    public final int hashCode() {
        return m9440a(this);
    }

    @NonNull
    public final String toString() {
        return m9442w3(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        C7122a.m29916a(this, parcel, i10);
    }

    @Override // com.google.android.gms.games.internal.player.zza
    @NonNull
    public final String zza() {
        return this.f7865f;
    }

    @Override // com.google.android.gms.games.internal.player.zza
    @NonNull
    public final String zzb() {
        return this.f7866g;
    }

    @Override // com.google.android.gms.games.internal.player.zza
    public final long zzc() {
        return this.f7867h;
    }

    @Override // com.google.android.gms.games.internal.player.zza
    @NonNull
    public final Uri zzd() {
        return this.f7868i;
    }

    @Override // com.google.android.gms.games.internal.player.zza
    @NonNull
    public final Uri zze() {
        return this.f7869j;
    }

    @Override // com.google.android.gms.games.internal.player.zza
    @NonNull
    public final Uri zzf() {
        return this.f7870k;
    }

    public MostRecentGameInfoEntity(String str, String str2, long j10, Uri uri, Uri uri2, Uri uri3) {
        this.f7865f = str;
        this.f7866g = str2;
        this.f7867h = j10;
        this.f7868i = uri;
        this.f7869j = uri2;
        this.f7870k = uri3;
    }
}
