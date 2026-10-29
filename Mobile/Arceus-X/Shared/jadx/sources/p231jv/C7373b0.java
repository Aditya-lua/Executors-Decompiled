package p231jv;

import java.lang.annotation.Annotation;

/* JADX INFO: renamed from: jv.b0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7373b0 implements InterfaceC7371a0 {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC7371a0 f28285a = new C7373b0();

    /* JADX INFO: renamed from: a */
    public static Annotation[] m30547a(Annotation[] annotationArr) {
        if (C7375c0.m30561l(annotationArr, InterfaceC7371a0.class)) {
            return annotationArr;
        }
        Annotation[] annotationArr2 = new Annotation[annotationArr.length + 1];
        annotationArr2[0] = f28285a;
        System.arraycopy(annotationArr, 0, annotationArr2, 1, annotationArr.length);
        return annotationArr2;
    }

    @Override // java.lang.annotation.Annotation
    public Class<? extends Annotation> annotationType() {
        return InterfaceC7371a0.class;
    }

    @Override // java.lang.annotation.Annotation
    public boolean equals(Object obj) {
        return obj instanceof InterfaceC7371a0;
    }

    @Override // java.lang.annotation.Annotation
    public int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation
    public String toString() {
        return "@" + InterfaceC7371a0.class.getName() + "()";
    }
}
