package i3;

import f3.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0006\u0018\u0000 \u00062\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Li3/b;", "Lf3/f;", "", "errorMessage", "<init>", "(Ljava/lang/CharSequence;)V", "d", "a", "credentials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b extends f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull CharSequence errorMessage) {
        super("androidx.credentials.TYPE_E2EE_UNAVAILABLE_EXCEPTION", errorMessage);
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
    }
}
