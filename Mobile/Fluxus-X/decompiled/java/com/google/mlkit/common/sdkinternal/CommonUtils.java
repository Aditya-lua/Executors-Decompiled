package com.google.mlkit.common.sdkinternal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.github.luben.zstd.BuildConfig;
import java.util.Locale;
import o9.k;
import v9.m;

/* JADX INFO: loaded from: classes2.dex */
public class CommonUtils {
    private static final k zza = new k("CommonUtils", BuildConfig.FLAVOR);

    private CommonUtils() {
    }

    @NonNull
    public static String getAppVersion(@NonNull Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e10) {
            zza.d("CommonUtils", "Exception thrown when trying to get app version ".concat(e10.toString()));
            return BuildConfig.FLAVOR;
        }
    }

    @NonNull
    public static String languageTagFromLocale(@NonNull Locale locale) {
        if (m.e()) {
            return locale.toLanguageTag();
        }
        StringBuilder sb2 = new StringBuilder(locale.getLanguage());
        if (!TextUtils.isEmpty(locale.getCountry())) {
            sb2.append("-");
            sb2.append(locale.getCountry());
        }
        if (!TextUtils.isEmpty(locale.getVariant())) {
            sb2.append("-");
            sb2.append(locale.getVariant());
        }
        return sb2.toString();
    }
}
