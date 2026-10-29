package lv;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import p231jv.C7397y;
import p231jv.InterfaceC7380h;
import p471um.AbstractC11873h;
import p471um.C11888w;
import p471um.InterfaceC11877l;

/* JADX INFO: renamed from: lv.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C8267a extends InterfaceC7380h.a {

    /* JADX INFO: renamed from: a */
    public final C11888w f30567a;

    /* JADX INFO: renamed from: b */
    public final boolean f30568b;

    /* JADX INFO: renamed from: c */
    public final boolean f30569c;

    /* JADX INFO: renamed from: d */
    public final boolean f30570d;

    /* JADX INFO: renamed from: e */
    public final boolean f30571e;

    public C8267a(C11888w c11888w, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f30567a = c11888w;
        this.f30568b = z10;
        this.f30569c = z11;
        this.f30570d = z12;
        this.f30571e = z13;
    }

    /* JADX INFO: renamed from: f */
    public static C8267a m33655f(C11888w c11888w) {
        if (c11888w != null) {
            return new C8267a(c11888w, false, false, false, false);
        }
        throw new NullPointerException("moshi == null");
    }

    /* JADX INFO: renamed from: g */
    public static Set<? extends Annotation> m33656g(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(InterfaceC11877l.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : Collections.EMPTY_SET;
    }

    @Override // p231jv.InterfaceC7380h.a
    /* JADX INFO: renamed from: c */
    public InterfaceC7380h<?, RequestBody> mo30538c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C7397y c7397y) {
        AbstractC11873h abstractC11873hM44438e = this.f30567a.m44438e(type, m33656g(annotationArr));
        if (this.f30568b) {
            abstractC11873hM44438e = abstractC11873hM44438e.lenient();
        }
        if (this.f30569c) {
            abstractC11873hM44438e = abstractC11873hM44438e.failOnUnknown();
        }
        if (this.f30570d) {
            abstractC11873hM44438e = abstractC11873hM44438e.serializeNulls();
        }
        return new C8268b(abstractC11873hM44438e, this.f30571e);
    }

    @Override // p231jv.InterfaceC7380h.a
    /* JADX INFO: renamed from: d */
    public InterfaceC7380h<ResponseBody, ?> mo30539d(Type type, Annotation[] annotationArr, C7397y c7397y) {
        AbstractC11873h abstractC11873hM44438e = this.f30567a.m44438e(type, m33656g(annotationArr));
        if (this.f30568b) {
            abstractC11873hM44438e = abstractC11873hM44438e.lenient();
        }
        if (this.f30569c) {
            abstractC11873hM44438e = abstractC11873hM44438e.failOnUnknown();
        }
        if (this.f30570d) {
            abstractC11873hM44438e = abstractC11873hM44438e.serializeNulls();
        }
        return new C8269c(abstractC11873hM44438e);
    }
}
