package com.google.android.gms.internal.measurement;

import android.net.Uri;
import p504w1.C12286j;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.r8 */
/* JADX INFO: loaded from: classes.dex */
public final class C2282r8 {

    /* JADX INFO: renamed from: a */
    public final C12286j f8609a;

    public C2282r8(C12286j c12286j) {
        this.f8609a = c12286j;
    }

    /* JADX INFO: renamed from: a */
    public final String m10626a(Uri uri, String str, String str2, String str3) {
        C12286j c12286j = uri != null ? (C12286j) this.f8609a.get(uri.toString()) : null;
        if (c12286j == null) {
            return null;
        }
        return (String) c12286j.get("".concat(str3));
    }
}
