package p189i7;

import android.graphics.Path;
import java.util.List;
import p162h7.InterfaceC6312s;
import p303n7.C8909o;
import p431s7.C11194j;
import p444t7.C11550a;
import p444t7.C11552c;

/* JADX INFO: renamed from: i7.m */
/* JADX INFO: loaded from: classes3.dex */
public class C6655m extends AbstractC6643a<C8909o, Path> {

    /* JADX INFO: renamed from: i */
    public final C8909o f25660i;

    /* JADX INFO: renamed from: j */
    public final Path f25661j;

    /* JADX INFO: renamed from: k */
    public Path f25662k;

    /* JADX INFO: renamed from: l */
    public Path f25663l;

    /* JADX INFO: renamed from: m */
    public List<InterfaceC6312s> f25664m;

    public C6655m(List<C11550a<C8909o>> list) {
        super(list);
        this.f25660i = new C8909o();
        this.f25661j = new Path();
    }

    @Override // p189i7.AbstractC6643a
    /* JADX INFO: renamed from: p */
    public boolean mo28676p() {
        List<InterfaceC6312s> list = this.f25664m;
        return (list == null || list.isEmpty()) ? false : true;
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
    public Path mo28669i(C11550a<C8909o> c11550a, float f10) {
        C8909o c8909o = c11550a.f40889b;
        C8909o c8909o2 = c11550a.f40890c;
        this.f25660i.m35911c(c8909o, c8909o2 == null ? c8909o : c8909o2, f10);
        C8909o c8909oMo27611d = this.f25660i;
        List<InterfaceC6312s> list = this.f25664m;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                c8909oMo27611d = this.f25664m.get(size).mo27611d(c8909oMo27611d);
            }
        }
        C11194j.m42190h(c8909oMo27611d, this.f25661j);
        if (this.f25627e == null) {
            return this.f25661j;
        }
        if (this.f25662k == null) {
            this.f25662k = new Path();
            this.f25663l = new Path();
        }
        C11194j.m42190h(c8909o, this.f25662k);
        if (c8909o2 != null) {
            C11194j.m42190h(c8909o2, this.f25663l);
        }
        C11552c<A> c11552c = this.f25627e;
        float f11 = c11550a.f40894g;
        float fFloatValue = c11550a.f40895h.floatValue();
        Path path = this.f25662k;
        return (Path) c11552c.m43195b(f11, fFloatValue, path, c8909o2 == null ? path : this.f25663l, f10, m28665e(), m28666f());
    }

    /* JADX INFO: renamed from: s */
    public void m28709s(List<InterfaceC6312s> list) {
        this.f25664m = list;
    }
}
