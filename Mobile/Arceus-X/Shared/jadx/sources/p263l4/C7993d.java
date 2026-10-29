package p263l4;

import androidx.p616lifecycle.AbstractC0991x0;
import androidx.p616lifecycle.C0941a1;
import hu.InterfaceC6567c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p237k4.CreationExtras;
import yt.C13450a;

/* JADX INFO: renamed from: l4.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m31665d2 = {"Ll4/d;", "Landroidx/lifecycle/a1$c;", "<init>", "()V", "Landroidx/lifecycle/x0;", "T", "Lhu/c;", "modelClass", "Lk4/a;", "extras", "c", "(Lhu/c;Lk4/a;)Landroidx/lifecycle/x0;", "lifecycle-viewmodel"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C7993d implements C0941a1.c {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final C7993d f29912b = new C7993d();

    @Override // androidx.p616lifecycle.C0941a1.c
    @NotNull
    /* JADX INFO: renamed from: c */
    public <T extends AbstractC0991x0> T mo4878c(@NotNull InterfaceC6567c<T> modelClass, @NotNull CreationExtras extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return (T) C7994e.f29913a.m33042a(C13450a.m49048a(modelClass));
    }
}
