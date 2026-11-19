package nv;

import com.github.luben.zstd.BuildConfig;
import java.io.EOFException;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lew/g;", BuildConfig.FLAVOR, "codePointLimit", BuildConfig.FLAVOR, "a", "(Lew/g;J)Z", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c {
    public static final boolean a(@NotNull ew.g gVar, long j10) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        try {
            ew.g gVarPeek = gVar.peek();
            for (long j11 = 0; j11 < j10 && !gVarPeek.c2(); j11++) {
                int iE2 = gVarPeek.E2();
                if (Character.isISOControl(iE2) && !Character.isWhitespace(iE2)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
