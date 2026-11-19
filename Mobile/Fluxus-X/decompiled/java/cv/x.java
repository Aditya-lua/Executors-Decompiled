package cv;

import com.github.luben.zstd.BuildConfig;
import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u0010\u0010\u0003\u001a\u00028\u0000H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H¦@¢\u0006\u0004\b\u0006\u0010\u0004J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH¦\u0002¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u00020\u000f2\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\rH&¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00128&X§\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR \u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcv/x;", "E", BuildConfig.FLAVOR, "x", "(Leu/b;)Ljava/lang/Object;", "Lcv/k;", "p", "F", "()Ljava/lang/Object;", "Lcv/i;", "iterator", "()Lcv/i;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", BuildConfig.FLAVOR, "c", "(Ljava/util/concurrent/CancellationException;)V", BuildConfig.FLAVOR, "g", "()Z", "isClosedForReceive$annotations", "()V", "isClosedForReceive", "Ljv/h;", "A", "()Ljv/h;", "onReceive", "B", "onReceiveCatching", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface x<E> {
    @NotNull
    jv.h<E> A();

    @NotNull
    jv.h<k<E>> B();

    @NotNull
    Object F();

    void c(@Nullable CancellationException cause);

    boolean g();

    @NotNull
    i<E> iterator();

    @Nullable
    Object p(@NotNull eu.b<? super k<? extends E>> bVar);

    @Nullable
    Object x(@NotNull eu.b<? super E> bVar);
}
