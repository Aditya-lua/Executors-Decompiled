package o5;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class b0 extends q {
    public int S;
    public ArrayList<q> Q = new ArrayList<>();
    public boolean R = true;
    public boolean T = false;
    public int U = 0;

    public class a extends x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q f27077a;

        public a(q qVar) {
            this.f27077a = qVar;
        }

        @Override // o5.x, o5.q.h
        public void k(@NonNull q qVar) {
            this.f27077a.q0();
            qVar.m0(this);
        }
    }

    public class b extends x {
        public b() {
        }

        @Override // o5.x, o5.q.h
        public void a(@NonNull q qVar) {
            b0.this.Q.remove(qVar);
            if (b0.this.X()) {
                return;
            }
            b0.this.i0(q.i.f27199c, false);
            b0 b0Var = b0.this;
            b0Var.B = true;
            b0Var.i0(q.i.b, false);
        }
    }

    public static class c extends x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public b0 f27079a;

        public c(b0 b0Var) {
            this.f27079a = b0Var;
        }

        @Override // o5.x, o5.q.h
        public void g(@NonNull q qVar) {
            b0 b0Var = this.f27079a;
            if (b0Var.T) {
                return;
            }
            b0Var.z0();
            this.f27079a.T = true;
        }

        @Override // o5.x, o5.q.h
        public void k(@NonNull q qVar) {
            b0 b0Var = this.f27079a;
            int i10 = b0Var.S - 1;
            b0Var.S = i10;
            if (i10 == 0) {
                b0Var.T = false;
                b0Var.w();
            }
            qVar.m0(this);
        }
    }

    @Override // o5.q
    public String A0(String str) {
        String strA0 = super.A0(str);
        for (int i10 = 0; i10 < this.Q.size(); i10++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strA0);
            sb2.append("\n");
            sb2.append(this.Q.get(i10).A0(str + "  "));
            strA0 = sb2.toString();
        }
        return strA0;
    }

    @Override // o5.q
    @NonNull
    /* JADX INFO: renamed from: B0, reason: merged with bridge method [inline-methods] */
    public b0 c(@NonNull q.h hVar) {
        return (b0) super.c(hVar);
    }

    @Override // o5.q
    @NonNull
    /* JADX INFO: renamed from: C0, reason: merged with bridge method [inline-methods] */
    public b0 e(@NonNull View view) {
        for (int i10 = 0; i10 < this.Q.size(); i10++) {
            this.Q.get(i10).e(view);
        }
        return (b0) super.e(view);
    }

    @NonNull
    public b0 D0(@NonNull q qVar) {
        E0(qVar);
        long j10 = this.f27158c;
        if (j10 >= 0) {
            qVar.t0(j10);
        }
        if ((this.U & 1) != 0) {
            qVar.v0(D());
        }
        if ((this.U & 2) != 0) {
            qVar.x0(K());
        }
        if ((this.U & 4) != 0) {
            qVar.w0(J());
        }
        if ((this.U & 8) != 0) {
            qVar.u0(C());
        }
        return this;
    }

    public final void E0(@NonNull q qVar) {
        this.Q.add(qVar);
        qVar.f27173r = this;
    }

    public q F0(int i10) {
        if (i10 < 0 || i10 >= this.Q.size()) {
            return null;
        }
        return this.Q.get(i10);
    }

    public int G0() {
        return this.Q.size();
    }

    public final int H0(long j10) {
        for (int i10 = 1; i10 < this.Q.size(); i10++) {
            if (this.Q.get(i10).L > j10) {
                return i10 - 1;
            }
        }
        return this.Q.size() - 1;
    }

    @Override // o5.q
    @NonNull
    /* JADX INFO: renamed from: I0, reason: merged with bridge method [inline-methods] */
    public b0 m0(@NonNull q.h hVar) {
        return (b0) super.m0(hVar);
    }

    @Override // o5.q
    @NonNull
    /* JADX INFO: renamed from: J0, reason: merged with bridge method [inline-methods] */
    public b0 n0(@NonNull View view) {
        for (int i10 = 0; i10 < this.Q.size(); i10++) {
            this.Q.get(i10).n0(view);
        }
        return (b0) super.n0(view);
    }

    @Override // o5.q
    @NonNull
    /* JADX INFO: renamed from: K0, reason: merged with bridge method [inline-methods] */
    public b0 t0(long j10) {
        ArrayList<q> arrayList;
        super.t0(j10);
        if (this.f27158c >= 0 && (arrayList = this.Q) != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.Q.get(i10).t0(j10);
            }
        }
        return this;
    }

    @Override // o5.q
    @NonNull
    /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
    public b0 v0(TimeInterpolator timeInterpolator) {
        this.U |= 1;
        ArrayList<q> arrayList = this.Q;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.Q.get(i10).v0(timeInterpolator);
            }
        }
        return (b0) super.v0(timeInterpolator);
    }

    @NonNull
    public b0 M0(int i10) {
        if (i10 == 0) {
            this.R = true;
            return this;
        }
        if (i10 == 1) {
            this.R = false;
            return this;
        }
        throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i10);
    }

    @Override // o5.q
    @NonNull
    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    public b0 y0(long j10) {
        return (b0) super.y0(j10);
    }

    public final void O0() {
        c cVar = new c(this);
        ArrayList<q> arrayList = this.Q;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            q qVar = arrayList.get(i10);
            i10++;
            qVar.c(cVar);
        }
        this.S = this.Q.size();
    }

    @Override // o5.q
    public boolean X() {
        for (int i10 = 0; i10 < this.Q.size(); i10++) {
            if (this.Q.get(i10).X()) {
                return true;
            }
        }
        return false;
    }

    @Override // o5.q
    public boolean Y() {
        int size = this.Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!this.Q.get(i10).Y()) {
                return false;
            }
        }
        return true;
    }

    @Override // o5.q
    public void cancel() {
        super.cancel();
        int size = this.Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.Q.get(i10).cancel();
        }
    }

    @Override // o5.q
    public void j(@NonNull d0 d0Var) {
        if (a0(d0Var.b)) {
            ArrayList<q> arrayList = this.Q;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                q qVar = arrayList.get(i10);
                i10++;
                q qVar2 = qVar;
                if (qVar2.a0(d0Var.b)) {
                    qVar2.j(d0Var);
                    d0Var.f27090c.add(qVar2);
                }
            }
        }
    }

    @Override // o5.q
    public void j0(View view) {
        super.j0(view);
        int size = this.Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.Q.get(i10).j0(view);
        }
    }

    @Override // o5.q
    public void l0() {
        this.J = 0L;
        b bVar = new b();
        for (int i10 = 0; i10 < this.Q.size(); i10++) {
            q qVar = this.Q.get(i10);
            qVar.c(bVar);
            qVar.l0();
            long jU = qVar.U();
            if (this.R) {
                this.J = Math.max(this.J, jU);
            } else {
                long j10 = this.J;
                qVar.L = j10;
                this.J = j10 + jU;
            }
        }
    }

    @Override // o5.q
    public void n(d0 d0Var) {
        super.n(d0Var);
        int size = this.Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.Q.get(i10).n(d0Var);
        }
    }

    @Override // o5.q
    public void o(@NonNull d0 d0Var) {
        if (a0(d0Var.b)) {
            ArrayList<q> arrayList = this.Q;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                q qVar = arrayList.get(i10);
                i10++;
                q qVar2 = qVar;
                if (qVar2.a0(d0Var.b)) {
                    qVar2.o(d0Var);
                    d0Var.f27090c.add(qVar2);
                }
            }
        }
    }

    @Override // o5.q
    public void o0(View view) {
        super.o0(view);
        int size = this.Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.Q.get(i10).o0(view);
        }
    }

    @Override // o5.q
    public void q0() {
        if (this.Q.isEmpty()) {
            z0();
            w();
            return;
        }
        O0();
        int i10 = 0;
        if (this.R) {
            ArrayList<q> arrayList = this.Q;
            int size = arrayList.size();
            while (i10 < size) {
                q qVar = arrayList.get(i10);
                i10++;
                qVar.q0();
            }
            return;
        }
        for (int i11 = 1; i11 < this.Q.size(); i11++) {
            this.Q.get(i11 - 1).c(new a(this.Q.get(i11)));
        }
        q qVar2 = this.Q.get(0);
        if (qVar2 != null) {
            qVar2.q0();
        }
    }

    @Override // o5.q
    @NonNull
    /* JADX INFO: renamed from: r */
    public q clone() {
        b0 b0Var = (b0) super.clone();
        b0Var.Q = new ArrayList<>();
        int size = this.Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            b0Var.E0(this.Q.get(i10).clone());
        }
        return b0Var;
    }

    @Override // o5.q
    public void r0(boolean z10) {
        super.r0(z10);
        int size = this.Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.Q.get(i10).r0(z10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:56:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    @Override // o5.q
    public void s0(long j10, long j11) {
        long j12;
        long jU = U();
        long j13 = 0;
        if (this.f27173r != null) {
            if (j10 < 0 && j11 < 0) {
                return;
            }
            if (j10 > jU && j11 > jU) {
                return;
            }
        }
        boolean z10 = j10 < j11;
        if ((j10 >= 0 && j11 < 0) || (j10 <= jU && j11 > jU)) {
            this.B = false;
            i0(q.i.f27198a, z10);
        }
        if (!this.R) {
            int iH0 = H0(j11);
            if (j10 >= j11) {
                while (true) {
                    if (iH0 < this.Q.size()) {
                        q qVar = this.Q.get(iH0);
                        long j14 = qVar.L;
                        j12 = j13;
                        long j15 = j10 - j14;
                        if (j15 < j12) {
                            break;
                        }
                        qVar.s0(j15, j11 - j14);
                        iH0++;
                        j13 = j12;
                    }
                }
            } else {
                j12 = 0;
                while (iH0 >= 0) {
                    q qVar2 = this.Q.get(iH0);
                    long j16 = qVar2.L;
                    long j17 = j10 - j16;
                    qVar2.s0(j17, j11 - j16);
                    if (j17 >= 0) {
                        break;
                    } else {
                        iH0--;
                    }
                }
            }
            if (this.f27173r != null) {
                if ((j10 > jU || j11 > jU) && (j10 >= 0 || j11 < j12)) {
                    return;
                }
                if (j10 > jU) {
                    this.B = true;
                }
                i0(q.i.b, z10);
            }
        }
        for (int i10 = 0; i10 < this.Q.size(); i10++) {
            this.Q.get(i10).s0(j10, j11);
        }
        j12 = j13;
        if (this.f27173r != null) {
            if (j10 > jU) {
                return;
            } else {
                return;
            }
            if (j10 > jU) {
                this.B = true;
            }
            i0(q.i.b, z10);
        }
    }

    @Override // o5.q
    public void t(@NonNull ViewGroup viewGroup, @NonNull e0 e0Var, @NonNull e0 e0Var2, @NonNull ArrayList<d0> arrayList, @NonNull ArrayList<d0> arrayList2) {
        long jP = P();
        int size = this.Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            q qVar = this.Q.get(i10);
            if (jP > 0 && (this.R || i10 == 0)) {
                long jP2 = qVar.P();
                if (jP2 > 0) {
                    qVar.y0(jP2 + jP);
                } else {
                    qVar.y0(jP);
                }
            }
            qVar.t(viewGroup, e0Var, e0Var2, arrayList, arrayList2);
        }
    }

    @Override // o5.q
    public void u0(q.e eVar) {
        super.u0(eVar);
        this.U |= 8;
        int size = this.Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.Q.get(i10).u0(eVar);
        }
    }

    @Override // o5.q
    public void w0(k kVar) {
        super.w0(kVar);
        this.U |= 4;
        if (this.Q != null) {
            for (int i10 = 0; i10 < this.Q.size(); i10++) {
                this.Q.get(i10).w0(kVar);
            }
        }
    }

    @Override // o5.q
    public void x(ViewGroup viewGroup) {
        super.x(viewGroup);
        int size = this.Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.Q.get(i10).x(viewGroup);
        }
    }

    @Override // o5.q
    public void x0(z zVar) {
        super.x0(zVar);
        this.U |= 2;
        int size = this.Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.Q.get(i10).x0(zVar);
        }
    }
}
