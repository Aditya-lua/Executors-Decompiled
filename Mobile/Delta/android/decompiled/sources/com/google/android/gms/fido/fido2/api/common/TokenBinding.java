package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import ca.q;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import eb.l0;
import java.util.Arrays;
import n9.m;

/* JADX INFO: loaded from: classes.dex */
public class TokenBinding extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<TokenBinding> CREATOR = new q();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public static final TokenBinding f6013h = new TokenBinding(TokenBindingStatus.SUPPORTED.toString(), null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public static final TokenBinding f6014i = new TokenBinding(TokenBindingStatus.NOT_SUPPORTED.toString(), null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TokenBindingStatus f6015f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f6016g;

    public enum TokenBindingStatus implements Parcelable {
        PRESENT("present"),
        SUPPORTED("supported"),
        NOT_SUPPORTED("not-supported");


        @NonNull
        public static final Parcelable.Creator<TokenBindingStatus> CREATOR = new e();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final String f6020a;

        TokenBindingStatus(String str) {
            this.f6020a = str;
        }

        @NonNull
        public static TokenBindingStatus a(@NonNull String str) throws a {
            for (TokenBindingStatus tokenBindingStatus : values()) {
                if (str.equals(tokenBindingStatus.f6020a)) {
                    return tokenBindingStatus;
                }
            }
            throw new a(str);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // java.lang.Enum
        @NonNull
        public String toString() {
            return this.f6020a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            parcel.writeString(this.f6020a);
        }
    }

    public static class a extends Exception {
        public a(@NonNull String str) {
            super(String.format("TokenBindingStatus %s not supported", str));
        }
    }

    public TokenBinding(@NonNull String str, String str2) {
        m.l(str);
        try {
            this.f6015f = TokenBindingStatus.a(str);
            this.f6016g = str2;
        } catch (a e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TokenBinding)) {
            return false;
        }
        TokenBinding tokenBinding = (TokenBinding) obj;
        return l0.a(this.f6015f, tokenBinding.f6015f) && l0.a(this.f6016g, tokenBinding.f6016g);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6015f, this.f6016g});
    }

    public String v3() {
        return this.f6016g;
    }

    @NonNull
    public String w3() {
        return this.f6015f.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = o9.b.a(parcel);
        o9.b.v(parcel, 2, w3(), false);
        o9.b.v(parcel, 3, v3(), false);
        o9.b.b(parcel, iA);
    }
}
