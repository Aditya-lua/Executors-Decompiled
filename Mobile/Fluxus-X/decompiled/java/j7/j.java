package j7;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class j extends g<PointF> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final PointF f20112i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float[] f20113j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float[] f20114k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final PathMeasure f20115l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public i f20116m;

    public j(List<? extends u7.a<PointF>> list) {
        super(list);
        this.f20112i = new PointF();
        this.f20113j = new float[2];
        this.f20114k = new float[2];
        this.f20115l = new PathMeasure();
    }

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
    @Override // j7.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public PointF i(u7.a<PointF> aVar, float f10) {
        float f11;
        i iVar = (i) aVar;
        Path pathK = iVar.k();
        u7.c<A> cVar = this.f20090e;
        if (cVar == 0 || aVar.f33242h == null) {
            f11 = f10;
        } else {
            f11 = f10;
            PointF pointF = (PointF) cVar.b(iVar.f33241g, iVar.f33242h.floatValue(), (PointF) iVar.b, (PointF) iVar.f33237c, e(), f11, f());
            if (pointF != null) {
                return pointF;
            }
        }
        if (pathK == null) {
            return aVar.b;
        }
        if (this.f20116m != iVar) {
            this.f20115l.setPath(pathK, false);
            this.f20116m = iVar;
        }
        float length = this.f20115l.getLength();
        float f12 = f11 * length;
        this.f20115l.getPosTan(f12, this.f20113j, this.f20114k);
        PointF pointF2 = this.f20112i;
        float[] fArr = this.f20113j;
        pointF2.set(fArr[0], fArr[1]);
        if (f12 < 0.0f) {
            PointF pointF3 = this.f20112i;
            float[] fArr2 = this.f20114k;
            pointF3.offset(fArr2[0] * f12, fArr2[1] * f12);
        } else if (f12 > length) {
            PointF pointF4 = this.f20112i;
            float[] fArr3 = this.f20114k;
            float f13 = f12 - length;
            pointF4.offset(fArr3[0] * f13, fArr3[1] * f13);
        }
        return this.f20112i;
    }
}
