package com.google.mlkit.vision.common.internal;

import android.graphics.Matrix;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes2.dex */
public class VisionImageMetadataParcel extends AbstractSafeParcelable {

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
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38470n(parcel, 1, this.width);
        C9718b.m38470n(parcel, 2, this.height);
        C9718b.m38470n(parcel, 3, this.zza);
        C9718b.m38474r(parcel, 4, this.timestampMillis);
        C9718b.m38470n(parcel, 5, this.rotation);
        C9718b.m38458b(parcel, iM38457a);
    }
}
