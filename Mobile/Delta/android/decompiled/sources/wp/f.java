package wp;

import an.a0;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.p0;
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

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lwp/f;", "", "<init>", "()V", "Lwp/c;", "flags", "Lokhttp3/Interceptor;", "b", "(Lwp/c;)Lokhttp3/Interceptor;", "a", "sandbox_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: wp.f$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lwp/f$a;", "", "<init>", "()V", "", "Lan/a0;", "a", "()Ljava/util/Set;", "sandbox_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<a0<?>> a() {
            return p0.c(p.INSTANCE);
        }

        public Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Response c(c cVar, Interceptor.Chain chain) throws JSONException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request request = chain.request();
        RequestBody requestBodyBody = request.body();
        if ((!Intrinsics.c(CollectionsKt.o0(request.url().pathSegments()), "transition") && !Intrinsics.c(CollectionsKt.o0(request.url().pathSegments()), "government-id-classification")) || requestBodyBody == null || !cVar.getIsSandboxModeEnabled()) {
            return chain.proceed(request);
        }
        String strA = c.INSTANCE.a(cVar.getDebugForcedStatus());
        MediaType contentType = requestBodyBody.getContentType();
        String str = null;
        Object[] objArr = 0;
        String strSubtype = contentType != null ? contentType.subtype() : null;
        if (Intrinsics.c(strSubtype, "form-data")) {
            MultipartBody multipartBody = (MultipartBody) requestBodyBody;
            MultipartBody.Builder type = new MultipartBody.Builder(str, 1, objArr == true ? 1 : 0).setType(multipartBody.type());
            Iterator<T> it = multipartBody.parts().iterator();
            while (it.hasNext()) {
                type.addPart((MultipartBody.Part) it.next());
            }
            return chain.proceed(request.newBuilder().method(request.method(), type.addFormDataPart("meta[workflowInitialVariables][debugForcedStatus]", strA).build()).build());
        }
        if (!Intrinsics.c(strSubtype, "json")) {
            return chain.proceed(request);
        }
        xu.e eVar = new xu.e();
        requestBodyBody.writeTo(eVar);
        JSONObject jSONObject = new JSONObject(eVar.R2());
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("meta");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        jSONObjectOptJSONObject.put("workflowInitialVariables", new JSONObject().put("debugForcedStatus", strA));
        jSONObject.put("meta", jSONObjectOptJSONObject);
        RequestBody.Companion companion = RequestBody.INSTANCE;
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return chain.proceed(request.newBuilder().method(request.method(), companion.create(string, requestBodyBody.getContentType())).build());
    }

    @NotNull
    public static final Set<a0<?>> d() {
        return INSTANCE.a();
    }

    @NotNull
    public final Interceptor b(@NotNull final c flags) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        return new Interceptor() { // from class: wp.e
            @Override // okhttp3.Interceptor
            public final Response intercept(Interceptor.Chain chain) {
                return f.c(flags, chain);
            }
        };
    }
}
