package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n9.k;
import n9.m;
import z8.i;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class SavePasswordRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<SavePasswordRequest> CREATOR = new i();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SignInPassword f5596f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f5597g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f5598h;

    @Deprecated
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public SignInPassword f5599a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f5600c;

        @NonNull
        public SavePasswordRequest a() {
            return new SavePasswordRequest(this.f5599a, this.b, this.f5600c);
        }

        @NonNull
        public a b(@NonNull SignInPassword signInPassword) {
            this.f5599a = signInPassword;
            return this;
        }

        @NonNull
        public final a c(@NonNull String str) {
            this.b = str;
            return this;
        }

        @NonNull
        public final a d(int i10) {
            this.f5600c = i10;
            return this;
        }
    }

    public SavePasswordRequest(SignInPassword signInPassword, String str, int i10) {
        this.f5596f = (SignInPassword) m.l(signInPassword);
        this.f5597g = str;
        this.f5598h = i10;
    }

    @NonNull
    public static a v3() {
        return new a();
    }

    @NonNull
    public static a x3(@NonNull SavePasswordRequest savePasswordRequest) {
        m.l(savePasswordRequest);
        a aVarV3 = v3();
        aVarV3.b(savePasswordRequest.w3());
        aVarV3.d(savePasswordRequest.f5598h);
        String str = savePasswordRequest.f5597g;
        if (str != null) {
            aVarV3.c(str);
        }
        return aVarV3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SavePasswordRequest)) {
            return false;
        }
        SavePasswordRequest savePasswordRequest = (SavePasswordRequest) obj;
        return k.b(this.f5596f, savePasswordRequest.f5596f) && k.b(this.f5597g, savePasswordRequest.f5597g) && this.f5598h == savePasswordRequest.f5598h;
    }

    public int hashCode() {
        return k.c(this.f5596f, this.f5597g);
    }

    @NonNull
    public SignInPassword w3() {
        return this.f5596f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = o9.b.a(parcel);
        o9.b.t(parcel, 1, w3(), i10, false);
        o9.b.v(parcel, 2, this.f5597g, false);
        o9.b.n(parcel, 3, this.f5598h);
        o9.b.b(parcel, iA);
    }
}
