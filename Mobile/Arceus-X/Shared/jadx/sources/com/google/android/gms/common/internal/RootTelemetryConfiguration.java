package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p305n9.C8968s0;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public class RootTelemetryConfiguration extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<RootTelemetryConfiguration> CREATOR = new C8968s0();

    /* JADX INFO: renamed from: f */
    public final int f7488f;

    /* JADX INFO: renamed from: g */
    public final boolean f7489g;

    /* JADX INFO: renamed from: h */
    public final boolean f7490h;

    /* JADX INFO: renamed from: i */
    public final int f7491i;

    /* JADX INFO: renamed from: j */
    public final int f7492j;

    public RootTelemetryConfiguration(int i10, boolean z10, boolean z11, int i11, int i12) {
        this.f7488f = i10;
        this.f7489g = z10;
        this.f7490h = z11;
        this.f7491i = i11;
        this.f7492j = i12;
    }

    /* JADX INFO: renamed from: v3 */
    public int m9210v3() {
        return this.f7491i;
    }

    /* JADX INFO: renamed from: w3 */
    public int m9211w3() {
        return this.f7492j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38470n(parcel, 1, m9214z3());
        C9718b.m38459c(parcel, 2, m9212x3());
        C9718b.m38459c(parcel, 3, m9213y3());
        C9718b.m38470n(parcel, 4, m9210v3());
        C9718b.m38470n(parcel, 5, m9211w3());
        C9718b.m38458b(parcel, iM38457a);
    }

    /* JADX INFO: renamed from: x3 */
    public boolean m9212x3() {
        return this.f7489g;
    }

    /* JADX INFO: renamed from: y3 */
    public boolean m9213y3() {
        return this.f7490h;
    }

    /* JADX INFO: renamed from: z3 */
    public int m9214z3() {
        return this.f7488f;
    }
}
