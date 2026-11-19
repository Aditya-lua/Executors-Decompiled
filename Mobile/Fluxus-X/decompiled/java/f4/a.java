package f4;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class a extends t0 implements k0.p {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final k0 f15270t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f15271u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f15272v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f15273w;

    public a(@NonNull k0 k0Var) {
        super(k0Var.y0(), k0Var.A0() != null ? k0Var.A0().getContext().getClassLoader() : null);
        this.f15272v = -1;
        this.f15273w = false;
        this.f15270t = k0Var;
    }

    public void A() {
        for (int size = this.f15560c.size() - 1; size >= 0; size--) {
            t0.a aVar = this.f15560c.get(size);
            q qVar = aVar.b;
            if (qVar != null) {
                qVar.f15487o = this.f15273w;
                qVar.T1(true);
                qVar.S1(k0.o1(this.f15565h));
                qVar.W1(this.f15574q, this.f15573p);
            }
            switch (aVar.f15577a) {
                case 1:
                    qVar.N1(aVar.f15579d, aVar.f15580e, aVar.f15581f, aVar.f15582g);
                    this.f15270t.r1(qVar, true);
                    this.f15270t.j1(qVar);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f15577a);
                case 3:
                    qVar.N1(aVar.f15579d, aVar.f15580e, aVar.f15581f, aVar.f15582g);
                    this.f15270t.l(qVar);
                    break;
                case 4:
                    qVar.N1(aVar.f15579d, aVar.f15580e, aVar.f15581f, aVar.f15582g);
                    this.f15270t.x1(qVar);
                    break;
                case 5:
                    qVar.N1(aVar.f15579d, aVar.f15580e, aVar.f15581f, aVar.f15582g);
                    this.f15270t.r1(qVar, true);
                    this.f15270t.K0(qVar);
                    break;
                case 6:
                    qVar.N1(aVar.f15579d, aVar.f15580e, aVar.f15581f, aVar.f15582g);
                    this.f15270t.q(qVar);
                    break;
                case 7:
                    qVar.N1(aVar.f15579d, aVar.f15580e, aVar.f15581f, aVar.f15582g);
                    this.f15270t.r1(qVar, true);
                    this.f15270t.B(qVar);
                    break;
                case 8:
                    this.f15270t.v1(null);
                    break;
                case 9:
                    this.f15270t.v1(qVar);
                    break;
                case 10:
                    aVar.f15584i = qVar.U;
                    this.f15270t.u1(qVar, aVar.f15583h);
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b6  */
    public q B(ArrayList<q> arrayList, q qVar) {
        q qVar2 = qVar;
        int i10 = 0;
        while (i10 < this.f15560c.size()) {
            t0.a aVar = this.f15560c.get(i10);
            int i11 = aVar.f15577a;
            if (i11 == 1) {
                arrayList.add(aVar.b);
            } else if (i11 == 2) {
                q qVar3 = aVar.b;
                int i12 = qVar3.A;
                boolean z10 = false;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    q qVar4 = arrayList.get(size);
                    if (qVar4.A == i12) {
                        if (qVar4 == qVar3) {
                            z10 = true;
                        } else {
                            if (qVar4 == qVar2) {
                                this.f15560c.add(i10, new t0.a(9, qVar4, true));
                                i10++;
                                qVar2 = null;
                            }
                            t0.a aVar2 = new t0.a(3, qVar4, true);
                            aVar2.f15579d = aVar.f15579d;
                            aVar2.f15581f = aVar.f15581f;
                            aVar2.f15580e = aVar.f15580e;
                            aVar2.f15582g = aVar.f15582g;
                            this.f15560c.add(i10, aVar2);
                            arrayList.remove(qVar4);
                            i10++;
                        }
                    }
                }
                if (z10) {
                    this.f15560c.remove(i10);
                    i10--;
                } else {
                    aVar.f15577a = 1;
                    aVar.f15578c = true;
                    arrayList.add(qVar3);
                }
            } else if (i11 == 3 || i11 == 6) {
                arrayList.remove(aVar.b);
                q qVar5 = aVar.b;
                if (qVar5 == qVar2) {
                    this.f15560c.add(i10, new t0.a(9, qVar5));
                    i10++;
                    qVar2 = null;
                }
            } else if (i11 == 7) {
                arrayList.add(aVar.b);
            } else if (i11 == 8) {
                this.f15560c.add(i10, new t0.a(9, qVar2, true));
                aVar.f15578c = true;
                i10++;
                qVar2 = aVar.b;
            }
            i10++;
        }
        return qVar2;
    }

    public String C() {
        return this.f15568k;
    }

    public void D() {
        if (this.f15576s != null) {
            for (int i10 = 0; i10 < this.f15576s.size(); i10++) {
                this.f15576s.get(i10).run();
            }
            this.f15576s = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    /* JADX WARN: Code duplicated, block: B:14:0x002d  */
    public q E(ArrayList<q> arrayList, q qVar) {
        for (int size = this.f15560c.size() - 1; size >= 0; size--) {
            t0.a aVar = this.f15560c.get(size);
            int i10 = aVar.f15577a;
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
                        qVar = null;
                        break;
                    case 9:
                        qVar = aVar.b;
                        break;
                    case 10:
                        aVar.f15584i = aVar.f15583h;
                        break;
                }
            } else {
                arrayList.add(aVar.b);
            }
        }
        return qVar;
    }

    @Override // f4.k0.p
    public boolean a(@NonNull ArrayList<a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
        if (k0.N0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f15566i) {
            return true;
        }
        this.f15270t.k(this);
        return true;
    }

    @Override // f4.t0
    public int g() {
        return w(false, true);
    }

    @Override // f4.t0
    public int h() {
        return w(true, true);
    }

    @Override // f4.t0
    public void i() {
        k();
        this.f15270t.g0(this, false);
    }

    @Override // f4.t0
    public void j() {
        k();
        this.f15270t.g0(this, true);
    }

    @Override // f4.t0
    public void l(int i10, q qVar, String str, int i11) {
        super.l(i10, qVar, str, i11);
        qVar.f15494v = this.f15270t;
    }

    @Override // f4.t0
    @NonNull
    public t0 m(@NonNull q qVar) {
        k0 k0Var = qVar.f15494v;
        if (k0Var == null || k0Var == this.f15270t) {
            return super.m(qVar);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + qVar.toString() + " is already attached to a FragmentManager.");
    }

    @Override // f4.t0
    @NonNull
    public t0 t(@NonNull q qVar) {
        k0 k0Var = qVar.f15494v;
        if (k0Var == null || k0Var == this.f15270t) {
            return super.t(qVar);
        }
        throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + qVar.toString() + " is already attached to a FragmentManager.");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(Barcode.FORMAT_ITF);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f15272v >= 0) {
            sb2.append(" #");
            sb2.append(this.f15272v);
        }
        if (this.f15568k != null) {
            sb2.append(" ");
            sb2.append(this.f15568k);
        }
        sb2.append("}");
        return sb2.toString();
    }

    public void u(int i10) {
        if (this.f15566i) {
            if (k0.N0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i10);
            }
            int size = this.f15560c.size();
            for (int i11 = 0; i11 < size; i11++) {
                t0.a aVar = this.f15560c.get(i11);
                q qVar = aVar.b;
                if (qVar != null) {
                    qVar.f15493u += i10;
                    if (k0.N0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.b + " to " + aVar.b.f15493u);
                    }
                }
            }
        }
    }

    public void v() {
        int size = this.f15560c.size() - 1;
        while (size >= 0) {
            t0.a aVar = this.f15560c.get(size);
            if (aVar.f15578c) {
                if (aVar.f15577a == 8) {
                    aVar.f15578c = false;
                    this.f15560c.remove(size - 1);
                    size--;
                } else {
                    int i10 = aVar.b.A;
                    aVar.f15577a = 2;
                    aVar.f15578c = false;
                    for (int i11 = size - 1; i11 >= 0; i11--) {
                        t0.a aVar2 = this.f15560c.get(i11);
                        if (aVar2.f15578c && aVar2.b.A == i10) {
                            this.f15560c.remove(i11);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    public int w(boolean z10, boolean z11) {
        if (this.f15271u) {
            throw new IllegalStateException("commit already called");
        }
        if (k0.N0(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new z0("FragmentManager"));
            x("  ", printWriter);
            printWriter.close();
        }
        this.f15271u = true;
        if (this.f15566i) {
            this.f15272v = this.f15270t.o();
        } else {
            this.f15272v = -1;
        }
        if (z11) {
            this.f15270t.d0(this, z10);
        }
        return this.f15272v;
    }

    public void x(String str, PrintWriter printWriter) {
        y(str, printWriter, true);
    }

    public void y(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f15568k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f15272v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f15271u);
            if (this.f15565h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f15565h));
            }
            if (this.f15561d != 0 || this.f15562e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f15561d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f15562e));
            }
            if (this.f15563f != 0 || this.f15564g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f15563f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f15564g));
            }
            if (this.f15569l != 0 || this.f15570m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f15569l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f15570m);
            }
            if (this.f15571n != 0 || this.f15572o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f15571n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f15572o);
            }
        }
        if (this.f15560c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f15560c.size();
        for (int i10 = 0; i10 < size; i10++) {
            t0.a aVar = this.f15560c.get(i10);
            switch (aVar.f15577a) {
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
                    str2 = "cmd=" + aVar.f15577a;
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
                if (aVar.f15579d != 0 || aVar.f15580e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f15579d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f15580e));
                }
                if (aVar.f15581f != 0 || aVar.f15582g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f15581f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f15582g));
                }
            }
        }
    }

    public void z() {
        int size = this.f15560c.size();
        for (int i10 = 0; i10 < size; i10++) {
            t0.a aVar = this.f15560c.get(i10);
            q qVar = aVar.b;
            if (qVar != null) {
                qVar.f15487o = this.f15273w;
                qVar.T1(false);
                qVar.S1(this.f15565h);
                qVar.W1(this.f15573p, this.f15574q);
            }
            switch (aVar.f15577a) {
                case 1:
                    qVar.N1(aVar.f15579d, aVar.f15580e, aVar.f15581f, aVar.f15582g);
                    this.f15270t.r1(qVar, false);
                    this.f15270t.l(qVar);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f15577a);
                case 3:
                    qVar.N1(aVar.f15579d, aVar.f15580e, aVar.f15581f, aVar.f15582g);
                    this.f15270t.j1(qVar);
                    break;
                case 4:
                    qVar.N1(aVar.f15579d, aVar.f15580e, aVar.f15581f, aVar.f15582g);
                    this.f15270t.K0(qVar);
                    break;
                case 5:
                    qVar.N1(aVar.f15579d, aVar.f15580e, aVar.f15581f, aVar.f15582g);
                    this.f15270t.r1(qVar, false);
                    this.f15270t.x1(qVar);
                    break;
                case 6:
                    qVar.N1(aVar.f15579d, aVar.f15580e, aVar.f15581f, aVar.f15582g);
                    this.f15270t.B(qVar);
                    break;
                case 7:
                    qVar.N1(aVar.f15579d, aVar.f15580e, aVar.f15581f, aVar.f15582g);
                    this.f15270t.r1(qVar, false);
                    this.f15270t.q(qVar);
                    break;
                case 8:
                    this.f15270t.v1(qVar);
                    break;
                case 9:
                    this.f15270t.v1(null);
                    break;
                case 10:
                    aVar.f15583h = qVar.U;
                    this.f15270t.u1(qVar, aVar.f15584i);
                    break;
            }
        }
    }
}
