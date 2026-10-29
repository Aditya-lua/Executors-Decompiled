package com.google.android.gms.games.achievement;

import android.net.Uri;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.games.Player;
import m9.e;

/* JADX INFO: loaded from: classes.dex */
public interface Achievement extends e<Achievement>, Parcelable {
    Uri C2();

    Uri H();

    @NonNull
    String H0();

    String J1();

    int J2();

    String W1();

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

    long h1();

    long n2();

    int p1();

    @NonNull
    String zza();

    Player zzb();

    float zzc();
}
