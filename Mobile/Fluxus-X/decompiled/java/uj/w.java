package uj;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p001kotlin.Metadata;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lorg/json/JSONObject;", BuildConfig.FLAVOR, "key", "a", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;", BuildConfig.FLAVOR, "condition", "Lkotlin/Function0;", "message", BuildConfig.FLAVOR, "b", "(ZLkotlin/jvm/functions/Function0;)V", "NativeShell_googleProdRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class w {
    @Nullable
    public static final String a(@NotNull JSONObject jSONObject, @NotNull String key) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (jSONObject.isNull(key)) {
            return null;
        }
        return jSONObject.getString(key);
    }

    public static final void b(boolean z10, @NotNull Function0<String> message) throws rj.h {
        Intrinsics.checkNotNullParameter(message, "message");
        if (!z10) {
            throw new rj.h(message.invoke());
        }
    }
}
