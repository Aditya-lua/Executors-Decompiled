package jv;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes2.dex */
public final class b0 implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f21833a = new b0();

    public static Annotation[] a(Annotation[] annotationArr) {
        if (c0.l(annotationArr, a0.class)) {
            return annotationArr;
        }
        Annotation[] annotationArr2 = new Annotation[annotationArr.length + 1];
        annotationArr2[0] = f21833a;
        System.arraycopy(annotationArr, 0, annotationArr2, 1, annotationArr.length);
        return annotationArr2;
    }

    @Override // java.lang.annotation.Annotation
    public Class<? extends Annotation> annotationType() {
        return a0.class;
    }

    @Override // java.lang.annotation.Annotation
    public boolean equals(Object obj) {
        return obj instanceof a0;
    }

    @Override // java.lang.annotation.Annotation
    public int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation
    public String toString() {
        return "@" + a0.class.getName() + "()";
    }
}
