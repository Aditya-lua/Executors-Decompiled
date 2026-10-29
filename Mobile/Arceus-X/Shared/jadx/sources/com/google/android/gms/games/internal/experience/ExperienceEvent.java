package com.google.android.gms.games.internal.experience;

import android.net.Uri;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.games.Game;
import p290m9.InterfaceC8474e;

/* JADX INFO: loaded from: classes.dex */
public interface ExperienceEvent extends InterfaceC8474e<ExperienceEvent>, Parcelable {
    /* JADX INFO: renamed from: c */
    long mo9434c();

    /* JADX INFO: renamed from: d */
    int mo9435d();

    /* JADX INFO: renamed from: e */
    int mo9436e();

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
