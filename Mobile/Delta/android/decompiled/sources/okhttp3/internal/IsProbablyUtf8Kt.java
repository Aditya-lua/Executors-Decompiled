package okhttp3.internal;

import java.io.EOFException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xu.g;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lxu/g;", "", "codePointLimit", "", "isProbablyUtf8", "(Lxu/g;J)Z", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class IsProbablyUtf8Kt {
    public static final boolean isProbablyUtf8(@NotNull g gVar, long j10) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        try {
            g gVarPeek = gVar.peek();
            for (long j11 = 0; j11 < j10 && !gVarPeek.Z1(); j11++) {
                int iA2 = gVarPeek.A2();
                if (Character.isISOControl(iA2) && !Character.isWhitespace(iA2)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static /* synthetic */ boolean isProbablyUtf8$default(g gVar, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = Long.MAX_VALUE;
        }
        return isProbablyUtf8(gVar, j10);
    }
}
