package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p305n9.C8925c1;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ConnectionTelemetryConfiguration> CREATOR = new C8925c1();

    /* JADX INFO: renamed from: f */
    public final RootTelemetryConfiguration f7455f;

    /* JADX INFO: renamed from: g */
    public final boolean f7456g;

    /* JADX INFO: renamed from: h */
    public final boolean f7457h;

    /* JADX INFO: renamed from: i */
    public final int[] f7458i;

    /* JADX INFO: renamed from: j */
    public final int f7459j;

    /* JADX INFO: renamed from: k */
    public final int[] f7460k;

    public ConnectionTelemetryConfiguration(@NonNull RootTelemetryConfiguration rootTelemetryConfiguration, boolean z10, boolean z11, int[] iArr, int i10, int[] iArr2) {
        this.f7455f = rootTelemetryConfiguration;
        this.f7456g = z10;
        this.f7457h = z11;
        this.f7458i = iArr;
        this.f7459j = i10;
        this.f7460k = iArr2;
    }

    @NonNull
    /* JADX INFO: renamed from: A3 */
    public final RootTelemetryConfiguration m9200A3() {
        return this.f7455f;
    }

    /* JADX INFO: renamed from: v3 */
    public int m9201v3() {
        return this.f7459j;
    }

    /* JADX INFO: renamed from: w3 */
    public int[] m9202w3() {
        return this.f7458i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38476t(parcel, 1, this.f7455f, i10, false);
        C9718b.m38459c(parcel, 2, m9204y3());
        C9718b.m38459c(parcel, 3, m9205z3());
        C9718b.m38471o(parcel, 4, m9202w3(), false);
        C9718b.m38470n(parcel, 5, m9201v3());
        C9718b.m38471o(parcel, 6, m9203x3(), false);
        C9718b.m38458b(parcel, iM38457a);
    }

    /* JADX INFO: renamed from: x3 */
    public int[] m9203x3() {
        return this.f7460k;
    }

    /* JADX INFO: renamed from: y3 */
    public boolean m9204y3() {
        return this.f7456g;
    }

    /* JADX INFO: renamed from: z3 */
    public boolean m9205z3() {
        return this.f7457h;
    }
}
