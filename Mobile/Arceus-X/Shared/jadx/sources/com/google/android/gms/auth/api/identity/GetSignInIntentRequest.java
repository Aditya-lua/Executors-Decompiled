package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p305n9.C8947k;
import p305n9.C8953m;
import p325o9.C9718b;
import p598z8.C13744h;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class GetSignInIntentRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GetSignInIntentRequest> CREATOR = new C13744h();

    /* JADX INFO: renamed from: f */
    public final String f7258f;

    /* JADX INFO: renamed from: g */
    public final String f7259g;

    /* JADX INFO: renamed from: h */
    public final String f7260h;

    /* JADX INFO: renamed from: i */
    public final String f7261i;

    /* JADX INFO: renamed from: j */
    public final boolean f7262j;

    /* JADX INFO: renamed from: k */
    public final int f7263k;

    /* JADX INFO: renamed from: com.google.android.gms.auth.api.identity.GetSignInIntentRequest$a */
    public static final class C1878a {

        /* JADX INFO: renamed from: a */
        public String f7264a;

        /* JADX INFO: renamed from: b */
        public String f7265b;

        /* JADX INFO: renamed from: c */
        public String f7266c;

        /* JADX INFO: renamed from: d */
        public String f7267d;

        /* JADX INFO: renamed from: e */
        public boolean f7268e;

        /* JADX INFO: renamed from: f */
        public int f7269f;

        @NonNull
        /* JADX INFO: renamed from: a */
        public GetSignInIntentRequest m9037a() {
            return new GetSignInIntentRequest(this.f7264a, this.f7265b, this.f7266c, this.f7267d, this.f7268e, this.f7269f);
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public C1878a m9038b(String str) {
            this.f7265b = str;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: c */
        public C1878a m9039c(String str) {
            this.f7267d = str;
            return this;
        }

        @NonNull
        @Deprecated
        /* JADX INFO: renamed from: d */
        public C1878a m9040d(boolean z10) {
            this.f7268e = z10;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: e */
        public C1878a m9041e(@NonNull String str) {
            C8953m.m36047l(str);
            this.f7264a = str;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: f */
        public final C1878a m9042f(String str) {
            this.f7266c = str;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: g */
        public final C1878a m9043g(int i10) {
            this.f7269f = i10;
            return this;
        }
    }

    public GetSignInIntentRequest(String str, String str2, String str3, String str4, boolean z10, int i10) {
        C8953m.m36047l(str);
        this.f7258f = str;
        this.f7259g = str2;
        this.f7260h = str3;
        this.f7261i = str4;
        this.f7262j = z10;
        this.f7263k = i10;
    }

    @NonNull
    /* JADX INFO: renamed from: A3 */
    public static C1878a m9031A3(@NonNull GetSignInIntentRequest getSignInIntentRequest) {
        C8953m.m36047l(getSignInIntentRequest);
        C1878a c1878aM9032v3 = m9032v3();
        c1878aM9032v3.m9041e(getSignInIntentRequest.m9035y3());
        c1878aM9032v3.m9039c(getSignInIntentRequest.m9034x3());
        c1878aM9032v3.m9038b(getSignInIntentRequest.m9033w3());
        c1878aM9032v3.m9040d(getSignInIntentRequest.f7262j);
        c1878aM9032v3.m9043g(getSignInIntentRequest.f7263k);
        String str = getSignInIntentRequest.f7260h;
        if (str != null) {
            c1878aM9032v3.m9042f(str);
        }
        return c1878aM9032v3;
    }

    @NonNull
    /* JADX INFO: renamed from: v3 */
    public static C1878a m9032v3() {
        return new C1878a();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GetSignInIntentRequest)) {
            return false;
        }
        GetSignInIntentRequest getSignInIntentRequest = (GetSignInIntentRequest) obj;
        return C8947k.m36026b(this.f7258f, getSignInIntentRequest.f7258f) && C8947k.m36026b(this.f7261i, getSignInIntentRequest.f7261i) && C8947k.m36026b(this.f7259g, getSignInIntentRequest.f7259g) && C8947k.m36026b(Boolean.valueOf(this.f7262j), Boolean.valueOf(getSignInIntentRequest.f7262j)) && this.f7263k == getSignInIntentRequest.f7263k;
    }

    public int hashCode() {
        return C8947k.m36027c(this.f7258f, this.f7259g, this.f7261i, Boolean.valueOf(this.f7262j), Integer.valueOf(this.f7263k));
    }

    /* JADX INFO: renamed from: w3 */
    public String m9033w3() {
        return this.f7259g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38478v(parcel, 1, m9035y3(), false);
        C9718b.m38478v(parcel, 2, m9033w3(), false);
        C9718b.m38478v(parcel, 3, this.f7260h, false);
        C9718b.m38478v(parcel, 4, m9034x3(), false);
        C9718b.m38459c(parcel, 5, m9036z3());
        C9718b.m38470n(parcel, 6, this.f7263k);
        C9718b.m38458b(parcel, iM38457a);
    }

    /* JADX INFO: renamed from: x3 */
    public String m9034x3() {
        return this.f7261i;
    }

    @NonNull
    /* JADX INFO: renamed from: y3 */
    public String m9035y3() {
        return this.f7258f;
    }

    @Deprecated
    /* JADX INFO: renamed from: z3 */
    public boolean m9036z3() {
        return this.f7262j;
    }
}
