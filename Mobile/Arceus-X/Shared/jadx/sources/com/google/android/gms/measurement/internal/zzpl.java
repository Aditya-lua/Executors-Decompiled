package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p305n9.C8953m;
import p306nb.C9293se;
import p306nb.C9309te;

/* JADX INFO: loaded from: classes.dex */
public final class zzpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpl> CREATOR = new C9293se();

    /* JADX INFO: renamed from: f */
    public final int f9518f;

    /* JADX INFO: renamed from: g */
    public final String f9519g;

    /* JADX INFO: renamed from: h */
    public final long f9520h;

    /* JADX INFO: renamed from: i */
    public final Long f9521i;

    /* JADX INFO: renamed from: j */
    public final String f9522j;

    /* JADX INFO: renamed from: k */
    public final String f9523k;

    /* JADX INFO: renamed from: l */
    public final Double f9524l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public zzpl(int i10, String str, long j10, Long l10, Float f10, String str2, String str3, Double d10) {
        this.f9518f = i10;
        this.f9519g = str;
        this.f9520h = j10;
        this.f9521i = l10;
        this.f9524l = i10 == 1 ? f10 != null ? Double.valueOf(f10.doubleValue()) : null : d10;
        this.f9522j = str2;
        this.f9523k = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        C9293se.m36777a(this, parcel, i10);
    }

    public final Object zza() {
        Long l10 = this.f9521i;
        if (l10 != null) {
            return l10;
        }
        Double d10 = this.f9524l;
        if (d10 != null) {
            return d10;
        }
        String str = this.f9522j;
        if (str != null) {
            return str;
        }
        return null;
    }

    public zzpl(C9309te c9309te) {
        this(c9309te.f33519c, c9309te.f33520d, c9309te.f33521e, c9309te.f33518b);
    }

    public zzpl(String str, long j10, Object obj, String str2) {
        C8953m.m36041f(str);
        this.f9518f = 2;
        this.f9519g = str;
        this.f9520h = j10;
        this.f9523k = str2;
        if (obj == null) {
            this.f9521i = null;
            this.f9524l = null;
            this.f9522j = null;
            return;
        }
        if (obj instanceof Long) {
            this.f9521i = (Long) obj;
            this.f9524l = null;
            this.f9522j = null;
        } else if (obj instanceof String) {
            this.f9521i = null;
            this.f9524l = null;
            this.f9522j = (String) obj;
        } else {
            if (obj instanceof Double) {
                this.f9521i = null;
                this.f9524l = (Double) obj;
                this.f9522j = null;
                return;
            }
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }
}
