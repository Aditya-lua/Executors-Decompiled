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
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1bSDK extends Referrer {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFi1bSDK(@NotNull ReferrerProp referrerProp) {
        super(Payload.TYPE_PRELOAD, Payload.SOURCE_SAMSUNG, referrerProp);
        Intrinsics.checkNotNullParameter(referrerProp, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:48:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:51:0x0111  */
    /* JADX WARN: Code duplicated, block: B:58:0x012a  */
    /* JADX WARN: Code duplicated, block: B:60:0x012f  */
    public static final void AFKeystoreWrapper(AFi1bSDK aFi1bSDK, Context context) {
        Throwable th2;
        ContentProviderClient contentProviderClient;
        Cursor cursorQuery;
        boolean z10;
        Date dateUnregisterClient;
        aFi1bSDK.start();
        Cursor cursor = null;
        lValueOf = null;
        Long lValueOf = null;
        cursor = null;
        try {
            Uri uri = Uri.parse("content://com.samsung.android.mapsagent.providers.apptracking/info");
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uri);
            if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                try {
                    cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, context.getPackageName(), new String[]{"appsflyer001"}, null);
                } catch (Throwable th3) {
                    th2 = th3;
                    contentProviderClient = contentProviderClientAcquireUnstableContentProviderClient;
                    try {
                        AFLogger.INSTANCE.e(LogTag.SAMSUNG_PRELOAD_REFERRER, "Error while collecting referrer data", th2, false, false, true, true);
                        if (cursor != null) {
                            cursor.close();
                        }
                        if (contentProviderClient != null) {
                            contentProviderClient.close();
                        }
                        aFi1bSDK.finish();
                    } catch (Throwable th4) {
                        if (cursor != null) {
                            cursor.close();
                        }
                        if (contentProviderClient == null) {
                            throw th4;
                        }
                        contentProviderClient.close();
                        throw th4;
                    }
                }
            } else {
                cursorQuery = null;
            }
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        int columnIndex = cursorQuery.getColumnIndex("RESULT");
                        if (columnIndex != -1) {
                            z10 = Boolean.parseBoolean(cursorQuery.getString(columnIndex));
                        } else {
                            AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.SAMSUNG_PRELOAD_REFERRER, "No such column", false, 4, null);
                            z10 = false;
                        }
                        if (z10) {
                            String strY_ = AFj1pSDK.Y_(cursorQuery, "INSTALLED_TIME_TEXT");
                            if (strY_ != null && (dateUnregisterClient = AFj1rSDK.unregisterClient(strY_, "yy:MM:dd:hh:mm")) != null) {
                                lValueOf = Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(dateUnregisterClient.getTime()));
                            }
                            if (lValueOf != null) {
                                aFi1bSDK.map.put(Payload.INSTALL_BEGIN_TS, Long.valueOf(lValueOf.longValue()));
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            String strY_2 = AFj1pSDK.Y_(cursorQuery, "MAPS_ID");
                            if (strY_2 != null) {
                                linkedHashMap.put(Payload.MAPS_ID, strY_2);
                            }
                            String strY_3 = AFj1pSDK.Y_(cursorQuery, "DEVICE_NAME");
                            if (strY_3 != null) {
                                linkedHashMap.put(Payload.DEVICE_MODEL, strY_3);
                            }
                            String strY_4 = AFj1pSDK.Y_(cursorQuery, "COUNTRY");
                            if (strY_4 != null) {
                                linkedHashMap.put("country", strY_4);
                            }
                            String strY_5 = AFj1pSDK.Y_(cursorQuery, "CAMPAIGN_ID");
                            if (strY_5 != null) {
                                linkedHashMap.put(Payload.CAMPAIGN_ID, strY_5);
                            }
                            if (!linkedHashMap.isEmpty()) {
                                aFi1bSDK.map.put(Payload.SAMSUNG_CUSTOM, linkedHashMap);
                            }
                            aFi1bSDK.map.put(Payload.API, Long.valueOf(AFj1qSDK.unregisterClient(context, "com.samsung.android.mapsagent")));
                            aFi1bSDK.map.put(Payload.API_NAME, AFj1qSDK.AFKeystoreWrapper(context, "com.samsung.android.mapsagent"));
                        } else {
                            AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.SAMSUNG_PRELOAD_REFERRER, "App was not installed via Samsung MAPS.", false, 4, null);
                        }
                        cursorQuery.close();
                        if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                            contentProviderClientAcquireUnstableContentProviderClient.close();
                        }
                    } else {
                        AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.SAMSUNG_PRELOAD_REFERRER, "Content provider returned no data", false, 4, null);
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                            contentProviderClientAcquireUnstableContentProviderClient.close();
                        }
                    }
                } catch (Throwable th5) {
                    th2 = th5;
                    cursor = cursorQuery;
                    contentProviderClient = contentProviderClientAcquireUnstableContentProviderClient;
                    AFLogger.INSTANCE.e(LogTag.SAMSUNG_PRELOAD_REFERRER, "Error while collecting referrer data", th2, false, false, true, true);
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (contentProviderClient != null) {
                        contentProviderClient.close();
                    }
                }
            } else {
                AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.SAMSUNG_PRELOAD_REFERRER, "Content provider returned no data", false, 4, null);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                    contentProviderClientAcquireUnstableContentProviderClient.close();
                }
            }
        } catch (Throwable th6) {
            th2 = th6;
            contentProviderClient = null;
        }
        aFi1bSDK.finish();
    }

    @Override // com.appsflyer.sdk_base.referrer.Referrer
    public final void addLatency() {
    }

    @Override // com.appsflyer.sdk_base.referrer.Referrer
    @SuppressLint({"NewApi"})
    public final void start(@NotNull final Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (context.getPackageManager().resolveContentProvider("com.samsung.android.mapsagent.providers.apptracking", 0) != null) {
            getProp().getBackgroundExecutor().execute(new Runnable() { // from class: com.appsflyer.internal.a1
                @Override // java.lang.Runnable
                public final void run() {
                    AFi1bSDK.AFKeystoreWrapper(this.f5473a, context);
                }
            });
        } else {
            AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.SAMSUNG_PRELOAD_REFERRER, "Referrer collection disallowed by missing content provider.", false, 4, null);
        }
    }
}
