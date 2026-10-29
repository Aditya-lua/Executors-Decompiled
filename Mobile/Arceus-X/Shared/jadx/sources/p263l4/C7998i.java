package p263l4;

import androidx.p616lifecycle.AbstractC0991x0;
import androidx.p616lifecycle.C0941a1;
import hu.InterfaceC6567c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p237k4.CreationExtras;
import yt.C13450a;

/* JADX INFO: renamed from: l4.i */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m31665d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/a1$c;", "factory", "Lhu/c;", "modelClass", "Lk4/a;", "extras", "a", "(Landroidx/lifecycle/a1$c;Lhu/c;Lk4/a;)Landroidx/lifecycle/x0;", "lifecycle-viewmodel"}, m31666k = 2, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C7998i {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <VM extends AbstractC0991x0> VM m33055a(@NotNull C0941a1.c factory, @NotNull InterfaceC6567c<VM> modelClass, @NotNull CreationExtras extras) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        try {
            try {
                return (VM) factory.mo4878c(modelClass, extras);
            } catch (AbstractMethodError unused) {
                return (VM) factory.mo4847b(C13450a.m49048a(modelClass));
            }
        } catch (AbstractMethodError unused2) {
            return (VM) factory.mo4846a(C13450a.m49048a(modelClass), extras);
        }
    }
}
