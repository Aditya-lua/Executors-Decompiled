package p131fl;

import androidx.core.app.NotificationCompat;
import androidx.p616lifecycle.InterfaceC0954f;
import androidx.p616lifecycle.InterfaceC0980s;
import com.google.android.gms.tasks.Task;
import com.roblox.protocols.appagesignalsplatforminterface.generated.AppAgeSignalsPlatformSuccess;
import com.roblox.protocols.appagesignalsplatforminterface.generated.AppAgeSignalsProvider;
import com.roblox.protocols.appagesignalsplatforminterface.generated.IAppAgeSignalsCore;
import com.roblox.protocols.appagesignalsplatforminterface.generated.IPlatformAppAgeSignals;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151gk.C6124q;
import p358pd.AbstractC10200e;
import p358pd.C10199d;
import p409rd.C10815a;
import sb.InterfaceC11256g;
import th.C11659h;

/* JADX INFO: renamed from: fl.g */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m31665d2 = {"Lfl/g;", "Landroidx/lifecycle/f;", "Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IPlatformAppAgeSignals;", "<init>", "()V", "Lpd/e;", "result", "Ljava/util/HashMap;", "", "c", "(Lpd/e;)Ljava/util/HashMap;", "", NotificationCompat.CATEGORY_STATUS, "h", "(I)Ljava/lang/String;", "Landroidx/lifecycle/s;", "owner", "", "onCreate", "(Landroidx/lifecycle/s;)V", "onDestroy", "", "getAgeSignal", "()Z", "isAgeSignalAvailable", "f", "(Ljava/lang/String;)I", "Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IAppAgeSignalsCore;", "b", "Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IAppAgeSignalsCore;", "appAgeSignalsCore", "universalapp_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C5663g extends IPlatformAppAgeSignals implements InterfaceC0954f {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C5663g f21724a = new C5663g();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static IAppAgeSignalsCore appAgeSignalsCore;

    /* JADX INFO: renamed from: c */
    private final HashMap<String, String> m25708c(AbstractC10200e result) {
        HashMap<String, String> map = new HashMap<>();
        Integer numMo39283f = result.mo39283f();
        if (numMo39283f != null) {
            map.put("userStatus", f21724a.m25711h(numMo39283f.intValue()));
        }
        Integer numMo39279a = result.mo39279a();
        if (numMo39279a != null) {
            map.put("ageLower", String.valueOf(numMo39279a.intValue()));
        }
        Integer numMo39280b = result.mo39280b();
        if (numMo39280b != null) {
            map.put("ageUpper", String.valueOf(numMo39280b.intValue()));
        }
        String strMo39281d = result.mo39281d();
        if (strMo39281d != null) {
            map.put("installId", strMo39281d);
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final Unit m25709d(IAppAgeSignalsCore iAppAgeSignalsCore, AbstractC10200e abstractC10200e) {
        C5663g c5663g = f21724a;
        Intrinsics.checkNotNull(abstractC10200e);
        iAppAgeSignalsCore.onGetAgeSignalSucceeded(new AppAgeSignalsPlatformSuccess(AppAgeSignalsProvider.GOOGLE, c5663g.m25708c(abstractC10200e)));
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final void m25710e(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: h */
    private final String m25711h(int status) {
        if (status == 0) {
            return "VERIFIED";
        }
        if (status == 1) {
            return "SUPERVISED";
        }
        if (status == 2) {
            return "SUPERVISED_APPROVAL_PENDING";
        }
        if (status == 3) {
            return "SUPERVISED_APPROVAL_DENIED";
        }
        if (status == 4) {
            return "UNKNOWN";
        }
        return "UNRECOGNIZED_" + status;
    }

    /* JADX INFO: renamed from: f */
    public final int m25712f(String status) {
        String upperCase = status.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        switch (upperCase.hashCode()) {
            case -1212137948:
                return !upperCase.equals("SUPERVISED") ? 4 : 1;
            case -1211756856:
                return upperCase.equals("VERIFIED") ? 0 : 4;
            case -54865866:
                return !upperCase.equals("SUPERVISED_APPROVAL_PENDING") ? 4 : 2;
            case 1732894972:
                return !upperCase.equals("SUPERVISED_APPROVAL_DENIED") ? 4 : 3;
            default:
                return 4;
        }
    }

    @Override // com.roblox.protocols.appagesignalsplatforminterface.generated.IPlatformAppAgeSignals
    public boolean getAgeSignal() {
        final IAppAgeSignalsCore iAppAgeSignalsCore = appAgeSignalsCore;
        if (iAppAgeSignalsCore == null) {
            C6124q.m27060e("FakeAppAgeSignalsHandler", "getAgeSignal: protocol not yet initialized");
            return false;
        }
        String strMo43570Y = C11659h.m43403a().mo43570Y();
        int iMo43531S2 = C11659h.m43403a().mo43531S2();
        int iMo43611d2 = C11659h.m43403a().mo43611d2();
        Intrinsics.checkNotNull(strMo43570Y);
        AbstractC10200e abstractC10200eMo39284a = AbstractC10200e.m39276c().mo39289f(Integer.valueOf(m25712f(strMo43570Y))).mo39285b(Integer.valueOf(iMo43531S2)).mo39286c(Integer.valueOf(iMo43611d2)).mo39287d(UUID.randomUUID().toString()).mo39284a();
        Intrinsics.checkNotNullExpressionValue(abstractC10200eMo39284a, "build(...)");
        C10815a c10815a = new C10815a();
        c10815a.m41183b(abstractC10200eMo39284a);
        Task<AbstractC10200e> taskMo39272a = c10815a.mo39272a(C10199d.m39274a().m39275a());
        final Function1 function1 = new Function1() { // from class: fl.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C5663g.m25709d(iAppAgeSignalsCore, (AbstractC10200e) obj);
            }
        };
        taskMo39272a.mo11893g(new InterfaceC11256g() { // from class: fl.f
            @Override // sb.InterfaceC11256g
            public final void onSuccess(Object obj) {
                C5663g.m25710e(function1, obj);
            }
        });
        return true;
    }

    @Override // com.roblox.protocols.appagesignalsplatforminterface.generated.IPlatformAppAgeSignals
    public boolean isAgeSignalAvailable() {
        return true;
    }

    @Override // androidx.p616lifecycle.InterfaceC0954f
    public void onCreate(@NotNull InterfaceC0980s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        appAgeSignalsCore = IAppAgeSignalsCore.setPlatformImpl(this);
    }

    @Override // androidx.p616lifecycle.InterfaceC0954f
    public void onDestroy(@NotNull InterfaceC0980s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        appAgeSignalsCore = null;
    }

    @Override // androidx.p616lifecycle.InterfaceC0954f
    public /* bridge */ void onPause(@NotNull InterfaceC0980s interfaceC0980s) {
        super.onPause(interfaceC0980s);
    }

    @Override // androidx.p616lifecycle.InterfaceC0954f
    public /* bridge */ void onResume(@NotNull InterfaceC0980s interfaceC0980s) {
        super.onResume(interfaceC0980s);
    }

    @Override // androidx.p616lifecycle.InterfaceC0954f
    public /* bridge */ void onStart(@NotNull InterfaceC0980s interfaceC0980s) {
        super.onStart(interfaceC0980s);
    }

    @Override // androidx.p616lifecycle.InterfaceC0954f
    public /* bridge */ void onStop(@NotNull InterfaceC0980s interfaceC0980s) {
        super.onStop(interfaceC0980s);
    }
}
