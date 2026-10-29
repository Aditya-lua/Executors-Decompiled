package androidx.p616lifecycle;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p256ku.InterfaceC7906p0;
import p263l4.C7991b;
import p263l4.C7992c;
import p263l4.C7995f;

/* JADX INFO: renamed from: androidx.lifecycle.y0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0005*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u0006¨\u0006\b"}, m31665d2 = {"Ll4/f;", "a", "Ll4/f;", "VIEW_MODEL_SCOPE_LOCK", "Landroidx/lifecycle/x0;", "Lku/p0;", "(Landroidx/lifecycle/x0;)Lku/p0;", "viewModelScope", "lifecycle-viewmodel"}, m31666k = 2, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C0993y0 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C7995f f3751a = new C7995f();

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final InterfaceC7906p0 m5013a(@NotNull AbstractC0991x0 abstractC0991x0) {
        C7991b c7991bM33041a;
        Intrinsics.checkNotNullParameter(abstractC0991x0, "<this>");
        synchronized (f3751a) {
            c7991bM33041a = (C7991b) abstractC0991x0.m5011c("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (c7991bM33041a == null) {
                c7991bM33041a = C7992c.m33041a();
                abstractC0991x0.m5009a("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", c7991bM33041a);
            }
        }
        return c7991bM33041a;
    }
}
