package p395qu;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: qu.d */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\"D\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00022\u0006\u0010\u0003\u001a\u00028\u00008@@@X\u0080\u000e¢\u0006\u0012\u0012\u0004\b\b\u0010\t\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m31665d2 = {"T", "Ljava/util/concurrent/atomic/AtomicReference;", "Lkotlinx/coroutines/internal/WorkaroundAtomicReference;", "value", "a", "(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Object;", "b", "(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;)V", "getValue$annotations", "(Ljava/util/concurrent/atomic/AtomicReference;)V", "kotlinx-coroutines-core"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C10716d {
    /* JADX INFO: renamed from: a */
    public static final <T> T m40835a(@NotNull AtomicReference<T> atomicReference) {
        return atomicReference.get();
    }

    /* JADX INFO: renamed from: b */
    public static final <T> void m40836b(@NotNull AtomicReference<T> atomicReference, T t8) {
        atomicReference.set(t8);
    }
}
