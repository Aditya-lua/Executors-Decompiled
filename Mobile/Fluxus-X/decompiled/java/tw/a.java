package tw;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import lg.f;
import mv.g0;
import mv.i0;
import sw.h;
import sw.y;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f32867a;
    public final boolean b;

    public a(f fVar, boolean z10) {
        this.f32867a = fVar;
        this.b = z10;
    }

    public static a f() {
        return g(new f());
    }

    public static a g(f fVar) {
        if (fVar != null) {
            return new a(fVar, false);
        }
        throw new NullPointerException("gson == null");
    }

    @Override // sw.h.a
    public h<?, g0> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, y yVar) {
        return new b(this.f32867a, this.f32867a.m(sg.a.b(type)), this.b);
    }

    @Override // sw.h.a
    public h<i0, ?> d(Type type, Annotation[] annotationArr, y yVar) {
        return new c(this.f32867a, this.f32867a.m(sg.a.b(type)));
    }
}
