package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import ca.C1592g0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.HashSet;
import java.util.List;
import p305n9.C8947k;
import p305n9.C8953m;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new C1592g0();

    /* JADX INFO: renamed from: f */
    @NonNull
    public final List f7755f;

    public zzs(@NonNull List list) {
        this.f7755f = (List) C8953m.m36047l(list);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzs)) {
            return false;
        }
        zzs zzsVar = (zzs) obj;
        return this.f7755f.containsAll(zzsVar.f7755f) && zzsVar.f7755f.containsAll(this.f7755f);
    }

    public final int hashCode() {
        return C8947k.m36027c(new HashSet(this.f7755f));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f7755f;
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38482z(parcel, 1, list, false);
        C9718b.m38458b(parcel, iM38457a);
    }
}
