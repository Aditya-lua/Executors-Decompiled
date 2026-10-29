package androidx.p000lifecycle;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ku.p0;
import l4.b;
import l4.c;
import l4.f;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0005*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u0006¨\u0006\b"}, d2 = {"Ll4/f;", "a", "Ll4/f;", "VIEW_MODEL_SCOPE_LOCK", "Landroidx/lifecycle/x0;", "Lku/p0;", "(Landroidx/lifecycle/x0;)Lku/p0;", "viewModelScope", "lifecycle-viewmodel"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f f2862a = new f();

    @NotNull
    public static final p0 a(@NotNull x0 x0Var) {
        b bVarA;
        Intrinsics.checkNotNullParameter(x0Var, "<this>");
        synchronized (f2862a) {
            bVarA = (b) x0Var.c("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (bVarA == null) {
                bVarA = c.a();
                x0Var.a("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", bVarA);
            }
        }
        return bVarA;
    }
}
