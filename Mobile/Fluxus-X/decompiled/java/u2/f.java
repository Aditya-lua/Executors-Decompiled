package u2;

import android.content.res.Configuration;
import android.os.LocaleList;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    public static class a {
        public static LocaleList a(Configuration configuration) {
            return configuration.getLocales();
        }
    }

    public static j a(Configuration configuration) {
        return j.h(a.a(configuration));
    }
}
