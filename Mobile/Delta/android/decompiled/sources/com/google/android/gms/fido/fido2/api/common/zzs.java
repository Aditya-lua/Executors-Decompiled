package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import ca.g0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.HashSet;
import java.util.List;
import n9.k;
import n9.m;

/* JADX INFO: loaded from: classes.dex */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new g0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final List f6052f;

    public zzs(@NonNull List list) {
        this.f6052f = (List) m.l(list);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzs)) {
            return false;
        }
        zzs zzsVar = (zzs) obj;
        return this.f6052f.containsAll(zzsVar.f6052f) && zzsVar.f6052f.containsAll(this.f6052f);
    }

    public final int hashCode() {
        return k.c(new HashSet(this.f6052f));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f6052f;
        int iA = o9.b.a(parcel);
        o9.b.z(parcel, 1, list, false);
        o9.b.b(parcel, iA);
    }
}
