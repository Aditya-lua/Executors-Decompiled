package or;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\" \u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Le3/m;", "", "a", "(Le3/m;)Ljava/lang/String;", "getResponseData$annotations", "(Le3/m;)V", "responseData", "ui_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class m1 {
    @Nullable
    public static final String a(@NotNull e3.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        try {
            if (mVar instanceof e3.j0) {
                return ((e3.j0) mVar).getCredentialJson();
            }
            if (!(mVar instanceof e3.i0)) {
                return null;
            }
            byte[] byteArray = mVar.getData().getByteArray("identityToken");
            String str = byteArray != null ? new String(byteArray, Charsets.UTF_8) : null;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("data", new JSONObject(str));
            return jSONObject.toString();
        } catch (Exception unused) {
            return null;
        }
    }
}
