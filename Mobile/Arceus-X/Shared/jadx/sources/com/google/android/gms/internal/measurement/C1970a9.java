package com.google.android.gms.internal.measurement;

import android.net.Uri;
import p504w1.C12277a;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.a9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1970a9 {

    /* JADX INFO: renamed from: a */
    public static final C12277a f8093a = new C12277a();

    /* JADX INFO: renamed from: a */
    public static synchronized Uri m9762a(String str) {
        C12277a c12277a = f8093a;
        Uri uri = (Uri) c12277a.get("com.google.android.gms.measurement");
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
        c12277a.put("com.google.android.gms.measurement", uri2);
        return uri2;
    }
}
