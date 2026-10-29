package okhttp3.internal;

import java.io.EOFException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p560xu.InterfaceC12928g;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m31665d2 = {"Lxu/g;", "", "codePointLimit", "", "isProbablyUtf8", "(Lxu/g;J)Z", "okhttp"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class IsProbablyUtf8Kt {
    public static final boolean isProbablyUtf8(@NotNull InterfaceC12928g interfaceC12928g, long j10) {
        Intrinsics.checkNotNullParameter(interfaceC12928g, "<this>");
        try {
            InterfaceC12928g interfaceC12928gPeek = interfaceC12928g.peek();
            for (long j11 = 0; j11 < j10 && !interfaceC12928gPeek.mo48016Z1(); j11++) {
                int iMo47991A2 = interfaceC12928gPeek.mo47991A2();
                if (Character.isISOControl(iMo47991A2) && !Character.isWhitespace(iMo47991A2)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static /* synthetic */ boolean isProbablyUtf8$default(InterfaceC12928g interfaceC12928g, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = Long.MAX_VALUE;
        }
        return isProbablyUtf8(interfaceC12928g, j10);
    }
}
