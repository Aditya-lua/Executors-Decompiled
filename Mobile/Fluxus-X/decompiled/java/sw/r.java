package sw;

import android.annotation.TargetApi;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import mv.i0;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: loaded from: classes2.dex */
@TargetApi(24)
@IgnoreJRERequirement
public final class r extends h.a {

    @IgnoreJRERequirement
    public static final class a<T> implements h<i0, Optional<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h<i0, T> f31997a;

        public a(h<i0, T> hVar) {
            this.f31997a = hVar;
        }

        @Override // sw.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Optional<T> a(i0 i0Var) {
            return Optional.ofNullable(this.f31997a.a(i0Var));
        }
    }

    @Override // sw.h.a
    public h<i0, ?> d(Type type, Annotation[] annotationArr, y yVar) {
        if (h.a.b(type) != Optional.class) {
            return null;
        }
        return new a(yVar.i(h.a.a(0, (ParameterizedType) type), annotationArr));
    }
}
