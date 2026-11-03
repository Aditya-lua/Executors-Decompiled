package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n9.e0;

/* JADX INFO: loaded from: classes.dex */
public class MethodInvocation extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<MethodInvocation> CREATOR = new e0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5863f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f5864g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f5865h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f5866i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f5867j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f5868k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f5869l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f5870m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f5871n;

    @Deprecated
    public MethodInvocation(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13) {
        this(i10, i11, i12, j10, j11, str, str2, i13, -1);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int i11 = this.f5863f;
        int iA = o9.b.a(parcel);
        o9.b.n(parcel, 1, i11);
        o9.b.n(parcel, 2, this.f5864g);
        o9.b.n(parcel, 3, this.f5865h);
        o9.b.r(parcel, 4, this.f5866i);
        o9.b.r(parcel, 5, this.f5867j);
        o9.b.v(parcel, 6, this.f5868k, false);
        o9.b.v(parcel, 7, this.f5869l, false);
        o9.b.n(parcel, 8, this.f5870m);
        o9.b.n(parcel, 9, this.f5871n);
        o9.b.b(parcel, iA);
    }

    public MethodInvocation(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13, int i14) {
        this.f5863f = i10;
        this.f5864g = i11;
        this.f5865h = i12;
        this.f5866i = j10;
        this.f5867j = j11;
        this.f5868k = str;
        this.f5869l = str2;
        this.f5870m = i13;
        this.f5871n = i14;
    }
}
