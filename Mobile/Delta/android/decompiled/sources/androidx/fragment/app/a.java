package androidx.fragment.app;

import android.util.Log;
import androidx.annotation.NonNull;
import e4.m0;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class a extends h implements FragmentManager.o {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final FragmentManager f2547t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f2548u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f2549v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f2550w;

    public a(@NonNull FragmentManager fragmentManager) {
        super(fragmentManager.y0(), fragmentManager.A0() != null ? fragmentManager.A0().getContext().getClassLoader() : null);
        this.f2549v = -1;
        this.f2550w = false;
        this.f2547t = fragmentManager;
    }

    public void A() {
        for (int size = this.f2674c.size() - 1; size >= 0; size--) {
            h.a aVar = this.f2674c.get(size);
            c cVar = aVar.b;
            if (cVar != null) {
                cVar.f2613o = this.f2550w;
                cVar.T1(true);
                cVar.S1(FragmentManager.o1(this.f2679h));
                cVar.W1(this.f2688q, this.f2687p);
            }
            switch (aVar.f2691a) {
                case 1:
                    cVar.N1(aVar.f2693d, aVar.f2694e, aVar.f2695f, aVar.f2696g);
                    this.f2547t.r1(cVar, true);
                    this.f2547t.j1(cVar);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f2691a);
                case 3:
                    cVar.N1(aVar.f2693d, aVar.f2694e, aVar.f2695f, aVar.f2696g);
                    this.f2547t.l(cVar);
                    break;
                case 4:
                    cVar.N1(aVar.f2693d, aVar.f2694e, aVar.f2695f, aVar.f2696g);
                    this.f2547t.x1(cVar);
                    break;
                case 5:
                    cVar.N1(aVar.f2693d, aVar.f2694e, aVar.f2695f, aVar.f2696g);
                    this.f2547t.r1(cVar, true);
                    this.f2547t.K0(cVar);
                    break;
                case 6:
                    cVar.N1(aVar.f2693d, aVar.f2694e, aVar.f2695f, aVar.f2696g);
                    this.f2547t.q(cVar);
                    break;
                case 7:
                    cVar.N1(aVar.f2693d, aVar.f2694e, aVar.f2695f, aVar.f2696g);
                    this.f2547t.r1(cVar, true);
                    this.f2547t.B(cVar);
                    break;
                case 8:
                    this.f2547t.v1(null);
                    break;
                case 9:
                    this.f2547t.v1(cVar);
                    break;
                case 10:
                    aVar.f2698i = cVar.U;
                    this.f2547t.u1(cVar, aVar.f2697h);
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b6  */
    public c B(ArrayList<c> arrayList, c cVar) {
        c cVar2 = cVar;
        int i10 = 0;
        while (i10 < this.f2674c.size()) {
            h.a aVar = this.f2674c.get(i10);
            int i11 = aVar.f2691a;
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
                                this.f2674c.add(i10, new h.a(9, cVar4, true));
                                i10++;
                                cVar2 = null;
                            }
                            h.a aVar2 = new h.a(3, cVar4, true);
                            aVar2.f2693d = aVar.f2693d;
                            aVar2.f2695f = aVar.f2695f;
                            aVar2.f2694e = aVar.f2694e;
                            aVar2.f2696g = aVar.f2696g;
                            this.f2674c.add(i10, aVar2);
                            arrayList.remove(cVar4);
                            i10++;
                        }
                    }
                }
                if (z10) {
                    this.f2674c.remove(i10);
                    i10--;
                } else {
                    aVar.f2691a = 1;
                    aVar.f2692c = true;
                    arrayList.add(cVar3);
                }
            } else if (i11 == 3 || i11 == 6) {
                arrayList.remove(aVar.b);
                c cVar5 = aVar.b;
                if (cVar5 == cVar2) {
                    this.f2674c.add(i10, new h.a(9, cVar5));
                    i10++;
                    cVar2 = null;
                }
            } else if (i11 == 7) {
                arrayList.add(aVar.b);
            } else if (i11 == 8) {
                this.f2674c.add(i10, new h.a(9, cVar2, true));
                aVar.f2692c = true;
                i10++;
                cVar2 = aVar.b;
            }
            i10++;
        }
        return cVar2;
    }

    public String C() {
        return this.f2682k;
    }

    public void D() {
        if (this.f2690s != null) {
            for (int i10 = 0; i10 < this.f2690s.size(); i10++) {
                this.f2690s.get(i10).run();
            }
            this.f2690s = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    /* JADX WARN: Code duplicated, block: B:14:0x002d  */
    public c E(ArrayList<c> arrayList, c cVar) {
        for (int size = this.f2674c.size() - 1; size >= 0; size--) {
            h.a aVar = this.f2674c.get(size);
            int i10 = aVar.f2691a;
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
                        aVar.f2698i = aVar.f2697h;
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
        if (!this.f2680i) {
            return true;
        }
        this.f2547t.k(this);
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
        this.f2547t.g0(this, false);
    }

    @Override // androidx.fragment.app.h
    public void j() {
        k();
        this.f2547t.g0(this, true);
    }

    @Override // androidx.fragment.app.h
    public void l(int i10, c cVar, String str, int i11) {
        super.l(i10, cVar, str, i11);
        cVar.f2620v = this.f2547t;
    }

    @Override // androidx.fragment.app.h
    @NonNull
    public h m(@NonNull c cVar) {
        FragmentManager fragmentManager = cVar.f2620v;
        if (fragmentManager == null || fragmentManager == this.f2547t) {
            return super.m(cVar);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + cVar.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.h
    @NonNull
    public h t(@NonNull c cVar) {
        FragmentManager fragmentManager = cVar.f2620v;
        if (fragmentManager == null || fragmentManager == this.f2547t) {
            return super.t(cVar);
        }
        throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + cVar.toString() + " is already attached to a FragmentManager.");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f2549v >= 0) {
            sb2.append(" #");
            sb2.append(this.f2549v);
        }
        if (this.f2682k != null) {
            sb2.append(" ");
            sb2.append(this.f2682k);
        }
        sb2.append("}");
        return sb2.toString();
    }

    public void u(int i10) {
        if (this.f2680i) {
            if (FragmentManager.N0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i10);
            }
            int size = this.f2674c.size();
            for (int i11 = 0; i11 < size; i11++) {
                h.a aVar = this.f2674c.get(i11);
                c cVar = aVar.b;
                if (cVar != null) {
                    cVar.f2619u += i10;
                    if (FragmentManager.N0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.b + " to " + aVar.b.f2619u);
                    }
                }
            }
        }
    }

    public void v() {
        int size = this.f2674c.size() - 1;
        while (size >= 0) {
            h.a aVar = this.f2674c.get(size);
            if (aVar.f2692c) {
                if (aVar.f2691a == 8) {
                    aVar.f2692c = false;
                    this.f2674c.remove(size - 1);
                    size--;
                } else {
                    int i10 = aVar.b.A;
                    aVar.f2691a = 2;
                    aVar.f2692c = false;
                    for (int i11 = size - 1; i11 >= 0; i11--) {
                        h.a aVar2 = this.f2674c.get(i11);
                        if (aVar2.f2692c && aVar2.b.A == i10) {
                            this.f2674c.remove(i11);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    public int w(boolean z10, boolean z11) {
        if (this.f2548u) {
            throw new IllegalStateException("commit already called");
        }
        if (FragmentManager.N0(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new m0("FragmentManager"));
            x("  ", printWriter);
            printWriter.close();
        }
        this.f2548u = true;
        if (this.f2680i) {
            this.f2549v = this.f2547t.o();
        } else {
            this.f2549v = -1;
        }
        if (z11) {
            this.f2547t.d0(this, z10);
        }
        return this.f2549v;
    }

    public void x(String str, PrintWriter printWriter) {
        y(str, printWriter, true);
    }

    public void y(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f2682k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f2549v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f2548u);
            if (this.f2679h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f2679h));
            }
            if (this.f2675d != 0 || this.f2676e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2675d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2676e));
            }
            if (this.f2677f != 0 || this.f2678g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2677f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2678g));
            }
            if (this.f2683l != 0 || this.f2684m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2683l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f2684m);
            }
            if (this.f2685n != 0 || this.f2686o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2685n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f2686o);
            }
        }
        if (this.f2674c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f2674c.size();
        for (int i10 = 0; i10 < size; i10++) {
            h.a aVar = this.f2674c.get(i10);
            switch (aVar.f2691a) {
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
                    str2 = "cmd=" + aVar.f2691a;
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
                if (aVar.f2693d != 0 || aVar.f2694e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f2693d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f2694e));
                }
                if (aVar.f2695f != 0 || aVar.f2696g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f2695f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f2696g));
                }
            }
        }
    }

    public void z() {
        int size = this.f2674c.size();
        for (int i10 = 0; i10 < size; i10++) {
            h.a aVar = this.f2674c.get(i10);
            c cVar = aVar.b;
            if (cVar != null) {
                cVar.f2613o = this.f2550w;
                cVar.T1(false);
                cVar.S1(this.f2679h);
                cVar.W1(this.f2687p, this.f2688q);
            }
            switch (aVar.f2691a) {
                case 1:
                    cVar.N1(aVar.f2693d, aVar.f2694e, aVar.f2695f, aVar.f2696g);
                    this.f2547t.r1(cVar, false);
                    this.f2547t.l(cVar);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f2691a);
                case 3:
                    cVar.N1(aVar.f2693d, aVar.f2694e, aVar.f2695f, aVar.f2696g);
                    this.f2547t.j1(cVar);
                    break;
                case 4:
                    cVar.N1(aVar.f2693d, aVar.f2694e, aVar.f2695f, aVar.f2696g);
                    this.f2547t.K0(cVar);
                    break;
                case 5:
                    cVar.N1(aVar.f2693d, aVar.f2694e, aVar.f2695f, aVar.f2696g);
                    this.f2547t.r1(cVar, false);
                    this.f2547t.x1(cVar);
                    break;
                case 6:
                    cVar.N1(aVar.f2693d, aVar.f2694e, aVar.f2695f, aVar.f2696g);
                    this.f2547t.B(cVar);
                    break;
                case 7:
                    cVar.N1(aVar.f2693d, aVar.f2694e, aVar.f2695f, aVar.f2696g);
                    this.f2547t.r1(cVar, false);
                    this.f2547t.q(cVar);
                    break;
                case 8:
                    this.f2547t.v1(cVar);
                    break;
                case 9:
                    this.f2547t.v1(null);
                    break;
                case 10:
                    aVar.f2697h = cVar.U;
                    this.f2547t.u1(cVar, aVar.f2698i);
                    break;
            }
        }
    }
}
