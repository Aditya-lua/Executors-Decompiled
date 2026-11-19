package com.google.mlkit.vision.common.internal;

import android.graphics.Matrix;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import p9.a;
import p9.c;

/* JADX INFO: loaded from: classes2.dex */
public class VisionImageMetadataParcel extends a {

    @NonNull
    public static final Parcelable.Creator<VisionImageMetadataParcel> CREATOR = new zzg();
    public final int height;
    public final int rotation;
    public final long timestampMillis;
    public final int width;
    public final int zza;

    public VisionImageMetadataParcel(int i10, int i11, int i12, long j10, int i13) {
        this.width = i10;
        this.height = i11;
        this.zza = i12;
        this.timestampMillis = j10;
        this.rotation = i13;
    }

    public Matrix getUprightRotationMatrix() {
        return ImageUtils.getInstance().getUprightRotationMatrix(this.width, this.height, this.rotation);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.n(parcel, 1, this.width);
        c.n(parcel, 2, this.height);
        c.n(parcel, 3, this.zza);
        c.r(parcel, 4, this.timestampMillis);
        c.n(parcel, 5, this.rotation);
        c.b(parcel, iA);
    }
}
