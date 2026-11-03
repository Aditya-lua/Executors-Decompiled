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
    public final PasswordRequestOptions f5618f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final GoogleIdTokenRequestOptions f5619g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f5620h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f5621i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f5622j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final PasskeysRequestOptions f5623k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final PasskeyJsonRequestOptions f5624l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f5625m;

    @Deprecated
    public static final class GoogleIdTokenRequestOptions extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<GoogleIdTokenRequestOptions> CREATOR = new b();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f5626f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f5627g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f5628h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f5629i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final String f5630j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final List f5631k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f5632l;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public boolean f5633a = false;
            public String b = null;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public String f5634c = null;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public boolean f5635d = true;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public String f5636e = null;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public List f5637f = null;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public boolean f5638g = false;

            @NonNull
            public a a(@NonNull String str, List<String> list) {
                this.f5636e = (String) m.m(str, "linkedServiceId must be provided if you want to associate linked accounts.");
                this.f5637f = list;
                return this;
            }

            @NonNull
            public GoogleIdTokenRequestOptions b() {
                return new GoogleIdTokenRequestOptions(this.f5633a, this.b, this.f5634c, this.f5635d, this.f5636e, this.f5637f, this.f5638g);
            }

            @NonNull
            public a c(boolean z10) {
                this.f5635d = z10;
                return this;
            }

            @NonNull
            public a d(String str) {
                this.f5634c = str;
                return this;
            }

            @NonNull
            @Deprecated
            public a e(boolean z10) {
                this.f5638g = z10;
                return this;
            }

            @NonNull
            public a f(@NonNull String str) {
                this.b = m.f(str);
                return this;
            }

            @NonNull
            public a g(boolean z10) {
                this.f5633a = z10;
                return this;
            }
        }

        public GoogleIdTokenRequestOptions(boolean z10, String str, String str2, boolean z11, String str3, List list, boolean z12) {
            boolean z13 = true;
            if (z11 && z12) {
                z13 = false;
            }
            m.b(z13, "filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.");
            this.f5626f = z10;
            if (z10) {
                m.m(str, "serverClientId must be provided if Google ID tokens are requested");
            }
            this.f5627g = str;
            this.f5628h = str2;
            this.f5629i = z11;
            Parcelable.Creator<BeginSignInRequest> creator = BeginSignInRequest.CREATOR;
            ArrayList arrayList = null;
            if (list != null && !list.isEmpty()) {
                arrayList = new ArrayList(list);
                Collections.sort(arrayList);
            }
            this.f5631k = arrayList;
            this.f5630j = str3;
            this.f5632l = z12;
        }

        @NonNull
        public static a v3() {
            return new a();
        }

        public String A3() {
            return this.f5627g;
        }

        public boolean B3() {
            return this.f5626f;
        }

        @Deprecated
        public boolean C3() {
            return this.f5632l;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof GoogleIdTokenRequestOptions)) {
                return false;
            }
            GoogleIdTokenRequestOptions googleIdTokenRequestOptions = (GoogleIdTokenRequestOptions) obj;
            return this.f5626f == googleIdTokenRequestOptions.f5626f && k.b(this.f5627g, googleIdTokenRequestOptions.f5627g) && k.b(this.f5628h, googleIdTokenRequestOptions.f5628h) && this.f5629i == googleIdTokenRequestOptions.f5629i && k.b(this.f5630j, googleIdTokenRequestOptions.f5630j) && k.b(this.f5631k, googleIdTokenRequestOptions.f5631k) && this.f5632l == googleIdTokenRequestOptions.f5632l;
        }

        public int hashCode() {
            return k.c(Boolean.valueOf(this.f5626f), this.f5627g, this.f5628h, Boolean.valueOf(this.f5629i), this.f5630j, this.f5631k, Boolean.valueOf(this.f5632l));
        }

        public boolean w3() {
            return this.f5629i;
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
            return this.f5631k;
        }

        public String y3() {
            return this.f5630j;
        }

        public String z3() {
            return this.f5628h;
        }
    }

    @Deprecated
    public static final class PasskeyJsonRequestOptions extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<PasskeyJsonRequestOptions> CREATOR = new c();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f5639f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f5640g;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public boolean f5641a = false;
            public String b;

            @NonNull
            public PasskeyJsonRequestOptions a() {
                return new PasskeyJsonRequestOptions(this.f5641a, this.b);
            }

            @NonNull
            public a b(@NonNull String str) {
                this.b = str;
                return this;
            }

            @NonNull
            public a c(boolean z10) {
                this.f5641a = z10;
                return this;
            }
        }

        public PasskeyJsonRequestOptions(boolean z10, String str) {
            if (z10) {
                m.l(str);
            }
            this.f5639f = z10;
            this.f5640g = str;
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
            return this.f5639f == passkeyJsonRequestOptions.f5639f && k.b(this.f5640g, passkeyJsonRequestOptions.f5640g);
        }

        public int hashCode() {
            return k.c(Boolean.valueOf(this.f5639f), this.f5640g);
        }

        @NonNull
        public String w3() {
            return this.f5640g;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            int iA = o9.b.a(parcel);
            o9.b.c(parcel, 1, x3());
            o9.b.v(parcel, 2, w3(), false);
            o9.b.b(parcel, iA);
        }

        public boolean x3() {
            return this.f5639f;
        }
    }

    @Deprecated
    public static final class PasskeysRequestOptions extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<PasskeysRequestOptions> CREATOR = new d();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f5642f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final byte[] f5643g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f5644h;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public boolean f5645a = false;
            public byte[] b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public String f5646c;

            @NonNull
            public PasskeysRequestOptions a() {
                return new PasskeysRequestOptions(this.f5645a, this.b, this.f5646c);
            }

            @NonNull
            public a b(@NonNull byte[] bArr) {
                this.b = bArr;
                return this;
            }

            @NonNull
            public a c(@NonNull String str) {
                this.f5646c = str;
                return this;
            }

            @NonNull
            public a d(boolean z10) {
                this.f5645a = z10;
                return this;
            }
        }

        public PasskeysRequestOptions(boolean z10, byte[] bArr, String str) {
            if (z10) {
                m.l(bArr);
                m.l(str);
            }
            this.f5642f = z10;
            this.f5643g = bArr;
            this.f5644h = str;
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
            return this.f5642f == passkeysRequestOptions.f5642f && Arrays.equals(this.f5643g, passkeysRequestOptions.f5643g) && Objects.equals(this.f5644h, passkeysRequestOptions.f5644h);
        }

        public int hashCode() {
            return (Objects.hash(Boolean.valueOf(this.f5642f), this.f5644h) * 31) + Arrays.hashCode(this.f5643g);
        }

        @NonNull
        public byte[] w3() {
            return this.f5643g;
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
            return this.f5644h;
        }

        public boolean y3() {
            return this.f5642f;
        }
    }

    @Deprecated
    public static final class PasswordRequestOptions extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<PasswordRequestOptions> CREATOR = new e();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f5647f;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public boolean f5648a = false;

            @NonNull
            public PasswordRequestOptions a() {
                return new PasswordRequestOptions(this.f5648a);
            }

            @NonNull
            public a b(boolean z10) {
                this.f5648a = z10;
                return this;
            }
        }

        public PasswordRequestOptions(boolean z10) {
            this.f5647f = z10;
        }

        @NonNull
        public static a v3() {
            return new a();
        }

        public boolean equals(Object obj) {
            return (obj instanceof PasswordRequestOptions) && this.f5647f == ((PasswordRequestOptions) obj).f5647f;
        }

        public int hashCode() {
            return k.c(Boolean.valueOf(this.f5647f));
        }

        public boolean w3() {
            return this.f5647f;
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
        public PasswordRequestOptions f5649a;
        public GoogleIdTokenRequestOptions b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public PasskeysRequestOptions f5650c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public PasskeyJsonRequestOptions f5651d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f5652e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f5653f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f5654g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f5655h;

        public a() {
            PasswordRequestOptions.a aVarV3 = PasswordRequestOptions.v3();
            aVarV3.b(false);
            this.f5649a = aVarV3.a();
            GoogleIdTokenRequestOptions.a aVarV4 = GoogleIdTokenRequestOptions.v3();
            aVarV4.g(false);
            this.b = aVarV4.b();
            PasskeysRequestOptions.a aVarV5 = PasskeysRequestOptions.v3();
            aVarV5.d(false);
            this.f5650c = aVarV5.a();
            PasskeyJsonRequestOptions.a aVarV6 = PasskeyJsonRequestOptions.v3();
            aVarV6.c(false);
            this.f5651d = aVarV6.a();
        }

        @NonNull
        public BeginSignInRequest a() {
            return new BeginSignInRequest(this.f5649a, this.b, this.f5652e, this.f5653f, this.f5654g, this.f5650c, this.f5651d, this.f5655h);
        }

        @NonNull
        public a b(boolean z10) {
            this.f5653f = z10;
            return this;
        }

        @NonNull
        public a c(@NonNull GoogleIdTokenRequestOptions googleIdTokenRequestOptions) {
            this.b = (GoogleIdTokenRequestOptions) m.l(googleIdTokenRequestOptions);
            return this;
        }

        @NonNull
        public a d(@NonNull PasskeyJsonRequestOptions passkeyJsonRequestOptions) {
            this.f5651d = (PasskeyJsonRequestOptions) m.l(passkeyJsonRequestOptions);
            return this;
        }

        @NonNull
        @Deprecated
        public a e(@NonNull PasskeysRequestOptions passkeysRequestOptions) {
            this.f5650c = (PasskeysRequestOptions) m.l(passkeysRequestOptions);
            return this;
        }

        @NonNull
        public a f(@NonNull PasswordRequestOptions passwordRequestOptions) {
            this.f5649a = (PasswordRequestOptions) m.l(passwordRequestOptions);
            return this;
        }

        @NonNull
        public a g(boolean z10) {
            this.f5655h = z10;
            return this;
        }

        @NonNull
        public final a h(@NonNull String str) {
            this.f5652e = str;
            return this;
        }

        @NonNull
        public final a i(int i10) {
            this.f5654g = i10;
            return this;
        }
    }

    public BeginSignInRequest(PasswordRequestOptions passwordRequestOptions, GoogleIdTokenRequestOptions googleIdTokenRequestOptions, String str, boolean z10, int i10, PasskeysRequestOptions passkeysRequestOptions, PasskeyJsonRequestOptions passkeyJsonRequestOptions, boolean z11) {
        this.f5618f = (PasswordRequestOptions) m.l(passwordRequestOptions);
        this.f5619g = (GoogleIdTokenRequestOptions) m.l(googleIdTokenRequestOptions);
        this.f5620h = str;
        this.f5621i = z10;
        this.f5622j = i10;
        if (passkeysRequestOptions == null) {
            PasskeysRequestOptions.a aVarV3 = PasskeysRequestOptions.v3();
            aVarV3.d(false);
            passkeysRequestOptions = aVarV3.a();
        }
        this.f5623k = passkeysRequestOptions;
        if (passkeyJsonRequestOptions == null) {
            PasskeyJsonRequestOptions.a aVarV4 = PasskeyJsonRequestOptions.v3();
            aVarV4.c(false);
            passkeyJsonRequestOptions = aVarV4.a();
        }
        this.f5624l = passkeyJsonRequestOptions;
        this.f5625m = z11;
    }

    @NonNull
    public static a C3(@NonNull BeginSignInRequest beginSignInRequest) {
        m.l(beginSignInRequest);
        a aVarV3 = v3();
        aVarV3.c(beginSignInRequest.w3());
        aVarV3.f(beginSignInRequest.z3());
        aVarV3.e(beginSignInRequest.y3());
        aVarV3.d(beginSignInRequest.x3());
        aVarV3.b(beginSignInRequest.f5621i);
        aVarV3.i(beginSignInRequest.f5622j);
        aVarV3.g(beginSignInRequest.f5625m);
        String str = beginSignInRequest.f5620h;
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
        return this.f5625m;
    }

    public boolean B3() {
        return this.f5621i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BeginSignInRequest)) {
            return false;
        }
        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) obj;
        return k.b(this.f5618f, beginSignInRequest.f5618f) && k.b(this.f5619g, beginSignInRequest.f5619g) && k.b(this.f5623k, beginSignInRequest.f5623k) && k.b(this.f5624l, beginSignInRequest.f5624l) && k.b(this.f5620h, beginSignInRequest.f5620h) && this.f5621i == beginSignInRequest.f5621i && this.f5622j == beginSignInRequest.f5622j && this.f5625m == beginSignInRequest.f5625m;
    }

    public int hashCode() {
        return k.c(this.f5618f, this.f5619g, this.f5623k, this.f5624l, this.f5620h, Boolean.valueOf(this.f5621i), Integer.valueOf(this.f5622j), Boolean.valueOf(this.f5625m));
    }

    @NonNull
    public GoogleIdTokenRequestOptions w3() {
        return this.f5619g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = o9.b.a(parcel);
        o9.b.t(parcel, 1, z3(), i10, false);
        o9.b.t(parcel, 2, w3(), i10, false);
        o9.b.v(parcel, 3, this.f5620h, false);
        o9.b.c(parcel, 4, B3());
        o9.b.n(parcel, 5, this.f5622j);
        o9.b.t(parcel, 6, y3(), i10, false);
        o9.b.t(parcel, 7, x3(), i10, false);
        o9.b.c(parcel, 8, A3());
        o9.b.b(parcel, iA);
    }

    @NonNull
    public PasskeyJsonRequestOptions x3() {
        return this.f5624l;
    }

    @NonNull
    public PasskeysRequestOptions y3() {
        return this.f5623k;
    }

    @NonNull
    public PasswordRequestOptions z3() {
        return this.f5618f;
    }
}
