package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.sdk_base.referrer.BaseReferrerInitProvider;
import com.appsflyer.sdk_base.referrer.Referrer;
import com.appsflyer.sdk_base.referrer.ReferrerCreator;
import com.appsflyer.sdk_base.referrer.ReferrerProp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.C7701q;
import kotlin.jvm.internal.C7731d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1eSDK implements AFi1hSDK {
    @Override // com.appsflyer.internal.AFi1hSDK
    @NotNull
    public final List<Referrer> AFKeystoreWrapper(@NotNull ReferrerProp referrerProp) {
        Intrinsics.checkNotNullParameter(referrerProp, "");
        Set<Pair<ReferrerCreator<Referrer>, Class<? extends BaseReferrerInitProvider>>> externalReferrers = Referrer.INSTANCE.getExternalReferrers();
        ArrayList arrayList = new ArrayList(C7701q.m31905u(externalReferrers, 10));
        Iterator<T> it = externalReferrers.iterator();
        while (it.hasNext()) {
            Referrer referrerCreate = ((ReferrerCreator) ((Pair) it.next()).m31673c()).create(referrerProp);
            AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.REFERRER, "External Referrer object created: " + C7731d0.m32002b(referrerCreate.getClass()).mo28427g(), false, 4, null);
            arrayList.add(referrerCreate);
        }
        return arrayList;
    }
}
