package mp;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B)\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00028\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001b¨\u0006\u001d"}, d2 = {"Lmp/h0;", "I", "O", "Lg/c;", "Lh/a;", "contract", "Lg/a;", "callback", "<init>", "(Lh/a;Lg/a;)V", "input", "Lk2/c;", "options", "", "c", "(Ljava/lang/Object;Lk2/c;)V", "d", "()V", "Lg/b;", "activityResultCaller", "e", "(Lg/b;)V", "a", "Lh/a;", "()Lh/a;", "b", "Lg/a;", "Lg/c;", "currentLauncher", "launchers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h0<I, O> extends g.c<I> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h.a<I, O> contract;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final g.a<O> callback;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public g.c<I> currentLauncher;

    public h0(@NotNull h.a<I, O> contract, @NotNull g.a<O> callback) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.contract = contract;
        this.callback = callback;
    }

    @Override // g.c
    @NotNull
    public h.a<I, O> a() {
        return this.contract;
    }

    @Override // g.c
    public void c(I input, @Nullable k2.c options) {
        g.c<I> cVar = this.currentLauncher;
        if (cVar != null) {
            cVar.c(input, options);
        }
    }

    @Override // g.c
    public void d() {
        g.c<I> cVar = this.currentLauncher;
        if (cVar != null) {
            cVar.d();
        }
    }

    public final void e(@NotNull g.b activityResultCaller) {
        Intrinsics.checkNotNullParameter(activityResultCaller, "activityResultCaller");
        this.currentLauncher = activityResultCaller.h(a(), this.callback);
    }
}
