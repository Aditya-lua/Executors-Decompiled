package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n9.k;
import n9.m;
import z8.h;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class GetSignInIntentRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GetSignInIntentRequest> CREATOR = new h();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f5658f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f5659g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f5660h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f5661i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f5662j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f5663k;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f5664a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f5665c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f5666d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f5667e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f5668f;

        @NonNull
        public GetSignInIntentRequest a() {
            return new GetSignInIntentRequest(this.f5664a, this.b, this.f5665c, this.f5666d, this.f5667e, this.f5668f);
        }

        @NonNull
        public a b(String str) {
            this.b = str;
            return this;
        }

        @NonNull
        public a c(String str) {
            this.f5666d = str;
            return this;
        }

        @NonNull
        @Deprecated
        public a d(boolean z10) {
            this.f5667e = z10;
            return this;
        }

        @NonNull
        public a e(@NonNull String str) {
            m.l(str);
            this.f5664a = str;
            return this;
        }

        @NonNull
        public final a f(String str) {
            this.f5665c = str;
            return this;
        }

        @NonNull
        public final a g(int i10) {
            this.f5668f = i10;
            return this;
        }
    }

    public GetSignInIntentRequest(String str, String str2, String str3, String str4, boolean z10, int i10) {
        m.l(str);
        this.f5658f = str;
        this.f5659g = str2;
        this.f5660h = str3;
        this.f5661i = str4;
        this.f5662j = z10;
        this.f5663k = i10;
    }

    @NonNull
    public static a A3(@NonNull GetSignInIntentRequest getSignInIntentRequest) {
        m.l(getSignInIntentRequest);
        a aVarV3 = v3();
        aVarV3.e(getSignInIntentRequest.y3());
        aVarV3.c(getSignInIntentRequest.x3());
        aVarV3.b(getSignInIntentRequest.w3());
        aVarV3.d(getSignInIntentRequest.f5662j);
        aVarV3.g(getSignInIntentRequest.f5663k);
        String str = getSignInIntentRequest.f5660h;
        if (str != null) {
            aVarV3.f(str);
        }
        return aVarV3;
    }

    @NonNull
    public static a v3() {
        return new a();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GetSignInIntentRequest)) {
            return false;
        }
        GetSignInIntentRequest getSignInIntentRequest = (GetSignInIntentRequest) obj;
        return k.b(this.f5658f, getSignInIntentRequest.f5658f) && k.b(this.f5661i, getSignInIntentRequest.f5661i) && k.b(this.f5659g, getSignInIntentRequest.f5659g) && k.b(Boolean.valueOf(this.f5662j), Boolean.valueOf(getSignInIntentRequest.f5662j)) && this.f5663k == getSignInIntentRequest.f5663k;
    }

    public int hashCode() {
        return k.c(this.f5658f, this.f5659g, this.f5661i, Boolean.valueOf(this.f5662j), Integer.valueOf(this.f5663k));
    }

    public String w3() {
        return this.f5659g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = o9.b.a(parcel);
        o9.b.v(parcel, 1, y3(), false);
        o9.b.v(parcel, 2, w3(), false);
        o9.b.v(parcel, 3, this.f5660h, false);
        o9.b.v(parcel, 4, x3(), false);
        o9.b.c(parcel, 5, z3());
        o9.b.n(parcel, 6, this.f5663k);
        o9.b.b(parcel, iA);
    }

    public String x3() {
        return this.f5661i;
    }

    @NonNull
    public String y3() {
        return this.f5658f;
    }

    @Deprecated
    public boolean z3() {
        return this.f5662j;
    }
}
