package av;

import com.github.luben.zstd.BuildConfig;
import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0097@¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0017¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0014\u001a\u00020\u00132\u0018\u0010\u0012\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\b0\u000fj\u0002`\u0011H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J9\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0018\u0010\u0012\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\b0\u000fj\u0002`\u0011H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\b2\u000e\u0010\u001a\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\fH\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0017¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$R\u001a\u0010'\u001a\u00020\u00058VX\u0097\u0004¢\u0006\f\u0012\u0004\b&\u0010\u0004\u001a\u0004\b%\u0010\u0007R\u001a\u0010*\u001a\u00020\u00058VX\u0097\u0004¢\u0006\f\u0012\u0004\b)\u0010\u0004\u001a\u0004\b(\u0010\u0007R\u001a\u0010+\u001a\u00020\u00058VX\u0097\u0004¢\u0006\f\u0012\u0004\b,\u0010\u0004\u001a\u0004\b+\u0010\u0007R \u00101\u001a\b\u0012\u0004\u0012\u00020\u00020-8VX\u0097\u0004¢\u0006\f\u0012\u0004\b0\u0010\u0004\u001a\u0004\b.\u0010/¨\u00062"}, d2 = {"Lav/p2;", "Lkotlin/coroutines/a;", "Lav/d2;", "<init>", "()V", BuildConfig.FLAVOR, "start", "()Z", BuildConfig.FLAVOR, "z", "(Leu/b;)Ljava/lang/Object;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "k", "()Ljava/util/concurrent/CancellationException;", "Lkotlin/Function1;", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lav/i1;", "o", "(Lkotlin/jvm/functions/Function1;)Lav/i1;", "onCancelling", "invokeImmediately", "h", "(ZZLkotlin/jvm/functions/Function1;)Lav/i1;", "cause", "c", "(Ljava/util/concurrent/CancellationException;)V", "Lav/w;", "child", "Lav/u;", "E", "(Lav/w;)Lav/u;", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "b", "isActive$annotations", "isActive", "d", "isCompleted$annotations", "isCompleted", "isCancelled", "isCancelled$annotations", "Lkotlin/sequences/Sequence;", "getChildren", "()Lkotlin/sequences/Sequence;", "getChildren$annotations", "children", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p2 extends p001kotlin.coroutines.a implements d2 {

    @NotNull
    public static final p2 b = new p2();

    public p2() {
        super(d2.INSTANCE);
    }

    @Override // av.d2
    @NotNull
    public u E(@NotNull w child) {
        return q2.f3474a;
    }

    @Override // av.d2
    public boolean b() {
        return true;
    }

    @Override // av.d2
    public void c(@Nullable CancellationException cause) {
    }

    @Override // av.d2
    public boolean d() {
        return false;
    }

    @Override // av.d2
    @NotNull
    public Sequence<d2> getChildren() {
        return yu.m.g();
    }

    @Override // av.d2
    @NotNull
    public i1 h(boolean onCancelling, boolean invokeImmediately, @NotNull Function1<? super Throwable, Unit> handler) {
        return q2.f3474a;
    }

    @Override // av.d2
    public boolean isCancelled() {
        return false;
    }

    @Override // av.d2
    @NotNull
    public CancellationException k() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // av.d2
    @NotNull
    public i1 o(@NotNull Function1<? super Throwable, Unit> handler) {
        return q2.f3474a;
    }

    @Override // av.d2
    public boolean start() {
        return false;
    }

    @NotNull
    public String toString() {
        return "NonCancellable";
    }

    @Override // av.d2
    @Nullable
    public Object z(@NotNull eu.b<? super Unit> bVar) {
        throw new UnsupportedOperationException("This job is always active");
    }
}
