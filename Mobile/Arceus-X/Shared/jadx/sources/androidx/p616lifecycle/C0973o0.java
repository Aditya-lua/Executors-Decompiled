package androidx.p616lifecycle;

import android.os.Bundle;
import hu.InterfaceC6567c;
import kotlin.Metadata;
import kotlin.jvm.internal.C7731d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p068d5.C4442f;
import p068d5.InterfaceC4445i;
import p237k4.CreationExtras;

/* JADX INFO: renamed from: androidx.lifecycle.o0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0004\u001a\u00020\u0003\"\f\b\u0000\u0010\u0002*\u00020\u0000*\u00020\u0001*\u00028\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0011\u001a\u00020\r*\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\"\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00000\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014\"\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014\"\u001e\u0010\u0017\u001a\f\u0012\b\u0012\u00060\nj\u0002`\u000b0\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014\"\u0018\u0010\u001b\u001a\u00020\u0018*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\"\u0018\u0010\u001f\u001a\u00020\u001c*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, m31665d2 = {"Ld5/i;", "Landroidx/lifecycle/c1;", "T", "", "c", "(Ld5/i;)V", "savedStateRegistryOwner", "viewModelStoreOwner", "", "key", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "defaultArgs", "Landroidx/lifecycle/l0;", "a", "(Ld5/i;Landroidx/lifecycle/c1;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/lifecycle/l0;", "Lk4/a;", "b", "(Lk4/a;)Landroidx/lifecycle/l0;", "Lk4/a$c;", "Lk4/a$c;", "SAVED_STATE_REGISTRY_OWNER_KEY", "VIEW_MODEL_STORE_OWNER_KEY", "DEFAULT_ARGS_KEY", "Landroidx/lifecycle/s0;", "e", "(Landroidx/lifecycle/c1;)Landroidx/lifecycle/s0;", "savedStateHandlesVM", "Landroidx/lifecycle/r0;", "d", "(Ld5/i;)Landroidx/lifecycle/r0;", "savedStateHandlesProvider", "lifecycle-viewmodel-savedstate"}, m31666k = 2, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C0973o0 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final CreationExtras.c<InterfaceC4445i> f3714a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final CreationExtras.c<InterfaceC0947c1> f3715b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final CreationExtras.c<Bundle> f3716c;

    /* JADX INFO: renamed from: androidx.lifecycle.o0$a */
    @Metadata(m31664d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m31665d2 = {"androidx/lifecycle/o0$a", "Landroidx/lifecycle/a1$c;", "Landroidx/lifecycle/x0;", "T", "Lhu/c;", "modelClass", "Lk4/a;", "extras", "c", "(Lhu/c;Lk4/a;)Landroidx/lifecycle/x0;", "lifecycle-viewmodel-savedstate"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class a implements C0941a1.c {
        @Override // androidx.p616lifecycle.C0941a1.c
        /* JADX INFO: renamed from: c */
        public <T extends AbstractC0991x0> T mo4878c(InterfaceC6567c<T> modelClass, CreationExtras extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return new C0981s0();
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.o0$b */
    @Metadata(m31664d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m31665d2 = {"androidx/lifecycle/o0$b", "Lk4/a$c;", "lifecycle-viewmodel"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class b implements CreationExtras.c<InterfaceC4445i> {
    }

    /* JADX INFO: renamed from: androidx.lifecycle.o0$c */
    @Metadata(m31664d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m31665d2 = {"androidx/lifecycle/o0$c", "Lk4/a$c;", "lifecycle-viewmodel"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class c implements CreationExtras.c<InterfaceC0947c1> {
    }

    /* JADX INFO: renamed from: androidx.lifecycle.o0$d */
    @Metadata(m31664d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m31665d2 = {"androidx/lifecycle/o0$d", "Lk4/a$c;", "lifecycle-viewmodel"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class d implements CreationExtras.c<Bundle> {
    }

    static {
        CreationExtras.Companion companion = CreationExtras.INSTANCE;
        f3714a = new b();
        f3715b = new c();
        f3716c = new d();
    }

    /* JADX INFO: renamed from: a */
    public static final C0967l0 m4964a(InterfaceC4445i interfaceC4445i, InterfaceC0947c1 interfaceC0947c1, String str, Bundle bundle) {
        C0979r0 c0979r0M4967d = m4967d(interfaceC4445i);
        C0981s0 c0981s0M4968e = m4968e(interfaceC0947c1);
        C0967l0 c0967l0 = c0981s0M4968e.m4978e().get(str);
        if (c0967l0 != null) {
            return c0967l0;
        }
        C0967l0 c0967l0M4955a = C0967l0.INSTANCE.m4955a(c0979r0M4967d.m4975c(str), bundle);
        c0981s0M4968e.m4978e().put(str, c0967l0M4955a);
        return c0967l0M4955a;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final C0967l0 m4965b(@NotNull CreationExtras creationExtras) {
        Intrinsics.checkNotNullParameter(creationExtras, "<this>");
        InterfaceC4445i interfaceC4445i = (InterfaceC4445i) creationExtras.mo30958a(f3714a);
        if (interfaceC4445i == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        InterfaceC0947c1 interfaceC0947c1 = (InterfaceC0947c1) creationExtras.mo30958a(f3715b);
        if (interfaceC0947c1 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) creationExtras.mo30958a(f3716c);
        String str = (String) creationExtras.mo30958a(C0941a1.f3607c);
        if (str != null) {
            return m4964a(interfaceC4445i, interfaceC0947c1, str, bundle);
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T extends d5.i & androidx.lifecycle.c1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static final <T extends InterfaceC4445i & InterfaceC0947c1> void m4966c(@NotNull T t8) {
        Intrinsics.checkNotNullParameter(t8, "<this>");
        AbstractC0966l.b state = t8.mo4656a().getState();
        if (state != AbstractC0966l.b.INITIALIZED && state != AbstractC0966l.b.CREATED) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (t8.mo4583A().m22353b("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            C0979r0 c0979r0 = new C0979r0(t8.mo4583A(), t8);
            t8.mo4583A().m22354c("androidx.lifecycle.internal.SavedStateHandlesProvider", c0979r0);
            t8.mo4656a().mo4935a(new C0969m0(c0979r0));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final C0979r0 m4967d(@NotNull InterfaceC4445i interfaceC4445i) {
        Intrinsics.checkNotNullParameter(interfaceC4445i, "<this>");
        C4442f.b bVarM22353b = interfaceC4445i.mo4583A().m22353b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        C0979r0 c0979r0 = bVarM22353b instanceof C0979r0 ? (C0979r0) bVarM22353b : null;
        if (c0979r0 != null) {
            return c0979r0;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final C0981s0 m4968e(@NotNull InterfaceC0947c1 interfaceC0947c1) {
        Intrinsics.checkNotNullParameter(interfaceC0947c1, "<this>");
        return (C0981s0) C0941a1.Companion.m4875c(C0941a1.INSTANCE, interfaceC0947c1, new a(), null, 4, null).m4870c("androidx.lifecycle.internal.SavedStateHandlesVM", C7731d0.m32002b(C0981s0.class));
    }
}
