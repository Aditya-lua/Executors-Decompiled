package androidx.fragment.app;

import android.util.Log;
import androidx.annotation.NonNull;
import java.io.PrintWriter;
import java.util.ArrayList;
import p093e4.C4824m0;

/* JADX INFO: renamed from: androidx.fragment.app.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0927a extends AbstractC0934h implements FragmentManager.InterfaceC0922o {

    /* JADX INFO: renamed from: t */
    public final FragmentManager f3355t;

    /* JADX INFO: renamed from: u */
    public boolean f3356u;

    /* JADX INFO: renamed from: v */
    public int f3357v;

    /* JADX INFO: renamed from: w */
    public boolean f3358w;

    public C0927a(@NonNull FragmentManager fragmentManager) {
        super(fragmentManager.m4474y0(), fragmentManager.m4365A0() != null ? fragmentManager.m4365A0().getContext().getClassLoader() : null);
        this.f3357v = -1;
        this.f3358w = false;
        this.f3355t = fragmentManager;
    }

    /* JADX INFO: renamed from: A */
    public void m4503A() {
        for (int size = this.f3523c.size() - 1; size >= 0; size--) {
            AbstractC0934h.a aVar = this.f3523c.get(size);
            ComponentCallbacksC0929c componentCallbacksC0929c = aVar.f3541b;
            if (componentCallbacksC0929c != null) {
                componentCallbacksC0929c.f3452o = this.f3358w;
                componentCallbacksC0929c.m4639T1(true);
                componentCallbacksC0929c.m4636S1(FragmentManager.m4361o1(this.f3528h));
                componentCallbacksC0929c.m4646W1(this.f3537q, this.f3536p);
            }
            switch (aVar.f3540a) {
                case 1:
                    componentCallbacksC0929c.m4622N1(aVar.f3543d, aVar.f3544e, aVar.f3545f, aVar.f3546g);
                    this.f3355t.m4454r1(componentCallbacksC0929c, true);
                    this.f3355t.m4433j1(componentCallbacksC0929c);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f3540a);
                case 3:
                    componentCallbacksC0929c.m4622N1(aVar.f3543d, aVar.f3544e, aVar.f3545f, aVar.f3546g);
                    this.f3355t.m4437l(componentCallbacksC0929c);
                    break;
                case 4:
                    componentCallbacksC0929c.m4622N1(aVar.f3543d, aVar.f3544e, aVar.f3545f, aVar.f3546g);
                    this.f3355t.m4472x1(componentCallbacksC0929c);
                    break;
                case 5:
                    componentCallbacksC0929c.m4622N1(aVar.f3543d, aVar.f3544e, aVar.f3545f, aVar.f3546g);
                    this.f3355t.m4454r1(componentCallbacksC0929c, true);
                    this.f3355t.m4385K0(componentCallbacksC0929c);
                    break;
                case 6:
                    componentCallbacksC0929c.m4622N1(aVar.f3543d, aVar.f3544e, aVar.f3545f, aVar.f3546g);
                    this.f3355t.m4450q(componentCallbacksC0929c);
                    break;
                case 7:
                    componentCallbacksC0929c.m4622N1(aVar.f3543d, aVar.f3544e, aVar.f3545f, aVar.f3546g);
                    this.f3355t.m4454r1(componentCallbacksC0929c, true);
                    this.f3355t.m4367B(componentCallbacksC0929c);
                    break;
                case 8:
                    this.f3355t.m4466v1(null);
                    break;
                case 9:
                    this.f3355t.m4466v1(componentCallbacksC0929c);
                    break;
                case 10:
                    aVar.f3548i = componentCallbacksC0929c.f3428U;
                    this.f3355t.m4463u1(componentCallbacksC0929c, aVar.f3547h);
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b6  */
    /* JADX INFO: renamed from: B */
    public ComponentCallbacksC0929c m4504B(ArrayList<ComponentCallbacksC0929c> arrayList, ComponentCallbacksC0929c componentCallbacksC0929c) {
        ComponentCallbacksC0929c componentCallbacksC0929c2 = componentCallbacksC0929c;
        int i10 = 0;
        while (i10 < this.f3523c.size()) {
            AbstractC0934h.a aVar = this.f3523c.get(i10);
            int i11 = aVar.f3540a;
            if (i11 == 1) {
                arrayList.add(aVar.f3541b);
            } else if (i11 == 2) {
                ComponentCallbacksC0929c componentCallbacksC0929c3 = aVar.f3541b;
                int i12 = componentCallbacksC0929c3.f3408A;
                boolean z10 = false;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ComponentCallbacksC0929c componentCallbacksC0929c4 = arrayList.get(size);
                    if (componentCallbacksC0929c4.f3408A == i12) {
                        if (componentCallbacksC0929c4 == componentCallbacksC0929c3) {
                            z10 = true;
                        } else {
                            if (componentCallbacksC0929c4 == componentCallbacksC0929c2) {
                                this.f3523c.add(i10, new AbstractC0934h.a(9, componentCallbacksC0929c4, true));
                                i10++;
                                componentCallbacksC0929c2 = null;
                            }
                            AbstractC0934h.a aVar2 = new AbstractC0934h.a(3, componentCallbacksC0929c4, true);
                            aVar2.f3543d = aVar.f3543d;
                            aVar2.f3545f = aVar.f3545f;
                            aVar2.f3544e = aVar.f3544e;
                            aVar2.f3546g = aVar.f3546g;
                            this.f3523c.add(i10, aVar2);
                            arrayList.remove(componentCallbacksC0929c4);
                            i10++;
                        }
                    }
                }
                if (z10) {
                    this.f3523c.remove(i10);
                    i10--;
                } else {
                    aVar.f3540a = 1;
                    aVar.f3542c = true;
                    arrayList.add(componentCallbacksC0929c3);
                }
            } else if (i11 == 3 || i11 == 6) {
                arrayList.remove(aVar.f3541b);
                ComponentCallbacksC0929c componentCallbacksC0929c5 = aVar.f3541b;
                if (componentCallbacksC0929c5 == componentCallbacksC0929c2) {
                    this.f3523c.add(i10, new AbstractC0934h.a(9, componentCallbacksC0929c5));
                    i10++;
                    componentCallbacksC0929c2 = null;
                }
            } else if (i11 == 7) {
                arrayList.add(aVar.f3541b);
            } else if (i11 == 8) {
                this.f3523c.add(i10, new AbstractC0934h.a(9, componentCallbacksC0929c2, true));
                aVar.f3542c = true;
                i10++;
                componentCallbacksC0929c2 = aVar.f3541b;
            }
            i10++;
        }
        return componentCallbacksC0929c2;
    }

    /* JADX INFO: renamed from: C */
    public String m4505C() {
        return this.f3531k;
    }

    /* JADX INFO: renamed from: D */
    public void m4506D() {
        if (this.f3539s != null) {
            for (int i10 = 0; i10 < this.f3539s.size(); i10++) {
                this.f3539s.get(i10).run();
            }
            this.f3539s = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    /* JADX WARN: Code duplicated, block: B:14:0x002d  */
    /* JADX INFO: renamed from: E */
    public ComponentCallbacksC0929c m4507E(ArrayList<ComponentCallbacksC0929c> arrayList, ComponentCallbacksC0929c componentCallbacksC0929c) {
        for (int size = this.f3523c.size() - 1; size >= 0; size--) {
            AbstractC0934h.a aVar = this.f3523c.get(size);
            int i10 = aVar.f3540a;
            if (i10 == 1) {
                arrayList.remove(aVar.f3541b);
            } else if (i10 != 3) {
                switch (i10) {
                    case 6:
                        arrayList.add(aVar.f3541b);
                        break;
                    case 7:
                        arrayList.remove(aVar.f3541b);
                        break;
                    case 8:
                        componentCallbacksC0929c = null;
                        break;
                    case 9:
                        componentCallbacksC0929c = aVar.f3541b;
                        break;
                    case 10:
                        aVar.f3548i = aVar.f3547h;
                        break;
                }
            } else {
                arrayList.add(aVar.f3541b);
            }
        }
        return componentCallbacksC0929c;
    }

    @Override // androidx.fragment.app.FragmentManager.InterfaceC0922o
    /* JADX INFO: renamed from: a */
    public boolean mo4497a(@NonNull ArrayList<C0927a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
        if (FragmentManager.m4349N0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f3529i) {
            return true;
        }
        this.f3355t.m4434k(this);
        return true;
    }

    @Override // androidx.fragment.app.AbstractC0934h
    /* JADX INFO: renamed from: g */
    public int mo4508g() {
        return m4517w(false, true);
    }

    @Override // androidx.fragment.app.AbstractC0934h
    /* JADX INFO: renamed from: h */
    public int mo4509h() {
        return m4517w(true, true);
    }

    @Override // androidx.fragment.app.AbstractC0934h
    /* JADX INFO: renamed from: i */
    public void mo4510i() {
        m4780k();
        this.f3355t.m4427g0(this, false);
    }

    @Override // androidx.fragment.app.AbstractC0934h
    /* JADX INFO: renamed from: j */
    public void mo4511j() {
        m4780k();
        this.f3355t.m4427g0(this, true);
    }

    @Override // androidx.fragment.app.AbstractC0934h
    /* JADX INFO: renamed from: l */
    public void mo4512l(int i10, ComponentCallbacksC0929c componentCallbacksC0929c, String str, int i11) {
        super.mo4512l(i10, componentCallbacksC0929c, str, i11);
        componentCallbacksC0929c.f3459v = this.f3355t;
    }

    @Override // androidx.fragment.app.AbstractC0934h
    @NonNull
    /* JADX INFO: renamed from: m */
    public AbstractC0934h mo4513m(@NonNull ComponentCallbacksC0929c componentCallbacksC0929c) {
        FragmentManager fragmentManager = componentCallbacksC0929c.f3459v;
        if (fragmentManager == null || fragmentManager == this.f3355t) {
            return super.mo4513m(componentCallbacksC0929c);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + componentCallbacksC0929c.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.AbstractC0934h
    @NonNull
    /* JADX INFO: renamed from: t */
    public AbstractC0934h mo4514t(@NonNull ComponentCallbacksC0929c componentCallbacksC0929c) {
        FragmentManager fragmentManager = componentCallbacksC0929c.f3459v;
        if (fragmentManager == null || fragmentManager == this.f3355t) {
            return super.mo4514t(componentCallbacksC0929c);
        }
        throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + componentCallbacksC0929c.toString() + " is already attached to a FragmentManager.");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f3357v >= 0) {
            sb2.append(" #");
            sb2.append(this.f3357v);
        }
        if (this.f3531k != null) {
            sb2.append(" ");
            sb2.append(this.f3531k);
        }
        sb2.append("}");
        return sb2.toString();
    }

    /* JADX INFO: renamed from: u */
    public void m4515u(int i10) {
        if (this.f3529i) {
            if (FragmentManager.m4349N0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i10);
            }
            int size = this.f3523c.size();
            for (int i11 = 0; i11 < size; i11++) {
                AbstractC0934h.a aVar = this.f3523c.get(i11);
                ComponentCallbacksC0929c componentCallbacksC0929c = aVar.f3541b;
                if (componentCallbacksC0929c != null) {
                    componentCallbacksC0929c.f3458u += i10;
                    if (FragmentManager.m4349N0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f3541b + " to " + aVar.f3541b.f3458u);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public void m4516v() {
        int size = this.f3523c.size() - 1;
        while (size >= 0) {
            AbstractC0934h.a aVar = this.f3523c.get(size);
            if (aVar.f3542c) {
                if (aVar.f3540a == 8) {
                    aVar.f3542c = false;
                    this.f3523c.remove(size - 1);
                    size--;
                } else {
                    int i10 = aVar.f3541b.f3408A;
                    aVar.f3540a = 2;
                    aVar.f3542c = false;
                    for (int i11 = size - 1; i11 >= 0; i11--) {
                        AbstractC0934h.a aVar2 = this.f3523c.get(i11);
                        if (aVar2.f3542c && aVar2.f3541b.f3408A == i10) {
                            this.f3523c.remove(i11);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    /* JADX INFO: renamed from: w */
    public int m4517w(boolean z10, boolean z11) {
        if (this.f3356u) {
            throw new IllegalStateException("commit already called");
        }
        if (FragmentManager.m4349N0(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new C4824m0("FragmentManager"));
            m4518x("  ", printWriter);
            printWriter.close();
        }
        this.f3356u = true;
        if (this.f3529i) {
            this.f3357v = this.f3355t.m4446o();
        } else {
            this.f3357v = -1;
        }
        if (z11) {
            this.f3355t.m4421d0(this, z10);
        }
        return this.f3357v;
    }

    /* JADX INFO: renamed from: x */
    public void m4518x(String str, PrintWriter printWriter) {
        m4519y(str, printWriter, true);
    }

    /* JADX INFO: renamed from: y */
    public void m4519y(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f3531k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f3357v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f3356u);
            if (this.f3528h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f3528h));
            }
            if (this.f3524d != 0 || this.f3525e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3524d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3525e));
            }
            if (this.f3526f != 0 || this.f3527g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3526f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3527g));
            }
            if (this.f3532l != 0 || this.f3533m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f3532l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f3533m);
            }
            if (this.f3534n != 0 || this.f3535o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f3534n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f3535o);
            }
        }
        if (this.f3523c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f3523c.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC0934h.a aVar = this.f3523c.get(i10);
            switch (aVar.f3540a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f3540a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i10);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f3541b);
            if (z10) {
                if (aVar.f3543d != 0 || aVar.f3544e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f3543d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f3544e));
                }
                if (aVar.f3545f != 0 || aVar.f3546g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f3545f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f3546g));
                }
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public void m4520z() {
        int size = this.f3523c.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC0934h.a aVar = this.f3523c.get(i10);
            ComponentCallbacksC0929c componentCallbacksC0929c = aVar.f3541b;
            if (componentCallbacksC0929c != null) {
                componentCallbacksC0929c.f3452o = this.f3358w;
                componentCallbacksC0929c.m4639T1(false);
                componentCallbacksC0929c.m4636S1(this.f3528h);
                componentCallbacksC0929c.m4646W1(this.f3536p, this.f3537q);
            }
            switch (aVar.f3540a) {
                case 1:
                    componentCallbacksC0929c.m4622N1(aVar.f3543d, aVar.f3544e, aVar.f3545f, aVar.f3546g);
                    this.f3355t.m4454r1(componentCallbacksC0929c, false);
                    this.f3355t.m4437l(componentCallbacksC0929c);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f3540a);
                case 3:
                    componentCallbacksC0929c.m4622N1(aVar.f3543d, aVar.f3544e, aVar.f3545f, aVar.f3546g);
                    this.f3355t.m4433j1(componentCallbacksC0929c);
                    break;
                case 4:
                    componentCallbacksC0929c.m4622N1(aVar.f3543d, aVar.f3544e, aVar.f3545f, aVar.f3546g);
                    this.f3355t.m4385K0(componentCallbacksC0929c);
                    break;
                case 5:
                    componentCallbacksC0929c.m4622N1(aVar.f3543d, aVar.f3544e, aVar.f3545f, aVar.f3546g);
                    this.f3355t.m4454r1(componentCallbacksC0929c, false);
                    this.f3355t.m4472x1(componentCallbacksC0929c);
                    break;
                case 6:
                    componentCallbacksC0929c.m4622N1(aVar.f3543d, aVar.f3544e, aVar.f3545f, aVar.f3546g);
                    this.f3355t.m4367B(componentCallbacksC0929c);
                    break;
                case 7:
                    componentCallbacksC0929c.m4622N1(aVar.f3543d, aVar.f3544e, aVar.f3545f, aVar.f3546g);
                    this.f3355t.m4454r1(componentCallbacksC0929c, false);
                    this.f3355t.m4450q(componentCallbacksC0929c);
                    break;
                case 8:
                    this.f3355t.m4466v1(componentCallbacksC0929c);
                    break;
                case 9:
                    this.f3355t.m4466v1(null);
                    break;
                case 10:
                    aVar.f3547h = componentCallbacksC0929c.f3428U;
                    this.f3355t.m4463u1(componentCallbacksC0929c, aVar.f3548i);
                    break;
            }
        }
    }
}
