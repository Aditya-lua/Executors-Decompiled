package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import ca.C1591g;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p305n9.C8947k;
import p305n9.C8953m;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class zzag extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzag> CREATOR = new C1591g();

    /* JADX INFO: renamed from: f */
    @NonNull
    public final String f7735f;

    public zzag(@NonNull String str) {
        this.f7735f = (String) C8953m.m36047l(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzag) {
            return this.f7735f.equals(((zzag) obj).f7735f);
        }
        return false;
    }

    public final int hashCode() {
        return C8947k.m36027c(this.f7735f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f7735f;
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38478v(parcel, 1, str, false);
        C9718b.m38458b(parcel, iM38457a);
    }
}
