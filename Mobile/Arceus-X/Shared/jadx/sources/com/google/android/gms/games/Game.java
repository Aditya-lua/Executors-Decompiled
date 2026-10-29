package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;
import p290m9.InterfaceC8474e;

/* JADX INFO: loaded from: classes.dex */
public interface Game extends InterfaceC8474e<Game>, Parcelable {
    @NonNull
    /* JADX INFO: renamed from: B */
    Uri mo9367B();

    @NonNull
    /* JADX INFO: renamed from: D0 */
    String mo9368D0();

    @NonNull
    /* JADX INFO: renamed from: D1 */
    Uri mo9369D1();

    /* JADX INFO: renamed from: F0 */
    boolean mo9370F0();

    /* JADX INFO: renamed from: P0 */
    int mo9371P0();

    @NonNull
    /* JADX INFO: renamed from: Q0 */
    String mo9372Q0();

    @NonNull
    /* JADX INFO: renamed from: Q1 */
    String mo9373Q1();

    @NonNull
    /* JADX INFO: renamed from: Z */
    String mo9374Z();

    @Deprecated
    /* JADX INFO: renamed from: c */
    boolean mo9375c();

    /* JADX INFO: renamed from: e2 */
    int mo9376e2();

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
    /* JADX INFO: renamed from: h */
    Uri mo9377h();

    @NonNull
    /* JADX INFO: renamed from: i0 */
    String mo9378i0();

    @NonNull
    /* JADX INFO: renamed from: l */
    String mo9379l();

    /* JADX INFO: renamed from: u1 */
    boolean mo9380u1();

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
