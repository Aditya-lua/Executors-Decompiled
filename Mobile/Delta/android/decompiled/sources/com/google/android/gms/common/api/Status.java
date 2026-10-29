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
    public final int f5725f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f5726g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final PendingIntent f5727h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ConnectionResult f5728i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public static final Status f5717j = new Status(-1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public static final Status f5718k = new Status(0);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public static final Status f5719l = new Status(14);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public static final Status f5720m = new Status(8);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public static final Status f5721n = new Status(15);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public static final Status f5722o = new Status(16);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NonNull
    public static final Status f5723p = new Status(17);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NonNull
    public static final Status f5724q = new Status(18);

    @NonNull
    public static final Parcelable.Creator<Status> CREATOR = new x();

    public Status(int i10, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.f5725f = i10;
        this.f5726g = str;
        this.f5727h = pendingIntent;
        this.f5728i = connectionResult;
    }

    public boolean A3() {
        return this.f5725f <= 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f5725f == status.f5725f && k.b(this.f5726g, status.f5726g) && k.b(this.f5727h, status.f5727h) && k.b(this.f5728i, status.f5728i);
    }

    public int hashCode() {
        return k.c(Integer.valueOf(this.f5725f), this.f5726g, this.f5727h, this.f5728i);
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
        aVarD.a("resolution", this.f5727h);
        return aVarD.toString();
    }

    public ConnectionResult v3() {
        return this.f5728i;
    }

    public PendingIntent w3() {
        return this.f5727h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = b.a(parcel);
        b.n(parcel, 1, x3());
        b.v(parcel, 2, y3(), false);
        b.t(parcel, 3, this.f5727h, i10, false);
        b.t(parcel, 4, v3(), i10, false);
        b.b(parcel, iA);
    }

    public int x3() {
        return this.f5725f;
    }

    public String y3() {
        return this.f5726g;
    }

    public boolean z3() {
        return this.f5727h != null;
    }

    @NonNull
    public final String zza() {
        String str = this.f5726g;
        return str != null ? str : d.a(this.f5725f);
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
