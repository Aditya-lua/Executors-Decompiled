package cp;

import android.content.Context;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\t\u0010\n\u001a\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\r\u0010\f\u001a\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u0004\"\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000f¨\u0006\u0011"}, d2 = {"Landroid/content/Context;", "context", "Lcp/b;", "c", "(Landroid/content/Context;)Lcp/b;", "", "Ljava/io/File;", "directoriesToDeleteOnError", "", "d", "(Landroid/content/Context;Ljava/util/List;)V", "e", "(Landroid/content/Context;)V", "a", "b", "Lcp/b;", "errorHandler", "inquiry-internal_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static b f14041a;

    public static final void a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        c(context).b();
    }

    public static final synchronized b b(Context context) {
        b bVar = f14041a;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(context);
        f14041a = bVar2;
        return bVar2;
    }

    @NotNull
    public static final b c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        b bVar = f14041a;
        return bVar == null ? b(context) : bVar;
    }

    public static final void d(@NotNull Context context, @NotNull List<? extends File> directoriesToDeleteOnError) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(directoriesToDeleteOnError, "directoriesToDeleteOnError");
        b bVarC = c(context);
        bVarC.d();
        bVarC.f(directoriesToDeleteOnError);
    }

    public static final void e(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        c(context).g();
    }
}
