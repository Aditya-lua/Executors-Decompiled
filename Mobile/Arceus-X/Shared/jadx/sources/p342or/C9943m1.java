package p342or;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p092e3.AbstractC4773m;
import p092e3.C4766i0;
import p092e3.C4768j0;

/* JADX INFO: renamed from: or.m1 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\" \u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, m31665d2 = {"Le3/m;", "", "a", "(Le3/m;)Ljava/lang/String;", "getResponseData$annotations", "(Le3/m;)V", "responseData", "ui_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C9943m1 {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final String m38763a(@NotNull AbstractC4773m abstractC4773m) {
        Intrinsics.checkNotNullParameter(abstractC4773m, "<this>");
        try {
            if (abstractC4773m instanceof C4768j0) {
                return ((C4768j0) abstractC4773m).getCredentialJson();
            }
            if (!(abstractC4773m instanceof C4766i0)) {
                return null;
            }
            byte[] byteArray = abstractC4773m.getData().getByteArray("identityToken");
            String str = byteArray != null ? new String(byteArray, Charsets.UTF_8) : null;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("data", new JSONObject(str));
            return jSONObject.toString();
        } catch (Exception unused) {
            return null;
        }
    }
}
