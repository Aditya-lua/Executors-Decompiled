package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class zzdf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdf> CREATOR = new i2();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f7050f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f7051g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Intent f7052h;

    public zzdf(int i10, String str, Intent intent) {
        this.f7050f = i10;
        this.f7051g = str;
        this.f7052h = intent;
    }

    public static zzdf a(Activity activity) {
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
        return this.f7050f == zzdfVar.f7050f && Objects.equals(this.f7051g, zzdfVar.f7051g) && Objects.equals(this.f7052h, zzdfVar.f7052h);
    }

    public final int hashCode() {
        return this.f7050f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int i11 = this.f7050f;
        int iA = o9.b.a(parcel);
        o9.b.n(parcel, 1, i11);
        o9.b.v(parcel, 2, this.f7051g, false);
        o9.b.t(parcel, 3, this.f7052h, i10, false);
        o9.b.b(parcel, iA);
    }
}
