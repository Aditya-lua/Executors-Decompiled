package g6;

import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import f6.j0;
import f6.k0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import x5.o0;
import x5.q0;
import y5.f1;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f17922a = x5.w.i("EnqueueRunnable");

    public static boolean a(y5.f0 f0Var) {
        f1 f1VarH = f0Var.h();
        WorkDatabase workDatabaseU = f1VarH.u();
        workDatabaseU.i();
        try {
            k.a(workDatabaseU, f1VarH.n(), f0Var);
            boolean zE = e(f0Var);
            workDatabaseU.V();
            return zE;
        } finally {
            workDatabaseU.p();
        }
    }

    public static void b(y5.f0 f0Var) {
        if (!f0Var.i()) {
            if (a(f0Var)) {
                f(f0Var);
            }
        } else {
            throw new IllegalStateException("WorkContinuation has cycles (" + f0Var + ")");
        }
    }

    public static boolean c(y5.f0 f0Var) {
        boolean zD = d(f0Var.h(), f0Var.g(), (String[]) y5.f0.m(f0Var).toArray(new String[0]), f0Var.e(), f0Var.c());
        f0Var.l();
        return zD;
    }

    /* JADX WARN: Code duplicated, block: B:84:0x0154  */
    public static boolean d(f1 f1Var, List<? extends q0> list, String[] strArr, String str, x5.j jVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        f1 f1Var2;
        WorkDatabase workDatabase;
        boolean z13;
        String[] strArr2 = strArr;
        long jA = f1Var.n().getClock().a();
        WorkDatabase workDatabaseU = f1Var.u();
        boolean z14 = strArr2 != null && strArr2.length > 0;
        if (z14) {
            z10 = false;
            z11 = false;
            z12 = true;
            for (String str2 : strArr2) {
                j0 j0VarK = workDatabaseU.c0().k(str2);
                if (j0VarK == null) {
                    x5.w.e().c(f17922a, "Prerequisite " + str2 + " doesn't exist; not enqueuing");
                    return false;
                }
                o0.c cVar = j0VarK.state;
                z12 &= cVar == o0.c.SUCCEEDED;
                if (cVar == o0.c.FAILED) {
                    z11 = true;
                } else if (cVar == o0.c.CANCELLED) {
                    z10 = true;
                }
            }
        } else {
            z10 = false;
            z11 = false;
            z12 = true;
        }
        boolean zIsEmpty = TextUtils.isEmpty(str);
        if (zIsEmpty || z14) {
            f1Var2 = f1Var;
            workDatabase = workDatabaseU;
            z13 = false;
        } else {
            List<j0.IdAndState> listR = workDatabaseU.c0().r(str);
            if (listR.isEmpty()) {
                f1Var2 = f1Var;
                workDatabase = workDatabaseU;
            } else if (jVar == x5.j.APPEND || jVar == x5.j.APPEND_OR_REPLACE) {
                f1Var2 = f1Var;
                f6.b bVarX = workDatabaseU.X();
                List arrayList = new ArrayList();
                for (j0.IdAndState idAndState : listR) {
                    if (!bVarX.d(idAndState.id)) {
                        o0.c cVar2 = idAndState.state;
                        boolean z15 = (cVar2 == o0.c.SUCCEEDED) & z12;
                        if (cVar2 == o0.c.FAILED) {
                            z11 = true;
                        } else if (cVar2 == o0.c.CANCELLED) {
                            z10 = true;
                        }
                        arrayList.add(idAndState.id);
                        z12 = z15;
                    }
                    workDatabaseU = workDatabaseU;
                }
                workDatabase = workDatabaseU;
                if (jVar == x5.j.APPEND_OR_REPLACE && (z10 || z11)) {
                    k0 k0VarC0 = workDatabase.c0();
                    Iterator<j0.IdAndState> it = k0VarC0.r(str).iterator();
                    while (it.hasNext()) {
                        k0VarC0.a(it.next().id);
                    }
                    arrayList = Collections.EMPTY_LIST;
                    z10 = false;
                    z11 = false;
                }
                strArr2 = (String[]) arrayList.toArray(strArr2);
                z14 = strArr2.length > 0;
            } else {
                if (jVar == x5.j.KEEP) {
                    Iterator<j0.IdAndState> it2 = listR.iterator();
                    while (it2.hasNext()) {
                        o0.c cVar3 = it2.next().state;
                        if (cVar3 == o0.c.ENQUEUED || cVar3 == o0.c.RUNNING) {
                            return false;
                        }
                    }
                }
                f1Var2 = f1Var;
                h.m(str, f1Var2);
                k0 k0VarC1 = workDatabaseU.c0();
                Iterator<j0.IdAndState> it3 = listR.iterator();
                while (it3.hasNext()) {
                    k0VarC1.a(it3.next().id);
                }
                workDatabase = workDatabaseU;
                z13 = true;
            }
            z13 = false;
        }
        Iterator<? extends q0> it4 = list.iterator();
        while (it4.hasNext()) {
            q0 next = it4.next();
            j0 workSpec = next.getWorkSpec();
            if (!z14 || z12) {
                workSpec.lastEnqueueTime = jA;
            } else if (z11) {
                workSpec.state = o0.c.FAILED;
            } else if (z10) {
                workSpec.state = o0.c.CANCELLED;
            } else {
                workSpec.state = o0.c.BLOCKED;
            }
            if (workSpec.state == o0.c.ENQUEUED) {
                z13 = true;
            }
            workDatabase.c0().h(k.c(f1Var2.s(), workSpec));
            if (z14) {
                int length = strArr2.length;
                int i10 = 0;
                while (i10 < length) {
                    workDatabase.X().c(new f6.a(next.b(), strArr2[i10]));
                    i10++;
                    it4 = it4;
                    strArr2 = strArr2;
                }
            }
            String[] strArr3 = strArr2;
            Iterator<? extends q0> it5 = it4;
            workDatabase.d0().d(next.b(), next.c());
            if (!zIsEmpty) {
                workDatabase.a0().a(new f6.x(str, next.b()));
            }
            it4 = it5;
            strArr2 = strArr3;
        }
        return z13;
    }

    public static boolean e(y5.f0 f0Var) {
        List<y5.f0> listF = f0Var.f();
        boolean zE = false;
        if (listF != null) {
            for (y5.f0 f0Var2 : listF) {
                if (f0Var2.k()) {
                    x5.w.e().k(f17922a, "Already enqueued work ids (" + TextUtils.join(", ", f0Var2.d()) + ")");
                } else {
                    zE |= e(f0Var2);
                }
            }
        }
        return c(f0Var) | zE;
    }

    public static void f(y5.f0 f0Var) {
        f1 f1VarH = f0Var.h();
        y5.x.f(f1VarH.n(), f1VarH.u(), f1VarH.s());
    }
}
