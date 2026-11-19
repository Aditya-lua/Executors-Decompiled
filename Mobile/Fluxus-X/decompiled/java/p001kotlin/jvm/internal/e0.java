package p001kotlin.jvm.internal;

import java.util.List;
import p001kotlin.reflect.KTypeProjection;
import xu.c;
import xu.e;
import xu.f;
import xu.g;
import xu.h;
import xu.i;
import xu.j;
import xu.k;
import xu.m;

/* JADX INFO: loaded from: classes2.dex */
public class e0 {
    public g a(j jVar) {
        return jVar;
    }

    public c b(Class cls) {
        return new f(cls);
    }

    public f c(Class cls, String str) {
        return new q(cls, str);
    }

    public h d(n nVar) {
        return nVar;
    }

    public i e(r rVar) {
        return rVar;
    }

    public j f(t tVar) {
        return tVar;
    }

    public k g(v vVar) {
        return vVar;
    }

    public String h(i iVar) {
        String string = iVar.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    public String i(m mVar) {
        return h(mVar);
    }

    public m j(e eVar, List<KTypeProjection> list, boolean z10) {
        return new j0(eVar, list, z10);
    }
}
