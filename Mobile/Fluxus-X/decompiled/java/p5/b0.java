package p5;

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
        public final /* synthetic */ q f28813a;

        public a(q qVar) {
            this.f28813a = qVar;
        }

        @Override // p5.x, p5.q.h
        public void b(@NonNull q qVar) {
            this.f28813a.u0();
            qVar.q0(this);
        }
    }

    public class b extends x {
        public b() {
        }

        @Override // p5.x, p5.q.h
        public void k(@NonNull q qVar) {
            b0.this.Q.remove(qVar);
            if (b0.this.a0()) {
                return;
            }
            b0.this.m0(q.i.f28935c, false);
            b0 b0Var = b0.this;
            b0Var.B = true;
            b0Var.m0(q.i.b, false);
        }
    }

    public static class c extends x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public b0 f28815a;

        public c(b0 b0Var) {
            this.f28815a = b0Var;
        }

        @Override // p5.x, p5.q.h
        public void b(@NonNull q qVar) {
            b0 b0Var = this.f28815a;
            int i10 = b0Var.S - 1;
            b0Var.S = i10;
            if (i10 == 0) {
                b0Var.T = false;
                b0Var.y();
            }
            qVar.q0(this);
        }

        @Override // p5.x, p5.q.h
        public void c(@NonNull q qVar) {
            b0 b0Var = this.f28815a;
            if (b0Var.T) {
                return;
            }
            b0Var.D0();
            this.f28815a.T = true;
        }
    }

    @Override // p5.q
    public void A0(k kVar) {
        super.A0(kVar);
        this.U |= 4;
        if (this.Q != null) {
            for (int i10 = 0; i10 < this.Q.size(); i10++) {
                this.Q.get(i10).A0(kVar);
            }
        }
    }

    @Override // p5.q
    public void B0(z zVar) {
        super.B0(zVar);
        this.U |= 2;
        int size = this.Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.Q.get(i10).B0(zVar);
        }
    }

    @Override // p5.q
    public String E0(String str) {
        String strE0 = super.E0(str);
        for (int i10 = 0; i10 < this.Q.size(); i10++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strE0);
            sb2.append("\n");
            sb2.append(this.Q.get(i10).E0(str + "  "));
            strE0 = sb2.toString();
        }
        return strE0;
    }

    @Override // p5.q
    @NonNull
    /* JADX INFO: renamed from: F0, reason: merged with bridge method [inline-methods] */
    public b0 c(@NonNull q.h hVar) {
        return (b0) super.c(hVar);
    }

    @Override // p5.q
    @NonNull
    /* JADX INFO: renamed from: G0, reason: merged with bridge method [inline-methods] */
    public b0 e(@NonNull View view) {
        for (int i10 = 0; i10 < this.Q.size(); i10++) {
            this.Q.get(i10).e(view);
        }
        return (b0) super.e(view);
    }

    @NonNull
    public b0 H0(@NonNull q qVar) {
        I0(qVar);
        long j10 = this.f28894c;
        if (j10 >= 0) {
            qVar.x0(j10);
        }
        if ((this.U & 1) != 0) {
            qVar.z0(F());
        }
        if ((this.U & 2) != 0) {
            qVar.B0(M());
        }
        if ((this.U & 4) != 0) {
            qVar.A0(J());
        }
        if ((this.U & 8) != 0) {
            qVar.y0(D());
        }
        return this;
    }

    public final void I0(@NonNull q qVar) {
        this.Q.add(qVar);
        qVar.f28909r = this;
    }

    public q J0(int i10) {
        if (i10 < 0 || i10 >= this.Q.size()) {
            return null;
        }
        return this.Q.get(i10);
    }

    public int K0() {
        return this.Q.size();
    }

    public final int L0(long j10) {
        for (int i10 = 1; i10 < this.Q.size(); i10++) {
            if (this.Q.get(i10).L > j10) {
                return i10 - 1;
            }
        }
        return this.Q.size() - 1;
    }

    @Override // p5.q
    @NonNull
    /* JADX INFO: renamed from: M0, reason: merged with bridge method [inline-methods] */
    public b0 q0(@NonNull q.h hVar) {
        return (b0) super.q0(hVar);
    }

    @Override // p5.q
    @NonNull
    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    public b0 r0(@NonNull View view) {
        for (int i10 = 0; i10 < this.Q.size(); i10++) {
            this.Q.get(i10).r0(view);
        }
        return (b0) super.r0(view);
    }

    @Override // p5.q
    @NonNull
    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
    public b0 x0(long j10) {
        ArrayList<q> arrayList;
        super.x0(j10);
        if (this.f28894c >= 0 && (arrayList = this.Q) != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.Q.get(i10).x0(j10);
            }
        }
        return this;
    }

    @Override // p5.q
    @NonNull
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public b0 z0(TimeInterpolator timeInterpolator) {
        this.U |= 1;
        ArrayList<q> arrayList = this.Q;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.Q.get(i10).z0(timeInterpolator);
            }
        }
        return (b0) super.z0(timeInterpolator);
    }

    @NonNull
    public b0 Q0(int i10) {
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

    @Override // p5.q
    @NonNull
    /* JADX INFO: renamed from: R0, reason: merged with bridge method [inline-methods] */
    public b0 C0(long j10) {
        return (b0) super.C0(j10);
    }

    public final void S0() {
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

    @Override // p5.q
    public boolean a0() {
        for (int i10 = 0; i10 < this.Q.size(); i10++) {
            if (this.Q.get(i10).a0()) {
                return true;
            }
        }
        return false;
    }

    @Override // p5.q
    public boolean c0() {
        int size = this.Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!this.Q.get(i10).c0()) {
                return false;
            }
        }
        return true;
    }

    @Override // p5.q
    public void cancel() {
        super.cancel();
        int size = this.Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.Q.get(i10).cancel();
        }
    }

    @Override // p5.q
    public void l(@NonNull d0 d0Var) {
        if (e0(d0Var.b)) {
            ArrayList<q> arrayList = this.Q;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                q qVar = arrayList.get(i10);
                i10++;
                q qVar2 = qVar;
                if (qVar2.e0(d0Var.b)) {
                    qVar2.l(d0Var);
                    d0Var.f28826c.add(qVar2);
                }
            }
        }
    }

    @Override // p5.q
    public void n0(View view) {
        super.n0(view);
        int size = this.Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.Q.get(i10).n0(view);
        }
    }

    @Override // p5.q
    public void p(d0 d0Var) {
        super.p(d0Var);
        int size = this.Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.Q.get(i10).p(d0Var);
        }
    }

    @Override // p5.q
    public void p0() {
        this.J = 0L;
        b bVar = new b();
        for (int i10 = 0; i10 < this.Q.size(); i10++) {
            q qVar = this.Q.get(i10);
            qVar.c(bVar);
            qVar.p0();
            long jX = qVar.X();
            if (this.R) {
                this.J = Math.max(this.J, jX);
            } else {
                long j10 = this.J;
                qVar.L = j10;
                this.J = j10 + jX;
            }
        }
    }

    @Override // p5.q
    public void q(@NonNull d0 d0Var) {
        if (e0(d0Var.b)) {
            ArrayList<q> arrayList = this.Q;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                q qVar = arrayList.get(i10);
                i10++;
                q qVar2 = qVar;
                if (qVar2.e0(d0Var.b)) {
                    qVar2.q(d0Var);
                    d0Var.f28826c.add(qVar2);
                }
            }
        }
    }

    @Override // p5.q
    public void s0(View view) {
        super.s0(view);
        int size = this.Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.Q.get(i10).s0(view);
        }
    }

    @Override // p5.q
    @NonNull
    /* JADX INFO: renamed from: t */
    public q clone() {
        b0 b0Var = (b0) super.clone();
        b0Var.Q = new ArrayList<>();
        int size = this.Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            b0Var.I0(this.Q.get(i10).clone());
        }
        return b0Var;
    }

    @Override // p5.q
    public void u0() {
        if (this.Q.isEmpty()) {
            D0();
            y();
            return;
        }
        S0();
        int i10 = 0;
        if (this.R) {
            ArrayList<q> arrayList = this.Q;
            int size = arrayList.size();
            while (i10 < size) {
                q qVar = arrayList.get(i10);
                i10++;
                qVar.u0();
            }
            return;
        }
        for (int i11 = 1; i11 < this.Q.size(); i11++) {
            this.Q.get(i11 - 1).c(new a(this.Q.get(i11)));
        }
        q qVar2 = this.Q.get(0);
        if (qVar2 != null) {
            qVar2.u0();
        }
    }

    @Override // p5.q
    public void v(@NonNull ViewGroup viewGroup, @NonNull e0 e0Var, @NonNull e0 e0Var2, @NonNull ArrayList<d0> arrayList, @NonNull ArrayList<d0> arrayList2) {
        long jR = R();
        int size = this.Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            q qVar = this.Q.get(i10);
            if (jR > 0 && (this.R || i10 == 0)) {
                long jR2 = qVar.R();
                if (jR2 > 0) {
                    qVar.C0(jR2 + jR);
                } else {
                    qVar.C0(jR);
                }
            }
            qVar.v(viewGroup, e0Var, e0Var2, arrayList, arrayList2);
        }
    }

    @Override // p5.q
    public void v0(boolean z10) {
        super.v0(z10);
        int size = this.Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.Q.get(i10).v0(z10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:56:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    @Override // p5.q
    public void w0(long j10, long j11) {
        long j12;
        long jX = X();
        long j13 = 0;
        if (this.f28909r != null) {
            if (j10 < 0 && j11 < 0) {
                return;
            }
            if (j10 > jX && j11 > jX) {
                return;
            }
        }
        boolean z10 = j10 < j11;
        if ((j10 >= 0 && j11 < 0) || (j10 <= jX && j11 > jX)) {
            this.B = false;
            m0(q.i.f28934a, z10);
        }
        if (!this.R) {
            int iL0 = L0(j11);
            if (j10 >= j11) {
                while (true) {
                    if (iL0 < this.Q.size()) {
                        q qVar = this.Q.get(iL0);
                        long j14 = qVar.L;
                        j12 = j13;
                        long j15 = j10 - j14;
                        if (j15 < j12) {
                            break;
                        }
                        qVar.w0(j15, j11 - j14);
                        iL0++;
                        j13 = j12;
                    }
                }
            } else {
                j12 = 0;
                while (iL0 >= 0) {
                    q qVar2 = this.Q.get(iL0);
                    long j16 = qVar2.L;
                    long j17 = j10 - j16;
                    qVar2.w0(j17, j11 - j16);
                    if (j17 >= 0) {
                        break;
                    } else {
                        iL0--;
                    }
                }
            }
            if (this.f28909r != null) {
                if ((j10 > jX || j11 > jX) && (j10 >= 0 || j11 < j12)) {
                    return;
                }
                if (j10 > jX) {
                    this.B = true;
                }
                m0(q.i.b, z10);
            }
        }
        for (int i10 = 0; i10 < this.Q.size(); i10++) {
            this.Q.get(i10).w0(j10, j11);
        }
        j12 = j13;
        if (this.f28909r != null) {
            if (j10 > jX) {
                return;
            } else {
                return;
            }
            if (j10 > jX) {
                this.B = true;
            }
            m0(q.i.b, z10);
        }
    }

    @Override // p5.q
    public void y0(q.e eVar) {
        super.y0(eVar);
        this.U |= 8;
        int size = this.Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.Q.get(i10).y0(eVar);
        }
    }

    @Override // p5.q
    public void z(ViewGroup viewGroup) {
        super.z(viewGroup);
        int size = this.Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.Q.get(i10).z(viewGroup);
        }
    }
}
