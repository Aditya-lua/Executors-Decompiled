package com.appsflyer.internal;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.sdk_base.referrer.Payload;
import com.appsflyer.sdk_base.referrer.Referrer;
import com.appsflyer.sdk_base.referrer.ReferrerProp;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1cSDK extends Referrer {
    private final AFc1bSDK AFKeystoreWrapper;
    final ProviderInfo registerClient;

    public AFi1cSDK(ProviderInfo providerInfo, ReferrerProp referrerProp, AFc1bSDK aFc1bSDK) {
        super(Payload.TYPE_AF_REFERRER, providerInfo.authority, referrerProp);
        this.AFKeystoreWrapper = aFc1bSDK;
        this.registerClient = providerInfo;
    }

    public static ContentProviderClient N_(Context context, Uri uri) {
        try {
            return context.getContentResolver().acquireUnstableContentProviderClient(uri);
        } catch (SecurityException e10) {
            AFLogger.INSTANCE.e(LogTag.PREINSTALL, "Failed to acquire unstable content providerClient due to SecurityException", e10, false, true, false);
            return null;
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(LogTag.PREINSTALL, "Failed to acquire unstable content providerClient due to unexpected throwable", th2, false, true, false);
            return null;
        }
    }

    @Override // com.appsflyer.sdk_base.referrer.Referrer
    public final void start(final Context context) {
        this.AFKeystoreWrapper.d().execute(new Runnable() { // from class: com.appsflyer.internal.AFi1cSDK.1
            @Override // java.lang.Runnable
            public final void run() {
                Cursor cursorQuery;
                AFi1cSDK.this.start();
                StringBuilder sb2 = new StringBuilder("content://");
                sb2.append(AFi1cSDK.this.registerClient.authority);
                sb2.append("/transaction_id");
                Uri uri = Uri.parse(sb2.toString());
                ContentProviderClient contentProviderClientN_ = AFi1cSDK.N_(context, uri);
                try {
                    if (contentProviderClientN_ != null) {
                        StringBuilder sb3 = new StringBuilder("app_id=");
                        sb3.append(context.getPackageName());
                        cursorQuery = contentProviderClientN_.query(uri, null, sb3.toString(), null, null);
                    } else {
                        cursorQuery = null;
                    }
                } catch (RemoteException e10) {
                    AFLogger.INSTANCE.e(LogTag.PREINSTALL, "Failed to query unstable content providerClient", e10, false, true, false);
                    cursorQuery = null;
                } catch (DeadObjectException e11) {
                    AFLogger.INSTANCE.e(LogTag.PREINSTALL, "Failed to acquire unstable content providerClient", e11, false, true, false);
                    cursorQuery = null;
                } catch (Throwable th2) {
                    AFLogger.INSTANCE.e(LogTag.PREINSTALL, "Error to get data from providerClient ", th2, false, true, false);
                    cursorQuery = null;
                } finally {
                    contentProviderClientN_.close();
                }
                if (cursorQuery != null) {
                    int columnIndex = cursorQuery.getColumnIndex("transaction_id");
                    if (columnIndex == -1) {
                        AFLogger.INSTANCE.w(LogTag.PREINSTALL, "Wrong column name");
                        AFi1cSDK.this.map.put(Payload.RESPONSE, Payload.RESPONSE_FEATURE_NOT_SUPPORTED);
                    } else {
                        AFi1cSDK.this.map.put(Payload.RESPONSE, Payload.RESPONSE_OK);
                        if (cursorQuery.moveToFirst()) {
                            String string = cursorQuery.getString(columnIndex);
                            cursorQuery.close();
                            if (string != null && !string.isEmpty()) {
                                AFi1cSDK.this.map.put(Payload.RFR, string);
                            }
                        }
                    }
                    cursorQuery.close();
                } else {
                    AFLogger.INSTANCE.w(LogTag.PREINSTALL, "ContentProvider query failed, got null Cursor");
                    AFi1cSDK.this.map.put(Payload.RESPONSE, Payload.RESPONSE_SERVICE_UNAVAILABLE);
                }
                AFi1cSDK aFi1cSDK = AFi1cSDK.this;
                aFi1cSDK.map.put(Payload.API, Long.valueOf(AFj1qSDK.unregisterClient(context, ((PackageItemInfo) aFi1cSDK.registerClient).packageName)));
                AFi1cSDK aFi1cSDK2 = AFi1cSDK.this;
                aFi1cSDK2.map.put(Payload.API_NAME, AFj1qSDK.AFKeystoreWrapper(context, ((PackageItemInfo) aFi1cSDK2.registerClient).packageName));
                AFi1cSDK.this.finish();
            }
        });
    }
}
