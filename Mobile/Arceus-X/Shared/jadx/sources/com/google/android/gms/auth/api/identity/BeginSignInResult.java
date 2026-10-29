package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p305n9.C8953m;
import p325o9.C9718b;
import p598z8.C13740d;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class BeginSignInResult extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<BeginSignInResult> CREATOR = new C13740d();

    /* JADX INFO: renamed from: f */
    public final PendingIntent f7256f;

    public BeginSignInResult(@NonNull PendingIntent pendingIntent) {
        this.f7256f = (PendingIntent) C8953m.m36047l(pendingIntent);
    }

    @NonNull
    /* JADX INFO: renamed from: v3 */
    public PendingIntent m9028v3() {
        return this.f7256f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38476t(parcel, 1, m9028v3(), i10, false);
        C9718b.m38458b(parcel, iM38457a);
    }
}
