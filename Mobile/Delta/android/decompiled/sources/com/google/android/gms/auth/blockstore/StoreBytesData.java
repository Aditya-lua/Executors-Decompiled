package com.google.android.gms.auth.blockstore;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import e9.e;
import n9.m;

/* JADX INFO: loaded from: classes.dex */
public class StoreBytesData extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<StoreBytesData> CREATOR = new e();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f5746f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f5747g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f5748h;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte[] f5749a;
        public boolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f5750c = "com.google.android.gms.auth.blockstore.DEFAULT_BYTES_DATA_KEY";

        @NonNull
        public StoreBytesData a() {
            return new StoreBytesData(this.f5749a, this.b, this.f5750c);
        }

        @NonNull
        public a b(@NonNull byte[] bArr) {
            this.f5749a = bArr;
            return this;
        }

        @NonNull
        public a c(@NonNull String str) {
            m.g(str, "key cannot be null or empty");
            this.f5750c = str;
            return this;
        }

        @NonNull
        public a d(boolean z10) {
            this.b = z10;
            return this;
        }
    }

    public StoreBytesData(byte[] bArr, boolean z10, String str) {
        this.f5746f = bArr;
        this.f5747g = z10;
        this.f5748h = str;
    }

    @NonNull
    public byte[] v3() {
        return this.f5746f;
    }

    @NonNull
    public String w3() {
        return this.f5748h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = o9.b.a(parcel);
        o9.b.g(parcel, 1, v3(), false);
        o9.b.c(parcel, 2, x3());
        o9.b.v(parcel, 3, w3(), false);
        o9.b.b(parcel, iA);
    }

    public boolean x3() {
        return this.f5747g;
    }
}
