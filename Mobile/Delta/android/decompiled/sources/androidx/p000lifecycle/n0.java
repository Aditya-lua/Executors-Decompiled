package androidx.p000lifecycle;

import com.appsflyer.sdk_base.referrer.Payload;
import d5.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR$\u0010\"\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!¨\u0006#"}, d2 = {"Landroidx/lifecycle/n0;", "Landroidx/lifecycle/p;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "", "key", "Landroidx/lifecycle/l0;", "handle", "<init>", "(Ljava/lang/String;Landroidx/lifecycle/l0;)V", "Ld5/f;", "registry", "Landroidx/lifecycle/l;", "lifecycle", "", "a", "(Ld5/f;Landroidx/lifecycle/l;)V", "Landroidx/lifecycle/s;", Payload.SOURCE, "Landroidx/lifecycle/l$a;", "event", "g", "(Landroidx/lifecycle/s;Landroidx/lifecycle/l$a;)V", "close", "()V", "Ljava/lang/String;", "b", "Landroidx/lifecycle/l0;", "()Landroidx/lifecycle/l0;", "", "value", "c", "Z", "()Z", "isAttached", "lifecycle-viewmodel-savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n0 implements p, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String key;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final l0 handle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean isAttached;

    public n0(@NotNull String key, @NotNull l0 handle) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(handle, "handle");
        this.key = key;
        this.handle = handle;
    }

    public final void a(@NotNull f registry, @NotNull l lifecycle) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        if (this.isAttached) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.isAttached = true;
        lifecycle.a(this);
        registry.c(this.key, this.handle.h());
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final l0 getHandle() {
        return this.handle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsAttached() {
        return this.isAttached;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
    }

    @Override // androidx.p000lifecycle.p
    public void g(@NotNull s source, @NotNull l.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == l.a.ON_DESTROY) {
            this.isAttached = false;
            source.a().d(this);
        }
    }
}
