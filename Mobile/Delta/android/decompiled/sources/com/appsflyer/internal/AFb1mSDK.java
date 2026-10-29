package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.util.ContentProviderFetcher;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class AFb1mSDK extends ContentProviderFetcher<String> {
    public AFb1mSDK(Context context, Executor executor) {
        super(context, AFLogger.INSTANCE, executor, "com.facebook.katana.provider.AttributionIdProvider", "E3F9E1E0CF99D0E56A055BA65E241B3399F7CEA524326B0CDD6EC1327ED0FDC1");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.appsflyer.sdk_base.util.ContentProviderFetcher
    /* JADX INFO: renamed from: AFKeystoreWrapper, reason: merged with bridge method [inline-methods] */
    public String query() throws Throwable {
        Cursor cursor = null;
        try {
            ContentResolver contentResolver = this.context.getContentResolver();
            StringBuilder sb2 = new StringBuilder("content://");
            sb2.append(this.authority);
            Cursor cursorQuery = contentResolver.query(Uri.parse(sb2.toString()), new String[]{"aid"}, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("aid"));
                        cursorQuery.close();
                        return string;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // com.appsflyer.sdk_base.util.ContentProviderFetcher
    public final /* synthetic */ String get() {
        start();
        return (String) super.get();
    }

    public final String registerClient() {
        start();
        return (String) super.get();
    }
}
