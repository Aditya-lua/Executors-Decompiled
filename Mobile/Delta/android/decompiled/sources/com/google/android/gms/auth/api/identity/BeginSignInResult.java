package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n9.m;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class BeginSignInResult extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<BeginSignInResult> CREATOR = new z8.d();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final PendingIntent f5583f;

    public BeginSignInResult(@NonNull PendingIntent pendingIntent) {
        this.f5583f = (PendingIntent) m.l(pendingIntent);
    }

    @NonNull
    public PendingIntent v3() {
        return this.f5583f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = o9.b.a(parcel);
        o9.b.t(parcel, 1, v3(), i10, false);
        o9.b.b(parcel, iA);
    }
}
