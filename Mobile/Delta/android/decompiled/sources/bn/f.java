package bn;

import android.os.Bundle;
import android.view.View;
import androidx.p000lifecycle.l;
import androidx.p000lifecycle.p;
import androidx.p000lifecycle.s;
import com.appsflyer.sdk_base.referrer.Payload;
import d5.i;
import d5.m;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.r0;
import kotlin.collections.u;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000W\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u000b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001-\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\u0003J\u001d\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\b2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001f\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001f\u0010 R$\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001b\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010'\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010*\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R \u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00160!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010#R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"Lbn/f;", "", "<init>", "()V", "", "key", "Ld5/i;", "parentOwner", "", "f", "(Ljava/lang/String;Ld5/i;)V", "g", "Landroid/view/View;", "view", "h", "(Landroid/view/View;Ljava/lang/String;)V", "m", "(Ljava/lang/String;)V", "", "keysToKeep", "j", "(Ljava/util/Collection;)V", "Lbn/a;", "child", "n", "(Lbn/a;)V", "l", "Landroid/os/Bundle;", "o", "()Landroid/os/Bundle;", "restoredState", "k", "(Landroid/os/Bundle;)V", "", "a", "Ljava/util/Map;", "states", "b", "Ld5/i;", "parentRegistryOwner", "c", "Ljava/lang/String;", "parentKey", "d", "children", "bn/f$a", "e", "Lbn/f$a;", "lifecycleObserver", "", "i", "()Z", "isRestored", "wf1-core-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Map<String, Bundle> states;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public i parentRegistryOwner;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String parentKey;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<String, bn.a> children = new LinkedHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final a lifecycleObserver = new a();

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"bn/f$a", "Landroidx/lifecycle/p;", "Landroidx/lifecycle/s;", Payload.SOURCE, "Landroidx/lifecycle/l$a;", "event", "", "g", "(Landroidx/lifecycle/s;Landroidx/lifecycle/l$a;)V", "wf1-core-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class a implements p {
        public a() {
        }

        @Override // androidx.p000lifecycle.p
        public void g(@NotNull s source, @NotNull l.a event) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            if (event != l.a.ON_CREATE) {
                throw new IllegalStateException(Intrinsics.l("Expected to receive ON_CREATE event before anything else, but got ", event).toString());
            }
            if (f.this.i()) {
                throw new IllegalStateException("Expected not to be observing lifecycle after restoration.");
            }
            source.a().d(this);
            f fVar = f.this;
            i iVar = fVar.parentRegistryOwner;
            Intrinsics.checkNotNull(iVar);
            d5.f fVarA = iVar.A();
            String str = f.this.parentKey;
            Intrinsics.checkNotNull(str);
            fVar.k(fVarA.a(str));
        }
    }

    public final void f(@NotNull String key, @NotNull i parentOwner) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(parentOwner, "parentOwner");
        g();
        this.parentRegistryOwner = parentOwner;
        this.parentKey = key;
        if (i()) {
            return;
        }
        d5.f fVarA = parentOwner.A();
        Intrinsics.checkNotNullExpressionValue(fVarA, "parentOwner.savedStateRegistry");
        l lVarA = parentOwner.a();
        Intrinsics.checkNotNullExpressionValue(lVarA, "parentOwner.lifecycle");
        try {
            fVarA.c(key, new d5.f.b() { // from class: bn.e
                @Override // d5.f.b
                public final Bundle a() {
                    return this.f4266a.o();
                }
            });
            lVarA.a(this.lifecycleObserver);
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException("Error registering SavedStateProvider: key \"" + key + "\" is already in use on parent SavedStateRegistryOwner " + parentOwner + ".\nThis is most easily remedied by giving your container Screen rendering a unique Compatible.compatibilityKey, perhaps by wrapping it with Named.", e10);
        }
    }

    public final void g() {
        l lVarA;
        d5.f fVarA;
        i iVar = this.parentRegistryOwner;
        if (iVar != null && (fVarA = iVar.A()) != null) {
            String str = this.parentKey;
            Intrinsics.checkNotNull(str);
            fVarA.e(str);
        }
        i iVar2 = this.parentRegistryOwner;
        if (iVar2 != null && (lVarA = iVar2.a()) != null) {
            lVarA.d(this.lifecycleObserver);
        }
        this.parentRegistryOwner = null;
        this.parentKey = null;
    }

    public final void h(@NotNull View view, @NotNull String key) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(key, "key");
        s sVarA = androidx.p000lifecycle.View.a(view);
        if (sVarA == null) {
            throw new IllegalArgumentException(("Expected " + view + '(' + key + ") to have a ViewTreeLifecycleOwner. Use WorkflowLifecycleOwner to fix that.").toString());
        }
        bn.a aVar = new bn.a(key, sVarA);
        if (this.children.put(key, aVar) != null) {
            throw new IllegalArgumentException(key + " is already in use, it cannot be used to register " + view);
        }
        i iVarA = m.a(view);
        if (iVarA == null) {
            m.b(view, aVar);
            l(aVar);
        } else {
            throw new IllegalArgumentException(view + " already has ViewTreeSavedStateRegistryOwner: " + iVarA);
        }
    }

    public final boolean i() {
        return this.states != null;
    }

    public final void j(@NotNull Collection<String> keysToKeep) {
        Intrinsics.checkNotNullParameter(keysToKeep, "keysToKeep");
        Collection<String> collection = keysToKeep;
        Iterator it = r0.h(this.children.keySet(), collection).iterator();
        while (it.hasNext()) {
            this.children.remove((String) it.next());
        }
        Map<String, Bundle> map = this.states;
        if (map == null) {
            return;
        }
        u.E(map.keySet(), r0.h(map.keySet(), collection));
    }

    public final void k(Bundle restoredState) {
        Set<String> setKeySet;
        if (this.states != null) {
            throw new IllegalStateException("Expected performRestore to be called only once.");
        }
        this.states = new LinkedHashMap();
        if (restoredState != null && (setKeySet = restoredState.keySet()) != null) {
            for (String str : setKeySet) {
                Map<String, Bundle> map = this.states;
                Intrinsics.checkNotNull(map);
                Bundle bundle = restoredState.getBundle(str);
                Intrinsics.checkNotNull(bundle);
                Pair pairA = jt.s.a(str, bundle);
                map.put((String) pairA.c(), (Bundle) pairA.d());
            }
        }
        for (bn.a aVar : this.children.values()) {
            if (aVar.a().getState() == l.b.INITIALIZED) {
                l(aVar);
            }
        }
    }

    public final void l(bn.a child) {
        Map<String, Bundle> map = this.states;
        if (map == null) {
            return;
        }
        child.getController().d(map.remove(child.getKey()));
    }

    public final void m(@NotNull String key) {
        Unit unit;
        Intrinsics.checkNotNullParameter(key, "key");
        bn.a aVarRemove = this.children.remove(key);
        if (aVarRemove == null) {
            unit = null;
        } else {
            n(aVarRemove);
            unit = Unit.f22483a;
        }
        if (unit == null) {
            throw new IllegalArgumentException(Intrinsics.l("No such child: ", key));
        }
    }

    public final void n(bn.a child) {
        Map<String, Bundle> map = this.states;
        if (map == null) {
            return;
        }
        Bundle bundle = new Bundle();
        child.getController().e(bundle);
        Pair pairA = jt.s.a(child.getKey(), bundle);
        map.put((String) pairA.c(), (Bundle) pairA.d());
    }

    public final Bundle o() {
        Bundle bundle = new Bundle();
        Map<String, Bundle> map = this.states;
        if (map != null) {
            Iterator<T> it = this.children.values().iterator();
            while (it.hasNext()) {
                n((bn.a) it.next());
            }
            for (Map.Entry<String, Bundle> entry : map.entrySet()) {
                bundle.putBundle(entry.getKey(), entry.getValue());
            }
        }
        return bundle;
    }
}
