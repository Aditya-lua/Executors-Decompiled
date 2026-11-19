package bn;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p001kotlin.Metadata;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lbn/s;", BuildConfig.FLAVOR, "<init>", "()V", "Lkotlin/Function0;", BuildConfig.FLAVOR, "isEnabled", "Lorg/json/JSONObject;", "a", "(Lkotlin/jvm/functions/Function0;)Lorg/json/JSONObject;", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final s f4495a = new s();

    @NotNull
    public static final JSONObject a(@NotNull Function0<Boolean> isEnabled) throws JSONException {
        Intrinsics.checkNotNullParameter(isEnabled, "isEnabled");
        JSONObject jSONObjectPut = new JSONObject().put("enabled", isEnabled.invoke().booleanValue());
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "put(...)");
        return jSONObjectPut;
    }
}
