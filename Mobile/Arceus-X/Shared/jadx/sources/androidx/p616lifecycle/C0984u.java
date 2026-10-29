package androidx.p616lifecycle;

import androidx.core.app.NotificationCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nu.C9596r0;
import nu.InterfaceC9566c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p423s.C11138a;
import p423s.C11139b;

/* JADX INFO: renamed from: androidx.lifecycle.u */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 ?2\u00020\u0001:\u0002%\u0010B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001c\u0010\u0016J\u0017\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001e\u0010\bJ\u0017\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001f\u0010\bJ\u000f\u0010 \u001a\u00020\u000bH\u0002¢\u0006\u0004\b \u0010\u001aJ\u0017\u0010#\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\"\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020(0'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010\u001b\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010,R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010.R\u0016\u00101\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u00100R\u0016\u00103\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010&R\u0016\u00104\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010&R&\u00108\u001a\u0012\u0012\u0004\u0012\u00020\u001305j\b\u0012\u0004\u0012\u00020\u0013`68\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u00107R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\u0013098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010:R$\u0010>\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u00138V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b%\u0010<\"\u0004\b=\u0010\u0016R\u0014\u0010A\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006B"}, m31665d2 = {"Landroidx/lifecycle/u;", "Landroidx/lifecycle/l;", "Landroidx/lifecycle/s;", "provider", "", "enforceMainThread", "<init>", "(Landroidx/lifecycle/s;Z)V", "(Landroidx/lifecycle/s;)V", "Landroidx/lifecycle/l$a;", NotificationCompat.CATEGORY_EVENT, "", "j", "(Landroidx/lifecycle/l$a;)V", "Landroidx/lifecycle/r;", "observer", "a", "(Landroidx/lifecycle/r;)V", "d", "Landroidx/lifecycle/l$b;", "next", "l", "(Landroidx/lifecycle/l$b;)V", "f", "(Landroidx/lifecycle/r;)Landroidx/lifecycle/l$b;", "m", "()V", "state", "n", "lifecycleOwner", "i", "e", "p", "", "methodName", "h", "(Ljava/lang/String;)V", "b", "Z", "Ls/a;", "Landroidx/lifecycle/u$b;", "c", "Ls/a;", "observerMap", "Landroidx/lifecycle/l$b;", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "", "I", "addingObserverCounter", "g", "handlingEvent", "newEventOccurred", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "parentStates", "Lnu/c0;", "Lnu/c0;", "_currentStateFlow", "()Landroidx/lifecycle/l$b;", "o", "currentState", "k", "()Z", "isSynced", "lifecycle-runtime"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public class C0984u extends AbstractC0966l {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean enforceMainThread;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public C11138a<InterfaceC0978r, b> observerMap;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public AbstractC0966l.b state;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final WeakReference<InterfaceC0980s> lifecycleOwner;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int addingObserverCounter;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public boolean handlingEvent;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public boolean newEventOccurred;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public ArrayList<AbstractC0966l.b> parentStates;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC9566c0<AbstractC0966l.b> _currentStateFlow;

    /* JADX INFO: renamed from: androidx.lifecycle.u$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m31665d2 = {"Landroidx/lifecycle/u$a;", "", "<init>", "()V", "Landroidx/lifecycle/s;", "owner", "Landroidx/lifecycle/u;", "a", "(Landroidx/lifecycle/s;)Landroidx/lifecycle/u;", "Landroidx/lifecycle/l$b;", "state1", "state2", "b", "(Landroidx/lifecycle/l$b;Landroidx/lifecycle/l$b;)Landroidx/lifecycle/l$b;", "lifecycle-runtime"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: androidx.lifecycle.u.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final C0984u m4993a(@NotNull InterfaceC0980s owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            return new C0984u(owner, false, null);
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final AbstractC0966l.b m4994b(@NotNull AbstractC0966l.b state1, @Nullable AbstractC0966l.b state2) {
            Intrinsics.checkNotNullParameter(state1, "state1");
            return (state2 == null || state2.compareTo(state1) >= 0) ? state1 : state2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.u$b */
    @Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0014\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u001b\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m31665d2 = {"Landroidx/lifecycle/u$b;", "", "Landroidx/lifecycle/r;", "observer", "Landroidx/lifecycle/l$b;", "initialState", "<init>", "(Landroidx/lifecycle/r;Landroidx/lifecycle/l$b;)V", "Landroidx/lifecycle/s;", "owner", "Landroidx/lifecycle/l$a;", NotificationCompat.CATEGORY_EVENT, "", "a", "(Landroidx/lifecycle/s;Landroidx/lifecycle/l$a;)V", "Landroidx/lifecycle/l$b;", "b", "()Landroidx/lifecycle/l$b;", "setState", "(Landroidx/lifecycle/l$b;)V", "state", "Landroidx/lifecycle/p;", "Landroidx/lifecycle/p;", "getLifecycleObserver", "()Landroidx/lifecycle/p;", "setLifecycleObserver", "(Landroidx/lifecycle/p;)V", "lifecycleObserver", "lifecycle-runtime"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public AbstractC0966l.b state;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public InterfaceC0974p lifecycleObserver;

        public b(@Nullable InterfaceC0978r interfaceC0978r, @NotNull AbstractC0966l.b initialState) {
            Intrinsics.checkNotNullParameter(initialState, "initialState");
            Intrinsics.checkNotNull(interfaceC0978r);
            this.lifecycleObserver = C0994z.m5015f(interfaceC0978r);
            this.state = initialState;
        }

        /* JADX INFO: renamed from: a */
        public final void m4995a(@Nullable InterfaceC0980s owner, @NotNull AbstractC0966l.a event) {
            Intrinsics.checkNotNullParameter(event, "event");
            AbstractC0966l.b bVarM4940b = event.m4940b();
            this.state = C0984u.INSTANCE.m4994b(this.state, bVarM4940b);
            InterfaceC0974p interfaceC0974p = this.lifecycleObserver;
            Intrinsics.checkNotNull(owner);
            interfaceC0974p.mo1334g(owner, event);
            this.state = bVarM4940b;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final AbstractC0966l.b getState() {
            return this.state;
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 androidx.lifecycle.s), (r2v0 boolean) A[MD:(androidx.lifecycle.s, boolean):void (m)] (LINE:1) call: androidx.lifecycle.u.<init>(androidx.lifecycle.s, boolean):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0984u(InterfaceC0980s interfaceC0980s, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC0980s, z10);
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final C0984u m4981g(@NotNull InterfaceC0980s interfaceC0980s) {
        return INSTANCE.m4993a(interfaceC0980s);
    }

    @Override // androidx.p616lifecycle.AbstractC0966l
    /* JADX INFO: renamed from: a */
    public void mo4935a(@NotNull InterfaceC0978r observer) {
        InterfaceC0980s interfaceC0980s;
        Intrinsics.checkNotNullParameter(observer, "observer");
        m4984h("addObserver");
        AbstractC0966l.b bVar = this.state;
        AbstractC0966l.b bVar2 = AbstractC0966l.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = AbstractC0966l.b.INITIALIZED;
        }
        b bVar3 = new b(observer, bVar2);
        if (this.observerMap.mo41918f(observer, bVar3) == null && (interfaceC0980s = this.lifecycleOwner.get()) != null) {
            boolean z10 = this.addingObserverCounter != 0 || this.handlingEvent;
            AbstractC0966l.b bVarM4983f = m4983f(observer);
            this.addingObserverCounter++;
            while (bVar3.getState().compareTo(bVarM4983f) < 0 && this.observerMap.contains(observer)) {
                m4990n(bVar3.getState());
                AbstractC0966l.a aVarM4942b = AbstractC0966l.a.INSTANCE.m4942b(bVar3.getState());
                if (aVarM4942b == null) {
                    throw new IllegalStateException("no event up from " + bVar3.getState());
                }
                bVar3.m4995a(interfaceC0980s, aVarM4942b);
                m4989m();
                bVarM4983f = m4983f(observer);
            }
            if (!z10) {
                m4992p();
            }
            this.addingObserverCounter--;
        }
    }

    @Override // androidx.p616lifecycle.AbstractC0966l
    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public AbstractC0966l.b getState() {
        return this.state;
    }

    @Override // androidx.p616lifecycle.AbstractC0966l
    /* JADX INFO: renamed from: d */
    public void mo4938d(@NotNull InterfaceC0978r observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        m4984h("removeObserver");
        this.observerMap.mo41919g(observer);
    }

    /* JADX INFO: renamed from: e */
    public final void m4982e(InterfaceC0980s lifecycleOwner) {
        Iterator<Map.Entry<InterfaceC0978r, b>> itDescendingIterator = this.observerMap.descendingIterator();
        Intrinsics.checkNotNullExpressionValue(itDescendingIterator, "descendingIterator(...)");
        while (itDescendingIterator.hasNext() && !this.newEventOccurred) {
            Map.Entry<InterfaceC0978r, b> next = itDescendingIterator.next();
            Intrinsics.checkNotNull(next);
            InterfaceC0978r key = next.getKey();
            b value = next.getValue();
            while (value.getState().compareTo(this.state) > 0 && !this.newEventOccurred && this.observerMap.contains(key)) {
                AbstractC0966l.a aVarM4941a = AbstractC0966l.a.INSTANCE.m4941a(value.getState());
                if (aVarM4941a == null) {
                    throw new IllegalStateException("no event down from " + value.getState());
                }
                m4990n(aVarM4941a.m4940b());
                value.m4995a(lifecycleOwner, aVarM4941a);
                m4989m();
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final AbstractC0966l.b m4983f(InterfaceC0978r observer) {
        b value;
        Map.Entry<InterfaceC0978r, b> entryM41920h = this.observerMap.m41920h(observer);
        AbstractC0966l.b bVar = null;
        AbstractC0966l.b state = (entryM41920h == null || (value = entryM41920h.getValue()) == null) ? null : value.getState();
        if (!this.parentStates.isEmpty()) {
            ArrayList<AbstractC0966l.b> arrayList = this.parentStates;
            bVar = arrayList.get(arrayList.size() - 1);
        }
        Companion companion = INSTANCE;
        return companion.m4994b(companion.m4994b(this.state, state), bVar);
    }

    /* JADX INFO: renamed from: h */
    public final void m4984h(String methodName) {
        if (!this.enforceMainThread || C0990x.m5008a()) {
            return;
        }
        throw new IllegalStateException(("Method " + methodName + " must be called on the main thread").toString());
    }

    /* JADX INFO: renamed from: i */
    public final void m4985i(InterfaceC0980s lifecycleOwner) {
        C11139b<InterfaceC0978r, b>.d dVarM41922c = this.observerMap.m41922c();
        Intrinsics.checkNotNullExpressionValue(dVarM41922c, "iteratorWithAdditions(...)");
        while (dVarM41922c.hasNext() && !this.newEventOccurred) {
            Map.Entry next = dVarM41922c.next();
            InterfaceC0978r interfaceC0978r = (InterfaceC0978r) next.getKey();
            b bVar = (b) next.getValue();
            while (bVar.getState().compareTo(this.state) < 0 && !this.newEventOccurred && this.observerMap.contains(interfaceC0978r)) {
                m4990n(bVar.getState());
                AbstractC0966l.a aVarM4942b = AbstractC0966l.a.INSTANCE.m4942b(bVar.getState());
                if (aVarM4942b == null) {
                    throw new IllegalStateException("no event up from " + bVar.getState());
                }
                bVar.m4995a(lifecycleOwner, aVarM4942b);
                m4989m();
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public void m4986j(@NotNull AbstractC0966l.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        m4984h("handleLifecycleEvent");
        m4988l(event.m4940b());
    }

    /* JADX INFO: renamed from: k */
    public final boolean m4987k() {
        if (this.observerMap.size() == 0) {
            return true;
        }
        Map.Entry<InterfaceC0978r, b> entryM41921a = this.observerMap.m41921a();
        Intrinsics.checkNotNull(entryM41921a);
        AbstractC0966l.b state = entryM41921a.getValue().getState();
        Map.Entry<InterfaceC0978r, b> entryM41923d = this.observerMap.m41923d();
        Intrinsics.checkNotNull(entryM41923d);
        AbstractC0966l.b state2 = entryM41923d.getValue().getState();
        return state == state2 && this.state == state2;
    }

    /* JADX INFO: renamed from: l */
    public final void m4988l(AbstractC0966l.b next) {
        if (this.state == next) {
            return;
        }
        C0986v.m5001a(this.lifecycleOwner.get(), this.state, next);
        this.state = next;
        if (this.handlingEvent || this.addingObserverCounter != 0) {
            this.newEventOccurred = true;
            return;
        }
        this.handlingEvent = true;
        m4992p();
        this.handlingEvent = false;
        if (this.state == AbstractC0966l.b.DESTROYED) {
            this.observerMap = new C11138a<>();
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m4989m() {
        ArrayList<AbstractC0966l.b> arrayList = this.parentStates;
        arrayList.remove(arrayList.size() - 1);
    }

    /* JADX INFO: renamed from: n */
    public final void m4990n(AbstractC0966l.b state) {
        this.parentStates.add(state);
    }

    /* JADX INFO: renamed from: o */
    public void m4991o(@NotNull AbstractC0966l.b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        m4984h("setCurrentState");
        m4988l(state);
    }

    /* JADX INFO: renamed from: p */
    public final void m4992p() {
        InterfaceC0980s interfaceC0980s = this.lifecycleOwner.get();
        if (interfaceC0980s == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (!m4987k()) {
            this.newEventOccurred = false;
            AbstractC0966l.b bVar = this.state;
            Map.Entry<InterfaceC0978r, b> entryM41921a = this.observerMap.m41921a();
            Intrinsics.checkNotNull(entryM41921a);
            if (bVar.compareTo(entryM41921a.getValue().getState()) < 0) {
                m4982e(interfaceC0980s);
            }
            Map.Entry<InterfaceC0978r, b> entryM41923d = this.observerMap.m41923d();
            if (!this.newEventOccurred && entryM41923d != null && this.state.compareTo(entryM41923d.getValue().getState()) > 0) {
                m4985i(interfaceC0980s);
            }
        }
        this.newEventOccurred = false;
        this._currentStateFlow.setValue(getState());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C0984u(InterfaceC0980s interfaceC0980s, boolean z10) {
        this.enforceMainThread = z10;
        this.observerMap = new C11138a<>();
        AbstractC0966l.b bVar = AbstractC0966l.b.INITIALIZED;
        this.state = bVar;
        this.parentStates = new ArrayList<>();
        this.lifecycleOwner = new WeakReference<>(interfaceC0980s);
        this._currentStateFlow = C9596r0.m37859a(bVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0984u(@NotNull InterfaceC0980s provider) {
        this(provider, true);
        Intrinsics.checkNotNullParameter(provider, "provider");
    }
}
