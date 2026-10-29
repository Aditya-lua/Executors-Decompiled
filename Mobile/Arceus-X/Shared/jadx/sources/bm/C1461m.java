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
import kotlin.collections.C7697o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C7797x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p098e9.C4887a;
import p098e9.InterfaceC4888b;
import sb.InterfaceC11254f;
import sb.InterfaceC11256g;

/* JADX INFO: renamed from: bm.m */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00122\u00020\u0001:\u0002\u0012\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\fJ%\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, m31665d2 = {"Lbm/m;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "Lorg/json/JSONObject;", "params", "Lbm/m$a;", "callback", "", "m", "(Landroid/app/Activity;Lorg/json/JSONObject;Lbm/m$a;)V", "y", "t", "Le9/b;", "x", "(Landroid/app/Activity;)Le9/b;", "a", "b", "universalapp_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C1461m {

    /* JADX INFO: renamed from: bm.m$a */
    @Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, m31665d2 = {"Lbm/m$a;", "", "", "jsonResult", "requestType", "", "a", "(Ljava/lang/String;Ljava/lang/String;)V", "", "errorCode", "errorMsg", "b", "(ILjava/lang/String;)V", "universalapp_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo7490a(@NotNull String jsonResult, @Nullable String requestType);

        /* JADX INFO: renamed from: b */
        void mo7491b(int errorCode, @Nullable String errorMsg);
    }

    /* JADX INFO: renamed from: A */
    public static final void m7462A(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: B */
    public static final void m7463B(a aVar, Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        Log.e("BlockStoreManager", "Error retrieving from Block Store: ", e10);
        aVar.mo7491b(0, e10.getMessage());
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m7476n(StoreBytesData.C1889a c1889a, InterfaceC4888b interfaceC4888b, final a aVar, Boolean bool) {
        if (bool.booleanValue()) {
            c1889a.m9127d(true);
            Log.d("BlockStoreManager", "E2EE is available, enable backing up bytes to the cloud.");
        } else {
            Log.d("BlockStoreManager", "E2EE is not available, only store bytes for D2D restore.");
        }
        StoreBytesData storeBytesDataM9124a = c1889a.m9124a();
        Intrinsics.checkNotNullExpressionValue(storeBytesDataM9124a, "build(...)");
        Task<Integer> taskMo304h = interfaceC4888b.mo304h(storeBytesDataM9124a);
        final Function1 function1 = new Function1() { // from class: bm.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C1461m.m7477o(aVar, (Integer) obj);
            }
        };
        taskMo304h.mo11893g(new InterfaceC11256g() { // from class: bm.b
            @Override // sb.InterfaceC11256g
            public final void onSuccess(Object obj) {
                C1461m.m7478p(function1, obj);
            }
        }).mo11891e(new InterfaceC11254f() { // from class: bm.c
            @Override // sb.InterfaceC11254f
            public final void onFailure(Exception exc) {
                C1461m.m7479q(aVar, exc);
            }
        });
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m7477o(a aVar, Integer num) {
        aVar.mo7490a("", "keystore");
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: p */
    public static final void m7478p(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: q */
    public static final void m7479q(a aVar, Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        Log.e("BlockStoreManager", "Error storing to Block Store: ", e10);
        aVar.mo7491b(0, e10.getMessage());
    }

    /* JADX INFO: renamed from: r */
    public static final void m7480r(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: s */
    public static final void m7481s(a aVar, Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        Log.e("BlockStoreManager", "Error retrieving from Block Store: ", e10);
        aVar.mo7491b(0, e10.getMessage());
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m7482u(a aVar, Boolean bool) {
        aVar.mo7490a("", "keystore");
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: v */
    public static final void m7483v(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: w */
    public static final void m7484w(a aVar, Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        Log.e("BlockStoreManager", "Error deleting from Block Store: ", e10);
        aVar.mo7491b(0, e10.getMessage());
    }

    /* JADX INFO: renamed from: z */
    public static final Unit m7485z(String str, a aVar, RetrieveBytesResponse retrieveBytesResponse) {
        RetrieveBytesResponse.BlockstoreData blockstoreData = retrieveBytesResponse.m9119v3().get(str);
        if (blockstoreData == null) {
            aVar.mo7491b(6, "No credentials found in Block Store.");
            return Unit.f29331a;
        }
        try {
            byte[] bArrM9120v3 = blockstoreData.m9120v3();
            Intrinsics.checkNotNullExpressionValue(bArrM9120v3, "getBytes(...)");
            aVar.mo7490a(C7797x.m32290A(bArrM9120v3, 0, 0, true, 3, null), "keystore");
        } catch (Exception unused) {
            aVar.mo7491b(4, "Failed to decode Block Store data.");
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: m */
    public final void m7486m(@NotNull Activity activity, @NotNull JSONObject params, @NotNull final a callback) {
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
            final StoreBytesData.C1889a c1889aM9126c = new StoreBytesData.C1889a().m9125b(bytes).m9126c(string);
            Intrinsics.checkNotNull(c1889aM9126c);
            final InterfaceC4888b interfaceC4888bM7488x = m7488x(activity);
            Task<Boolean> taskMo306p = interfaceC4888bM7488x.mo306p();
            final Function1 function1 = new Function1() { // from class: bm.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C1461m.m7476n(c1889aM9126c, interfaceC4888bM7488x, callback, (Boolean) obj);
                }
            };
            taskMo306p.mo11893g(new InterfaceC11256g() { // from class: bm.j
                @Override // sb.InterfaceC11256g
                public final void onSuccess(Object obj) {
                    C1461m.m7480r(function1, obj);
                }
            }).mo11891e(new InterfaceC11254f() { // from class: bm.k
                @Override // sb.InterfaceC11254f
                public final void onFailure(Exception exc) {
                    C1461m.m7481s(callback, exc);
                }
            });
        } catch (JSONException e10) {
            Log.e("BlockStoreManager", "JSON Exception retrieving key from parameters: ", e10);
            callback.mo7491b(4, e10.getMessage());
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m7487t(@NotNull Activity activity, @NotNull JSONObject params, @NotNull final a callback) {
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
            DeleteBytesRequest deleteBytesRequestM9113a = new DeleteBytesRequest.C1887a().m9114b(C7697o.m31878d(string)).m9113a();
            Intrinsics.checkNotNull(deleteBytesRequestM9113a);
            Task<Boolean> taskMo305i = m7488x(activity).mo305i(deleteBytesRequestM9113a);
            final Function1 function1 = new Function1() { // from class: bm.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C1461m.m7482u(callback, (Boolean) obj);
                }
            };
            taskMo305i.mo11893g(new InterfaceC11256g() { // from class: bm.g
                @Override // sb.InterfaceC11256g
                public final void onSuccess(Object obj) {
                    C1461m.m7483v(function1, obj);
                }
            }).mo11891e(new InterfaceC11254f() { // from class: bm.h
                @Override // sb.InterfaceC11254f
                public final void onFailure(Exception exc) {
                    C1461m.m7484w(callback, exc);
                }
            });
        } catch (JSONException e10) {
            Log.e("BlockStoreManager", "JSON Exception retrieving key from parameters: ", e10);
            callback.mo7491b(4, e10.getMessage());
        }
    }

    /* JADX INFO: renamed from: x */
    public final InterfaceC4888b m7488x(Activity activity) {
        InterfaceC4888b interfaceC4888bM23543a = C4887a.m23543a(activity);
        Intrinsics.checkNotNullExpressionValue(interfaceC4888bM23543a, "getClient(...)");
        return interfaceC4888bM23543a;
    }

    /* JADX INFO: renamed from: y */
    public final void m7489y(@NotNull Activity activity, @NotNull JSONObject params, @NotNull final a callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            JSONObject jSONObjectOptJSONObject = params.optJSONObject("parameters");
            String string = (jSONObjectOptJSONObject == null || !jSONObjectOptJSONObject.has("key")) ? "roblox_credentials" : jSONObjectOptJSONObject.getString("key");
            Pair pair = new Pair(string, new RetrieveBytesRequest.C1888a().m9118b(C7697o.m31878d(string)).m9117a());
            final String str = (String) pair.m31671a();
            Object objM31672b = pair.m31672b();
            Intrinsics.checkNotNullExpressionValue(objM31672b, "component2(...)");
            Task<RetrieveBytesResponse> taskMo303e = m7488x(activity).mo303e((RetrieveBytesRequest) objM31672b);
            final Function1 function1 = new Function1() { // from class: bm.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C1461m.m7485z(str, callback, (RetrieveBytesResponse) obj);
                }
            };
            taskMo303e.mo11893g(new InterfaceC11256g() { // from class: bm.d
                @Override // sb.InterfaceC11256g
                public final void onSuccess(Object obj) {
                    C1461m.m7462A(function1, obj);
                }
            }).mo11891e(new InterfaceC11254f() { // from class: bm.e
                @Override // sb.InterfaceC11254f
                public final void onFailure(Exception exc) {
                    C1461m.m7463B(callback, exc);
                }
            });
        } catch (JSONException e10) {
            Log.e("BlockStoreManager", "JSON Exception retrieving key from parameters: ", e10);
            callback.mo7491b(4, e10.getMessage());
        }
    }
}
