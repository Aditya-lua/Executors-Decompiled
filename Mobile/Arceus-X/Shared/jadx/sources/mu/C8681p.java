package mu;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p256ku.C7915r1;

/* JADX INFO: renamed from: mu.p */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a!\u0010\u0004\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0007\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"Lmu/x;", "", "cause", "", "a", "(Lmu/x;Ljava/lang/Throwable;)V", "", "DEFAULT_CLOSE_MESSAGE", "Ljava/lang/String;", "kotlinx-coroutines-core"}, m31666k = 5, m31667mv = {2, 1, 0}, m31669xi = 48, m31670xs = "kotlinx/coroutines/channels/ChannelsKt")
public final /* synthetic */ class C8681p {
    /* JADX INFO: renamed from: a */
    public static final void m34960a(@NotNull InterfaceC8689x<?> interfaceC8689x, @Nullable Throwable th2) {
        CancellationException cancellationExceptionM32905a = null;
        if (th2 != null) {
            cancellationExceptionM32905a = th2 instanceof CancellationException ? (CancellationException) th2 : null;
            if (cancellationExceptionM32905a == null) {
                cancellationExceptionM32905a = C7915r1.m32905a("Channel was consumed, consumer had failed", th2);
            }
        }
        interfaceC8689x.mo34836c(cancellationExceptionM32905a);
    }
}
