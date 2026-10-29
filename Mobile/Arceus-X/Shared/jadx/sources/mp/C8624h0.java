package mp;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p139g.AbstractC5854c;
import p139g.InterfaceC5852a;
import p139g.InterfaceC5853b;
import p154h.AbstractC6248a;
import p235k2.C7411c;

/* JADX INFO: renamed from: mp.h0 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B)\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00028\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001b¨\u0006\u001d"}, m31665d2 = {"Lmp/h0;", "I", "O", "Lg/c;", "Lh/a;", "contract", "Lg/a;", "callback", "<init>", "(Lh/a;Lg/a;)V", "input", "Lk2/c;", "options", "", "c", "(Ljava/lang/Object;Lk2/c;)V", "d", "()V", "Lg/b;", "activityResultCaller", "e", "(Lg/b;)V", "a", "Lh/a;", "()Lh/a;", "b", "Lg/a;", "Lg/c;", "currentLauncher", "launchers_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C8624h0<I, O> extends AbstractC5854c<I> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final AbstractC6248a<I, O> contract;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC5852a<O> callback;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public AbstractC5854c<I> currentLauncher;

    public C8624h0(@NotNull AbstractC6248a<I, O> contract, @NotNull InterfaceC5852a<O> callback) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.contract = contract;
        this.callback = callback;
    }

    @Override // p139g.AbstractC5854c
    @NotNull
    /* JADX INFO: renamed from: a */
    public AbstractC6248a<I, O> mo4724a() {
        return this.contract;
    }

    @Override // p139g.AbstractC5854c
    /* JADX INFO: renamed from: c */
    public void mo4725c(I input, @Nullable C7411c options) {
        AbstractC5854c<I> abstractC5854c = this.currentLauncher;
        if (abstractC5854c != null) {
            abstractC5854c.mo4725c(input, options);
        }
    }

    @Override // p139g.AbstractC5854c
    /* JADX INFO: renamed from: d */
    public void mo4726d() {
        AbstractC5854c<I> abstractC5854c = this.currentLauncher;
        if (abstractC5854c != null) {
            abstractC5854c.mo4726d();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m34681e(@NotNull InterfaceC5853b activityResultCaller) {
        Intrinsics.checkNotNullParameter(activityResultCaller, "activityResultCaller");
        this.currentLauncher = activityResultCaller.mo4671h(mo4724a(), this.callback);
    }
}
