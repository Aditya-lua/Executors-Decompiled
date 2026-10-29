package p559xt;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import p088e.C4711j0;
import p229jt.C7328a;

/* JADX INFO: renamed from: xt.a */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u0004*\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006*\f\b\u0007\u0010\u0007\"\u00020\u00002\u00020\u0000¨\u0006\b"}, m31665d2 = {"Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "", "cause", "", "a", "(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V", "AutoCloseable", "kotlin-stdlib"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C12915a {
    /* JADX INFO: renamed from: a */
    public static final void m47941a(@Nullable AutoCloseable autoCloseable, @Nullable Throwable th2) throws Exception {
        if (autoCloseable != null) {
            if (th2 == null) {
                C4711j0.m23003a(autoCloseable);
                return;
            }
            try {
                C4711j0.m23003a(autoCloseable);
            } catch (Throwable th3) {
                C7328a.m30429a(th2, th3);
            }
        }
    }
}
