package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import ca.C1613z;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p100eb.AbstractC4970m3;
import p305n9.C8947k;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzf> CREATOR = new C1613z();

    /* JADX INFO: renamed from: f */
    public final AbstractC4970m3 f7747f;

    /* JADX INFO: renamed from: g */
    public final AbstractC4970m3 f7748g;

    public zzf(AbstractC4970m3 abstractC4970m3, AbstractC4970m3 abstractC4970m4) {
        this.f7747f = abstractC4970m3;
        this.f7748g = abstractC4970m4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzf)) {
            return false;
        }
        zzf zzfVar = (zzf) obj;
        return C8947k.m36026b(this.f7747f, zzfVar.f7747f) && C8947k.m36026b(this.f7748g, zzfVar.f7748g);
    }

    public final int hashCode() {
        return C8947k.m36027c(this.f7747f, this.f7748g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        AbstractC4970m3 abstractC4970m3 = this.f7747f;
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38463g(parcel, 1, abstractC4970m3 == null ? null : abstractC4970m3.m23675p(), false);
        AbstractC4970m3 abstractC4970m4 = this.f7748g;
        C9718b.m38463g(parcel, 2, abstractC4970m4 != null ? abstractC4970m4.m23675p() : null, false);
        C9718b.m38458b(parcel, iM38457a);
    }
}
