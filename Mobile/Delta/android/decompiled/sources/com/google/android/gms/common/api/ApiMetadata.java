package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import k9.t;
import n9.k;
import o9.b;

/* JADX INFO: loaded from: classes.dex */
public final class ApiMetadata extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ApiMetadata> CREATOR = t.a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ApiMetadata f5772i = w3().a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public static final ApiMetadata f5773j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ComplianceOptions f5774f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f5775g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f5776h;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ComplianceOptions f5777a;
        public boolean b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f5778c;

        @NonNull
        public ApiMetadata a() {
            ApiMetadata apiMetadata = new ApiMetadata(this.f5777a, this.b);
            apiMetadata.x3(this.f5778c);
            return apiMetadata;
        }

        @NonNull
        public a b(ComplianceOptions complianceOptions) {
            this.f5777a = complianceOptions;
            return this;
        }

        public final /* synthetic */ a c(boolean z10) {
            this.f5778c = z10;
            return this;
        }
    }

    static {
        a aVarW3 = w3();
        aVarW3.c(true);
        f5773j = aVarW3.a();
    }

    public ApiMetadata(ComplianceOptions complianceOptions, boolean z10) {
        this.f5774f = complianceOptions;
        this.f5775g = z10;
    }

    @NonNull
    public static final ApiMetadata a(@NonNull ComplianceOptions complianceOptions) {
        a aVarW3 = w3();
        aVarW3.b(complianceOptions);
        return aVarW3.a();
    }

    @NonNull
    public static final ApiMetadata v3() {
        return f5772i;
    }

    @NonNull
    public static a w3() {
        return new a();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ApiMetadata)) {
            return false;
        }
        ApiMetadata apiMetadata = (ApiMetadata) obj;
        return k.b(this.f5774f, apiMetadata.f5774f) && this.f5776h == apiMetadata.f5776h && this.f5775g == apiMetadata.f5775g;
    }

    public final int hashCode() {
        return k.c(this.f5774f, Boolean.valueOf(this.f5776h), Boolean.valueOf(this.f5775g));
    }

    @NonNull
    public final String toString() {
        String strValueOf = String.valueOf(this.f5774f);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 31);
        sb2.append("ApiMetadata(complianceOptions=");
        sb2.append(strValueOf);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        if (this.f5776h) {
            parcel.setDataPosition(parcel.dataPosition() - 4);
            parcel.setDataSize(parcel.dataSize() - 4);
            return;
        }
        parcel.writeInt(-204102970);
        int iA = b.a(parcel);
        b.t(parcel, 1, this.f5774f, i10, false);
        b.c(parcel, 2, this.f5775g);
        b.b(parcel, iA);
    }

    public final /* synthetic */ void x3(boolean z10) {
        this.f5776h = z10;
    }
}
