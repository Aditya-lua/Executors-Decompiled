package p189i7;

import java.util.List;
import p266l7.C8003b;
import p444t7.C11550a;
import p444t7.C11551b;
import p444t7.C11552c;

/* JADX INFO: renamed from: i7.o */
/* JADX INFO: loaded from: classes3.dex */
public class C6657o extends AbstractC6649g<C8003b> {

    /* JADX INFO: renamed from: i7.o$a */
    public class a extends C11552c<C8003b> {

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C11551b f25671d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C11552c f25672e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ C8003b f25673f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ C6657o f25674g;

        public a(C6657o c6657o, C11551b c11551b, C11552c c11552c, C8003b c8003b) {
            this.f25671d = c11551b;
            this.f25672e = c11552c;
            this.f25673f = c8003b;
            this.f25674g = c6657o;
        }

        /* JADX DEBUG: Method merged with bridge method: a(Lt7/b;)Ljava/lang/Object; */
        @Override // p444t7.C11552c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public C8003b mo8441a(C11551b<C8003b> c11551b) {
            this.f25671d.m43194h(c11551b.m43192f(), c11551b.m43187a(), c11551b.m43193g().f29929a, c11551b.m43188b().f29929a, c11551b.m43190d(), c11551b.m43189c(), c11551b.m43191e());
            String str = (String) this.f25672e.mo8441a(this.f25671d);
            C8003b c8003bM43188b = c11551b.m43189c() == 1.0f ? c11551b.m43188b() : c11551b.m43193g();
            this.f25673f.m33066a(str, c8003bM43188b.f29930b, c8003bM43188b.f29931c, c8003bM43188b.f29932d, c8003bM43188b.f29933e, c8003bM43188b.f29934f, c8003bM43188b.f29935g, c8003bM43188b.f29936h, c8003bM43188b.f29937i, c8003bM43188b.f29938j, c8003bM43188b.f29939k, c8003bM43188b.f29940l, c8003bM43188b.f29941m);
            return this.f25673f;
        }
    }

    public C6657o(List<C11550a<C8003b>> list) {
        super(list);
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
    public C8003b mo28669i(C11550a<C8003b> c11550a, float f10) {
        C8003b c8003b;
        C11552c<A> c11552c = this.f25627e;
        if (c11552c == 0) {
            return (f10 != 1.0f || (c8003b = c11550a.f40890c) == null) ? c11550a.f40889b : c8003b;
        }
        float f11 = c11550a.f40894g;
        Float f12 = c11550a.f40895h;
        float fFloatValue = f12 == null ? Float.MAX_VALUE : f12.floatValue();
        C8003b c8003b2 = c11550a.f40889b;
        C8003b c8003b3 = c8003b2;
        C8003b c8003b4 = c11550a.f40890c;
        return (C8003b) c11552c.m43195b(f11, fFloatValue, c8003b3, c8003b4 == null ? c8003b2 : c8003b4, f10, m28664d(), m28666f());
    }

    /* JADX INFO: renamed from: s */
    public void m28715s(C11552c<String> c11552c) {
        super.m28675o(new a(this, new C11551b(), c11552c, new C8003b()));
    }
}
