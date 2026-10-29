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
import p305n9.C8947k;
import p305n9.C8953m;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class BeginSignInRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<BeginSignInRequest> CREATOR = new C1880a();

    /* JADX INFO: renamed from: f */
    public final PasswordRequestOptions f7214f;

    /* JADX INFO: renamed from: g */
    public final GoogleIdTokenRequestOptions f7215g;

    /* JADX INFO: renamed from: h */
    public final String f7216h;

    /* JADX INFO: renamed from: i */
    public final boolean f7217i;

    /* JADX INFO: renamed from: j */
    public final int f7218j;

    /* JADX INFO: renamed from: k */
    public final PasskeysRequestOptions f7219k;

    /* JADX INFO: renamed from: l */
    public final PasskeyJsonRequestOptions f7220l;

    /* JADX INFO: renamed from: m */
    public final boolean f7221m;

    @Deprecated
    public static final class GoogleIdTokenRequestOptions extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<GoogleIdTokenRequestOptions> CREATOR = new C1881b();

        /* JADX INFO: renamed from: f */
        public final boolean f7222f;

        /* JADX INFO: renamed from: g */
        public final String f7223g;

        /* JADX INFO: renamed from: h */
        public final String f7224h;

        /* JADX INFO: renamed from: i */
        public final boolean f7225i;

        /* JADX INFO: renamed from: j */
        public final String f7226j;

        /* JADX INFO: renamed from: k */
        public final List f7227k;

        /* JADX INFO: renamed from: l */
        public final boolean f7228l;

        /* JADX INFO: renamed from: com.google.android.gms.auth.api.identity.BeginSignInRequest$GoogleIdTokenRequestOptions$a */
        public static final class C1872a {

            /* JADX INFO: renamed from: a */
            public boolean f7229a = false;

            /* JADX INFO: renamed from: b */
            public String f7230b = null;

            /* JADX INFO: renamed from: c */
            public String f7231c = null;

            /* JADX INFO: renamed from: d */
            public boolean f7232d = true;

            /* JADX INFO: renamed from: e */
            public String f7233e = null;

            /* JADX INFO: renamed from: f */
            public List f7234f = null;

            /* JADX INFO: renamed from: g */
            public boolean f7235g = false;

            @NonNull
            /* JADX INFO: renamed from: a */
            public C1872a m8994a(@NonNull String str, List<String> list) {
                this.f7233e = (String) C8953m.m36048m(str, "linkedServiceId must be provided if you want to associate linked accounts.");
                this.f7234f = list;
                return this;
            }

            @NonNull
            /* JADX INFO: renamed from: b */
            public GoogleIdTokenRequestOptions m8995b() {
                return new GoogleIdTokenRequestOptions(this.f7229a, this.f7230b, this.f7231c, this.f7232d, this.f7233e, this.f7234f, this.f7235g);
            }

            @NonNull
            /* JADX INFO: renamed from: c */
            public C1872a m8996c(boolean z10) {
                this.f7232d = z10;
                return this;
            }

            @NonNull
            /* JADX INFO: renamed from: d */
            public C1872a m8997d(String str) {
                this.f7231c = str;
                return this;
            }

            @NonNull
            @Deprecated
            /* JADX INFO: renamed from: e */
            public C1872a m8998e(boolean z10) {
                this.f7235g = z10;
                return this;
            }

            @NonNull
            /* JADX INFO: renamed from: f */
            public C1872a m8999f(@NonNull String str) {
                this.f7230b = C8953m.m36041f(str);
                return this;
            }

            @NonNull
            /* JADX INFO: renamed from: g */
            public C1872a m9000g(boolean z10) {
                this.f7229a = z10;
                return this;
            }
        }

        public GoogleIdTokenRequestOptions(boolean z10, String str, String str2, boolean z11, String str3, List list, boolean z12) {
            boolean z13 = true;
            if (z11 && z12) {
                z13 = false;
            }
            C8953m.m36037b(z13, "filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.");
            this.f7222f = z10;
            if (z10) {
                C8953m.m36048m(str, "serverClientId must be provided if Google ID tokens are requested");
            }
            this.f7223g = str;
            this.f7224h = str2;
            this.f7225i = z11;
            Parcelable.Creator<BeginSignInRequest> creator = BeginSignInRequest.CREATOR;
            ArrayList arrayList = null;
            if (list != null && !list.isEmpty()) {
                arrayList = new ArrayList(list);
                Collections.sort(arrayList);
            }
            this.f7227k = arrayList;
            this.f7226j = str3;
            this.f7228l = z12;
        }

        @NonNull
        /* JADX INFO: renamed from: v3 */
        public static C1872a m8986v3() {
            return new C1872a();
        }

        /* JADX INFO: renamed from: A3 */
        public String m8987A3() {
            return this.f7223g;
        }

        /* JADX INFO: renamed from: B3 */
        public boolean m8988B3() {
            return this.f7222f;
        }

        @Deprecated
        /* JADX INFO: renamed from: C3 */
        public boolean m8989C3() {
            return this.f7228l;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof GoogleIdTokenRequestOptions)) {
                return false;
            }
            GoogleIdTokenRequestOptions googleIdTokenRequestOptions = (GoogleIdTokenRequestOptions) obj;
            return this.f7222f == googleIdTokenRequestOptions.f7222f && C8947k.m36026b(this.f7223g, googleIdTokenRequestOptions.f7223g) && C8947k.m36026b(this.f7224h, googleIdTokenRequestOptions.f7224h) && this.f7225i == googleIdTokenRequestOptions.f7225i && C8947k.m36026b(this.f7226j, googleIdTokenRequestOptions.f7226j) && C8947k.m36026b(this.f7227k, googleIdTokenRequestOptions.f7227k) && this.f7228l == googleIdTokenRequestOptions.f7228l;
        }

        public int hashCode() {
            return C8947k.m36027c(Boolean.valueOf(this.f7222f), this.f7223g, this.f7224h, Boolean.valueOf(this.f7225i), this.f7226j, this.f7227k, Boolean.valueOf(this.f7228l));
        }

        /* JADX INFO: renamed from: w3 */
        public boolean m8990w3() {
            return this.f7225i;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            int iM38457a = C9718b.m38457a(parcel);
            C9718b.m38459c(parcel, 1, m8988B3());
            C9718b.m38478v(parcel, 2, m8987A3(), false);
            C9718b.m38478v(parcel, 3, m8993z3(), false);
            C9718b.m38459c(parcel, 4, m8990w3());
            C9718b.m38478v(parcel, 5, m8992y3(), false);
            C9718b.m38480x(parcel, 6, m8991x3(), false);
            C9718b.m38459c(parcel, 7, m8989C3());
            C9718b.m38458b(parcel, iM38457a);
        }

        /* JADX INFO: renamed from: x3 */
        public List<String> m8991x3() {
            return this.f7227k;
        }

        /* JADX INFO: renamed from: y3 */
        public String m8992y3() {
            return this.f7226j;
        }

        /* JADX INFO: renamed from: z3 */
        public String m8993z3() {
            return this.f7224h;
        }
    }

    @Deprecated
    public static final class PasskeyJsonRequestOptions extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<PasskeyJsonRequestOptions> CREATOR = new C1882c();

        /* JADX INFO: renamed from: f */
        public final boolean f7236f;

        /* JADX INFO: renamed from: g */
        public final String f7237g;

        /* JADX INFO: renamed from: com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeyJsonRequestOptions$a */
        public static final class C1873a {

            /* JADX INFO: renamed from: a */
            public boolean f7238a = false;

            /* JADX INFO: renamed from: b */
            public String f7239b;

            @NonNull
            /* JADX INFO: renamed from: a */
            public PasskeyJsonRequestOptions m9004a() {
                return new PasskeyJsonRequestOptions(this.f7238a, this.f7239b);
            }

            @NonNull
            /* JADX INFO: renamed from: b */
            public C1873a m9005b(@NonNull String str) {
                this.f7239b = str;
                return this;
            }

            @NonNull
            /* JADX INFO: renamed from: c */
            public C1873a m9006c(boolean z10) {
                this.f7238a = z10;
                return this;
            }
        }

        public PasskeyJsonRequestOptions(boolean z10, String str) {
            if (z10) {
                C8953m.m36047l(str);
            }
            this.f7236f = z10;
            this.f7237g = str;
        }

        @NonNull
        /* JADX INFO: renamed from: v3 */
        public static C1873a m9001v3() {
            return new C1873a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PasskeyJsonRequestOptions)) {
                return false;
            }
            PasskeyJsonRequestOptions passkeyJsonRequestOptions = (PasskeyJsonRequestOptions) obj;
            return this.f7236f == passkeyJsonRequestOptions.f7236f && C8947k.m36026b(this.f7237g, passkeyJsonRequestOptions.f7237g);
        }

        public int hashCode() {
            return C8947k.m36027c(Boolean.valueOf(this.f7236f), this.f7237g);
        }

        @NonNull
        /* JADX INFO: renamed from: w3 */
        public String m9002w3() {
            return this.f7237g;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            int iM38457a = C9718b.m38457a(parcel);
            C9718b.m38459c(parcel, 1, m9003x3());
            C9718b.m38478v(parcel, 2, m9002w3(), false);
            C9718b.m38458b(parcel, iM38457a);
        }

        /* JADX INFO: renamed from: x3 */
        public boolean m9003x3() {
            return this.f7236f;
        }
    }

    @Deprecated
    public static final class PasskeysRequestOptions extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<PasskeysRequestOptions> CREATOR = new C1883d();

        /* JADX INFO: renamed from: f */
        public final boolean f7240f;

        /* JADX INFO: renamed from: g */
        public final byte[] f7241g;

        /* JADX INFO: renamed from: h */
        public final String f7242h;

        /* JADX INFO: renamed from: com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeysRequestOptions$a */
        public static final class C1874a {

            /* JADX INFO: renamed from: a */
            public boolean f7243a = false;

            /* JADX INFO: renamed from: b */
            public byte[] f7244b;

            /* JADX INFO: renamed from: c */
            public String f7245c;

            @NonNull
            /* JADX INFO: renamed from: a */
            public PasskeysRequestOptions m9011a() {
                return new PasskeysRequestOptions(this.f7243a, this.f7244b, this.f7245c);
            }

            @NonNull
            /* JADX INFO: renamed from: b */
            public C1874a m9012b(@NonNull byte[] bArr) {
                this.f7244b = bArr;
                return this;
            }

            @NonNull
            /* JADX INFO: renamed from: c */
            public C1874a m9013c(@NonNull String str) {
                this.f7245c = str;
                return this;
            }

            @NonNull
            /* JADX INFO: renamed from: d */
            public C1874a m9014d(boolean z10) {
                this.f7243a = z10;
                return this;
            }
        }

        public PasskeysRequestOptions(boolean z10, byte[] bArr, String str) {
            if (z10) {
                C8953m.m36047l(bArr);
                C8953m.m36047l(str);
            }
            this.f7240f = z10;
            this.f7241g = bArr;
            this.f7242h = str;
        }

        @NonNull
        /* JADX INFO: renamed from: v3 */
        public static C1874a m9007v3() {
            return new C1874a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PasskeysRequestOptions)) {
                return false;
            }
            PasskeysRequestOptions passkeysRequestOptions = (PasskeysRequestOptions) obj;
            return this.f7240f == passkeysRequestOptions.f7240f && Arrays.equals(this.f7241g, passkeysRequestOptions.f7241g) && Objects.equals(this.f7242h, passkeysRequestOptions.f7242h);
        }

        public int hashCode() {
            return (Objects.hash(Boolean.valueOf(this.f7240f), this.f7242h) * 31) + Arrays.hashCode(this.f7241g);
        }

        @NonNull
        /* JADX INFO: renamed from: w3 */
        public byte[] m9008w3() {
            return this.f7241g;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            int iM38457a = C9718b.m38457a(parcel);
            C9718b.m38459c(parcel, 1, m9010y3());
            C9718b.m38463g(parcel, 2, m9008w3(), false);
            C9718b.m38478v(parcel, 3, m9009x3(), false);
            C9718b.m38458b(parcel, iM38457a);
        }

        @NonNull
        /* JADX INFO: renamed from: x3 */
        public String m9009x3() {
            return this.f7242h;
        }

        /* JADX INFO: renamed from: y3 */
        public boolean m9010y3() {
            return this.f7240f;
        }
    }

    @Deprecated
    public static final class PasswordRequestOptions extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<PasswordRequestOptions> CREATOR = new C1884e();

        /* JADX INFO: renamed from: f */
        public final boolean f7246f;

        /* JADX INFO: renamed from: com.google.android.gms.auth.api.identity.BeginSignInRequest$PasswordRequestOptions$a */
        public static final class C1875a {

            /* JADX INFO: renamed from: a */
            public boolean f7247a = false;

            @NonNull
            /* JADX INFO: renamed from: a */
            public PasswordRequestOptions m9017a() {
                return new PasswordRequestOptions(this.f7247a);
            }

            @NonNull
            /* JADX INFO: renamed from: b */
            public C1875a m9018b(boolean z10) {
                this.f7247a = z10;
                return this;
            }
        }

        public PasswordRequestOptions(boolean z10) {
            this.f7246f = z10;
        }

        @NonNull
        /* JADX INFO: renamed from: v3 */
        public static C1875a m9015v3() {
            return new C1875a();
        }

        public boolean equals(Object obj) {
            return (obj instanceof PasswordRequestOptions) && this.f7246f == ((PasswordRequestOptions) obj).f7246f;
        }

        public int hashCode() {
            return C8947k.m36027c(Boolean.valueOf(this.f7246f));
        }

        /* JADX INFO: renamed from: w3 */
        public boolean m9016w3() {
            return this.f7246f;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            int iM38457a = C9718b.m38457a(parcel);
            C9718b.m38459c(parcel, 1, m9016w3());
            C9718b.m38458b(parcel, iM38457a);
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.auth.api.identity.BeginSignInRequest$a */
    @Deprecated
    public static final class C1876a {

        /* JADX INFO: renamed from: a */
        public PasswordRequestOptions f7248a;

        /* JADX INFO: renamed from: b */
        public GoogleIdTokenRequestOptions f7249b;

        /* JADX INFO: renamed from: c */
        public PasskeysRequestOptions f7250c;

        /* JADX INFO: renamed from: d */
        public PasskeyJsonRequestOptions f7251d;

        /* JADX INFO: renamed from: e */
        public String f7252e;

        /* JADX INFO: renamed from: f */
        public boolean f7253f;

        /* JADX INFO: renamed from: g */
        public int f7254g;

        /* JADX INFO: renamed from: h */
        public boolean f7255h;

        public C1876a() {
            PasswordRequestOptions.C1875a c1875aM9015v3 = PasswordRequestOptions.m9015v3();
            c1875aM9015v3.m9018b(false);
            this.f7248a = c1875aM9015v3.m9017a();
            GoogleIdTokenRequestOptions.C1872a c1872aM8986v3 = GoogleIdTokenRequestOptions.m8986v3();
            c1872aM8986v3.m9000g(false);
            this.f7249b = c1872aM8986v3.m8995b();
            PasskeysRequestOptions.C1874a c1874aM9007v3 = PasskeysRequestOptions.m9007v3();
            c1874aM9007v3.m9014d(false);
            this.f7250c = c1874aM9007v3.m9011a();
            PasskeyJsonRequestOptions.C1873a c1873aM9001v3 = PasskeyJsonRequestOptions.m9001v3();
            c1873aM9001v3.m9006c(false);
            this.f7251d = c1873aM9001v3.m9004a();
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public BeginSignInRequest m9019a() {
            return new BeginSignInRequest(this.f7248a, this.f7249b, this.f7252e, this.f7253f, this.f7254g, this.f7250c, this.f7251d, this.f7255h);
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public C1876a m9020b(boolean z10) {
            this.f7253f = z10;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: c */
        public C1876a m9021c(@NonNull GoogleIdTokenRequestOptions googleIdTokenRequestOptions) {
            this.f7249b = (GoogleIdTokenRequestOptions) C8953m.m36047l(googleIdTokenRequestOptions);
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: d */
        public C1876a m9022d(@NonNull PasskeyJsonRequestOptions passkeyJsonRequestOptions) {
            this.f7251d = (PasskeyJsonRequestOptions) C8953m.m36047l(passkeyJsonRequestOptions);
            return this;
        }

        @NonNull
        @Deprecated
        /* JADX INFO: renamed from: e */
        public C1876a m9023e(@NonNull PasskeysRequestOptions passkeysRequestOptions) {
            this.f7250c = (PasskeysRequestOptions) C8953m.m36047l(passkeysRequestOptions);
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: f */
        public C1876a m9024f(@NonNull PasswordRequestOptions passwordRequestOptions) {
            this.f7248a = (PasswordRequestOptions) C8953m.m36047l(passwordRequestOptions);
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: g */
        public C1876a m9025g(boolean z10) {
            this.f7255h = z10;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: h */
        public final C1876a m9026h(@NonNull String str) {
            this.f7252e = str;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: i */
        public final C1876a m9027i(int i10) {
            this.f7254g = i10;
            return this;
        }
    }

    public BeginSignInRequest(PasswordRequestOptions passwordRequestOptions, GoogleIdTokenRequestOptions googleIdTokenRequestOptions, String str, boolean z10, int i10, PasskeysRequestOptions passkeysRequestOptions, PasskeyJsonRequestOptions passkeyJsonRequestOptions, boolean z11) {
        this.f7214f = (PasswordRequestOptions) C8953m.m36047l(passwordRequestOptions);
        this.f7215g = (GoogleIdTokenRequestOptions) C8953m.m36047l(googleIdTokenRequestOptions);
        this.f7216h = str;
        this.f7217i = z10;
        this.f7218j = i10;
        if (passkeysRequestOptions == null) {
            PasskeysRequestOptions.C1874a c1874aM9007v3 = PasskeysRequestOptions.m9007v3();
            c1874aM9007v3.m9014d(false);
            passkeysRequestOptions = c1874aM9007v3.m9011a();
        }
        this.f7219k = passkeysRequestOptions;
        if (passkeyJsonRequestOptions == null) {
            PasskeyJsonRequestOptions.C1873a c1873aM9001v3 = PasskeyJsonRequestOptions.m9001v3();
            c1873aM9001v3.m9006c(false);
            passkeyJsonRequestOptions = c1873aM9001v3.m9004a();
        }
        this.f7220l = passkeyJsonRequestOptions;
        this.f7221m = z11;
    }

    @NonNull
    /* JADX INFO: renamed from: C3 */
    public static C1876a m8978C3(@NonNull BeginSignInRequest beginSignInRequest) {
        C8953m.m36047l(beginSignInRequest);
        C1876a c1876aM8979v3 = m8979v3();
        c1876aM8979v3.m9021c(beginSignInRequest.m8982w3());
        c1876aM8979v3.m9024f(beginSignInRequest.m8985z3());
        c1876aM8979v3.m9023e(beginSignInRequest.m8984y3());
        c1876aM8979v3.m9022d(beginSignInRequest.m8983x3());
        c1876aM8979v3.m9020b(beginSignInRequest.f7217i);
        c1876aM8979v3.m9027i(beginSignInRequest.f7218j);
        c1876aM8979v3.m9025g(beginSignInRequest.f7221m);
        String str = beginSignInRequest.f7216h;
        if (str != null) {
            c1876aM8979v3.m9026h(str);
        }
        return c1876aM8979v3;
    }

    @NonNull
    /* JADX INFO: renamed from: v3 */
    public static C1876a m8979v3() {
        return new C1876a();
    }

    /* JADX INFO: renamed from: A3 */
    public boolean m8980A3() {
        return this.f7221m;
    }

    /* JADX INFO: renamed from: B3 */
    public boolean m8981B3() {
        return this.f7217i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BeginSignInRequest)) {
            return false;
        }
        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) obj;
        return C8947k.m36026b(this.f7214f, beginSignInRequest.f7214f) && C8947k.m36026b(this.f7215g, beginSignInRequest.f7215g) && C8947k.m36026b(this.f7219k, beginSignInRequest.f7219k) && C8947k.m36026b(this.f7220l, beginSignInRequest.f7220l) && C8947k.m36026b(this.f7216h, beginSignInRequest.f7216h) && this.f7217i == beginSignInRequest.f7217i && this.f7218j == beginSignInRequest.f7218j && this.f7221m == beginSignInRequest.f7221m;
    }

    public int hashCode() {
        return C8947k.m36027c(this.f7214f, this.f7215g, this.f7219k, this.f7220l, this.f7216h, Boolean.valueOf(this.f7217i), Integer.valueOf(this.f7218j), Boolean.valueOf(this.f7221m));
    }

    @NonNull
    /* JADX INFO: renamed from: w3 */
    public GoogleIdTokenRequestOptions m8982w3() {
        return this.f7215g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38476t(parcel, 1, m8985z3(), i10, false);
        C9718b.m38476t(parcel, 2, m8982w3(), i10, false);
        C9718b.m38478v(parcel, 3, this.f7216h, false);
        C9718b.m38459c(parcel, 4, m8981B3());
        C9718b.m38470n(parcel, 5, this.f7218j);
        C9718b.m38476t(parcel, 6, m8984y3(), i10, false);
        C9718b.m38476t(parcel, 7, m8983x3(), i10, false);
        C9718b.m38459c(parcel, 8, m8980A3());
        C9718b.m38458b(parcel, iM38457a);
    }

    @NonNull
    /* JADX INFO: renamed from: x3 */
    public PasskeyJsonRequestOptions m8983x3() {
        return this.f7220l;
    }

    @NonNull
    /* JADX INFO: renamed from: y3 */
    public PasskeysRequestOptions m8984y3() {
        return this.f7219k;
    }

    @NonNull
    /* JADX INFO: renamed from: z3 */
    public PasswordRequestOptions m8985z3() {
        return this.f7214f;
    }
}
