package hv;

import com.appsflyer.sdk_base.referrer.Payload;
import com.google.mlkit.common.MlKitException;
import java.util.Objects;
import okhttp3.Headers;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes2.dex */
public final class x<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Response f19985a;
    public final T b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ResponseBody f19986c;

    public x(Response response, T t8, ResponseBody responseBody) {
        this.f19985a = response;
        this.b = t8;
        this.f19986c = responseBody;
    }

    public static <T> x<T> c(int i10, ResponseBody responseBody) {
        Objects.requireNonNull(responseBody, "body == null");
        if (i10 >= 400) {
            return d(responseBody, new Response.Builder().body(new q.c(responseBody.contentType(), responseBody.contentLength())).code(i10).message("Response.error()").protocol(Protocol.HTTP_1_1).request(new Request.Builder().url("http://localhost/").build()).build());
        }
        throw new IllegalArgumentException("code < 400: " + i10);
    }

    public static <T> x<T> d(ResponseBody responseBody, Response response) {
        Objects.requireNonNull(responseBody, "body == null");
        Objects.requireNonNull(response, "rawResponse == null");
        if (response.getIsSuccessful()) {
            throw new IllegalArgumentException("rawResponse should not be successful response");
        }
        return new x<>(response, null, responseBody);
    }

    public static <T> x<T> i(T t8) {
        return j(t8, new Response.Builder().code(MlKitException.CODE_SCANNER_UNAVAILABLE).message(Payload.RESPONSE_OK).protocol(Protocol.HTTP_1_1).request(new Request.Builder().url("http://localhost/").build()).build());
    }

    public static <T> x<T> j(T t8, Response response) {
        Objects.requireNonNull(response, "rawResponse == null");
        if (response.getIsSuccessful()) {
            return new x<>(response, t8, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    public T a() {
        return this.b;
    }

    public int b() {
        return this.f19985a.code();
    }

    public ResponseBody e() {
        return this.f19986c;
    }

    public Headers f() {
        return this.f19985a.headers();
    }

    public boolean g() {
        return this.f19985a.getIsSuccessful();
    }

    public String h() {
        return this.f19985a.message();
    }

    public String toString() {
        return this.f19985a.toString();
    }
}
