package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;
import n9.t;

/* JADX INFO: loaded from: classes.dex */
public class TelemetryData extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<TelemetryData> CREATOR = new t();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5804f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f5805g;

    public TelemetryData(int i10, List list) {
        this.f5804f = i10;
        this.f5805g = list;
    }

    public final int v3() {
        return this.f5804f;
    }

    public final List w3() {
        return this.f5805g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = o9.b.a(parcel);
        o9.b.n(parcel, 1, this.f5804f);
        o9.b.z(parcel, 2, this.f5805g, false);
        o9.b.b(parcel, iA);
    }

    public final void x3(@NonNull MethodInvocation methodInvocation) {
        if (this.f5805g == null) {
            this.f5805g = new ArrayList();
        }
        this.f5805g.add(methodInvocation);
    }
}
