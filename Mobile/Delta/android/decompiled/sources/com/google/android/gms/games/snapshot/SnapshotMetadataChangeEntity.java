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
    public final String f6305f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f6306g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Uri f6307h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public BitmapTeleporter f6308i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Long f6309j;

    public SnapshotMetadataChangeEntity() {
        this(null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        String str = this.f6305f;
        int iA = b.a(parcel);
        b.v(parcel, 1, str, false);
        b.s(parcel, 2, this.f6306g, false);
        b.t(parcel, 4, this.f6307h, i10, false);
        b.t(parcel, 5, this.f6308i, i10, false);
        b.s(parcel, 6, this.f6309j, false);
        b.b(parcel, iA);
    }

    public SnapshotMetadataChangeEntity(String str, Long l10, BitmapTeleporter bitmapTeleporter, Uri uri, Long l11) {
        this.f6305f = str;
        this.f6306g = l10;
        this.f6308i = bitmapTeleporter;
        this.f6307h = uri;
        this.f6309j = l11;
        boolean z10 = true;
        if (bitmapTeleporter != null && uri != null) {
            z10 = false;
        }
        m.q(z10, "Cannot set both a URI and an image");
    }
}
