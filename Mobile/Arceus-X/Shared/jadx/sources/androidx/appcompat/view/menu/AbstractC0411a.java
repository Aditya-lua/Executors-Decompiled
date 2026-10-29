package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0411a implements InterfaceC0419i {

    /* JADX INFO: renamed from: a */
    public Context f1133a;

    /* JADX INFO: renamed from: b */
    public Context f1134b;

    /* JADX INFO: renamed from: c */
    public C0415e f1135c;

    /* JADX INFO: renamed from: d */
    public LayoutInflater f1136d;

    /* JADX INFO: renamed from: e */
    public LayoutInflater f1137e;

    /* JADX INFO: renamed from: f */
    public InterfaceC0419i.a f1138f;

    /* JADX INFO: renamed from: g */
    public int f1139g;

    /* JADX INFO: renamed from: h */
    public int f1140h;

    /* JADX INFO: renamed from: i */
    public InterfaceC0420j f1141i;

    /* JADX INFO: renamed from: j */
    public int f1142j;

    public AbstractC0411a(Context context, int i10, int i11) {
        this.f1133a = context;
        this.f1136d = LayoutInflater.from(context);
        this.f1139g = i10;
        this.f1140h = i11;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0419i
    /* JADX INFO: renamed from: b */
    public void mo1553b(C0415e c0415e, boolean z10) {
        InterfaceC0419i.a aVar = this.f1138f;
        if (aVar != null) {
            aVar.mo1659b(c0415e, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0419i
    /* JADX INFO: renamed from: c */
    public boolean mo1554c(C0415e c0415e, C0417g c0417g) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0419i
    /* JADX INFO: renamed from: d */
    public void mo1555d(InterfaceC0419i.a aVar) {
        this.f1138f = aVar;
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
    @Override // androidx.appcompat.view.menu.InterfaceC0419i
    /* JADX INFO: renamed from: e */
    public boolean mo1556e(SubMenuC0422l subMenuC0422l) {
        InterfaceC0419i.a aVar = this.f1138f;
        C0415e c0415e = subMenuC0422l;
        if (aVar == null) {
            return false;
        }
        if (subMenuC0422l == null) {
            c0415e = this.f1135c;
        }
        return aVar.mo1660c(c0415e);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v1, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.InterfaceC0419i
    /* JADX INFO: renamed from: f */
    public void mo1557f(boolean z10) {
        ViewGroup viewGroup = (ViewGroup) this.f1141i;
        if (viewGroup == null) {
            return;
        }
        C0415e c0415e = this.f1135c;
        int i10 = 0;
        if (c0415e != null) {
            c0415e.m1647r();
            ArrayList<C0417g> arrayListM1604E = this.f1135c.m1604E();
            int size = arrayListM1604E.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                C0417g c0417g = arrayListM1604E.get(i12);
                if (mo1568r(i11, c0417g)) {
                    View childAt = viewGroup.getChildAt(i11);
                    C0417g itemData = childAt instanceof InterfaceC0420j.a ? ((InterfaceC0420j.a) childAt).getItemData() : null;
                    View viewMo1565o = mo1565o(c0417g, childAt, viewGroup);
                    if (c0417g != itemData) {
                        viewMo1565o.setPressed(false);
                        viewMo1565o.jumpDrawablesToCurrentState();
                    }
                    if (viewMo1565o != childAt) {
                        m1560j(viewMo1565o, i11);
                    }
                    i11++;
                }
            }
            i10 = i11;
        }
        while (i10 < viewGroup.getChildCount()) {
            if (!mo1563m(viewGroup, i10)) {
                i10++;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0419i
    /* JADX INFO: renamed from: h */
    public boolean mo1558h(C0415e c0415e, C0417g c0417g) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0419i
    /* JADX INFO: renamed from: i */
    public void mo1559i(Context context, C0415e c0415e) {
        this.f1134b = context;
        this.f1137e = LayoutInflater.from(context);
        this.f1135c = c0415e;
    }

    /* JADX INFO: renamed from: j */
    public void m1560j(View view, int i10) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f1141i).addView(view, i10);
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo1561k(C0417g c0417g, InterfaceC0420j.a aVar);

    /* JADX INFO: renamed from: l */
    public InterfaceC0420j.a m1562l(ViewGroup viewGroup) {
        return (InterfaceC0420j.a) this.f1136d.inflate(this.f1140h, viewGroup, false);
    }

    /* JADX INFO: renamed from: m */
    public boolean mo1563m(ViewGroup viewGroup, int i10) {
        viewGroup.removeViewAt(i10);
        return true;
    }

    /* JADX INFO: renamed from: n */
    public InterfaceC0419i.a m1564n() {
        return this.f1138f;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: android.view.View */
    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: androidx.appcompat.view.menu.j$a */
    /* JADX DEBUG: Multi-variable search result rejected for r3v5, resolved type: androidx.appcompat.view.menu.j$a */
    /* JADX DEBUG: Multi-variable search result rejected for r3v6, resolved type: androidx.appcompat.view.menu.j$a */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    public View mo1565o(C0417g c0417g, View view, ViewGroup viewGroup) {
        InterfaceC0420j.a aVarM1562l = view instanceof InterfaceC0420j.a ? (InterfaceC0420j.a) view : m1562l(viewGroup);
        mo1561k(c0417g, aVarM1562l);
        return (View) aVarM1562l;
    }

    /* JADX INFO: renamed from: p */
    public InterfaceC0420j mo1566p(ViewGroup viewGroup) {
        if (this.f1141i == null) {
            InterfaceC0420j interfaceC0420j = (InterfaceC0420j) this.f1136d.inflate(this.f1139g, viewGroup, false);
            this.f1141i = interfaceC0420j;
            interfaceC0420j.mo1545a(this.f1135c);
            mo1557f(true);
        }
        return this.f1141i;
    }

    /* JADX INFO: renamed from: q */
    public void m1567q(int i10) {
        this.f1142j = i10;
    }

    /* JADX INFO: renamed from: r */
    public abstract boolean mo1568r(int i10, C0417g c0417g);
}
