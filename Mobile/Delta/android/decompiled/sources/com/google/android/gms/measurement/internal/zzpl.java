package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n9.m;
import nb.se;
import nb.te;

/* JADX INFO: loaded from: classes.dex */
public final class zzpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpl> CREATOR = new se();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f7438f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f7439g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f7440h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Long f7441i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f7442j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f7443k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Double f7444l;

    public zzpl(int i10, String str, long j10, Long l10, Float f10, String str2, String str3, Double d10) {
        this.f7438f = i10;
        this.f7439g = str;
        this.f7440h = j10;
        this.f7441i = l10;
        this.f7444l = i10 == 1 ? f10 != null ? Double.valueOf(f10.doubleValue()) : null : d10;
        this.f7442j = str2;
        this.f7443k = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        se.a(this, parcel, i10);
    }

    public final Object zza() {
        Long l10 = this.f7441i;
        if (l10 != null) {
            return l10;
        }
        Double d10 = this.f7444l;
        if (d10 != null) {
            return d10;
        }
        String str = this.f7442j;
        if (str != null) {
            return str;
        }
        return null;
    }

    public zzpl(te teVar) {
        this(teVar.f25996c, teVar.f25997d, teVar.f25998e, teVar.b);
    }

    public zzpl(String str, long j10, Object obj, String str2) {
        m.f(str);
        this.f7438f = 2;
        this.f7439g = str;
        this.f7440h = j10;
        this.f7443k = str2;
        if (obj == null) {
            this.f7441i = null;
            this.f7444l = null;
            this.f7442j = null;
            return;
        }
        if (obj instanceof Long) {
            this.f7441i = (Long) obj;
            this.f7444l = null;
            this.f7442j = null;
        } else if (obj instanceof String) {
            this.f7441i = null;
            this.f7444l = null;
            this.f7442j = (String) obj;
        } else {
            if (obj instanceof Double) {
                this.f7441i = null;
                this.f7444l = (Double) obj;
                this.f7442j = null;
                return;
            }
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }
}
