package kotlin.text;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C7764d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kotlin.text.c0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000$\n\u0002\u0010\r\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\b\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\b\u0010\u0003\u001a\u0011\u0010\t\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\t\u0010\u0003\u001a\u0019\u0010\f\u001a\u00020\n*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\r\u001a\u0019\u0010\u000e\u001a\u00020\n*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\r\u001a\u0019\u0010\u000f\u001a\u00020\n*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\r\u001a\u0019\u0010\u0010\u001a\u00020\n*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\r\u001a\u0011\u0010\u0011\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0011\u0010\u0014\u001a\u00020\u0013*\u00020\u0000¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m31665d2 = {"", "", "w1", "(Ljava/lang/CharSequence;)C", "", "index", "x1", "(Ljava/lang/CharSequence;I)Ljava/lang/Character;", "y1", "A1", "", "n", "u1", "(Ljava/lang/String;I)Ljava/lang/String;", "v1", "B1", "C1", "z1", "(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "", "t1", "(Ljava/lang/CharSequence;)Z", "kotlin-stdlib"}, m31666k = 5, m31667mv = {2, 2, 0}, m31669xi = 49, m31670xs = "kotlin/text/StringsKt")
public class C7776c0 extends C7774b0 {
    /* JADX INFO: renamed from: A1 */
    public static char m32208A1(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length();
        if (length == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (length == 1) {
            return charSequence.charAt(0);
        }
        throw new IllegalArgumentException("Char sequence has more than one element.");
    }

    @NotNull
    /* JADX INFO: renamed from: B1 */
    public static String m32209B1(@NotNull String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i10 >= 0) {
            String strSubstring = str.substring(0, C7764d.m32081f(i10, str.length()));
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    @NotNull
    /* JADX INFO: renamed from: C1 */
    public static String m32210C1(@NotNull String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i10 >= 0) {
            int length = str.length();
            String strSubstring = str.substring(length - C7764d.m32081f(i10, length));
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    /* JADX INFO: renamed from: t1 */
    public static boolean m32211t1(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return !(charSequence.length() == 0);
    }

    @NotNull
    /* JADX INFO: renamed from: u1 */
    public static String m32212u1(@NotNull String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i10 >= 0) {
            String strSubstring = str.substring(C7764d.m32081f(i10, str.length()));
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    @NotNull
    /* JADX INFO: renamed from: v1 */
    public static String m32213v1(@NotNull String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i10 >= 0) {
            return m32209B1(str, C7764d.m32078c(str.length() - i10, 0));
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    /* JADX INFO: renamed from: w1 */
    public static char m32214w1(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(0);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    @Nullable
    /* JADX INFO: renamed from: x1 */
    public static Character m32215x1(@NotNull CharSequence charSequence, int i10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i10 < 0 || i10 >= charSequence.length()) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(i10));
    }

    /* JADX INFO: renamed from: y1 */
    public static char m32216y1(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(StringsKt__StringsKt.m32166h0(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    @NotNull
    /* JADX INFO: renamed from: z1 */
    public static CharSequence m32217z1(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return new StringBuilder(charSequence).reverse();
    }
}
