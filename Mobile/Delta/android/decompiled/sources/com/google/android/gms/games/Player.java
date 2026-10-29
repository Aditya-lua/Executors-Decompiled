package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;
import m9.e;

/* JADX INFO: loaded from: classes.dex */
public interface Player extends e<Player>, Parcelable {
    Uri B();

    Uri I1();

    long a0();

    boolean c();

    PlayerRelationshipInfo c1();

    long d();

    CurrentPlayerInfo d2();

    Uri e0();

    @KeepName
    @Deprecated
    String getBannerImageLandscapeUrl();

    @KeepName
    @Deprecated
    String getBannerImagePortraitUrl();

    @KeepName
    @Deprecated
    String getHiResImageUrl();

    @KeepName
    @Deprecated
    String getIconImageUrl();

    String getTitle();

    Uri h();

    @NonNull
    String k3();

    @NonNull
    String l();

    @Deprecated
    long r0();

    PlayerLevelInfo z0();

    String zza();

    String zzb();

    @NonNull
    String zzc();

    boolean zzd();

    @Deprecated
    int zze();

    boolean zzf();

    com.google.android.gms.games.internal.player.zza zzh();
}
