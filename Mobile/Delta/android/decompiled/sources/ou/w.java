package ou;

import iu.i1;
import iu.v0;
import iu.y0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0013\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0017¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J&\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u0018H\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ,\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00162\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e2\u0006\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lou/w;", "Liu/l0;", "Liu/y0;", "dispatcher", "", "name", "<init>", "(Liu/l0;Ljava/lang/String;)V", "Lkotlin/coroutines/CoroutineContext;", "context", "", "I", "(Lkotlin/coroutines/CoroutineContext;)Z", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "w", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "x", "toString", "()Ljava/lang/String;", "", "timeMillis", "Liu/n;", "continuation", "g", "(JLiu/n;)V", "Liu/i1;", "j", "(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Liu/i1;", "d", "Liu/l0;", "e", "Ljava/lang/String;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class w extends iu.l0 implements y0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y0 f28234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final iu.l0 dispatcher;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String name;

    /* JADX WARN: Multi-variable type inference failed */
    public w(@NotNull iu.l0 l0Var, @NotNull String str) {
        y0 y0Var = l0Var instanceof y0 ? (y0) l0Var : null;
        this.f28234c = y0Var == null ? v0.a() : y0Var;
        this.dispatcher = l0Var;
        this.name = str;
    }

    @Override // iu.l0
    public boolean I(@NotNull CoroutineContext context) {
        return this.dispatcher.I(context);
    }

    @Override // iu.y0
    public void g(long timeMillis, @NotNull iu.n<? super Unit> continuation) {
        this.f28234c.g(timeMillis, continuation);
    }

    @Override // iu.y0
    @NotNull
    public i1 j(long timeMillis, @NotNull Runnable block, @NotNull CoroutineContext context) {
        return this.f28234c.j(timeMillis, block, context);
    }

    @Override // iu.l0
    @NotNull
    /* JADX INFO: renamed from: toString, reason: from getter */
    public String getName() {
        return this.name;
    }

    @Override // iu.l0
    public void w(@NotNull CoroutineContext context, @NotNull Runnable block) {
        this.dispatcher.w(context, block);
    }

    @Override // iu.l0
    public void x(@NotNull CoroutineContext context, @NotNull Runnable block) {
        this.dispatcher.x(context, block);
    }
}
