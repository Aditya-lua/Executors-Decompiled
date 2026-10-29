package com.appsflyer.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.StrictMode;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.exception_manager.ExceptionManager;
import com.appsflyer.exception_manager.ExceptionManagerImpl;
import com.appsflyer.exception_manager.SdkData;
import com.appsflyer.sdk_base.exception_manager.ExceptionManagerConfiguration;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.sdk_base.logger.LoggerDelegate;
import com.appsflyer.sdk_base.util.OptionalFeaturesValidator;
import com.appsflyer.sdk_base.util.SupportedOptionalFeatures;
import com.appsflyer.share.AppsFlyerConversionListener;
import java.lang.reflect.Constructor;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1aSDK implements AFc1bSDK {
    private static final int registerClient = (int) TimeUnit.SECONDS.toMillis(30);
    private ScheduledExecutorService AFKeystoreWrapper;
    private ExecutorService AFLogger;
    private AFh1xSDK AFLoggerLogLevel;
    private AFi1hSDK AppsFlyerLib;
    private AFg1rSDK afDebugLog;
    private AppsFlyerProperties afErrorLog;
    private SharedPreferences afInfoLog;
    private AFf1aSDK afWarnLog;
    private AFf1eSDK clearUserPii;

    /* JADX INFO: renamed from: e */
    private AFd1xSDK f6869e;
    private LoggerDelegate enableTCFDataCollection;
    private PurchaseHandler force;
    private AFi1aSDK getEntries;
    private OptionalFeaturesValidator getInstance;
    private AFe1wSDK getLevel;
    private AFh1sSDK getOutOfStore;
    private AFf1fSDK getSdkVersion;

    /* JADX INFO: renamed from: i */
    private AFc1gSDK f6870i;
    private AFc1vSDK onPause;
    private AFf1bSDK sendPushNotificationData;
    private AFd1eSDK setAdditionalData;
    private AFd1jSDK setAndroidIdData;
    private AFi1oSDK setAppInviteOneLink;
    private AFc1eSDK setCollectAndroidID;
    private AFg1qSDK setCustomerUserId;
    private AFj1cSDK setDebugLog;
    private AFj1mSDK setImeiData;
    private AFg1wSDK setOaidData;
    private AFh1wSDK setOutOfStore;
    private AFj1wSDK setResolveDeepLinkURLs;
    private AFa1qSDK setUserEmail;
    private AFa1lSDK setUserFbLoginId;
    private AFa1aSDK setUserFirstName;
    private AFi1tSDK setUserLastName;
    private AFb1bSDK setUserPhone;
    private ExceptionManager stop;
    private ExecutorService unregisterClient;
    private AFi1vSDK updateServerUninstallToken;

    /* JADX INFO: renamed from: v */
    private AFf1hSDK f6871v;
    private AFj1ySDK valueOf;
    private AFd1uSDK values;

    /* JADX INFO: renamed from: w */
    private AFc1iSDK f6872w;

    /* JADX INFO: renamed from: d */
    public final AFd1zSDK f6868d = new AFd1zSDK();
    private volatile AppsFlyerConversionListener setOneLinkCustomDomain = null;

    public static class AFa1tSDK implements ThreadFactory {
        private static final AtomicInteger AFLogger = new AtomicInteger();

        /* JADX INFO: renamed from: d */
        private final AtomicInteger f6873d = new AtomicInteger();

        public AFa1tSDK() {
            AFLogger.incrementAndGet();
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            int i10 = AFLogger.get();
            int iIncrementAndGet = this.f6873d.incrementAndGet();
            StringBuilder sb2 = new StringBuilder("queue-");
            sb2.append(i10);
            sb2.append("-");
            sb2.append(iIncrementAndGet);
            return new Thread(runnable, sb2.toString());
        }
    }

    @NonNull
    private synchronized ScheduledExecutorService clearUserPii() {
        try {
            if (this.AFKeystoreWrapper == null) {
                this.AFKeystoreWrapper = AFc1jSDK.AFKeystoreWrapper();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.AFKeystoreWrapper;
    }

    @NonNull
    private synchronized AFd1xSDK getOutOfStore() {
        try {
            if (this.f6869e == null) {
                this.f6869e = new AFd1xSDK(new AFd1mSDK(registerClient), mo8751d());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f6869e;
    }

    /* JADX INFO: renamed from: s_ */
    private SharedPreferences m8749s_(Context context) {
        if (this.afInfoLog == null) {
            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
            try {
                this.afInfoLog = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
            } finally {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            }
        }
        return this.afInfoLog;
    }

    @NonNull
    private synchronized AFj1mSDK sendPushNotificationData() {
        try {
            if (this.setImeiData == null) {
                this.setImeiData = new AFj1mSDK(AFLogger());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.setImeiData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ExceptionManagerConfiguration setAdditionalData() {
        AFh1gSDK aFh1gSDK;
        AFh1aSDK aFh1aSDK = mo8753i().unregisterClient.AFLogger;
        if (aFh1aSDK == null || (aFh1gSDK = aFh1aSDK.registerClient) == null) {
            return null;
        }
        return aFh1gSDK.f7022d;
    }

    @NonNull
    private synchronized AFf1bSDK setCollectAndroidID() {
        try {
            if (this.sendPushNotificationData == null) {
                this.sendPushNotificationData = new AFf1bSDK(valueOf(), AFLogger());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.sendPushNotificationData;
    }

    @NonNull
    private synchronized ScheduledExecutorService setOutOfStore() {
        try {
            if (this.AFKeystoreWrapper == null) {
                this.AFKeystoreWrapper = AFc1jSDK.AFLogger();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.AFKeystoreWrapper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String setResolveDeepLinkURLs() {
        return String.format(Locale.US, AFj1mSDK.f7069e, AppsFlyerLib.getInstance().getHostPrefix(), com.appsflyer.internal.AFa1tSDK.m8724d().getHostName());
    }

    @NonNull
    private synchronized ExecutorService setUserFbLoginId() {
        try {
            if (this.AFLogger == null) {
                this.AFLogger = AFc1jSDK.m8771d();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.AFLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t_ */
    public /* synthetic */ SharedPreferences m8750t_() {
        Context context = this.f6868d.f6933d;
        if (context != null) {
            return m8749s_(context);
        }
        throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.appsflyer.internal.AFc1bSDK
    @NonNull
    public final AFc1kSDK AFKeystoreWrapper() {
        if (this.f6870i == null) {
            this.f6870i = new AFc1gSDK(new AFc1dSDK(new Function0() { // from class: com.appsflyer.internal.r
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.f7160a.m8750t_();
                }
            }));
        }
        return this.f6870i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.appsflyer.internal.AFc1bSDK
    @NonNull
    public final synchronized AFc1iSDK AFLogger() {
        try {
            if (this.f6872w == null) {
                AFd1zSDK aFd1zSDKValueOf = valueOf();
                AFc1kSDK aFc1kSDKAFKeystoreWrapper = AFKeystoreWrapper();
                if (this.setCollectAndroidID == null) {
                    this.setCollectAndroidID = new AFc1eSDK();
                }
                this.f6872w = new AFc1iSDK(aFd1zSDKValueOf, aFc1kSDKAFKeystoreWrapper, this.setCollectAndroidID, mo8751d());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f6872w;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @NonNull
    public final synchronized AFd1uSDK AFLoggerLogLevel() {
        try {
            if (this.values == null) {
                this.values = new AFd1wSDK(this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.values;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @NonNull
    public final synchronized AFf1fSDK AppsFlyerLib() {
        try {
            if (this.getSdkVersion == null) {
                AFd1zSDK aFd1zSDKValueOf = valueOf();
                if (this.getInstance == null) {
                    this.getInstance = new AFj1hSDK();
                }
                this.getSdkVersion = new AFf1fSDK(aFd1zSDKValueOf, this.getInstance);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.getSdkVersion;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @NonNull
    public final synchronized AFi1aSDK afDebugLog() {
        try {
            if (this.getEntries == null) {
                if (this.AppsFlyerLib == null) {
                    this.AppsFlyerLib = new AFi1eSDK();
                }
                this.getEntries = new AFi1aSDK(this, this.AppsFlyerLib);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.getEntries;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @NonNull
    public final LoggerDelegate afErrorLog() {
        if (this.enableTCFDataCollection == null) {
            this.enableTCFDataCollection = new LoggerDelegate(AFLogger.INSTANCE);
        }
        return this.enableTCFDataCollection;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @NonNull
    public final AFj1ySDK afInfoLog() {
        if (this.valueOf == null) {
            Context context = this.f6868d.f6933d;
            if (context == null) {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
            this.valueOf = new AFj1vSDK(context, setUserFbLoginId());
        }
        return this.valueOf;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @NonNull
    public final synchronized AFe1wSDK afWarnLog() {
        try {
            if (this.getLevel == null) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 6, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>() { // from class: com.appsflyer.internal.AFc1aSDK.5
                    @Override // java.util.concurrent.LinkedBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
                    public final /* synthetic */ boolean offer(Object obj) {
                        Runnable runnable = (Runnable) obj;
                        if (isEmpty()) {
                            return super.offer(runnable);
                        }
                        return false;
                    }
                }, new AFa1tSDK());
                threadPoolExecutor.setRejectedExecutionHandler(new RejectedExecutionHandler() { // from class: com.appsflyer.internal.u
                    @Override // java.util.concurrent.RejectedExecutionHandler
                    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor2) {
                        AFc1aSDK.AFLogger(runnable, threadPoolExecutor2);
                    }
                });
                this.getLevel = new AFe1wSDK(threadPoolExecutor);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.getLevel;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @NonNull
    /* JADX INFO: renamed from: d */
    public final synchronized ExecutorService mo8751d() {
        try {
            if (this.unregisterClient == null) {
                this.unregisterClient = AFc1jSDK.unregisterClient();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.unregisterClient;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @NonNull
    /* JADX INFO: renamed from: e */
    public final synchronized AFh1xSDK mo8752e() {
        try {
            if (this.AFLoggerLogLevel == null) {
                this.AFLoggerLogLevel = new AFh1xSDK(AFKeystoreWrapper(), AFLogger());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.AFLoggerLogLevel;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @NonNull
    public final synchronized AFa1qSDK enableTCFDataCollection() {
        try {
            if (this.setUserEmail == null) {
                this.setUserEmail = new AFa1qSDK(this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.setUserEmail;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @NonNull
    public final AFg1rSDK force() {
        if (this.afDebugLog == null) {
            Context context = this.f6868d.f6933d;
            if (context == null) {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
            if (this.setDebugLog == null) {
                this.setDebugLog = new AFj1eSDK();
            }
            AFj1cSDK aFj1cSDK = this.setDebugLog;
            if (this.setOaidData == null) {
                this.setOaidData = new AFg1pSDK();
            }
            AFg1wSDK aFg1wSDK = this.setOaidData;
            if (this.valueOf == null) {
                Context context2 = this.f6868d.f6933d;
                if (context2 == null) {
                    throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                }
                this.valueOf = new AFj1vSDK(context2, setUserFbLoginId());
            }
            AFj1ySDK aFj1ySDK = this.valueOf;
            if (this.setCustomerUserId == null) {
                this.setCustomerUserId = new AFg1nSDK();
            }
            AFg1qSDK aFg1qSDK = this.setCustomerUserId;
            AFh1xSDK aFh1xSDKMo8752e = mo8752e();
            AFc1kSDK aFc1kSDKAFKeystoreWrapper = AFKeystoreWrapper();
            AFc1iSDK aFc1iSDKAFLogger = AFLogger();
            if (this.updateServerUninstallToken == null) {
                Context context3 = this.f6868d.f6933d;
                if (context3 == null) {
                    throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                }
                this.updateServerUninstallToken = new AFi1vSDK(context3);
            }
            AFi1vSDK aFi1vSDK = this.updateServerUninstallToken;
            AFf1fSDK aFf1fSDKAppsFlyerLib = AppsFlyerLib();
            AFd1zSDK aFd1zSDKValueOf = valueOf();
            AFf1bSDK collectAndroidID = setCollectAndroidID();
            if (this.setCollectAndroidID == null) {
                this.setCollectAndroidID = new AFc1eSDK();
            }
            this.afDebugLog = new AFg1oSDK(context, aFj1cSDK, aFg1wSDK, aFj1ySDK, aFg1qSDK, aFh1xSDKMo8752e, aFc1kSDKAFKeystoreWrapper, aFc1iSDKAFLogger, aFi1vSDK, aFf1fSDKAppsFlyerLib, aFd1zSDKValueOf, collectAndroidID, this.setCollectAndroidID, registerClient());
        }
        return this.afDebugLog;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final synchronized ExceptionManager getEntries() {
        try {
            if (this.getInstance == null) {
                this.getInstance = new AFj1hSDK();
            }
            if (this.getInstance.isOptionalFeaturePresent(SupportedOptionalFeatures.EXCEPTION_MANAGER) && this.stop == null) {
                AFf1fSDK aFf1fSDKAppsFlyerLib = AppsFlyerLib();
                String str = (String) AFf1fSDK.unregisterClient(new Object[]{aFf1fSDKAppsFlyerLib}, -1660886869, 1660886871, System.identityHashCode(aFf1fSDKAppsFlyerLib));
                Function0 function0 = new Function0() { // from class: com.appsflyer.internal.v
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AFc1aSDK.setResolveDeepLinkURLs();
                    }
                };
                AFLogger();
                String strUnregisterClient = AFc1iSDK.unregisterClient();
                String strAFLogger = AFb1jSDK.AFLogger(AFLogger().AFKeystoreWrapper);
                String packageName = AFLogger().f6886d.f6933d.getPackageName();
                if (this.setDebugLog == null) {
                    this.setDebugLog = new AFj1eSDK();
                }
                SdkData sdkData = new SdkData(str, function0, strUnregisterClient, strAFLogger, packageName, this.setDebugLog.unregisterClient());
                Context context = this.f6868d.f6933d;
                if (context == null) {
                    throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                }
                this.stop = new ExceptionManagerImpl(sdkData, context, mo8751d(), AFKeystoreWrapper().mo8765p_(), new Function0() { // from class: com.appsflyer.internal.w
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return this.f7173a.setAdditionalData();
                    }
                }, new Function1() { // from class: com.appsflyer.internal.x
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AFc1aSDK.AFKeystoreWrapper((String) obj);
                    }
                });
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.stop;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @NonNull
    public final AFi1vSDK getInstance() {
        if (this.updateServerUninstallToken == null) {
            Context context = this.f6868d.f6933d;
            if (context == null) {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
            this.updateServerUninstallToken = new AFi1vSDK(context);
        }
        return this.updateServerUninstallToken;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @NonNull
    public final synchronized AFd1jSDK getLevel() {
        try {
            if (this.setAndroidIdData == null) {
                this.setAndroidIdData = new AFd1jSDK(AFLogger(), AFKeystoreWrapper());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.setAndroidIdData;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @NonNull
    public final synchronized AFa1aSDK getSdkVersion() {
        try {
            if (this.setUserFirstName == null) {
                this.setUserFirstName = new AFb1tSDK(valueOf());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.setUserFirstName;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @NonNull
    /* JADX INFO: renamed from: i */
    public final synchronized AFf1hSDK mo8753i() {
        try {
            if (this.f6871v == null) {
                AFf1jSDK aFf1jSDK = new AFf1jSDK(AFKeystoreWrapper());
                AFc1iSDK aFc1iSDKAFLogger = AFLogger();
                if (this.setCollectAndroidID == null) {
                    this.setCollectAndroidID = new AFc1eSDK();
                }
                AFf1kSDK aFf1kSDK = new AFf1kSDK(aFc1iSDKAFLogger, aFf1jSDK, this.setCollectAndroidID);
                AFf1nSDK aFf1nSDK = new AFf1nSDK();
                AFc1iSDK aFc1iSDKAFLogger2 = AFLogger();
                AFf1fSDK aFf1fSDKAppsFlyerLib = AppsFlyerLib();
                AFd1sSDK aFd1sSDKUnregisterClient = unregisterClient();
                if (this.setCollectAndroidID == null) {
                    this.setCollectAndroidID = new AFc1eSDK();
                }
                this.f6871v = new AFf1hSDK(aFf1nSDK, aFc1iSDKAFLogger2, aFf1fSDKAppsFlyerLib, aFf1jSDK, aFd1sSDKUnregisterClient, aFf1kSDK, this.setCollectAndroidID, afWarnLog());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f6871v;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @NonNull
    public final AFj1cSDK onPause() {
        if (this.setDebugLog == null) {
            this.setDebugLog = new AFj1eSDK();
        }
        return this.setDebugLog;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.appsflyer.internal.AFc1bSDK
    @NonNull
    public final synchronized AppsFlyerProperties registerClient() {
        try {
            if (this.afErrorLog == null) {
                this.afErrorLog = new AFa1vSDK(AFKeystoreWrapper());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.afErrorLog;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @NonNull
    public final AFc1eSDK setAndroidIdData() {
        if (this.setCollectAndroidID == null) {
            this.setCollectAndroidID = new AFc1eSDK();
        }
        return this.setCollectAndroidID;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @NonNull
    public final synchronized AFj1wSDK setAppInviteOneLink() {
        try {
            if (this.setResolveDeepLinkURLs == null) {
                this.setResolveDeepLinkURLs = new AFj1xSDK(new AFc1dSDK(new Function0() { // from class: com.appsflyer.internal.s
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return this.f7161a.AFLogger();
                    }
                }), new AFc1dSDK(new Function0() { // from class: com.appsflyer.internal.t
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return this.f7165a.enableTCFDataCollection();
                    }
                }));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.setResolveDeepLinkURLs;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @NonNull
    public final synchronized AFe1vSDK setCustomerUserId() {
        try {
            if (this.setAdditionalData == null) {
                this.setAdditionalData = new AFd1eSDK(AFKeystoreWrapper(), registerClient(), afWarnLog(), this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.setAdditionalData;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @NonNull
    public final AFh1wSDK setDebugLog() {
        if (this.setOutOfStore == null) {
            this.setOutOfStore = new AFh1tSDK(this);
        }
        return this.setOutOfStore;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final AFi1oSDK setImeiData() {
        try {
            if (this.setAppInviteOneLink == null) {
                try {
                    Object[] objArr = {AFLogger(), valueOf()};
                    Map map = AFi1nSDK.getSdkVersion;
                    Object declaredConstructor = map.get(-224518253);
                    if (declaredConstructor == null) {
                        declaredConstructor = ((Class) AFi1nSDK.AFKeystoreWrapper((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), ((Process.getThreadPriority(0) + 20) >> 6) + 37, (char) Drawable.resolveOpacity(0, 0))).getDeclaredConstructor(AFc1iSDK.class, AFd1zSDK.class);
                        map.put(-224518253, declaredConstructor);
                    }
                    this.setAppInviteOneLink = (AFi1oSDK) ((Constructor) declaredConstructor).newInstance(objArr);
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            AFLogger.INSTANCE.m8963e(LogTag.PLAY_INTEGRITY_API, th3.getMessage() != null ? th3.getMessage() : "", th3, false, false);
        }
        return this.setAppInviteOneLink;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @NonNull
    public final AFf1eSDK setOaidData() {
        if (this.clearUserPii == null) {
            Context context = this.f6868d.f6933d;
            if (context == null) {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
            if (this.setCollectAndroidID == null) {
                this.setCollectAndroidID = new AFc1eSDK();
            }
            AFg1zSDK aFg1zSDK = new AFg1zSDK(context, this.setCollectAndroidID);
            if (this.setCollectAndroidID == null) {
                this.setCollectAndroidID = new AFc1eSDK();
            }
            this.clearUserPii = new AFf1gSDK(aFg1zSDK, this.setCollectAndroidID);
        }
        return this.clearUserPii;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @NonNull
    public final AFb1aSDK setUserEmail() {
        if (this.setCollectAndroidID == null) {
            this.setCollectAndroidID = new AFc1eSDK();
        }
        return new AFc1tSDK(this.setCollectAndroidID, valueOf(), AppsFlyerLib());
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final AppsFlyerConversionListener setUserFirstName() {
        return this.setOneLinkCustomDomain;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final AFh1sSDK setUserLastName() {
        if (AFh1rSDK.unregisterClient() && this.getOutOfStore == null) {
            this.getOutOfStore = new AFh1oSDK(AFLogger(), afDebugLog());
        }
        return this.getOutOfStore;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @NonNull
    public final AFa1lSDK setUserPhone() {
        if (this.setUserFbLoginId == null) {
            this.setUserFbLoginId = new AFa1hSDK(AFKeystoreWrapper());
        }
        return this.setUserFbLoginId;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @NonNull
    public final AFi1tSDK stop() {
        if (this.setUserLastName == null) {
            this.setUserLastName = new AFi1qSDK();
        }
        return this.setUserLastName;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @NonNull
    public final AFd1sSDK unregisterClient() {
        AFd1xSDK outOfStore = getOutOfStore();
        AFc1iSDK aFc1iSDKAFLogger = AFLogger();
        AFd1jSDK level = getLevel();
        AFj1mSDK aFj1mSDKSendPushNotificationData = sendPushNotificationData();
        if (this.setDebugLog == null) {
            this.setDebugLog = new AFj1eSDK();
        }
        return new AFd1sSDK(outOfStore, aFc1iSDKAFLogger, level, aFj1mSDKSendPushNotificationData, this.setDebugLog, AppsFlyerLib());
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @NonNull
    public final AFb1bSDK updateServerUninstallToken() {
        if (this.setUserPhone == null) {
            this.setUserPhone = new AFb1cSDK(setOutOfStore(), enableTCFDataCollection());
        }
        return this.setUserPhone;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @NonNull
    /* JADX INFO: renamed from: v */
    public final synchronized PurchaseHandler mo8754v() {
        try {
            if (this.force == null) {
                this.force = new PurchaseHandler(this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.force;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @NonNull
    public final synchronized AFd1zSDK valueOf() {
        return this.f6868d;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @NonNull
    public final synchronized AFc1vSDK values() {
        try {
            if (this.onPause == null) {
                this.onPause = new AFc1uSDK(valueOf(), AFKeystoreWrapper());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.onPause;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @NonNull
    /* JADX INFO: renamed from: w */
    public final AFf1aSDK mo8755w() {
        AFc1aSDK aFc1aSDK;
        if (this.afWarnLog == null) {
            AFa1aSDK sdkVersion = getSdkVersion();
            AFi1aSDK aFi1aSDKAfDebugLog = afDebugLog();
            AFc1iSDK aFc1iSDKAFLogger = AFLogger();
            if (this.setCollectAndroidID == null) {
                this.setCollectAndroidID = new AFc1eSDK();
            }
            aFc1aSDK = this;
            aFc1aSDK.afWarnLog = new AFg1tSDK(aFc1aSDK, sdkVersion, aFi1aSDKAfDebugLog, aFc1iSDKAFLogger, this.setCollectAndroidID, valueOf(), force(), AppsFlyerLib(), registerClient(), clearUserPii());
        } else {
            aFc1aSDK = this;
        }
        return aFc1aSDK.afWarnLog;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final void registerClient(AppsFlyerConversionListener appsFlyerConversionListener) {
        this.setOneLinkCustomDomain = appsFlyerConversionListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Unit AFKeystoreWrapper(String str) {
        AFLogger.INSTANCE.m8960d(LogTag.EXCEPTION_MANAGER, str);
        return Unit.f29331a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void AFLogger(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        try {
            threadPoolExecutor.getQueue().put(runnable);
        } catch (InterruptedException e10) {
            AFLogger.INSTANCE.m8963e(LogTag.GENERAL, "Could not create executor for queue", e10, false, false);
            Thread.currentThread().interrupt();
        }
    }
}
