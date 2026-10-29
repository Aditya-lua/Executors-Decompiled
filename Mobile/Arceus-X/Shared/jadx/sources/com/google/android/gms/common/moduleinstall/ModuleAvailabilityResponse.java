package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p325o9.C9718b;
import p405r9.C10801e;

/* JADX INFO: loaded from: classes.dex */
public class ModuleAvailabilityResponse extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ModuleAvailabilityResponse> CREATOR = new C10801e();

    /* JADX INFO: renamed from: f */
    public final boolean f7508f;

    /* JADX INFO: renamed from: g */
    public final int f7509g;

    public ModuleAvailabilityResponse(boolean z10, int i10) {
        this.f7508f = z10;
        this.f7509g = i10;
    }

    /* JADX INFO: renamed from: v3 */
    public boolean m9222v3() {
        return this.f7508f;
    }

    /* JADX INFO: renamed from: w3 */
    public int m9223w3() {
        return this.f7509g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38459c(parcel, 1, m9222v3());
        C9718b.m38470n(parcel, 2, m9223w3());
        C9718b.m38458b(parcel, iM38457a);
    }
}
