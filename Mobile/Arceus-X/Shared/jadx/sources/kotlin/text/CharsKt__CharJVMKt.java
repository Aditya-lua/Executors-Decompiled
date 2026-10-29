package kotlin.text;

import kotlin.Metadata;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u001c\n\u0002\u0010\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001f\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\t\u0010\n\"\u0015\u0010\u000e\u001a\u00020\u000b*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, m31665d2 = {"", "", "c", "(C)Z", "char", "", "radix", "a", "(CI)I", "checkRadix", "(I)I", "Lkotlin/text/a;", "b", "(C)Lkotlin/text/a;", "category", "kotlin-stdlib"}, m31666k = 5, m31667mv = {2, 2, 0}, m31669xi = 49, m31670xs = "kotlin/text/CharsKt")
public class CharsKt__CharJVMKt {
    /* JADX INFO: renamed from: a */
    public static final int m32096a(char c10, int i10) {
        return Character.digit((int) c10, i10);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static EnumC7771a m32097b(char c10) {
        return EnumC7771a.INSTANCE.m32199a(Character.getType(c10));
    }

    /* JADX INFO: renamed from: c */
    public static boolean m32098c(char c10) {
        return Character.isWhitespace(c10) || Character.isSpaceChar(c10);
    }

    public static int checkRadix(int i10) {
        if (2 <= i10 && i10 < 37) {
            return i10;
        }
        throw new IllegalArgumentException("radix " + i10 + " was not in valid range " + new IntRange(2, 36));
    }
}
