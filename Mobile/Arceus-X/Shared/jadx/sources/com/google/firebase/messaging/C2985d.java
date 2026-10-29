package com.google.firebase.messaging;

import android.os.Bundle;
import java.util.concurrent.TimeUnit;
import p504w1.C12277a;

/* JADX INFO: renamed from: com.google.firebase.messaging.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C2985d {

    /* JADX INFO: renamed from: a */
    public static final long f11259a = TimeUnit.MINUTES.toMillis(3);

    /* JADX INFO: renamed from: com.google.firebase.messaging.d$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static C12277a<String, String> m14508a(Bundle bundle) {
            C12277a<String, String> c12277a = new C12277a<>();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        c12277a.put(str, str2);
                    }
                }
            }
            return c12277a;
        }
    }
}
