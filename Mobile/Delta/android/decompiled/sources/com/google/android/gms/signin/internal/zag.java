package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import k9.n;
import o9.b;
import qb.g;

/* JADX INFO: loaded from: classes.dex */
public final class zag extends AbstractSafeParcelable implements n {
    public static final Parcelable.Creator<zag> CREATOR = new g();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f7469f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f7470g;

    public zag(List list, String str) {
        this.f7469f = list;
        this.f7470g = str;
    }

    @Override // k9.n
    public final Status m() {
        return this.f7470g != null ? Status.f5718k : Status.f5722o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f7469f;
        int iA = b.a(parcel);
        b.x(parcel, 1, list, false);
        b.v(parcel, 2, this.f7470g, false);
        b.b(parcel, iA);
    }
}
