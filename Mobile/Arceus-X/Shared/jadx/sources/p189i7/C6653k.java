package p189i7;

import android.graphics.PointF;
import java.util.List;
import p444t7.C11550a;
import p444t7.C11552c;

/* JADX INFO: renamed from: i7.k */
/* JADX INFO: loaded from: classes3.dex */
public class C6653k extends AbstractC6649g<PointF> {

    /* JADX INFO: renamed from: i */
    public final PointF f25658i;

    public C6653k(List<C11550a<PointF>> list) {
        super(list);
        this.f25658i = new PointF();
    }

    /* JADX DEBUG: Method merged with bridge method: i(Lt7/a;F)Ljava/lang/Object; */
    @Override // p189i7.AbstractC6643a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public PointF mo28669i(C11550a<PointF> c11550a, float f10) {
        return mo28670j(c11550a, f10, f10, f10);
    }

    /* JADX DEBUG: Method merged with bridge method: j(Lt7/a;FFF)Ljava/lang/Object; */
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
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public PointF mo28670j(C11550a<PointF> c11550a, float f10, float f11, float f12) {
        PointF pointF;
        PointF pointF2;
        PointF pointF3 = c11550a.f40889b;
        if (pointF3 == null || (pointF = c11550a.f40890c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF4 = pointF3;
        PointF pointF5 = pointF;
        C11552c<A> c11552c = this.f25627e;
        if (c11552c != 0 && (pointF2 = (PointF) c11552c.m43195b(c11550a.f40894g, c11550a.f40895h.floatValue(), pointF4, pointF5, f10, m28665e(), m28666f())) != null) {
            return pointF2;
        }
        PointF pointF6 = this.f25658i;
        float f13 = pointF4.x;
        float f14 = f13 + (f11 * (pointF5.x - f13));
        float f15 = pointF4.y;
        pointF6.set(f14, f15 + (f12 * (pointF5.y - f15)));
        return this.f25658i;
    }
}
