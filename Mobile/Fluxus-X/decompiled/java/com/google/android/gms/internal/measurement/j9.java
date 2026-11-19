package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.github.luben.zstd.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class j9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f6561a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f6563d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f6564e;

    public j9(String str, Uri uri, String str2, String str3, boolean z10, boolean z11, boolean z12, boolean z13, je.f fVar) {
        this.f6561a = uri;
        this.b = BuildConfig.FLAVOR;
        this.f6562c = BuildConfig.FLAVOR;
        this.f6563d = z10;
        this.f6564e = z12;
    }

    public final j9 a() {
        String str = this.b;
        if (str.isEmpty()) {
            return new j9(null, this.f6561a, str, this.f6562c, true, false, this.f6564e, false, null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final j9 b() {
        return new j9(null, this.f6561a, this.b, this.f6562c, this.f6563d, false, true, false, null);
    }

    public final p9 c(String str, long j10) {
        Long lValueOf = Long.valueOf(j10);
        Object obj = p9.f6771g;
        return new f9(this, str, lValueOf, true);
    }

    public final p9 d(String str, boolean z10) {
        Boolean boolValueOf = Boolean.valueOf(z10);
        Object obj = p9.f6771g;
        return new g9(this, str, boolValueOf, true);
    }

    public final p9 e(String str, double d10) {
        Double dValueOf = Double.valueOf(-3.0d);
        Object obj = p9.f6771g;
        return new h9(this, "measurement.test.double_flag", dValueOf, true);
    }

    public final p9 f(String str, String str2) {
        Object obj = p9.f6771g;
        return new i9(this, str, str2, true);
    }

    public j9(Uri uri) {
        this(null, uri, BuildConfig.FLAVOR, BuildConfig.FLAVOR, false, false, false, false, null);
    }
}
