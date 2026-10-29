package p131fl;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.core.app.NotificationCompat;
import androidx.p616lifecycle.InterfaceC0954f;
import androidx.p616lifecycle.InterfaceC0980s;
import com.google.android.gms.tasks.Task;
import com.roblox.protocols.appagesignalsplatforminterface.generated.AppAgeSignalsPlatformError;
import com.roblox.protocols.appagesignalsplatforminterface.generated.AppAgeSignalsPlatformSuccess;
import com.roblox.protocols.appagesignalsplatforminterface.generated.AppAgeSignalsProvider;
import com.roblox.protocols.appagesignalsplatforminterface.generated.IAppAgeSignalsCore;
import com.roblox.protocols.appagesignalsplatforminterface.generated.IPlatformAppAgeSignals;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151gk.C6124q;
import p358pd.AbstractC10200e;
import p358pd.C10196a;
import p358pd.C10198c;
import p358pd.C10199d;
import p358pd.InterfaceC10197b;
import sb.InterfaceC11254f;
import sb.InterfaceC11256g;

/* JADX INFO: renamed from: fl.d */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001c\u001a\u00020\u00152\n\u0010\u001b\u001a\u00060\u0019j\u0002`\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, m31665d2 = {"Lfl/d;", "Landroidx/lifecycle/f;", "Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IPlatformAppAgeSignals;", "<init>", "()V", "Landroidx/lifecycle/s;", "owner", "", "onCreate", "(Landroidx/lifecycle/s;)V", "onDestroy", "", "getAgeSignal", "()Z", "isAgeSignalAvailable", "Lpd/e;", "result", "Ljava/util/HashMap;", "", "d", "(Lpd/e;)Ljava/util/HashMap;", "", NotificationCompat.CATEGORY_STATUS, "j", "(I)Ljava/lang/String;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "e", "(Ljava/lang/Exception;)I", "Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IAppAgeSignalsCore;", "b", "Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IAppAgeSignalsCore;", "appAgeSignalsCore", "Landroid/content/Context;", "c", "Landroid/content/Context;", "applicationContext", "universalapp_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C5660d extends IPlatformAppAgeSignals implements InterfaceC0954f {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C5660d f21719a = new C5660d();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static IAppAgeSignalsCore appAgeSignalsCore;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public static Context applicationContext;

    /* JADX INFO: renamed from: f */
    public static final Unit m25700f(IAppAgeSignalsCore iAppAgeSignalsCore, AbstractC10200e abstractC10200e) {
        C5660d c5660d = f21719a;
        Intrinsics.checkNotNull(abstractC10200e);
        iAppAgeSignalsCore.onGetAgeSignalSucceeded(new AppAgeSignalsPlatformSuccess(AppAgeSignalsProvider.GOOGLE, c5660d.m25703d(abstractC10200e)));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: h */
    public static final void m25701h(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: i */
    public static final void m25702i(IAppAgeSignalsCore iAppAgeSignalsCore, Exception exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        int iM25704e = f21719a.m25704e(exception);
        AppAgeSignalsProvider appAgeSignalsProvider = AppAgeSignalsProvider.GOOGLE;
        String message = exception.getMessage();
        if (message == null) {
            message = "Unknown error";
        }
        iAppAgeSignalsCore.onGetAgeSignalFailed(new AppAgeSignalsPlatformError(appAgeSignalsProvider, iM25704e, message));
    }

    /* JADX INFO: renamed from: d */
    public final HashMap<String, String> m25703d(AbstractC10200e result) {
        HashMap<String, String> map = new HashMap<>();
        Integer numMo39283f = result.mo39283f();
        if (numMo39283f != null) {
            map.put("userStatus", f21719a.m25705j(numMo39283f.intValue()));
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

    /* JADX INFO: renamed from: e */
    public final int m25704e(Exception exception) {
        if (exception instanceof C10196a) {
            return ((C10196a) exception).m39271c();
        }
        return -1;
    }

    @Override // com.roblox.protocols.appagesignalsplatforminterface.generated.IPlatformAppAgeSignals
    public boolean getAgeSignal() {
        Context context = applicationContext;
        final IAppAgeSignalsCore iAppAgeSignalsCore = appAgeSignalsCore;
        if (context == null || iAppAgeSignalsCore == null) {
            C6124q.m27060e("AppAgeSignalsHandler", "getAgeSignal: protocol not yet initialized");
            return false;
        }
        try {
            InterfaceC10197b interfaceC10197bM39273a = C10198c.m39273a(context);
            Intrinsics.checkNotNullExpressionValue(interfaceC10197bM39273a, "create(...)");
            C10199d c10199dM39275a = C10199d.m39274a().m39275a();
            Intrinsics.checkNotNullExpressionValue(c10199dM39275a, "build(...)");
            Task<AbstractC10200e> taskMo39272a = interfaceC10197bM39273a.mo39272a(c10199dM39275a);
            final Function1 function1 = new Function1() { // from class: fl.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C5660d.m25700f(iAppAgeSignalsCore, (AbstractC10200e) obj);
                }
            };
            taskMo39272a.mo11893g(new InterfaceC11256g() { // from class: fl.b
                @Override // sb.InterfaceC11256g
                public final void onSuccess(Object obj) {
                    C5660d.m25701h(function1, obj);
                }
            }).mo11891e(new InterfaceC11254f() { // from class: fl.c
                @Override // sb.InterfaceC11254f
                public final void onFailure(Exception exc) {
                    C5660d.m25702i(iAppAgeSignalsCore, exc);
                }
            });
            return true;
        } catch (IllegalStateException e10) {
            C6124q.m27061f("AppAgeSignalsHandler", "getAgeSignal: IllegalStateException", e10);
            return false;
        } catch (C10196a e11) {
            C6124q.m27061f("AppAgeSignalsHandler", "getAgeSignal: AgeSignalsException", e11);
            return false;
        } catch (Exception e12) {
            C6124q.m27061f("AppAgeSignalsHandler", "getAgeSignal: unexpected " + e12.getClass().getSimpleName(), e12);
            return false;
        }
    }

    @Override // com.roblox.protocols.appagesignalsplatforminterface.generated.IPlatformAppAgeSignals
    public boolean isAgeSignalAvailable() {
        return true;
    }

    /* JADX INFO: renamed from: j */
    public final String m25705j(int status) {
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

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: androidx.lifecycle.s */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.p616lifecycle.InterfaceC0954f
    public void onCreate(@NotNull InterfaceC0980s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        ContextWrapper contextWrapper = owner instanceof ContextWrapper ? (ContextWrapper) owner : null;
        applicationContext = contextWrapper != null ? contextWrapper.getApplicationContext() : null;
        appAgeSignalsCore = IAppAgeSignalsCore.setPlatformImpl(this);
    }

    @Override // androidx.p616lifecycle.InterfaceC0954f
    public void onDestroy(@NotNull InterfaceC0980s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        appAgeSignalsCore = null;
        applicationContext = null;
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
