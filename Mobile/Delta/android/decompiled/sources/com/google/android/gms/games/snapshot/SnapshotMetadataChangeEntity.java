package com.google.android.gms.games.snapshot;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.games.internal.zzg;
import n9.m;
import o9.b;
import pa.c;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public final class SnapshotMetadataChangeEntity extends zzg {

    @NonNull
    public static final Parcelable.Creator<SnapshotMetadataChangeEntity> CREATOR = new c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f6232f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f6233g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Uri f6234h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public BitmapTeleporter f6235i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Long f6236j;

    public SnapshotMetadataChangeEntity() {
        this(null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        String str = this.f6232f;
        int iA = b.a(parcel);
        b.v(parcel, 1, str, false);
        b.s(parcel, 2, this.f6233g, false);
        b.t(parcel, 4, this.f6234h, i10, false);
        b.t(parcel, 5, this.f6235i, i10, false);
        b.s(parcel, 6, this.f6236j, false);
        b.b(parcel, iA);
    }

    public SnapshotMetadataChangeEntity(String str, Long l10, BitmapTeleporter bitmapTeleporter, Uri uri, Long l11) {
        this.f6232f = str;
        this.f6233g = l10;
        this.f6235i = bitmapTeleporter;
        this.f6234h = uri;
        this.f6236j = l11;
        boolean z10 = true;
        if (bitmapTeleporter != null && uri != null) {
            z10 = false;
        }
        m.q(z10, "Cannot set both a URI and an image");
    }
}
