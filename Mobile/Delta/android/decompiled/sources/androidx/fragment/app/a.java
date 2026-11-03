package androidx.fragment.app;

import android.util.Log;
import androidx.annotation.NonNull;
import e4.m0;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class a extends h implements FragmentManager.o {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final FragmentManager f2392t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f2393u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f2394v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f2395w;

    public a(@NonNull FragmentManager fragmentManager) {
        super(fragmentManager.y0(), fragmentManager.A0() != null ? fragmentManager.A0().getContext().getClassLoader() : null);
        this.f2394v = -1;
        this.f2395w = false;
        this.f2392t = fragmentManager;
    }

    public void A() {
        for (int size = this.f2519c.size() - 1; size >= 0; size--) {
            h.a aVar = this.f2519c.get(size);
            c cVar = aVar.b;
            if (cVar != null) {
                cVar.f2458o = this.f2395w;
                cVar.T1(true);
                cVar.S1(FragmentManager.o1(this.f2524h));
                cVar.W1(this.f2533q, this.f2532p);
            }
            switch (aVar.f2536a) {
                case 1:
                    cVar.N1(aVar.f2538d, aVar.f2539e, aVar.f2540f, aVar.f2541g);
                    this.f2392t.r1(cVar, true);
                    this.f2392t.j1(cVar);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f2536a);
                case 3:
                    cVar.N1(aVar.f2538d, aVar.f2539e, aVar.f2540f, aVar.f2541g);
                    this.f2392t.l(cVar);
                    break;
                case 4:
                    cVar.N1(aVar.f2538d, aVar.f2539e, aVar.f2540f, aVar.f2541g);
                    this.f2392t.x1(cVar);
                    break;
                case 5:
                    cVar.N1(aVar.f2538d, aVar.f2539e, aVar.f2540f, aVar.f2541g);
                    this.f2392t.r1(cVar, true);
                    this.f2392t.K0(cVar);
                    break;
                case 6:
                    cVar.N1(aVar.f2538d, aVar.f2539e, aVar.f2540f, aVar.f2541g);
                    this.f2392t.q(cVar);
                    break;
                case 7:
                    cVar.N1(aVar.f2538d, aVar.f2539e, aVar.f2540f, aVar.f2541g);
                    this.f2392t.r1(cVar, true);
                    this.f2392t.B(cVar);
                    break;
                case 8:
                    this.f2392t.v1(null);
                    break;
                case 9:
                    this.f2392t.v1(cVar);
                    break;
                case 10:
                    aVar.f2543i = cVar.U;
                    this.f2392t.u1(cVar, aVar.f2542h);
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b6  */
    public c B(ArrayList<c> arrayList, c cVar) {
        c cVar2 = cVar;
        int i10 = 0;
        while (i10 < this.f2519c.size()) {
            h.a aVar = this.f2519c.get(i10);
            int i11 = aVar.f2536a;
            if (i11 == 1) {
                arrayList.add(aVar.b);
            } else if (i11 == 2) {
                c cVar3 = aVar.b;
                int i12 = cVar3.A;
                boolean z10 = false;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    c cVar4 = arrayList.get(size);
                    if (cVar4.A == i12) {
                        if (cVar4 == cVar3) {
                            z10 = true;
                        } else {
                            if (cVar4 == cVar2) {
                                this.f2519c.add(i10, new h.a(9, cVar4, true));
                                i10++;
                                cVar2 = null;
                            }
                            h.a aVar2 = new h.a(3, cVar4, true);
                            aVar2.f2538d = aVar.f2538d;
                            aVar2.f2540f = aVar.f2540f;
                            aVar2.f2539e = aVar.f2539e;
                            aVar2.f2541g = aVar.f2541g;
                            this.f2519c.add(i10, aVar2);
                            arrayList.remove(cVar4);
                            i10++;
                        }
                    }
                }
                if (z10) {
                    this.f2519c.remove(i10);
                    i10--;
                } else {
                    aVar.f2536a = 1;
                    aVar.f2537c = true;
                    arrayList.add(cVar3);
                }
            } else if (i11 == 3 || i11 == 6) {
                arrayList.remove(aVar.b);
                c cVar5 = aVar.b;
                if (cVar5 == cVar2) {
                    this.f2519c.add(i10, new h.a(9, cVar5));
                    i10++;
                    cVar2 = null;
                }
            } else if (i11 == 7) {
                arrayList.add(aVar.b);
            } else if (i11 == 8) {
                this.f2519c.add(i10, new h.a(9, cVar2, true));
                aVar.f2537c = true;
                i10++;
                cVar2 = aVar.b;
            }
            i10++;
        }
        return cVar2;
    }

    public String C() {
        return this.f2527k;
    }

    public void D() {
        if (this.f2535s != null) {
            for (int i10 = 0; i10 < this.f2535s.size(); i10++) {
                this.f2535s.get(i10).run();
            }
            this.f2535s = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    /* JADX WARN: Code duplicated, block: B:14:0x002d  */
    public c E(ArrayList<c> arrayList, c cVar) {
        for (int size = this.f2519c.size() - 1; size >= 0; size--) {
            h.a aVar = this.f2519c.get(size);
            int i10 = aVar.f2536a;
            if (i10 == 1) {
                arrayList.remove(aVar.b);
            } else if (i10 != 3) {
                switch (i10) {
                    case 6:
                        arrayList.add(aVar.b);
                        break;
                    case 7:
                        arrayList.remove(aVar.b);
                        break;
                    case 8:
                        cVar = null;
                        break;
                    case 9:
                        cVar = aVar.b;
                        break;
                    case 10:
                        aVar.f2543i = aVar.f2542h;
                        break;
                }
            } else {
                arrayList.add(aVar.b);
            }
        }
        return cVar;
    }

    @Override // androidx.fragment.app.FragmentManager.o
    public boolean a(@NonNull ArrayList<a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
        if (FragmentManager.N0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f2525i) {
            return true;
        }
        this.f2392t.k(this);
        return true;
    }

    @Override // androidx.fragment.app.h
    public int g() {
        return w(false, true);
    }

    @Override // androidx.fragment.app.h
    public int h() {
        return w(true, true);
    }

    @Override // androidx.fragment.app.h
    public void i() {
        k();
        this.f2392t.g0(this, false);
    }

    @Override // androidx.fragment.app.h
    public void j() {
        k();
        this.f2392t.g0(this, true);
    }

    @Override // androidx.fragment.app.h
    public void l(int i10, c cVar, String str, int i11) {
        super.l(i10, cVar, str, i11);
        cVar.f2465v = this.f2392t;
    }

    @Override // androidx.fragment.app.h
    @NonNull
    public h m(@NonNull c cVar) {
        FragmentManager fragmentManager = cVar.f2465v;
        if (fragmentManager == null || fragmentManager == this.f2392t) {
            return super.m(cVar);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + cVar.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.h
    @NonNull
    public h t(@NonNull c cVar) {
        FragmentManager fragmentManager = cVar.f2465v;
        if (fragmentManager == null || fragmentManager == this.f2392t) {
            return super.t(cVar);
        }
        throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + cVar.toString() + " is already attached to a FragmentManager.");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f2394v >= 0) {
            sb2.append(" #");
            sb2.append(this.f2394v);
        }
        if (this.f2527k != null) {
            sb2.append(" ");
            sb2.append(this.f2527k);
        }
        sb2.append("}");
        return sb2.toString();
    }

    public void u(int i10) {
        if (this.f2525i) {
            if (FragmentManager.N0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i10);
            }
            int size = this.f2519c.size();
            for (int i11 = 0; i11 < size; i11++) {
                h.a aVar = this.f2519c.get(i11);
                c cVar = aVar.b;
                if (cVar != null) {
                    cVar.f2464u += i10;
                    if (FragmentManager.N0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.b + " to " + aVar.b.f2464u);
                    }
                }
            }
        }
    }

    public void v() {
        int size = this.f2519c.size() - 1;
        while (size >= 0) {
            h.a aVar = this.f2519c.get(size);
            if (aVar.f2537c) {
                if (aVar.f2536a == 8) {
                    aVar.f2537c = false;
                    this.f2519c.remove(size - 1);
                    size--;
                } else {
                    int i10 = aVar.b.A;
                    aVar.f2536a = 2;
                    aVar.f2537c = false;
                    for (int i11 = size - 1; i11 >= 0; i11--) {
                        h.a aVar2 = this.f2519c.get(i11);
                        if (aVar2.f2537c && aVar2.b.A == i10) {
                            this.f2519c.remove(i11);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    public int w(boolean z10, boolean z11) {
        if (this.f2393u) {
            throw new IllegalStateException("commit already called");
        }
        if (FragmentManager.N0(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new m0("FragmentManager"));
            x("  ", printWriter);
            printWriter.close();
        }
        this.f2393u = true;
        if (this.f2525i) {
            this.f2394v = this.f2392t.o();
        } else {
            this.f2394v = -1;
        }
        if (z11) {
            this.f2392t.d0(this, z10);
        }
        return this.f2394v;
    }

    public void x(String str, PrintWriter printWriter) {
        y(str, printWriter, true);
    }

    public void y(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f2527k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f2394v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f2393u);
            if (this.f2524h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f2524h));
            }
            if (this.f2520d != 0 || this.f2521e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2520d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2521e));
            }
            if (this.f2522f != 0 || this.f2523g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2522f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2523g));
            }
            if (this.f2528l != 0 || this.f2529m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2528l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f2529m);
            }
            if (this.f2530n != 0 || this.f2531o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2530n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f2531o);
            }
        }
        if (this.f2519c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f2519c.size();
        for (int i10 = 0; i10 < size; i10++) {
            h.a aVar = this.f2519c.get(i10);
            switch (aVar.f2536a) {
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
                    str2 = "cmd=" + aVar.f2536a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i10);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.b);
            if (z10) {
                if (aVar.f2538d != 0 || aVar.f2539e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f2538d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f2539e));
                }
                if (aVar.f2540f != 0 || aVar.f2541g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f2540f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f2541g));
                }
            }
        }
    }

    public void z() {
        int size = this.f2519c.size();
        for (int i10 = 0; i10 < size; i10++) {
            h.a aVar = this.f2519c.get(i10);
            c cVar = aVar.b;
            if (cVar != null) {
                cVar.f2458o = this.f2395w;
                cVar.T1(false);
                cVar.S1(this.f2524h);
                cVar.W1(this.f2532p, this.f2533q);
            }
            switch (aVar.f2536a) {
                case 1:
                    cVar.N1(aVar.f2538d, aVar.f2539e, aVar.f2540f, aVar.f2541g);
                    this.f2392t.r1(cVar, false);
                    this.f2392t.l(cVar);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f2536a);
                case 3:
                    cVar.N1(aVar.f2538d, aVar.f2539e, aVar.f2540f, aVar.f2541g);
                    this.f2392t.j1(cVar);
                    break;
                case 4:
                    cVar.N1(aVar.f2538d, aVar.f2539e, aVar.f2540f, aVar.f2541g);
                    this.f2392t.K0(cVar);
                    break;
                case 5:
                    cVar.N1(aVar.f2538d, aVar.f2539e, aVar.f2540f, aVar.f2541g);
                    this.f2392t.r1(cVar, false);
                    this.f2392t.x1(cVar);
                    break;
                case 6:
                    cVar.N1(aVar.f2538d, aVar.f2539e, aVar.f2540f, aVar.f2541g);
                    this.f2392t.B(cVar);
                    break;
                case 7:
                    cVar.N1(aVar.f2538d, aVar.f2539e, aVar.f2540f, aVar.f2541g);
                    this.f2392t.r1(cVar, false);
                    this.f2392t.q(cVar);
                    break;
                case 8:
                    this.f2392t.v1(cVar);
                    break;
                case 9:
                    this.f2392t.v1(null);
                    break;
                case 10:
                    aVar.f2542h = cVar.U;
                    this.f2392t.u1(cVar, aVar.f2543i);
                    break;
            }
        }
    }
}
