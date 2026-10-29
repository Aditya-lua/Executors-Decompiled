package p395qu;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import p256ku.AbstractC7888l0;
import p256ku.C7930v0;
import p256ku.InterfaceC7874i1;
import p256ku.InterfaceC7897n;
import p256ku.InterfaceC7942y0;

/* JADX INFO: renamed from: qu.w */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0013\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0017¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J&\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u0018H\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ,\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00162\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e2\u0006\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, m31665d2 = {"Lqu/w;", "Lku/l0;", "Lku/y0;", "dispatcher", "", "name", "<init>", "(Lku/l0;Ljava/lang/String;)V", "Lkotlin/coroutines/CoroutineContext;", "context", "", "H", "(Lkotlin/coroutines/CoroutineContext;)Z", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "w", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "F", "toString", "()Ljava/lang/String;", "", "timeMillis", "Lku/n;", "continuation", "o", "(JLku/n;)V", "Lku/i1;", "f", "(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Lku/i1;", "d", "Lku/l0;", "e", "Ljava/lang/String;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C10751w extends AbstractC7888l0 implements InterfaceC7942y0 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC7942y0 f38325c;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final AbstractC7888l0 dispatcher;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final String name;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: ku.l0 */
    /* JADX WARN: Multi-variable type inference failed */
    public C10751w(@NotNull AbstractC7888l0 abstractC7888l0, @NotNull String str) {
        InterfaceC7942y0 interfaceC7942y0 = abstractC7888l0 instanceof InterfaceC7942y0 ? (InterfaceC7942y0) abstractC7888l0 : null;
        this.f38325c = interfaceC7942y0 == null ? C7930v0.m32922a() : interfaceC7942y0;
        this.dispatcher = abstractC7888l0;
        this.name = str;
    }

    @Override // p256ku.AbstractC7888l0
    /* JADX INFO: renamed from: F */
    public void mo32792F(@NotNull CoroutineContext context, @NotNull Runnable block) {
        this.dispatcher.mo32792F(context, block);
    }

    @Override // p256ku.AbstractC7888l0
    /* JADX INFO: renamed from: H */
    public boolean mo6245H(@NotNull CoroutineContext context) {
        return this.dispatcher.mo6245H(context);
    }

    @Override // p256ku.InterfaceC7942y0
    @NotNull
    /* JADX INFO: renamed from: f */
    public InterfaceC7874i1 mo32840f(long timeMillis, @NotNull Runnable block, @NotNull CoroutineContext context) {
        return this.f38325c.mo32840f(timeMillis, block, context);
    }

    @Override // p256ku.InterfaceC7942y0
    /* JADX INFO: renamed from: o */
    public void mo32841o(long timeMillis, @NotNull InterfaceC7897n<? super Unit> continuation) {
        this.f38325c.mo32841o(timeMillis, continuation);
    }

    @Override // p256ku.AbstractC7888l0
    @NotNull
    /* JADX INFO: renamed from: toString, reason: from getter */
    public String getName() {
        return this.name;
    }

    @Override // p256ku.AbstractC7888l0
    /* JADX INFO: renamed from: w */
    public void mo6246w(@NotNull CoroutineContext context, @NotNull Runnable block) {
        this.dispatcher.mo6246w(context, block);
    }
}
