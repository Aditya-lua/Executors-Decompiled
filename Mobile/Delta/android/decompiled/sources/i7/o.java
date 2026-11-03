package i7;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class o extends g<l7.b> {

    public class a extends t7.c<l7.b> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ t7.b f20444d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ t7.c f20445e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ l7.b f20446f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ o f20447g;

        public a(o oVar, t7.b bVar, t7.c cVar, l7.b bVar2) {
            this.f20444d = bVar;
            this.f20445e = cVar;
            this.f20446f = bVar2;
            this.f20447g = oVar;
        }

        @Override // t7.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public l7.b a(t7.b<l7.b> bVar) {
            this.f20444d.h(bVar.f(), bVar.a(), bVar.g().f23347a, bVar.b().f23347a, bVar.d(), bVar.c(), bVar.e());
            String str = (String) this.f20445e.a(this.f20444d);
            l7.b bVarB = bVar.c() == 1.0f ? bVar.b() : bVar.g();
            this.f20446f.a(str, bVarB.b, bVarB.f23348c, bVarB.f23349d, bVarB.f23350e, bVarB.f23351f, bVarB.f23352g, bVarB.f23353h, bVarB.f23354i, bVarB.f23355j, bVarB.f23356k, bVarB.f23357l, bVarB.f23358m);
            return this.f20446f;
        }
    }

    public o(List<t7.a<l7.b>> list) {
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
    @Override // i7.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public l7.b i(t7.a<l7.b> aVar, float f10) {
        l7.b bVar;
        t7.c<A> cVar = this.f20404e;
        if (cVar == 0) {
            return (f10 != 1.0f || (bVar = aVar.f32190c) == null) ? aVar.b : bVar;
        }
        float f11 = aVar.f32194g;
        Float f12 = aVar.f32195h;
        float fFloatValue = f12 == null ? Float.MAX_VALUE : f12.floatValue();
        l7.b bVar2 = aVar.b;
        l7.b bVar3 = bVar2;
        l7.b bVar4 = aVar.f32190c;
        return (l7.b) cVar.b(f11, fFloatValue, bVar3, bVar4 == null ? bVar2 : bVar4, f10, d(), f());
    }

    public void s(t7.c<String> cVar) {
        super.o(new a(this, new t7.b(), cVar, new l7.b()));
    }
}
