package p226jq;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: jq.o0 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, m31665d2 = {"Ljq/o0;", "", "<init>", "()V", "Ljq/n0;", "a", "()Ljq/n0;", "Ljava/util/concurrent/atomic/AtomicInteger;", "b", "Ljava/util/concurrent/atomic/AtomicInteger;", "viewTypeGeneratorCount", "shared_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7276o0 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C7276o0 f28033a = new C7276o0();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static AtomicInteger viewTypeGeneratorCount = new AtomicInteger(0);

    @NotNull
    /* JADX INFO: renamed from: a */
    public final C7274n0 m30317a() {
        return new C7274n0((viewTypeGeneratorCount.getAndIncrement() * 4096) + 268435456);
    }
}
