package com.google.firebase.messaging;

import java.util.Locale;

/* JADX INFO: renamed from: com.google.firebase.messaging.q0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3017q0 extends Exception {

    /* JADX INFO: renamed from: a */
    public final int f11311a;

    public C3017q0(String str) {
        super(str);
        this.f11311a = m14636a(str);
    }

    /* JADX INFO: renamed from: a */
    public final int m14636a(String str) {
        if (str == null) {
            return 0;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        lowerCase.getClass();
        switch (lowerCase) {
            case "service_not_available":
                return 3;
            case "toomanymessages":
                return 4;
            case "invalid_parameters":
            case "missing_to":
                return 1;
            case "messagetoobig":
                return 2;
            default:
                return 0;
        }
    }
}
