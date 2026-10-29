package androidx.p616lifecycle;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p068d5.C4442f;
import p068d5.InterfaceC4445i;
import p237k4.CreationExtras;

/* JADX INFO: renamed from: androidx.lifecycle.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u000f\u001a\u00028\u0000\"\b\b\u0000\u0010\n*\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0013\u001a\u00028\u0000\"\b\b\u0000\u0010\n*\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\u00028\u0000\"\b\b\u0000\u0010\n*\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J7\u0010\u0019\u001a\u00028\u0000\"\b\b\u0000\u0010\n*\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u0018\u001a\u00020\u0017H$¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\tH\u0017¢\u0006\u0004\b\u001d\u0010\u001eR\u0018\u0010!\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010&¨\u0006'"}, m31665d2 = {"Landroidx/lifecycle/a;", "Landroidx/lifecycle/a1$e;", "Landroidx/lifecycle/a1$c;", "Ld5/i;", "owner", "Landroid/os/Bundle;", "defaultArgs", "<init>", "(Ld5/i;Landroid/os/Bundle;)V", "Landroidx/lifecycle/x0;", "T", "", "key", "Ljava/lang/Class;", "modelClass", "e", "(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/x0;", "Lk4/a;", "extras", "a", "(Ljava/lang/Class;Lk4/a;)Landroidx/lifecycle/x0;", "b", "(Ljava/lang/Class;)Landroidx/lifecycle/x0;", "Landroidx/lifecycle/l0;", "handle", "f", "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/l0;)Landroidx/lifecycle/x0;", "viewModel", "", "d", "(Landroidx/lifecycle/x0;)V", "Ld5/f;", "Ld5/f;", "savedStateRegistry", "Landroidx/lifecycle/l;", "c", "Landroidx/lifecycle/l;", "lifecycle", "Landroid/os/Bundle;", "lifecycle-viewmodel-savedstate"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public abstract class AbstractC0939a extends C0941a1.e implements C0941a1.c {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public C4442f savedStateRegistry;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public AbstractC0966l lifecycle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public Bundle defaultArgs;

    public AbstractC0939a(@NotNull InterfaceC4445i owner, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.savedStateRegistry = owner.mo4583A();
        this.lifecycle = owner.mo4656a();
        this.defaultArgs = bundle;
    }

    /* JADX INFO: renamed from: e */
    private final <T extends AbstractC0991x0> T m4845e(String key, Class<T> modelClass) {
        C4442f c4442f = this.savedStateRegistry;
        Intrinsics.checkNotNull(c4442f);
        AbstractC0966l abstractC0966l = this.lifecycle;
        Intrinsics.checkNotNull(abstractC0966l);
        C0971n0 c0971n0M4923b = C0964k.m4923b(c4442f, abstractC0966l, key, this.defaultArgs);
        T t8 = (T) mo4849f(key, modelClass, c0971n0M4923b.getHandle());
        t8.m5009a("androidx.lifecycle.savedstate.vm.tag", c0971n0M4923b);
        return t8;
    }

    @Override // androidx.p616lifecycle.C0941a1.c
    @NotNull
    /* JADX INFO: renamed from: a */
    public <T extends AbstractC0991x0> T mo4846a(@NotNull Class<T> modelClass, @NotNull CreationExtras extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        String str = (String) extras.mo30958a(C0941a1.d.f3617d);
        if (str != null) {
            return this.savedStateRegistry != null ? (T) m4845e(str, modelClass) : (T) mo4849f(str, modelClass, C0973o0.m4965b(extras));
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @Override // androidx.p616lifecycle.C0941a1.c
    @NotNull
    /* JADX INFO: renamed from: b */
    public <T extends AbstractC0991x0> T mo4847b(@NotNull Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        if (this.lifecycle != null) {
            return (T) m4845e(canonicalName, modelClass);
        }
        throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // androidx.p616lifecycle.C0941a1.e
    /* JADX INFO: renamed from: d */
    public void mo4848d(@NotNull AbstractC0991x0 viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        C4442f c4442f = this.savedStateRegistry;
        if (c4442f != null) {
            Intrinsics.checkNotNull(c4442f);
            AbstractC0966l abstractC0966l = this.lifecycle;
            Intrinsics.checkNotNull(abstractC0966l);
            C0964k.m4922a(viewModel, c4442f, abstractC0966l);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public abstract <T extends AbstractC0991x0> T mo4849f(@NotNull String key, @NotNull Class<T> modelClass, @NotNull C0967l0 handle);
}
