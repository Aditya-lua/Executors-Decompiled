package com.appsflyer.sdk_base.referrer;

import com.appsflyer.sdk_base.referrer.Referrer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0003J\u0015\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0006H&¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m31665d2 = {"Lcom/appsflyer/sdk_base/referrer/ReferrerCreator;", "RFR", "Lcom/appsflyer/sdk_base/referrer/Referrer;", "", "create", "prop", "Lcom/appsflyer/sdk_base/referrer/ReferrerProp;", "(Lcom/appsflyer/sdk_base/referrer/ReferrerProp;)Lcom/appsflyer/sdk_base/referrer/Referrer;", "sdk_base_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public interface ReferrerCreator<RFR extends Referrer> {
    @NotNull
    RFR create(@NotNull ReferrerProp prop);
}
