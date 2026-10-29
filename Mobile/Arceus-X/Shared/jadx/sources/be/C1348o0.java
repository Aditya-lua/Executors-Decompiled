package be;

import android.content.Context;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: be.o0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1348o0 {

    /* JADX INFO: renamed from: a */
    public final Context f5392a;

    public C1348o0(Context context) {
        this.f5392a = context;
    }

    /* JADX INFO: renamed from: b */
    public static String m7193b(Locale locale) {
        return String.valueOf(locale.getLanguage()).concat(locale.getCountry().isEmpty() ? "" : "_".concat(String.valueOf(locale.getCountry())));
    }

    /* JADX INFO: renamed from: a */
    public final List m7194a() {
        LocaleList locales = this.f5392a.getResources().getConfiguration().getLocales();
        ArrayList arrayList = new ArrayList(locales.size());
        for (int i10 = 0; i10 < locales.size(); i10++) {
            arrayList.add(m7193b(locales.get(i10)));
        }
        return arrayList;
    }
}
