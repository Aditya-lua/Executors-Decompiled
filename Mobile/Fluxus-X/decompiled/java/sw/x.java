package sw;

import com.appsflyer.sdk_base.referrer.Payload;
import com.google.mlkit.common.MlKitException;
import java.util.Objects;
import mv.e0;
import mv.f0;
import mv.h0;
import mv.i0;

/* JADX INFO: loaded from: classes2.dex */
public final class x<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f32084a;
    public final T b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0 f32085c;

    public x(h0 h0Var, T t8, i0 i0Var) {
        this.f32084a = h0Var;
        this.b = t8;
        this.f32085c = i0Var;
    }

    public static <T> x<T> c(int i10, i0 i0Var) {
        Objects.requireNonNull(i0Var, "body == null");
        if (i10 >= 400) {
            return d(i0Var, new h0.a().b(new q.c(i0Var.getF24653d(), i0Var.getF24654e())).f(i10).l("Response.error()").o(e0.HTTP_1_1).q(new f0.a().t("http://localhost/").b()).c());
        }
        throw new IllegalArgumentException("code < 400: " + i10);
    }

    public static <T> x<T> d(i0 i0Var, h0 h0Var) {
        Objects.requireNonNull(i0Var, "body == null");
        Objects.requireNonNull(h0Var, "rawResponse == null");
        if (h0Var.getIsSuccessful()) {
            throw new IllegalArgumentException("rawResponse should not be successful response");
        }
        return new x<>(h0Var, null, i0Var);
    }

    public static <T> x<T> i(T t8) {
        return j(t8, new h0.a().f(MlKitException.CODE_SCANNER_UNAVAILABLE).l(Payload.RESPONSE_OK).o(e0.HTTP_1_1).q(new f0.a().t("http://localhost/").b()).c());
    }

    public static <T> x<T> j(T t8, h0 h0Var) {
        Objects.requireNonNull(h0Var, "rawResponse == null");
        if (h0Var.getIsSuccessful()) {
            return new x<>(h0Var, t8, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    public T a() {
        return this.b;
    }

    public int b() {
        return this.f32084a.getCode();
    }

    public i0 e() {
        return this.f32085c;
    }

    public mv.y f() {
        return this.f32084a.getHeaders();
    }

    public boolean g() {
        return this.f32084a.getIsSuccessful();
    }

    public String h() {
        return this.f32084a.getMessage();
    }

    public String toString() {
        return this.f32084a.toString();
    }
}
