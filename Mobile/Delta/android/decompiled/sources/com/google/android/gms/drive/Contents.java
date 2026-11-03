package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o9.b;
import x9.a;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class Contents extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<Contents> CREATOR = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ParcelFileDescriptor f5925f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f5926g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f5927h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final DriveId f5928i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f5929j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f5930k;

    public Contents(@NonNull ParcelFileDescriptor parcelFileDescriptor, int i10, int i11, @NonNull DriveId driveId, boolean z10, String str) {
        this.f5925f = parcelFileDescriptor;
        this.f5926g = i10;
        this.f5927h = i11;
        this.f5928i = driveId;
        this.f5929j = z10;
        this.f5930k = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        ParcelFileDescriptor parcelFileDescriptor = this.f5925f;
        int iA = b.a(parcel);
        b.t(parcel, 2, parcelFileDescriptor, i10, false);
        b.n(parcel, 3, this.f5926g);
        b.n(parcel, 4, this.f5927h);
        b.t(parcel, 5, this.f5928i, i10, false);
        b.c(parcel, 7, this.f5929j);
        b.v(parcel, 8, this.f5930k, false);
        b.b(parcel, iA);
    }
}
