package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;
import p290m9.InterfaceC8474e;

/* JADX INFO: loaded from: classes.dex */
public interface Player extends InterfaceC8474e<Player>, Parcelable {
    /* JADX INFO: renamed from: B */
    Uri mo9387B();

    /* JADX INFO: renamed from: I1 */
    Uri mo9388I1();

    /* JADX INFO: renamed from: a0 */
    long mo9389a0();

    /* JADX INFO: renamed from: c */
    boolean mo9390c();

    /* JADX INFO: renamed from: d */
    long mo9391d();

    /* JADX INFO: renamed from: d1 */
    PlayerRelationshipInfo mo9392d1();

    /* JADX INFO: renamed from: d2 */
    CurrentPlayerInfo mo9393d2();

    /* JADX INFO: renamed from: e0 */
    Uri mo9394e0();

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

    /* JADX INFO: renamed from: h */
    Uri mo9395h();

    @NonNull
    /* JADX INFO: renamed from: k3 */
    String mo9396k3();

    @NonNull
    /* JADX INFO: renamed from: l */
    String mo9397l();

    @Deprecated
    /* JADX INFO: renamed from: r0 */
    long mo9398r0();

    /* JADX INFO: renamed from: z0 */
    PlayerLevelInfo mo9399z0();

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
