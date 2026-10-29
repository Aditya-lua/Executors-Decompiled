package bn;

import android.os.Bundle;
import android.view.View;
import androidx.core.app.NotificationCompat;
import androidx.p616lifecycle.AbstractC0966l;
import androidx.p616lifecycle.InterfaceC0974p;
import androidx.p616lifecycle.InterfaceC0980s;
import com.appsflyer.sdk_base.referrer.Payload;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7704r0;
import kotlin.collections.C7708u;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p068d5.C4442f;
import p068d5.C4449m;
import p068d5.InterfaceC4445i;
import p229jt.C7352s;

/* JADX INFO: renamed from: bn.f */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000W\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u000b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001-\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\u0003J\u001d\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\b2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001f\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001f\u0010 R$\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001b\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010'\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010*\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R \u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00160!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010#R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00065"}, m31665d2 = {"Lbn/f;", "", "<init>", "()V", "", "key", "Ld5/i;", "parentOwner", "", "f", "(Ljava/lang/String;Ld5/i;)V", "g", "Landroid/view/View;", "view", "h", "(Landroid/view/View;Ljava/lang/String;)V", "m", "(Ljava/lang/String;)V", "", "keysToKeep", "j", "(Ljava/util/Collection;)V", "Lbn/a;", "child", "n", "(Lbn/a;)V", "l", "Landroid/os/Bundle;", "o", "()Landroid/os/Bundle;", "restoredState", "k", "(Landroid/os/Bundle;)V", "", "a", "Ljava/util/Map;", "states", "b", "Ld5/i;", "parentRegistryOwner", "c", "Ljava/lang/String;", "parentKey", "d", "children", "bn/f$a", "e", "Lbn/f$a;", "lifecycleObserver", "", "i", "()Z", "isRestored", "wf1-core-android"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
public final class C1474f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public Map<String, Bundle> states;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public InterfaceC4445i parentRegistryOwner;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public String parentKey;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Map<String, C1469a> children = new LinkedHashMap();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final a lifecycleObserver = new a();

    /* JADX INFO: renamed from: bn.f$a */
    @Metadata(m31664d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"bn/f$a", "Landroidx/lifecycle/p;", "Landroidx/lifecycle/s;", Payload.SOURCE, "Landroidx/lifecycle/l$a;", NotificationCompat.CATEGORY_EVENT, "", "g", "(Landroidx/lifecycle/s;Landroidx/lifecycle/l$a;)V", "wf1-core-android"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
    public static final class a implements InterfaceC0974p {
        public a() {
        }

        @Override // androidx.p616lifecycle.InterfaceC0974p
        /* JADX INFO: renamed from: g */
        public void mo1334g(@NotNull InterfaceC0980s source, @NotNull AbstractC0966l.a event) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            if (event != AbstractC0966l.a.ON_CREATE) {
                throw new IllegalStateException(Intrinsics.m31989l("Expected to receive ON_CREATE event before anything else, but got ", event).toString());
            }
            if (C1474f.this.m7563i()) {
                throw new IllegalStateException("Expected not to be observing lifecycle after restoration.");
            }
            source.mo4656a().mo4938d(this);
            C1474f c1474f = C1474f.this;
            InterfaceC4445i interfaceC4445i = c1474f.parentRegistryOwner;
            Intrinsics.checkNotNull(interfaceC4445i);
            C4442f c4442fMo4583A = interfaceC4445i.mo4583A();
            String str = C1474f.this.parentKey;
            Intrinsics.checkNotNull(str);
            c1474f.m7565k(c4442fMo4583A.m22352a(str));
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m7560f(@NotNull String key, @NotNull InterfaceC4445i parentOwner) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(parentOwner, "parentOwner");
        m7561g();
        this.parentRegistryOwner = parentOwner;
        this.parentKey = key;
        if (m7563i()) {
            return;
        }
        C4442f c4442fMo4583A = parentOwner.mo4583A();
        Intrinsics.checkNotNullExpressionValue(c4442fMo4583A, "parentOwner.savedStateRegistry");
        AbstractC0966l abstractC0966lMo4656a = parentOwner.mo4656a();
        Intrinsics.checkNotNullExpressionValue(abstractC0966lMo4656a, "parentOwner.lifecycle");
        try {
            c4442fMo4583A.m22354c(key, new C4442f.b() { // from class: bn.e
                @Override // p068d5.C4442f.b
                /* JADX INFO: renamed from: a */
                public final Bundle mo4974a() {
                    return this.f5718a.m7569o();
                }
            });
            abstractC0966lMo4656a.mo4935a(this.lifecycleObserver);
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException("Error registering SavedStateProvider: key \"" + key + "\" is already in use on parent SavedStateRegistryOwner " + parentOwner + ".\nThis is most easily remedied by giving your container Screen rendering a unique Compatible.compatibilityKey, perhaps by wrapping it with Named.", e10);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m7561g() {
        AbstractC0966l abstractC0966lMo4656a;
        C4442f c4442fMo4583A;
        InterfaceC4445i interfaceC4445i = this.parentRegistryOwner;
        if (interfaceC4445i != null && (c4442fMo4583A = interfaceC4445i.mo4583A()) != null) {
            String str = this.parentKey;
            Intrinsics.checkNotNull(str);
            c4442fMo4583A.m22356e(str);
        }
        InterfaceC4445i interfaceC4445i2 = this.parentRegistryOwner;
        if (interfaceC4445i2 != null && (abstractC0966lMo4656a = interfaceC4445i2.mo4656a()) != null) {
            abstractC0966lMo4656a.mo4938d(this.lifecycleObserver);
        }
        this.parentRegistryOwner = null;
        this.parentKey = null;
    }

    /* JADX INFO: renamed from: h */
    public final void m7562h(@NotNull View view, @NotNull String key) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(key, "key");
        InterfaceC0980s interfaceC0980sM4901a = androidx.p616lifecycle.View.m4901a(view);
        if (interfaceC0980sM4901a == null) {
            throw new IllegalArgumentException(("Expected " + view + '(' + key + ") to have a ViewTreeLifecycleOwner. Use WorkflowLifecycleOwner to fix that.").toString());
        }
        C1469a c1469a = new C1469a(key, interfaceC0980sM4901a);
        if (this.children.put(key, c1469a) != null) {
            throw new IllegalArgumentException(key + " is already in use, it cannot be used to register " + view);
        }
        InterfaceC4445i interfaceC4445iM22372a = C4449m.m22372a(view);
        if (interfaceC4445iM22372a == null) {
            C4449m.m22373b(view, c1469a);
            m7566l(c1469a);
        } else {
            throw new IllegalArgumentException(view + " already has ViewTreeSavedStateRegistryOwner: " + interfaceC4445iM22372a);
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m7563i() {
        return this.states != null;
    }

    /* JADX INFO: renamed from: j */
    public final void m7564j(@NotNull Collection<String> keysToKeep) {
        Intrinsics.checkNotNullParameter(keysToKeep, "keysToKeep");
        Collection<String> collection = keysToKeep;
        Iterator it = C7704r0.m31912h(this.children.keySet(), collection).iterator();
        while (it.hasNext()) {
            this.children.remove((String) it.next());
        }
        Map<String, Bundle> map = this.states;
        if (map == null) {
            return;
        }
        C7708u.m31924E(map.keySet(), C7704r0.m31912h(map.keySet(), collection));
    }

    /* JADX INFO: renamed from: k */
    public final void m7565k(Bundle restoredState) {
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
                Pair pairM30477a = C7352s.m30477a(str, bundle);
                map.put((String) pairM30477a.m31673c(), (Bundle) pairM30477a.m31674d());
            }
        }
        for (C1469a c1469a : this.children.values()) {
            if (c1469a.mo4656a().getState() == AbstractC0966l.b.INITIALIZED) {
                m7566l(c1469a);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m7566l(C1469a child) {
        Map<String, Bundle> map = this.states;
        if (map == null) {
            return;
        }
        child.getController().m22360d(map.remove(child.getKey()));
    }

    /* JADX INFO: renamed from: m */
    public final void m7567m(@NotNull String key) {
        Unit unit;
        Intrinsics.checkNotNullParameter(key, "key");
        C1469a c1469aRemove = this.children.remove(key);
        if (c1469aRemove == null) {
            unit = null;
        } else {
            m7568n(c1469aRemove);
            unit = Unit.f29331a;
        }
        if (unit == null) {
            throw new IllegalArgumentException(Intrinsics.m31989l("No such child: ", key));
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m7568n(C1469a child) {
        Map<String, Bundle> map = this.states;
        if (map == null) {
            return;
        }
        Bundle bundle = new Bundle();
        child.getController().m22361e(bundle);
        Pair pairM30477a = C7352s.m30477a(child.getKey(), bundle);
        map.put((String) pairM30477a.m31673c(), (Bundle) pairM30477a.m31674d());
    }

    /* JADX INFO: renamed from: o */
    public final Bundle m7569o() {
        Bundle bundle = new Bundle();
        Map<String, Bundle> map = this.states;
        if (map != null) {
            Iterator<T> it = this.children.values().iterator();
            while (it.hasNext()) {
                m7568n((C1469a) it.next());
            }
            for (Map.Entry<String, Bundle> entry : map.entrySet()) {
                bundle.putBundle(entry.getKey(), entry.getValue());
            }
        }
        return bundle;
    }
}
