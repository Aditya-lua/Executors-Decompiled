package j7;

import android.graphics.Path;
import i7.s;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class m extends a<o7.o, Path> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o7.o f20119i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Path f20120j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Path f20121k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Path f20122l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List<s> f20123m;

    public m(List<u7.a<o7.o>> list) {
        super(list);
        this.f20119i = new o7.o();
        this.f20120j = new Path();
    }

    @Override // j7.a
    public boolean p() {
        List<s> list = this.f20123m;
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
    @Override // j7.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public Path i(u7.a<o7.o> aVar, float f10) {
        o7.o oVar = aVar.b;
        o7.o oVar2 = aVar.f33237c;
        this.f20119i.c(oVar, oVar2 == null ? oVar : oVar2, f10);
        o7.o oVarF = this.f20119i;
        List<s> list = this.f20123m;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                oVarF = this.f20123m.get(size).f(oVarF);
            }
        }
        t7.j.h(oVarF, this.f20120j);
        if (this.f20090e == null) {
            return this.f20120j;
        }
        if (this.f20121k == null) {
            this.f20121k = new Path();
            this.f20122l = new Path();
        }
        t7.j.h(oVar, this.f20121k);
        if (oVar2 != null) {
            t7.j.h(oVar2, this.f20122l);
        }
        u7.c<A> cVar = this.f20090e;
        float f11 = aVar.f33241g;
        float fFloatValue = aVar.f33242h.floatValue();
        Path path = this.f20121k;
        return (Path) cVar.b(f11, fFloatValue, path, oVar2 == null ? path : this.f20122l, f10, e(), f());
    }

    public void s(List<s> list) {
        this.f20123m = list;
    }
}
