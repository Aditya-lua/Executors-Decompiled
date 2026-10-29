package p525wp;

import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7700p0;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p016an.InterfaceC0364a0;
import p560xu.C12924e;

/* JADX INFO: renamed from: wp.f */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, m31665d2 = {"Lwp/f;", "", "<init>", "()V", "Lwp/c;", "flags", "Lokhttp3/Interceptor;", "b", "(Lwp/c;)Lokhttp3/Interceptor;", "a", "sandbox_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C12507f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: wp.f$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31665d2 = {"Lwp/f$a;", "", "<init>", "()V", "", "Lan/a0;", "a", "()Ljava/util/Set;", "sandbox_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: wp.f.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Set<InterfaceC0364a0<?>> m46836a() {
            return C7700p0.m31904c(C12517p.INSTANCE);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v9, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static final Response m46833c(C12504c c12504c, Interceptor.Chain chain) throws JSONException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request request = chain.request();
        RequestBody requestBodyBody = request.body();
        if ((!Intrinsics.m31980c(CollectionsKt.m31717o0(request.url().pathSegments()), "transition") && !Intrinsics.m31980c(CollectionsKt.m31717o0(request.url().pathSegments()), "government-id-classification")) || requestBodyBody == null || !c12504c.getIsSandboxModeEnabled()) {
            return chain.proceed(request);
        }
        String strM46827a = C12504c.INSTANCE.m46827a(c12504c.getDebugForcedStatus());
        MediaType contentType = requestBodyBody.getContentType();
        String str = null;
        Object[] objArr = 0;
        String strSubtype = contentType != null ? contentType.subtype() : null;
        if (Intrinsics.m31980c(strSubtype, "form-data")) {
            MultipartBody multipartBody = (MultipartBody) requestBodyBody;
            MultipartBody.Builder type = new MultipartBody.Builder(str, 1, objArr == true ? 1 : 0).setType(multipartBody.type());
            Iterator<T> it = multipartBody.parts().iterator();
            while (it.hasNext()) {
                type.addPart((MultipartBody.Part) it.next());
            }
            return chain.proceed(request.newBuilder().method(request.method(), type.addFormDataPart("meta[workflowInitialVariables][debugForcedStatus]", strM46827a).build()).build());
        }
        if (!Intrinsics.m31980c(strSubtype, "json")) {
            return chain.proceed(request);
        }
        C12924e c12924e = new C12924e();
        requestBodyBody.writeTo(c12924e);
        JSONObject jSONObject = new JSONObject(c12924e.mo48008R2());
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("meta");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        jSONObjectOptJSONObject.put("workflowInitialVariables", new JSONObject().put("debugForcedStatus", strM46827a));
        jSONObject.put("meta", jSONObjectOptJSONObject);
        RequestBody.Companion companion = RequestBody.INSTANCE;
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return chain.proceed(request.newBuilder().method(request.method(), companion.create(string, requestBodyBody.getContentType())).build());
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final Set<InterfaceC0364a0<?>> m46834d() {
        return INSTANCE.m46836a();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Interceptor m46835b(@NotNull final C12504c flags) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        return new Interceptor() { // from class: wp.e
            @Override // okhttp3.Interceptor
            public final Response intercept(Interceptor.Chain chain) {
                return C12507f.m46833c(flags, chain);
            }
        };
    }
}
