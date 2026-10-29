package p263l4;

import androidx.p616lifecycle.AbstractC0991x0;
import androidx.p616lifecycle.C0941a1;
import androidx.p616lifecycle.InterfaceC0947c1;
import androidx.p616lifecycle.InterfaceC0962j;
import hu.InterfaceC6567c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p237k4.CreationExtras;

/* JADX INFO: renamed from: l4.j */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m31665d2 = {"Ll4/j;", "", "<init>", "()V", "Landroidx/lifecycle/x0;", "T", "Lhu/c;", "modelClass", "", "c", "(Lhu/c;)Ljava/lang/String;", "VM", "d", "()Landroidx/lifecycle/x0;", "Landroidx/lifecycle/c1;", "owner", "Landroidx/lifecycle/a1$c;", "b", "(Landroidx/lifecycle/c1;)Landroidx/lifecycle/a1$c;", "Lk4/a;", "a", "(Landroidx/lifecycle/c1;)Lk4/a;", "lifecycle-viewmodel"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C7999j {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C7999j f29922a = new C7999j();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final CreationExtras m33056a(@NotNull InterfaceC0947c1 owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        return owner instanceof InterfaceC0962j ? ((InterfaceC0962j) owner).mo4653Z() : CreationExtras.b.f28722c;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final C0941a1.c m33057b(@NotNull InterfaceC0947c1 owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        return owner instanceof InterfaceC0962j ? ((InterfaceC0962j) owner).mo4647X() : C7993d.f29912b;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final <T extends AbstractC0991x0> String m33058c(@NotNull InterfaceC6567c<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String strM33040a = C7990a.m33040a(modelClass);
        if (strM33040a == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return "androidx.lifecycle.ViewModelProvider.DefaultKey:" + strM33040a;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final <VM extends AbstractC0991x0> VM m33059d() {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }
}
