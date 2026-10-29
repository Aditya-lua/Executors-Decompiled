package lv;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import jv.h;
import jv.y;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import um.l;
import um.w;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f23555a;
    public final boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f23556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f23557d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f23558e;

    public a(w wVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f23555a = wVar;
        this.b = z10;
        this.f23556c = z11;
        this.f23557d = z12;
        this.f23558e = z13;
    }

    public static a f(w wVar) {
        if (wVar != null) {
            return new a(wVar, false, false, false, false);
        }
        throw new NullPointerException("moshi == null");
    }

    public static Set<? extends Annotation> g(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(l.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : Collections.EMPTY_SET;
    }

    @Override // jv.h.a
    public h<?, RequestBody> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, y yVar) {
        um.h hVarE = this.f23555a.e(type, g(annotationArr));
        if (this.b) {
            hVarE = hVarE.lenient();
        }
        if (this.f23556c) {
            hVarE = hVarE.failOnUnknown();
        }
        if (this.f23557d) {
            hVarE = hVarE.serializeNulls();
        }
        return new b(hVarE, this.f23558e);
    }

    @Override // jv.h.a
    public h<ResponseBody, ?> d(Type type, Annotation[] annotationArr, y yVar) {
        um.h hVarE = this.f23555a.e(type, g(annotationArr));
        if (this.b) {
            hVarE = hVarE.lenient();
        }
        if (this.f23556c) {
            hVarE = hVarE.failOnUnknown();
        }
        if (this.f23557d) {
            hVarE = hVarE.serializeNulls();
        }
        return new c(hVarE);
    }
}
