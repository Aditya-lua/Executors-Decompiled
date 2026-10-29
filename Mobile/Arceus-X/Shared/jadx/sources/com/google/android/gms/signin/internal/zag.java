package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import p242k9.InterfaceC7504n;
import p325o9.C9718b;
import p376qb.C10492g;

/* JADX INFO: loaded from: classes.dex */
public final class zag extends AbstractSafeParcelable implements InterfaceC7504n {
    public static final Parcelable.Creator<zag> CREATOR = new C10492g();

    /* JADX INFO: renamed from: f */
    public final List f9559f;

    /* JADX INFO: renamed from: g */
    public final String f9560g;

    public zag(List list, String str) {
        this.f9559f = list;
        this.f9560g = str;
    }

    @Override // p242k9.InterfaceC7504n
    /* JADX INFO: renamed from: m */
    public final Status mo8183m() {
        return this.f9560g != null ? Status.f7405k : Status.f7409o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f9559f;
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38480x(parcel, 1, list, false);
        C9718b.m38478v(parcel, 2, this.f9560g, false);
        C9718b.m38458b(parcel, iM38457a);
    }
}
