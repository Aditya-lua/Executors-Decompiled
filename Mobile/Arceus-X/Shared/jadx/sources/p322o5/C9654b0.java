package p322o5;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.util.ArrayList;

/* JADX INFO: renamed from: o5.b0 */
/* JADX INFO: loaded from: classes.dex */
public class C9654b0 extends AbstractC9683q {

    /* JADX INFO: renamed from: S */
    public int f35020S;

    /* JADX INFO: renamed from: Q */
    public ArrayList<AbstractC9683q> f35018Q = new ArrayList<>();

    /* JADX INFO: renamed from: R */
    public boolean f35019R = true;

    /* JADX INFO: renamed from: T */
    public boolean f35021T = false;

    /* JADX INFO: renamed from: U */
    public int f35022U = 0;

    /* JADX INFO: renamed from: o5.b0$a */
    public class a extends C9690x {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC9683q f35023a;

        public a(AbstractC9683q abstractC9683q) {
            this.f35023a = abstractC9683q;
        }

        @Override // p322o5.C9690x, p322o5.AbstractC9683q.h
        /* JADX INFO: renamed from: k */
        public void mo38109k(@NonNull AbstractC9683q abstractC9683q) {
            this.f35023a.mo38137q0();
            abstractC9683q.mo38133m0(this);
        }
    }

    /* JADX INFO: renamed from: o5.b0$b */
    public class b extends C9690x {
        public b() {
        }

        @Override // p322o5.C9690x, p322o5.AbstractC9683q.h
        /* JADX INFO: renamed from: a */
        public void mo38105a(@NonNull AbstractC9683q abstractC9683q) {
            C9654b0.this.f35018Q.remove(abstractC9683q);
            if (C9654b0.this.mo38128X()) {
                return;
            }
            C9654b0.this.m38278i0(AbstractC9683q.i.f35204c, false);
            C9654b0 c9654b0 = C9654b0.this;
            c9654b0.f35146B = true;
            c9654b0.m38278i0(AbstractC9683q.i.f35203b, false);
        }
    }

    /* JADX INFO: renamed from: o5.b0$c */
    public static class c extends C9690x {

        /* JADX INFO: renamed from: a */
        public C9654b0 f35026a;

        public c(C9654b0 c9654b0) {
            this.f35026a = c9654b0;
        }

        @Override // p322o5.C9690x, p322o5.AbstractC9683q.h
        /* JADX INFO: renamed from: g */
        public void mo38108g(@NonNull AbstractC9683q abstractC9683q) {
            C9654b0 c9654b0 = this.f35026a;
            if (c9654b0.f35021T) {
                return;
            }
            c9654b0.m38287z0();
            this.f35026a.f35021T = true;
        }

        @Override // p322o5.C9690x, p322o5.AbstractC9683q.h
        /* JADX INFO: renamed from: k */
        public void mo38109k(@NonNull AbstractC9683q abstractC9683q) {
            C9654b0 c9654b0 = this.f35026a;
            int i10 = c9654b0.f35020S - 1;
            c9654b0.f35020S = i10;
            if (i10 == 0) {
                c9654b0.f35021T = false;
                c9654b0.m38285w();
            }
            abstractC9683q.mo38133m0(this);
        }
    }

