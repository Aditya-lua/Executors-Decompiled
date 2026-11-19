package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.github.luben.zstd.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class v8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1.j f6878a;

    public v8(w1.j jVar) {
        this.f6878a = jVar;
    }

    public final String a(Uri uri, String str, String str2, String str3) {
        w1.j jVar = uri != null ? (w1.j) this.f6878a.get(uri.toString()) : null;
        if (jVar == null) {
            return null;
        }
        return (String) jVar.get(BuildConfig.FLAVOR.concat(str3));
    }
}
