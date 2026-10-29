package com.google.android.gms.internal.measurement;

import android.net.Uri;
import p169he.InterfaceC6376f;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.f9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2065f9 {

    /* JADX INFO: renamed from: a */
    public final Uri f8178a;

    /* JADX INFO: renamed from: b */
    public final String f8179b;

    /* JADX INFO: renamed from: c */
    public final String f8180c;

    /* JADX INFO: renamed from: d */
    public final boolean f8181d;

    /* JADX INFO: renamed from: e */
    public final boolean f8182e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2065f9(String str, Uri uri, String str2, String str3, boolean z10, boolean z11, boolean z12, boolean z13, InterfaceC6376f interfaceC6376f) {
        this.f8178a = uri;
        this.f8179b = "";
        this.f8180c = "";
        this.f8181d = z10;
        this.f8182e = z12;
    }

    /* JADX INFO: renamed from: a */
    public final C2065f9 m10008a() {
        String str = this.f8179b;
        if (str.isEmpty()) {
            return new C2065f9(null, this.f8178a, str, this.f8180c, true, false, this.f8182e, false, null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    /* JADX INFO: renamed from: b */
    public final C2065f9 m10009b() {
        return new C2065f9(null, this.f8178a, this.f8179b, this.f8180c, this.f8181d, false, true, false, null);
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC2175l9 m10010c(String str, long j10) {
        Long lValueOf = Long.valueOf(j10);
        Object obj = AbstractC2175l9.f8395g;
        return new C1989b9(this, str, lValueOf, true);
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC2175l9 m10011d(String str, boolean z10) {
        Boolean boolValueOf = Boolean.valueOf(z10);
        Object obj = AbstractC2175l9.f8395g;
        return new C2008c9(this, str, boolValueOf, true);
    }

    /* JADX INFO: renamed from: e */
    public final AbstractC2175l9 m10012e(String str, double d10) {
        Double dValueOf = Double.valueOf(-3.0d);
        Object obj = AbstractC2175l9.f8395g;
        return new C2027d9(this, "measurement.test.double_flag", dValueOf, true);
    }

    /* JADX INFO: renamed from: f */
    public final AbstractC2175l9 m10013f(String str, String str2) {
        Object obj = AbstractC2175l9.f8395g;
        return new C2046e9(this, str, str2, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C2065f9(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }
}
