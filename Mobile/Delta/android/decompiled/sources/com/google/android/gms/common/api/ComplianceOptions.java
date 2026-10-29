package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import k9.v;
import n9.k;
import o9.b;

/* JADX INFO: loaded from: classes.dex */
public final class ComplianceOptions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ComplianceOptions> CREATOR;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public static final ComplianceOptions f5706j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5707f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f5708g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f5709h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f5710i;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5711a = -1;
        public int b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f5712c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f5713d = true;

        @NonNull
        public ComplianceOptions a() {
            return new ComplianceOptions(this.f5711a, this.b, this.f5712c, this.f5713d);
        }

        @NonNull
        public a b(int i10) {
            this.f5711a = i10;
            return this;
        }

        @NonNull
        public a c(int i10) {
            this.b = i10;
            return this;
        }

        @NonNull
        public a d(boolean z10) {
            this.f5713d = z10;
            return this;
        }

        @NonNull
        public a e(int i10) {
            this.f5712c = i10;
            return this;
        }
    }

    static {
        a aVarV3 = v3();
        aVarV3.b(-1);
        aVarV3.c(-1);
        aVarV3.e(0);
        aVarV3.d(true);
        f5706j = aVarV3.a();
        CREATOR = new v();
    }

    public ComplianceOptions(int i10, int i11, int i12, boolean z10) {
        this.f5707f = i10;
        this.f5708g = i11;
        this.f5709h = i12;
        this.f5710i = z10;
    }

    @NonNull
    public static a v3() {
        return new a();
    }

    @NonNull
    public static final a w3(@NonNull Context context) {
        return v3();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ComplianceOptions)) {
            return false;
        }
        ComplianceOptions complianceOptions = (ComplianceOptions) obj;
        return this.f5707f == complianceOptions.f5707f && this.f5708g == complianceOptions.f5708g && this.f5709h == complianceOptions.f5709h && this.f5710i == complianceOptions.f5710i;
    }

    public final int hashCode() {
        return k.c(Integer.valueOf(this.f5707f), Integer.valueOf(this.f5708g), Integer.valueOf(this.f5709h), Boolean.valueOf(this.f5710i));
    }

    @NonNull
    public final String toString() {
        int i10 = this.f5707f;
        int length = String.valueOf(i10).length();
        int i11 = this.f5708g;
        int length2 = String.valueOf(i11).length();
        int i12 = this.f5709h;
        int length3 = String.valueOf(i12).length();
        boolean z10 = this.f5710i;
        StringBuilder sb2 = new StringBuilder(length + 55 + length2 + 19 + length3 + 13 + String.valueOf(z10).length() + 1);
        sb2.append("ComplianceOptions{callerProductId=");
        sb2.append(i10);
        sb2.append(", dataOwnerProductId=");
        sb2.append(i11);
        sb2.append(", processingReason=");
        sb2.append(i12);
        sb2.append(", isUserData=");
        sb2.append(z10);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int i11 = this.f5707f;
        int iA = b.a(parcel);
        b.n(parcel, 1, i11);
        b.n(parcel, 2, this.f5708g);
        b.n(parcel, 3, this.f5709h);
        b.c(parcel, 4, this.f5710i);
        b.b(parcel, iA);
    }
}
