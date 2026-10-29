package pt;

import kotlin.Metadata;
import kotlin.coroutines.C7721e;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p315nt.InterfaceC9557b;

/* JADX INFO: renamed from: pt.j */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, m31665d2 = {"Lpt/j;", "Lpt/a;", "Lnt/b;", "", "completion", "<init>", "(Lnt/b;)V", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public abstract class AbstractC10348j extends AbstractC10339a {
    public AbstractC10348j(@Nullable InterfaceC9557b<Object> interfaceC9557b) {
        super(interfaceC9557b);
        if (interfaceC9557b != null && interfaceC9557b.getContext() != C7721e.f29393a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // p315nt.InterfaceC9557b
    @NotNull
    public CoroutineContext getContext() {
        return C7721e.f29393a;
    }
}
