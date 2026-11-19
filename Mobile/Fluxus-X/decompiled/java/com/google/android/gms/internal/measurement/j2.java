package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class j2 extends p9.a {
    public static final Parcelable.Creator<j2> CREATOR = new k2();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6556f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f6557g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Intent f6558h;

    public j2(int i10, String str, Intent intent) {
        this.f6556f = i10;
        this.f6557g = str;
        this.f6558h = intent;
    }

    public static j2 a(Activity activity) {
        return new j2(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j2)) {
            return false;
        }
        j2 j2Var = (j2) obj;
        return this.f6556f == j2Var.f6556f && Objects.equals(this.f6557g, j2Var.f6557g) && Objects.equals(this.f6558h, j2Var.f6558h);
    }

    public final int hashCode() {
        return this.f6556f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int i11 = this.f6556f;
        int iA = p9.c.a(parcel);
        p9.c.n(parcel, 1, i11);
        p9.c.v(parcel, 2, this.f6557g, false);
        p9.c.t(parcel, 3, this.f6558h, i10, false);
        p9.c.b(parcel, iA);
    }
}
