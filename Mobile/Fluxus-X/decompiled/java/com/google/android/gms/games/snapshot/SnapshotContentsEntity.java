package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import ha.p;
import p9.c;
import qa.b;
import qa.d;
import y9.a;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public final class SnapshotContentsEntity extends p implements b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f6327f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f6326g = new Object();

    @NonNull
    public static final Parcelable.Creator<SnapshotContentsEntity> CREATOR = new d();

    public SnapshotContentsEntity(@NonNull a aVar) {
        this.f6327f = aVar;
    }

    public final boolean isClosed() {
        return this.f6327f == null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.t(parcel, 1, this.f6327f, i10, false);
        c.b(parcel, iA);
    }
}
