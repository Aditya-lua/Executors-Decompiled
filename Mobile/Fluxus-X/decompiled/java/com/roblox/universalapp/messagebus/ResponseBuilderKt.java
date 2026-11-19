package com.roblox.universalapp.messagebus;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0007"}, d2 = {"Lkotlin/Function1;", "Lorg/json/JSONObject;", BuildConfig.FLAVOR, "block", "Lcom/roblox/universalapp/messagebus/Response;", "buildResponse", "(Lkotlin/jvm/functions/Function1;)Lcom/roblox/universalapp/messagebus/Response;", "universalapp_googleProdRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class ResponseBuilderKt {
    @NotNull
    public static final Response buildResponse(@NotNull Function1<? super JSONObject, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Response response = new Response();
        JSONObject jSONObject = new JSONObject();
        block.invoke(jSONObject);
        response.params = jSONObject;
        return response;
    }
}
