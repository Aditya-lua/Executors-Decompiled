package pm;

import android.app.Activity;
import android.util.Log;
import com.github.luben.zstd.BuildConfig;
import com.google.android.gms.tasks.Task;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p001kotlin.Metadata;
import p001kotlin.Pair;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.x;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00122\u00020\u0001:\u0002\u0012\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\fJ%\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lpm/m;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/app/Activity;", "activity", "Lorg/json/JSONObject;", "params", "Lpm/m$a;", "callback", BuildConfig.FLAVOR, "m", "(Landroid/app/Activity;Lorg/json/JSONObject;Lpm/m$a;)V", "y", "t", "Lf9/b;", "x", "(Landroid/app/Activity;)Lf9/b;", "a", "b", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m {

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lpm/m$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "jsonResult", "requestType", BuildConfig.FLAVOR, "a", "(Ljava/lang/String;Ljava/lang/String;)V", BuildConfig.FLAVOR, "errorCode", "errorMsg", "b", "(ILjava/lang/String;)V", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        void a(@NotNull String jsonResult, @Nullable String requestType);

        void b(int errorCode, @Nullable String errorMsg);
    }

    public static final void A(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final void B(a aVar, Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        Log.e("BlockStoreManager", "Error retrieving from Block Store: ", e10);
        aVar.b(0, e10.getMessage());
    }

    public static final Unit n(f9.f.a aVar, f9.b bVar, final a aVar2, Boolean bool) {
        if (bool.booleanValue()) {
            aVar.d(true);
            Log.d("BlockStoreManager", "E2EE is available, enable backing up bytes to the cloud.");
        } else {
            Log.d("BlockStoreManager", "E2EE is not available, only store bytes for D2D restore.");
        }
        f9.f fVarA = aVar.a();
        Intrinsics.checkNotNullExpressionValue(fVarA, "build(...)");
        Task<Integer> taskN = bVar.n(fVarA);
        final Function1 function1 = new Function1() { // from class: pm.l
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return m.o(aVar2, (Integer) obj);
            }
        };
        taskN.g(new tb.g() { // from class: pm.b
            @Override // tb.g
            public final void onSuccess(Object obj) {
                m.p(function1, obj);
            }
        }).e(new tb.f() { // from class: pm.c
            @Override // tb.f
            public final void onFailure(Exception exc) {
                m.q(aVar2, exc);
            }
        });
        return Unit.f21506a;
    }

    public static final Unit o(a aVar, Integer num) {
        aVar.a(BuildConfig.FLAVOR, "keystore");
        return Unit.f21506a;
    }

    public static final void p(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final void q(a aVar, Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        Log.e("BlockStoreManager", "Error storing to Block Store: ", e10);
        aVar.b(0, e10.getMessage());
    }

    public static final void r(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final void s(a aVar, Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        Log.e("BlockStoreManager", "Error retrieving from Block Store: ", e10);
        aVar.b(0, e10.getMessage());
    }

    public static final Unit u(a aVar, Boolean bool) {
        aVar.a(BuildConfig.FLAVOR, "keystore");
        return Unit.f21506a;
    }

    public static final void v(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final void w(a aVar, Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        Log.e("BlockStoreManager", "Error deleting from Block Store: ", e10);
        aVar.b(0, e10.getMessage());
    }

    public static final Unit z(String str, a aVar, f9.e eVar) {
        f9.e.a aVar2 = eVar.A3().get(str);
        if (aVar2 == null) {
            aVar.b(6, "No credentials found in Block Store.");
            return Unit.f21506a;
        }
        try {
            byte[] bArrA3 = aVar2.A3();
            Intrinsics.checkNotNullExpressionValue(bArrA3, "getBytes(...)");
            aVar.a(x.A(bArrA3, 0, 0, true, 3, null), "keystore");
        } catch (Exception unused) {
            aVar.b(4, "Failed to decode Block Store data.");
        }
        return Unit.f21506a;
    }

    public final void m(@NotNull Activity activity, @NotNull JSONObject params, @NotNull final a callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            String string = "roblox_credentials";
            JSONObject jSONObjectOptJSONObject = params.optJSONObject("parameters");
            if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.has("key")) {
                string = jSONObjectOptJSONObject.getString("key");
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            }
            String string2 = params.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            byte[] bytes = string2.getBytes(UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            final f9.f.a aVarC = new f9.f.a().b(bytes).c(string);
            Intrinsics.checkNotNull(aVarC);
            final f9.b bVarX = x(activity);
            Task<Boolean> taskR = bVarX.r();
            final Function1 function1 = new Function1() { // from class: pm.i
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return m.n(aVarC, bVarX, callback, (Boolean) obj);
                }
            };
            taskR.g(new tb.g() { // from class: pm.j
                @Override // tb.g
                public final void onSuccess(Object obj) {
                    m.r(function1, obj);
                }
            }).e(new tb.f() { // from class: pm.k
                @Override // tb.f
                public final void onFailure(Exception exc) {
                    m.s(callback, exc);
                }
            });
        } catch (JSONException e10) {
            Log.e("BlockStoreManager", "JSON Exception retrieving key from parameters: ", e10);
            callback.b(4, e10.getMessage());
        }
    }

    public final void t(@NotNull Activity activity, @NotNull JSONObject params, @NotNull final a callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            String string = "roblox_credentials";
            JSONObject jSONObjectOptJSONObject = params.optJSONObject("parameters");
            if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.has("key")) {
                string = jSONObjectOptJSONObject.getString("key");
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            }
            f9.c cVarA = new f9.c.a().b(p001kotlin.collections.o.d(string)).a();
            Intrinsics.checkNotNull(cVarA);
            Task<Boolean> taskA = x(activity).a(cVarA);
            final Function1 function1 = new Function1() { // from class: pm.f
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return m.u(callback, (Boolean) obj);
                }
            };
            taskA.g(new tb.g() { // from class: pm.g
                @Override // tb.g
                public final void onSuccess(Object obj) {
                    m.v(function1, obj);
                }
            }).e(new tb.f() { // from class: pm.h
                @Override // tb.f
                public final void onFailure(Exception exc) {
                    m.w(callback, exc);
                }
            });
        } catch (JSONException e10) {
            Log.e("BlockStoreManager", "JSON Exception retrieving key from parameters: ", e10);
            callback.b(4, e10.getMessage());
        }
    }

    public final f9.b x(Activity activity) {
        f9.b bVarA = f9.a.a(activity);
        Intrinsics.checkNotNullExpressionValue(bVarA, "getClient(...)");
        return bVarA;
    }

    public final void y(@NotNull Activity activity, @NotNull JSONObject params, @NotNull final a callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            JSONObject jSONObjectOptJSONObject = params.optJSONObject("parameters");
            String string = (jSONObjectOptJSONObject == null || !jSONObjectOptJSONObject.has("key")) ? "roblox_credentials" : jSONObjectOptJSONObject.getString("key");
            Pair pair = new Pair(string, new f9.d.a().b(p001kotlin.collections.o.d(string)).a());
            final String str = (String) pair.a();
            Object objB = pair.b();
            Intrinsics.checkNotNullExpressionValue(objB, "component2(...)");
            Task<f9.e> taskT = x(activity).t((f9.d) objB);
            final Function1 function1 = new Function1() { // from class: pm.a
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return m.z(str, callback, (f9.e) obj);
                }
            };
            taskT.g(new tb.g() { // from class: pm.d
                @Override // tb.g
                public final void onSuccess(Object obj) {
                    m.A(function1, obj);
                }
            }).e(new tb.f() { // from class: pm.e
                @Override // tb.f
                public final void onFailure(Exception exc) {
                    m.B(callback, exc);
                }
            });
        } catch (JSONException e10) {
            Log.e("BlockStoreManager", "JSON Exception retrieving key from parameters: ", e10);
            callback.b(4, e10.getMessage());
        }
    }
}
