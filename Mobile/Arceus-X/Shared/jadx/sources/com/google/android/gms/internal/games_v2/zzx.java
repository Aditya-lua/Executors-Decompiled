package com.google.android.gms.internal.games_v2;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p125fb.C5527h2;
import p305n9.C8947k;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class zzx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzx> CREATOR = new C5527h2();

    /* JADX INFO: renamed from: f */
    public final Intent f8060f;

    public zzx(Intent intent) {
        this.f8060f = intent;
    }

    /* JADX INFO: renamed from: a */
    public static zzx m9570a(Intent intent) {
        return new zzx(intent);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzx) {
            return C8947k.m36026b(this.f8060f, ((zzx) obj).f8060f);
        }
        return false;
    }

    public final int hashCode() {
        Intent intent = this.f8060f;
        if (intent != null) {
            return intent.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return C8947k.m36028d(this).m36029a("resultData", this.f8060f).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Intent intent = this.f8060f;
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38476t(parcel, 1, intent, i10, false);
        C9718b.m38458b(parcel, iM38457a);
    }
}
