package com.google.android.gms.games.video;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.games.internal.zzg;
import n9.k;
import o9.b;
import ra.a;

/* JADX INFO: loaded from: classes.dex */
public final class VideoCapabilities extends zzg {

    @NonNull
    public static final Parcelable.Creator<VideoCapabilities> CREATOR = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f6262f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f6263g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f6264h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean[] f6265i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean[] f6266j;

    public VideoCapabilities(boolean z10, boolean z11, boolean z12, @NonNull boolean[] zArr, @NonNull boolean[] zArr2) {
        this.f6262f = z10;
        this.f6263g = z11;
        this.f6264h = z12;
        this.f6265i = zArr;
        this.f6266j = zArr2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof VideoCapabilities)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        VideoCapabilities videoCapabilities = (VideoCapabilities) obj;
        return k.b(videoCapabilities.v3(), v3()) && k.b(videoCapabilities.w3(), w3()) && k.b(Boolean.valueOf(videoCapabilities.x3()), Boolean.valueOf(x3())) && k.b(Boolean.valueOf(videoCapabilities.y3()), Boolean.valueOf(y3())) && k.b(Boolean.valueOf(videoCapabilities.z3()), Boolean.valueOf(z3()));
    }

    public int hashCode() {
        return k.c(v3(), w3(), Boolean.valueOf(x3()), Boolean.valueOf(y3()), Boolean.valueOf(z3()));
    }

    @NonNull
    public String toString() {
        return k.d(this).a("SupportedCaptureModes", v3()).a("SupportedQualityLevels", w3()).a("CameraSupported", Boolean.valueOf(x3())).a("MicSupported", Boolean.valueOf(y3())).a("StorageWriteSupported", Boolean.valueOf(z3())).toString();
    }

    @NonNull
    public boolean[] v3() {
        return this.f6265i;
    }

    @NonNull
    public boolean[] w3() {
        return this.f6266j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = b.a(parcel);
        b.c(parcel, 1, x3());
        b.c(parcel, 2, y3());
        b.c(parcel, 3, z3());
        b.d(parcel, 4, v3(), false);
        b.d(parcel, 5, w3(), false);
        b.b(parcel, iA);
    }

    public boolean x3() {
        return this.f6262f;
    }

    public boolean y3() {
        return this.f6263g;
    }

    public boolean z3() {
        return this.f6264h;
    }
}
