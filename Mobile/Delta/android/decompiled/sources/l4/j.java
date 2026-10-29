package l4;

import androidx.p000lifecycle.a1;
import androidx.p000lifecycle.c1;
import androidx.p000lifecycle.x0;
import k4.CreationExtras;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Ll4/j;", "", "<init>", "()V", "Landroidx/lifecycle/x0;", "T", "Lhu/c;", "modelClass", "", "c", "(Lhu/c;)Ljava/lang/String;", "VM", "d", "()Landroidx/lifecycle/x0;", "Landroidx/lifecycle/c1;", "owner", "Landroidx/lifecycle/a1$c;", "b", "(Landroidx/lifecycle/c1;)Landroidx/lifecycle/a1$c;", "Lk4/a;", "a", "(Landroidx/lifecycle/c1;)Lk4/a;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final j f22948a = new j();

    @NotNull
    public final CreationExtras a(@NotNull c1 owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        return owner instanceof androidx.p000lifecycle.j ? ((androidx.p000lifecycle.j) owner).Z() : CreationExtras.b.f22169c;
    }

    @NotNull
    public final a1.c b(@NotNull c1 owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        return owner instanceof androidx.p000lifecycle.j ? ((androidx.p000lifecycle.j) owner).X() : d.b;
    }

    @NotNull
    public final <T extends x0> String c(@NotNull hu.c<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String strA = a.a(modelClass);
        if (strA == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return "androidx.lifecycle.ViewModelProvider.DefaultKey:" + strA;
    }

    @NotNull
    public final <VM extends x0> VM d() {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }
}
