package jv;

import hv.h;
import hv.y;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import sm.l;
import sm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f22208a;
    public final boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f22209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f22210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f22211e;

    public a(w wVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f22208a = wVar;
        this.b = z10;
        this.f22209c = z11;
        this.f22210d = z12;
        this.f22211e = z13;
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

    @Override // hv.h.a
    public h<?, RequestBody> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, y yVar) {
        sm.h hVarE = this.f22208a.e(type, g(annotationArr));
        if (this.b) {
            hVarE = hVarE.lenient();
        }
        if (this.f22209c) {
            hVarE = hVarE.failOnUnknown();
        }
        if (this.f22210d) {
            hVarE = hVarE.serializeNulls();
        }
        return new b(hVarE, this.f22211e);
    }

    @Override // hv.h.a
    public h<ResponseBody, ?> d(Type type, Annotation[] annotationArr, y yVar) {
        sm.h hVarE = this.f22208a.e(type, g(annotationArr));
        if (this.b) {
            hVarE = hVarE.lenient();
        }
        if (this.f22209c) {
            hVarE = hVarE.failOnUnknown();
        }
        if (this.f22210d) {
            hVarE = hVarE.serializeNulls();
        }
        return new c(hVarE);
    }
}
