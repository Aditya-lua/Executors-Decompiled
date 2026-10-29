package l4;

import androidx.p000lifecycle.a1;
import androidx.p000lifecycle.x0;
import k4.CreationExtras;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/a1$c;", "factory", "Lhu/c;", "modelClass", "Lk4/a;", "extras", "a", "(Landroidx/lifecycle/a1$c;Lhu/c;Lk4/a;)Landroidx/lifecycle/x0;", "lifecycle-viewmodel"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class i {
    @NotNull
    public static final <VM extends x0> VM a(@NotNull a1.c factory, @NotNull hu.c<VM> modelClass, @NotNull CreationExtras extras) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        try {
            try {
                return (VM) factory.c(modelClass, extras);
            } catch (AbstractMethodError unused) {
                return (VM) factory.b(yt.a.a(modelClass));
            }
        } catch (AbstractMethodError unused2) {
            return (VM) factory.a(yt.a.a(modelClass), extras);
        }
    }
}
