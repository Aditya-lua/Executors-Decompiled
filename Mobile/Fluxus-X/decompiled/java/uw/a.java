package uw;

import hn.l;
import hn.w;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import mv.g0;
import mv.i0;
import sw.h;
import sw.y;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f34117a;
    public final boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f34118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f34119d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f34120e;

    public a(w wVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f34117a = wVar;
        this.b = z10;
        this.f34118c = z11;
        this.f34119d = z12;
        this.f34120e = z13;
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

    @Override // sw.h.a
    public h<?, g0> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, y yVar) {
        hn.h hVarE = this.f34117a.e(type, g(annotationArr));
        if (this.b) {
            hVarE = hVarE.lenient();
        }
        if (this.f34118c) {
            hVarE = hVarE.failOnUnknown();
        }
        if (this.f34119d) {
            hVarE = hVarE.serializeNulls();
        }
        return new b(hVarE, this.f34120e);
    }

    @Override // sw.h.a
    public h<i0, ?> d(Type type, Annotation[] annotationArr, y yVar) {
        hn.h hVarE = this.f34117a.e(type, g(annotationArr));
        if (this.b) {
            hVarE = hVarE.lenient();
        }
        if (this.f34118c) {
            hVarE = hVarE.failOnUnknown();
        }
        if (this.f34119d) {
            hVarE = hVarE.serializeNulls();
        }
        return new c(hVarE);
    }
}
