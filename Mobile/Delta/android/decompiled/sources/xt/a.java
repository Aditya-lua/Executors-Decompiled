package xt;

import e.j0;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u0004*\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006*\f\b\u0007\u0010\u0007\"\u00020\u00002\u00020\u0000¨\u0006\b"}, d2 = {"Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "", "cause", "", "a", "(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V", "AutoCloseable", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {
    public static final void a(@Nullable AutoCloseable autoCloseable, @Nullable Throwable th2) throws Exception {
        if (autoCloseable != null) {
            if (th2 == null) {
                j0.a(autoCloseable);
                return;
            }
            try {
                j0.a(autoCloseable);
            } catch (Throwable th3) {
                jt.a.a(th2, th3);
            }
        }
    }
}
