package p456u2;

import android.content.Context;
import android.os.UserManager;

/* JADX INFO: renamed from: u2.p */
/* JADX INFO: loaded from: classes.dex */
public class C11787p {

    /* JADX INFO: renamed from: u2.p$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static boolean m44086a(Context context) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m44085a(Context context) {
        return a.m44086a(context);
    }
}
