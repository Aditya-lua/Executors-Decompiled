package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class r8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1.j f6761a;

    public r8(w1.j jVar) {
        this.f6761a = jVar;
    }

    public final String a(Uri uri, String str, String str2, String str3) {
        w1.j jVar = uri != null ? (w1.j) this.f6761a.get(uri.toString()) : null;
        if (jVar == null) {
            return null;
        }
        return (String) jVar.get("".concat(str3));
    }
}
