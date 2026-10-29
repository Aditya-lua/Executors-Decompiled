package jv;

import android.annotation.TargetApi;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import okhttp3.ResponseBody;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: loaded from: classes2.dex */
@TargetApi(24)
@IgnoreJRERequirement
public final class r extends h.a {

    @IgnoreJRERequirement
    public static final class a<T> implements h<ResponseBody, Optional<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h<ResponseBody, T> f21889a;

        public a(h<ResponseBody, T> hVar) {
            this.f21889a = hVar;
        }

        @Override // jv.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Optional<T> a(ResponseBody responseBody) {
            return Optional.ofNullable(this.f21889a.a(responseBody));
        }
    }

    @Override // jv.h.a
    public h<ResponseBody, ?> d(Type type, Annotation[] annotationArr, y yVar) {
        if (h.a.b(type) != Optional.class) {
            return null;
        }
        return new a(yVar.i(h.a.a(0, (ParameterizedType) type), annotationArr));
    }
}
