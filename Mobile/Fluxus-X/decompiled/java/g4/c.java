package g4;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import com.github.luben.zstd.BuildConfig;
import f4.q;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.collections.k0;
import p001kotlin.collections.q0;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001:\u00033\u001a'B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0017\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0018\u0010\u000eJ\u0019\u0010\u001a\u001a\u00020\u00192\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ7\u0010%\u001a\u00020$2\u0006\u0010 \u001a\u00020\u00192\u000e\u0010\"\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040!2\u000e\u0010#\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001c0!H\u0002¢\u0006\u0004\b%\u0010&J\u001f\u0010'\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b'\u0010(J\u001f\u0010+\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,R\"\u00102\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u00064"}, d2 = {"Lg4/c;", BuildConfig.FLAVOR, "<init>", "()V", "Lf4/q;", "fragment", BuildConfig.FLAVOR, "previousFragmentId", BuildConfig.FLAVOR, "f", "(Lf4/q;Ljava/lang/String;)V", "Landroid/view/ViewGroup;", "container", "g", "(Lf4/q;Landroid/view/ViewGroup;)V", "expectedParentFragment", BuildConfig.FLAVOR, "containerId", "l", "(Lf4/q;Lf4/q;I)V", "j", "(Lf4/q;)V", "h", "i", "k", "Lg4/c$c;", "b", "(Lf4/q;)Lg4/c$c;", "Lg4/j;", "violation", "e", "(Lg4/j;)V", "policy", "Ljava/lang/Class;", "fragmentClass", "violationClass", BuildConfig.FLAVOR, "n", "(Lg4/c$c;Ljava/lang/Class;Ljava/lang/Class;)Z", "c", "(Lg4/c$c;Lg4/j;)V", "Ljava/lang/Runnable;", "runnable", "m", "(Lf4/q;Ljava/lang/Runnable;)V", "Lg4/c$c;", "getDefaultPolicy", "()Lg4/c$c;", "setDefaultPolicy", "(Lg4/c$c;)V", "defaultPolicy", "a", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f17277a = new c();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static C0319c defaultPolicy = C0319c.f17288d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lg4/c$a;", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "f", "g", "h", "i", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_WRONG_NESTED_HIERARCHY,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lg4/c$b;", BuildConfig.FLAVOR, "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface b {
    }

    /* JADX INFO: renamed from: g4.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u00142\u00020\u0001:\u0001\u000fBC\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012 \u0010\f\u001a\u001c\u0012\u0004\u0012\u00020\b\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n0\t0\u0007¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R4\u0010\u0016\u001a\u001c\u0012\u0004\u0012\u00020\b\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n0\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018¨\u0006\u0019"}, d2 = {"Lg4/c$c;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Lg4/c$a;", "flags", "Lg4/c$b;", "listener", BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Ljava/lang/Class;", "Lg4/j;", "allowedViolations", "<init>", "(Ljava/util/Set;Lg4/c$b;Ljava/util/Map;)V", "a", "Ljava/util/Set;", "()Ljava/util/Set;", "b", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "mAllowedViolations", "Lg4/c$b;", "()Lg4/c$b;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C0319c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final C0319c f17288d = new C0319c(q0.d(), null, k0.j());

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Set<a> flags;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final Map<String, Set<Class<? extends j>>> mAllowedViolations;

        /* JADX WARN: Multi-variable type inference failed */
        public C0319c(@NotNull Set<? extends a> flags, @Nullable b bVar, @NotNull Map<String, ? extends Set<Class<? extends j>>> allowedViolations) {
            Intrinsics.checkNotNullParameter(flags, "flags");
            Intrinsics.checkNotNullParameter(allowedViolations, "allowedViolations");
            this.flags = flags;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ? extends Set<Class<? extends j>>> entry : allowedViolations.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            this.mAllowedViolations = linkedHashMap;
        }

        @NotNull
        public final Set<a> a() {
            return this.flags;
        }

        @Nullable
        public final b b() {
            return null;
        }

        @NotNull
        public final Map<String, Set<Class<? extends j>>> c() {
            return this.mAllowedViolations;
        }
    }

    public static final void d(String str, j violation) {
        Intrinsics.checkNotNullParameter(violation, "$violation");
        Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + str, violation);
        throw violation;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(@NotNull q fragment, @NotNull String previousFragmentId) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(previousFragmentId, "previousFragmentId");
        g4.a aVar = new g4.a(fragment, previousFragmentId);
        c cVar = f17277a;
        cVar.e(aVar);
        C0319c c0319cB = cVar.b(fragment);
        if (c0319cB.a().contains(a.DETECT_FRAGMENT_REUSE) && cVar.n(c0319cB, fragment.getClass(), aVar.getClass())) {
            cVar.c(c0319cB, aVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void g(@NotNull q fragment, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        d dVar = new d(fragment, container);
        c cVar = f17277a;
        cVar.e(dVar);
        C0319c c0319cB = cVar.b(fragment);
        if (c0319cB.a().contains(a.DETECT_FRAGMENT_TAG_USAGE) && cVar.n(c0319cB, fragment.getClass(), dVar.getClass())) {
            cVar.c(c0319cB, dVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void h(@NotNull q fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        e eVar = new e(fragment);
        c cVar = f17277a;
        cVar.e(eVar);
        C0319c c0319cB = cVar.b(fragment);
        if (c0319cB.a().contains(a.DETECT_RETAIN_INSTANCE_USAGE) && cVar.n(c0319cB, fragment.getClass(), eVar.getClass())) {
            cVar.c(c0319cB, eVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void i(@NotNull q fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        f fVar = new f(fragment);
        c cVar = f17277a;
        cVar.e(fVar);
        C0319c c0319cB = cVar.b(fragment);
        if (c0319cB.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && cVar.n(c0319cB, fragment.getClass(), fVar.getClass())) {
            cVar.c(c0319cB, fVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void j(@NotNull q fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        h hVar = new h(fragment);
        c cVar = f17277a;
        cVar.e(hVar);
        C0319c c0319cB = cVar.b(fragment);
        if (c0319cB.a().contains(a.DETECT_RETAIN_INSTANCE_USAGE) && cVar.n(c0319cB, fragment.getClass(), hVar.getClass())) {
            cVar.c(c0319cB, hVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void k(@NotNull q fragment, @NotNull ViewGroup container) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(container, "container");
        k kVar = new k(fragment, container);
        c cVar = f17277a;
        cVar.e(kVar);
        C0319c c0319cB = cVar.b(fragment);
        if (c0319cB.a().contains(a.DETECT_WRONG_FRAGMENT_CONTAINER) && cVar.n(c0319cB, fragment.getClass(), kVar.getClass())) {
            cVar.c(c0319cB, kVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void l(@NotNull q fragment, @NotNull q expectedParentFragment, int containerId) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(expectedParentFragment, "expectedParentFragment");
        l lVar = new l(fragment, expectedParentFragment, containerId);
        c cVar = f17277a;
        cVar.e(lVar);
        C0319c c0319cB = cVar.b(fragment);
        if (c0319cB.a().contains(a.DETECT_WRONG_NESTED_HIERARCHY) && cVar.n(c0319cB, fragment.getClass(), lVar.getClass())) {
            cVar.c(c0319cB, lVar);
        }
    }

    public final C0319c b(q fragment) {
        while (fragment != null) {
            if (fragment.p0()) {
                f4.k0 k0VarL = fragment.L();
                Intrinsics.checkNotNullExpressionValue(k0VarL, "declaringFragment.parentFragmentManager");
                if (k0VarL.G0() != null) {
                    C0319c c0319cG0 = k0VarL.G0();
                    Intrinsics.checkNotNull(c0319cG0);
                    return c0319cG0;
                }
            }
            fragment = fragment.J();
        }
        return defaultPolicy;
    }

    public final void c(C0319c policy, final j violation) {
        q qVarA = violation.getFragment();
        final String name = qVarA.getClass().getName();
        if (policy.a().contains(a.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", "Policy violation in " + name, violation);
        }
        policy.b();
        if (policy.a().contains(a.PENALTY_DEATH)) {
            m(qVarA, new Runnable() { // from class: g4.b
                @Override // java.lang.Runnable
                public final void run() {
                    c.d(name, violation);
                }
            });
        }
    }

    public final void e(j violation) {
        if (f4.k0.N0(3)) {
            Log.d("FragmentManager", "StrictMode violation in " + violation.getFragment().getClass().getName(), violation);
        }
    }

    public final void m(q fragment, Runnable runnable) {
        if (!fragment.p0()) {
            runnable.run();
            return;
        }
        Handler handler = fragment.L().A0().getHandler();
        if (Intrinsics.c(handler.getLooper(), Looper.myLooper())) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public final boolean n(C0319c policy, Class<? extends q> fragmentClass, Class<? extends j> violationClass) {
        Set<Class<? extends j>> set = policy.c().get(fragmentClass.getName());
        if (set == null) {
            return true;
        }
        if (Intrinsics.c(violationClass.getSuperclass(), j.class) || !CollectionsKt.W(set, violationClass.getSuperclass())) {
            return !set.contains(violationClass);
        }
        return false;
    }
}
