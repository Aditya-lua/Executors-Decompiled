package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Iterator;
import nb.c0;
import nb.d0;
import o9.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzbe extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzbe> CREATOR = new d0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Bundle f7421f;

    public zzbe(Bundle bundle) {
        this.f7421f = bundle;
    }

    public final Object a(String str) {
        return this.f7421f.get(str);
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new c0(this);
    }

    public final String toString() {
        return this.f7421f.toString();
    }

    public final Long v3(String str) {
        return Long.valueOf(this.f7421f.getLong(str));
    }

    public final Double w3(String str) {
        return Double.valueOf(this.f7421f.getDouble("value"));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = b.a(parcel);
        b.f(parcel, 2, y3(), false);
        b.b(parcel, iA);
    }

    public final String x3(String str) {
        return this.f7421f.getString(str);
    }

    public final Bundle y3() {
        return new Bundle(this.f7421f);
    }

    public final /* synthetic */ Bundle z3() {
        return this.f7421f;
    }

    public final int zze() {
        return this.f7421f.size();
    }
}
