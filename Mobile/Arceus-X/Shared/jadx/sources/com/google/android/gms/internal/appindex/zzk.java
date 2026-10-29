package com.google.android.gms.internal.appindex;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p325o9.C9718b;
import p487v8.InterfaceC12100a;
import va.C12122f0;
import va.C12151u;

/* JADX INFO: loaded from: classes.dex */
public final class zzk extends AbstractSafeParcelable implements InterfaceC12100a {
    public static final Parcelable.Creator<zzk> CREATOR = new C12122f0();

    /* JADX INFO: renamed from: f */
    public final String f8049f;

    /* JADX INFO: renamed from: g */
    public final String f8050g;

    /* JADX INFO: renamed from: h */
    public final String f8051h;

    /* JADX INFO: renamed from: i */
    public final String f8052i;

    /* JADX INFO: renamed from: j */
    public final String f8053j;

    /* JADX INFO: renamed from: k */
    public final Bundle f8054k;

    public zzk(String str, String str2, String str3, String str4, String str5, Bundle bundle) {
        this.f8049f = str;
        this.f8050g = str2;
        this.f8051h = str3;
        this.f8052i = str4;
        this.f8053j = str5;
        if (bundle != null) {
            this.f8054k = bundle;
        } else {
            this.f8054k = Bundle.EMPTY;
        }
        ClassLoader classLoader = zzk.class.getClassLoader();
        C12151u.m44978a(classLoader);
        this.f8054k.setClassLoader(classLoader);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ActionImpl { { actionType: '");
        sb2.append(this.f8049f);
        sb2.append("' } { objectName: '");
        sb2.append(this.f8050g);
        sb2.append("' } { objectUrl: '");
        sb2.append(this.f8051h);
        sb2.append("' } ");
        if (this.f8052i != null) {
            sb2.append("{ objectSameAs: '");
            sb2.append(this.f8052i);
            sb2.append("' } ");
        }
        if (this.f8053j != null) {
            sb2.append("{ actionStatus: '");
            sb2.append(this.f8053j);
            sb2.append("' } ");
        }
        if (!this.f8054k.isEmpty()) {
            sb2.append("{ ");
            sb2.append(this.f8054k);
            sb2.append(" } ");
        }
        sb2.append("}");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38478v(parcel, 1, this.f8049f, false);
        C9718b.m38478v(parcel, 2, this.f8050g, false);
        C9718b.m38478v(parcel, 3, this.f8051h, false);
        C9718b.m38478v(parcel, 4, this.f8052i, false);
        C9718b.m38478v(parcel, 6, this.f8053j, false);
        C9718b.m38462f(parcel, 7, this.f8054k, false);
        C9718b.m38458b(parcel, iM38457a);
    }
}
