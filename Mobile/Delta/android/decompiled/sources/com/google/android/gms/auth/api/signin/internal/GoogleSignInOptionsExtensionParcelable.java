package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import d9.c;
import o9.b;

/* JADX INFO: loaded from: classes.dex */
public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> CREATOR = new c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5730f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5731g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Bundle f5732h;

    public GoogleSignInOptionsExtensionParcelable(int i10, int i11, Bundle bundle) {
        this.f5730f = i10;
        this.f5731g = i11;
        this.f5732h = bundle;
    }

    public int getType() {
        return this.f5731g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = b.a(parcel);
        b.n(parcel, 1, this.f5730f);
        b.n(parcel, 2, getType());
        b.f(parcel, 3, this.f5732h, false);
        b.b(parcel, iA);
    }
}
