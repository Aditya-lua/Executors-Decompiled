package j7;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class l extends g<u7.d> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u7.d f20118i;

    public l(List<u7.a<u7.d>> list) {
        super(list);
        this.f20118i = new u7.d();
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
    public u7.d i(u7.a<u7.d> aVar, float f10) {
        u7.d dVar;
        float f11;
        u7.d dVar2 = aVar.b;
        if (dVar2 == null || (dVar = aVar.f33237c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        u7.d dVar3 = dVar2;
        u7.d dVar4 = dVar;
        u7.c<A> cVar = this.f20090e;
        if (cVar != 0) {
            f11 = f10;
            u7.d dVar5 = (u7.d) cVar.b(aVar.f33241g, aVar.f33242h.floatValue(), dVar3, dVar4, f11, e(), f());
            if (dVar5 != null) {
                return dVar5;
            }
        } else {
            f11 = f10;
        }
        this.f20118i.d(t7.j.i(dVar3.b(), dVar4.b(), f11), t7.j.i(dVar3.c(), dVar4.c(), f11));
        return this.f20118i;
    }
}
