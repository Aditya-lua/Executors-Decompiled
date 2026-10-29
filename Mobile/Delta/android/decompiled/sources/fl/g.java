package fl;

import androidx.p000lifecycle.s;
import com.google.android.gms.tasks.Task;
import com.roblox.protocols.appagesignalsplatforminterface.generated.AppAgeSignalsPlatformSuccess;
import com.roblox.protocols.appagesignalsplatforminterface.generated.AppAgeSignalsProvider;
import com.roblox.protocols.appagesignalsplatforminterface.generated.IAppAgeSignalsCore;
import com.roblox.protocols.appagesignalsplatforminterface.generated.IPlatformAppAgeSignals;
import gk.p;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lfl/g;", "Landroidx/lifecycle/f;", "Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IPlatformAppAgeSignals;", "<init>", "()V", "Lod/e;", "result", "Ljava/util/HashMap;", "", "c", "(Lod/e;)Ljava/util/HashMap;", "", "status", "h", "(I)Ljava/lang/String;", "Landroidx/lifecycle/s;", "owner", "", "onCreate", "(Landroidx/lifecycle/s;)V", "onDestroy", "", "getAgeSignal", "()Z", "isAgeSignalAvailable", "f", "(Ljava/lang/String;)I", "Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IAppAgeSignalsCore;", "b", "Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IAppAgeSignalsCore;", "appAgeSignalsCore", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g extends IPlatformAppAgeSignals implements androidx.p000lifecycle.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final g f16808a = new g();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static IAppAgeSignalsCore appAgeSignalsCore;

    private final HashMap<String, String> c(od.e result) {
        HashMap<String, String> map = new HashMap<>();
        Integer numF = result.f();
        if (numF != null) {
            map.put("userStatus", f16808a.h(numF.intValue()));
        }
        Integer numA = result.a();
        if (numA != null) {
            map.put("ageLower", String.valueOf(numA.intValue()));
        }
        Integer numB = result.b();
        if (numB != null) {
            map.put("ageUpper", String.valueOf(numB.intValue()));
        }
        String strD = result.d();
        if (strD != null) {
            map.put("installId", strD);
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(IAppAgeSignalsCore iAppAgeSignalsCore, od.e eVar) {
        g gVar = f16808a;
        Intrinsics.checkNotNull(eVar);
        iAppAgeSignalsCore.onGetAgeSignalSucceeded(new AppAgeSignalsPlatformSuccess(AppAgeSignalsProvider.GOOGLE, gVar.c(eVar)));
        return Unit.f22483a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    private final String h(int status) {
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

    public final int f(String status) {
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
            p.e("FakeAppAgeSignalsHandler", "getAgeSignal: protocol not yet initialized");
            return false;
        }
        String strU = h.a().U();
        int iM2 = h.a().M2();
        int iX1 = h.a().X1();
        Intrinsics.checkNotNull(strU);
        od.e eVarA = od.e.c().f(Integer.valueOf(f(strU))).b(Integer.valueOf(iM2)).c(Integer.valueOf(iX1)).d(UUID.randomUUID().toString()).a();
        Intrinsics.checkNotNullExpressionValue(eVarA, "build(...)");
        qd.a aVar = new qd.a();
        aVar.b(eVarA);
        Task<od.e> taskA = aVar.a(od.d.a().a());
        final Function1 function1 = new Function1() { // from class: fl.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g.d(iAppAgeSignalsCore, (od.e) obj);
            }
        };
        taskA.g(new sb.g() { // from class: fl.f
            @Override // sb.g
            public final void onSuccess(Object obj) {
                g.e(function1, obj);
            }
        });
        return true;
    }

    @Override // com.roblox.protocols.appagesignalsplatforminterface.generated.IPlatformAppAgeSignals
    public boolean isAgeSignalAvailable() {
        return true;
    }

    @Override // androidx.p000lifecycle.f
    public void onCreate(@NotNull s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        appAgeSignalsCore = IAppAgeSignalsCore.setPlatformImpl(this);
    }

    @Override // androidx.p000lifecycle.f
    public void onDestroy(@NotNull s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        appAgeSignalsCore = null;
    }

    @Override // androidx.p000lifecycle.f
    public /* bridge */ void onPause(@NotNull s sVar) {
        super.onPause(sVar);
    }

    @Override // androidx.p000lifecycle.f
    public /* bridge */ void onResume(@NotNull s sVar) {
        super.onResume(sVar);
    }

    @Override // androidx.p000lifecycle.f
    public /* bridge */ void onStart(@NotNull s sVar) {
        super.onStart(sVar);
    }

    @Override // androidx.p000lifecycle.f
    public /* bridge */ void onStop(@NotNull s sVar) {
        super.onStop(sVar);
    }
}
