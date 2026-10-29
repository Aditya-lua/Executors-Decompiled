package i7;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class d extends g<Float> {
    public d(List<t7.a<Float>> list) {
        super(list);
    }

    public float r() {
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
    public float s(t7.a<Float> aVar, float f10) {
        float f11;
        if (aVar.b == null || aVar.f31671c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        t7.c<A> cVar = this.f20288e;
        if (cVar != 0) {
            f11 = f10;
            Float f12 = (Float) cVar.b(aVar.f31675g, aVar.f31676h.floatValue(), aVar.b, aVar.f31671c, f11, e(), f());
            if (f12 != null) {
                return f12.floatValue();
            }
        } else {
            f11 = f10;
        }
        return s7.j.i(aVar.g(), aVar.d(), f11);
    }

    @Override // i7.a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public Float i(t7.a<Float> aVar, float f10) {
        return Float.valueOf(s(aVar, f10));
    }
}
