package p113f;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: f.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u0003R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0011¨\u0006\u0012"}, m31665d2 = {"Lf/a;", "", "<init>", "()V", "Lf/b;", "listener", "", "a", "(Lf/b;)V", "Landroid/content/Context;", "context", "c", "(Landroid/content/Context;)V", "b", "", "Ljava/util/Set;", "listeners", "Landroid/content/Context;", "activity"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C5220a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Set<InterfaceC5221b> listeners = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public volatile Context context;

    /* JADX INFO: renamed from: a */
    public final void m24187a(@NotNull InterfaceC5221b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Context context = this.context;
        if (context != null) {
            listener.mo23005a(context);
        }
        this.listeners.add(listener);
    }

    /* JADX INFO: renamed from: b */
    public final void m24188b() {
        this.context = null;
    }

    /* JADX INFO: renamed from: c */
    public final void m24189c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        Iterator<InterfaceC5221b> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().mo23005a(context);
        }
    }
}
