package p294mj;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p222jj.C7183h;

/* JADX INFO: renamed from: mj.w */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m31665d2 = {"Lorg/json/JSONObject;", "", "key", "a", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;", "", "condition", "Lkotlin/Function0;", "message", "", "b", "(ZLkotlin/jvm/functions/Function0;)V", "NativeShell_googleProdRelease"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C8563w {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final String m34500a(@NotNull JSONObject jSONObject, @NotNull String key) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (jSONObject.isNull(key)) {
            return null;
        }
        return jSONObject.getString(key);
    }

    /* JADX INFO: renamed from: b */
    public static final void m34501b(boolean z10, @NotNull Function0<String> message) throws C7183h {
        Intrinsics.checkNotNullParameter(message, "message");
        if (!z10) {
            throw new C7183h(message.invoke());
        }
    }
}
