package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j9.p;
import n9.k;
import o9.b;

/* JADX INFO: loaded from: classes.dex */
public class Feature extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<Feature> CREATOR = new p();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f5694f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public final int f5695g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f5696h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f5697i;

    public Feature(@NonNull String str, int i10, long j10, boolean z10) {
        this.f5694f = str;
        this.f5695g = i10;
        this.f5696h = j10;
        this.f5697i = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            if (k.b(getName(), feature.getName()) && w3() == feature.w3() && v3() == feature.v3()) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public String getName() {
        return this.f5694f;
    }

    public final int hashCode() {
        return k.c(getName(), Long.valueOf(w3()), Boolean.valueOf(v3()));
    }

    @NonNull
    public final String toString() {
        k.a aVarD = k.d(this);
        aVarD.a("name", getName());
        aVarD.a("version", Long.valueOf(w3()));
        aVarD.a("is_fully_rolled_out", Boolean.valueOf(v3()));
        return aVarD.toString();
    }

    public boolean v3() {
        return this.f5697i;
    }

    public long w3() {
        long j10 = this.f5696h;
        return j10 == -1 ? this.f5695g : j10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = b.a(parcel);
        b.v(parcel, 1, getName(), false);
        b.n(parcel, 2, this.f5695g);
        b.r(parcel, 3, w3());
        b.c(parcel, 4, v3());
        b.b(parcel, iA);
    }

    public Feature(@NonNull String str, long j10) {
        this(str, -1, j10, false);
    }
}
