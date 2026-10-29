package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;
import m9.e;

/* JADX INFO: loaded from: classes.dex */
public interface Game extends e<Game>, Parcelable {
    @NonNull
    Uri B();

    @NonNull
    String D0();

    @NonNull
    Uri D1();

    boolean F0();

    int P0();

    @NonNull
    String Q0();

    @NonNull
    String Q1();

    @NonNull
    String Z();

    @Deprecated
    boolean c();

    int e2();

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
    String i0();

    @NonNull
    String l();

    boolean t1();

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
