package i7;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class f extends g<Integer> {
    public f(List<t7.a<Integer>> list) {
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
    public int r(t7.a<Integer> aVar, float f10) {
        float f11;
        if (aVar.b == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int iH = aVar.f31671c == null ? aVar.h() : aVar.e();
        t7.c<A> cVar = this.f20288e;
        if (cVar != 0) {
            f11 = f10;
            Integer num = (Integer) cVar.b(aVar.f31675g, aVar.f31676h.floatValue(), aVar.b, Integer.valueOf(iH), f11, e(), f());
            if (num != null) {
                return num.intValue();
            }
        } else {
            f11 = f10;
        }
        return s7.j.j(aVar.h(), iH, f11);
    }

    @Override // i7.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public Integer i(t7.a<Integer> aVar, float f10) {
        return Integer.valueOf(r(aVar, f10));
    }
}
