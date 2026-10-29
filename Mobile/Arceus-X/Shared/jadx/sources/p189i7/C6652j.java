package p189i7;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;
import p444t7.C11550a;
import p444t7.C11552c;

/* JADX INFO: renamed from: i7.j */
/* JADX INFO: loaded from: classes3.dex */
public class C6652j extends AbstractC6649g<PointF> {

    /* JADX INFO: renamed from: i */
    public final PointF f25653i;

    /* JADX INFO: renamed from: j */
    public final float[] f25654j;

    /* JADX INFO: renamed from: k */
    public final float[] f25655k;

    /* JADX INFO: renamed from: l */
    public final PathMeasure f25656l;

    /* JADX INFO: renamed from: m */
    public C6651i f25657m;

    public C6652j(List<? extends C11550a<PointF>> list) {
        super(list);
        this.f25653i = new PointF();
        this.f25654j = new float[2];
        this.f25655k = new float[2];
        this.f25656l = new PathMeasure();
    }

    /* JADX DEBUG: Method merged with bridge method: i(Lt7/a;F)Ljava/lang/Object; */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
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
    public PointF mo28669i(C11550a<PointF> c11550a, float f10) {
        float f11;
        C6651i c6651i = (C6651i) c11550a;
        Path pathM28703k = c6651i.m28703k();
        C11552c<A> c11552c = this.f25627e;
        if (c11552c == 0 || c11550a.f40895h == null) {
            f11 = f10;
        } else {
            f11 = f10;
            PointF pointF = (PointF) c11552c.m43195b(c6651i.f40894g, c6651i.f40895h.floatValue(), (PointF) c6651i.f40889b, (PointF) c6651i.f40890c, m28665e(), f11, m28666f());
            if (pointF != null) {
                return pointF;
            }
        }
        if (pathM28703k == null) {
            return c11550a.f40889b;
        }
        if (this.f25657m != c6651i) {
            this.f25656l.setPath(pathM28703k, false);
            this.f25657m = c6651i;
        }
        float length = this.f25656l.getLength();
        float f12 = f11 * length;
        this.f25656l.getPosTan(f12, this.f25654j, this.f25655k);
        PointF pointF2 = this.f25653i;
        float[] fArr = this.f25654j;
        pointF2.set(fArr[0], fArr[1]);
        if (f12 < 0.0f) {
            PointF pointF3 = this.f25653i;
            float[] fArr2 = this.f25655k;
            pointF3.offset(fArr2[0] * f12, fArr2[1] * f12);
        } else if (f12 > length) {
            PointF pointF4 = this.f25653i;
            float[] fArr3 = this.f25655k;
            float f13 = f12 - length;
            pointF4.offset(fArr3[0] * f13, fArr3[1] * f13);
        }
        return this.f25653i;
    }
}
