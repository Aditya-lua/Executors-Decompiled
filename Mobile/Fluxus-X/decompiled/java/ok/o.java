package ok;

import android.util.Log;
import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lorg/json/JSONObject;", Payload.SOURCE, BuildConfig.FLAVOR, "a", "(Lorg/json/JSONObject;Lorg/json/JSONObject;)V", "utils_googleRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class o {
    public static final void a(@NotNull JSONObject jSONObject, @Nullable JSONObject jSONObject2) {
        Object objB;
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        if (jSONObject2 == null) {
            return;
        }
        try {
            zt.n.Companion companion = zt.n.INSTANCE;
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject.put(next, jSONObject2.get(next));
            }
            objB = zt.n.b(Unit.f21506a);
        } catch (Throwable th2) {
            zt.n.Companion companion2 = zt.n.INSTANCE;
            objB = zt.n.b(zt.o.a(th2));
        }
        Throwable thE = zt.n.e(objB);
        if (thE != null) {
            Log.e("JSONObjectUtils", "merge: ", thE);
        }
    }
}
