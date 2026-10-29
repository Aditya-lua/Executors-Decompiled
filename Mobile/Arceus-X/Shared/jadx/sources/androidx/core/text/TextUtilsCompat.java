package androidx.core.text;

import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class TextUtilsCompat {
    private static final String ARAB_SCRIPT_SUBTAG = "Arab";
    private static final String HEBR_SCRIPT_SUBTAG = "Hebr";
    private static final Locale ROOT = new Locale("", "");

    @NonNull
    public static String htmlEncode(@NonNull String s8) {
        if (Build.VERSION.SDK_INT >= 17) {
            return TextUtils.htmlEncode(s8);
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < s8.length(); i10++) {
            char c10 = s8.charAt(i10);
            switch (c10) {
                case '\"':
                    sb2.append("&quot;");
                    break;
                case '&':
                    sb2.append("&amp;");
                    break;
                case '\'':
                    sb2.append("&#39;");
                    break;
                case '<':
                    sb2.append("&lt;");
                    break;
                case '>':
                    sb2.append("&gt;");
                    break;
                default:
                    sb2.append(c10);
                    break;
            }
        }
        return sb2.toString();
    }

    public static int getLayoutDirectionFromLocale(@Nullable Locale locale) {
        if (Build.VERSION.SDK_INT >= 17) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
        if (locale != null && !locale.equals(ROOT)) {
            String scriptSubtag = ICUCompat.maximizeAndGetScript(locale);
            if (scriptSubtag == null) {
                return getLayoutDirectionFromFirstChar(locale);
            }
            if (scriptSubtag.equalsIgnoreCase(ARAB_SCRIPT_SUBTAG) || scriptSubtag.equalsIgnoreCase(HEBR_SCRIPT_SUBTAG)) {
                return 1;
            }
            return 0;
        }
        return 0;
    }

    private static int getLayoutDirectionFromFirstChar(@NonNull Locale locale) {
        switch (Character.getDirectionality(locale.getDisplayName(locale).charAt(0))) {
            case 1:
            case 2:
                return 1;
            default:
                return 0;
        }
    }

    private TextUtilsCompat() {
    }
}
