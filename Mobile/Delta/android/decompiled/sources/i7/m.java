package i7;

import android.graphics.Path;
import h7.s;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class m extends a<n7.o, Path> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final n7.o f20433i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Path f20434j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Path f20435k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Path f20436l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List<s> f20437m;

    public m(List<t7.a<n7.o>> list) {
        super(list);
        this.f20433i = new n7.o();
        this.f20434j = new Path();
    }

    @Override // i7.a
    public boolean p() {
        List<s> list = this.f20437m;
        return (list == null || list.isEmpty()) ? false : true;
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
    public Path i(t7.a<n7.o> aVar, float f10) {
        n7.o oVar = aVar.b;
        n7.o oVar2 = aVar.f32190c;
        this.f20433i.c(oVar, oVar2 == null ? oVar : oVar2, f10);
        n7.o oVarD = this.f20433i;
        List<s> list = this.f20437m;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                oVarD = this.f20437m.get(size).d(oVarD);
            }
        }
        s7.j.h(oVarD, this.f20434j);
        if (this.f20404e == null) {
            return this.f20434j;
        }
        if (this.f20435k == null) {
            this.f20435k = new Path();
            this.f20436l = new Path();
        }
        s7.j.h(oVar, this.f20435k);
        if (oVar2 != null) {
            s7.j.h(oVar2, this.f20436l);
        }
        t7.c<A> cVar = this.f20404e;
        float f11 = aVar.f32194g;
        float fFloatValue = aVar.f32195h.floatValue();
        Path path = this.f20435k;
        return (Path) cVar.b(f11, fFloatValue, path, oVar2 == null ? path : this.f20436l, f10, e(), f());
    }

    public void s(List<s> list) {
        this.f20437m = list;
    }
}
