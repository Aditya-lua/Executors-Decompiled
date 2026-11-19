package com.google.android.gms.games.snapshot;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.common.data.BitmapTeleporter;
import ha.p;
import o9.s;
import p9.c;
import qa.f;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public final class SnapshotMetadataChangeEntity extends p {

    @NonNull
    public static final Parcelable.Creator<SnapshotMetadataChangeEntity> CREATOR = new f();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f6330f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f6331g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Uri f6332h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public BitmapTeleporter f6333i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Long f6334j;

    public SnapshotMetadataChangeEntity() {
        this(null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        String str = this.f6330f;
        int iA = c.a(parcel);
        c.v(parcel, 1, str, false);
        c.s(parcel, 2, this.f6331g, false);
        c.t(parcel, 4, this.f6332h, i10, false);
        c.t(parcel, 5, this.f6333i, i10, false);
        c.s(parcel, 6, this.f6334j, false);
        c.b(parcel, iA);
    }

    public SnapshotMetadataChangeEntity(String str, Long l10, BitmapTeleporter bitmapTeleporter, Uri uri, Long l11) {
        this.f6330f = str;
        this.f6331g = l10;
        this.f6333i = bitmapTeleporter;
        this.f6332h = uri;
        this.f6334j = l11;
        boolean z10 = true;
        if (bitmapTeleporter != null && uri != null) {
            z10 = false;
        }
        s.q(z10, "Cannot set both a URI and an image");
    }
}
