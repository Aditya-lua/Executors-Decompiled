package b6;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.y;
import kotlin.text.x;
import org.jetbrains.annotations.NotNull;
import x5.w;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u0000 \u00132\u00020\u0001:\u0001\u0011B!\b\u0002\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R$\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lb6/d;", "Landroid/net/ConnectivityManager$NetworkCallback;", "Lkotlin/Function1;", "Lb6/b;", "", "Landroidx/work/impl/constraints/OnConstraintState;", "onConstraintState", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/net/Network;", "network", "Landroid/net/NetworkCapabilities;", "networkCapabilities", "onCapabilitiesChanged", "(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V", "onLost", "(Landroid/net/Network;)V", "a", "Lkotlin/jvm/functions/Function1;", "b", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function1<b, Unit> onConstraintState;

    /* JADX INFO: renamed from: b6.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bj\u0002`\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lb6/d$a;", "", "<init>", "()V", "Landroid/net/ConnectivityManager;", "connManager", "Landroid/net/NetworkRequest;", "networkRequest", "Lkotlin/Function1;", "Lb6/b;", "", "Landroidx/work/impl/constraints/OnConstraintState;", "onConstraintState", "Lkotlin/Function0;", "b", "(Landroid/net/ConnectivityManager;Landroid/net/NetworkRequest;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final Unit c(y yVar, ConnectivityManager connectivityManager, d dVar) {
            if (yVar.f22568a) {
                w.e().a(m.f3981a, "NetworkRequestConstraintController unregister callback");
                connectivityManager.unregisterNetworkCallback(dVar);
            }
            return Unit.f22483a;
        }

        @NotNull
        public final Function0<Unit> b(@NotNull final ConnectivityManager connManager, @NotNull NetworkRequest networkRequest, @NotNull Function1<? super b, Unit> onConstraintState) {
            Intrinsics.checkNotNullParameter(connManager, "connManager");
            Intrinsics.checkNotNullParameter(networkRequest, "networkRequest");
            Intrinsics.checkNotNullParameter(onConstraintState, "onConstraintState");
            final d dVar = new d(onConstraintState, null);
            final y yVar = new y();
            try {
                w.e().a(m.f3981a, "NetworkRequestConstraintController register callback");
                connManager.registerNetworkCallback(networkRequest, dVar);
                yVar.f22568a = true;
            } catch (RuntimeException e10) {
                String name = e10.getClass().getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                if (!x.D(name, "TooManyRequestsException", false, 2, null)) {
                    throw e10;
                }
                w.e().b(m.f3981a, "NetworkRequestConstraintController couldn't register callback", e10);
                onConstraintState.invoke(new b.ConstraintsNotMet(7));
            }
            return new Function0() { // from class: b6.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return d.Companion.c(yVar, connManager, dVar);
                }
            };
        }

        public Companion() {
        }
    }

    public /* synthetic */ d(Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(@NotNull Network network, @NotNull NetworkCapabilities networkCapabilities) {
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(networkCapabilities, "networkCapabilities");
        w.e().a(m.f3981a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        this.onConstraintState.invoke(b.a.f3950a);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(@NotNull Network network) {
        Intrinsics.checkNotNullParameter(network, "network");
        w.e().a(m.f3981a, "NetworkRequestConstraintController onLost callback");
        this.onConstraintState.invoke(new b.ConstraintsNotMet(7));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(Function1<? super b, Unit> function1) {
        this.onConstraintState = function1;
    }
}
