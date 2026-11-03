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
    @NonNull
    String A1();

    String C2();

    Uri O0();

    boolean P2();

    @NonNull
    Player V0();

    long V1();

    long d0();

    @KeepName
    @Deprecated
    String getCoverImageUrl();

    @NonNull
    String getDescription();

    float j3();

    @NonNull
    String q3();

    @NonNull
    Game u3();

    long w0();

    @NonNull
    String zza();
}
