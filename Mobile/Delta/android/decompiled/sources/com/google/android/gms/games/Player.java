package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;
import m9.e;

/* JADX INFO: loaded from: classes.dex */
public interface Player extends e<Player>, Parcelable {
    Uri A();

    Uri G1();

    PlayerRelationshipInfo Y0();

    long Z();

    boolean c();

    Uri c0();

    long d();

    CurrentPlayerInfo e2();

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
    String l();

    @NonNull
    String m3();

    @Deprecated
    long n0();

    PlayerLevelInfo v0();

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
