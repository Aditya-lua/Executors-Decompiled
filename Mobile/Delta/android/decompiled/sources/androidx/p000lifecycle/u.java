package androidx.p000lifecycle;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nu.c0;
import nu.r0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s.a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 ?2\u00020\u0001:\u0002%\u0010B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001c\u0010\u0016J\u0017\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001e\u0010\bJ\u0017\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001f\u0010\bJ\u000f\u0010 \u001a\u00020\u000bH\u0002¢\u0006\u0004\b \u0010\u001aJ\u0017\u0010#\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\"\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020(0'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010\u001b\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010,R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010.R\u0016\u00101\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u00100R\u0016\u00103\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010&R\u0016\u00104\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010&R&\u00108\u001a\u0012\u0012\u0004\u0012\u00020\u001305j\b\u0012\u0004\u0012\u00020\u0013`68\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u00107R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\u0013098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010:R$\u0010>\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u00138V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b%\u0010<\"\u0004\b=\u0010\u0016R\u0014\u0010A\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006B"}, d2 = {"Landroidx/lifecycle/u;", "Landroidx/lifecycle/l;", "Landroidx/lifecycle/s;", "provider", "", "enforceMainThread", "<init>", "(Landroidx/lifecycle/s;Z)V", "(Landroidx/lifecycle/s;)V", "Landroidx/lifecycle/l$a;", "event", "", "j", "(Landroidx/lifecycle/l$a;)V", "Landroidx/lifecycle/r;", "observer", "a", "(Landroidx/lifecycle/r;)V", "d", "Landroidx/lifecycle/l$b;", "next", "l", "(Landroidx/lifecycle/l$b;)V", "f", "(Landroidx/lifecycle/r;)Landroidx/lifecycle/l$b;", "m", "()V", "state", "n", "lifecycleOwner", "i", "e", "p", "", "methodName", "h", "(Ljava/lang/String;)V", "b", "Z", "Ls/a;", "Landroidx/lifecycle/u$b;", "c", "Ls/a;", "observerMap", "Landroidx/lifecycle/l$b;", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "", "I", "addingObserverCounter", "g", "handlingEvent", "newEventOccurred", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "parentStates", "Lnu/c0;", "Lnu/c0;", "_currentStateFlow", "()Landroidx/lifecycle/l$b;", "o", "currentState", "k", "()Z", "isSynced", "lifecycle-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class u extends l {

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean enforceMainThread;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public a<r, b> observerMap;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public l.b state;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final WeakReference<s> lifecycleOwner;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public int addingObserverCounter;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public boolean handlingEvent;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public boolean newEventOccurred;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public ArrayList<l.b> parentStates;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final c0<l.b> _currentStateFlow;

    /* JADX INFO: renamed from: androidx.lifecycle.u$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/lifecycle/u$a;", "", "<init>", "()V", "Landroidx/lifecycle/s;", "owner", "Landroidx/lifecycle/u;", "a", "(Landroidx/lifecycle/s;)Landroidx/lifecycle/u;", "Landroidx/lifecycle/l$b;", "state1", "state2", "b", "(Landroidx/lifecycle/l$b;Landroidx/lifecycle/l$b;)Landroidx/lifecycle/l$b;", "lifecycle-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final u a(@NotNull s owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            return new u(owner, false, null);
        }

        @NotNull
        public final l.b b(@NotNull l.b state1, @Nullable l.b state2) {
            Intrinsics.checkNotNullParameter(state1, "state1");
            return (state2 == null || state2.compareTo(state1) >= 0) ? state1 : state2;
        }

        public Companion() {
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0014\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u001b\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroidx/lifecycle/u$b;", "", "Landroidx/lifecycle/r;", "observer", "Landroidx/lifecycle/l$b;", "initialState", "<init>", "(Landroidx/lifecycle/r;Landroidx/lifecycle/l$b;)V", "Landroidx/lifecycle/s;", "owner", "Landroidx/lifecycle/l$a;", "event", "", "a", "(Landroidx/lifecycle/s;Landroidx/lifecycle/l$a;)V", "Landroidx/lifecycle/l$b;", "b", "()Landroidx/lifecycle/l$b;", "setState", "(Landroidx/lifecycle/l$b;)V", "state", "Landroidx/lifecycle/p;", "Landroidx/lifecycle/p;", "getLifecycleObserver", "()Landroidx/lifecycle/p;", "setLifecycleObserver", "(Landroidx/lifecycle/p;)V", "lifecycleObserver", "lifecycle-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public l.b state;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public p lifecycleObserver;

        public b(@Nullable r rVar, @NotNull l.b initialState) {
            Intrinsics.checkNotNullParameter(initialState, "initialState");
            Intrinsics.checkNotNull(rVar);
            this.lifecycleObserver = z.f(rVar);
            this.state = initialState;
        }

        public final void a(@Nullable s owner, @NotNull l.a event) {
            Intrinsics.checkNotNullParameter(event, "event");
            l.b bVarB = event.b();
            this.state = u.INSTANCE.b(this.state, bVarB);
            p pVar = this.lifecycleObserver;
            Intrinsics.checkNotNull(owner);
            pVar.g(owner, event);
            this.state = bVarB;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final l.b getState() {
            return this.state;
        }
    }

    public /* synthetic */ u(s sVar, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(sVar, z10);
    }

    @NotNull
    public static final u g(@NotNull s sVar) {
        return INSTANCE.a(sVar);
    }

    @Override // androidx.p000lifecycle.l
    public void a(@NotNull r observer) {
        s sVar;
        Intrinsics.checkNotNullParameter(observer, "observer");
        h("addObserver");
        l.b bVar = this.state;
        l.b bVar2 = l.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = l.b.INITIALIZED;
        }
        b bVar3 = new b(observer, bVar2);
        if (this.observerMap.f(observer, bVar3) == null && (sVar = this.lifecycleOwner.get()) != null) {
            boolean z10 = this.addingObserverCounter != 0 || this.handlingEvent;
            l.b bVarF = f(observer);
            this.addingObserverCounter++;
            while (bVar3.getState().compareTo(bVarF) < 0 && this.observerMap.contains(observer)) {
                n(bVar3.getState());
                l.a aVarB = l.a.INSTANCE.b(bVar3.getState());
                if (aVarB == null) {
                    throw new IllegalStateException("no event up from " + bVar3.getState());
                }
                bVar3.a(sVar, aVarB);
                m();
                bVarF = f(observer);
            }
            if (!z10) {
                p();
            }
            this.addingObserverCounter--;
        }
    }

    @Override // androidx.p000lifecycle.l
    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public l.b getState() {
        return this.state;
    }

    @Override // androidx.p000lifecycle.l
    public void d(@NotNull r observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        h("removeObserver");
        this.observerMap.g(observer);
    }

    public final void e(s lifecycleOwner) {
        Iterator<Map.Entry<r, b>> itDescendingIterator = this.observerMap.descendingIterator();
        Intrinsics.checkNotNullExpressionValue(itDescendingIterator, "descendingIterator(...)");
        while (itDescendingIterator.hasNext() && !this.newEventOccurred) {
            Map.Entry<r, b> next = itDescendingIterator.next();
            Intrinsics.checkNotNull(next);
            r key = next.getKey();
            b value = next.getValue();
            while (value.getState().compareTo(this.state) > 0 && !this.newEventOccurred && this.observerMap.contains(key)) {
                l.a aVarA = l.a.INSTANCE.a(value.getState());
                if (aVarA == null) {
                    throw new IllegalStateException("no event down from " + value.getState());
                }
                n(aVarA.b());
                value.a(lifecycleOwner, aVarA);
                m();
            }
        }
    }

    public final l.b f(r observer) {
        b value;
        Map.Entry<r, b> entryH = this.observerMap.h(observer);
        l.b bVar = null;
        l.b state = (entryH == null || (value = entryH.getValue()) == null) ? null : value.getState();
        if (!this.parentStates.isEmpty()) {
            ArrayList<l.b> arrayList = this.parentStates;
            bVar = arrayList.get(arrayList.size() - 1);
        }
        Companion companion = INSTANCE;
        return companion.b(companion.b(this.state, state), bVar);
    }

    public final void h(String methodName) {
        if (!this.enforceMainThread || x.a()) {
            return;
        }
        throw new IllegalStateException(("Method " + methodName + " must be called on the main thread").toString());
    }

    public final void i(s lifecycleOwner) {
        s.b<r, b>.d dVarC = this.observerMap.c();
        Intrinsics.checkNotNullExpressionValue(dVarC, "iteratorWithAdditions(...)");
        while (dVarC.hasNext() && !this.newEventOccurred) {
            Map.Entry next = dVarC.next();
            r rVar = (r) next.getKey();
            b bVar = (b) next.getValue();
            while (bVar.getState().compareTo(this.state) < 0 && !this.newEventOccurred && this.observerMap.contains(rVar)) {
                n(bVar.getState());
                l.a aVarB = l.a.INSTANCE.b(bVar.getState());
                if (aVarB == null) {
                    throw new IllegalStateException("no event up from " + bVar.getState());
                }
                bVar.a(lifecycleOwner, aVarB);
                m();
            }
        }
    }

    public void j(@NotNull l.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        h("handleLifecycleEvent");
        l(event.b());
    }

    public final boolean k() {
        if (this.observerMap.size() == 0) {
            return true;
        }
        Map.Entry<r, b> entryA = this.observerMap.a();
        Intrinsics.checkNotNull(entryA);
        l.b state = entryA.getValue().getState();
        Map.Entry<r, b> entryD = this.observerMap.d();
        Intrinsics.checkNotNull(entryD);
        l.b state2 = entryD.getValue().getState();
        return state == state2 && this.state == state2;
    }

    public final void l(l.b next) {
        if (this.state == next) {
            return;
        }
        v.a(this.lifecycleOwner.get(), this.state, next);
        this.state = next;
        if (this.handlingEvent || this.addingObserverCounter != 0) {
            this.newEventOccurred = true;
            return;
        }
        this.handlingEvent = true;
        p();
        this.handlingEvent = false;
        if (this.state == l.b.DESTROYED) {
            this.observerMap = new a<>();
        }
    }

    public final void m() {
        ArrayList<l.b> arrayList = this.parentStates;
        arrayList.remove(arrayList.size() - 1);
    }

    public final void n(l.b state) {
        this.parentStates.add(state);
    }

    public void o(@NotNull l.b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        h("setCurrentState");
        l(state);
    }

    public final void p() {
        s sVar = this.lifecycleOwner.get();
        if (sVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (!k()) {
            this.newEventOccurred = false;
            l.b bVar = this.state;
            Map.Entry<r, b> entryA = this.observerMap.a();
            Intrinsics.checkNotNull(entryA);
            if (bVar.compareTo(entryA.getValue().getState()) < 0) {
                e(sVar);
            }
            Map.Entry<r, b> entryD = this.observerMap.d();
            if (!this.newEventOccurred && entryD != null && this.state.compareTo(entryD.getValue().getState()) > 0) {
                i(sVar);
            }
        }
        this.newEventOccurred = false;
        this._currentStateFlow.setValue(getState());
    }

    public u(s sVar, boolean z10) {
        this.enforceMainThread = z10;
        this.observerMap = new a<>();
        l.b bVar = l.b.INITIALIZED;
        this.state = bVar;
        this.parentStates = new ArrayList<>();
        this.lifecycleOwner = new WeakReference<>(sVar);
        this._currentStateFlow = r0.a(bVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(@NotNull s provider) {
        this(provider, true);
        Intrinsics.checkNotNullParameter(provider, "provider");
    }
}
