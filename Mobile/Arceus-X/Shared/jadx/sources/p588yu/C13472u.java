package p588yu;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: yu.u */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31665d2 = {"Ljava/util/concurrent/atomic/AtomicInteger;", "", "bits", "a", "(Ljava/util/concurrent/atomic/AtomicInteger;I)I", "okio"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C13472u {
    /* JADX INFO: renamed from: a */
    public static final int m49156a(@NotNull AtomicInteger atomicInteger, int i10) {
        int i11;
        int i12;
        Intrinsics.checkNotNullParameter(atomicInteger, "<this>");
        do {
            i11 = atomicInteger.get();
            if ((i11 & i10) != 0) {
                return 0;
            }
            i12 = i11 | i10;
        } while (!atomicInteger.compareAndSet(i11, i12));
        return i12;
    }
}
