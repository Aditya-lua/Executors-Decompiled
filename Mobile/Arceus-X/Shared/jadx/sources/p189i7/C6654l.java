package p189i7;

import java.util.List;
import p431s7.C11194j;
import p444t7.C11550a;
import p444t7.C11552c;
import p444t7.C11553d;

/* JADX INFO: renamed from: i7.l */
/* JADX INFO: loaded from: classes3.dex */
public class C6654l extends AbstractC6649g<C11553d> {

    /* JADX INFO: renamed from: i */
    public final C11553d f25659i;

    public C6654l(List<C11550a<C11553d>> list) {
        super(list);
        this.f25659i = new C11553d();
    }

    /* JADX DEBUG: Method merged with bridge method: i(Lt7/a;F)Ljava/lang/Object; */
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
    @Override // p189i7.AbstractC6643a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public C11553d mo28669i(C11550a<C11553d> c11550a, float f10) {
        C11553d c11553d;
        float f11;
        C11553d c11553d2 = c11550a.f40889b;
        if (c11553d2 == null || (c11553d = c11550a.f40890c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C11553d c11553d3 = c11553d2;
        C11553d c11553d4 = c11553d;
        C11552c<A> c11552c = this.f25627e;
        if (c11552c != 0) {
            f11 = f10;
            C11553d c11553d5 = (C11553d) c11552c.m43195b(c11550a.f40894g, c11550a.f40895h.floatValue(), c11553d3, c11553d4, f11, m28665e(), m28666f());
            if (c11553d5 != null) {
                return c11553d5;
            }
        } else {
            f11 = f10;
        }
        this.f25659i.m43200d(C11194j.m42191i(c11553d3.m43198b(), c11553d4.m43198b(), f11), C11194j.m42191i(c11553d3.m43199c(), c11553d4.m43199c(), f11));
        return this.f25659i;
    }
}
