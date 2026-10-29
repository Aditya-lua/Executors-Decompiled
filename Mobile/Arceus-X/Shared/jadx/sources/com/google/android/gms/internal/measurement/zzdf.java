package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Objects;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class zzdf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdf> CREATOR = new C2115i2();

    /* JADX INFO: renamed from: f */
    public final int f8892f;

    /* JADX INFO: renamed from: g */
    public final String f8893g;

    /* JADX INFO: renamed from: h */
    public final Intent f8894h;

    public zzdf(int i10, String str, Intent intent) {
        this.f8892f = i10;
        this.f8893g = str;
        this.f8894h = intent;
    }

    /* JADX INFO: renamed from: a */
    public static zzdf m11161a(Activity activity) {
        return new zzdf(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdf)) {
            return false;
        }
        zzdf zzdfVar = (zzdf) obj;
        return this.f8892f == zzdfVar.f8892f && Objects.equals(this.f8893g, zzdfVar.f8893g) && Objects.equals(this.f8894h, zzdfVar.f8894h);
    }

    public final int hashCode() {
        return this.f8892f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int i11 = this.f8892f;
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38470n(parcel, 1, i11);
        C9718b.m38478v(parcel, 2, this.f8893g, false);
        C9718b.m38476t(parcel, 3, this.f8894h, i10, false);
        C9718b.m38458b(parcel, iM38457a);
    }
}
