package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import k9.d;
import k9.n;
import k9.x;
import n9.k;
import o9.b;

/* JADX INFO: loaded from: classes.dex */
public final class Status extends AbstractSafeParcelable implements n, ReflectedParcelable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5798f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f5799g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final PendingIntent f5800h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ConnectionResult f5801i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public static final Status f5790j = new Status(-1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public static final Status f5791k = new Status(0);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public static final Status f5792l = new Status(14);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public static final Status f5793m = new Status(8);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public static final Status f5794n = new Status(15);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public static final Status f5795o = new Status(16);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NonNull
    public static final Status f5796p = new Status(17);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NonNull
    public static final Status f5797q = new Status(18);

    @NonNull
    public static final Parcelable.Creator<Status> CREATOR = new x();

    public Status(int i10, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.f5798f = i10;
        this.f5799g = str;
        this.f5800h = pendingIntent;
        this.f5801i = connectionResult;
    }

    public boolean A3() {
        return this.f5798f <= 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f5798f == status.f5798f && k.b(this.f5799g, status.f5799g) && k.b(this.f5800h, status.f5800h) && k.b(this.f5801i, status.f5801i);
    }

    public int hashCode() {
        return k.c(Integer.valueOf(this.f5798f), this.f5799g, this.f5800h, this.f5801i);
    }

    @Override // k9.n
    @NonNull
    public Status m() {
        return this;
    }

    @NonNull
    public String toString() {
        k.a aVarD = k.d(this);
        aVarD.a("statusCode", zza());
        aVarD.a("resolution", this.f5800h);
        return aVarD.toString();
    }

    public ConnectionResult v3() {
        return this.f5801i;
    }

    public PendingIntent w3() {
        return this.f5800h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = b.a(parcel);
        b.n(parcel, 1, x3());
        b.v(parcel, 2, y3(), false);
        b.t(parcel, 3, this.f5800h, i10, false);
        b.t(parcel, 4, v3(), i10, false);
        b.b(parcel, iA);
    }

    public int x3() {
        return this.f5798f;
    }

    public String y3() {
        return this.f5799g;
    }

    public boolean z3() {
        return this.f5800h != null;
    }

    @NonNull
    public final String zza() {
        String str = this.f5799g;
        return str != null ? str : d.a(this.f5798f);
    }

    public Status(int i10) {
        this(i10, (String) null);
    }

    public Status(@NonNull ConnectionResult connectionResult, @NonNull String str) {
        this(connectionResult, str, 17);
    }

    public Status(int i10, String str) {
        this(i10, str, (PendingIntent) null);
    }

    @Deprecated
    public Status(@NonNull ConnectionResult connectionResult, @NonNull String str, int i10) {
        this(i10, str, connectionResult.y3(), connectionResult);
    }

    public Status(int i10, String str, PendingIntent pendingIntent) {
        this(i10, str, pendingIntent, null);
    }
}
