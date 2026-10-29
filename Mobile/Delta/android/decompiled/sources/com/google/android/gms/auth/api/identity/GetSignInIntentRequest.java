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
    public final String f5585f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f5586g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f5587h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f5588i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f5589j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f5590k;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f5591a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f5592c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f5593d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f5594e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f5595f;

        @NonNull
        public GetSignInIntentRequest a() {
            return new GetSignInIntentRequest(this.f5591a, this.b, this.f5592c, this.f5593d, this.f5594e, this.f5595f);
        }

        @NonNull
        public a b(String str) {
            this.b = str;
            return this;
        }

        @NonNull
        public a c(String str) {
            this.f5593d = str;
            return this;
        }

        @NonNull
        @Deprecated
        public a d(boolean z10) {
            this.f5594e = z10;
            return this;
        }

        @NonNull
        public a e(@NonNull String str) {
            m.l(str);
            this.f5591a = str;
            return this;
        }

        @NonNull
        public final a f(String str) {
            this.f5592c = str;
            return this;
        }

        @NonNull
        public final a g(int i10) {
            this.f5595f = i10;
            return this;
        }
    }

    public GetSignInIntentRequest(String str, String str2, String str3, String str4, boolean z10, int i10) {
        m.l(str);
        this.f5585f = str;
        this.f5586g = str2;
        this.f5587h = str3;
        this.f5588i = str4;
        this.f5589j = z10;
        this.f5590k = i10;
    }

    @NonNull
    public static a A3(@NonNull GetSignInIntentRequest getSignInIntentRequest) {
        m.l(getSignInIntentRequest);
        a aVarV3 = v3();
        aVarV3.e(getSignInIntentRequest.y3());
        aVarV3.c(getSignInIntentRequest.x3());
        aVarV3.b(getSignInIntentRequest.w3());
        aVarV3.d(getSignInIntentRequest.f5589j);
        aVarV3.g(getSignInIntentRequest.f5590k);
        String str = getSignInIntentRequest.f5587h;
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
        return k.b(this.f5585f, getSignInIntentRequest.f5585f) && k.b(this.f5588i, getSignInIntentRequest.f5588i) && k.b(this.f5586g, getSignInIntentRequest.f5586g) && k.b(Boolean.valueOf(this.f5589j), Boolean.valueOf(getSignInIntentRequest.f5589j)) && this.f5590k == getSignInIntentRequest.f5590k;
    }

    public int hashCode() {
        return k.c(this.f5585f, this.f5586g, this.f5588i, Boolean.valueOf(this.f5589j), Integer.valueOf(this.f5590k));
    }

    public String w3() {
        return this.f5586g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = o9.b.a(parcel);
        o9.b.v(parcel, 1, y3(), false);
        o9.b.v(parcel, 2, w3(), false);
        o9.b.v(parcel, 3, this.f5587h, false);
        o9.b.v(parcel, 4, x3(), false);
        o9.b.c(parcel, 5, z3());
        o9.b.n(parcel, 6, this.f5590k);
        o9.b.b(parcel, iA);
    }

    public String x3() {
        return this.f5588i;
    }

    @NonNull
    public String y3() {
        return this.f5585f;
    }

    @Deprecated
    public boolean z3() {
        return this.f5589j;
    }
}
