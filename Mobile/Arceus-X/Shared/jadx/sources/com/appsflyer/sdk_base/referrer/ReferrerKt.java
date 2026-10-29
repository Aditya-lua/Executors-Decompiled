package com.appsflyer.sdk_base.referrer;

import android.content.ComponentName;
import android.content.Context;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p229jt.C7347n;
import p229jt.C7348o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a/\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m31665d2 = {"Ljava/lang/Class;", "Lcom/appsflyer/sdk_base/referrer/BaseReferrerInitProvider;", "Landroid/content/Context;", "context", "Lcom/appsflyer/sdk_base/logger/AFLoggerBase;", "logger", "Ljt/n;", "", "disableInitProvider", "(Ljava/lang/Class;Landroid/content/Context;Lcom/appsflyer/sdk_base/logger/AFLoggerBase;)Ljava/lang/Object;", "sdk_base_release"}, m31666k = 2, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class ReferrerKt {
    @NotNull
    public static final Object disableInitProvider(@NotNull Class<? extends BaseReferrerInitProvider> cls, @NotNull Context context, @NotNull AFLoggerBase logger) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logger, "logger");
        try {
            C7347n.Companion companion = C7347n.INSTANCE;
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls), 2, 1);
            AFLoggerBase.d$default(logger, LogTag.RFR_INIT_PROVIDER, "Disabled provider: " + cls.getName(), false, 4, null);
            return C7347n.m30460b(Unit.f29331a);
        } catch (Throwable th2) {
            C7347n.Companion companion2 = C7347n.INSTANCE;
            return C7347n.m30460b(C7348o.m30469a(th2));
        }
    }
}
