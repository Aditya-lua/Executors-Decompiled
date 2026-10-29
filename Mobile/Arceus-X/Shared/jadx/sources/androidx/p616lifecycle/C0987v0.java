package androidx.p616lifecycle;

import android.os.Handler;
import android.os.Looper;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.lifecycle.v0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u001b¨\u0006\u001d"}, m31665d2 = {"Landroidx/lifecycle/v0;", "", "Landroidx/lifecycle/s;", "provider", "<init>", "(Landroidx/lifecycle/s;)V", "", "c", "()V", "b", "e", "d", "Landroidx/lifecycle/l$a;", NotificationCompat.CATEGORY_EVENT, "f", "(Landroidx/lifecycle/l$a;)V", "Landroidx/lifecycle/u;", "a", "Landroidx/lifecycle/u;", "registry", "Landroid/os/Handler;", "Landroid/os/Handler;", "handler", "Landroidx/lifecycle/v0$a;", "Landroidx/lifecycle/v0$a;", "lastDispatchRunnable", "Landroidx/lifecycle/l;", "()Landroidx/lifecycle/l;", "lifecycle", "lifecycle-service"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public class C0987v0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C0984u registry;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Handler handler;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public a lastDispatchRunnable;

    /* JADX INFO: renamed from: androidx.lifecycle.v0$a */
    @Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m31665d2 = {"Landroidx/lifecycle/v0$a;", "Ljava/lang/Runnable;", "Landroidx/lifecycle/u;", "registry", "Landroidx/lifecycle/l$a;", NotificationCompat.CATEGORY_EVENT, "<init>", "(Landroidx/lifecycle/u;Landroidx/lifecycle/l$a;)V", "", "run", "()V", "a", "Landroidx/lifecycle/u;", "b", "Landroidx/lifecycle/l$a;", "getEvent", "()Landroidx/lifecycle/l$a;", "", "c", "Z", "wasExecuted", "lifecycle-service"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final C0984u registry;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final AbstractC0966l.a event;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public boolean wasExecuted;

        public a(@NotNull C0984u registry, @NotNull AbstractC0966l.a event) {
            Intrinsics.checkNotNullParameter(registry, "registry");
            Intrinsics.checkNotNullParameter(event, "event");
            this.registry = registry;
            this.event = event;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.wasExecuted) {
                return;
            }
            this.registry.m4986j(this.event);
            this.wasExecuted = true;
        }
    }

    public C0987v0(@NotNull InterfaceC0980s provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.registry = new C0984u(provider);
        this.handler = new Handler(Looper.getMainLooper());
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public AbstractC0966l m5002a() {
        return this.registry;
    }

    /* JADX INFO: renamed from: b */
    public void m5003b() {
        m5007f(AbstractC0966l.a.ON_START);
    }

    /* JADX INFO: renamed from: c */
    public void m5004c() {
        m5007f(AbstractC0966l.a.ON_CREATE);
    }

    /* JADX INFO: renamed from: d */
    public void m5005d() {
        m5007f(AbstractC0966l.a.ON_STOP);
        m5007f(AbstractC0966l.a.ON_DESTROY);
    }

    /* JADX INFO: renamed from: e */
    public void m5006e() {
        m5007f(AbstractC0966l.a.ON_START);
    }

    /* JADX INFO: renamed from: f */
    public final void m5007f(AbstractC0966l.a event) {
        a aVar = this.lastDispatchRunnable;
        if (aVar != null) {
            aVar.run();
        }
        a aVar2 = new a(this.registry, event);
        this.lastDispatchRunnable = aVar2;
        this.handler.postAtFrontOfQueue(aVar2);
    }
}
