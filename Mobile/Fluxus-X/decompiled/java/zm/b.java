package zm;

import com.github.luben.zstd.BuildConfig;
import com.roblox.engine.jni.autovalue.RobloxTelemetryEvent;
import com.roblox.engine.jni.autovalue.RobloxTelemetryEventConfig;
import com.roblox.engine.jni.autovalue.RobloxTelemetryEventData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Pair;
import p001kotlin.collections.o;
import p001kotlin.collections.q;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {BuildConfig.FLAVOR, "eventName", BuildConfig.FLAVOR, "Lkotlin/Pair;", "customFields", BuildConfig.FLAVOR, "throttlingHundredthPercentage", "Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent;", "a", "(Ljava/lang/String;Ljava/util/List;I)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent;", "universalapp_googleProdRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {
    @NotNull
    public static final RobloxTelemetryEvent a(@NotNull String eventName, @NotNull List<Pair<String, String>> customFields, int i10) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(customFields, "customFields");
        List<String> listD = o.d(RobloxTelemetryEventConfig.EVENT_INGEST_BACKEND);
        List<String> listD2 = o.d(RobloxTelemetryEventData.STANDARDIZED_FIELD_KEY_ADD_OS_INFO);
        List<Pair<String, String>> list = customFields;
        ArrayList arrayList = new ArrayList(q.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            arrayList.add(android.util.Pair.create((String) pair.a(), (String) pair.b()));
        }
        RobloxTelemetryEvent robloxTelemetryEventB = RobloxTelemetryEvent.builder().e(RobloxTelemetryEvent.ROBLOX_TELEMETRY_EVENT_TYPE).c(RobloxTelemetryEventConfig.builder().c(listD).e(i10).d(eventName).b()).d(RobloxTelemetryEventData.builder().d(listD2).c(arrayList).b()).b();
        Intrinsics.checkNotNullExpressionValue(robloxTelemetryEventB, "build(...)");
        return robloxTelemetryEventB;
    }
}