    @Override // p322o5.AbstractC9683q
    /* JADX INFO: renamed from: A0 */
    public String mo38113A0(String str) {
        String strMo38113A0 = super.mo38113A0(str);
        for (int i10 = 0; i10 < this.f35018Q.size(); i10++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strMo38113A0);
            sb2.append("\n");
            sb2.append(this.f35018Q.get(i10).mo38113A0(str + "  "));
            strMo38113A0 = sb2.toString();
        }
        return strMo38113A0;
    }

    /* JADX DEBUG: Method merged with bridge method: c(Lo5/q$h;)Lo5/q; */
    @Override // p322o5.AbstractC9683q
    @NonNull
    /* JADX INFO: renamed from: B0, reason: merged with bridge method [inline-methods] */
    public C9654b0 mo38129c(@NonNull AbstractC9683q.h hVar) {
        return (C9654b0) super.mo38129c(hVar);
    }

    /* JADX DEBUG: Method merged with bridge method: e(Landroid/view/View;)Lo5/q; */
    @Override // p322o5.AbstractC9683q
    @NonNull
    /* JADX INFO: renamed from: C0, reason: merged with bridge method [inline-methods] */
    public C9654b0 mo38130e(@NonNull View view) {
        for (int i10 = 0; i10 < this.f35018Q.size(); i10++) {
            this.f35018Q.get(i10).mo38130e(view);
        }
        return (C9654b0) super.mo38130e(view);
    }

    @NonNull
    /* JADX INFO: renamed from: D0 */
    public C9654b0 m38116D0(@NonNull AbstractC9683q abstractC9683q) {
        m38117E0(abstractC9683q);
        long j10 = this.f35159c;
        if (j10 >= 0) {
            abstractC9683q.mo38142t0(j10);
        }
        if ((this.f35022U & 1) != 0) {
            abstractC9683q.mo38144v0(m38256D());
        }
        if ((this.f35022U & 2) != 0) {
            abstractC9683q.mo38147x0(m38260K());
        }
        if ((this.f35022U & 4) != 0) {
            abstractC9683q.mo38145w0(m38259J());
        }
        if ((this.f35022U & 8) != 0) {
            abstractC9683q.mo38143u0(m38255C());
        }
        return this;
    }

    /* JADX INFO: renamed from: E0 */
    public final void m38117E0(@NonNull AbstractC9683q abstractC9683q) {
        this.f35018Q.add(abstractC9683q);
        abstractC9683q.f35174r = this;
    }

    /* JADX INFO: renamed from: F0 */
    public AbstractC9683q m38118F0(int i10) {
        if (i10 < 0 || i10 >= this.f35018Q.size()) {
            return null;
        }
        return this.f35018Q.get(i10);
    }

    /* JADX INFO: renamed from: G0 */
    public int m38119G0() {
        return this.f35018Q.size();
    }

    /* JADX INFO: renamed from: H0 */
    public final int m38120H0(long j10) {
        for (int i10 = 1; i10 < this.f35018Q.size(); i10++) {
            if (this.f35018Q.get(i10).f35156L > j10) {
                return i10 - 1;
            }
        }
        return this.f35018Q.size() - 1;
    }

    /* JADX DEBUG: Method merged with bridge method: m0(Lo5/q$h;)Lo5/q; */
    @Override // p322o5.AbstractC9683q
    @NonNull
    /* JADX INFO: renamed from: I0, reason: merged with bridge method [inline-methods] */
    public C9654b0 mo38133m0(@NonNull AbstractC9683q.h hVar) {
        return (C9654b0) super.mo38133m0(hVar);
    }

    /* JADX DEBUG: Method merged with bridge method: n0(Landroid/view/View;)Lo5/q; */
    @Override // p322o5.AbstractC9683q
    @NonNull
    /* JADX INFO: renamed from: J0, reason: merged with bridge method [inline-methods] */
    public C9654b0 mo38135n0(@NonNull View view) {
        for (int i10 = 0; i10 < this.f35018Q.size(); i10++) {
            this.f35018Q.get(i10).mo38135n0(view);
        }
        return (C9654b0) super.mo38135n0(view);
    }

    /* JADX DEBUG: Method merged with bridge method: t0(J)Lo5/q; */
    @Override // p322o5.AbstractC9683q
    @NonNull
    /* JADX INFO: renamed from: K0, reason: merged with bridge method [inline-methods] */
    public C9654b0 mo38142t0(long j10) {
        ArrayList<AbstractC9683q> arrayList;
        super.mo38142t0(j10);
        if (this.f35159c >= 0 && (arrayList = this.f35018Q) != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f35018Q.get(i10).mo38142t0(j10);
            }
        }
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: v0(Landroid/animation/TimeInterpolator;)Lo5/q; */
    @Override // p322o5.AbstractC9683q
    @NonNull
    /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
    public C9654b0 mo38144v0(TimeInterpolator timeInterpolator) {
        this.f35022U |= 1;
        ArrayList<AbstractC9683q> arrayList = this.f35018Q;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f35018Q.get(i10).mo38144v0(timeInterpolator);
            }
        }
        return (C9654b0) super.mo38144v0(timeInterpolator);
    }

    @NonNull
    /* JADX INFO: renamed from: M0 */
    public C9654b0 m38125M0(int i10) {
        if (i10 == 0) {
            this.f35019R = true;
            return this;
        }
        if (i10 == 1) {
            this.f35019R = false;
            return this;
        }
        throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i10);
    }

    /* JADX DEBUG: Method merged with bridge method: y0(J)Lo5/q; */
    @Override // p322o5.AbstractC9683q
    @NonNull
    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    public C9654b0 mo38148y0(long j10) {
        return (C9654b0) super.mo38148y0(j10);
    }

    /* JADX INFO: renamed from: O0 */
    public final void m38127O0() {
        c cVar = new c(this);
        ArrayList<AbstractC9683q> arrayList = this.f35018Q;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            AbstractC9683q abstractC9683q = arrayList.get(i10);
            i10++;
            abstractC9683q.mo38129c(cVar);
        }
        this.f35020S = this.f35018Q.size();
    }

    @Override // p322o5.AbstractC9683q
    /* JADX INFO: renamed from: X */
    public boolean mo38128X() {
        for (int i10 = 0; i10 < this.f35018Q.size(); i10++) {
            if (this.f35018Q.get(i10).mo38128X()) {
                return true;
            }
        }
        return false;
    }

    @Override // p322o5.AbstractC9683q
    /* JADX INFO: renamed from: Y */
    public boolean mo38091Y() {
        int size = this.f35018Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!this.f35018Q.get(i10).mo38091Y()) {
                return false;
            }
        }
        return true;
    }

    @Override // p322o5.AbstractC9683q
    public void cancel() {
        super.cancel();
        int size = this.f35018Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f35018Q.get(i10).cancel();
        }
    }

    @Override // p322o5.AbstractC9683q
    /* JADX INFO: renamed from: j */
    public void mo38092j(@NonNull C9658d0 c9658d0) {
        if (m38269a0(c9658d0.f35045b)) {
            ArrayList<AbstractC9683q> arrayList = this.f35018Q;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                AbstractC9683q abstractC9683q = arrayList.get(i10);
                i10++;
                AbstractC9683q abstractC9683q2 = abstractC9683q;
                if (abstractC9683q2.m38269a0(c9658d0.f35045b)) {
                    abstractC9683q2.mo38092j(c9658d0);
                    c9658d0.f35046c.add(abstractC9683q2);
                }
            }
        }
    }

    @Override // p322o5.AbstractC9683q
    /* JADX INFO: renamed from: j0 */
    public void mo38131j0(View view) {
        super.mo38131j0(view);
        int size = this.f35018Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f35018Q.get(i10).mo38131j0(view);
        }
    }

    @Override // p322o5.AbstractC9683q
    /* JADX INFO: renamed from: l0 */
    public void mo38132l0() {
        this.f35154J = 0L;
        b bVar = new b();
        for (int i10 = 0; i10 < this.f35018Q.size(); i10++) {
            AbstractC9683q abstractC9683q = this.f35018Q.get(i10);
            abstractC9683q.mo38129c(bVar);
            abstractC9683q.mo38132l0();
            long jM38267U = abstractC9683q.m38267U();
            if (this.f35019R) {
                this.f35154J = Math.max(this.f35154J, jM38267U);
            } else {
                long j10 = this.f35154J;
                abstractC9683q.f35156L = j10;
                this.f35154J = j10 + jM38267U;
            }
        }
    }

    @Override // p322o5.AbstractC9683q
    /* JADX INFO: renamed from: n */
    public void mo38134n(C9658d0 c9658d0) {
        super.mo38134n(c9658d0);
        int size = this.f35018Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f35018Q.get(i10).mo38134n(c9658d0);
        }
    }

    @Override // p322o5.AbstractC9683q
    /* JADX INFO: renamed from: o */
    public void mo38093o(@NonNull C9658d0 c9658d0) {
        if (m38269a0(c9658d0.f35045b)) {
            ArrayList<AbstractC9683q> arrayList = this.f35018Q;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                AbstractC9683q abstractC9683q = arrayList.get(i10);
                i10++;
                AbstractC9683q abstractC9683q2 = abstractC9683q;
                if (abstractC9683q2.m38269a0(c9658d0.f35045b)) {
                    abstractC9683q2.mo38093o(c9658d0);
                    c9658d0.f35046c.add(abstractC9683q2);
                }
            }
        }
    }

    @Override // p322o5.AbstractC9683q
    /* JADX INFO: renamed from: o0 */
    public void mo38136o0(View view) {
        super.mo38136o0(view);
        int size = this.f35018Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f35018Q.get(i10).mo38136o0(view);
        }
    }

    @Override // p322o5.AbstractC9683q
    /* JADX INFO: renamed from: q0 */
    public void mo38137q0() {
        if (this.f35018Q.isEmpty()) {
            m38287z0();
            m38285w();
            return;
        }
        m38127O0();
        int i10 = 0;
        if (this.f35019R) {
            ArrayList<AbstractC9683q> arrayList = this.f35018Q;
            int size = arrayList.size();
            while (i10 < size) {
                AbstractC9683q abstractC9683q = arrayList.get(i10);
                i10++;
                abstractC9683q.mo38137q0();
            }
            return;
        }
        for (int i11 = 1; i11 < this.f35018Q.size(); i11++) {
            this.f35018Q.get(i11 - 1).mo38129c(new a(this.f35018Q.get(i11)));
        }
        AbstractC9683q abstractC9683q2 = this.f35018Q.get(0);
        if (abstractC9683q2 != null) {
            abstractC9683q2.mo38137q0();
        }
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    @Override // p322o5.AbstractC9683q
    @NonNull
    /* JADX INFO: renamed from: r */
    public AbstractC9683q clone() {
        C9654b0 c9654b0 = (C9654b0) super.clone();
        c9654b0.f35018Q = new ArrayList<>();
        int size = this.f35018Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            c9654b0.m38117E0(this.f35018Q.get(i10).clone());
        }
        return c9654b0;
    }

    @Override // p322o5.AbstractC9683q
    /* JADX INFO: renamed from: r0 */
    public void mo38139r0(boolean z10) {
        super.mo38139r0(z10);
        int size = this.f35018Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f35018Q.get(i10).mo38139r0(z10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:56:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    @Override // p322o5.AbstractC9683q
    /* JADX INFO: renamed from: s0 */
    public void mo38140s0(long j10, long j11) {
        long j12;
        long jM38267U = m38267U();
        long j13 = 0;
        if (this.f35174r != null) {
            if (j10 < 0 && j11 < 0) {
                return;
            }
            if (j10 > jM38267U && j11 > jM38267U) {
                return;
            }
        }
        boolean z10 = j10 < j11;
        if ((j10 >= 0 && j11 < 0) || (j10 <= jM38267U && j11 > jM38267U)) {
            this.f35146B = false;
            m38278i0(AbstractC9683q.i.f35202a, z10);
        }
        if (!this.f35019R) {
            int iM38120H0 = m38120H0(j11);
            if (j10 >= j11) {
                while (true) {
                    if (iM38120H0 < this.f35018Q.size()) {
                        AbstractC9683q abstractC9683q = this.f35018Q.get(iM38120H0);
                        long j14 = abstractC9683q.f35156L;
                        j12 = j13;
                        long j15 = j10 - j14;
                        if (j15 < j12) {
                            break;
                        }
                        abstractC9683q.mo38140s0(j15, j11 - j14);
                        iM38120H0++;
                        j13 = j12;
                    }
                }
            } else {
                j12 = 0;
                while (iM38120H0 >= 0) {
                    AbstractC9683q abstractC9683q2 = this.f35018Q.get(iM38120H0);
                    long j16 = abstractC9683q2.f35156L;
                    long j17 = j10 - j16;
                    abstractC9683q2.mo38140s0(j17, j11 - j16);
                    if (j17 >= 0) {
                        break;
                    } else {
                        iM38120H0--;
                    }
                }
            }
            if (this.f35174r != null) {
                if ((j10 > jM38267U || j11 > jM38267U) && (j10 >= 0 || j11 < j12)) {
                    return;
                }
                if (j10 > jM38267U) {
                    this.f35146B = true;
                }
                m38278i0(AbstractC9683q.i.f35203b, z10);
            }
        }
        for (int i10 = 0; i10 < this.f35018Q.size(); i10++) {
            this.f35018Q.get(i10).mo38140s0(j10, j11);
        }
        j12 = j13;
        if (this.f35174r != null) {
            if (j10 > jM38267U) {
                return;
            } else {
                return;
            }
            if (j10 > jM38267U) {
                this.f35146B = true;
            }
            m38278i0(AbstractC9683q.i.f35203b, z10);
        }
    }

    @Override // p322o5.AbstractC9683q
    /* JADX INFO: renamed from: t */
    public void mo38141t(@NonNull ViewGroup viewGroup, @NonNull C9660e0 c9660e0, @NonNull C9660e0 c9660e1, @NonNull ArrayList<C9658d0> arrayList, @NonNull ArrayList<C9658d0> arrayList2) {
        long jM38262P = m38262P();
        int size = this.f35018Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC9683q abstractC9683q = this.f35018Q.get(i10);
            if (jM38262P > 0 && (this.f35019R || i10 == 0)) {
                long jM38262P2 = abstractC9683q.m38262P();
                if (jM38262P2 > 0) {
                    abstractC9683q.mo38148y0(jM38262P2 + jM38262P);
                } else {
                    abstractC9683q.mo38148y0(jM38262P);
                }
            }
            abstractC9683q.mo38141t(viewGroup, c9660e0, c9660e1, arrayList, arrayList2);
        }
    }

    @Override // p322o5.AbstractC9683q
    /* JADX INFO: renamed from: u0 */
    public void mo38143u0(AbstractC9683q.e eVar) {
        super.mo38143u0(eVar);
        this.f35022U |= 8;
        int size = this.f35018Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f35018Q.get(i10).mo38143u0(eVar);
        }
    }

    @Override // p322o5.AbstractC9683q
    /* JADX INFO: renamed from: w0 */
    public void mo38145w0(AbstractC9671k abstractC9671k) {
        super.mo38145w0(abstractC9671k);
        this.f35022U |= 4;
        if (this.f35018Q != null) {
            for (int i10 = 0; i10 < this.f35018Q.size(); i10++) {
                this.f35018Q.get(i10).mo38145w0(abstractC9671k);
            }
        }
    }

    @Override // p322o5.AbstractC9683q
    /* JADX INFO: renamed from: x */
    public void mo38146x(ViewGroup viewGroup) {
        super.mo38146x(viewGroup);
        int size = this.f35018Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f35018Q.get(i10).mo38146x(viewGroup);
        }
    }

    @Override // p322o5.AbstractC9683q
    /* JADX INFO: renamed from: x0 */
    public void mo38147x0(AbstractC9692z abstractC9692z) {
        super.mo38147x0(abstractC9692z);
        this.f35022U |= 2;
        int size = this.f35018Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f35018Q.get(i10).mo38147x0(abstractC9692z);
        }
    }
}
