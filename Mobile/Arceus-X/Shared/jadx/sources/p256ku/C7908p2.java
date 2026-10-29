package p256ku;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.AbstractC7717a;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p315nt.InterfaceC9557b;

/* JADX INFO: renamed from: ku.p2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0097@¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0017¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0014\u001a\u00020\u00132\u0018\u0010\u0012\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\b0\u000fj\u0002`\u0011H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J9\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0018\u0010\u0012\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\b0\u000fj\u0002`\u0011H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\b2\u000e\u0010\u001a\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\fH\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0017¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$R\u001a\u0010'\u001a\u00020\u00058VX\u0097\u0004¢\u0006\f\u0012\u0004\b&\u0010\u0004\u001a\u0004\b%\u0010\u0007R\u001a\u0010*\u001a\u00020\u00058VX\u0097\u0004¢\u0006\f\u0012\u0004\b)\u0010\u0004\u001a\u0004\b(\u0010\u0007R\u001a\u0010+\u001a\u00020\u00058VX\u0097\u0004¢\u0006\f\u0012\u0004\b,\u0010\u0004\u001a\u0004\b+\u0010\u0007¨\u0006-"}, m31665d2 = {"Lku/p2;", "Lkotlin/coroutines/a;", "Lku/d2;", "<init>", "()V", "", "start", "()Z", "", "L", "(Lnt/b;)Ljava/lang/Object;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "m", "()Ljava/util/concurrent/CancellationException;", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lku/i1;", "q", "(Lkotlin/jvm/functions/Function1;)Lku/i1;", "onCancelling", "invokeImmediately", "l", "(ZZLkotlin/jvm/functions/Function1;)Lku/i1;", "cause", "c", "(Ljava/util/concurrent/CancellationException;)V", "Lku/w;", "child", "Lku/u;", "y", "(Lku/w;)Lku/u;", "", "toString", "()Ljava/lang/String;", "b", "isActive$annotations", "isActive", "d", "isCompleted$annotations", "isCompleted", "isCancelled", "isCancelled$annotations", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C7908p2 extends AbstractC7717a implements InterfaceC7850d2 {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final C7908p2 f29789b = new C7908p2();

    public C7908p2() {
        super(InterfaceC7850d2.INSTANCE);
    }

    @Override // p256ku.InterfaceC7850d2
    @Nullable
    /* JADX INFO: renamed from: L */
    public Object mo32596L(@NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // p256ku.InterfaceC7850d2
    /* JADX INFO: renamed from: b */
    public boolean mo32556b() {
        return true;
    }

    @Override // p256ku.InterfaceC7850d2
    /* JADX INFO: renamed from: c */
    public void mo32597c(@Nullable CancellationException cause) {
    }

    @Override // p256ku.InterfaceC7850d2
    /* JADX INFO: renamed from: d */
    public boolean mo32598d() {
        return false;
    }

    @Override // p256ku.InterfaceC7850d2
    public boolean isCancelled() {
        return false;
    }

    @Override // p256ku.InterfaceC7850d2
    @NotNull
    /* JADX INFO: renamed from: l */
    public InterfaceC7874i1 mo32599l(boolean onCancelling, boolean invokeImmediately, @NotNull Function1<? super Throwable, Unit> handler) {
        return C7912q2.f29793a;
    }

    @Override // p256ku.InterfaceC7850d2
    @NotNull
    /* JADX INFO: renamed from: m */
    public CancellationException mo32600m() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // p256ku.InterfaceC7850d2
    @NotNull
    /* JADX INFO: renamed from: q */
    public InterfaceC7874i1 mo32601q(@NotNull Function1<? super Throwable, Unit> handler) {
        return C7912q2.f29793a;
    }

    @Override // p256ku.InterfaceC7850d2
    public boolean start() {
        return false;
    }

    @NotNull
    public String toString() {
        return "NonCancellable";
    }

    @Override // p256ku.InterfaceC7850d2
    @NotNull
    /* JADX INFO: renamed from: y */
    public InterfaceC7925u mo32602y(@NotNull InterfaceC7933w child) {
        return C7912q2.f29793a;
    }
}
