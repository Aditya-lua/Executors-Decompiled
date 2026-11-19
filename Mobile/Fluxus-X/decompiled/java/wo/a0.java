package wo;

import com.github.luben.zstd.BuildConfig;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {BuildConfig.FLAVOR, "countryCode", "a", "(Ljava/lang/String;)Ljava/lang/String;", "government-id_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a0 {
    @NotNull
    public static final String a(@NotNull String countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        if (countryCode.length() != 2) {
            return BuildConfig.FLAVOR;
        }
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        String upperCase = countryCode.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        int iCodePointAt = Character.codePointAt(upperCase, 0) - (-127397);
        int iCodePointAt2 = Character.codePointAt(upperCase, 1) - (-127397);
        char[] chars = Character.toChars(iCodePointAt);
        Intrinsics.checkNotNullExpressionValue(chars, "toChars(...)");
        char[] chars2 = Character.toChars(iCodePointAt2);
        Intrinsics.checkNotNullExpressionValue(chars2, "toChars(...)");
        return new String(p001kotlin.collections.l.w(chars, chars2));
    }
}
