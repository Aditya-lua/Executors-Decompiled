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

/* JADX INFO: loaded from: classes.dex */
public final class AFe1wSDK {

    @NotNull
    private final ExecutorService AFKeystoreWrapper;

    @NotNull
    private final Timer AFLogger;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Set<AFe1zSDK> f5323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final NavigableSet<AFe1ySDK<?>> f5324e;

    @NotNull
    private final Set<AFe1zSDK> force;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final NavigableSet<AFe1ySDK<?>> f5325i;

    @NotNull
    private Executor registerClient;

    @NotNull
    public final List<AFe1vSDK> unregisterClient;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private final List<AFe1ySDK<?>> f5326v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private final Set<AFe1ySDK<?>> f5327w;

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
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/appsflyer/internal/AFe1wSDK$AFa1ySDK;", "", "<init>", "(Ljava/lang/String;I)V", "AFKeystoreWrapper", "registerClient", "d"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AFa1ySDK {
        Admitted,
        Duplicate,
        Skipped;

        static {
            qt.b.a(aFa1ySDKArr);
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
        this.f5323d = new CopyOnWriteArraySet();
        Set<AFe1zSDK> setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        Intrinsics.checkNotNullExpressionValue(setNewSetFromMap, "");
        this.force = setNewSetFromMap;
        this.f5325i = new ConcurrentSkipListSet();
        this.f5324e = new ConcurrentSkipListSet();
        this.f5326v = new ArrayList();
        Set<AFe1ySDK<?>> setNewSetFromMap2 = Collections.newSetFromMap(new ConcurrentHashMap());
        Intrinsics.checkNotNullExpressionValue(setNewSetFromMap2, "");
        this.f5327w = setNewSetFromMap2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFKeystoreWrapper(AFe1wSDK aFe1wSDK, AFe1ySDK aFe1ySDK) {
        Iterator<AFe1vSDK> it = aFe1wSDK.unregisterClient.iterator();
        while (it.hasNext()) {
            it.next().registerClient(aFe1ySDK);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFLogger(final AFe1wSDK aFe1wSDK) {
        synchronized (aFe1wSDK.f5325i) {
            final AFe1ySDK<?> aFe1ySDKPollFirst = aFe1wSDK.f5325i.pollFirst();
            if (aFe1ySDKPollFirst == null) {
                return;
            }
            aFe1wSDK.f5327w.add(aFe1ySDKPollFirst);
            long jD = aFe1ySDKPollFirst.d();
            Thread threadCurrentThread = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "");
            AFe1sSDK aFe1sSDK = new AFe1sSDK(threadCurrentThread);
            if (jD > 0) {
                aFe1wSDK.AFLogger.schedule(aFe1sSDK, jD);
            }
            aFe1wSDK.registerClient.execute(new Runnable() { // from class: com.appsflyer.internal.k0
                @Override // java.lang.Runnable
                public final void run() {
                    AFe1wSDK.AFKeystoreWrapper(this.f5499a, aFe1ySDKPollFirst);
                }
            });
            if (!aFe1wSDK.f5325i.isEmpty()) {
                aFe1wSDK.AFKeystoreWrapper.submit(new i0(aFe1wSDK));
            }
            try {
                AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.QUEUE, "starting task execution: " + aFe1ySDKPollFirst, false, 4, null);
                final AFd1cSDK aFd1cSDKV = aFe1ySDKPollFirst.call();
                aFe1sSDK.cancel();
                aFe1wSDK.registerClient.execute(new Runnable() { // from class: com.appsflyer.internal.l0
                    @Override // java.lang.Runnable
                    public final void run() {
                        AFe1wSDK.unregisterClient(aFe1ySDKPollFirst, aFd1cSDKV, aFe1wSDK);
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
        synchronized (this.f5325i) {
            if (this.f5327w.contains(aFe1ySDK)) {
                AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.QUEUE, "tried to add already running task: " + aFe1ySDK, false, 4, null);
                return AFa1ySDK.Duplicate;
            }
            if (!this.f5325i.contains(aFe1ySDK) && !this.f5324e.contains(aFe1ySDK)) {
                for (AFe1zSDK aFe1zSDK : aFe1ySDK.AFKeystoreWrapper) {
                    if (this.force.contains(aFe1zSDK)) {
                        Intrinsics.checkNotNullParameter(aFe1zSDK, "");
                        aFe1ySDK.AFLogger.add(aFe1zSDK);
                    }
                }
                if (this.f5323d.containsAll(aFe1ySDK.AFLogger)) {
                    zAdd = this.f5325i.add(aFe1ySDK);
                } else {
                    zAdd = this.f5324e.add(aFe1ySDK);
                    if (zAdd) {
                        AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.QUEUE, "new task was blocked: " + aFe1ySDK, false, 4, null);
                        aFe1ySDK.w();
                    }
                }
                if (zAdd) {
                    this.f5325i.addAll(this.f5326v);
                    this.f5326v.clear();
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void unregisterClient(AFe1wSDK aFe1wSDK, AFe1ySDK aFe1ySDK) {
        int i10 = AFa1uSDK.AFKeystoreWrapper[aFe1wSDK.registerClient(aFe1ySDK).ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                AFLoggerBase.w$default(AFLogger.INSTANCE, LogTag.QUEUE, "QUEUE: tried to add already pending task: " + aFe1ySDK, false, 4, null);
                return;
            }
            if (i10 != 3) {
                throw new jt.l();
            }
            aFe1wSDK.force.add(aFe1ySDK.unregisterClient);
            AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.QUEUE, "new task added: " + aFe1ySDK, false, 4, null);
            Iterator<AFe1vSDK> it = aFe1wSDK.unregisterClient.iterator();
            while (it.hasNext()) {
                it.next().d(aFe1ySDK);
            }
            aFe1wSDK.AFKeystoreWrapper.submit(new i0(aFe1wSDK));
            synchronized (aFe1wSDK.f5325i) {
                try {
                    for (int size = (aFe1wSDK.f5325i.size() + aFe1wSDK.f5324e.size()) - 40; size > 0; size--) {
                        boolean zIsEmpty = aFe1wSDK.f5324e.isEmpty();
                        boolean zIsEmpty2 = aFe1wSDK.f5325i.isEmpty();
                        if (!zIsEmpty2 && !zIsEmpty) {
                            AFe1ySDK<?> aFe1ySDKFirst = aFe1wSDK.f5325i.first();
                            AFe1ySDK<?> aFe1ySDKFirst2 = aFe1wSDK.f5324e.first();
                            Intrinsics.checkNotNull(aFe1ySDKFirst2);
                            if (aFe1ySDKFirst.compareTo(aFe1ySDKFirst2) > 0) {
                                aFe1wSDK.d(aFe1wSDK.f5325i);
                            } else {
                                aFe1wSDK.d(aFe1wSDK.f5324e);
                            }
                        } else if (!zIsEmpty2) {
                            aFe1wSDK.d(aFe1wSDK.f5325i);
                        } else if (!zIsEmpty) {
                            aFe1wSDK.d(aFe1wSDK.f5324e);
                        }
                    }
                    Unit unit = Unit.f22483a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void d(@NotNull final AFe1ySDK<?> aFe1ySDK) {
        Intrinsics.checkNotNullParameter(aFe1ySDK, "");
        this.registerClient.execute(new Runnable() { // from class: com.appsflyer.internal.j0
            @Override // java.lang.Runnable
            public final void run() {
                AFe1wSDK.unregisterClient(this.f5496a, aFe1ySDK);
            }
        });
    }

    private final void d(NavigableSet<AFe1ySDK<?>> navigableSet) {
        AFe1ySDK<?> aFe1ySDKPollFirst = navigableSet.pollFirst();
        if (aFe1ySDKPollFirst == null) {
            return;
        }
        this.f5323d.add(aFe1ySDKPollFirst.unregisterClient);
        Iterator<AFe1vSDK> it = this.unregisterClient.iterator();
        while (it.hasNext()) {
            it.next().unregisterClient(aFe1ySDKPollFirst);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void unregisterClient(AFe1ySDK aFe1ySDK, AFd1cSDK aFd1cSDK, AFe1wSDK aFe1wSDK) {
        AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.QUEUE, "execution finished for " + aFe1ySDK + ", result: " + aFd1cSDK, false, 4, null);
        aFe1wSDK.f5327w.remove(aFe1ySDK);
        Iterator<AFe1vSDK> it = aFe1wSDK.unregisterClient.iterator();
        while (it.hasNext()) {
            it.next().AFKeystoreWrapper(aFe1ySDK, aFd1cSDK);
        }
        if (aFd1cSDK == AFd1cSDK.SUCCESS) {
            aFe1wSDK.f5323d.add(aFe1ySDK.unregisterClient);
            aFe1wSDK.unregisterClient();
            return;
        }
        if (aFe1ySDK.AFLogger()) {
            Intrinsics.checkNotNullParameter(aFe1ySDK, "");
            if ((aFe1ySDK instanceof AFf1sSDK) && ((AFf1sSDK) aFe1ySDK).unregisterClient == AFd1bSDK.ARS_VALIDATE) {
                return;
            }
            synchronized (aFe1wSDK.f5325i) {
                try {
                    aFe1wSDK.f5326v.add(aFe1ySDK);
                    Iterator<AFe1vSDK> it2 = aFe1wSDK.unregisterClient.iterator();
                    while (it2.hasNext()) {
                        it2.next().d(aFe1ySDK);
                    }
                    Unit unit = Unit.f22483a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return;
        }
        aFe1wSDK.f5323d.add(aFe1ySDK.unregisterClient);
        aFe1wSDK.unregisterClient();
    }

    private final void unregisterClient() {
        synchronized (this.f5325i) {
            try {
                Iterator<AFe1ySDK<?>> it = this.f5324e.iterator();
                Intrinsics.checkNotNullExpressionValue(it, "");
                boolean z10 = false;
                while (it.hasNext()) {
                    AFe1ySDK<?> next = it.next();
                    Intrinsics.checkNotNull(next);
                    if (this.f5323d.containsAll(next.AFLogger)) {
                        it.remove();
                        this.f5325i.add(next);
                        z10 = true;
                    }
                }
                if (z10) {
                    this.AFKeystoreWrapper.submit(new i0(this));
                }
                Unit unit = Unit.f22483a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
