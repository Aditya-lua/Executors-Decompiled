package p296n0;

import androidx.p616lifecycle.AbstractC0940a0;
import androidx.p616lifecycle.InterfaceC0952e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7690k0;
import kotlin.collections.C7699p;
import kotlin.collections.C7701q;
import kotlin.collections.C7704r0;
import kotlin.collections.C7709v;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p140g0.AbstractC5949w;
import p140g0.C5931r1;
import p140g0.C5933s;
import p140g0.InterfaceC5941u;
import p366q0.C10417c;

/* JADX INFO: renamed from: n0.y0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 &2\u00020\u0001:\u0003.1,B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u001b\u001a\u00020\n2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b%\u0010 J\u000f\u0010&\u001a\u00020\nH\u0002¢\u0006\u0004\b&\u0010\u000eJ\u001d\u0010(\u001a\u00020\n2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00140\u0018H\u0002¢\u0006\u0004\b(\u0010)J\u001d\u0010+\u001a\u00020\n2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00140\u0018H\u0002¢\u0006\u0004\b+\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00100\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R$\u00108\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010<\u001a\u000609R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001c\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020\u000f0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020H0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010FR&\u0010O\u001a\u0014\u0012\u0004\u0012\u00020\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020M0L0K8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010N¨\u0006P"}, m31665d2 = {"Ln0/y0;", "", "Ljava/util/concurrent/Executor;", "backgroundExecutor", "<init>", "(Ljava/util/concurrent/Executor;)V", "Ln0/n0;", "cameraFactory", "Ln0/d1;", "cameraRepository", "", "A", "(Ln0/n0;Ln0/d1;)V", "z", "()V", "Ln0/l2;", "listener", "k", "(Ln0/l2;)V", "", "Lg0/s;", "newFilteredIdentifiers", "t", "(Ljava/util/List;)V", "", "addedCameras", "removedCameras", "s", "(Ljava/util/Set;Ljava/util/Set;)V", "", "systemCameraId", "n", "(Ljava/lang/String;)V", "Ln0/o0;", "cameraInfoInternal", "w", "(Ln0/o0;)V", "u", "l", "addedIds", "o", "(Ljava/util/Set;)V", "removedIds", "q", "a", "Ljava/util/concurrent/Executor;", "b", "Ljava/lang/Object;", "observerLock", "c", "Ln0/n0;", "d", "Ln0/d1;", "Ln0/a3;", "e", "Ln0/a3;", "sourcePresenceObservable", "Ln0/y0$c;", "f", "Ln0/y0$c;", "sourceObserver", "g", "Ljava/util/List;", "currentFilteredIds", "Ljava/util/concurrent/atomic/AtomicBoolean;", "h", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isMonitoring", "Ljava/util/concurrent/CopyOnWriteArrayList;", "i", "Ljava/util/concurrent/CopyOnWriteArrayList;", "dependentInternalListeners", "Ln0/y0$b;", "j", "publicApiListeners", "", "Landroidx/lifecycle/e0;", "Lg0/w;", "Ljava/util/Map;", "cameraStateObservers", "camera-core_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C8849y0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Executor backgroundExecutor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Object observerLock;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public InterfaceC8794n0 cameraFactory;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public C8738d1 cameraRepository;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public InterfaceC8722a3<List<C5933s>> sourcePresenceObservable;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final c sourceObserver;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public volatile List<C5933s> currentFilteredIds;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final AtomicBoolean isMonitoring;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final CopyOnWriteArrayList<InterfaceC8786l2> dependentInternalListeners;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final CopyOnWriteArrayList<ListenerWrapper> publicApiListeners;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Map<String, InterfaceC0952e0<AbstractC5949w>> cameraStateObservers;

    /* JADX INFO: renamed from: n0.y0$b, reason: from toString */
    @Metadata(m31664d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m31665d2 = {"Ln0/y0$b;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/concurrent/Executor;", "a", "Ljava/util/concurrent/Executor;", "()Ljava/util/concurrent/Executor;", "executor", "Lg0/u;", "listener", "Lg0/u;", "b", "()Lg0/u;", "camera-core_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final /* data */ class ListenerWrapper {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final Executor executor;

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Executor getExecutor() {
            return this.executor;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final InterfaceC5941u m35544b() {
            return null;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (other instanceof ListenerWrapper) {
                return Intrinsics.m31980c(null, null) && Intrinsics.m31980c(this.executor, ((ListenerWrapper) other).executor);
            }
            return false;
        }

        public int hashCode() {
            throw null;
        }

        @NotNull
        public String toString() {
            return "ListenerWrapper(listener=" + ((Object) null) + ", executor=" + this.executor + ')';
        }
    }

    /* JADX INFO: renamed from: n0.y0$c */
    @Metadata(m31664d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m31665d2 = {"Ln0/y0$c;", "Ln0/a3$a;", "", "Lg0/s;", "<init>", "(Ln0/y0;)V", "rawCameraIdentifiers", "", "b", "(Ljava/util/List;)V", "", "t", "onError", "(Ljava/lang/Throwable;)V", "camera-core_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public final class c implements InterfaceC8722a3.a<List<? extends C5933s>> {
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public c() {
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)V */
        @Override // p296n0.InterfaceC8722a3.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo2367a(@Nullable List<C5933s> rawCameraIdentifiers) {
            InterfaceC8794n0 interfaceC8794n0;
            List<String> listM31892k;
            if (C8849y0.this.isMonitoring.get() && (interfaceC8794n0 = C8849y0.this.cameraFactory) != null) {
                if (rawCameraIdentifiers != null) {
                    List<C5933s> list = rawCameraIdentifiers;
                    listM31892k = new ArrayList<>(C7701q.m31905u(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        listM31892k.add(((C5933s) it.next()).m26576c());
                    }
                } else {
                    listM31892k = C7699p.m31892k();
                }
                try {
                    interfaceC8794n0.mo35390e(listM31892k);
                    Set<String> setMo35285d = interfaceC8794n0.mo35285d();
                    Intrinsics.checkNotNullExpressionValue(setMo35285d, "getAvailableCameraIds(...)");
                    Set<String> set = setMo35285d;
                    ArrayList arrayList = new ArrayList(C7701q.m31905u(set, 10));
                    for (String str : set) {
                        C5933s.Companion companion = C5933s.INSTANCE;
                        Intrinsics.checkNotNull(str);
                        arrayList.add(C5933s.Companion.m26577d(companion, str, null, null, 6, null));
                    }
                    C8849y0.this.m35539t(arrayList);
                } catch (Exception e10) {
                    C5931r1.m26564d("CameraPresencePrvdr", "CameraFactory failed to update. Triggering refresh.", e10);
                    InterfaceC8722a3 interfaceC8722a3 = C8849y0.this.sourcePresenceObservable;
                    if (interfaceC8722a3 != null) {
                        interfaceC8722a3.mo34017b();
                    }
                }
            }
        }

        @Override // p296n0.InterfaceC8722a3.a
        public void onError(@NotNull Throwable t8) {
            Intrinsics.checkNotNullParameter(t8, "t");
            if (C8849y0.this.isMonitoring.get()) {
                C5931r1.m26564d("CameraPresencePrvdr", "Error from source camera presence observable. Triggering refresh.", t8);
                InterfaceC8722a3 interfaceC8722a3 = C8849y0.this.sourcePresenceObservable;
                if (interfaceC8722a3 != null) {
                    interfaceC8722a3.mo34017b();
                }
            }
        }
    }

    public C8849y0(@NotNull Executor backgroundExecutor) {
        Intrinsics.checkNotNullParameter(backgroundExecutor, "backgroundExecutor");
        this.backgroundExecutor = backgroundExecutor;
        this.observerLock = new Object();
        this.sourceObserver = new c();
        this.currentFilteredIds = C7699p.m31892k();
        this.isMonitoring = new AtomicBoolean(false);
        this.dependentInternalListeners = new CopyOnWriteArrayList<>();
        this.publicApiListeners = new CopyOnWriteArrayList<>();
        this.cameraStateObservers = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: m */
    public static final void m35526m(List list, InterfaceC0952e0 interfaceC0952e0, String str) {
        Object next;
        AbstractC0940a0<AbstractC5949w> abstractC0940a0Mo26582b;
        try {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.m31980c(((InterfaceC8799o0) next).mo6750e(), str));
            InterfaceC8799o0 interfaceC8799o0 = (InterfaceC8799o0) next;
            if (interfaceC8799o0 == null || (abstractC0940a0Mo26582b = interfaceC8799o0.mo26582b()) == null) {
                return;
            }
            abstractC0940a0Mo26582b.mo4862n(interfaceC0952e0);
        } catch (IllegalArgumentException unused) {
        }
    }

    /* JADX INFO: renamed from: p */
    public static final void m35527p(ListenerWrapper listenerWrapper, Set set) {
        listenerWrapper.m35544b();
        throw null;
    }

    /* JADX INFO: renamed from: r */
    public static final void m35528r(ListenerWrapper listenerWrapper, Set set) {
        listenerWrapper.m35544b();
        throw null;
    }

    /* JADX INFO: renamed from: v */
    public static final void m35529v(InterfaceC8804p0 interfaceC8804p0, InterfaceC0952e0 interfaceC0952e0) {
        interfaceC8804p0.mo6698k().mo26582b().mo4862n(interfaceC0952e0);
    }

    /* JADX INFO: renamed from: x */
    public static final void m35530x(C8849y0 c8849y0, String str, AbstractC5949w abstractC5949w) {
        if (!c8849y0.isMonitoring.get()) {
            C5931r1.m26561a("CameraPresencePrvdr", "Ignore camera state change handling since already stop monitoring");
            return;
        }
        if ((abstractC5949w != null ? abstractC5949w.mo26327c() : null) == null) {
            if ((abstractC5949w != null ? abstractC5949w.mo26328d() : null) != AbstractC5949w.b.CLOSED) {
                return;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Camera ");
        sb2.append(str);
        sb2.append(" state changed to ");
        sb2.append(abstractC5949w.mo26328d());
        sb2.append(" with error: ");
        AbstractC5949w.a aVarMo26327c = abstractC5949w.mo26327c();
        sb2.append(aVarMo26327c != null ? Integer.valueOf(aVarMo26327c.mo26330d()) : null);
        sb2.append(". Triggering refresh.");
        C5931r1.m26572l("CameraPresencePrvdr", sb2.toString());
        InterfaceC8722a3<List<C5933s>> interfaceC8722a3 = c8849y0.sourcePresenceObservable;
        if (interfaceC8722a3 != null) {
            interfaceC8722a3.mo34017b();
        }
    }

    /* JADX INFO: renamed from: y */
    public static final void m35531y(InterfaceC8799o0 interfaceC8799o0, InterfaceC0952e0 interfaceC0952e0) {
        interfaceC8799o0.mo26582b().m4858j(interfaceC0952e0);
    }

    /* JADX INFO: renamed from: A */
    public final void m35532A(@NotNull InterfaceC8794n0 cameraFactory, @NotNull C8738d1 cameraRepository) {
        Intrinsics.checkNotNullParameter(cameraFactory, "cameraFactory");
        Intrinsics.checkNotNullParameter(cameraRepository, "cameraRepository");
        if (this.isMonitoring.compareAndSet(false, true)) {
            C5931r1.m26565e("CameraPresencePrvdr", "Starting CameraPresenceProvider monitoring.");
            Set<String> setMo35285d = cameraFactory.mo35285d();
            Intrinsics.checkNotNullExpressionValue(setMo35285d, "getAvailableCameraIds(...)");
            Set<String> set = setMo35285d;
            ArrayList arrayList = new ArrayList(C7701q.m31905u(set, 10));
            for (String str : set) {
                C5933s.Companion companion = C5933s.INSTANCE;
                Intrinsics.checkNotNull(str);
                arrayList.add(C5933s.Companion.m26577d(companion, str, null, null, 6, null));
            }
            this.currentFilteredIds = arrayList;
            this.cameraFactory = cameraFactory;
            this.cameraRepository = cameraRepository;
            InterfaceC8722a3<List<C5933s>> interfaceC8722a3Mo35284c = cameraFactory.mo35284c();
            this.sourcePresenceObservable = interfaceC8722a3Mo35284c;
            if (interfaceC8722a3Mo35284c != null) {
                interfaceC8722a3Mo35284c.mo34018c(this.backgroundExecutor, this.sourceObserver);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m35533k(@NotNull InterfaceC8786l2 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.dependentInternalListeners.add(listener);
    }

    /* JADX INFO: renamed from: l */
    public final void m35534l() {
        synchronized (this.observerLock) {
            if (this.cameraStateObservers.isEmpty()) {
                return;
            }
            Map mapM31807v = C7690k0.m31807v(this.cameraStateObservers);
            this.cameraStateObservers.clear();
            Unit unit = Unit.f29331a;
            C8738d1 c8738d1 = this.cameraRepository;
            if (c8738d1 != null) {
                LinkedHashSet<InterfaceC8804p0> linkedHashSetM35040m = c8738d1.m35040m();
                Intrinsics.checkNotNullExpressionValue(linkedHashSetM35040m, "getCameras(...)");
                final ArrayList arrayList = new ArrayList(C7701q.m31905u(linkedHashSetM35040m, 10));
                Iterator<T> it = linkedHashSetM35040m.iterator();
                while (it.hasNext()) {
                    arrayList.add(((InterfaceC8804p0) it.next()).mo6698k());
                }
                C5931r1.m26561a("CameraPresencePrvdr", "Clearing all " + mapM31807v.size() + " state observers.");
                ArrayList arrayList2 = new ArrayList(mapM31807v.size());
                for (Map.Entry entry : mapM31807v.entrySet()) {
                    final String str = (String) entry.getKey();
                    final InterfaceC0952e0 interfaceC0952e0 = (InterfaceC0952e0) entry.getValue();
                    C10417c.m40084e().execute(new Runnable() { // from class: n0.x0
                        @Override // java.lang.Runnable
                        public final void run() {
                            C8849y0.m35526m(arrayList, interfaceC0952e0, str);
                        }
                    });
                    arrayList2.add(Unit.f29331a);
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m35535n(String systemCameraId) {
        C8738d1 c8738d1 = this.cameraRepository;
        if (c8738d1 == null) {
            return;
        }
        try {
            InterfaceC8804p0 interfaceC8804p0M35039l = c8738d1.m35039l(systemCameraId);
            Intrinsics.checkNotNullExpressionValue(interfaceC8804p0M35039l, "getCamera(...)");
            InterfaceC8799o0 interfaceC8799o0Mo6698k = interfaceC8804p0M35039l.mo6698k();
            Intrinsics.checkNotNullExpressionValue(interfaceC8799o0Mo6698k, "getCameraInfoInternal(...)");
            m35541w(interfaceC8799o0Mo6698k);
        } catch (IllegalArgumentException unused) {
            C5931r1.m26572l("CameraPresencePrvdr", "CameraInternal not found for " + systemCameraId + ". Cannot setup state observer.");
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m35536o(final Set<C5933s> addedIds) {
        for (final ListenerWrapper listenerWrapper : this.publicApiListeners) {
            listenerWrapper.getExecutor().execute(new Runnable() { // from class: n0.u0
                @Override // java.lang.Runnable
                public final void run() {
                    C8849y0.m35527p(listenerWrapper, addedIds);
                }
            });
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m35537q(final Set<C5933s> removedIds) {
        for (final ListenerWrapper listenerWrapper : this.publicApiListeners) {
            listenerWrapper.getExecutor().execute(new Runnable() { // from class: n0.s0
                @Override // java.lang.Runnable
                public final void run() {
                    C8849y0.m35528r(listenerWrapper, removedIds);
                }
            });
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m35538s(Set<C5933s> addedCameras, Set<C5933s> removedCameras) {
        if (!addedCameras.isEmpty()) {
            C5931r1.m26565e("CameraPresencePrvdr", "Notifying " + addedCameras.size() + " cameras added.");
            m35536o(addedCameras);
        }
        if (removedCameras.isEmpty()) {
            return;
        }
        C5931r1.m26565e("CameraPresencePrvdr", "Notifying " + removedCameras.size() + " cameras removed.");
        m35537q(removedCameras);
    }

    /* JADX INFO: renamed from: t */
    public final void m35539t(List<C5933s> newFilteredIdentifiers) {
        List listM0 = CollectionsKt.m31687M0(this.currentFilteredIds);
        if (Intrinsics.m31980c(newFilteredIdentifiers, listM0)) {
            return;
        }
        List list = listM0;
        Set setQ0 = CollectionsKt.m31691Q0(list);
        List<C5933s> list2 = newFilteredIdentifiers;
        Set setQ1 = CollectionsKt.m31691Q0(list2);
        Set<C5933s> setM31912h = C7704r0.m31912h(setQ1, setQ0);
        Set<C5933s> setM31912h2 = C7704r0.m31912h(setQ0, setQ1);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(C7701q.m31905u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C5933s) it.next()).m26576c());
        }
        try {
            Iterator<T> it2 = setM31912h2.iterator();
            while (it2.hasNext()) {
                m35540u(((C5933s) it2.next()).m26576c());
            }
            C8738d1 c8738d1 = this.cameraRepository;
            if (c8738d1 != null) {
                C5931r1.m26561a("CameraPresencePrvdr", "Updating CameraRepository...");
                c8738d1.mo23117f(arrayList2);
                arrayList.add(c8738d1);
                C5931r1.m26561a("CameraPresencePrvdr", "CameraRepository updated successfully.");
            }
            if (!this.dependentInternalListeners.isEmpty()) {
                C5931r1.m26561a("CameraPresencePrvdr", "Updating " + this.dependentInternalListeners.size() + " dependent listeners...");
                for (InterfaceC8786l2 interfaceC8786l2 : this.dependentInternalListeners) {
                    interfaceC8786l2.mo23117f(arrayList2);
                    Intrinsics.checkNotNull(interfaceC8786l2);
                    arrayList.add(interfaceC8786l2);
                }
            }
            this.currentFilteredIds = newFilteredIdentifiers;
            Iterator<T> it3 = setM31912h.iterator();
            while (it3.hasNext()) {
                m35535n(((C5933s) it3.next()).m26576c());
            }
            m35538s(setM31912h, setM31912h2);
        } catch (Exception e10) {
            C5931r1.m26564d("CameraPresencePrvdr", "A core module failed to update. Rolling back changes.", e10);
            ArrayList arrayList3 = new ArrayList(C7701q.m31905u(list, 10));
            Iterator it4 = list.iterator();
            while (it4.hasNext()) {
                arrayList3.add(((C5933s) it4.next()).m26576c());
            }
            for (InterfaceC8786l2 interfaceC8786l3 : C7709v.m31935O(arrayList)) {
                try {
                    interfaceC8786l3.mo23117f(arrayList3);
                } catch (Exception e11) {
                    C5931r1.m26564d("CameraPresencePrvdr", "Failed to rollback listener: " + interfaceC8786l3, e11);
                }
            }
            Iterator<T> it5 = setM31912h2.iterator();
            while (it5.hasNext()) {
                m35535n(((C5933s) it5.next()).m26576c());
            }
            Iterator<T> it6 = setM31912h.iterator();
            while (it6.hasNext()) {
                m35540u(((C5933s) it6.next()).m26576c());
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m35540u(String systemCameraId) {
        synchronized (this.observerLock) {
            final InterfaceC0952e0<AbstractC5949w> interfaceC0952e0Remove = this.cameraStateObservers.remove(systemCameraId);
            C8738d1 c8738d1 = this.cameraRepository;
            if (interfaceC0952e0Remove != null && c8738d1 != null) {
                try {
                    final InterfaceC8804p0 interfaceC8804p0M35039l = c8738d1.m35039l(systemCameraId);
                    Intrinsics.checkNotNullExpressionValue(interfaceC8804p0M35039l, "getCamera(...)");
                    C10417c.m40084e().execute(new Runnable() { // from class: n0.t0
                        @Override // java.lang.Runnable
                        public final void run() {
                            C8849y0.m35529v(interfaceC8804p0M35039l, interfaceC0952e0Remove);
                        }
                    });
                    C5931r1.m26561a("CameraPresencePrvdr", "Removed state observer for: " + systemCameraId);
                } catch (IllegalArgumentException unused) {
                }
            }
            Unit unit = Unit.f29331a;
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m35541w(final InterfaceC8799o0 cameraInfoInternal) {
        final String strMo6750e = cameraInfoInternal.mo6750e();
        Intrinsics.checkNotNullExpressionValue(strMo6750e, "getCameraId(...)");
        if (this.isMonitoring.get()) {
            synchronized (this.observerLock) {
                if (this.cameraStateObservers.containsKey(strMo6750e)) {
                    return;
                }
                final InterfaceC0952e0<AbstractC5949w> interfaceC0952e0 = new InterfaceC0952e0() { // from class: n0.v0
                    @Override // androidx.p616lifecycle.InterfaceC0952e0
                    /* JADX INFO: renamed from: a */
                    public final void mo4884a(Object obj) {
                        C8849y0.m35530x(this.f32138a, strMo6750e, (AbstractC5949w) obj);
                    }
                };
                C10417c.m40084e().execute(new Runnable() { // from class: n0.w0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C8849y0.m35531y(cameraInfoInternal, interfaceC0952e0);
                    }
                });
                this.cameraStateObservers.put(strMo6750e, interfaceC0952e0);
                C5931r1.m26561a("CameraPresencePrvdr", "Registered state observer for camera: " + strMo6750e);
                Unit unit = Unit.f29331a;
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m35542z() {
        if (!this.isMonitoring.getAndSet(false)) {
            C5931r1.m26561a("CameraPresencePrvdr", "Shutdown called when not monitoring. Ignoring.");
            return;
        }
        C5931r1.m26565e("CameraPresencePrvdr", "Shutting down CameraPresenceProvider monitoring.");
        InterfaceC8722a3<List<C5933s>> interfaceC8722a3 = this.sourcePresenceObservable;
        if (interfaceC8722a3 != null) {
            interfaceC8722a3.mo34019d(this.sourceObserver);
        }
        m35534l();
        this.dependentInternalListeners.clear();
        this.publicApiListeners.clear();
        this.currentFilteredIds = C7699p.m31892k();
        this.cameraFactory = null;
        this.cameraRepository = null;
    }
}
