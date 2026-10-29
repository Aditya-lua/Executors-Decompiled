package p347p0;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import java.util.Objects;

/* JADX INFO: renamed from: p0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C10090f {

    /* JADX INFO: renamed from: p0.f$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static Context m38913a(Context context, String str) {
            return context.createAttributionContext(str);
        }

        /* JADX INFO: renamed from: b */
        public static String m38914b(Context context) {
            return context.getAttributionTag();
        }
    }

    /* JADX INFO: renamed from: p0.f$b */
    public static class b {
        /* JADX INFO: renamed from: a */
        public static Context m38915a(Context context, int i10) {
            return context.createDeviceContext(i10);
        }

        /* JADX INFO: renamed from: b */
        public static int m38916b(Context context) {
            return context.getDeviceId();
        }
    }

    /* JADX INFO: renamed from: a */
    public static Context m38911a(Context context) {
        int iM38916b;
        Context applicationContext = context.getApplicationContext();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34 && (iM38916b = b.m38916b(context)) != b.m38916b(applicationContext)) {
            applicationContext = b.m38915a(applicationContext, iM38916b);
        }
        if (i10 >= 30) {
            String strM38914b = a.m38914b(context);
            if (!Objects.equals(strM38914b, a.m38914b(applicationContext))) {
                return a.m38913a(applicationContext, strM38914b);
            }
        }
        return applicationContext;
    }

    /* JADX INFO: renamed from: b */
    public static Application m38912b(Context context) {
        for (Context contextM38911a = m38911a(context); contextM38911a instanceof ContextWrapper; contextM38911a = ((ContextWrapper) contextM38911a).getBaseContext()) {
            if (contextM38911a instanceof Application) {
                return (Application) contextM38911a;
            }
        }
        return null;
    }
}
