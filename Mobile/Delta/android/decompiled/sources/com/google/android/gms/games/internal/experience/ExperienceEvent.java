package com.google.android.gms.games.internal.experience;

import android.net.Uri;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.games.Game;
import m9.e;

/* JADX INFO: loaded from: classes.dex */
public interface ExperienceEvent extends e<ExperienceEvent>, Parcelable {
    long c();

    int d();

    int e();

    @NonNull
    @KeepName
    @Deprecated
    String getIconImageUrl();

    @NonNull
    String zza();

    @NonNull
    Game zzb();

    @NonNull
    String zzc();

    @NonNull
    String zzd();

    @NonNull
    Uri zze();

    long zzf();

    long zzh();
}
