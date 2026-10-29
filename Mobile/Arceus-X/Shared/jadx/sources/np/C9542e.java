package np;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: np.e */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u000bB\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m31665d2 = {"Lnp/e;", "", "Lnp/b;", "logger", "", "subsystem", "<init>", "(Lnp/b;Ljava/lang/String;)V", "message", "category", "", "a", "(Ljava/lang/String;Ljava/lang/String;)V", "Lnp/b;", "b", "Ljava/lang/String;", "logger_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C9542e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C9539b logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String subsystem;

    /* JADX INFO: renamed from: np.e$a */
    @Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m31665d2 = {"Lnp/e$a;", "", "", "subsystem", "Lnp/e;", "create", "(Ljava/lang/String;)Lnp/e;", "logger_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface a {
        @NotNull
        C9542e create(@NotNull String subsystem);
    }

    public C9542e(@NotNull C9539b logger, @NotNull String subsystem) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(subsystem, "subsystem");
        this.logger = logger;
        this.subsystem = subsystem;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m37666b(C9542e c9542e, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        c9542e.m37667a(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public final void m37667a(@NotNull String message, @Nullable String category) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.logger.m37659i(this.subsystem, EnumC9538a.Error, category, message);
    }
}
