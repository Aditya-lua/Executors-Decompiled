package com.appsflyer.sdk_base.referrer;

import android.content.Context;
import android.util.Log;
import com.appsflyer.sdk_base.util.BaseInitProvider;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseReferrerInitProvider extends BaseInitProvider {
    public abstract ReferrerCreator<? extends Referrer> getCreator();

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            return false;
        }
        try {
            if (BaseInitProvider.isMainProcess(context)) {
                Log.d("Referrer_Init_Provider", "Registering external referrer: " + getCreator());
                Referrer.addExternalReferrers(new Pair(getCreator(), getClass()));
            }
        } catch (Throwable unused) {
        }
        return false;
    }
}
