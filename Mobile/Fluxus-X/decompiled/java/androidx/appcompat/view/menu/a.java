package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f685a;
    public Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LayoutInflater f687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LayoutInflater f688e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i.a f689f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f690g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f691h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public j f692i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f693j;

    public a(Context context, int i10, int i11) {
        this.f685a = context;
        this.f687d = LayoutInflater.from(context);
        this.f690g = i10;
        this.f691h = i11;
    }

    @Override // androidx.appcompat.view.menu.i
    public void b(e eVar, boolean z10) {
        i.a aVar = this.f689f;
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
        this.f689f = aVar;
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
        i.a aVar = this.f689f;
        e eVar = lVar;
        if (aVar == null) {
            return false;
        }
        if (lVar == null) {
            eVar = this.f686c;
        }
        return aVar.c(eVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.i
    public void f(boolean z10) {
        ViewGroup viewGroup = (ViewGroup) this.f692i;
        if (viewGroup == null) {
            return;
        }
        e eVar = this.f686c;
        int i10 = 0;
        if (eVar != null) {
            eVar.r();
            ArrayList<g> arrayListE = this.f686c.E();
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
        this.f688e = LayoutInflater.from(context);
        this.f686c = eVar;
    }

    public void j(View view, int i10) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f692i).addView(view, i10);
    }

    public abstract void k(g gVar, j.a aVar);

    public j.a l(ViewGroup viewGroup) {
        return (j.a) this.f687d.inflate(this.f691h, viewGroup, false);
    }

    public boolean m(ViewGroup viewGroup, int i10) {
        viewGroup.removeViewAt(i10);
        return true;
    }

    public i.a n() {
        return this.f689f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View o(g gVar, View view, ViewGroup viewGroup) {
        j.a aVarL = view instanceof j.a ? (j.a) view : l(viewGroup);
        k(gVar, aVarL);
        return (View) aVarL;
    }

    public j p(ViewGroup viewGroup) {
        if (this.f692i == null) {
            j jVar = (j) this.f687d.inflate(this.f690g, viewGroup, false);
            this.f692i = jVar;
            jVar.a(this.f686c);
            f(true);
        }
        return this.f692i;
    }

    public void q(int i10) {
        this.f693j = i10;
    }

    public abstract boolean r(int i10, g gVar);
}
