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
    public final int f7512f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f7513g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f7514h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Long f7515i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f7516j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f7517k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Double f7518l;

    public zzpl(int i10, String str, long j10, Long l10, Float f10, String str2, String str3, Double d10) {
        this.f7512f = i10;
        this.f7513g = str;
        this.f7514h = j10;
        this.f7515i = l10;
        this.f7518l = i10 == 1 ? f10 != null ? Double.valueOf(f10.doubleValue()) : null : d10;
        this.f7516j = str2;
        this.f7517k = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        se.a(this, parcel, i10);
    }

    public final Object zza() {
        Long l10 = this.f7515i;
        if (l10 != null) {
            return l10;
        }
        Double d10 = this.f7518l;
        if (d10 != null) {
            return d10;
        }
        String str = this.f7516j;
        if (str != null) {
            return str;
        }
        return null;
    }

    public zzpl(te teVar) {
        this(teVar.f26817c, teVar.f26818d, teVar.f26819e, teVar.b);
    }

    public zzpl(String str, long j10, Object obj, String str2) {
        m.f(str);
        this.f7512f = 2;
        this.f7513g = str;
        this.f7514h = j10;
        this.f7517k = str2;
        if (obj == null) {
            this.f7515i = null;
            this.f7518l = null;
            this.f7516j = null;
            return;
        }
        if (obj instanceof Long) {
            this.f7515i = (Long) obj;
            this.f7518l = null;
            this.f7516j = null;
        } else if (obj instanceof String) {
            this.f7515i = null;
            this.f7518l = null;
            this.f7516j = (String) obj;
        } else {
            if (obj instanceof Double) {
                this.f7515i = null;
                this.f7518l = (Double) obj;
                this.f7516j = null;
                return;
            }
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }
}
