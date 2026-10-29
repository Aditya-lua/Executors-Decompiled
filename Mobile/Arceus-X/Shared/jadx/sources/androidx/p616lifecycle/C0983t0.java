package androidx.p616lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import hu.InterfaceC6567c;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p068d5.C4442f;
import p068d5.InterfaceC4445i;
import p237k4.CreationExtras;
import yt.C13450a;

/* JADX INFO: renamed from: androidx.lifecycle.t0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0017\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0011\u001a\u00028\u0000\"\b\b\u0000\u0010\f*\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0014\u001a\u00028\u0000\"\b\b\u0000\u0010\f*\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u0018\u001a\u00028\u0000\"\b\b\u0000\u0010\f*\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001a\u001a\u00028\u0000\"\b\b\u0000\u0010\f*\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u001e\u0010\u001fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010 R\u0014\u0010\"\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010!R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010#R\u0018\u0010&\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010%R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, m31665d2 = {"Landroidx/lifecycle/t0;", "Landroidx/lifecycle/a1$e;", "Landroidx/lifecycle/a1$c;", "Landroid/app/Application;", "application", "Ld5/i;", "owner", "Landroid/os/Bundle;", "defaultArgs", "<init>", "(Landroid/app/Application;Ld5/i;Landroid/os/Bundle;)V", "Landroidx/lifecycle/x0;", "T", "Lhu/c;", "modelClass", "Lk4/a;", "extras", "c", "(Lhu/c;Lk4/a;)Landroidx/lifecycle/x0;", "Ljava/lang/Class;", "a", "(Ljava/lang/Class;Lk4/a;)Landroidx/lifecycle/x0;", "", "key", "e", "(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/x0;", "b", "(Ljava/lang/Class;)Landroidx/lifecycle/x0;", "viewModel", "", "d", "(Landroidx/lifecycle/x0;)V", "Landroid/app/Application;", "Landroidx/lifecycle/a1$c;", "factory", "Landroid/os/Bundle;", "Landroidx/lifecycle/l;", "Landroidx/lifecycle/l;", "lifecycle", "Ld5/f;", "f", "Ld5/f;", "savedStateRegistry", "lifecycle-viewmodel-savedstate"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C0983t0 extends C0941a1.e implements C0941a1.c {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public Application application;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final C0941a1.c factory;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public Bundle defaultArgs;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public AbstractC0966l lifecycle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public C4442f savedStateRegistry;

    @SuppressLint({"LambdaLast"})
    public C0983t0(@Nullable Application application, @NotNull InterfaceC4445i owner, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.savedStateRegistry = owner.mo4583A();
        this.lifecycle = owner.mo4656a();
        this.defaultArgs = bundle;
        this.application = application;
        this.factory = application != null ? C0941a1.a.INSTANCE.m4874a(application) : new C0941a1.a();
    }

    /* JADX DEBUG: Class process forced to load method for inline: androidx.lifecycle.u0.a():java.util.List */
    @Override // androidx.p616lifecycle.C0941a1.c
    @NotNull
    /* JADX INFO: renamed from: a */
    public <T extends AbstractC0991x0> T mo4846a(@NotNull Class<T> modelClass, @NotNull CreationExtras extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        String str = (String) extras.mo30958a(C0941a1.f3607c);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (extras.mo30958a(C0973o0.f3714a) == null || extras.mo30958a(C0973o0.f3715b) == null) {
            if (this.lifecycle != null) {
                return (T) m4980e(str, modelClass);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) extras.mo30958a(C0941a1.a.f3611h);
        boolean zIsAssignableFrom = C0942b.class.isAssignableFrom(modelClass);
        Constructor constructorM4999c = (!zIsAssignableFrom || application == null) ? C0985u0.m4999c(modelClass, C0985u0.f3741b) : C0985u0.m4999c(modelClass, C0985u0.f3740a);
        if (constructorM4999c == null) {
            return (T) this.factory.mo4846a(modelClass, extras);
        }
        return (!zIsAssignableFrom || application == null) ? (T) C0985u0.m5000d(modelClass, constructorM4999c, C0973o0.m4965b(extras)) : (T) C0985u0.m5000d(modelClass, constructorM4999c, application, C0973o0.m4965b(extras));
    }

    @Override // androidx.p616lifecycle.C0941a1.c
    @NotNull
    /* JADX INFO: renamed from: b */
    public <T extends AbstractC0991x0> T mo4847b(@NotNull Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return (T) m4980e(canonicalName, modelClass);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.p616lifecycle.C0941a1.c
    @NotNull
    /* JADX INFO: renamed from: c */
    public <T extends AbstractC0991x0> T mo4878c(@NotNull InterfaceC6567c<T> modelClass, @NotNull CreationExtras extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return (T) mo4846a(C13450a.m49048a(modelClass), extras);
    }

    @Override // androidx.p616lifecycle.C0941a1.e
    /* JADX INFO: renamed from: d */
    public void mo4848d(@NotNull AbstractC0991x0 viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        if (this.lifecycle != null) {
            C4442f c4442f = this.savedStateRegistry;
            Intrinsics.checkNotNull(c4442f);
            AbstractC0966l abstractC0966l = this.lifecycle;
            Intrinsics.checkNotNull(abstractC0966l);
            C0964k.m4922a(viewModel, c4442f, abstractC0966l);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final <T extends AbstractC0991x0> T m4980e(@NotNull String key, @NotNull Class<T> modelClass) {
        T t8;
        Application application;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        AbstractC0966l abstractC0966l = this.lifecycle;
        if (abstractC0966l == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = C0942b.class.isAssignableFrom(modelClass);
        Constructor constructorM4999c = (!zIsAssignableFrom || this.application == null) ? C0985u0.m4999c(modelClass, C0985u0.f3741b) : C0985u0.m4999c(modelClass, C0985u0.f3740a);
        if (constructorM4999c == null) {
            return this.application != null ? (T) this.factory.mo4847b(modelClass) : (T) C0941a1.d.INSTANCE.m4881a().mo4847b(modelClass);
        }
        C4442f c4442f = this.savedStateRegistry;
        Intrinsics.checkNotNull(c4442f);
        C0971n0 c0971n0M4923b = C0964k.m4923b(c4442f, abstractC0966l, key, this.defaultArgs);
        if (!zIsAssignableFrom || (application = this.application) == null) {
            t8 = (T) C0985u0.m5000d(modelClass, constructorM4999c, c0971n0M4923b.getHandle());
        } else {
            Intrinsics.checkNotNull(application);
            t8 = (T) C0985u0.m5000d(modelClass, constructorM4999c, application, c0971n0M4923b.getHandle());
        }
        t8.m5009a("androidx.lifecycle.savedstate.vm.tag", c0971n0M4923b);
        return t8;
    }
}
