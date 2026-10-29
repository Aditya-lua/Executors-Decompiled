package com.google.android.gms.games.snapshot;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.games.internal.zzg;
import p305n9.C8953m;
import p325o9.C9718b;
import pa.C10185c;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public final class SnapshotMetadataChangeEntity extends zzg {

    @NonNull
    public static final Parcelable.Creator<SnapshotMetadataChangeEntity> CREATOR = new C10185c();

    /* JADX INFO: renamed from: f */
    public final String f7952f;

    /* JADX INFO: renamed from: g */
    public final Long f7953g;

    /* JADX INFO: renamed from: h */
    public final Uri f7954h;

    /* JADX INFO: renamed from: i */
    public BitmapTeleporter f7955i;

    /* JADX INFO: renamed from: j */
    public final Long f7956j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public SnapshotMetadataChangeEntity() {
        this(null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        String str = this.f7952f;
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38478v(parcel, 1, str, false);
        C9718b.m38475s(parcel, 2, this.f7953g, false);
        C9718b.m38476t(parcel, 4, this.f7954h, i10, false);
        C9718b.m38476t(parcel, 5, this.f7955i, i10, false);
        C9718b.m38475s(parcel, 6, this.f7956j, false);
        C9718b.m38458b(parcel, iM38457a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public SnapshotMetadataChangeEntity(String str, Long l10, BitmapTeleporter bitmapTeleporter, Uri uri, Long l11) {
        this.f7952f = str;
        this.f7953g = l10;
        this.f7955i = bitmapTeleporter;
        this.f7954h = uri;
        this.f7956j = l11;
        boolean z10 = true;
        if (bitmapTeleporter != null && uri != null) {
            z10 = false;
        }
        C8953m.m36052q(z10, "Cannot set both a URI and an image");
    }
}
