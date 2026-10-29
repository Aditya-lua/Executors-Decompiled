package p412rh;

import android.content.Context;
import sg.C11347q0;

/* JADX INFO: renamed from: rh.b */
/* JADX INFO: loaded from: classes2.dex */
public class C10881b {
    /* JADX INFO: renamed from: a */
    public static String m41435a(Context context, String str) {
        if (context == null) {
            return null;
        }
        str.getClass();
        switch (str) {
            case "SETTINGS_TAG":
                return context.getString(C11347q0.f39923L);
            case "FRIENDS_TAG":
                return context.getString(C11347q0.f39902C);
            case "MESSAGES_TAG":
                return context.getString(C11347q0.f39911F);
            case "CATALOG_TAG":
                return context.getString(C11347q0.f39896A);
            default:
                return null;
        }
    }
}
