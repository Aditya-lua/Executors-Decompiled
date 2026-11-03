package com.google.android.gms.games.achievement;

import android.net.Uri;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.games.Player;
import m9.e;

/* JADX INFO: loaded from: classes.dex */
public interface Achievement extends e<Achievement>, Parcelable {
    @NonNull
    String D0();

    Uri D2();

    Uri H();

    String H1();

    int J2();

    String W1();

    long d1();

    @NonNull
    String getDescription();

    @NonNull
    String getName();

    @KeepName
    @Deprecated
    String getRevealedImageUrl();

    int getState();

    int getType();

    @KeepName
    @Deprecated
    String getUnlockedImageUrl();

    int n1();

    long o2();

    @NonNull
    String zza();

    Player zzb();

    float zzc();
}
