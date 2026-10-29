package p118f4;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC0929c;
import androidx.fragment.app.FragmentManager;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7690k0;
import kotlin.collections.C7702q0;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: f4.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001:\u00033\u001a'B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0017\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0018\u0010\u000eJ\u0019\u0010\u001a\u001a\u00020\u00192\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ7\u0010%\u001a\u00020$2\u0006\u0010 \u001a\u00020\u00192\u000e\u0010\"\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040!2\u000e\u0010#\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001c0!H\u0002¢\u0006\u0004\b%\u0010&J\u001f\u0010'\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b'\u0010(J\u001f\u0010+\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,R\"\u00102\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u00064"}, m31665d2 = {"Lf4/c;", "", "<init>", "()V", "Landroidx/fragment/app/c;", "fragment", "", "previousFragmentId", "", "f", "(Landroidx/fragment/app/c;Ljava/lang/String;)V", "Landroid/view/ViewGroup;", "container", "g", "(Landroidx/fragment/app/c;Landroid/view/ViewGroup;)V", "expectedParentFragment", "", "containerId", "l", "(Landroidx/fragment/app/c;Landroidx/fragment/app/c;I)V", "j", "(Landroidx/fragment/app/c;)V", "h", "i", "k", "Lf4/c$c;", "b", "(Landroidx/fragment/app/c;)Lf4/c$c;", "Lf4/j;", "violation", "e", "(Lf4/j;)V", "policy", "Ljava/lang/Class;", "fragmentClass", "violationClass", "", "n", "(Lf4/c$c;Ljava/lang/Class;Ljava/lang/Class;)Z", "c", "(Lf4/c$c;Lf4/j;)V", "Ljava/lang/Runnable;", "runnable", "m", "(Landroidx/fragment/app/c;Ljava/lang/Runnable;)V", "Lf4/c$c;", "getDefaultPolicy", "()Lf4/c$c;", "setDefaultPolicy", "(Lf4/c$c;)V", "defaultPolicy", "a", "fragment_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
public final class C5348c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C5348c f20818a = new C5348c();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static c defaultPolicy = c.f20831d;

    /* JADX INFO: renamed from: f4.c$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m31665d2 = {"Lf4/c$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "f", "g", "h", "i", "fragment_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
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

    /* JADX INFO: renamed from: f4.c$b */
    @Metadata(m31664d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, m31665d2 = {"Lf4/c$b;", "", "fragment_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
    public interface b {
    }

    /* JADX INFO: renamed from: f4.c$c */
    @Metadata(m31664d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u00142\u00020\u0001:\u0001\u000fBC\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012 \u0010\f\u001a\u001c\u0012\u0004\u0012\u00020\b\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n0\t0\u0007¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R4\u0010\u0016\u001a\u001c\u0012\u0004\u0012\u00020\b\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n0\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018¨\u0006\u0019"}, m31665d2 = {"Lf4/c$c;", "", "", "Lf4/c$a;", "flags", "Lf4/c$b;", "listener", "", "", "", "Ljava/lang/Class;", "Lf4/j;", "allowedViolations", "<init>", "(Ljava/util/Set;Lf4/c$b;Ljava/util/Map;)V", "a", "Ljava/util/Set;", "()Ljava/util/Set;", "b", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "mAllowedViolations", "Lf4/c$b;", "()Lf4/c$b;", "fragment_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
    public static final class c {

        /* JADX INFO: renamed from: d */
        @NotNull
        public static final c f20831d = new c(C7702q0.m31908d(), null, C7690k0.m31795j());

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Set<a> flags;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final Map<String, Set<Class<? extends AbstractC5355j>>> mAllowedViolations;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Set<? extends f4.c$a> */
        /* JADX WARN: Multi-variable type inference failed */
        public c(@NotNull Set<? extends a> flags, @Nullable b bVar, @NotNull Map<String, ? extends Set<Class<? extends AbstractC5355j>>> allowedViolations) {
            Intrinsics.checkNotNullParameter(flags, "flags");
            Intrinsics.checkNotNullParameter(allowedViolations, "allowedViolations");
            this.flags = flags;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ? extends Set<Class<? extends AbstractC5355j>>> entry : allowedViolations.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            this.mAllowedViolations = linkedHashMap;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Set<a> m24689a() {
            return this.flags;
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public final b m24690b() {
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final Map<String, Set<Class<? extends AbstractC5355j>>> m24691c() {
            return this.mAllowedViolations;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m24675d(String str, AbstractC5355j violation) {
        Intrinsics.checkNotNullParameter(violation, "$violation");
        Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + str, violation);
        throw violation;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: f4.c */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static final void m24676f(@NotNull ComponentCallbacksC0929c fragment, @NotNull String previousFragmentId) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(previousFragmentId, "previousFragmentId");
        C5346a c5346a = new C5346a(fragment, previousFragmentId);
        C5348c c5348c = f20818a;
        c5348c.m24685e(c5346a);
        c cVarM24683b = c5348c.m24683b(fragment);
        if (cVarM24683b.m24689a().contains(a.DETECT_FRAGMENT_REUSE) && c5348c.m24687n(cVarM24683b, fragment.getClass(), c5346a.getClass())) {
            c5348c.m24684c(cVarM24683b, c5346a);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: f4.c */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public static final void m24677g(@NotNull ComponentCallbacksC0929c fragment, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        C5349d c5349d = new C5349d(fragment, container);
        C5348c c5348c = f20818a;
        c5348c.m24685e(c5349d);
        c cVarM24683b = c5348c.m24683b(fragment);
        if (cVarM24683b.m24689a().contains(a.DETECT_FRAGMENT_TAG_USAGE) && c5348c.m24687n(cVarM24683b, fragment.getClass(), c5349d.getClass())) {
            c5348c.m24684c(cVarM24683b, c5349d);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: f4.c */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public static final void m24678h(@NotNull ComponentCallbacksC0929c fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        C5350e c5350e = new C5350e(fragment);
        C5348c c5348c = f20818a;
        c5348c.m24685e(c5350e);
        c cVarM24683b = c5348c.m24683b(fragment);
        if (cVarM24683b.m24689a().contains(a.DETECT_RETAIN_INSTANCE_USAGE) && c5348c.m24687n(cVarM24683b, fragment.getClass(), c5350e.getClass())) {
            c5348c.m24684c(cVarM24683b, c5350e);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: f4.c */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public static final void m24679i(@NotNull ComponentCallbacksC0929c fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        C5351f c5351f = new C5351f(fragment);
        C5348c c5348c = f20818a;
        c5348c.m24685e(c5351f);
        c cVarM24683b = c5348c.m24683b(fragment);
        if (cVarM24683b.m24689a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && c5348c.m24687n(cVarM24683b, fragment.getClass(), c5351f.getClass())) {
            c5348c.m24684c(cVarM24683b, c5351f);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: f4.c */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public static final void m24680j(@NotNull ComponentCallbacksC0929c fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        C5353h c5353h = new C5353h(fragment);
        C5348c c5348c = f20818a;
        c5348c.m24685e(c5353h);
        c cVarM24683b = c5348c.m24683b(fragment);
        if (cVarM24683b.m24689a().contains(a.DETECT_RETAIN_INSTANCE_USAGE) && c5348c.m24687n(cVarM24683b, fragment.getClass(), c5353h.getClass())) {
            c5348c.m24684c(cVarM24683b, c5353h);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: f4.c */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public static final void m24681k(@NotNull ComponentCallbacksC0929c fragment, @NotNull ViewGroup container) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(container, "container");
        C5356k c5356k = new C5356k(fragment, container);
        C5348c c5348c = f20818a;
        c5348c.m24685e(c5356k);
        c cVarM24683b = c5348c.m24683b(fragment);
        if (cVarM24683b.m24689a().contains(a.DETECT_WRONG_FRAGMENT_CONTAINER) && c5348c.m24687n(cVarM24683b, fragment.getClass(), c5356k.getClass())) {
            c5348c.m24684c(cVarM24683b, c5356k);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: f4.c */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public static final void m24682l(@NotNull ComponentCallbacksC0929c fragment, @NotNull ComponentCallbacksC0929c expectedParentFragment, int containerId) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(expectedParentFragment, "expectedParentFragment");
        C5357l c5357l = new C5357l(fragment, expectedParentFragment, containerId);
        C5348c c5348c = f20818a;
        c5348c.m24685e(c5357l);
        c cVarM24683b = c5348c.m24683b(fragment);
        if (cVarM24683b.m24689a().contains(a.DETECT_WRONG_NESTED_HIERARCHY) && c5348c.m24687n(cVarM24683b, fragment.getClass(), c5357l.getClass())) {
            c5348c.m24684c(cVarM24683b, c5357l);
        }
    }

    /* JADX INFO: renamed from: b */
    public final c m24683b(ComponentCallbacksC0929c fragment) {
        while (fragment != null) {
            if (fragment.m4694p0()) {
                FragmentManager fragmentManagerM4617M = fragment.m4617M();
                Intrinsics.checkNotNullExpressionValue(fragmentManagerM4617M, "declaringFragment.parentFragmentManager");
                if (fragmentManagerM4617M.m4378G0() != null) {
                    c cVarM4378G0 = fragmentManagerM4617M.m4378G0();
                    Intrinsics.checkNotNull(cVarM4378G0);
                    return cVarM4378G0;
                }
            }
            fragment = fragment.m4612K();
        }
        return defaultPolicy;
    }

    /* JADX INFO: renamed from: c */
    public final void m24684c(c policy, final AbstractC5355j violation) {
        ComponentCallbacksC0929c componentCallbacksC0929cM24692a = violation.getFragment();
        final String name = componentCallbacksC0929cM24692a.getClass().getName();
        if (policy.m24689a().contains(a.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", "Policy violation in " + name, violation);
        }
        policy.m24690b();
        if (policy.m24689a().contains(a.PENALTY_DEATH)) {
            m24686m(componentCallbacksC0929cM24692a, new Runnable() { // from class: f4.b
                @Override // java.lang.Runnable
                public final void run() {
                    C5348c.m24675d(name, violation);
                }
            });
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m24685e(AbstractC5355j violation) {
        if (FragmentManager.m4349N0(3)) {
            Log.d("FragmentManager", "StrictMode violation in " + violation.getFragment().getClass().getName(), violation);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m24686m(ComponentCallbacksC0929c fragment, Runnable runnable) {
        if (!fragment.m4694p0()) {
            runnable.run();
            return;
        }
        Handler handler = fragment.m4617M().m4365A0().getHandler();
        if (Intrinsics.m31980c(handler.getLooper(), Looper.myLooper())) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    /* JADX INFO: renamed from: n */
    public final boolean m24687n(c policy, Class<? extends ComponentCallbacksC0929c> fragmentClass, Class<? extends AbstractC5355j> violationClass) {
        Set<Class<? extends AbstractC5355j>> set = policy.m24691c().get(fragmentClass.getName());
        if (set == null) {
            return true;
        }
        if (Intrinsics.m31980c(violationClass.getSuperclass(), AbstractC5355j.class) || !CollectionsKt.m31699W(set, violationClass.getSuperclass())) {
            return !set.contains(violationClass);
        }
        return false;
    }
}
