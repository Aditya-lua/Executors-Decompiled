package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import n9.k;
import n9.m;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class BeginSignInRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<BeginSignInRequest> CREATOR = new com.google.android.gms.auth.api.identity.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final PasswordRequestOptions f5545f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final GoogleIdTokenRequestOptions f5546g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f5547h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f5548i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f5549j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final PasskeysRequestOptions f5550k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final PasskeyJsonRequestOptions f5551l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f5552m;

    @Deprecated
    public static final class GoogleIdTokenRequestOptions extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<GoogleIdTokenRequestOptions> CREATOR = new b();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f5553f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f5554g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f5555h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f5556i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final String f5557j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final List f5558k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f5559l;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public boolean f5560a = false;
            public String b = null;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public String f5561c = null;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public boolean f5562d = true;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public String f5563e = null;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public List f5564f = null;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public boolean f5565g = false;

            @NonNull
            public a a(@NonNull String str, List<String> list) {
                this.f5563e = (String) m.m(str, "linkedServiceId must be provided if you want to associate linked accounts.");
                this.f5564f = list;
                return this;
            }

            @NonNull
            public GoogleIdTokenRequestOptions b() {
                return new GoogleIdTokenRequestOptions(this.f5560a, this.b, this.f5561c, this.f5562d, this.f5563e, this.f5564f, this.f5565g);
            }

            @NonNull
            public a c(boolean z10) {
                this.f5562d = z10;
                return this;
            }

            @NonNull
            public a d(String str) {
                this.f5561c = str;
                return this;
            }

            @NonNull
            @Deprecated
            public a e(boolean z10) {
                this.f5565g = z10;
                return this;
            }

            @NonNull
            public a f(@NonNull String str) {
                this.b = m.f(str);
                return this;
            }

            @NonNull
            public a g(boolean z10) {
                this.f5560a = z10;
                return this;
            }
        }

        public GoogleIdTokenRequestOptions(boolean z10, String str, String str2, boolean z11, String str3, List list, boolean z12) {
            boolean z13 = true;
            if (z11 && z12) {
                z13 = false;
            }
            m.b(z13, "filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.");
            this.f5553f = z10;
            if (z10) {
                m.m(str, "serverClientId must be provided if Google ID tokens are requested");
            }
            this.f5554g = str;
            this.f5555h = str2;
            this.f5556i = z11;
            Parcelable.Creator<BeginSignInRequest> creator = BeginSignInRequest.CREATOR;
            ArrayList arrayList = null;
            if (list != null && !list.isEmpty()) {
                arrayList = new ArrayList(list);
                Collections.sort(arrayList);
            }
            this.f5558k = arrayList;
            this.f5557j = str3;
            this.f5559l = z12;
        }

        @NonNull
        public static a v3() {
            return new a();
        }

        public String A3() {
            return this.f5554g;
        }

        public boolean B3() {
            return this.f5553f;
        }

        @Deprecated
        public boolean C3() {
            return this.f5559l;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof GoogleIdTokenRequestOptions)) {
                return false;
            }
            GoogleIdTokenRequestOptions googleIdTokenRequestOptions = (GoogleIdTokenRequestOptions) obj;
            return this.f5553f == googleIdTokenRequestOptions.f5553f && k.b(this.f5554g, googleIdTokenRequestOptions.f5554g) && k.b(this.f5555h, googleIdTokenRequestOptions.f5555h) && this.f5556i == googleIdTokenRequestOptions.f5556i && k.b(this.f5557j, googleIdTokenRequestOptions.f5557j) && k.b(this.f5558k, googleIdTokenRequestOptions.f5558k) && this.f5559l == googleIdTokenRequestOptions.f5559l;
        }

        public int hashCode() {
            return k.c(Boolean.valueOf(this.f5553f), this.f5554g, this.f5555h, Boolean.valueOf(this.f5556i), this.f5557j, this.f5558k, Boolean.valueOf(this.f5559l));
        }

        public boolean w3() {
            return this.f5556i;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            int iA = o9.b.a(parcel);
            o9.b.c(parcel, 1, B3());
            o9.b.v(parcel, 2, A3(), false);
            o9.b.v(parcel, 3, z3(), false);
            o9.b.c(parcel, 4, w3());
            o9.b.v(parcel, 5, y3(), false);
            o9.b.x(parcel, 6, x3(), false);
            o9.b.c(parcel, 7, C3());
            o9.b.b(parcel, iA);
        }

        public List<String> x3() {
            return this.f5558k;
        }

        public String y3() {
            return this.f5557j;
        }

        public String z3() {
            return this.f5555h;
        }
    }

    @Deprecated
    public static final class PasskeyJsonRequestOptions extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<PasskeyJsonRequestOptions> CREATOR = new c();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f5566f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f5567g;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public boolean f5568a = false;
            public String b;

            @NonNull
            public PasskeyJsonRequestOptions a() {
                return new PasskeyJsonRequestOptions(this.f5568a, this.b);
            }

            @NonNull
            public a b(@NonNull String str) {
                this.b = str;
                return this;
            }

            @NonNull
            public a c(boolean z10) {
                this.f5568a = z10;
                return this;
            }
        }

        public PasskeyJsonRequestOptions(boolean z10, String str) {
            if (z10) {
                m.l(str);
            }
            this.f5566f = z10;
            this.f5567g = str;
        }

        @NonNull
        public static a v3() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PasskeyJsonRequestOptions)) {
                return false;
            }
            PasskeyJsonRequestOptions passkeyJsonRequestOptions = (PasskeyJsonRequestOptions) obj;
            return this.f5566f == passkeyJsonRequestOptions.f5566f && k.b(this.f5567g, passkeyJsonRequestOptions.f5567g);
        }

        public int hashCode() {
            return k.c(Boolean.valueOf(this.f5566f), this.f5567g);
        }

        @NonNull
        public String w3() {
            return this.f5567g;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            int iA = o9.b.a(parcel);
            o9.b.c(parcel, 1, x3());
            o9.b.v(parcel, 2, w3(), false);
            o9.b.b(parcel, iA);
        }

        public boolean x3() {
            return this.f5566f;
        }
    }

    @Deprecated
    public static final class PasskeysRequestOptions extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<PasskeysRequestOptions> CREATOR = new d();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f5569f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final byte[] f5570g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f5571h;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public boolean f5572a = false;
            public byte[] b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public String f5573c;

            @NonNull
            public PasskeysRequestOptions a() {
                return new PasskeysRequestOptions(this.f5572a, this.b, this.f5573c);
            }

            @NonNull
            public a b(@NonNull byte[] bArr) {
                this.b = bArr;
                return this;
            }

            @NonNull
            public a c(@NonNull String str) {
                this.f5573c = str;
                return this;
            }

            @NonNull
            public a d(boolean z10) {
                this.f5572a = z10;
                return this;
            }
        }

        public PasskeysRequestOptions(boolean z10, byte[] bArr, String str) {
            if (z10) {
                m.l(bArr);
                m.l(str);
            }
            this.f5569f = z10;
            this.f5570g = bArr;
            this.f5571h = str;
        }

        @NonNull
        public static a v3() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PasskeysRequestOptions)) {
                return false;
            }
            PasskeysRequestOptions passkeysRequestOptions = (PasskeysRequestOptions) obj;
            return this.f5569f == passkeysRequestOptions.f5569f && Arrays.equals(this.f5570g, passkeysRequestOptions.f5570g) && Objects.equals(this.f5571h, passkeysRequestOptions.f5571h);
        }

        public int hashCode() {
            return (Objects.hash(Boolean.valueOf(this.f5569f), this.f5571h) * 31) + Arrays.hashCode(this.f5570g);
        }

        @NonNull
        public byte[] w3() {
            return this.f5570g;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            int iA = o9.b.a(parcel);
            o9.b.c(parcel, 1, y3());
            o9.b.g(parcel, 2, w3(), false);
            o9.b.v(parcel, 3, x3(), false);
            o9.b.b(parcel, iA);
        }

        @NonNull
        public String x3() {
            return this.f5571h;
        }

        public boolean y3() {
            return this.f5569f;
        }
    }

    @Deprecated
    public static final class PasswordRequestOptions extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<PasswordRequestOptions> CREATOR = new e();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f5574f;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public boolean f5575a = false;

            @NonNull
            public PasswordRequestOptions a() {
                return new PasswordRequestOptions(this.f5575a);
            }

            @NonNull
            public a b(boolean z10) {
                this.f5575a = z10;
                return this;
            }
        }

        public PasswordRequestOptions(boolean z10) {
            this.f5574f = z10;
        }

        @NonNull
        public static a v3() {
            return new a();
        }

        public boolean equals(Object obj) {
            return (obj instanceof PasswordRequestOptions) && this.f5574f == ((PasswordRequestOptions) obj).f5574f;
        }

        public int hashCode() {
            return k.c(Boolean.valueOf(this.f5574f));
        }

        public boolean w3() {
            return this.f5574f;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            int iA = o9.b.a(parcel);
            o9.b.c(parcel, 1, w3());
            o9.b.b(parcel, iA);
        }
    }

    @Deprecated
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public PasswordRequestOptions f5576a;
        public GoogleIdTokenRequestOptions b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public PasskeysRequestOptions f5577c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public PasskeyJsonRequestOptions f5578d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f5579e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f5580f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f5581g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f5582h;

        public a() {
            PasswordRequestOptions.a aVarV3 = PasswordRequestOptions.v3();
            aVarV3.b(false);
            this.f5576a = aVarV3.a();
            GoogleIdTokenRequestOptions.a aVarV4 = GoogleIdTokenRequestOptions.v3();
            aVarV4.g(false);
            this.b = aVarV4.b();
            PasskeysRequestOptions.a aVarV5 = PasskeysRequestOptions.v3();
            aVarV5.d(false);
            this.f5577c = aVarV5.a();
            PasskeyJsonRequestOptions.a aVarV6 = PasskeyJsonRequestOptions.v3();
            aVarV6.c(false);
            this.f5578d = aVarV6.a();
        }

        @NonNull
        public BeginSignInRequest a() {
            return new BeginSignInRequest(this.f5576a, this.b, this.f5579e, this.f5580f, this.f5581g, this.f5577c, this.f5578d, this.f5582h);
        }

        @NonNull
        public a b(boolean z10) {
            this.f5580f = z10;
            return this;
        }

        @NonNull
        public a c(@NonNull GoogleIdTokenRequestOptions googleIdTokenRequestOptions) {
            this.b = (GoogleIdTokenRequestOptions) m.l(googleIdTokenRequestOptions);
            return this;
        }

        @NonNull
        public a d(@NonNull PasskeyJsonRequestOptions passkeyJsonRequestOptions) {
            this.f5578d = (PasskeyJsonRequestOptions) m.l(passkeyJsonRequestOptions);
            return this;
        }

        @NonNull
        @Deprecated
        public a e(@NonNull PasskeysRequestOptions passkeysRequestOptions) {
            this.f5577c = (PasskeysRequestOptions) m.l(passkeysRequestOptions);
            return this;
        }

        @NonNull
        public a f(@NonNull PasswordRequestOptions passwordRequestOptions) {
            this.f5576a = (PasswordRequestOptions) m.l(passwordRequestOptions);
            return this;
        }

        @NonNull
        public a g(boolean z10) {
            this.f5582h = z10;
            return this;
        }

        @NonNull
        public final a h(@NonNull String str) {
            this.f5579e = str;
            return this;
        }

        @NonNull
        public final a i(int i10) {
            this.f5581g = i10;
            return this;
        }
    }

    public BeginSignInRequest(PasswordRequestOptions passwordRequestOptions, GoogleIdTokenRequestOptions googleIdTokenRequestOptions, String str, boolean z10, int i10, PasskeysRequestOptions passkeysRequestOptions, PasskeyJsonRequestOptions passkeyJsonRequestOptions, boolean z11) {
        this.f5545f = (PasswordRequestOptions) m.l(passwordRequestOptions);
        this.f5546g = (GoogleIdTokenRequestOptions) m.l(googleIdTokenRequestOptions);
        this.f5547h = str;
        this.f5548i = z10;
        this.f5549j = i10;
        if (passkeysRequestOptions == null) {
            PasskeysRequestOptions.a aVarV3 = PasskeysRequestOptions.v3();
            aVarV3.d(false);
            passkeysRequestOptions = aVarV3.a();
        }
        this.f5550k = passkeysRequestOptions;
        if (passkeyJsonRequestOptions == null) {
            PasskeyJsonRequestOptions.a aVarV4 = PasskeyJsonRequestOptions.v3();
            aVarV4.c(false);
            passkeyJsonRequestOptions = aVarV4.a();
        }
        this.f5551l = passkeyJsonRequestOptions;
        this.f5552m = z11;
    }

    @NonNull
    public static a C3(@NonNull BeginSignInRequest beginSignInRequest) {
        m.l(beginSignInRequest);
        a aVarV3 = v3();
        aVarV3.c(beginSignInRequest.w3());
        aVarV3.f(beginSignInRequest.z3());
        aVarV3.e(beginSignInRequest.y3());
        aVarV3.d(beginSignInRequest.x3());
        aVarV3.b(beginSignInRequest.f5548i);
        aVarV3.i(beginSignInRequest.f5549j);
        aVarV3.g(beginSignInRequest.f5552m);
        String str = beginSignInRequest.f5547h;
        if (str != null) {
            aVarV3.h(str);
        }
        return aVarV3;
    }

    @NonNull
    public static a v3() {
        return new a();
    }

    public boolean A3() {
        return this.f5552m;
    }

    public boolean B3() {
        return this.f5548i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BeginSignInRequest)) {
            return false;
        }
        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) obj;
        return k.b(this.f5545f, beginSignInRequest.f5545f) && k.b(this.f5546g, beginSignInRequest.f5546g) && k.b(this.f5550k, beginSignInRequest.f5550k) && k.b(this.f5551l, beginSignInRequest.f5551l) && k.b(this.f5547h, beginSignInRequest.f5547h) && this.f5548i == beginSignInRequest.f5548i && this.f5549j == beginSignInRequest.f5549j && this.f5552m == beginSignInRequest.f5552m;
    }

    public int hashCode() {
        return k.c(this.f5545f, this.f5546g, this.f5550k, this.f5551l, this.f5547h, Boolean.valueOf(this.f5548i), Integer.valueOf(this.f5549j), Boolean.valueOf(this.f5552m));
    }

    @NonNull
    public GoogleIdTokenRequestOptions w3() {
        return this.f5546g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = o9.b.a(parcel);
        o9.b.t(parcel, 1, z3(), i10, false);
        o9.b.t(parcel, 2, w3(), i10, false);
        o9.b.v(parcel, 3, this.f5547h, false);
        o9.b.c(parcel, 4, B3());
        o9.b.n(parcel, 5, this.f5549j);
        o9.b.t(parcel, 6, y3(), i10, false);
        o9.b.t(parcel, 7, x3(), i10, false);
        o9.b.c(parcel, 8, A3());
        o9.b.b(parcel, iA);
    }

    @NonNull
    public PasskeyJsonRequestOptions x3() {
        return this.f5551l;
    }

    @NonNull
    public PasskeysRequestOptions y3() {
        return this.f5550k;
    }

    @NonNull
    public PasswordRequestOptions z3() {
        return this.f5545f;
    }
}
