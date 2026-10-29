package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e8 */
/* JADX INFO: loaded from: classes.dex */
public final class C2045e8 {

    /* JADX INFO: renamed from: a */
    public static final Uri f8159a = Uri.parse("content://com.google.android.gsf.gservices");

    /* JADX INFO: renamed from: b */
    public static final Uri f8160b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* JADX INFO: renamed from: c */
    public static final Pattern f8161c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* JADX INFO: renamed from: d */
    public static final Pattern f8162d = Pattern.compile("^(0|false|f|off|no|n)$", 2);
}
