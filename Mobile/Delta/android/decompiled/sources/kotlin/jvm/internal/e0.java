package kotlin.jvm.internal;

import java.util.List;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: loaded from: classes2.dex */
public class e0 {
    public hu.g a(j jVar) {
        return jVar;
    }

    public hu.c b(Class cls) {
        return new f(cls);
    }

    public hu.f c(Class cls, String str) {
        return new q(cls, str);
    }

    public hu.h d(n nVar) {
        return nVar;
    }

    public hu.i e(r rVar) {
        return rVar;
    }

    public hu.j f(t tVar) {
        return tVar;
    }

    public hu.k g(v vVar) {
        return vVar;
    }

    public String h(i iVar) {
        String string = iVar.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    public String i(m mVar) {
        return h(mVar);
    }

    public hu.m j(hu.e eVar, List<KTypeProjection> list, boolean z10) {
        return new j0(eVar, list, z10);
    }
}
