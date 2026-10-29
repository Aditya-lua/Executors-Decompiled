package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p242k9.C7512v;
import p305n9.C8947k;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class ComplianceOptions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ComplianceOptions> CREATOR;

    /* JADX INFO: renamed from: j */
    @NonNull
    public static final ComplianceOptions f7392j;

    /* JADX INFO: renamed from: f */
    public final int f7393f;

    /* JADX INFO: renamed from: g */
    public final int f7394g;

    /* JADX INFO: renamed from: h */
    public final int f7395h;

    /* JADX INFO: renamed from: i */
    public final boolean f7396i;

    /* JADX INFO: renamed from: com.google.android.gms.common.api.ComplianceOptions$a */
    public static final class C1897a {

        /* JADX INFO: renamed from: a */
        public int f7397a = -1;

        /* JADX INFO: renamed from: b */
        public int f7398b = -1;

        /* JADX INFO: renamed from: c */
        public int f7399c = 0;

        /* JADX INFO: renamed from: d */
        public boolean f7400d = true;

        @NonNull
        /* JADX INFO: renamed from: a */
        public ComplianceOptions m9155a() {
            return new ComplianceOptions(this.f7397a, this.f7398b, this.f7399c, this.f7400d);
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public C1897a m9156b(int i10) {
            this.f7397a = i10;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: c */
        public C1897a m9157c(int i10) {
            this.f7398b = i10;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: d */
        public C1897a m9158d(boolean z10) {
            this.f7400d = z10;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: e */
        public C1897a m9159e(int i10) {
            this.f7399c = i10;
            return this;
        }
    }

    static {
        C1897a c1897aM9153v3 = m9153v3();
        c1897aM9153v3.m9156b(-1);
        c1897aM9153v3.m9157c(-1);
        c1897aM9153v3.m9159e(0);
        c1897aM9153v3.m9158d(true);
        f7392j = c1897aM9153v3.m9155a();
        CREATOR = new C7512v();
    }

    public ComplianceOptions(int i10, int i11, int i12, boolean z10) {
        this.f7393f = i10;
        this.f7394g = i11;
        this.f7395h = i12;
        this.f7396i = z10;
    }

    @NonNull
    /* JADX INFO: renamed from: v3 */
    public static C1897a m9153v3() {
        return new C1897a();
    }

    @NonNull
    /* JADX INFO: renamed from: w3 */
    public static final C1897a m9154w3(@NonNull Context context) {
        return m9153v3();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ComplianceOptions)) {
            return false;
        }
        ComplianceOptions complianceOptions = (ComplianceOptions) obj;
        return this.f7393f == complianceOptions.f7393f && this.f7394g == complianceOptions.f7394g && this.f7395h == complianceOptions.f7395h && this.f7396i == complianceOptions.f7396i;
    }

    public final int hashCode() {
        return C8947k.m36027c(Integer.valueOf(this.f7393f), Integer.valueOf(this.f7394g), Integer.valueOf(this.f7395h), Boolean.valueOf(this.f7396i));
    }

    @NonNull
    public final String toString() {
        int i10 = this.f7393f;
        int length = String.valueOf(i10).length();
        int i11 = this.f7394g;
        int length2 = String.valueOf(i11).length();
        int i12 = this.f7395h;
        int length3 = String.valueOf(i12).length();
        boolean z10 = this.f7396i;
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
        int i11 = this.f7393f;
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38470n(parcel, 1, i11);
        C9718b.m38470n(parcel, 2, this.f7394g);
        C9718b.m38470n(parcel, 3, this.f7395h);
        C9718b.m38459c(parcel, 4, this.f7396i);
        C9718b.m38458b(parcel, iM38457a);
    }
}
