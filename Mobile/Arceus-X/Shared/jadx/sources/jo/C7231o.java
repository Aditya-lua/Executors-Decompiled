package jo;

import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C7797x;

/* JADX INFO: renamed from: jo.o */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a5\u0010\u0006\u001a\u0004\u0018\u00010\u0002*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31665d2 = {"", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$LocalizationOverride;", "", "countryCode", "idClass", "page", "b", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "government-id_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7231o {
    /* JADX INFO: renamed from: b */
    public static final String m30182b(List<NextStep.GovernmentId.LocalizationOverride> list, String str, String str2, String str3) {
        Object next;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            NextStep.GovernmentId.LocalizationOverride localizationOverride = (NextStep.GovernmentId.LocalizationOverride) next;
            if (C7797x.m32294E(localizationOverride.getCountryCode(), str, true) && Intrinsics.m31980c(localizationOverride.getPage(), str3) && (Intrinsics.m31980c(localizationOverride.getIdClass(), str2) || localizationOverride.getIdClass() == null)) {
                if (Intrinsics.m31980c(localizationOverride.getKey(), str2)) {
                    break;
                }
            }
        }
        NextStep.GovernmentId.LocalizationOverride localizationOverride2 = (NextStep.GovernmentId.LocalizationOverride) next;
        if (localizationOverride2 != null) {
            return localizationOverride2.getText();
        }
        return null;
    }
}
