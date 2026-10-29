package com.appsflyer;

import androidx.core.app.NotificationCompat;
import com.appsflyer.internal.AFc1jSDK;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7693m;
import kotlin.collections.C7708u;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7342i;
import p229jt.InterfaceC7341h;
import p394qt.C10708b;
import p394qt.InterfaceC10707a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001.B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\bJ#\u0010\u0010\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0010\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0010\u0010\u0014J!\u0010\u0017\u001a\u00020\u00062\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0015\"\u00020\u0001¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0019\u001a\u00020\u00062\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0015\"\u00020\u0001¢\u0006\u0004\b\u0019\u0010\u0018J'\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJG\u0010#\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0012H\u0016¢\u0006\u0004\b#\u0010$J'\u0010%\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0012H\u0016¢\u0006\u0004\b%\u0010\u001fJ'\u0010&\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0012H\u0016¢\u0006\u0004\b&\u0010\u001fJ'\u0010'\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0012H\u0016¢\u0006\u0004\b'\u0010\u001fJ\u001f\u0010(\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0004H\u0016¢\u0006\u0004\b(\u0010)R\u001b\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010*8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b+\u0010,R\u0015\u0010\u001e\u001a\u00020-8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0017\u0010,"}, m31665d2 = {"Lcom/appsflyer/AFLogger;", "Lcom/appsflyer/sdk_base/logger/AFLoggerBase;", "<init>", "()V", "", "logMessage", "", "afInfoLog", "(Ljava/lang/String;)V", "debugLogMessage", "afDebugLog", "warningLogMessage", "afWarnLog", "errorLogMessage", "", "ex", "afErrorLog", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "", "printThrowable", "(Ljava/lang/String;Ljava/lang/Throwable;Z)V", "", "client", "registerClient", "([Lcom/appsflyer/sdk_base/logger/AFLoggerBase;)V", "unregisterClient", "Lcom/appsflyer/sdk_base/logger/LogTag;", "tag", NotificationCompat.CATEGORY_MESSAGE, "shouldRemoteDebug", "d", "(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Z)V", "throwable", "printMsg", "shouldReportToExManager", "e", "(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZ)V", "i", "w", "v", "force", "(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V", "", "AFLogger", "Ljt/h;", "Ljava/util/concurrent/ExecutorService;", "LogLevel"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class AFLogger extends AFLoggerBase {

    @NotNull
    public static final AFLogger INSTANCE = new AFLogger();

    /* JADX INFO: renamed from: AFLogger, reason: from kotlin metadata */
    @NotNull
    private static final InterfaceC7341h registerClient = C7342i.m30456b(new Function0() { // from class: com.appsflyer.k
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AFLogger.m8686d();
        }
    });

    /* JADX INFO: renamed from: registerClient, reason: from kotlin metadata */
    @NotNull
    private static final InterfaceC7341h d = C7342i.m30456b(new Function0() { // from class: com.appsflyer.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AFLogger.AFKeystoreWrapper();
        }
    });

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.appsflyer.AFLogger$LogLevel[], still in use, count: 1, list:
      (r0v1 com.appsflyer.AFLogger$LogLevel[]) from 0x0042: INVOKE (r0v1 com.appsflyer.AFLogger$LogLevel[]) STATIC call: qt.b.a(java.lang.Enum[]):qt.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):qt.a<E extends java.lang.Enum<E>> (m), WRAPPED]
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
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, m31665d2 = {"Lcom/appsflyer/AFLogger$LogLevel;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", "level", "I", "getLevel", "()I", "NONE", "ERROR", "WARNING", "INFO", "DEBUG", "VERBOSE"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class LogLevel {
        NONE(0),
        ERROR(1),
        WARNING(2),
        INFO(3),
        DEBUG(4),
        VERBOSE(5);

        private static final /* synthetic */ InterfaceC10707a registerClient;
        private final int level;

        static {
            registerClient = C10708b.m40805a(logLevelArr);
        }

        private LogLevel(int i10) {
            super(str, i);
            this.level = i10;
        }

        @NotNull
        public static InterfaceC10707a<LogLevel> getEntries() {
            return registerClient;
        }

        public static LogLevel valueOf(String str) {
            return (LogLevel) Enum.valueOf(LogLevel.class, str);
        }

        public static LogLevel[] values() {
            return (LogLevel[]) AFKeystoreWrapper.clone();
        }

        public final int getLevel() {
            return this.level;
        }
    }

    private AFLogger() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final ExecutorService AFKeystoreWrapper() {
        return AFc1jSDK.m8771d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AFLogger(LogTag logTag, String str, boolean z10, AFLoggerBase aFLoggerBase) {
        Intrinsics.checkNotNullParameter(aFLoggerBase, "");
        aFLoggerBase.mo8700w(logTag, str, z10);
        return Unit.f29331a;
    }

    public static final void afDebugLog(@NotNull String debugLogMessage) {
        Intrinsics.checkNotNullParameter(debugLogMessage, "");
        INSTANCE.mo8696d(LogTag.OTHER, debugLogMessage, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void afErrorLog(@Nullable String errorLogMessage, @Nullable Throwable ex) {
        AFLogger aFLogger = INSTANCE;
        LogTag logTag = LogTag.OTHER;
        if (errorLogMessage == null || StringsKt.m32182p0(errorLogMessage)) {
            errorLogMessage = "null";
        }
        String str = errorLogMessage;
        if (ex == null) {
            ex = new NullPointerException("Invoked with null Throwable");
        }
        AFLoggerBase.e$default(aFLogger, logTag, str, ex, false, false, false, false, 120, null);
    }

    public static final void afInfoLog(@NotNull String logMessage) {
        Intrinsics.checkNotNullParameter(logMessage, "");
        INSTANCE.mo8698i(LogTag.OTHER, logMessage, true);
    }

    public static final void afWarnLog(@NotNull String warningLogMessage) {
        Intrinsics.checkNotNullParameter(warningLogMessage, "");
        AFLoggerBase.w$default(INSTANCE, LogTag.OTHER, warningLogMessage, false, 4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final Set m8686d() {
        return new LinkedHashSet();
    }

    @Override // com.appsflyer.sdk_base.logger.AFLoggerBase
    /* JADX INFO: renamed from: e */
    public final void mo8697e(@NotNull final LogTag tag, @NotNull final String msg, @NotNull final Throwable throwable, final boolean printMsg, final boolean printThrowable, final boolean shouldReportToExManager, final boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
        Intrinsics.checkNotNullParameter(throwable, "");
        ((ExecutorService) d.getValue()).execute(new RunnableC1762c(new Function1() { // from class: com.appsflyer.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AFLogger.registerClient(tag, msg, throwable, printMsg, printThrowable, shouldReportToExManager, shouldRemoteDebug, (AFLoggerBase) obj);
            }
        }));
    }

    @Override // com.appsflyer.sdk_base.logger.AFLoggerBase
    public final void force(@NotNull final LogTag tag, @NotNull final String msg) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
        ((ExecutorService) d.getValue()).execute(new RunnableC1762c(new Function1() { // from class: com.appsflyer.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AFLogger.registerClient(tag, msg, (AFLoggerBase) obj);
            }
        }));
    }

    @Override // com.appsflyer.sdk_base.logger.AFLoggerBase
    /* JADX INFO: renamed from: i */
    public final void mo8698i(@NotNull final LogTag tag, @NotNull final String msg, final boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
        ((ExecutorService) d.getValue()).execute(new RunnableC1762c(new Function1() { // from class: com.appsflyer.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AFLogger.AFKeystoreWrapper(tag, msg, shouldRemoteDebug, (AFLoggerBase) obj);
            }
        }));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void registerClient(@NotNull final AFLoggerBase... client) {
        Intrinsics.checkNotNullParameter(client, "");
        ((ExecutorService) d.getValue()).execute(new Runnable() { // from class: com.appsflyer.e
            @Override // java.lang.Runnable
            public final void run() {
                AFLogger.AFKeystoreWrapper(client);
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void unregisterClient(@NotNull final AFLoggerBase... client) {
        Intrinsics.checkNotNullParameter(client, "");
        ((ExecutorService) d.getValue()).execute(new Runnable() { // from class: com.appsflyer.g
            @Override // java.lang.Runnable
            public final void run() {
                AFLogger.AFLogger(client);
            }
        });
    }

    @Override // com.appsflyer.sdk_base.logger.AFLoggerBase
    /* JADX INFO: renamed from: v */
    public final void mo8699v(@NotNull final LogTag tag, @NotNull final String msg, final boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
        ((ExecutorService) d.getValue()).execute(new RunnableC1762c(new Function1() { // from class: com.appsflyer.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AFLogger.m8687d(tag, msg, shouldRemoteDebug, (AFLoggerBase) obj);
            }
        }));
    }

    @Override // com.appsflyer.sdk_base.logger.AFLoggerBase
    /* JADX INFO: renamed from: w */
    public final void mo8700w(@NotNull final LogTag tag, @NotNull final String msg, final boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
        ((ExecutorService) d.getValue()).execute(new RunnableC1762c(new Function1() { // from class: com.appsflyer.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AFLogger.AFLogger(tag, msg, shouldRemoteDebug, (AFLoggerBase) obj);
            }
        }));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AFKeystoreWrapper(LogTag logTag, String str, boolean z10, AFLoggerBase aFLoggerBase) {
        Intrinsics.checkNotNullParameter(aFLoggerBase, "");
        aFLoggerBase.mo8698i(logTag, str, z10);
        return Unit.f29331a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFLogger(AFLoggerBase[] aFLoggerBaseArr) {
        ((Set) registerClient.getValue()).removeAll(C7693m.m31870m0(aFLoggerBaseArr));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.appsflyer.sdk_base.logger.AFLoggerBase
    /* JADX INFO: renamed from: d */
    public final void mo8696d(@NotNull final LogTag tag, @NotNull final String msg, final boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
        ((ExecutorService) d.getValue()).execute(new RunnableC1762c(new Function1() { // from class: com.appsflyer.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AFLogger.registerClient(tag, msg, shouldRemoteDebug, (AFLoggerBase) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFKeystoreWrapper(AFLoggerBase[] aFLoggerBaseArr) {
        C7708u.m31920A((Set) registerClient.getValue(), aFLoggerBaseArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit registerClient(LogTag logTag, String str, boolean z10, AFLoggerBase aFLoggerBase) {
        Intrinsics.checkNotNullParameter(aFLoggerBase, "");
        aFLoggerBase.mo8696d(logTag, str, z10);
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void unregisterClient(Function1 function1) {
        Iterator it = ((Set) registerClient.getValue()).iterator();
        while (it.hasNext()) {
            function1.invoke((AFLoggerBase) it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit registerClient(LogTag logTag, String str, Throwable th2, boolean z10, boolean z11, boolean z12, boolean z13, AFLoggerBase aFLoggerBase) {
        Intrinsics.checkNotNullParameter(aFLoggerBase, "");
        aFLoggerBase.mo8697e(logTag, str, th2, z10, z11, z12, z13);
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final Unit m8687d(LogTag logTag, String str, boolean z10, AFLoggerBase aFLoggerBase) {
        Intrinsics.checkNotNullParameter(aFLoggerBase, "");
        aFLoggerBase.mo8699v(logTag, str, z10);
        return Unit.f29331a;
    }

    public static final void afErrorLog(@Nullable String errorLogMessage, @Nullable Throwable ex, boolean printThrowable) {
        AFLogger aFLogger = INSTANCE;
        LogTag logTag = LogTag.OTHER;
        if (errorLogMessage == null || StringsKt.m32182p0(errorLogMessage)) {
            errorLogMessage = "null";
        }
        String str = errorLogMessage;
        if (ex == null) {
            ex = new NullPointerException("Invoked with null Throwable");
        }
        AFLoggerBase.e$default(aFLogger, logTag, str, ex, false, printThrowable, false, false, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit registerClient(LogTag logTag, String str, AFLoggerBase aFLoggerBase) {
        Intrinsics.checkNotNullParameter(aFLoggerBase, "");
        aFLoggerBase.force(logTag, str);
        return Unit.f29331a;
    }
}
