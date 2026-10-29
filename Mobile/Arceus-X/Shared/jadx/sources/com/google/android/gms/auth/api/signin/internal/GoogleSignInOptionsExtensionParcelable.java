package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p072d9.C4475c;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> CREATOR = new C4475c();

    /* JADX INFO: renamed from: f */
    public final int f7333f;

    /* JADX INFO: renamed from: g */
    public int f7334g;

    /* JADX INFO: renamed from: h */
    public Bundle f7335h;

    public GoogleSignInOptionsExtensionParcelable(int i10, int i11, Bundle bundle) {
        this.f7333f = i10;
        this.f7334g = i11;
        this.f7335h = bundle;
    }

    public int getType() {
        return this.f7334g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38470n(parcel, 1, this.f7333f);
        C9718b.m38470n(parcel, 2, getType());
        C9718b.m38462f(parcel, 3, this.f7335h, false);
        C9718b.m38458b(parcel, iM38457a);
    }
}
