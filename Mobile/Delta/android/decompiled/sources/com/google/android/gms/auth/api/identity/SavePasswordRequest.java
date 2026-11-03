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
    public final SignInPassword f5669f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f5670g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f5671h;

    @Deprecated
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public SignInPassword f5672a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f5673c;

        @NonNull
        public SavePasswordRequest a() {
            return new SavePasswordRequest(this.f5672a, this.b, this.f5673c);
        }

        @NonNull
        public a b(@NonNull SignInPassword signInPassword) {
            this.f5672a = signInPassword;
            return this;
        }

        @NonNull
        public final a c(@NonNull String str) {
            this.b = str;
            return this;
        }

        @NonNull
        public final a d(int i10) {
            this.f5673c = i10;
            return this;
        }
    }

    public SavePasswordRequest(SignInPassword signInPassword, String str, int i10) {
        this.f5669f = (SignInPassword) m.l(signInPassword);
        this.f5670g = str;
        this.f5671h = i10;
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
        aVarV3.d(savePasswordRequest.f5671h);
        String str = savePasswordRequest.f5670g;
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
        return k.b(this.f5669f, savePasswordRequest.f5669f) && k.b(this.f5670g, savePasswordRequest.f5670g) && this.f5671h == savePasswordRequest.f5671h;
    }

    public int hashCode() {
        return k.c(this.f5669f, this.f5670g);
    }

    @NonNull
    public SignInPassword w3() {
        return this.f5669f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = o9.b.a(parcel);
        o9.b.t(parcel, 1, w3(), i10, false);
        o9.b.v(parcel, 2, this.f5670g, false);
        o9.b.n(parcel, 3, this.f5671h);
        o9.b.b(parcel, iA);
    }
}
