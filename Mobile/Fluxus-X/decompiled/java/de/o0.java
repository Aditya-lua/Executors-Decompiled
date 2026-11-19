package de;

import android.content.Context;
import android.os.LocaleList;
import com.github.luben.zstd.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f12223a;

    public o0(Context context) {
        this.f12223a = context;
    }

    public static String b(Locale locale) {
        return String.valueOf(locale.getLanguage()).concat(locale.getCountry().isEmpty() ? BuildConfig.FLAVOR : "_".concat(String.valueOf(locale.getCountry())));
    }

    public final List a() {
        LocaleList locales = this.f12223a.getResources().getConfiguration().getLocales();
        ArrayList arrayList = new ArrayList(locales.size());
        for (int i10 = 0; i10 < locales.size(); i10++) {
            arrayList.add(b(locales.get(i10)));
        }
        return arrayList;
    }
}
