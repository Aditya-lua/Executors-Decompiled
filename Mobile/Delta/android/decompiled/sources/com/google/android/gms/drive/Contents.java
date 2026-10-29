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
    public final ParcelFileDescriptor f5852f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f5853g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f5854h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final DriveId f5855i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f5856j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f5857k;

    public Contents(@NonNull ParcelFileDescriptor parcelFileDescriptor, int i10, int i11, @NonNull DriveId driveId, boolean z10, String str) {
        this.f5852f = parcelFileDescriptor;
        this.f5853g = i10;
        this.f5854h = i11;
        this.f5855i = driveId;
        this.f5856j = z10;
        this.f5857k = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        ParcelFileDescriptor parcelFileDescriptor = this.f5852f;
        int iA = b.a(parcel);
        b.t(parcel, 2, parcelFileDescriptor, i10, false);
        b.n(parcel, 3, this.f5853g);
        b.n(parcel, 4, this.f5854h);
        b.t(parcel, 5, this.f5855i, i10, false);
        b.c(parcel, 7, this.f5856j);
        b.v(parcel, 8, this.f5857k, false);
        b.b(parcel, iA);
    }
}
