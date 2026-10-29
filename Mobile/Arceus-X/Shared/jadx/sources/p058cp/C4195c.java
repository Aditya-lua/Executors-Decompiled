package p058cp;

import android.content.Context;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: cp.c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\t\u0010\n\u001a\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\r\u0010\f\u001a\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u0004\"\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000f¨\u0006\u0011"}, m31665d2 = {"Landroid/content/Context;", "context", "Lcp/b;", "c", "(Landroid/content/Context;)Lcp/b;", "", "Ljava/io/File;", "directoriesToDeleteOnError", "", "d", "(Landroid/content/Context;Ljava/util/List;)V", "e", "(Landroid/content/Context;)V", "a", "b", "Lcp/b;", "errorHandler", "inquiry-internal_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4195c {

    /* JADX INFO: renamed from: a */
    @Nullable
    public static C4194b f17921a;

    /* JADX INFO: renamed from: a */
    public static final void m21690a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        m21692c(context).m21685b();
    }

    /* JADX INFO: renamed from: b */
    public static final synchronized C4194b m21691b(Context context) {
        C4194b c4194b = f17921a;
        if (c4194b != null) {
            return c4194b;
        }
        C4194b c4194b2 = new C4194b(context);
        f17921a = c4194b2;
        return c4194b2;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final C4194b m21692c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        C4194b c4194b = f17921a;
        return c4194b == null ? m21691b(context) : c4194b;
    }

    /* JADX INFO: renamed from: d */
    public static final void m21693d(@NotNull Context context, @NotNull List<? extends File> directoriesToDeleteOnError) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(directoriesToDeleteOnError, "directoriesToDeleteOnError");
        C4194b c4194bM21692c = m21692c(context);
        c4194bM21692c.m21687d();
        c4194bM21692c.m21688f(directoriesToDeleteOnError);
    }

    /* JADX INFO: renamed from: e */
    public static final void m21694e(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        m21692c(context).m21689g();
    }
}
