package p231jv;

import com.appsflyer.sdk_base.referrer.Payload;
import com.google.mlkit.common.MlKitException;
import java.util.Objects;
import okhttp3.Headers;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: renamed from: jv.x */
/* JADX INFO: loaded from: classes2.dex */
public final class C7396x<T> {

    /* JADX INFO: renamed from: a */
    public final Response f28463a;

    /* JADX INFO: renamed from: b */
    public final T f28464b;

    /* JADX INFO: renamed from: c */
    public final ResponseBody f28465c;

    public C7396x(Response response, T t8, ResponseBody responseBody) {
        this.f28463a = response;
        this.f28464b = t8;
        this.f28465c = responseBody;
    }

    /* JADX INFO: renamed from: c */
    public static <T> C7396x<T> m30649c(int i10, ResponseBody responseBody) {
        Objects.requireNonNull(responseBody, "body == null");
        if (i10 >= 400) {
            return m30650d(responseBody, new Response.Builder().body(new C7389q.c(responseBody.contentType(), responseBody.contentLength())).code(i10).message("Response.error()").protocol(Protocol.HTTP_1_1).request(new Request.Builder().url("http://localhost/").build()).build());
        }
        throw new IllegalArgumentException("code < 400: " + i10);
    }

    /* JADX INFO: renamed from: d */
    public static <T> C7396x<T> m30650d(ResponseBody responseBody, Response response) {
        Objects.requireNonNull(responseBody, "body == null");
        Objects.requireNonNull(response, "rawResponse == null");
        if (response.getIsSuccessful()) {
            throw new IllegalArgumentException("rawResponse should not be successful response");
        }
        return new C7396x<>(response, null, responseBody);
    }

    /* JADX INFO: renamed from: i */
    public static <T> C7396x<T> m30651i(T t8) {
        return m30652j(t8, new Response.Builder().code(MlKitException.CODE_SCANNER_UNAVAILABLE).message(Payload.RESPONSE_OK).protocol(Protocol.HTTP_1_1).request(new Request.Builder().url("http://localhost/").build()).build());
    }

    /* JADX INFO: renamed from: j */
    public static <T> C7396x<T> m30652j(T t8, Response response) {
        Objects.requireNonNull(response, "rawResponse == null");
        if (response.getIsSuccessful()) {
            return new C7396x<>(response, t8, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    /* JADX INFO: renamed from: a */
    public T m30653a() {
        return this.f28464b;
    }

    /* JADX INFO: renamed from: b */
    public int m30654b() {
        return this.f28463a.code();
    }

    /* JADX INFO: renamed from: e */
    public ResponseBody m30655e() {
        return this.f28465c;
    }

    /* JADX INFO: renamed from: f */
    public Headers m30656f() {
        return this.f28463a.headers();
    }

    /* JADX INFO: renamed from: g */
    public boolean m30657g() {
        return this.f28463a.getIsSuccessful();
    }

    /* JADX INFO: renamed from: h */
    public String m30658h() {
        return this.f28463a.message();
    }

    public String toString() {
        return this.f28463a.toString();
    }
}
