package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f859a;
    public Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LayoutInflater f861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LayoutInflater f862e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i.a f863f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f864g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f865h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public j f866i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f867j;

    public a(Context context, int i10, int i11) {
        this.f859a = context;
        this.f861d = LayoutInflater.from(context);
        this.f864g = i10;
        this.f865h = i11;
    }

    @Override // androidx.appcompat.view.menu.i
    public void b(e eVar, boolean z10) {
        i.a aVar = this.f863f;
        if (aVar != null) {
            aVar.b(eVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean c(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public void d(i.a aVar) {
        this.f863f = aVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.appcompat.view.menu.i
    public boolean e(l lVar) {
        i.a aVar = this.f863f;
        e eVar = lVar;
        if (aVar == null) {
            return false;
        }
        if (lVar == null) {
            eVar = this.f860c;
        }
        return aVar.c(eVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.i
    public void f(boolean z10) {
        ViewGroup viewGroup = (ViewGroup) this.f866i;
        if (viewGroup == null) {
            return;
        }
        e eVar = this.f860c;
        int i10 = 0;
        if (eVar != null) {
            eVar.r();
            ArrayList<g> arrayListE = this.f860c.E();
            int size = arrayListE.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                g gVar = arrayListE.get(i12);
                if (r(i11, gVar)) {
                    View childAt = viewGroup.getChildAt(i11);
                    g itemData = childAt instanceof j.a ? ((j.a) childAt).getItemData() : null;
                    View viewO = o(gVar, childAt, viewGroup);
                    if (gVar != itemData) {
                        viewO.setPressed(false);
                        viewO.jumpDrawablesToCurrentState();
                    }
                    if (viewO != childAt) {
                        j(viewO, i11);
                    }
                    i11++;
                }
            }
            i10 = i11;
        }
        while (i10 < viewGroup.getChildCount()) {
            if (!m(viewGroup, i10)) {
                i10++;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean h(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public void i(Context context, e eVar) {
        this.b = context;
        this.f862e = LayoutInflater.from(context);
        this.f860c = eVar;
    }

    public void j(View view, int i10) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f866i).addView(view, i10);
    }

    public abstract void k(g gVar, j.a aVar);

    public j.a l(ViewGroup viewGroup) {
        return (j.a) this.f861d.inflate(this.f865h, viewGroup, false);
    }

    public boolean m(ViewGroup viewGroup, int i10) {
        viewGroup.removeViewAt(i10);
        return true;
    }

    public i.a n() {
        return this.f863f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View o(g gVar, View view, ViewGroup viewGroup) {
        j.a aVarL = view instanceof j.a ? (j.a) view : l(viewGroup);
        k(gVar, aVarL);
        return (View) aVarL;
    }

    public j p(ViewGroup viewGroup) {
        if (this.f866i == null) {
            j jVar = (j) this.f861d.inflate(this.f864g, viewGroup, false);
            this.f866i = jVar;
            jVar.a(this.f860c);
            f(true);
        }
        return this.f866i;
    }

    public void q(int i10) {
        this.f867j = i10;
    }

    public abstract boolean r(int i10, g gVar);
}
