package j7;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class o extends g<m7.b> {

    public class a extends u7.c<m7.b> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ u7.b f20130d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ u7.c f20131e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ m7.b f20132f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ o f20133g;

        public a(o oVar, u7.b bVar, u7.c cVar, m7.b bVar2) {
            this.f20130d = bVar;
            this.f20131e = cVar;
            this.f20132f = bVar2;
            this.f20133g = oVar;
        }

        @Override // u7.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public m7.b a(u7.b<m7.b> bVar) {
            this.f20130d.h(bVar.f(), bVar.a(), bVar.g().f22938a, bVar.b().f22938a, bVar.d(), bVar.c(), bVar.e());
            String str = (String) this.f20131e.a(this.f20130d);
            m7.b bVarB = bVar.c() == 1.0f ? bVar.b() : bVar.g();
            this.f20132f.a(str, bVarB.b, bVarB.f22939c, bVarB.f22940d, bVarB.f22941e, bVarB.f22942f, bVarB.f22943g, bVarB.f22944h, bVarB.f22945i, bVarB.f22946j, bVarB.f22947k, bVarB.f22948l, bVarB.f22949m);
            return this.f20132f;
        }
    }

    public o(List<u7.a<m7.b>> list) {
        super(list);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // j7.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public m7.b i(u7.a<m7.b> aVar, float f10) {
        m7.b bVar;
        u7.c<A> cVar = this.f20090e;
        if (cVar == 0) {
            return (f10 != 1.0f || (bVar = aVar.f33237c) == null) ? aVar.b : bVar;
        }
        float f11 = aVar.f33241g;
        Float f12 = aVar.f33242h;
        float fFloatValue = f12 == null ? Float.MAX_VALUE : f12.floatValue();
        m7.b bVar2 = aVar.b;
        m7.b bVar3 = bVar2;
        m7.b bVar4 = aVar.f33237c;
        return (m7.b) cVar.b(f11, fFloatValue, bVar3, bVar4 == null ? bVar2 : bVar4, f10, d(), f());
    }

    public void s(u7.c<String> cVar) {
        super.o(new a(this, new u7.b(), cVar, new m7.b()));
    }
}
