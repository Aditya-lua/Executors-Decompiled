package pt;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.InterfaceC7720d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p315nt.InterfaceC9557b;

/* JADX INFO: renamed from: pt.d */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\b!\u0018\u00002\u00020\u0001B#\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u0015\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR \u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m31665d2 = {"Lpt/d;", "Lpt/a;", "Lnt/b;", "", "completion", "Lkotlin/coroutines/CoroutineContext;", "_context", "<init>", "(Lnt/b;Lkotlin/coroutines/CoroutineContext;)V", "(Lnt/b;)V", "intercepted", "()Lnt/b;", "", "releaseIntercepted", "()V", "Lkotlin/coroutines/CoroutineContext;", "Lnt/b;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public abstract class AbstractC10342d extends AbstractC10339a {

    @Nullable
    private final CoroutineContext _context;

    @Nullable
    private transient InterfaceC9557b<Object> intercepted;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC10342d(@Nullable InterfaceC9557b<Object> interfaceC9557b, @Nullable CoroutineContext coroutineContext) {
        super(interfaceC9557b);
        this._context = coroutineContext;
    }

    @Override // p315nt.InterfaceC9557b
    @NotNull
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this._context;
        Intrinsics.checkNotNull(coroutineContext);
        return coroutineContext;
    }

    @NotNull
    public final InterfaceC9557b<Object> intercepted() {
        InterfaceC9557b<Object> interfaceC9557bMo31962v = this.intercepted;
        if (interfaceC9557bMo31962v == null) {
            InterfaceC7720d interfaceC7720d = (InterfaceC7720d) getContext().get(InterfaceC7720d.INSTANCE);
            if (interfaceC7720d == null || (interfaceC9557bMo31962v = interfaceC7720d.mo31962v(this)) == null) {
                interfaceC9557bMo31962v = this;
            }
            this.intercepted = interfaceC9557bMo31962v;
        }
        return interfaceC9557bMo31962v;
    }

    @Override // pt.AbstractC10339a
    public void releaseIntercepted() {
        InterfaceC9557b<?> interfaceC9557b = this.intercepted;
        if (interfaceC9557b != null && interfaceC9557b != this) {
            CoroutineContext.Element element = getContext().get(InterfaceC7720d.INSTANCE);
            Intrinsics.checkNotNull(element);
            ((InterfaceC7720d) element).mo31961M(interfaceC9557b);
        }
        this.intercepted = C10341c.f37195a;
    }

    public AbstractC10342d(@Nullable InterfaceC9557b<Object> interfaceC9557b) {
        this(interfaceC9557b, interfaceC9557b != null ? interfaceC9557b.getContext() : null);
    }
}
