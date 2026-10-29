package androidx.p000lifecycle;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l4.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0003J!\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\n\u0010\u000b\u001a\u00060\tj\u0002`\n¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\f\b\u0000\u0010\u000e*\u00060\tj\u0002`\n2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/lifecycle/x0;", "", "<init>", "()V", "", "d", "b", "", "key", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "closeable", "a", "(Ljava/lang/String;Ljava/lang/AutoCloseable;)V", "T", "c", "(Ljava/lang/String;)Ljava/lang/AutoCloseable;", "Ll4/g;", "Ll4/g;", "impl", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final g impl = new g();

    public final void a(@NotNull String key, @NotNull AutoCloseable closeable) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(closeable, "closeable");
        g gVar = this.impl;
        if (gVar != null) {
            gVar.d(key, closeable);
        }
    }

    public final void b() {
        g gVar = this.impl;
        if (gVar != null) {
            gVar.e();
        }
        d();
    }

    @Nullable
    public final <T extends AutoCloseable> T c(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        g gVar = this.impl;
        if (gVar != null) {
            return (T) gVar.g(key);
        }
        return null;
    }

    public void d() {
    }
}
