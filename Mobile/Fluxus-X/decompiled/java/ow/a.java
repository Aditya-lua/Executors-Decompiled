package ow;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Context f28553a;

    @Deprecated
    public static Context a() {
        return f28553a;
    }

    public static void b(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("Application context cannot be null for ContextUtils.initialize.");
        }
        f28553a = context;
    }
}
