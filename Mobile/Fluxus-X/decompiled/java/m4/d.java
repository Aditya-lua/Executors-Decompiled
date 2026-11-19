package m4;

import androidx.p000lifecycle.a1;
import androidx.p000lifecycle.x0;
import l4.CreationExtras;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lm4/d;", "Landroidx/lifecycle/a1$c;", "<init>", "()V", "Landroidx/lifecycle/x0;", "T", "Lxu/c;", "modelClass", "Ll4/a;", "extras", "c", "(Lxu/c;Ll4/a;)Landroidx/lifecycle/x0;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d implements a1.c {

    @NotNull
    public static final d b = new d();

    @Override // androidx.lifecycle.a1.c
    @NotNull
    public <T extends x0> T c(@NotNull xu.c<T> modelClass, @NotNull CreationExtras extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return (T) e.f22926a.a(ou.a.a(modelClass));
    }
}
