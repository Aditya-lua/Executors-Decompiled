package p189i7;

import java.util.List;
import p431s7.C11187c;
import p431s7.C11194j;
import p444t7.C11550a;
import p444t7.C11552c;

/* JADX INFO: renamed from: i7.b */
/* JADX INFO: loaded from: classes3.dex */
public class C6644b extends AbstractC6649g<Integer> {
    public C6644b(List<C11550a<Integer>> list) {
        super(list);
    }

    /* JADX INFO: renamed from: r */
    public int m28683r() {
        return m28684s(m28662b(), m28664d());
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
    /* JADX INFO: renamed from: s */
    public int m28684s(C11550a<Integer> c11550a, float f10) {
        float f11;
        Float f12;
        if (c11550a.f40889b == null || c11550a.f40890c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C11552c<A> c11552c = this.f25627e;
        if (c11552c == 0 || (f12 = c11550a.f40895h) == null) {
            f11 = f10;
        } else {
            f11 = f10;
            Integer num = (Integer) c11552c.m43195b(c11550a.f40894g, f12.floatValue(), c11550a.f40889b, c11550a.f40890c, f11, m28665e(), m28666f());
            if (num != null) {
                return num.intValue();
            }
        }
        return C11187c.m42149c(C11194j.m42184b(f11, 0.0f, 1.0f), c11550a.f40889b.intValue(), c11550a.f40890c.intValue());
    }

    /* JADX DEBUG: Method merged with bridge method: i(Lt7/a;F)Ljava/lang/Object; */
    @Override // p189i7.AbstractC6643a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public Integer mo28669i(C11550a<Integer> c11550a, float f10) {
        return Integer.valueOf(m28684s(c11550a, f10));
    }
}
