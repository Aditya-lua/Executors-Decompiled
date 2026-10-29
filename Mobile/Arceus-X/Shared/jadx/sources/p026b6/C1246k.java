package p026b6;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7352s;
import p536x5.AbstractC12732w;

/* JADX INFO: renamed from: b6.k */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0013\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J;\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u00192\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0016\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\b0\u0015j\u0002`\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\bH\u0003¢\u0006\u0004\b\u001c\u0010\u0003J!\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u00132\b\u0010\u001e\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\"R0\u0010'\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\b0\u0015j\u0002`\u0017\u0012\u0004\u0012\u00020\u00130$8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010&R$\u0010-\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00103\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0018\u00106\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b4\u00105¨\u00067"}, m31665d2 = {"Lb6/k;", "Landroid/net/ConnectivityManager$NetworkCallback;", "<init>", "()V", "Landroid/net/Network;", "network", "Landroid/net/NetworkCapabilities;", "networkCapabilities", "", "onCapabilitiesChanged", "(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V", "", "blocked", "onBlockedStatusChanged", "(Landroid/net/Network;Z)V", "onLost", "(Landroid/net/Network;)V", "Landroid/net/ConnectivityManager;", "connManager", "Landroid/net/NetworkRequest;", "networkRequest", "Lkotlin/Function1;", "Lb6/b;", "Landroidx/work/impl/constraints/OnConstraintState;", "onConstraintState", "Lkotlin/Function0;", "b", "(Landroid/net/ConnectivityManager;Landroid/net/NetworkRequest;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;", "e", "request", "capabilities", "d", "(Landroid/net/NetworkRequest;Landroid/net/NetworkCapabilities;)Z", "", "Ljava/lang/Object;", "requestsLock", "", "c", "Ljava/util/Map;", "requests", "Landroid/net/NetworkCapabilities;", "getCachedCapabilities", "()Landroid/net/NetworkCapabilities;", "setCachedCapabilities", "(Landroid/net/NetworkCapabilities;)V", "cachedCapabilities", "Z", "getCapabilitiesInitialized", "()Z", "setCapabilitiesInitialized", "(Z)V", "capabilitiesInitialized", "f", "Ljava/lang/Boolean;", "isBlocked", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C1246k extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C1246k f5192a = new C1246k();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Object requestsLock = new Object();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Map<Function1<AbstractC1237b, Unit>, NetworkRequest> requests = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public static NetworkCapabilities cachedCapabilities;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public static boolean capabilitiesInitialized;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public static Boolean isBlocked;

    /* JADX INFO: renamed from: c */
    public static final Unit m6954c(Function1 function1, ConnectivityManager connectivityManager) {
        synchronized (requestsLock) {
            Map<Function1<AbstractC1237b, Unit>, NetworkRequest> map = requests;
            map.remove(function1);
            if (map.isEmpty()) {
                AbstractC12732w.m47441e().mo47444a(C1248m.f5204a, "NetworkRequestConstraintController unregister shared callback");
                connectivityManager.unregisterNetworkCallback(f5192a);
                isBlocked = null;
                cachedCapabilities = null;
                capabilitiesInitialized = false;
            }
        }
        return Unit.f29331a;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Function0<Unit> m6955b(@NotNull final ConnectivityManager connManager, @NotNull NetworkRequest networkRequest, @NotNull final Function1<? super AbstractC1237b, Unit> onConstraintState) {
        Intrinsics.checkNotNullParameter(connManager, "connManager");
        Intrinsics.checkNotNullParameter(networkRequest, "networkRequest");
        Intrinsics.checkNotNullParameter(onConstraintState, "onConstraintState");
        synchronized (requestsLock) {
            try {
                Map<Function1<AbstractC1237b, Unit>, NetworkRequest> map = requests;
                boolean zIsEmpty = map.isEmpty();
                map.put(onConstraintState, networkRequest);
                if (zIsEmpty) {
                    AbstractC12732w.m47441e().mo47444a(C1248m.f5204a, "NetworkRequestConstraintController register shared callback");
                    connManager.registerDefaultNetworkCallback(f5192a);
                } else if (capabilitiesInitialized && isBlocked != null) {
                    AbstractC12732w.m47441e().mo47444a(C1248m.f5204a, "NetworkRequestConstraintController send initial capabilities");
                    onConstraintState.invoke(f5192a.m6956d(networkRequest, cachedCapabilities) ? AbstractC1237b.a.f5166a : new AbstractC1237b.ConstraintsNotMet(7));
                }
                Unit unit = Unit.f29331a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return new Function0() { // from class: b6.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C1246k.m6954c(onConstraintState, connManager);
            }
        };
    }

    /* JADX INFO: renamed from: d */
    public final boolean m6956d(NetworkRequest request, NetworkCapabilities capabilities) {
        Boolean bool = isBlocked;
        Intrinsics.checkNotNull(bool);
        return !bool.booleanValue() && request.canBeSatisfiedBy(capabilities);
    }

    /* JADX INFO: renamed from: e */
    public final void m6957e() {
        ArrayList arrayList = new ArrayList();
        synchronized (requestsLock) {
            try {
                if (capabilitiesInitialized && isBlocked != null) {
                    Iterator<T> it = requests.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        arrayList.add(C7352s.m30477a((Function1) entry.getKey(), f5192a.m6956d((NetworkRequest) entry.getValue(), cachedCapabilities) ? AbstractC1237b.a.f5166a : new AbstractC1237b.ConstraintsNotMet(7)));
                    }
                    Unit unit = Unit.f29331a;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        Pair pair = (Pair) obj;
                        ((Function1) pair.m31671a()).invoke((AbstractC1237b) pair.m31672b());
                    }
                    return;
                }
                AbstractC12732w.m47441e().mo47444a(C1248m.f5204a, "Not dispatching constraint state yet: isBlocked=" + isBlocked + ", capabilitiesInitialized=" + capabilitiesInitialized);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onBlockedStatusChanged(@NotNull Network network, boolean blocked) {
        Intrinsics.checkNotNullParameter(network, "network");
        AbstractC12732w.m47441e().mo47444a(C1248m.f5204a, "NetworkRequestConstraintController onBlockedStatusChanged callback " + blocked);
        synchronized (requestsLock) {
            if (Intrinsics.m31980c(isBlocked, Boolean.valueOf(blocked))) {
                return;
            }
            isBlocked = Boolean.valueOf(blocked);
            Unit unit = Unit.f29331a;
            m6957e();
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(@NotNull Network network, @NotNull NetworkCapabilities networkCapabilities) {
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(networkCapabilities, "networkCapabilities");
        AbstractC12732w.m47441e().mo47444a(C1248m.f5204a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        synchronized (requestsLock) {
            cachedCapabilities = networkCapabilities;
            capabilitiesInitialized = true;
            Unit unit = Unit.f29331a;
        }
        m6957e();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(@NotNull Network network) {
        Intrinsics.checkNotNullParameter(network, "network");
        AbstractC12732w.m47441e().mo47444a(C1248m.f5204a, "NetworkRequestConstraintController onLost callback");
        synchronized (requestsLock) {
            try {
                cachedCapabilities = null;
                Iterator<T> it = requests.keySet().iterator();
                while (it.hasNext()) {
                    ((Function1) it.next()).invoke(new AbstractC1237b.ConstraintsNotMet(7));
                }
                Unit unit = Unit.f29331a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
