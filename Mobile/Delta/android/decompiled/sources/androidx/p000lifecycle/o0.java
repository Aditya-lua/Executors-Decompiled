package androidx.p000lifecycle;

import android.os.Bundle;
import d5.f;
import d5.i;
import k4.CreationExtras;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0004\u001a\u00020\u0003\"\f\b\u0000\u0010\u0002*\u00020\u0000*\u00020\u0001*\u00028\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0011\u001a\u00020\r*\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\"\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00000\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014\"\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014\"\u001e\u0010\u0017\u001a\f\u0012\b\u0012\u00060\nj\u0002`\u000b0\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014\"\u0018\u0010\u001b\u001a\u00020\u0018*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\"\u0018\u0010\u001f\u001a\u00020\u001c*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Ld5/i;", "Landroidx/lifecycle/c1;", "T", "", "c", "(Ld5/i;)V", "savedStateRegistryOwner", "viewModelStoreOwner", "", "key", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "defaultArgs", "Landroidx/lifecycle/l0;", "a", "(Ld5/i;Landroidx/lifecycle/c1;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/lifecycle/l0;", "Lk4/a;", "b", "(Lk4/a;)Landroidx/lifecycle/l0;", "Lk4/a$c;", "Lk4/a$c;", "SAVED_STATE_REGISTRY_OWNER_KEY", "VIEW_MODEL_STORE_OWNER_KEY", "DEFAULT_ARGS_KEY", "Landroidx/lifecycle/s0;", "e", "(Landroidx/lifecycle/c1;)Landroidx/lifecycle/s0;", "savedStateHandlesVM", "Landroidx/lifecycle/r0;", "d", "(Ld5/i;)Landroidx/lifecycle/r0;", "savedStateHandlesProvider", "lifecycle-viewmodel-savedstate"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final CreationExtras.c<i> f2834a;

    @NotNull
    public static final CreationExtras.c<c1> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final CreationExtras.c<Bundle> f2835c;

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"androidx/lifecycle/o0$a", "Landroidx/lifecycle/a1$c;", "Landroidx/lifecycle/x0;", "T", "Lhu/c;", "modelClass", "Lk4/a;", "extras", "c", "(Lhu/c;Lk4/a;)Landroidx/lifecycle/x0;", "lifecycle-viewmodel-savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements a1.c {
        @Override // androidx.lifecycle.a1.c
        public <T extends x0> T c(hu.c<T> modelClass, CreationExtras extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return new s0();
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"androidx/lifecycle/o0$b", "Lk4/a$c;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements CreationExtras.c<i> {
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"androidx/lifecycle/o0$c", "Lk4/a$c;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c implements CreationExtras.c<c1> {
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"androidx/lifecycle/o0$d", "Lk4/a$c;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d implements CreationExtras.c<Bundle> {
    }

    static {
        CreationExtras.Companion companion = CreationExtras.INSTANCE;
        f2834a = new b();
        b = new c();
        f2835c = new d();
    }

    public static final l0 a(i iVar, c1 c1Var, String str, Bundle bundle) {
        r0 r0VarD = d(iVar);
        s0 s0VarE = e(c1Var);
        l0 l0Var = s0VarE.e().get(str);
        if (l0Var != null) {
            return l0Var;
        }
        l0 l0VarA = l0.INSTANCE.a(r0VarD.c(str), bundle);
        s0VarE.e().put(str, l0VarA);
        return l0VarA;
    }

    @NotNull
    public static final l0 b(@NotNull CreationExtras creationExtras) {
        Intrinsics.checkNotNullParameter(creationExtras, "<this>");
        i iVar = (i) creationExtras.a(f2834a);
        if (iVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        c1 c1Var = (c1) creationExtras.a(b);
        if (c1Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) creationExtras.a(f2835c);
        String str = (String) creationExtras.a(a1.f2748c);
        if (str != null) {
            return a(iVar, c1Var, str, bundle);
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends i & c1> void c(@NotNull T t8) {
        Intrinsics.checkNotNullParameter(t8, "<this>");
        l.b state = t8.a().getState();
        if (state != l.b.INITIALIZED && state != l.b.CREATED) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (t8.A().b("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            r0 r0Var = new r0(t8.A(), t8);
            t8.A().c("androidx.lifecycle.internal.SavedStateHandlesProvider", r0Var);
            t8.a().a(new m0(r0Var));
        }
    }

    @NotNull
    public static final r0 d(@NotNull i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        f.b bVarB = iVar.A().b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        r0 r0Var = bVarB instanceof r0 ? (r0) bVarB : null;
        if (r0Var != null) {
            return r0Var;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    @NotNull
    public static final s0 e(@NotNull c1 c1Var) {
        Intrinsics.checkNotNullParameter(c1Var, "<this>");
        return (s0) a1.Companion.c(a1.INSTANCE, c1Var, new a(), null, 4, null).c("androidx.lifecycle.internal.SavedStateHandlesVM", d0.b(s0.class));
    }
}
