package j7;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class b extends g<Integer> {
    public b(List<u7.a<Integer>> list) {
        super(list);
    }

    public int r() {
        return s(b(), d());
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
    public int s(u7.a<Integer> aVar, float f10) {
        float f11;
        Float f12;
        if (aVar.b == null || aVar.f33237c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        u7.c<A> cVar = this.f20090e;
        if (cVar == 0 || (f12 = aVar.f33242h) == null) {
            f11 = f10;
        } else {
            f11 = f10;
            Integer num = (Integer) cVar.b(aVar.f33241g, f12.floatValue(), aVar.b, aVar.f33237c, f11, e(), f());
            if (num != null) {
                return num.intValue();
            }
        }
        return t7.c.c(t7.j.b(f11, 0.0f, 1.0f), aVar.b.intValue(), aVar.f33237c.intValue());
    }

    @Override // j7.a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public Integer i(u7.a<Integer> aVar, float f10) {
        return Integer.valueOf(s(aVar, f10));
    }
}
