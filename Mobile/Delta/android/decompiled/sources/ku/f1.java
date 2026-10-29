package ku;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lku/f1;", "Ljava/util/concurrent/Executor;", "Lku/l0;", "dispatcher", "<init>", "(Lku/l0;)V", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "execute", "(Ljava/lang/Runnable;)V", "", "toString", "()Ljava/lang/String;", "a", "Lku/l0;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f1 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final l0 dispatcher;

    public f1(@NotNull l0 l0Var) {
        this.dispatcher = l0Var;
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NotNull Runnable block) throws b1 {
        l0 l0Var = this.dispatcher;
        kotlin.coroutines.e eVar = kotlin.coroutines.e.f22525a;
        if (qu.j.d(l0Var, eVar)) {
            qu.j.c(this.dispatcher, eVar, block);
        } else {
            block.run();
        }
    }

    @NotNull
    public String toString() {
        return this.dispatcher.getName();
    }
}
