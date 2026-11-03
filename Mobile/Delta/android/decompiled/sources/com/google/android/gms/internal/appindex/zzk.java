package com.google.android.gms.internal.appindex;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o9.b;
import v8.a;
import va.f0;
import va.u;

/* JADX INFO: loaded from: classes.dex */
public final class zzk extends AbstractSafeParcelable implements a {
    public static final Parcelable.Creator<zzk> CREATOR = new f0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f6402f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f6403g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f6404h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f6405i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f6406j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Bundle f6407k;

    public zzk(String str, String str2, String str3, String str4, String str5, Bundle bundle) {
        this.f6402f = str;
        this.f6403g = str2;
        this.f6404h = str3;
        this.f6405i = str4;
        this.f6406j = str5;
        if (bundle != null) {
            this.f6407k = bundle;
        } else {
            this.f6407k = Bundle.EMPTY;
        }
        ClassLoader classLoader = zzk.class.getClassLoader();
        u.a(classLoader);
        this.f6407k.setClassLoader(classLoader);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ActionImpl { { actionType: '");
        sb2.append(this.f6402f);
        sb2.append("' } { objectName: '");
        sb2.append(this.f6403g);
        sb2.append("' } { objectUrl: '");
        sb2.append(this.f6404h);
        sb2.append("' } ");
        if (this.f6405i != null) {
            sb2.append("{ objectSameAs: '");
            sb2.append(this.f6405i);
            sb2.append("' } ");
        }
        if (this.f6406j != null) {
            sb2.append("{ actionStatus: '");
            sb2.append(this.f6406j);
            sb2.append("' } ");
        }
        if (!this.f6407k.isEmpty()) {
            sb2.append("{ ");
            sb2.append(this.f6407k);
            sb2.append(" } ");
        }
        sb2.append("}");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = b.a(parcel);
        b.v(parcel, 1, this.f6402f, false);
        b.v(parcel, 2, this.f6403g, false);
        b.v(parcel, 3, this.f6404h, false);
        b.v(parcel, 4, this.f6405i, false);
        b.v(parcel, 6, this.f6406j, false);
        b.f(parcel, 7, this.f6407k, false);
        b.b(parcel, iA);
    }
}
