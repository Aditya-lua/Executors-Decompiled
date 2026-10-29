package com.appsflyer.internal;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFb1tSDK implements AFa1aSDK {
    private boolean AFKeystoreWrapper;

    @Nullable
    Map<String, Object> AFLogger;

    /* JADX INFO: renamed from: d */
    @NotNull
    private final AFd1zSDK f6866d;

    public static final class AFa1uSDK implements AFa1cSDK.AFa1tSDK {
        private /* synthetic */ long unregisterClient;

        public AFa1uSDK(long j10) {
            this.unregisterClient = j10;
        }

        @Override // com.appsflyer.internal.AFa1cSDK.AFa1tSDK
        public final void AFKeystoreWrapper(String str) {
            Map<String, Object> map = AFb1tSDK.this.AFLogger;
            if (map != null) {
                map.put("error", str);
            }
        }

        @Override // com.appsflyer.internal.AFa1cSDK.AFa1tSDK
        public final void AFLogger(String str, String str2, String str3) {
            Map<String, Object> map;
            if (str != null) {
                AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.META_REFERRER, "Facebook Deferred AppLink data received: " + str, false, 4, null);
                Map<String, Object> map2 = AFb1tSDK.this.AFLogger;
                if (map2 != null) {
                    map2.put("link", str);
                }
                if (str2 != null && (map = AFb1tSDK.this.AFLogger) != null) {
                    map.put("target_url", str2);
                }
                if (str3 != null) {
                    AFb1tSDK aFb1tSDK = AFb1tSDK.this;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put("promo_code", str3);
                    linkedHashMap.put("deeplink_context", linkedHashMap2);
                    Map<String, Object> map3 = aFb1tSDK.AFLogger;
                    if (map3 != null) {
                        map3.put("extras", linkedHashMap);
                    }
                }
            } else {
                Map<String, Object> map4 = AFb1tSDK.this.AFLogger;
                if (map4 != null) {
                    map4.put("link", "");
                }
            }
            String strValueOf = String.valueOf(System.currentTimeMillis() - this.unregisterClient);
            Map<String, Object> map5 = AFb1tSDK.this.AFLogger;
            if (map5 != null) {
                map5.put("ttr", strValueOf);
            }
        }
    }

    public AFb1tSDK(@NotNull AFd1zSDK aFd1zSDK) {
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        this.f6866d = aFd1zSDK;
    }

    @Override // com.appsflyer.internal.AFa1aSDK
    public final void AFLogger(boolean z10) {
        this.AFKeystoreWrapper = z10;
    }

    @Override // com.appsflyer.internal.AFa1aSDK
    @Nullable
    /* JADX INFO: renamed from: d */
    public final Map<String, Object> mo8701d() {
        return this.AFLogger;
    }

    @Override // com.appsflyer.internal.AFa1aSDK
    public final boolean registerClient() {
        if (!this.AFKeystoreWrapper) {
            return false;
        }
        Map<String, Object> map = this.AFLogger;
        return map == null || map.isEmpty();
    }

    @Override // com.appsflyer.internal.AFa1aSDK
    public final void unregisterClient() {
        Context context;
        if (this.AFKeystoreWrapper && (context = this.f6866d.f6933d) != null) {
            this.AFLogger = new LinkedHashMap();
            AFa1uSDK aFa1uSDK = new AFa1uSDK(System.currentTimeMillis());
            try {
                Class.forName("com.facebook.FacebookSdk").getMethod("sdkInitialize", Context.class).invoke(null, context);
                Class<?> cls = Class.forName("com.facebook.applinks.AppLinkData");
                Class<?> cls2 = Class.forName("com.facebook.applinks.AppLinkData$CompletionHandler");
                Method method = cls.getMethod("fetchDeferredAppLinkData", Context.class, String.class, cls2);
                Object objNewProxyInstance = Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new InvocationHandler() { // from class: com.appsflyer.internal.AFa1cSDK.5

                    /* JADX INFO: renamed from: d */
                    private /* synthetic */ AFa1tSDK f6843d;
                    private /* synthetic */ Class unregisterClient;

                    public C17695() {
                        cls = cls;
                        aFa1tSDK = aFa1uSDK;
                    }

                    @Override // java.lang.reflect.InvocationHandler
                    public final Object invoke(Object obj, Method method2, Object[] objArr) {
                        String string;
                        String string2;
                        String string3;
                        Bundle bundle;
                        if (!method2.getName().equals("onDeferredAppLinkDataFetched")) {
                            AFa1tSDK aFa1tSDK = aFa1tSDK;
                            if (aFa1tSDK != null) {
                                aFa1tSDK.AFKeystoreWrapper("onDeferredAppLinkDataFetched invocation failed");
                            }
                            return null;
                        }
                        Object obj2 = objArr[0];
                        if (obj2 != null) {
                            Bundle bundle2 = (Bundle) Bundle.class.cast(cls.getMethod("getArgumentBundle", null).invoke(cls.cast(obj2), null));
                            if (bundle2 != null) {
                                string2 = bundle2.getString("com.facebook.platform.APPLINK_NATIVE_URL");
                                string3 = bundle2.getString("target_url");
                                Bundle bundle3 = bundle2.getBundle("extras");
                                string = (bundle3 == null || (bundle = bundle3.getBundle("deeplink_context")) == null) ? null : bundle.getString("promo_code");
                            } else {
                                string = null;
                                string2 = null;
                                string3 = null;
                            }
                            AFa1tSDK aFa1tSDK2 = aFa1tSDK;
                            if (aFa1tSDK2 != null) {
                                aFa1tSDK2.AFLogger(string2, string3, string);
                            }
                        } else {
                            AFa1tSDK aFa1tSDK3 = aFa1tSDK;
                            if (aFa1tSDK3 != null) {
                                aFa1tSDK3.AFLogger(null, null, null);
                            }
                        }
                        return null;
                    }
                });
                String string = context.getString(context.getResources().getIdentifier("facebook_app_id", InquiryField.StringField.TYPE, context.getPackageName()));
                if (TextUtils.isEmpty(string)) {
                    aFa1uSDK.AFKeystoreWrapper("Facebook app id not defined in resources");
                } else {
                    method.invoke(null, context, string, objNewProxyInstance);
                }
            } catch (ClassNotFoundException e10) {
                AFLogger.INSTANCE.m8963e(LogTag.META_REFERRER, "FB class missing error", e10, false, false);
                aFa1uSDK.AFKeystoreWrapper(e10.toString());
            } catch (IllegalAccessException e11) {
                AFLogger.INSTANCE.m8963e(LogTag.META_REFERRER, "FB illegal access", e11, false, false);
                aFa1uSDK.AFKeystoreWrapper(e11.toString());
            } catch (NoSuchMethodException e12) {
                AFLogger.INSTANCE.m8963e(LogTag.META_REFERRER, "FB method missing error", e12, false, false);
                aFa1uSDK.AFKeystoreWrapper(e12.toString());
            } catch (InvocationTargetException e13) {
                AFLogger.INSTANCE.m8963e(LogTag.META_REFERRER, "FB invocation error", e13, false, false);
                aFa1uSDK.AFKeystoreWrapper(e13.toString());
            }
        }
    }
}
