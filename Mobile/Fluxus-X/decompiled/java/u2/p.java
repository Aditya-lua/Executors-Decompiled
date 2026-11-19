package u2;

import android.content.Context;
import android.os.UserManager;

/* JADX INFO: loaded from: classes.dex */
public class p {

    public static class a {
        public static boolean a(Context context) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
    }

    public static boolean a(Context context) {
        return a.a(context);
    }
}
