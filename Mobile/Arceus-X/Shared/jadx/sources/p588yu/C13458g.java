package p588yu;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p560xu.C12945o0;

/* JADX INFO: renamed from: yu.g */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\t\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m31665d2 = {"", "", "value", "fromIndex", "toIndex", "a", "([IIII)I", "Lxu/o0;", "pos", "b", "(Lxu/o0;I)I", "okio"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C13458g {
    /* JADX INFO: renamed from: a */
    public static final int m49099a(@NotNull int[] iArr, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int i13 = i12 - 1;
        while (i11 <= i13) {
            int i14 = (i11 + i13) >>> 1;
            int i15 = iArr[i14];
            if (i15 < i10) {
                i11 = i14 + 1;
            } else {
                if (i15 <= i10) {
                    return i14;
                }
                i13 = i14 - 1;
            }
        }
        return (-i11) - 1;
    }

    /* JADX INFO: renamed from: b */
    public static final int m49100b(@NotNull C12945o0 c12945o0, int i10) {
        Intrinsics.checkNotNullParameter(c12945o0, "<this>");
        int iM49099a = m49099a(c12945o0.getDirectory(), i10 + 1, 0, c12945o0.getSegments().length);
        return iM49099a >= 0 ? iM49099a : ~iM49099a;
    }
}
