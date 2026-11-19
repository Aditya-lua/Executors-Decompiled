package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import k9.b;
import l9.e;
import l9.p;
import l9.z;
import o9.q;
import p9.a;
import p9.c;

/* JADX INFO: loaded from: classes.dex */
public final class Status extends a implements p, ReflectedParcelable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6115f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f6116g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final PendingIntent f6117h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b f6118i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public static final Status f6107j = new Status(-1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public static final Status f6108k = new Status(0);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public static final Status f6109l = new Status(14);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public static final Status f6110m = new Status(8);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public static final Status f6111n = new Status(15);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public static final Status f6112o = new Status(16);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NonNull
    public static final Status f6113p = new Status(17);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NonNull
    public static final Status f6114q = new Status(18);

    @NonNull
    public static final Parcelable.Creator<Status> CREATOR = new z();

    public Status(int i10, String str, PendingIntent pendingIntent, b bVar) {
        this.f6115f = i10;
        this.f6116g = str;
        this.f6117h = pendingIntent;
        this.f6118i = bVar;
    }

    public b A3() {
        return this.f6118i;
    }

    public PendingIntent B3() {
        return this.f6117h;
    }

    public int C3() {
        return this.f6115f;
    }

    public String D3() {
        return this.f6116g;
    }

    public boolean E3() {
        return this.f6117h != null;
    }

    public boolean F3() {
        return this.f6115f <= 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f6115f == status.f6115f && q.b(this.f6116g, status.f6116g) && q.b(this.f6117h, status.f6117h) && q.b(this.f6118i, status.f6118i);
    }

    public int hashCode() {
        return q.c(Integer.valueOf(this.f6115f), this.f6116g, this.f6117h, this.f6118i);
    }

    @Override // l9.p
    @NonNull
    public Status n() {
        return this;
    }

    @NonNull
    public String toString() {
        q.a aVarD = q.d(this);
        aVarD.a("statusCode", zza());
        aVarD.a("resolution", this.f6117h);
        return aVarD.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.n(parcel, 1, C3());
        c.v(parcel, 2, D3(), false);
        c.t(parcel, 3, this.f6117h, i10, false);
        c.t(parcel, 4, A3(), i10, false);
        c.b(parcel, iA);
    }

    @NonNull
    public final String zza() {
        String str = this.f6116g;
        return str != null ? str : e.a(this.f6115f);
    }

    public Status(int i10) {
        this(i10, (String) null);
    }

    public Status(@NonNull b bVar, @NonNull String str) {
        this(bVar, str, 17);
    }

    public Status(int i10, String str) {
        this(i10, str, (PendingIntent) null);
    }

    @Deprecated
    public Status(@NonNull b bVar, @NonNull String str, int i10) {
        this(i10, str, bVar.D3(), bVar);
    }

    public Status(int i10, String str, PendingIntent pendingIntent) {
        this(i10, str, pendingIntent, null);
    }
}
