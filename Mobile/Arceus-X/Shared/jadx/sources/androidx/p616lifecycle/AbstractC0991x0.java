package androidx.p616lifecycle;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p263l4.C7996g;

/* JADX INFO: renamed from: androidx.lifecycle.x0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0003J!\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\n\u0010\u000b\u001a\u00060\tj\u0002`\n¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\f\b\u0000\u0010\u000e*\u00060\tj\u0002`\n2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012¨\u0006\u0014"}, m31665d2 = {"Landroidx/lifecycle/x0;", "", "<init>", "()V", "", "d", "b", "", "key", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "closeable", "a", "(Ljava/lang/String;Ljava/lang/AutoCloseable;)V", "T", "c", "(Ljava/lang/String;)Ljava/lang/AutoCloseable;", "Ll4/g;", "Ll4/g;", "impl", "lifecycle-viewmodel"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public abstract class AbstractC0991x0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final C7996g impl = new C7996g();

    /* JADX INFO: renamed from: a */
    public final void m5009a(@NotNull String key, @NotNull AutoCloseable closeable) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(closeable, "closeable");
        C7996g c7996g = this.impl;
        if (c7996g != null) {
            c7996g.m33046d(key, closeable);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5010b() {
        C7996g c7996g = this.impl;
        if (c7996g != null) {
            c7996g.m33047e();
        }
        mo5012d();
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final <T extends AutoCloseable> T m5011c(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        C7996g c7996g = this.impl;
        if (c7996g != null) {
            return (T) c7996g.m33049g(key);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public void mo5012d() {
    }
}
