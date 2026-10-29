package p256ku;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.C7721e;
import org.jetbrains.annotations.NotNull;
import p395qu.C10728j;

/* JADX INFO: renamed from: ku.f1 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m31665d2 = {"Lku/f1;", "Ljava/util/concurrent/Executor;", "Lku/l0;", "dispatcher", "<init>", "(Lku/l0;)V", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "execute", "(Ljava/lang/Runnable;)V", "", "toString", "()Ljava/lang/String;", "a", "Lku/l0;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class ExecutorC7859f1 implements Executor {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final AbstractC7888l0 dispatcher;

    public ExecutorC7859f1(@NotNull AbstractC7888l0 abstractC7888l0) {
        this.dispatcher = abstractC7888l0;
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NotNull Runnable block) throws C7839b1 {
        AbstractC7888l0 abstractC7888l0 = this.dispatcher;
        C7721e c7721e = C7721e.f29393a;
        if (C10728j.m40869d(abstractC7888l0, c7721e)) {
            C10728j.m40868c(this.dispatcher, c7721e, block);
        } else {
            block.run();
        }
    }

    @NotNull
    public String toString() {
        return this.dispatcher.getName();
    }
}
