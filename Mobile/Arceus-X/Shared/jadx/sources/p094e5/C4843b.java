package p094e5;

import android.os.Bundle;
import androidx.p616lifecycle.AbstractC0966l;
import androidx.p616lifecycle.InterfaceC0974p;
import androidx.p616lifecycle.InterfaceC0980s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7690k0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p068d5.C4439c;
import p068d5.C4442f;
import p068d5.C4446j;
import p068d5.InterfaceC4445i;
import p229jt.C7352s;
import p456u2.C11775d;

/* JADX INFO: renamed from: e5.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00052\u000e\u0010\u0019\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\fH\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001d\u001a\u00020\u00052\n\u0010\u001c\u001a\u00060\u000bj\u0002`\fH\u0001¢\u0006\u0004\b\u001d\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010%R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010(R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001e\u0010/\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010.R$\u00102\u001a\u00020*2\u0006\u00100\u001a\u00020*8G@BX\u0086\u000e¢\u0006\f\n\u0004\b1\u0010,\u001a\u0004\b2\u00103R\"\u00106\u001a\u00020*8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010,\u001a\u0004\b+\u00103\"\u0004\b4\u00105¨\u00067"}, m31665d2 = {"Le5/b;", "", "Ld5/i;", "owner", "Lkotlin/Function0;", "", "onAttach", "<init>", "(Ld5/i;Lkotlin/jvm/functions/Function0;)V", "", "key", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "c", "(Ljava/lang/String;)Landroid/os/Bundle;", "Ld5/f$b;", "provider", "j", "(Ljava/lang/String;Ld5/f$b;)V", "d", "(Ljava/lang/String;)Ld5/f$b;", "k", "(Ljava/lang/String;)V", "f", "()V", "savedState", "h", "(Landroid/os/Bundle;)V", "outBundle", "i", "a", "Ld5/i;", "b", "Lkotlin/jvm/functions/Function0;", "getOnAttach$savedstate", "()Lkotlin/jvm/functions/Function0;", "Le5/c;", "Le5/c;", "lock", "", "Ljava/util/Map;", "keyToProviders", "", "e", "Z", "attached", "Landroid/os/Bundle;", "restoredState", "value", "g", "isRestored", "()Z", "setAllowingSavingState$savedstate", "(Z)V", "isAllowingSavingState", "savedstate"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C4843b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC4445i owner;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function0<Unit> onAttach;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final C4844c lock;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Map<String, C4442f.b> keyToProviders;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public boolean attached;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public Bundle restoredState;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public boolean isRestored;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public boolean isAllowingSavingState;

    public C4843b(@NotNull InterfaceC4445i owner, @NotNull Function0<Unit> onAttach) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(onAttach, "onAttach");
        this.owner = owner;
        this.onAttach = onAttach;
        this.lock = new C4844c();
        this.keyToProviders = new LinkedHashMap();
        this.isAllowingSavingState = true;
    }

    /* JADX INFO: renamed from: g */
    public static final void m23394g(C4843b c4843b, InterfaceC0980s interfaceC0980s, AbstractC0966l.a event) {
        Intrinsics.checkNotNullParameter(interfaceC0980s, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == AbstractC0966l.a.ON_START) {
            c4843b.isAllowingSavingState = true;
        } else if (event == AbstractC0966l.a.ON_STOP) {
            c4843b.isAllowingSavingState = false;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final Bundle m23395c(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (!this.isRestored) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        }
        Bundle bundle = this.restoredState;
        if (bundle == null) {
            return null;
        }
        Bundle bundleM22343a = C4439c.m22343a(bundle);
        Bundle bundleM22345c = C4439c.m22344b(bundleM22343a, key) ? C4439c.m22345c(bundleM22343a, key) : null;
        C4446j.m22369e(C4446j.m22365a(bundle), key);
        if (C4439c.m22348f(C4439c.m22343a(bundle))) {
            this.restoredState = null;
        }
        return bundleM22345c;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final C4442f.b m23396d(@NotNull String key) {
        C4442f.b bVar;
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (this.lock) {
            Iterator it = this.keyToProviders.entrySet().iterator();
            do {
                bVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                C4442f.b bVar2 = (C4442f.b) entry.getValue();
                if (Intrinsics.m31980c(str, key)) {
                    bVar = bVar2;
                }
            } while (bVar == null);
        }
        return bVar;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsAllowingSavingState() {
        return this.isAllowingSavingState;
    }

    /* JADX INFO: renamed from: f */
    public final void m23398f() {
        if (this.owner.mo4656a().getState() != AbstractC0966l.b.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (this.attached) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        this.onAttach.invoke();
        this.owner.mo4656a().mo4935a(new InterfaceC0974p() { // from class: e5.a
            @Override // androidx.p616lifecycle.InterfaceC0974p
            /* JADX INFO: renamed from: g */
            public final void mo1334g(InterfaceC0980s interfaceC0980s, AbstractC0966l.a aVar) {
                C4843b.m23394g(this.f19521a, interfaceC0980s, aVar);
            }
        });
        this.attached = true;
    }

    /* JADX INFO: renamed from: h */
    public final void m23399h(@Nullable Bundle savedState) {
        if (!this.attached) {
            m23398f();
        }
        if (this.owner.mo4656a().getState().m4945b(AbstractC0966l.b.STARTED)) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + this.owner.mo4656a().getState()).toString());
        }
        if (this.isRestored) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        Bundle bundleM22345c = null;
        if (savedState != null) {
            Bundle bundleM22343a = C4439c.m22343a(savedState);
            if (C4439c.m22344b(bundleM22343a, "androidx.lifecycle.BundlableSavedStateRegistry.key")) {
                bundleM22345c = C4439c.m22345c(bundleM22343a, "androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
        }
        this.restoredState = bundleM22345c;
        this.isRestored = true;
    }

    /* JADX INFO: renamed from: i */
    public final void m23400i(@NotNull Bundle outBundle) {
        Pair[] pairArr;
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        Map mapM31795j = C7690k0.m31795j();
        if (mapM31795j.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapM31795j.size());
            for (Map.Entry entry : mapM31795j.entrySet()) {
                arrayList.add(C7352s.m30477a((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleM44057a = C11775d.m44057a((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        Bundle bundleM22365a = C4446j.m22365a(bundleM44057a);
        Bundle bundle = this.restoredState;
        if (bundle != null) {
            C4446j.m22366b(bundleM22365a, bundle);
        }
        synchronized (this.lock) {
            try {
                for (Map.Entry entry2 : this.keyToProviders.entrySet()) {
                    C4446j.m22367c(bundleM22365a, (String) entry2.getKey(), ((C4442f.b) entry2.getValue()).mo4974a());
                }
                Unit unit = Unit.f29331a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (C4439c.m22348f(C4439c.m22343a(bundleM44057a))) {
            return;
        }
        C4446j.m22367c(C4446j.m22365a(outBundle), "androidx.lifecycle.BundlableSavedStateRegistry.key", bundleM44057a);
    }

    /* JADX INFO: renamed from: j */
    public final void m23401j(@NotNull String key, @NotNull C4442f.b provider) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(provider, "provider");
        synchronized (this.lock) {
            if (this.keyToProviders.containsKey(key)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            this.keyToProviders.put(key, provider);
            Unit unit = Unit.f29331a;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m23402k(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (this.lock) {
        }
    }
}
