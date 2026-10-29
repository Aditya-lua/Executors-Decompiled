package com.appsflyer.sdk_base.util;

import android.content.Context;
import android.util.Log;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H$J\b\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m31665d2 = {"Lcom/appsflyer/sdk_base/util/BaseOptionalFeatureInitProvider;", "Lcom/appsflyer/sdk_base/util/BaseInitProvider;", "<init>", "()V", "getFeature", "Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;", "onCreate", "", "sdk_base_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public abstract class BaseOptionalFeatureInitProvider extends BaseInitProvider {
    @NotNull
    public abstract SupportedOptionalFeatures getFeature();

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            return false;
        }
        try {
            if (BaseInitProvider.INSTANCE.isMainProcess(context)) {
                SupportedOptionalFeatures feature = getFeature();
                Log.d("Init_Provider", "Registering optional feature: " + feature);
                OptionalFeaturesValidator.INSTANCE.addOptionalFeature(feature);
            }
        } catch (Throwable unused) {
        }
        return false;
    }
}
