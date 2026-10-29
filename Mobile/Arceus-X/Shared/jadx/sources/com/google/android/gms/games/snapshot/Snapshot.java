package com.google.android.gms.games.snapshot;

import android.os.Parcelable;
import androidx.annotation.NonNull;
import p290m9.InterfaceC8474e;

/* JADX INFO: loaded from: classes.dex */
public interface Snapshot extends InterfaceC8474e<Snapshot>, Parcelable {
    @NonNull
    SnapshotMetadata getMetadata();

    @NonNull
    /* JADX INFO: renamed from: m3 */
    SnapshotContents mo9494m3();
}
