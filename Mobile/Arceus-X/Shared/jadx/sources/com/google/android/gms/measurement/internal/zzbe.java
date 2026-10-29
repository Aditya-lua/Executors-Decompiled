package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Iterator;
import p306nb.C9020c0;
import p306nb.C9037d0;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class zzbe extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzbe> CREATOR = new C9037d0();

    /* JADX INFO: renamed from: f */
    public final Bundle f9501f;

    public zzbe(Bundle bundle) {
        this.f9501f = bundle;
    }

    /* JADX INFO: renamed from: a */
    public final Object m11878a(String str) {
        return this.f9501f.get(str);
    }

    /* JADX DEBUG: Return type fixed from 'java.util.Iterator' to match base method */
    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new C9020c0(this);
    }

    public final String toString() {
        return this.f9501f.toString();
    }

    /* JADX INFO: renamed from: v3 */
    public final Long m11879v3(String str) {
        return Long.valueOf(this.f9501f.getLong(str));
    }

    /* JADX INFO: renamed from: w3 */
    public final Double m11880w3(String str) {
        return Double.valueOf(this.f9501f.getDouble("value"));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38462f(parcel, 2, m11882y3(), false);
        C9718b.m38458b(parcel, iM38457a);
    }

    /* JADX INFO: renamed from: x3 */
    public final String m11881x3(String str) {
        return this.f9501f.getString(str);
    }

    /* JADX INFO: renamed from: y3 */
    public final Bundle m11882y3() {
        return new Bundle(this.f9501f);
    }

    /* JADX INFO: renamed from: z3 */
    public final /* synthetic */ Bundle m11883z3() {
        return this.f9501f;
    }

    public final int zze() {
        return this.f9501f.size();
    }
}
