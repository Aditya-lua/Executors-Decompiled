package p263l4;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p088e.C4711j0;

/* JADX INFO: renamed from: l4.g */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J!\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\n\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\f\b\u0000\u0010\r*\u00060\bj\u0002`\t2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00042\u000e\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R$\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u00060\bj\u0002`\t0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001e\u0010\u001d\u001a\f\u0012\b\u0012\u00060\bj\u0002`\t0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001f¨\u0006!"}, m31665d2 = {"Ll4/g;", "", "<init>", "()V", "", "e", "", "key", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "closeable", "d", "(Ljava/lang/String;Ljava/lang/AutoCloseable;)V", "T", "g", "(Ljava/lang/String;)Ljava/lang/AutoCloseable;", "f", "(Ljava/lang/AutoCloseable;)V", "Ll4/f;", "a", "Ll4/f;", "lock", "", "b", "Ljava/util/Map;", "keyToCloseables", "", "c", "Ljava/util/Set;", "closeables", "", "Z", "isCleared", "lifecycle-viewmodel"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C7996g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C7995f lock = new C7995f();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Map<String, AutoCloseable> keyToCloseables = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Set<AutoCloseable> closeables = new LinkedHashSet();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public volatile boolean isCleared;

    /* JADX INFO: renamed from: d */
    public final void m33046d(@NotNull String key, @NotNull AutoCloseable closeable) {
        AutoCloseable autoCloseable;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(closeable, "closeable");
        if (this.isCleared) {
            m33048f(closeable);
            return;
        }
        synchronized (this.lock) {
            autoCloseable = (AutoCloseable) this.keyToCloseables.put(key, closeable);
        }
        m33048f(autoCloseable);
    }

    /* JADX INFO: renamed from: e */
    public final void m33047e() {
        if (this.isCleared) {
            return;
        }
        this.isCleared = true;
        synchronized (this.lock) {
            try {
                Iterator it = this.keyToCloseables.values().iterator();
                while (it.hasNext()) {
                    m33048f((AutoCloseable) it.next());
                }
                Iterator it2 = this.closeables.iterator();
                while (it2.hasNext()) {
                    m33048f((AutoCloseable) it2.next());
                }
                this.closeables.clear();
                Unit unit = Unit.f29331a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m33048f(AutoCloseable closeable) {
        if (closeable != null) {
            try {
                C4711j0.m23003a(closeable);
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final <T extends AutoCloseable> T m33049g(@NotNull String key) {
        T t8;
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (this.lock) {
            t8 = (T) this.keyToCloseables.get(key);
        }
        return t8;
    }
}
