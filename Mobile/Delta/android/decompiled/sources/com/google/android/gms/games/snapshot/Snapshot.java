package com.google.android.gms.games.snapshot;

import android.os.Parcelable;
import androidx.annotation.NonNull;
import m9.e;

/* JADX INFO: loaded from: classes.dex */
public interface Snapshot extends e<Snapshot>, Parcelable {
    @NonNull
    SnapshotMetadata getMetadata();

    @NonNull
    SnapshotContents m3();
}
