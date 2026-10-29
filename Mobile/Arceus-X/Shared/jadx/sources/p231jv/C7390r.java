package p231jv;

import android.annotation.TargetApi;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import okhttp3.ResponseBody;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: renamed from: jv.r */
/* JADX INFO: loaded from: classes2.dex */
@TargetApi(24)
@IgnoreJRERequirement
public final class C7390r extends InterfaceC7380h.a {

    /* JADX INFO: renamed from: jv.r$a */
    @IgnoreJRERequirement
    public static final class a<T> implements InterfaceC7380h<ResponseBody, Optional<T>> {

        /* JADX INFO: renamed from: a */
        public final InterfaceC7380h<ResponseBody, T> f28359a;

        public a(InterfaceC7380h<ResponseBody, T> interfaceC7380h) {
            this.f28359a = interfaceC7380h;
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // p231jv.InterfaceC7380h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Optional<T> mo30540a(ResponseBody responseBody) {
            return Optional.ofNullable(this.f28359a.mo30540a(responseBody));
        }
    }

    @Override // p231jv.InterfaceC7380h.a
    /* JADX INFO: renamed from: d */
    public InterfaceC7380h<ResponseBody, ?> mo30539d(Type type, Annotation[] annotationArr, C7397y c7397y) {
        if (InterfaceC7380h.a.m30580b(type) != Optional.class) {
            return null;
        }
        return new a(c7397y.m30667i(InterfaceC7380h.a.m30579a(0, (ParameterizedType) type), annotationArr));
    }
}
