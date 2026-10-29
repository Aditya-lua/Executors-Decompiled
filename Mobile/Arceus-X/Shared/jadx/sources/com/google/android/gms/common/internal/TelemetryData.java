package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;
import p305n9.C8969t;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public class TelemetryData extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<TelemetryData> CREATOR = new C8969t();

    /* JADX INFO: renamed from: f */
    public final int f7493f;

    /* JADX INFO: renamed from: g */
    public List f7494g;

    public TelemetryData(int i10, List list) {
        this.f7493f = i10;
        this.f7494g = list;
    }

    /* JADX INFO: renamed from: v3 */
    public final int m9215v3() {
        return this.f7493f;
    }

    /* JADX INFO: renamed from: w3 */
    public final List m9216w3() {
        return this.f7494g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38470n(parcel, 1, this.f7493f);
        C9718b.m38482z(parcel, 2, this.f7494g, false);
        C9718b.m38458b(parcel, iM38457a);
    }

    /* JADX INFO: renamed from: x3 */
    public final void m9217x3(@NonNull MethodInvocation methodInvocation) {
        if (this.f7494g == null) {
            this.f7494g = new ArrayList();
        }
        this.f7494g.add(methodInvocation);
    }
}
