package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class f9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f6513a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f6515d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f6516e;

    public f9(String str, Uri uri, String str2, String str3, boolean z10, boolean z11, boolean z12, boolean z13, he.f fVar) {
        this.f6513a = uri;
        this.b = "";
        this.f6514c = "";
        this.f6515d = z10;
        this.f6516e = z12;
    }

    public final f9 a() {
        String str = this.b;
        if (str.isEmpty()) {
            return new f9(null, this.f6513a, str, this.f6514c, true, false, this.f6516e, false, null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final f9 b() {
        return new f9(null, this.f6513a, this.b, this.f6514c, this.f6515d, false, true, false, null);
    }

    public final l9 c(String str, long j10) {
        Long lValueOf = Long.valueOf(j10);
        Object obj = l9.f6676g;
        return new b9(this, str, lValueOf, true);
    }

    public final l9 d(String str, boolean z10) {
        Boolean boolValueOf = Boolean.valueOf(z10);
        Object obj = l9.f6676g;
        return new c9(this, str, boolValueOf, true);
    }

    public final l9 e(String str, double d10) {
        Double dValueOf = Double.valueOf(-3.0d);
        Object obj = l9.f6676g;
        return new d9(this, "measurement.test.double_flag", dValueOf, true);
    }

    public final l9 f(String str, String str2) {
        Object obj = l9.f6676g;
        return new e9(this, str, str2, true);
    }

    public f9(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }
}
