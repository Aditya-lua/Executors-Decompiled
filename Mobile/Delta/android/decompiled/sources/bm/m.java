package bm;

import android.app.Activity;
import android.util.Log;
import com.google.android.gms.auth.blockstore.DeleteBytesRequest;
import com.google.android.gms.auth.blockstore.RetrieveBytesRequest;
import com.google.android.gms.auth.blockstore.RetrieveBytesResponse;
import com.google.android.gms.auth.blockstore.StoreBytesData;
import com.google.android.gms.tasks.Task;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00122\u00020\u0001:\u0002\u0012\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\fJ%\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lbm/m;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "Lorg/json/JSONObject;", "params", "Lbm/m$a;", "callback", "", "m", "(Landroid/app/Activity;Lorg/json/JSONObject;Lbm/m$a;)V", "y", "t", "Le9/b;", "x", "(Landroid/app/Activity;)Le9/b;", "a", "b", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m {

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lbm/m$a;", "", "", "jsonResult", "requestType", "", "a", "(Ljava/lang/String;Ljava/lang/String;)V", "", "errorCode", "errorMsg", "b", "(ILjava/lang/String;)V", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

    public static final Unit n(StoreBytesData.a aVar, e9.b bVar, final a aVar2, Boolean bool) {
        if (bool.booleanValue()) {
            aVar.d(true);
            Log.d("BlockStoreManager", "E2EE is available, enable backing up bytes to the cloud.");
        } else {
            Log.d("BlockStoreManager", "E2EE is not available, only store bytes for D2D restore.");
        }
        StoreBytesData storeBytesDataA = aVar.a();
        Intrinsics.checkNotNullExpressionValue(storeBytesDataA, "build(...)");
        Task<Integer> taskH = bVar.h(storeBytesDataA);
        final Function1 function1 = new Function1() { // from class: bm.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return m.o(aVar2, (Integer) obj);
            }
        };
        taskH.g(new sb.g() { // from class: bm.b
            @Override // sb.g
            public final void onSuccess(Object obj) {
                m.p(function1, obj);
            }
        }).e(new sb.f() { // from class: bm.c
            @Override // sb.f
            public final void onFailure(Exception exc) {
                m.q(aVar2, exc);
            }
        });
        return Unit.f22483a;
    }

    public static final Unit o(a aVar, Integer num) {
        aVar.a("", "keystore");
        return Unit.f22483a;
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
        aVar.a("", "keystore");
        return Unit.f22483a;
    }

    public static final void v(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final void w(a aVar, Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        Log.e("BlockStoreManager", "Error deleting from Block Store: ", e10);
        aVar.b(0, e10.getMessage());
    }

    public static final Unit z(String str, a aVar, RetrieveBytesResponse retrieveBytesResponse) {
        RetrieveBytesResponse.BlockstoreData blockstoreData = retrieveBytesResponse.v3().get(str);
        if (blockstoreData == null) {
            aVar.b(6, "No credentials found in Block Store.");
            return Unit.f22483a;
        }
        try {
            byte[] bArrV3 = blockstoreData.v3();
            Intrinsics.checkNotNullExpressionValue(bArrV3, "getBytes(...)");
            aVar.a(x.A(bArrV3, 0, 0, true, 3, null), "keystore");
        } catch (Exception unused) {
            aVar.b(4, "Failed to decode Block Store data.");
        }
        return Unit.f22483a;
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
            final StoreBytesData.a aVarC = new StoreBytesData.a().b(bytes).c(string);
            Intrinsics.checkNotNull(aVarC);
            final e9.b bVarX = x(activity);
            Task<Boolean> taskP = bVarX.p();
            final Function1 function1 = new Function1() { // from class: bm.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return m.n(aVarC, bVarX, callback, (Boolean) obj);
                }
            };
            taskP.g(new sb.g() { // from class: bm.j
                @Override // sb.g
                public final void onSuccess(Object obj) {
                    m.r(function1, obj);
                }
            }).e(new sb.f() { // from class: bm.k
                @Override // sb.f
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
            DeleteBytesRequest deleteBytesRequestA = new DeleteBytesRequest.a().b(kotlin.collections.o.d(string)).a();
            Intrinsics.checkNotNull(deleteBytesRequestA);
            Task<Boolean> taskI = x(activity).i(deleteBytesRequestA);
            final Function1 function1 = new Function1() { // from class: bm.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return m.u(callback, (Boolean) obj);
                }
            };
            taskI.g(new sb.g() { // from class: bm.g
                @Override // sb.g
                public final void onSuccess(Object obj) {
                    m.v(function1, obj);
                }
            }).e(new sb.f() { // from class: bm.h
                @Override // sb.f
                public final void onFailure(Exception exc) {
                    m.w(callback, exc);
                }
            });
        } catch (JSONException e10) {
            Log.e("BlockStoreManager", "JSON Exception retrieving key from parameters: ", e10);
            callback.b(4, e10.getMessage());
        }
    }

    public final e9.b x(Activity activity) {
        e9.b bVarA = e9.a.a(activity);
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
            Pair pair = new Pair(string, new RetrieveBytesRequest.a().b(kotlin.collections.o.d(string)).a());
            final String str = (String) pair.a();
            Object objB = pair.b();
            Intrinsics.checkNotNullExpressionValue(objB, "component2(...)");
            Task<RetrieveBytesResponse> taskE = x(activity).e((RetrieveBytesRequest) objB);
            final Function1 function1 = new Function1() { // from class: bm.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return m.z(str, callback, (RetrieveBytesResponse) obj);
                }
            };
            taskE.g(new sb.g() { // from class: bm.d
                @Override // sb.g
                public final void onSuccess(Object obj) {
                    m.A(function1, obj);
                }
            }).e(new sb.f() { // from class: bm.e
                @Override // sb.f
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
