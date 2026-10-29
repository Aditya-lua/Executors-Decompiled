package gk;

import android.util.Log;
import com.appsflyer.sdk_base.referrer.Payload;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\u001a#\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\b\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\t\u001a!\u0010\u000b\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\f\u001a!\u0010\u000e\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000f\u001a!\u0010\u0011\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012\u001a#\u0010\u0013\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0013\u0010\u0006\u001a#\u0010\u0014\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0014\u0010\u0006\u001a\u001b\u0010\u0016\u001a\u00020\u0004*\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lorg/json/JSONObject;", "", "key", "value", "", "e", "(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V", "", "f", "(Lorg/json/JSONObject;Ljava/lang/String;Z)V", "", "b", "(Lorg/json/JSONObject;Ljava/lang/String;D)V", "", "c", "(Lorg/json/JSONObject;Ljava/lang/String;I)V", "", "d", "(Lorg/json/JSONObject;Ljava/lang/String;J)V", "h", "g", Payload.SOURCE, "a", "(Lorg/json/JSONObject;Lorg/json/JSONObject;)V", "utils_googleRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class n {
    public static final void a(@NotNull JSONObject jSONObject, @Nullable JSONObject jSONObject2) {
        Object objB;
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        if (jSONObject2 == null) {
            return;
        }
        try {
            jt.n.Companion companion = jt.n.INSTANCE;
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject.put(next, jSONObject2.get(next));
            }
            objB = jt.n.b(Unit.f22483a);
        } catch (Throwable th2) {
            jt.n.Companion companion2 = jt.n.INSTANCE;
            objB = jt.n.b(jt.o.a(th2));
        }
        Throwable thE = jt.n.e(objB);
        if (thE != null) {
            Log.e("JSONObjectUtils", "merge: ", thE);
        }
    }

    public static final void b(@NotNull JSONObject jSONObject, @NotNull String key, double d10) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            jSONObject.put(key, d10);
        } catch (JSONException e10) {
            Log.e("JSONObjectUtils", "safePut: ", e10);
        }
    }

    public static final void c(@NotNull JSONObject jSONObject, @NotNull String key, int i10) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            jSONObject.put(key, i10);
        } catch (JSONException e10) {
            Log.e("JSONObjectUtils", "safePut: ", e10);
        }
    }

    public static final void d(@NotNull JSONObject jSONObject, @NotNull String key, long j10) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            jSONObject.put(key, j10);
        } catch (JSONException e10) {
            Log.e("JSONObjectUtils", "safePut: ", e10);
        }
    }

    public static final void e(@NotNull JSONObject jSONObject, @NotNull String key, @Nullable String str) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            jSONObject.put(key, str);
        } catch (JSONException e10) {
            Log.e("JSONObjectUtils", "safePut: ", e10);
        }
    }

    public static final void f(@NotNull JSONObject jSONObject, @NotNull String key, boolean z10) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            jSONObject.put(key, z10);
        } catch (JSONException e10) {
            Log.e("JSONObjectUtils", "safePut: ", e10);
        }
    }

    public static final void g(@NotNull JSONObject jSONObject, @NotNull String key, @Nullable String str) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (str == null || str.length() == 0) {
            return;
        }
        e(jSONObject, key, str);
    }

    public static final void h(@NotNull JSONObject jSONObject, @NotNull String key, @Nullable String str) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (str != null) {
            e(jSONObject, key, str);
        }
    }
}
