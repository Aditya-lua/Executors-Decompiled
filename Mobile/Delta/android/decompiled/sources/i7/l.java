package i7;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class l extends g<t7.d> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t7.d f20316i;

    public l(List<t7.a<t7.d>> list) {
        super(list);
        this.f20316i = new t7.d();
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
    public t7.d i(t7.a<t7.d> aVar, float f10) {
        t7.d dVar;
        float f11;
        t7.d dVar2 = aVar.b;
        if (dVar2 == null || (dVar = aVar.f31671c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        t7.d dVar3 = dVar2;
        t7.d dVar4 = dVar;
        t7.c<A> cVar = this.f20288e;
        if (cVar != 0) {
            f11 = f10;
            t7.d dVar5 = (t7.d) cVar.b(aVar.f31675g, aVar.f31676h.floatValue(), dVar3, dVar4, f11, e(), f());
            if (dVar5 != null) {
                return dVar5;
            }
        } else {
            f11 = f10;
        }
        this.f20316i.d(s7.j.i(dVar3.b(), dVar4.b(), f11), s7.j.i(dVar3.c(), dVar4.c(), f11));
        return this.f20316i;
    }
}
