package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p394qt.C10708b;
import p394qt.InterfaceC10707a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v6 com.appsflyer.internal.AFa1mSDK[], still in use, count: 1, list:
  (r0v6 com.appsflyer.internal.AFa1mSDK[]) from 0x0076: INVOKE (r0v6 com.appsflyer.internal.AFa1mSDK[]) STATIC call: qt.b.a(java.lang.Enum[]):qt.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):qt.a<E extends java.lang.Enum<E>> (m), WRAPPED]
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B%\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rj\u0002\b\u000fj\u0002\b\u000ej\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013"}, m31665d2 = {"Lcom/appsflyer/internal/AFa1mSDK;", "", "", "p0", "Lkotlin/Function1;", "", "", "p1", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lkotlin/jvm/functions/Function1;)V", "registerClient", "Ljava/lang/String;", "AFLogger", "Lkotlin/jvm/functions/Function1;", "unregisterClient", "d", "AFKeystoreWrapper", "w", "e", "v"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class AFa1mSDK {
    DebugLog("debug_mode", new Function1() { // from class: com.appsflyer.internal.a
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return AFa1mSDK.registerClient(obj);
        }
    }),
    DisableAdvertisingIdentifiers("disable_advertising_identifiers", new Function1() { // from class: com.appsflyer.internal.b
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return AFa1mSDK.m8708d(obj);
        }
    }),
    MinTimeBetweenSessions("min_time_between_sessions", new Function1() { // from class: com.appsflyer.internal.c
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return AFa1mSDK.AFKeystoreWrapper(obj);
        }
    }),
    CurrencyCode("currency_code", new Function1() { // from class: com.appsflyer.internal.d
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return AFa1mSDK.AFLogger(obj);
        }
    }),
    Host("host", new Function1() { // from class: com.appsflyer.internal.e
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return AFa1mSDK.unregisterClient(obj);
        }
    }),
    DdlTimeout("ddlTimeout", new Function1() { // from class: com.appsflyer.internal.f
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return AFa1mSDK.m8711i(obj);
        }
    });


    /* JADX INFO: renamed from: i */
    private static final /* synthetic */ InterfaceC10707a f6847i;

    /* JADX INFO: renamed from: AFLogger, reason: from kotlin metadata */
    @NotNull
    public Function1<Object, Unit> unregisterClient;

    @NotNull
    final String registerClient;

    static {
        f6847i = C10708b.m40805a(new AFa1mSDK[]{DebugLog, DisableAdvertisingIdentifiers, MinTimeBetweenSessions, CurrencyCode, Host, r10});
    }

    private AFa1mSDK(String str, Function1 function1) {
        super(str, i);
        this.registerClient = str;
        this.unregisterClient = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AFKeystoreWrapper(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        AFa1tSDK.m8724d().setMinTimeBetweenSessions(((Integer) obj).intValue());
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AFLogger(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        AFa1tSDK.m8724d().setCurrencyCode(obj.toString());
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final Unit m8708d(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        AFa1tSDK.m8724d().setDisableAdvertisingIdentifiers(((Boolean) obj).booleanValue());
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final Unit m8711i(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        AppsFlyerLib.getInstance().setDeepLinkTimeout(((Integer) obj).intValue());
        return Unit.f29331a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @NotNull
    public static InterfaceC10707a<AFa1mSDK> registerClient() {
        return f6847i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit unregisterClient(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        HashMap map = (HashMap) obj;
        Object obj2 = map.get("host");
        Object obj3 = map.get("prefix");
        if (obj2 == null) {
            AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.INIT_BY_CONFIG, "Unsupported/Missing values - host value is mandatory for setHost method", false, 4, null);
        } else if (obj3 == null) {
            AFa1tSDK.m8724d().setHost(null, obj2.toString());
        } else {
            AFa1tSDK.m8724d().setHost(obj3.toString(), obj2.toString());
        }
        return Unit.f29331a;
    }

    public static AFa1mSDK valueOf(String str) {
        return (AFa1mSDK) Enum.valueOf(AFa1mSDK.class, str);
    }

    public static AFa1mSDK[] values() {
        return (AFa1mSDK[]) force.clone();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit registerClient(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        AFa1tSDK.m8724d().setDebugLog(((Boolean) obj).booleanValue());
        return Unit.f29331a;
    }
}
