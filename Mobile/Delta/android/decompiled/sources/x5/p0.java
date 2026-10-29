package x5;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import y5.f1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001c\u001eB\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tH&¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00110\tH&¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u0018H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\rH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u001e\u0010\u001d¨\u0006\u001f"}, d2 = {"Lx5/p0;", "", "<init>", "()V", "Lx5/q0;", "request", "Lx5/a0;", "d", "(Lx5/q0;)Lx5/a0;", "", "requests", "c", "(Ljava/util/List;)Lx5/a0;", "", "uniqueWorkName", "Lx5/j;", "existingWorkPolicy", "Lx5/z;", "g", "(Ljava/lang/String;Lx5/j;Lx5/z;)Lx5/a0;", "f", "(Ljava/lang/String;Lx5/j;Ljava/util/List;)Lx5/a0;", "Lx5/i;", "existingPeriodicWorkPolicy", "Lx5/g0;", "e", "(Ljava/lang/String;Lx5/i;Lx5/g0;)Lx5/a0;", "tag", "a", "(Ljava/lang/String;)Lx5/a0;", "b", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"AddedAbstractMethod"})
public abstract class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: x5.p0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lx5/p0$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lx5/p0;", "a", "(Landroid/content/Context;)Lx5/p0;", "Landroidx/work/a;", "configuration", "", "b", "(Landroid/content/Context;Landroidx/work/a;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public p0 a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            f1 f1VarP = f1.p(context);
            Intrinsics.checkNotNullExpressionValue(f1VarP, "getInstance(...)");
            return f1VarP;
        }

        public void b(@NotNull Context context, @NotNull androidx.work.a configuration) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            f1.i(context, configuration);
        }

        public Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lx5/p0$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum b {
        NOT_APPLIED,
        APPLIED_IMMEDIATELY,
        APPLIED_FOR_NEXT_RUN;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ qt.a f34986e = qt.b.a(a());
    }

    @NotNull
    public static p0 h(@NotNull Context context) {
        return INSTANCE.a(context);
    }

    public static void i(@NotNull Context context, @NotNull androidx.work.a aVar) {
        INSTANCE.b(context, aVar);
    }

    @NotNull
    public abstract a0 a(@NotNull String tag);

    @NotNull
    public abstract a0 b(@NotNull String uniqueWorkName);

    @NotNull
    public abstract a0 c(@NotNull List<? extends q0> requests);

    @NotNull
    public final a0 d(@NotNull q0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return c(kotlin.collections.o.d(request));
    }

    @NotNull
    public abstract a0 e(@NotNull String uniqueWorkName, @NotNull i existingPeriodicWorkPolicy, @NotNull g0 request);

    @NotNull
    public abstract a0 f(@NotNull String uniqueWorkName, @NotNull j existingWorkPolicy, @NotNull List<z> requests);

    @NotNull
    public a0 g(@NotNull String uniqueWorkName, @NotNull j existingWorkPolicy, @NotNull z request) {
        Intrinsics.checkNotNullParameter(uniqueWorkName, "uniqueWorkName");
        Intrinsics.checkNotNullParameter(existingWorkPolicy, "existingWorkPolicy");
        Intrinsics.checkNotNullParameter(request, "request");
        return f(uniqueWorkName, existingWorkPolicy, kotlin.collections.o.d(request));
    }
}
