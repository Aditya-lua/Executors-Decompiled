package rh;

import android.content.Context;
import sg.q0;

/* JADX INFO: loaded from: classes2.dex */
public class b {
    public static String a(Context context, String str) {
        if (context == null) {
            return null;
        }
        str.getClass();
        switch (str) {
            case "SETTINGS_TAG":
                return context.getString(q0.L);
            case "FRIENDS_TAG":
                return context.getString(q0.C);
            case "MESSAGES_TAG":
                return context.getString(q0.F);
            case "CATALOG_TAG":
                return context.getString(q0.A);
            default:
                return null;
        }
    }
}
