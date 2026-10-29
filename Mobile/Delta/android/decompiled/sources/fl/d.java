package fl;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.p000lifecycle.s;
import com.google.android.gms.tasks.Task;
import com.roblox.protocols.appagesignalsplatforminterface.generated.AppAgeSignalsPlatformError;
import com.roblox.protocols.appagesignalsplatforminterface.generated.AppAgeSignalsPlatformSuccess;
import com.roblox.protocols.appagesignalsplatforminterface.generated.AppAgeSignalsProvider;
import com.roblox.protocols.appagesignalsplatforminterface.generated.IAppAgeSignalsCore;
import com.roblox.protocols.appagesignalsplatforminterface.generated.IPlatformAppAgeSignals;
import gk.p;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001c\u001a\u00020\u00152\n\u0010\u001b\u001a\u00060\u0019j\u0002`\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lfl/d;", "Landroidx/lifecycle/f;", "Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IPlatformAppAgeSignals;", "<init>", "()V", "Landroidx/lifecycle/s;", "owner", "", "onCreate", "(Landroidx/lifecycle/s;)V", "onDestroy", "", "getAgeSignal", "()Z", "isAgeSignalAvailable", "Lod/e;", "result", "Ljava/util/HashMap;", "", "d", "(Lod/e;)Ljava/util/HashMap;", "", "status", "j", "(I)Ljava/lang/String;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "e", "(Ljava/lang/Exception;)I", "Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IAppAgeSignalsCore;", "b", "Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IAppAgeSignalsCore;", "appAgeSignalsCore", "Landroid/content/Context;", "c", "Landroid/content/Context;", "applicationContext", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d extends IPlatformAppAgeSignals implements androidx.p000lifecycle.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d f16804a = new d();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static IAppAgeSignalsCore appAgeSignalsCore;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public static Context applicationContext;

    public static final Unit f(IAppAgeSignalsCore iAppAgeSignalsCore, od.e eVar) {
        d dVar = f16804a;
        Intrinsics.checkNotNull(eVar);
        iAppAgeSignalsCore.onGetAgeSignalSucceeded(new AppAgeSignalsPlatformSuccess(AppAgeSignalsProvider.GOOGLE, dVar.d(eVar)));
        return Unit.f22483a;
    }

    public static final void h(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final void i(IAppAgeSignalsCore iAppAgeSignalsCore, Exception exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        int iE = f16804a.e(exception);
        AppAgeSignalsProvider appAgeSignalsProvider = AppAgeSignalsProvider.GOOGLE;
        String message = exception.getMessage();
        if (message == null) {
            message = "Unknown error";
        }
        iAppAgeSignalsCore.onGetAgeSignalFailed(new AppAgeSignalsPlatformError(appAgeSignalsProvider, iE, message));
    }

    public final HashMap<String, String> d(od.e result) {
        HashMap<String, String> map = new HashMap<>();
        Integer numF = result.f();
        if (numF != null) {
            map.put("userStatus", f16804a.j(numF.intValue()));
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

    public final int e(Exception exception) {
        if (exception instanceof od.a) {
            return ((od.a) exception).c();
        }
        return -1;
    }

    @Override // com.roblox.protocols.appagesignalsplatforminterface.generated.IPlatformAppAgeSignals
    public boolean getAgeSignal() {
        Context context = applicationContext;
        final IAppAgeSignalsCore iAppAgeSignalsCore = appAgeSignalsCore;
        if (context == null || iAppAgeSignalsCore == null) {
            p.e("AppAgeSignalsHandler", "getAgeSignal: protocol not yet initialized");
            return false;
        }
        try {
            od.b bVarA = od.c.a(context);
            Intrinsics.checkNotNullExpressionValue(bVarA, "create(...)");
            od.d dVarA = od.d.a().a();
            Intrinsics.checkNotNullExpressionValue(dVarA, "build(...)");
            Task<od.e> taskA = bVarA.a(dVarA);
            final Function1 function1 = new Function1() { // from class: fl.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return d.f(iAppAgeSignalsCore, (od.e) obj);
                }
            };
            taskA.g(new sb.g() { // from class: fl.b
                @Override // sb.g
                public final void onSuccess(Object obj) {
                    d.h(function1, obj);
                }
            }).e(new sb.f() { // from class: fl.c
                @Override // sb.f
                public final void onFailure(Exception exc) {
                    d.i(iAppAgeSignalsCore, exc);
                }
            });
            return true;
        } catch (IllegalStateException e10) {
            p.f("AppAgeSignalsHandler", "getAgeSignal: IllegalStateException", e10);
            return false;
        } catch (od.a e11) {
            p.f("AppAgeSignalsHandler", "getAgeSignal: AgeSignalsException", e11);
            return false;
        } catch (Exception e12) {
            p.f("AppAgeSignalsHandler", "getAgeSignal: unexpected " + e12.getClass().getSimpleName(), e12);
            return false;
        }
    }

    @Override // com.roblox.protocols.appagesignalsplatforminterface.generated.IPlatformAppAgeSignals
    public boolean isAgeSignalAvailable() {
        return true;
    }

    public final String j(int status) {
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.p000lifecycle.f
    public void onCreate(@NotNull s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        ContextWrapper contextWrapper = owner instanceof ContextWrapper ? (ContextWrapper) owner : null;
        applicationContext = contextWrapper != null ? contextWrapper.getApplicationContext() : null;
        appAgeSignalsCore = IAppAgeSignalsCore.setPlatformImpl(this);
    }

    @Override // androidx.p000lifecycle.f
    public void onDestroy(@NotNull s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        appAgeSignalsCore = null;
        applicationContext = null;
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
