package p026b6;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7758y;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C7797x;
import org.jetbrains.annotations.NotNull;
import p536x5.AbstractC12732w;

/* JADX INFO: renamed from: b6.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u0000 \u00132\u00020\u0001:\u0001\u0011B!\b\u0002\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R$\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m31665d2 = {"Lb6/d;", "Landroid/net/ConnectivityManager$NetworkCallback;", "Lkotlin/Function1;", "Lb6/b;", "", "Landroidx/work/impl/constraints/OnConstraintState;", "onConstraintState", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/net/Network;", "network", "Landroid/net/NetworkCapabilities;", "networkCapabilities", "onCapabilitiesChanged", "(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V", "onLost", "(Landroid/net/Network;)V", "a", "Lkotlin/jvm/functions/Function1;", "b", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C1239d extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Function1<AbstractC1237b, Unit> onConstraintState;

    /* JADX INFO: renamed from: b6.d$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bj\u0002`\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m31665d2 = {"Lb6/d$a;", "", "<init>", "()V", "Landroid/net/ConnectivityManager;", "connManager", "Landroid/net/NetworkRequest;", "networkRequest", "Lkotlin/Function1;", "Lb6/b;", "", "Landroidx/work/impl/constraints/OnConstraintState;", "onConstraintState", "Lkotlin/Function0;", "b", "(Landroid/net/ConnectivityManager;Landroid/net/NetworkRequest;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: b6.d.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: c */
        public static final Unit m6935c(C7758y c7758y, ConnectivityManager connectivityManager, C1239d c1239d) {
            if (c7758y.f29445a) {
                AbstractC12732w.m47441e().mo47444a(C1248m.f5204a, "NetworkRequestConstraintController unregister callback");
                connectivityManager.unregisterNetworkCallback(c1239d);
            }
            return Unit.f29331a;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final Function0<Unit> m6936b(@NotNull final ConnectivityManager connManager, @NotNull NetworkRequest networkRequest, @NotNull Function1<? super AbstractC1237b, Unit> onConstraintState) {
            Intrinsics.checkNotNullParameter(connManager, "connManager");
            Intrinsics.checkNotNullParameter(networkRequest, "networkRequest");
            Intrinsics.checkNotNullParameter(onConstraintState, "onConstraintState");
            final C1239d c1239d = new C1239d(onConstraintState, null);
            final C7758y c7758y = new C7758y();
            try {
                AbstractC12732w.m47441e().mo47444a(C1248m.f5204a, "NetworkRequestConstraintController register callback");
                connManager.registerNetworkCallback(networkRequest, c1239d);
                c7758y.f29445a = true;
            } catch (RuntimeException e10) {
                String name = e10.getClass().getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                if (!C7797x.m32293D(name, "TooManyRequestsException", false, 2, null)) {
                    throw e10;
                }
                AbstractC12732w.m47441e().mo47445b(C1248m.f5204a, "NetworkRequestConstraintController couldn't register callback", e10);
                onConstraintState.invoke(new AbstractC1237b.ConstraintsNotMet(7));
            }
            return new Function0() { // from class: b6.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C1239d.Companion.m6935c(c7758y, connManager, c1239d);
                }
            };
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 kotlin.jvm.functions.Function1) A[MD:(kotlin.jvm.functions.Function1<? super b6.b, kotlin.Unit>):void (m)] (LINE:1) call: b6.d.<init>(kotlin.jvm.functions.Function1):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1239d(Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(@NotNull Network network, @NotNull NetworkCapabilities networkCapabilities) {
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(networkCapabilities, "networkCapabilities");
        AbstractC12732w.m47441e().mo47444a(C1248m.f5204a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        this.onConstraintState.invoke(AbstractC1237b.a.f5166a);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(@NotNull Network network) {
        Intrinsics.checkNotNullParameter(network, "network");
        AbstractC12732w.m47441e().mo47444a(C1248m.f5204a, "NetworkRequestConstraintController onLost callback");
        this.onConstraintState.invoke(new AbstractC1237b.ConstraintsNotMet(7));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super b6.b, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C1239d(Function1<? super AbstractC1237b, Unit> function1) {
        this.onConstraintState = function1;
    }
}
