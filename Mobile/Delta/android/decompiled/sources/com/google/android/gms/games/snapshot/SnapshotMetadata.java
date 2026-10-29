package com.google.android.gms.games.snapshot;

import android.net.Uri;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Player;
import m9.e;

/* JADX INFO: loaded from: classes.dex */
public interface SnapshotMetadata extends e<SnapshotMetadata>, Parcelable {
    long A0();

    String B2();

    @NonNull
    String C1();

    boolean Q2();

    Uri S0();

    long V1();

    @NonNull
    Player Z0();

    long f0();

    @KeepName
    @Deprecated
    String getCoverImageUrl();

    @NonNull
    String getDescription();

    float h3();

    @NonNull
    String q3();

    @NonNull
    Game u3();

    @NonNull
    String zza();
}
