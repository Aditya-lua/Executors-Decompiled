package n0;

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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 &2\u00020\u0001:\u0003.1,B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u001b\u001a\u00020\n2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b%\u0010 J\u000f\u0010&\u001a\u00020\nH\u0002¢\u0006\u0004\b&\u0010\u000eJ\u001d\u0010(\u001a\u00020\n2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00140\u0018H\u0002¢\u0006\u0004\b(\u0010)J\u001d\u0010+\u001a\u00020\n2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00140\u0018H\u0002¢\u0006\u0004\b+\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00100\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R$\u00108\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010<\u001a\u000609R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001c\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020\u000f0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020H0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010FR&\u0010O\u001a\u0014\u0012\u0004\u0012\u00020\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020M0L0K8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010N¨\u0006P"}, d2 = {"Ln0/y0;", "", "Ljava/util/concurrent/Executor;", "backgroundExecutor", "<init>", "(Ljava/util/concurrent/Executor;)V", "Ln0/n0;", "cameraFactory", "Ln0/d1;", "cameraRepository", "", "A", "(Ln0/n0;Ln0/d1;)V", "z", "()V", "Ln0/l2;", "listener", "k", "(Ln0/l2;)V", "", "Lg0/s;", "newFilteredIdentifiers", "t", "(Ljava/util/List;)V", "", "addedCameras", "removedCameras", "s", "(Ljava/util/Set;Ljava/util/Set;)V", "", "systemCameraId", "n", "(Ljava/lang/String;)V", "Ln0/o0;", "cameraInfoInternal", "w", "(Ln0/o0;)V", "u", "l", "addedIds", "o", "(Ljava/util/Set;)V", "removedIds", "q", "a", "Ljava/util/concurrent/Executor;", "b", "Ljava/lang/Object;", "observerLock", "c", "Ln0/n0;", "d", "Ln0/d1;", "Ln0/a3;", "e", "Ln0/a3;", "sourcePresenceObservable", "Ln0/y0$c;", "f", "Ln0/y0$c;", "sourceObserver", "g", "Ljava/util/List;", "currentFilteredIds", "Ljava/util/concurrent/atomic/AtomicBoolean;", "h", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isMonitoring", "Ljava/util/concurrent/CopyOnWriteArrayList;", "i", "Ljava/util/concurrent/CopyOnWriteArrayList;", "dependentInternalListeners", "Ln0/y0$b;", "j", "publicApiListeners", "", "Landroidx/lifecycle/e0;", "Lg0/w;", "Ljava/util/Map;", "cameraStateObservers", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Executor backgroundExecutor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Object observerLock;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public n0 cameraFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public d1 cameraRepository;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public a3<List<g0.s>> sourcePresenceObservable;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final c sourceObserver;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public volatile List<g0.s> currentFilteredIds;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AtomicBoolean isMonitoring;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CopyOnWriteArrayList<l2> dependentInternalListeners;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CopyOnWriteArrayList<ListenerWrapper> publicApiListeners;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<String, androidx.p000lifecycle.e0<g0.w>> cameraStateObservers;

    /* JADX INFO: renamed from: n0.y0$b, reason: from toString */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Ln0/y0$b;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/concurrent/Executor;", "a", "Ljava/util/concurrent/Executor;", "()Ljava/util/concurrent/Executor;", "executor", "Lg0/u;", "listener", "Lg0/u;", "b", "()Lg0/u;", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ListenerWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final Executor executor;

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Executor getExecutor() {
            return this.executor;
        }

        @NotNull
        public final g0.u b() {
            return null;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (other instanceof ListenerWrapper) {
                return Intrinsics.c(null, null) && Intrinsics.c(this.executor, ((ListenerWrapper) other).executor);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ln0/y0$c;", "Ln0/a3$a;", "", "Lg0/s;", "<init>", "(Ln0/y0;)V", "rawCameraIdentifiers", "", "b", "(Ljava/util/List;)V", "", "t", "onError", "(Ljava/lang/Throwable;)V", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class c implements a3.a<List<? extends g0.s>> {
        public c() {
        }

        @Override // n0.a3.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@Nullable List<g0.s> rawCameraIdentifiers) {
            n0 n0Var;
            List<String> listK;
            if (y0.this.isMonitoring.get() && (n0Var = y0.this.cameraFactory) != null) {
                if (rawCameraIdentifiers != null) {
                    List<g0.s> list = rawCameraIdentifiers;
                    listK = new ArrayList<>(kotlin.collections.q.u(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        listK.add(((g0.s) it.next()).c());
                    }
                } else {
                    listK = kotlin.collections.p.k();
                }
                try {
                    n0Var.e(listK);
                    Set<String> setD = n0Var.d();
                    Intrinsics.checkNotNullExpressionValue(setD, "getAvailableCameraIds(...)");
                    Set<String> set = setD;
                    ArrayList arrayList = new ArrayList(kotlin.collections.q.u(set, 10));
                    for (String str : set) {
                        g0.s.Companion companion = g0.s.INSTANCE;
                        Intrinsics.checkNotNull(str);
                        arrayList.add(g0.s.Companion.d(companion, str, null, null, 6, null));
                    }
                    y0.this.t(arrayList);
                } catch (Exception e10) {
                    g0.r1.d("CameraPresencePrvdr", "CameraFactory failed to update. Triggering refresh.", e10);
                    a3 a3Var = y0.this.sourcePresenceObservable;
                    if (a3Var != null) {
                        a3Var.b();
                    }
                }
            }
        }

        @Override // n0.a3.a
        public void onError(@NotNull Throwable t8) {
            Intrinsics.checkNotNullParameter(t8, "t");
            if (y0.this.isMonitoring.get()) {
                g0.r1.d("CameraPresencePrvdr", "Error from source camera presence observable. Triggering refresh.", t8);
                a3 a3Var = y0.this.sourcePresenceObservable;
                if (a3Var != null) {
                    a3Var.b();
                }
            }
        }
    }

    public y0(@NotNull Executor backgroundExecutor) {
        Intrinsics.checkNotNullParameter(backgroundExecutor, "backgroundExecutor");
        this.backgroundExecutor = backgroundExecutor;
        this.observerLock = new Object();
        this.sourceObserver = new c();
        this.currentFilteredIds = kotlin.collections.p.k();
        this.isMonitoring = new AtomicBoolean(false);
        this.dependentInternalListeners = new CopyOnWriteArrayList<>();
        this.publicApiListeners = new CopyOnWriteArrayList<>();
        this.cameraStateObservers = new LinkedHashMap();
    }

    public static final void m(List list, androidx.p000lifecycle.e0 e0Var, String str) {
        Object next;
        androidx.p000lifecycle.a0<g0.w> a0VarB;
        try {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.c(((o0) next).e(), str));
            o0 o0Var = (o0) next;
            if (o0Var == null || (a0VarB = o0Var.b()) == null) {
                return;
            }
            a0VarB.n(e0Var);
        } catch (IllegalArgumentException unused) {
        }
    }

    public static final void p(ListenerWrapper listenerWrapper, Set set) {
        listenerWrapper.b();
        throw null;
    }

    public static final void r(ListenerWrapper listenerWrapper, Set set) {
        listenerWrapper.b();
        throw null;
    }

    public static final void v(p0 p0Var, androidx.p000lifecycle.e0 e0Var) {
        p0Var.k().b().n(e0Var);
    }

    public static final void x(y0 y0Var, String str, g0.w wVar) {
        if (!y0Var.isMonitoring.get()) {
            g0.r1.a("CameraPresencePrvdr", "Ignore camera state change handling since already stop monitoring");
            return;
        }
        if ((wVar != null ? wVar.c() : null) == null) {
            if ((wVar != null ? wVar.d() : null) != g0.w.b.CLOSED) {
                return;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Camera ");
        sb2.append(str);
        sb2.append(" state changed to ");
        sb2.append(wVar.d());
        sb2.append(" with error: ");
        g0.w.a aVarC = wVar.c();
        sb2.append(aVarC != null ? Integer.valueOf(aVarC.d()) : null);
        sb2.append(". Triggering refresh.");
        g0.r1.l("CameraPresencePrvdr", sb2.toString());
        a3<List<g0.s>> a3Var = y0Var.sourcePresenceObservable;
        if (a3Var != null) {
            a3Var.b();
        }
    }

    public static final void y(o0 o0Var, androidx.p000lifecycle.e0 e0Var) {
        o0Var.b().j(e0Var);
    }

    public final void A(@NotNull n0 cameraFactory, @NotNull d1 cameraRepository) {
        Intrinsics.checkNotNullParameter(cameraFactory, "cameraFactory");
        Intrinsics.checkNotNullParameter(cameraRepository, "cameraRepository");
        if (this.isMonitoring.compareAndSet(false, true)) {
            g0.r1.e("CameraPresencePrvdr", "Starting CameraPresenceProvider monitoring.");
            Set<String> setD = cameraFactory.d();
            Intrinsics.checkNotNullExpressionValue(setD, "getAvailableCameraIds(...)");
            Set<String> set = setD;
            ArrayList arrayList = new ArrayList(kotlin.collections.q.u(set, 10));
            for (String str : set) {
                g0.s.Companion companion = g0.s.INSTANCE;
                Intrinsics.checkNotNull(str);
                arrayList.add(g0.s.Companion.d(companion, str, null, null, 6, null));
            }
            this.currentFilteredIds = arrayList;
            this.cameraFactory = cameraFactory;
            this.cameraRepository = cameraRepository;
            a3<List<g0.s>> a3VarC = cameraFactory.c();
            this.sourcePresenceObservable = a3VarC;
            if (a3VarC != null) {
                a3VarC.c(this.backgroundExecutor, this.sourceObserver);
            }
        }
    }

    public final void k(@NotNull l2 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.dependentInternalListeners.add(listener);
    }

    public final void l() {
        synchronized (this.observerLock) {
            if (this.cameraStateObservers.isEmpty()) {
                return;
            }
            Map mapV = kotlin.collections.k0.v(this.cameraStateObservers);
            this.cameraStateObservers.clear();
            Unit unit = Unit.f22483a;
            d1 d1Var = this.cameraRepository;
            if (d1Var != null) {
                LinkedHashSet<p0> linkedHashSetM = d1Var.m();
                Intrinsics.checkNotNullExpressionValue(linkedHashSetM, "getCameras(...)");
                final ArrayList arrayList = new ArrayList(kotlin.collections.q.u(linkedHashSetM, 10));
                Iterator<T> it = linkedHashSetM.iterator();
                while (it.hasNext()) {
                    arrayList.add(((p0) it.next()).k());
                }
                g0.r1.a("CameraPresencePrvdr", "Clearing all " + mapV.size() + " state observers.");
                ArrayList arrayList2 = new ArrayList(mapV.size());
                for (Map.Entry entry : mapV.entrySet()) {
                    final String str = (String) entry.getKey();
                    final androidx.p000lifecycle.e0 e0Var = (androidx.p000lifecycle.e0) entry.getValue();
                    q0.c.e().execute(new Runnable() { // from class: n0.x0
                        @Override // java.lang.Runnable
                        public final void run() {
                            y0.m(arrayList, e0Var, str);
                        }
                    });
                    arrayList2.add(Unit.f22483a);
                }
            }
        }
    }

    public final void n(String systemCameraId) {
        d1 d1Var = this.cameraRepository;
        if (d1Var == null) {
            return;
        }
        try {
            p0 p0VarL = d1Var.l(systemCameraId);
            Intrinsics.checkNotNullExpressionValue(p0VarL, "getCamera(...)");
            o0 o0VarK = p0VarL.k();
            Intrinsics.checkNotNullExpressionValue(o0VarK, "getCameraInfoInternal(...)");
            w(o0VarK);
        } catch (IllegalArgumentException unused) {
            g0.r1.l("CameraPresencePrvdr", "CameraInternal not found for " + systemCameraId + ". Cannot setup state observer.");
        }
    }

    public final void o(final Set<g0.s> addedIds) {
        for (final ListenerWrapper listenerWrapper : this.publicApiListeners) {
            listenerWrapper.getExecutor().execute(new Runnable() { // from class: n0.u0
                @Override // java.lang.Runnable
                public final void run() {
                    y0.p(listenerWrapper, addedIds);
                }
            });
        }
    }

    public final void q(final Set<g0.s> removedIds) {
        for (final ListenerWrapper listenerWrapper : this.publicApiListeners) {
            listenerWrapper.getExecutor().execute(new Runnable() { // from class: n0.s0
                @Override // java.lang.Runnable
                public final void run() {
                    y0.r(listenerWrapper, removedIds);
                }
            });
        }
    }

    public final void s(Set<g0.s> addedCameras, Set<g0.s> removedCameras) {
        if (!addedCameras.isEmpty()) {
            g0.r1.e("CameraPresencePrvdr", "Notifying " + addedCameras.size() + " cameras added.");
            o(addedCameras);
        }
        if (removedCameras.isEmpty()) {
            return;
        }
        g0.r1.e("CameraPresencePrvdr", "Notifying " + removedCameras.size() + " cameras removed.");
        q(removedCameras);
    }

    public final void t(List<g0.s> newFilteredIdentifiers) {
        List listM0 = CollectionsKt.M0(this.currentFilteredIds);
        if (Intrinsics.c(newFilteredIdentifiers, listM0)) {
            return;
        }
        List list = listM0;
        Set setQ0 = CollectionsKt.Q0(list);
        List<g0.s> list2 = newFilteredIdentifiers;
        Set setQ1 = CollectionsKt.Q0(list2);
        Set<g0.s> setH = kotlin.collections.r0.h(setQ1, setQ0);
        Set<g0.s> setH2 = kotlin.collections.r0.h(setQ0, setQ1);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(kotlin.collections.q.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(((g0.s) it.next()).c());
        }
        try {
            Iterator<T> it2 = setH2.iterator();
            while (it2.hasNext()) {
                u(((g0.s) it2.next()).c());
            }
            d1 d1Var = this.cameraRepository;
            if (d1Var != null) {
                g0.r1.a("CameraPresencePrvdr", "Updating CameraRepository...");
                d1Var.f(arrayList2);
                arrayList.add(d1Var);
                g0.r1.a("CameraPresencePrvdr", "CameraRepository updated successfully.");
            }
            if (!this.dependentInternalListeners.isEmpty()) {
                g0.r1.a("CameraPresencePrvdr", "Updating " + this.dependentInternalListeners.size() + " dependent listeners...");
                for (l2 l2Var : this.dependentInternalListeners) {
                    l2Var.f(arrayList2);
                    Intrinsics.checkNotNull(l2Var);
                    arrayList.add(l2Var);
                }
            }
            this.currentFilteredIds = newFilteredIdentifiers;
            Iterator<T> it3 = setH.iterator();
            while (it3.hasNext()) {
                n(((g0.s) it3.next()).c());
            }
            s(setH, setH2);
        } catch (Exception e10) {
            g0.r1.d("CameraPresencePrvdr", "A core module failed to update. Rolling back changes.", e10);
            ArrayList arrayList3 = new ArrayList(kotlin.collections.q.u(list, 10));
            Iterator it4 = list.iterator();
            while (it4.hasNext()) {
                arrayList3.add(((g0.s) it4.next()).c());
            }
            for (l2 l2Var2 : kotlin.collections.v.O(arrayList)) {
                try {
                    l2Var2.f(arrayList3);
                } catch (Exception e11) {
                    g0.r1.d("CameraPresencePrvdr", "Failed to rollback listener: " + l2Var2, e11);
                }
            }
            Iterator<T> it5 = setH2.iterator();
            while (it5.hasNext()) {
                n(((g0.s) it5.next()).c());
            }
            Iterator<T> it6 = setH.iterator();
            while (it6.hasNext()) {
                u(((g0.s) it6.next()).c());
            }
        }
    }

    public final void u(String systemCameraId) {
        synchronized (this.observerLock) {
            final androidx.p000lifecycle.e0<g0.w> e0VarRemove = this.cameraStateObservers.remove(systemCameraId);
            d1 d1Var = this.cameraRepository;
            if (e0VarRemove != null && d1Var != null) {
                try {
                    final p0 p0VarL = d1Var.l(systemCameraId);
                    Intrinsics.checkNotNullExpressionValue(p0VarL, "getCamera(...)");
                    q0.c.e().execute(new Runnable() { // from class: n0.t0
                        @Override // java.lang.Runnable
                        public final void run() {
                            y0.v(p0VarL, e0VarRemove);
                        }
                    });
                    g0.r1.a("CameraPresencePrvdr", "Removed state observer for: " + systemCameraId);
                } catch (IllegalArgumentException unused) {
                }
            }
            Unit unit = Unit.f22483a;
        }
    }

    public final void w(final o0 cameraInfoInternal) {
        final String strE = cameraInfoInternal.e();
        Intrinsics.checkNotNullExpressionValue(strE, "getCameraId(...)");
        if (this.isMonitoring.get()) {
            synchronized (this.observerLock) {
                if (this.cameraStateObservers.containsKey(strE)) {
                    return;
                }
                final androidx.p000lifecycle.e0<g0.w> e0Var = new androidx.p000lifecycle.e0() { // from class: n0.v0
                    @Override // androidx.p000lifecycle.e0
                    public final void a(Object obj) {
                        y0.x(this.f24890a, strE, (g0.w) obj);
                    }
                };
                q0.c.e().execute(new Runnable() { // from class: n0.w0
                    @Override // java.lang.Runnable
                    public final void run() {
                        y0.y(cameraInfoInternal, e0Var);
                    }
                });
                this.cameraStateObservers.put(strE, e0Var);
                g0.r1.a("CameraPresencePrvdr", "Registered state observer for camera: " + strE);
                Unit unit = Unit.f22483a;
            }
        }
    }

    public final void z() {
        if (!this.isMonitoring.getAndSet(false)) {
            g0.r1.a("CameraPresencePrvdr", "Shutdown called when not monitoring. Ignoring.");
            return;
        }
        g0.r1.e("CameraPresencePrvdr", "Shutting down CameraPresenceProvider monitoring.");
        a3<List<g0.s>> a3Var = this.sourcePresenceObservable;
        if (a3Var != null) {
            a3Var.d(this.sourceObserver);
        }
        l();
        this.dependentInternalListeners.clear();
        this.publicApiListeners.clear();
        this.currentFilteredIds = kotlin.collections.p.k();
        this.cameraFactory = null;
        this.cameraRepository = null;
    }
}
