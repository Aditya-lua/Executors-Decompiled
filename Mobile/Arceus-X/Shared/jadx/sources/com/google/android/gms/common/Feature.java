package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p213j9.C7111p;
import p305n9.C8947k;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public class Feature extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<Feature> CREATOR = new C7111p();

    /* JADX INFO: renamed from: f */
    public final String f7379f;

    /* JADX INFO: renamed from: g */
    @Deprecated
    public final int f7380g;

    /* JADX INFO: renamed from: h */
    public final long f7381h;

    /* JADX INFO: renamed from: i */
    public final boolean f7382i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Feature(@NonNull String str, int i10, long j10, boolean z10) {
        this.f7379f = str;
        this.f7380g = i10;
        this.f7381h = j10;
        this.f7382i = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            if (C8947k.m36026b(getName(), feature.getName()) && m9145w3() == feature.m9145w3() && m9144v3() == feature.m9144v3()) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public String getName() {
        return this.f7379f;
    }

    public final int hashCode() {
        return C8947k.m36027c(getName(), Long.valueOf(m9145w3()), Boolean.valueOf(m9144v3()));
    }

    @NonNull
    public final String toString() {
        C8947k.a aVarM36028d = C8947k.m36028d(this);
        aVarM36028d.m36029a("name", getName());
        aVarM36028d.m36029a("version", Long.valueOf(m9145w3()));
        aVarM36028d.m36029a("is_fully_rolled_out", Boolean.valueOf(m9144v3()));
        return aVarM36028d.toString();
    }

    /* JADX INFO: renamed from: v3 */
    public boolean m9144v3() {
        return this.f7382i;
    }

    /* JADX INFO: renamed from: w3 */
    public long m9145w3() {
        long j10 = this.f7381h;
        return j10 == -1 ? this.f7380g : j10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38478v(parcel, 1, getName(), false);
        C9718b.m38470n(parcel, 2, this.f7380g);
        C9718b.m38474r(parcel, 3, m9145w3());
        C9718b.m38459c(parcel, 4, m9144v3());
        C9718b.m38458b(parcel, iM38457a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public Feature(@NonNull String str, long j10) {
        this(str, -1, j10, false);
    }
}
