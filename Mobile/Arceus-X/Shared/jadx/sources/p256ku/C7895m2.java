package p256ku;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import p315nt.InterfaceC9557b;
import p344ot.C10046b;
import ru.C11136a;

/* JADX INFO: renamed from: ku.m2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m31665d2 = {"Lku/m2;", "Lku/w2;", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "Lkotlin/Function2;", "Lku/p0;", "Lnt/b;", "", "", "block", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)V", "E0", "()V", "d", "Lnt/b;", "continuation", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C7895m2 extends C7936w2 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC9557b<Unit> continuation;

    public C7895m2(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super InterfaceC7906p0, ? super InterfaceC9557b<? super Unit>, ? extends Object> function2) {
        super(coroutineContext, false);
        this.continuation = C10046b.m38801a(function2, this, this);
    }

    @Override // p256ku.C7880j2
    /* JADX INFO: renamed from: E0 */
    public void mo32716E0() throws Throwable {
        C11136a.m41910c(this.continuation, this);
    }
}
