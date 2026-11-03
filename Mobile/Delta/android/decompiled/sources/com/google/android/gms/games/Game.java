package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;
import m9.e;

/* JADX INFO: loaded from: classes.dex */
public interface Game extends e<Game>, Parcelable {
    @NonNull
    Uri A();

    boolean B0();

    @NonNull
    Uri B1();

    int L0();

    @NonNull
    String M0();

    @NonNull
    String P1();

    @NonNull
    String Y();

    @Deprecated
    boolean c();

    @NonNull
    String f0();

    int f2();

    @NonNull
    String getDescription();

    @NonNull
    @KeepName
    @Deprecated
    String getFeaturedImageUrl();

    @NonNull
    @KeepName
    @Deprecated
    String getHiResImageUrl();

    @NonNull
    @KeepName
    @Deprecated
    String getIconImageUrl();

    @NonNull
    Uri h();

    @NonNull
    String l();

    boolean r1();

    @NonNull
    String z0();

    boolean zza();

    boolean zzb();

    boolean zzc();

    boolean zzd();

    boolean zze();

    @NonNull
    String zzf();

    @Deprecated
    boolean zzh();
}
