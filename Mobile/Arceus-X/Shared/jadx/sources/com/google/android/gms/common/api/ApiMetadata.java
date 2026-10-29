package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p242k9.C7510t;
import p305n9.C8947k;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class ApiMetadata extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ApiMetadata> CREATOR = C7510t.m31165a();

    /* JADX INFO: renamed from: i */
    public static final ApiMetadata f7384i = m9148w3().m9150a();

    /* JADX INFO: renamed from: j */
    @NonNull
    public static final ApiMetadata f7385j;

    /* JADX INFO: renamed from: f */
    public final ComplianceOptions f7386f;

    /* JADX INFO: renamed from: g */
    public final boolean f7387g;

    /* JADX INFO: renamed from: h */
    public boolean f7388h;

    /* JADX INFO: renamed from: com.google.android.gms.common.api.ApiMetadata$a */
    public static final class C1896a {

        /* JADX INFO: renamed from: a */
        public ComplianceOptions f7389a;

        /* JADX INFO: renamed from: b */
        public boolean f7390b = false;

        /* JADX INFO: renamed from: c */
        public boolean f7391c;

        @NonNull
        /* JADX INFO: renamed from: a */
        public ApiMetadata m9150a() {
            ApiMetadata apiMetadata = new ApiMetadata(this.f7389a, this.f7390b);
            apiMetadata.m9149x3(this.f7391c);
            return apiMetadata;
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public C1896a m9151b(ComplianceOptions complianceOptions) {
            this.f7389a = complianceOptions;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C1896a m9152c(boolean z10) {
            this.f7391c = z10;
            return this;
        }
    }

    static {
        C1896a c1896aM9148w3 = m9148w3();
        c1896aM9148w3.m9152c(true);
        f7385j = c1896aM9148w3.m9150a();
    }

    public ApiMetadata(ComplianceOptions complianceOptions, boolean z10) {
        this.f7386f = complianceOptions;
        this.f7387g = z10;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static final ApiMetadata m9146a(@NonNull ComplianceOptions complianceOptions) {
        C1896a c1896aM9148w3 = m9148w3();
        c1896aM9148w3.m9151b(complianceOptions);
        return c1896aM9148w3.m9150a();
    }

    @NonNull
    /* JADX INFO: renamed from: v3 */
    public static final ApiMetadata m9147v3() {
        return f7384i;
    }

    @NonNull
    /* JADX INFO: renamed from: w3 */
    public static C1896a m9148w3() {
        return new C1896a();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ApiMetadata)) {
            return false;
        }
        ApiMetadata apiMetadata = (ApiMetadata) obj;
        return C8947k.m36026b(this.f7386f, apiMetadata.f7386f) && this.f7388h == apiMetadata.f7388h && this.f7387g == apiMetadata.f7387g;
    }

    public final int hashCode() {
        return C8947k.m36027c(this.f7386f, Boolean.valueOf(this.f7388h), Boolean.valueOf(this.f7387g));
    }

    @NonNull
    public final String toString() {
        String strValueOf = String.valueOf(this.f7386f);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 31);
        sb2.append("ApiMetadata(complianceOptions=");
        sb2.append(strValueOf);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        if (this.f7388h) {
            parcel.setDataPosition(parcel.dataPosition() - 4);
            parcel.setDataSize(parcel.dataSize() - 4);
            return;
        }
        parcel.writeInt(-204102970);
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38476t(parcel, 1, this.f7386f, i10, false);
        C9718b.m38459c(parcel, 2, this.f7387g);
        C9718b.m38458b(parcel, iM38457a);
    }

    /* JADX INFO: renamed from: x3 */
    public final /* synthetic */ void m9149x3(boolean z10) {
        this.f7388h = z10;
    }
}
