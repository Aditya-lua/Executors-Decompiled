package androidx.core.text;

import android.os.Build;
import android.util.Log;
import androidx.annotation.Nullable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class ICUCompat {
    private static final String TAG = "ICUCompat";
    private static Method sAddLikelySubtagsMethod;
    private static Method sGetScriptMethod;

    static {
        if (Build.VERSION.SDK_INT < 21) {
            try {
                Class<?> clazz = Class.forName("libcore.icu.ICU");
                sGetScriptMethod = clazz.getMethod("getScript", String.class);
                sAddLikelySubtagsMethod = clazz.getMethod("addLikelySubtags", String.class);
                return;
            } catch (Exception e10) {
                sGetScriptMethod = null;
                sAddLikelySubtagsMethod = null;
                Log.w(TAG, e10);
                return;
            }
        }
        try {
            sAddLikelySubtagsMethod = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
        } catch (Exception e11) {
            throw new IllegalStateException(e11);
        }
    }

    @Nullable
    public static String maximizeAndGetScript(Locale locale) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                Object[] args = {locale};
                return ((Locale) sAddLikelySubtagsMethod.invoke(null, args)).getScript();
            } catch (IllegalAccessException e10) {
                Log.w(TAG, e10);
                return locale.getScript();
            } catch (InvocationTargetException e11) {
                Log.w(TAG, e11);
                return locale.getScript();
            }
        }
        String localeWithSubtags = addLikelySubtags(locale);
        if (localeWithSubtags != null) {
            return getScript(localeWithSubtags);
        }
        return null;
    }

    private static String getScript(String localeStr) {
        try {
            Method method = sGetScriptMethod;
            if (method != null) {
                Object[] args = {localeStr};
                return (String) method.invoke(null, args);
            }
        } catch (IllegalAccessException e10) {
            Log.w(TAG, e10);
        } catch (InvocationTargetException e11) {
            Log.w(TAG, e11);
        }
        return null;
    }

    private static String addLikelySubtags(Locale locale) {
        String localeStr = locale.toString();
        try {
            Method method = sAddLikelySubtagsMethod;
            if (method != null) {
                Object[] args = {localeStr};
                return (String) method.invoke(null, args);
            }
        } catch (IllegalAccessException e10) {
            Log.w(TAG, e10);
        } catch (InvocationTargetException e11) {
            Log.w(TAG, e11);
        }
        return localeStr;
    }

    private ICUCompat() {
    }
}
