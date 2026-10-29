package androidx.p616lifecycle;

import androidx.core.app.NotificationCompat;
import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p068d5.C4442f;

/* JADX INFO: renamed from: androidx.lifecycle.n0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR$\u0010\"\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!¨\u0006#"}, m31665d2 = {"Landroidx/lifecycle/n0;", "Landroidx/lifecycle/p;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "", "key", "Landroidx/lifecycle/l0;", "handle", "<init>", "(Ljava/lang/String;Landroidx/lifecycle/l0;)V", "Ld5/f;", "registry", "Landroidx/lifecycle/l;", "lifecycle", "", "a", "(Ld5/f;Landroidx/lifecycle/l;)V", "Landroidx/lifecycle/s;", Payload.SOURCE, "Landroidx/lifecycle/l$a;", NotificationCompat.CATEGORY_EVENT, "g", "(Landroidx/lifecycle/s;Landroidx/lifecycle/l$a;)V", "close", "()V", "Ljava/lang/String;", "b", "Landroidx/lifecycle/l0;", "()Landroidx/lifecycle/l0;", "", "value", "c", "Z", "()Z", "isAttached", "lifecycle-viewmodel-savedstate"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C0971n0 implements InterfaceC0974p, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String key;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C0967l0 handle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public boolean isAttached;

    public C0971n0(@NotNull String key, @NotNull C0967l0 handle) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(handle, "handle");
        this.key = key;
        this.handle = handle;
    }

    /* JADX INFO: renamed from: a */
    public final void m4960a(@NotNull C4442f registry, @NotNull AbstractC0966l lifecycle) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        if (this.isAttached) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.isAttached = true;
        lifecycle.mo4935a(this);
        registry.m22354c(this.key, this.handle.m4953h());
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final C0967l0 getHandle() {
        return this.handle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsAttached() {
        return this.isAttached;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
    }

    @Override // androidx.p616lifecycle.InterfaceC0974p
    /* JADX INFO: renamed from: g */
    public void mo1334g(@NotNull InterfaceC0980s source, @NotNull AbstractC0966l.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == AbstractC0966l.a.ON_DESTROY) {
            this.isAttached = false;
            source.mo4656a().mo4938d(this);
        }
    }
}
