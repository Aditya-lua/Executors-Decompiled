package kotlin.jvm.internal;

import java.util.List;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: loaded from: classes2.dex */
public class e0 {
    public fu.g a(j jVar) {
        return jVar;
    }

    public fu.c b(Class cls) {
        return new f(cls);
    }

    public fu.f c(Class cls, String str) {
        return new q(cls, str);
    }

    public fu.h d(n nVar) {
        return nVar;
    }

    public fu.i e(r rVar) {
        return rVar;
    }

    public fu.j f(t tVar) {
        return tVar;
    }

    public fu.k g(v vVar) {
        return vVar;
    }

    public String h(i iVar) {
        String string = iVar.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    public String i(m mVar) {
        return h(mVar);
    }

    public fu.m j(fu.e eVar, List<KTypeProjection> list, boolean z10) {
        return new j0(eVar, list, z10);
    }
}
