package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.sdk_base.referrer.Payload;
import com.appsflyer.sdk_base.referrer.Referrer;
import com.appsflyer.sdk_base.referrer.ReferrerProp;
import kotlin.collections.C7690k0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7345l;
import p229jt.C7352s;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1iSDK extends Referrer {

    @Nullable
    private String AFKeystoreWrapper;

    /* JADX INFO: renamed from: d */
    @NotNull
    private final AFc1iSDK f7049d;

    @NotNull
    private final AFi1jSDK registerClient;

    @NotNull
    private final Runnable unregisterClient;

    public /* synthetic */ class AFa1ySDK {
        public static final /* synthetic */ int[] AFKeystoreWrapper;

        static {
            int[] iArr = new int[AFi1jSDK.values().length];
            try {
                iArr[AFi1jSDK.FACEBOOK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFi1jSDK.INSTAGRAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFi1jSDK.FACEBOOK_LITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            AFKeystoreWrapper = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AFi1iSDK(@NotNull AFc1iSDK aFc1iSDK, @NotNull AFi1jSDK aFi1jSDK, @NotNull ReferrerProp referrerProp, @NotNull Runnable runnable) {
        String str;
        Intrinsics.checkNotNullParameter(aFc1iSDK, "");
        Intrinsics.checkNotNullParameter(aFi1jSDK, "");
        Intrinsics.checkNotNullParameter(referrerProp, "");
        Intrinsics.checkNotNullParameter(runnable, "");
        int i10 = AFi1fSDK.AFa1tSDK.AFKeystoreWrapper[aFi1jSDK.ordinal()];
        if (i10 == 1) {
            str = Payload.SOURCE_FACEBOOK;
        } else if (i10 == 2) {
            str = Payload.SOURCE_INSTAGRAM;
        } else {
            if (i10 != 3) {
                throw new C7345l();
            }
            str = Payload.SOURCE_FACEBOOK_LITE;
        }
        super(Payload.TYPE_APP, str, referrerProp);
        this.f7049d = aFc1iSDK;
        this.registerClient = aFi1jSDK;
        this.unregisterClient = runnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:71:0x0222 A[PHI: r19
      0x0222: PHI (r19v3 android.content.ContentProviderClient) = 
      (r19v2 android.content.ContentProviderClient)
      (r19v4 android.content.ContentProviderClient)
      (r19v4 android.content.ContentProviderClient)
     binds: [B:80:0x0267, B:70:0x0220, B:75:0x0237] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x0234  */
    /* JADX WARN: Code duplicated, block: B:79:0x0264  */
    /* JADX INFO: renamed from: d */
    public static final void m8912d(AFi1iSDK aFi1iSDK, Context context) {
        Throwable th2;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient;
        Cursor cursor;
        Uri uri;
        String string;
        String str;
        aFi1iSDK.start();
        String str2 = aFi1iSDK.AFKeystoreWrapper;
        Intrinsics.checkNotNull(str2);
        try {
            AFi1jSDK aFi1jSDK = aFi1iSDK.registerClient;
            int[] iArr = AFa1ySDK.AFKeystoreWrapper;
            int i10 = iArr[aFi1jSDK.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        throw new C7345l();
                    }
                    if (context.getPackageManager().resolveContentProvider("com.facebook.lite.provider.InstallReferrerProvider", 0) != null) {
                        AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.META_REFERRER, "Found Facebook Lite content provider", false, 4, null);
                        uri = Uri.parse("content://com.facebook.lite.provider.InstallReferrerProvider/" + str2);
                    } else {
                        AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.META_REFERRER, "Facebook Lite content provider not found", false, 4, null);
                        uri = null;
                    }
                } else if (context.getPackageManager().resolveContentProvider("com.instagram.contentprovider.InstallReferrerProvider", 0) != null) {
                    AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.META_REFERRER, "Found Instagram content provider", false, 4, null);
                    uri = Uri.parse("content://com.instagram.contentprovider.InstallReferrerProvider/" + str2);
                } else {
                    AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.META_REFERRER, "Instagram content provider not found", false, 4, null);
                    uri = null;
                }
            } else if (context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.InstallReferrerProvider", 0) != null) {
                AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.META_REFERRER, "Found Facebook content provider", false, 4, null);
                uri = Uri.parse("content://com.facebook.katana.provider.InstallReferrerProvider/" + str2);
            } else {
                AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.META_REFERRER, "Facebook content provider not found", false, 4, null);
                uri = null;
            }
            if (uri != null) {
                contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uri);
                try {
                    Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient != null ? contentProviderClientAcquireUnstableContentProviderClient.query(uri, new String[]{"install_referrer", Payload.META_IS_CLICK_THROUGH_CUSTOM_KEY, "actual_timestamp"}, null, null, null) : null;
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                int columnIndex = cursorQuery.getColumnIndex("install_referrer");
                                if (columnIndex != -1) {
                                    string = cursorQuery.getString(columnIndex);
                                } else {
                                    AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.META_REFERRER, "No such column, " + aFi1iSDK.registerClient + " provider", false, 4, null);
                                    string = null;
                                }
                                if (string != null) {
                                    AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.META_REFERRER, "Collected " + aFi1iSDK.registerClient + " attribution data.", false, 4, null);
                                    aFi1iSDK.map.put(Payload.RESPONSE, Payload.RESPONSE_OK);
                                    aFi1iSDK.map.put(Payload.RFR, string);
                                    int columnIndex2 = cursorQuery.getColumnIndex("actual_timestamp");
                                    Long lValueOf = columnIndex2 != -1 ? Long.valueOf(cursorQuery.getLong(columnIndex2)) : null;
                                    if (lValueOf != null) {
                                        aFi1iSDK.map.put(Payload.CLICK_TS, Long.valueOf(lValueOf.longValue()));
                                    }
                                    int columnIndex3 = cursorQuery.getColumnIndex(Payload.META_IS_CLICK_THROUGH_CUSTOM_KEY);
                                    Integer numValueOf = columnIndex3 != -1 ? Integer.valueOf(cursorQuery.getInt(columnIndex3)) : null;
                                    if (numValueOf != null) {
                                        aFi1iSDK.map.put(Payload.META_CUSTOM, C7690k0.m31799n(C7352s.m30477a(Payload.META_IS_CLICK_THROUGH_CUSTOM_KEY, Integer.valueOf(numValueOf.intValue()))));
                                    }
                                    int i11 = iArr[aFi1iSDK.registerClient.ordinal()];
                                    if (i11 == 1) {
                                        str = "com.facebook.katana";
                                    } else if (i11 == 2) {
                                        str = "com.instagram.android";
                                    } else {
                                        if (i11 != 3) {
                                            throw new C7345l();
                                        }
                                        str = "com.facebook.lite";
                                    }
                                    aFi1iSDK.map.put(Payload.API, Long.valueOf(AFj1qSDK.unregisterClient(context, str)));
                                    aFi1iSDK.map.put(Payload.API_NAME, AFj1qSDK.AFKeystoreWrapper(context, str));
                                }
                                cursorQuery.close();
                                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                                    contentProviderClientAcquireUnstableContentProviderClient.close();
                                }
                            } else {
                                AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.META_REFERRER, "Content provider returned no data", false, 4, null);
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                                    contentProviderClientAcquireUnstableContentProviderClient.close();
                                }
                            }
                        } catch (Throwable th3) {
                            cursor = cursorQuery;
                            th2 = th3;
                            try {
                                AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.META_REFERRER, "Error while collecting Meta Install Referrer for " + aFi1iSDK.registerClient.name() + " provider", th2, false, false, false, false, 120, null);
                                if (cursor != null) {
                                    cursor.close();
                                }
                                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                                    contentProviderClientAcquireUnstableContentProviderClient.close();
                                }
                            } catch (Throwable th4) {
                                if (cursor != null) {
                                    cursor.close();
                                }
                                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                                    contentProviderClientAcquireUnstableContentProviderClient.close();
                                }
                                throw th4;
                            }
                        }
                    } else {
                        AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.META_REFERRER, "Content provider returned no data", false, 4, null);
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                            contentProviderClientAcquireUnstableContentProviderClient.close();
                        }
                    }
                } catch (Throwable th5) {
                    th2 = th5;
                    cursor = null;
                    AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.META_REFERRER, "Error while collecting Meta Install Referrer for " + aFi1iSDK.registerClient.name() + " provider", th2, false, false, false, false, 120, null);
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        contentProviderClientAcquireUnstableContentProviderClient.close();
                    }
                    aFi1iSDK.finish();
                    aFi1iSDK.unregisterClient.run();
                }
            }
        } catch (Throwable th6) {
            th2 = th6;
            contentProviderClientAcquireUnstableContentProviderClient = null;
        }
        aFi1iSDK.finish();
        aFi1iSDK.unregisterClient.run();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007e A[PHI: r0
      0x007e: PHI (r0v7 java.lang.String) = (r0v6 java.lang.String), (r0v24 java.lang.String), (r0v30 java.lang.String) binds: [B:10:0x002d, B:19:0x0054, B:28:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ae, code lost:
    
        if (r11.getPackageManager().resolveContentProvider("com.facebook.lite.provider.InstallReferrerProvider", 0) != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c1, code lost:
    
        if (r11.getPackageManager().resolveContentProvider("com.instagram.contentprovider.InstallReferrerProvider", 0) != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ce, code lost:
    
        if (r11.getPackageManager().resolveContentProvider("com.facebook.katana.provider.InstallReferrerProvider", 0) != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d0, code lost:
    
        getProp().getBackgroundExecutor().execute(new com.appsflyer.internal.RunnableC1795e1(r10, r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e0, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e1, code lost:
    
        com.appsflyer.sdk_base.logger.AFLoggerBase.d$default(com.appsflyer.AFLogger.INSTANCE, com.appsflyer.sdk_base.logger.LogTag.META_REFERRER, "Referrer collection disallowed by missing content providers.", false, 4, null);
     */
    @Override // com.appsflyer.sdk_base.referrer.Referrer
    @SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void start(@NotNull final Context context) {
        String str;
        Intrinsics.checkNotNullParameter(context, "");
        String strAFLogger = this.f7049d.AFLogger("com.facebook.sdk.ApplicationId");
        String strG0 = strAFLogger != null ? StringsKt.m32126G0(strAFLogger, "fb") : null;
        if (strG0 == null || strG0.length() == 0) {
            AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.META_REFERRER, "Facebook app id Manifest metadata is not found.", false, 4, null);
            strG0 = null;
        }
        if (strG0 == null) {
            String strAFKeystoreWrapper = this.f7049d.AFKeystoreWrapper("facebook_application_id");
            strG0 = strAFKeystoreWrapper != null ? StringsKt.m32126G0(strAFKeystoreWrapper, "fb") : null;
            if (strG0 == null || strG0.length() == 0) {
                AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.META_REFERRER, "Facebook app id string resource is not found.", false, 4, null);
                strG0 = null;
            }
            if (strG0 == null) {
                String strAFLogger2 = this.f7049d.AFLogger("com.appsflyer.FacebookApplicationId");
                strG0 = strAFLogger2 != null ? StringsKt.m32126G0(strAFLogger2, "fb") : null;
                if (strG0 == null || strG0.length() == 0) {
                    AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.META_REFERRER, "AF Facebook app id Manifest metadata is not found.", false, 4, null);
                    strG0 = null;
                }
                str = strG0 != null ? strG0 : null;
            }
        }
        this.AFKeystoreWrapper = str;
        if (str == null) {
            AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.META_REFERRER, "Referrer collection disallowed by missing Facebook app id.", false, 4, null);
        } else {
            int i10 = AFa1ySDK.AFKeystoreWrapper[this.registerClient.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        throw new C7345l();
                    }
                }
            }
        }
        this.unregisterClient.run();
    }
}
