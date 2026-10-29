package com.appsflyer.internal;

import android.util.Log;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJG\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\rJ'\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\rJ'\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\rJ\u001f\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J1\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001dR\u0014\u0010\u001b\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/appsflyer/internal/AFh1zSDK;", "Lcom/appsflyer/sdk_base/logger/AFLoggerBase;", "Lcom/appsflyer/internal/AFc1iSDK;", "p0", "<init>", "(Lcom/appsflyer/internal/AFc1iSDK;)V", "Lcom/appsflyer/sdk_base/logger/LogTag;", "", "p1", "", "p2", "", "d", "(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Z)V", "", "p3", "p4", "p5", "p6", "e", "(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZ)V", "i", "w", "v", "force", "(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V", "Lcom/appsflyer/AFLogger$LogLevel;", "AFLogger", "(Lcom/appsflyer/AFLogger$LogLevel;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;)V", "Lcom/appsflyer/internal/AFc1iSDK;", "getShouldExtendMsg", "()Z", "AFa1zSDK"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AFh1zSDK extends AFLoggerBase {

    @NotNull
    private final AFc1iSDK d;

    public /* synthetic */ class AFa1ySDK {
        public static final /* synthetic */ int[] unregisterClient;

        static {
            int[] iArr = new int[AFLogger.LogLevel.values().length];
            try {
                iArr[AFLogger.LogLevel.DEBUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFLogger.LogLevel.INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFLogger.LogLevel.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AFLogger.LogLevel.VERBOSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AFLogger.LogLevel.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AFLogger.LogLevel.NONE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            unregisterClient = iArr;
        }
    }

    public AFh1zSDK(@NotNull AFc1iSDK aFc1iSDK) {
        Intrinsics.checkNotNullParameter(aFc1iSDK, "");
        this.d = aFc1iSDK;
    }

    private final void AFLogger(AFLogger.LogLevel p8, LogTag p10, String p11, Throwable p12) {
        if (p8.getLevel() <= AFa1tSDK.d().AFKeystoreWrapper.setAndroidIdData().enableTCFDataCollection.getLevel()) {
            String strExtendedMsg = extendedMsg(p11, p10);
            switch (AFa1ySDK.unregisterClient[p8.ordinal()]) {
                case 1:
                    Log.d("AppsFlyer_7.0.1", strExtendedMsg);
                    return;
                case 2:
                    Log.i("AppsFlyer_7.0.1", strExtendedMsg);
                    return;
                case 3:
                    Log.w("AppsFlyer_7.0.1", strExtendedMsg);
                    return;
                case 4:
                    Log.v("AppsFlyer_7.0.1", strExtendedMsg);
                    return;
                case 5:
                    Log.e("AppsFlyer_7.0.1", strExtendedMsg, p12);
                    return;
                case 6:
                    return;
                default:
                    throw new jt.l();
            }
        }
    }

    @Override // com.appsflyer.sdk_base.logger.AFLoggerBase
    public final void d(@NotNull LogTag p8, @NotNull String p10, boolean p11) {
        Intrinsics.checkNotNullParameter(p8, "");
        Intrinsics.checkNotNullParameter(p10, "");
        AFLogger(AFLogger.LogLevel.DEBUG, p8, p10, null);
    }

    @Override // com.appsflyer.sdk_base.logger.AFLoggerBase
    public final void e(@NotNull LogTag p8, @NotNull String p10, @NotNull Throwable p11, boolean p12, boolean p13, boolean p14, boolean p15) {
        Intrinsics.checkNotNullParameter(p8, "");
        Intrinsics.checkNotNullParameter(p10, "");
        Intrinsics.checkNotNullParameter(p11, "");
        if (p13) {
            AFLogger(AFLogger.LogLevel.ERROR, p8, p10, p11);
        } else if (p12) {
            AFLogger(AFLogger.LogLevel.DEBUG, p8, p10, null);
        }
    }

    @Override // com.appsflyer.sdk_base.logger.AFLoggerBase
    public final void force(@NotNull LogTag p8, @NotNull String p10) {
        Intrinsics.checkNotNullParameter(p8, "");
        Intrinsics.checkNotNullParameter(p10, "");
        String strAFLogger = this.d.AFLogger("AF_DISABLE_LOGS_COMPLETELY");
        if (strAFLogger != null ? Boolean.parseBoolean(strAFLogger) : false) {
            return;
        }
        Log.d("AppsFlyer_7.0.1", withTag(p10, p8));
    }

    @Override // com.appsflyer.sdk_base.logger.AFLoggerBase
    public final boolean getShouldExtendMsg() {
        return AFLogger.LogLevel.VERBOSE.getLevel() <= AFa1tSDK.d().AFKeystoreWrapper.setAndroidIdData().enableTCFDataCollection.getLevel();
    }

    @Override // com.appsflyer.sdk_base.logger.AFLoggerBase
    public final void i(@NotNull LogTag p8, @NotNull String p10, boolean p11) {
        Intrinsics.checkNotNullParameter(p8, "");
        Intrinsics.checkNotNullParameter(p10, "");
        AFLogger(AFLogger.LogLevel.INFO, p8, p10, null);
    }

    @Override // com.appsflyer.sdk_base.logger.AFLoggerBase
    public final void v(@NotNull LogTag p8, @NotNull String p10, boolean p11) {
        Intrinsics.checkNotNullParameter(p8, "");
        Intrinsics.checkNotNullParameter(p10, "");
        AFLogger(AFLogger.LogLevel.VERBOSE, p8, p10, null);
    }

    @Override // com.appsflyer.sdk_base.logger.AFLoggerBase
    public final void w(@NotNull LogTag p8, @NotNull String p10, boolean p11) {
        Intrinsics.checkNotNullParameter(p8, "");
        Intrinsics.checkNotNullParameter(p10, "");
        AFLogger(AFLogger.LogLevel.WARNING, p8, p10, null);
    }
}
