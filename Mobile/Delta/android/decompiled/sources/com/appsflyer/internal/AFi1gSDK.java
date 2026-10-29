package com.appsflyer.internal;

import android.content.Context;
import android.os.Process;
import androidx.annotation.NonNull;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.sdk_base.referrer.Payload;
import com.appsflyer.sdk_base.referrer.Referrer;
import com.appsflyer.sdk_base.referrer.ReferrerProp;
import com.roblox.client.personasdk.BuildConfig;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public class AFi1gSDK extends Referrer {

    @NonNull
    final ExecutorService AFLogger;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFi1gSDK$2, reason: invalid class name */
    public class AnonymousClass2 implements InstallReferrerStateListener {
        final /* synthetic */ Context val$context;
        final /* synthetic */ InstallReferrerClient val$referrerClient;

        public AnonymousClass2(InstallReferrerClient installReferrerClient, Context context) {
            this.val$referrerClient = installReferrerClient;
            this.val$context = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onInstallReferrerSetupFinished$0(InstallReferrerClient installReferrerClient, Context context, int i10) {
            AFi1gSDK.this.AFLogger(installReferrerClient, context, i10);
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public final void onInstallReferrerServiceDisconnected() {
            AFLogger.INSTANCE.d(LogTag.REFERRER, "Install Referrer service disconnected");
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public final void onInstallReferrerSetupFinished(final int i10) {
            ExecutorService executorService = AFi1gSDK.this.AFLogger;
            final InstallReferrerClient installReferrerClient = this.val$referrerClient;
            final Context context = this.val$context;
            executorService.execute(new Runnable() { // from class: com.appsflyer.internal.d1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f5479a.lambda$onInstallReferrerSetupFinished$0(installReferrerClient, context, i10);
                }
            });
        }
    }

    public AFi1gSDK(@NonNull ReferrerProp referrerProp) {
        super(Payload.TYPE_STORE, "google", referrerProp);
        this.AFLogger = referrerProp.getBackgroundExecutor();
    }

    private static boolean AFLogger(@NonNull Context context) {
        try {
            int iCheckPermission = context.checkPermission("com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE", Process.myPid(), Process.myUid());
            AFLogger aFLogger = AFLogger.INSTANCE;
            LogTag logTag = LogTag.GENERAL;
            StringBuilder sb2 = new StringBuilder("is Permission Available: ");
            sb2.append("com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE");
            sb2.append("; res: ");
            sb2.append(iCheckPermission);
            aFLogger.v(logTag, sb2.toString());
            if (iCheckPermission == 0) {
                aFLogger.d(LogTag.REFERRER, "Install referrer is allowed");
                return true;
            }
            aFLogger.d(LogTag.REFERRER, "Install referrer is not allowed");
            return false;
        } catch (ClassNotFoundException e10) {
            AFLogger aFLogger2 = AFLogger.INSTANCE;
            LogTag logTag2 = LogTag.REFERRER;
            aFLogger2.e(logTag2, "InstallReferrerClient not found", e10, false, false);
            StringBuilder sb3 = new StringBuilder("Class ");
            sb3.append("com.android.installreferrer.api.InstallReferrerClient");
            sb3.append(" not found");
            aFLogger2.v(logTag2, sb3.toString());
            return false;
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(LogTag.REFERRER, "An error occurred while trying to verify manifest : ".concat("com.android.installreferrer.api.InstallReferrerClient"), th2);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void registerClient(Context context) {
        start();
        try {
            InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(context).build();
            AFLogger.INSTANCE.d(LogTag.REFERRER, "Connecting to Install Referrer Library...");
            installReferrerClientBuild.startConnection(new AnonymousClass2(installReferrerClientBuild, context));
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(LogTag.REFERRER, "referrerClient -> startConnection", th2);
        }
    }

    @Override // com.appsflyer.sdk_base.referrer.Referrer
    public void start(@NonNull final Context context) {
        if (AFLogger(context)) {
            this.AFLogger.execute(new Runnable() { // from class: com.appsflyer.internal.c1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f5477a.registerClient(context);
                }
            });
        }
    }

    public final void AFLogger(InstallReferrerClient installReferrerClient, Context context, int i10) {
        Pair<Long, String> pairD = AFj1qSDK.d(context, BuildConfig.STORE_PACKAGE);
        this.map.put(Payload.API, pairD.c());
        this.map.put(Payload.API_NAME, pairD.d());
        if (i10 == -1) {
            AFLogger.INSTANCE.w(LogTag.REFERRER, "InstallReferrer SERVICE_DISCONNECTED");
            this.map.put(Payload.RESPONSE, Payload.RESPONSE_SERVICE_DISCONNECTED);
        } else if (i10 == 0) {
            this.map.put(Payload.RESPONSE, Payload.RESPONSE_OK);
            try {
                AFLogger aFLogger = AFLogger.INSTANCE;
                LogTag logTag = LogTag.REFERRER;
                aFLogger.d(logTag, "InstallReferrer connected");
                if (installReferrerClient.isReady()) {
                    ReferrerDetails installReferrer = installReferrerClient.getInstallReferrer();
                    String installReferrer2 = installReferrer.getInstallReferrer();
                    if (installReferrer2 != null) {
                        this.map.put(Payload.RFR, installReferrer2);
                    }
                    this.map.put(Payload.CLICK_TS, Long.valueOf(installReferrer.getReferrerClickTimestampSeconds()));
                    this.map.put(Payload.INSTALL_BEGIN_TS, Long.valueOf(installReferrer.getInstallBeginTimestampSeconds()));
                    HashMap map = new HashMap();
                    try {
                        map.put(Payload.INSTANT, Boolean.valueOf(installReferrer.getGooglePlayInstantParam()));
                    } catch (NoSuchMethodError e10) {
                        AFLogger.INSTANCE.e(LogTag.REFERRER, "getGooglePlayInstantParam not exist", e10, false, false);
                    }
                    try {
                        map.put(Payload.CLICK_SERVER_TS, Long.valueOf(installReferrer.getReferrerClickTimestampServerSeconds()));
                        map.put(Payload.INSTALL_BEGIN_SERVER_TS, Long.valueOf(installReferrer.getInstallBeginTimestampServerSeconds()));
                        map.put(Payload.INSTALL_VERSION, installReferrer.getInstallVersion());
                    } catch (NoSuchMethodError e11) {
                        AFLogger.INSTANCE.e(LogTag.REFERRER, "some method not exist", e11, false, false);
                    }
                    if (!map.isEmpty()) {
                        this.map.put(Payload.GOOGLE_CUSTOM, map);
                    }
                    installReferrerClient.endConnection();
                } else {
                    aFLogger.w(logTag, "ReferrerClient: InstallReferrer is not ready");
                }
            } catch (Throwable th2) {
                AFLogger aFLogger2 = AFLogger.INSTANCE;
                LogTag logTag2 = LogTag.REFERRER;
                StringBuilder sb2 = new StringBuilder("Failed to get install referrer: ");
                sb2.append(th2.getMessage());
                aFLogger2.w(logTag2, sb2.toString());
                aFLogger2.e(logTag2, "Failed to get install referrer", th2, false, false);
            }
        } else if (i10 == 1) {
            this.map.put(Payload.RESPONSE, Payload.RESPONSE_SERVICE_UNAVAILABLE);
            AFLogger.INSTANCE.w(LogTag.REFERRER, "InstallReferrer not supported");
        } else if (i10 == 2) {
            AFLogger.INSTANCE.w(LogTag.REFERRER, "InstallReferrer FEATURE_NOT_SUPPORTED");
            this.map.put(Payload.RESPONSE, Payload.RESPONSE_FEATURE_NOT_SUPPORTED);
        } else if (i10 != 3) {
            AFLogger.INSTANCE.w(LogTag.REFERRER, "responseCode not found.");
        } else {
            AFLogger.INSTANCE.w(LogTag.REFERRER, "InstallReferrer DEVELOPER_ERROR");
            this.map.put(Payload.RESPONSE, Payload.RESPONSE_DEVELOPER_ERROR);
        }
        AFLogger.INSTANCE.d(LogTag.REFERRER, "Install Referrer collected locally");
        finish();
    }
}
