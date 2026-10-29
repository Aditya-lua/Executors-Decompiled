package jo;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.C7691l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: jo.z */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m31665d2 = {"", "countryCode", "a", "(Ljava/lang/String;)Ljava/lang/String;", "government-id_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7242z {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m30208a(@NotNull String countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        if (countryCode.length() != 2) {
            return "";
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
        return new String(C7691l.m31828w(chars, chars2));
    }
}
