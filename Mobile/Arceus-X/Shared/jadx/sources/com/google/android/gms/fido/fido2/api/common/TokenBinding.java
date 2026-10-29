package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import ca.C1604q;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p100eb.C4961l0;
import p305n9.C8953m;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public class TokenBinding extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<TokenBinding> CREATOR = new C1604q();

    /* JADX INFO: renamed from: h */
    @NonNull
    public static final TokenBinding f7714h = new TokenBinding(TokenBindingStatus.SUPPORTED.toString(), null);

    /* JADX INFO: renamed from: i */
    @NonNull
    public static final TokenBinding f7715i = new TokenBinding(TokenBindingStatus.NOT_SUPPORTED.toString(), null);

    /* JADX INFO: renamed from: f */
    @NonNull
    public final TokenBindingStatus f7716f;

    /* JADX INFO: renamed from: g */
    public final String f7717g;

    public enum TokenBindingStatus implements Parcelable {
        PRESENT("present"),
        SUPPORTED("supported"),
        NOT_SUPPORTED("not-supported");


        @NonNull
        public static final Parcelable.Creator<TokenBindingStatus> CREATOR = new C1934e();

        /* JADX INFO: renamed from: a */
        @NonNull
        public final String f7722a;

        TokenBindingStatus(String str) {
            this.f7722a = str;
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public static TokenBindingStatus m9348a(@NonNull String str) throws C1929a {
            for (TokenBindingStatus tokenBindingStatus : values()) {
                if (str.equals(tokenBindingStatus.f7722a)) {
                    return tokenBindingStatus;
                }
            }
            throw new C1929a(str);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // java.lang.Enum
        @NonNull
        public String toString() {
            return this.f7722a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            parcel.writeString(this.f7722a);
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.fido.fido2.api.common.TokenBinding$a */
    public static class C1929a extends Exception {
        public C1929a(@NonNull String str) {
            super(String.format("TokenBindingStatus %s not supported", str));
        }
    }

    public TokenBinding(@NonNull String str, String str2) {
        C8953m.m36047l(str);
        try {
            this.f7716f = TokenBindingStatus.m9348a(str);
            this.f7717g = str2;
        } catch (C1929a e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TokenBinding)) {
            return false;
        }
        TokenBinding tokenBinding = (TokenBinding) obj;
        return C4961l0.m23651a(this.f7716f, tokenBinding.f7716f) && C4961l0.m23651a(this.f7717g, tokenBinding.f7717g);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7716f, this.f7717g});
    }

    /* JADX INFO: renamed from: v3 */
    public String m9346v3() {
        return this.f7717g;
    }

    @NonNull
    /* JADX INFO: renamed from: w3 */
    public String m9347w3() {
        return this.f7716f.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38478v(parcel, 2, m9347w3(), false);
        C9718b.m38478v(parcel, 3, m9346v3(), false);
        C9718b.m38458b(parcel, iM38457a);
    }
}
