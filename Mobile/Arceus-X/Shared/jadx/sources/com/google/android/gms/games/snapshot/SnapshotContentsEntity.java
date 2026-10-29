package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.internal.zzg;
import p325o9.C9718b;
import pa.C10183a;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public final class SnapshotContentsEntity extends zzg implements SnapshotContents {

    /* JADX INFO: renamed from: f */
    public Contents f7949f;

    /* JADX INFO: renamed from: g */
    public static final Object f7948g = new Object();

    @NonNull
    public static final Parcelable.Creator<SnapshotContentsEntity> CREATOR = new C10183a();

    public SnapshotContentsEntity(@NonNull Contents contents) {
        this.f7949f = contents;
    }

    public final boolean isClosed() {
        return this.f7949f == null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38476t(parcel, 1, this.f7949f, i10, false);
        C9718b.m38458b(parcel, iM38457a);
    }
}
