package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p229jt.C7345l;
import p394qt.C10708b;

/* JADX INFO: loaded from: classes.dex */
public final class AFe1wSDK {

    @NotNull
    private final ExecutorService AFKeystoreWrapper;

    @NotNull
    private final Timer AFLogger;

    /* JADX INFO: renamed from: d */
    @NotNull
    private final Set<AFe1zSDK> f6951d;

    /* JADX INFO: renamed from: e */
    @NotNull
    private final NavigableSet<AFe1ySDK<?>> f6952e;

    @NotNull
    private final Set<AFe1zSDK> force;

    /* JADX INFO: renamed from: i */
    @NotNull
    private final NavigableSet<AFe1ySDK<?>> f6953i;

    @NotNull
    private Executor registerClient;

    @NotNull
    public final List<AFe1vSDK> unregisterClient;

    /* JADX INFO: renamed from: v */
    @NotNull
    private final List<AFe1ySDK<?>> f6954v;

    /* JADX INFO: renamed from: w */
    @NotNull
    private final Set<AFe1ySDK<?>> f6955w;

    public /* synthetic */ class AFa1uSDK {
        public static final /* synthetic */ int[] AFKeystoreWrapper;

        static {
            int[] iArr = new int[AFa1ySDK.values().length];
            try {
                iArr[AFa1ySDK.Duplicate.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFa1ySDK.Skipped.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFa1ySDK.Admitted.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            AFKeystoreWrapper = iArr;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.appsflyer.internal.AFe1wSDK$AFa1ySDK[], still in use, count: 1, list:
      (r0v1 com.appsflyer.internal.AFe1wSDK$AFa1ySDK[]) from 0x0024: INVOKE (r0v1 com.appsflyer.internal.AFe1wSDK$AFa1ySDK[]) STATIC call: qt.b.a(java.lang.Enum[]):qt.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):qt.a<E extends java.lang.Enum<E>> (m)]
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
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, m31665d2 = {"Lcom/appsflyer/internal/AFe1wSDK$AFa1ySDK;", "", "<init>", "(Ljava/lang/String;I)V", "AFKeystoreWrapper", "registerClient", "d"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class AFa1ySDK {
        Admitted,
        Duplicate,
        Skipped;

        static {
            C10708b.m40805a(aFa1ySDKArr);
        }

        private AFa1ySDK() {
            super(str, i);
        }

        public static AFa1ySDK valueOf(String str) {
            return (AFa1ySDK) Enum.valueOf(AFa1ySDK.class, str);
        }

        public static AFa1ySDK[] values() {
            return (AFa1ySDK[]) AFLogger.clone();
        }
    }

    public AFe1wSDK(@NotNull ExecutorService executorService) {
        Intrinsics.checkNotNullParameter(executorService, "");
        this.AFKeystoreWrapper = executorService;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(executorServiceNewSingleThreadExecutor, "");
        this.registerClient = executorServiceNewSingleThreadExecutor;
        this.AFLogger = new Timer(true);
        this.unregisterClient = new CopyOnWriteArrayList();
        this.f6951d = new CopyOnWriteArraySet();
        Set<AFe1zSDK> setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        Intrinsics.checkNotNullExpressionValue(setNewSetFromMap, "");
        this.force = setNewSetFromMap;
        this.f6953i = new ConcurrentSkipListSet();
        this.f6952e = new ConcurrentSkipListSet();
        this.f6954v = new ArrayList();
        Set<AFe1ySDK<?>> setNewSetFromMap2 = Collections.newSetFromMap(new ConcurrentHashMap());
        Intrinsics.checkNotNullExpressionValue(setNewSetFromMap2, "");
        this.f6955w = setNewSetFromMap2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFKeystoreWrapper(AFe1wSDK aFe1wSDK, AFe1ySDK aFe1ySDK) {
        Iterator<AFe1vSDK> it = aFe1wSDK.unregisterClient.iterator();
        while (it.hasNext()) {
            it.next().registerClient(aFe1ySDK);
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.appsflyer.sdk_base.logger.AFLoggerBase.d$default(com.appsflyer.sdk_base.logger.AFLoggerBase, com.appsflyer.sdk_base.logger.LogTag, java.lang.String, boolean, int, java.lang.Object):void */
    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFLogger(final AFe1wSDK aFe1wSDK) {
        synchronized (aFe1wSDK.f6953i) {
            final AFe1ySDK<?> aFe1ySDKPollFirst = aFe1wSDK.f6953i.pollFirst();
            if (aFe1ySDKPollFirst == null) {
                return;
            }
            aFe1wSDK.f6955w.add(aFe1ySDKPollFirst);
            long jMo8802d = aFe1ySDKPollFirst.mo8802d();
            Thread threadCurrentThread = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "");
            AFe1sSDK aFe1sSDK = new AFe1sSDK(threadCurrentThread);
            if (jMo8802d > 0) {
                aFe1wSDK.AFLogger.schedule(aFe1sSDK, jMo8802d);
            }
            aFe1wSDK.registerClient.execute(new Runnable() { // from class: com.appsflyer.internal.k0
                @Override // java.lang.Runnable
                public final void run() {
                    AFe1wSDK.AFKeystoreWrapper(this.f7137a, aFe1ySDKPollFirst);
                }
            });
            if (!aFe1wSDK.f6953i.isEmpty()) {
                aFe1wSDK.AFKeystoreWrapper.submit(new RunnableC1806i0(aFe1wSDK));
            }
            try {
                AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.QUEUE, "starting task execution: " + aFe1ySDKPollFirst, false, 4, null);
                final AFd1cSDK aFd1cSDKM8823v = aFe1ySDKPollFirst.call();
                aFe1sSDK.cancel();
                aFe1wSDK.registerClient.execute(new Runnable() { // from class: com.appsflyer.internal.l0
                    @Override // java.lang.Runnable
                    public final void run() {
                        AFe1wSDK.unregisterClient(aFe1ySDKPollFirst, aFd1cSDKM8823v, aFe1wSDK);
                    }
                });
            } catch (InterruptedIOException unused) {
                AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.QUEUE, "task was interrupted: " + aFe1ySDKPollFirst, false, 4, null);
                final AFd1cSDK aFd1cSDK = AFd1cSDK.TIMEOUT;
                aFe1ySDKPollFirst.e = aFd1cSDK;
                aFe1wSDK.registerClient.execute(new Runnable() { // from class: com.appsflyer.internal.l0
                    @Override // java.lang.Runnable
                    public final void run() {
                        AFe1wSDK.unregisterClient(aFe1ySDKPollFirst, aFd1cSDK, aFe1wSDK);
                    }
                });
            } catch (InterruptedException unused2) {
                AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.QUEUE, "task was interrupted: " + aFe1ySDKPollFirst, false, 4, null);
                final AFd1cSDK aFd1cSDK2 = AFd1cSDK.TIMEOUT;
                aFe1ySDKPollFirst.e = aFd1cSDK2;
                aFe1wSDK.registerClient.execute(new Runnable() { // from class: com.appsflyer.internal.l0
                    @Override // java.lang.Runnable
                    public final void run() {
                        AFe1wSDK.unregisterClient(aFe1ySDKPollFirst, aFd1cSDK2, aFe1wSDK);
                    }
                });
            } catch (Throwable unused3) {
                aFe1sSDK.cancel();
                final AFd1cSDK aFd1cSDK3 = AFd1cSDK.FAILURE;
                aFe1wSDK.registerClient.execute(new Runnable() { // from class: com.appsflyer.internal.l0
                    @Override // java.lang.Runnable
                    public final void run() {
                        AFe1wSDK.unregisterClient(aFe1ySDKPollFirst, aFd1cSDK3, aFe1wSDK);
                    }
                });
            }
        }
    }

    private final AFa1ySDK registerClient(AFe1ySDK<?> aFe1ySDK) {
        boolean zAdd;
        AFa1ySDK aFa1ySDK;
        synchronized (this.f6953i) {
            if (this.f6955w.contains(aFe1ySDK)) {
                AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.QUEUE, "tried to add already running task: " + aFe1ySDK, false, 4, null);
                return AFa1ySDK.Duplicate;
            }
            if (!this.f6953i.contains(aFe1ySDK) && !this.f6952e.contains(aFe1ySDK)) {
                for (AFe1zSDK aFe1zSDK : aFe1ySDK.AFKeystoreWrapper) {
                    if (this.force.contains(aFe1zSDK)) {
                        Intrinsics.checkNotNullParameter(aFe1zSDK, "");
                        aFe1ySDK.AFLogger.add(aFe1zSDK);
                    }
                }
                if (this.f6951d.containsAll(aFe1ySDK.AFLogger)) {
                    zAdd = this.f6953i.add(aFe1ySDK);
                } else {
                    zAdd = this.f6952e.add(aFe1ySDK);
                    if (zAdd) {
                        AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.QUEUE, "new task was blocked: " + aFe1ySDK, false, 4, null);
                        aFe1ySDK.mo8814w();
                    }
                }
                if (zAdd) {
                    this.f6953i.addAll(this.f6954v);
                    this.f6954v.clear();
                    aFa1ySDK = AFa1ySDK.Admitted;
                } else {
                    AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.QUEUE, "task not added, it's already in the queue: " + aFe1ySDK, false, 4, null);
                    aFa1ySDK = AFa1ySDK.Skipped;
                }
                return aFa1ySDK;
            }
            AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.QUEUE, "tried to add already scheduled task: " + aFe1ySDK, false, 4, null);
            return AFa1ySDK.Duplicate;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final void unregisterClient(AFe1wSDK aFe1wSDK, AFe1ySDK aFe1ySDK) {
        int i10 = AFa1uSDK.AFKeystoreWrapper[aFe1wSDK.registerClient(aFe1ySDK).ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                AFLoggerBase.w$default(AFLogger.INSTANCE, LogTag.QUEUE, "QUEUE: tried to add already pending task: " + aFe1ySDK, false, 4, null);
                return;
            }
            if (i10 != 3) {
                throw new C7345l();
            }
            aFe1wSDK.force.add(aFe1ySDK.unregisterClient);
            AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.QUEUE, "new task added: " + aFe1ySDK, false, 4, null);
            Iterator<AFe1vSDK> it = aFe1wSDK.unregisterClient.iterator();
            while (it.hasNext()) {
                it.next().mo8775d(aFe1ySDK);
            }
            aFe1wSDK.AFKeystoreWrapper.submit(new RunnableC1806i0(aFe1wSDK));
            synchronized (aFe1wSDK.f6953i) {
                try {
                    for (int size = (aFe1wSDK.f6953i.size() + aFe1wSDK.f6952e.size()) - 40; size > 0; size--) {
                        boolean zIsEmpty = aFe1wSDK.f6952e.isEmpty();
                        boolean zIsEmpty2 = aFe1wSDK.f6953i.isEmpty();
                        if (!zIsEmpty2 && !zIsEmpty) {
                            AFe1ySDK<?> aFe1ySDKFirst = aFe1wSDK.f6953i.first();
                            AFe1ySDK<?> aFe1ySDKFirst2 = aFe1wSDK.f6952e.first();
                            Intrinsics.checkNotNull(aFe1ySDKFirst2);
                            if (aFe1ySDKFirst.compareTo(aFe1ySDKFirst2) > 0) {
                                aFe1wSDK.m8819d(aFe1wSDK.f6953i);
                            } else {
                                aFe1wSDK.m8819d(aFe1wSDK.f6952e);
                            }
                        } else if (!zIsEmpty2) {
                            aFe1wSDK.m8819d(aFe1wSDK.f6953i);
                        } else if (!zIsEmpty) {
                            aFe1wSDK.m8819d(aFe1wSDK.f6952e);
                        }
                    }
                    Unit unit = Unit.f29331a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX INFO: renamed from: d */
    public final void m8820d(@NotNull final AFe1ySDK<?> aFe1ySDK) {
        Intrinsics.checkNotNullParameter(aFe1ySDK, "");
        this.registerClient.execute(new Runnable() { // from class: com.appsflyer.internal.j0
            @Override // java.lang.Runnable
            public final void run() {
                AFe1wSDK.unregisterClient(this.f7132a, aFe1ySDK);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    private final void m8819d(NavigableSet<AFe1ySDK<?>> navigableSet) {
        AFe1ySDK<?> aFe1ySDKPollFirst = navigableSet.pollFirst();
        if (aFe1ySDKPollFirst == null) {
            return;
        }
        this.f6951d.add(aFe1ySDKPollFirst.unregisterClient);
        Iterator<AFe1vSDK> it = this.unregisterClient.iterator();
        while (it.hasNext()) {
            it.next().unregisterClient(aFe1ySDKPollFirst);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void unregisterClient(AFe1ySDK aFe1ySDK, AFd1cSDK aFd1cSDK, AFe1wSDK aFe1wSDK) {
        AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.QUEUE, "execution finished for " + aFe1ySDK + ", result: " + aFd1cSDK, false, 4, null);
        aFe1wSDK.f6955w.remove(aFe1ySDK);
        Iterator<AFe1vSDK> it = aFe1wSDK.unregisterClient.iterator();
        while (it.hasNext()) {
            it.next().AFKeystoreWrapper(aFe1ySDK, aFd1cSDK);
        }
        if (aFd1cSDK == AFd1cSDK.SUCCESS) {
            aFe1wSDK.f6951d.add(aFe1ySDK.unregisterClient);
            aFe1wSDK.unregisterClient();
            return;
        }
        if (aFe1ySDK.AFLogger()) {
            Intrinsics.checkNotNullParameter(aFe1ySDK, "");
            if ((aFe1ySDK instanceof AFf1sSDK) && ((AFf1sSDK) aFe1ySDK).unregisterClient == AFd1bSDK.ARS_VALIDATE) {
                return;
            }
            synchronized (aFe1wSDK.f6953i) {
                try {
                    aFe1wSDK.f6954v.add(aFe1ySDK);
                    Iterator<AFe1vSDK> it2 = aFe1wSDK.unregisterClient.iterator();
                    while (it2.hasNext()) {
                        it2.next().mo8775d(aFe1ySDK);
                    }
                    Unit unit = Unit.f29331a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return;
        }
        aFe1wSDK.f6951d.add(aFe1ySDK.unregisterClient);
        aFe1wSDK.unregisterClient();
    }

    private final void unregisterClient() {
        synchronized (this.f6953i) {
            try {
                Iterator<AFe1ySDK<?>> it = this.f6952e.iterator();
                Intrinsics.checkNotNullExpressionValue(it, "");
                boolean z10 = false;
                while (it.hasNext()) {
                    AFe1ySDK<?> next = it.next();
                    Intrinsics.checkNotNull(next);
                    if (this.f6951d.containsAll(next.AFLogger)) {
                        it.remove();
                        this.f6953i.add(next);
                        z10 = true;
                    }
                }
                if (z10) {
                    this.AFKeystoreWrapper.submit(new RunnableC1806i0(this));
                }
                Unit unit = Unit.f29331a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
