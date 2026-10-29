package ae;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class n0 {
    public static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }
}
