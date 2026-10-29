package i7;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class j extends g<PointF> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final PointF f20310i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float[] f20311j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float[] f20312k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final PathMeasure f20313l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public i f20314m;

    public j(List<? extends t7.a<PointF>> list) {
        super(list);
        this.f20310i = new PointF();
        this.f20311j = new float[2];
        this.f20312k = new float[2];
        this.f20313l = new PathMeasure();
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
    @Override // i7.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public PointF i(t7.a<PointF> aVar, float f10) {
        float f11;
        i iVar = (i) aVar;
        Path pathK = iVar.k();
        t7.c<A> cVar = this.f20288e;
        if (cVar == 0 || aVar.f31676h == null) {
            f11 = f10;
        } else {
            f11 = f10;
            PointF pointF = (PointF) cVar.b(iVar.f31675g, iVar.f31676h.floatValue(), (PointF) iVar.b, (PointF) iVar.f31671c, e(), f11, f());
            if (pointF != null) {
                return pointF;
            }
        }
        if (pathK == null) {
            return aVar.b;
        }
        if (this.f20314m != iVar) {
            this.f20313l.setPath(pathK, false);
            this.f20314m = iVar;
        }
        float length = this.f20313l.getLength();
        float f12 = f11 * length;
        this.f20313l.getPosTan(f12, this.f20311j, this.f20312k);
        PointF pointF2 = this.f20310i;
        float[] fArr = this.f20311j;
        pointF2.set(fArr[0], fArr[1]);
        if (f12 < 0.0f) {
            PointF pointF3 = this.f20310i;
            float[] fArr2 = this.f20312k;
            pointF3.offset(fArr2[0] * f12, fArr2[1] * f12);
        } else if (f12 > length) {
            PointF pointF4 = this.f20310i;
            float[] fArr3 = this.f20312k;
            float f13 = f12 - length;
            pointF4.offset(fArr3[0] * f13, fArr3[1] * f13);
        }
        return this.f20310i;
    }
}
