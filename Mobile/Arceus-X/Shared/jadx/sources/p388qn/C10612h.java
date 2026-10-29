package p388qn;

/* JADX INFO: renamed from: qn.h */
/* JADX INFO: loaded from: classes3.dex */
public class C10612h extends AbstractC10601a {

    /* JADX INFO: renamed from: g */
    public String f38071g;

    /* JADX INFO: renamed from: h */
    public Integer f38072h;

    /* JADX INFO: renamed from: i */
    public Integer f38073i;

    /* JADX INFO: renamed from: j */
    public int f38074j;

    /* JADX INFO: renamed from: k */
    public String f38075k;

    /* JADX INFO: renamed from: l */
    public String f38076l;

    /* JADX INFO: renamed from: p */
    public static void m40671p(Integer num, Integer num2) {
        if (num != null && num2 != null && num2.intValue() < num.intValue()) {
            throw new IllegalArgumentException("fence lengths required to be: closingFenceLength >= openingFenceLength");
        }
    }

    @Override // p388qn.AbstractC10623s
    /* JADX INFO: renamed from: a */
    public void mo40637a(InterfaceC10608d0 interfaceC10608d0) {
        interfaceC10608d0.mo40648E(this);
    }

    /* JADX INFO: renamed from: q */
    public int m40672q() {
        return this.f38074j;
    }

    /* JADX INFO: renamed from: r */
    public String m40673r() {
        return this.f38075k;
    }

    /* JADX INFO: renamed from: s */
    public String m40674s() {
        return this.f38076l;
    }

    /* JADX INFO: renamed from: t */
    public Integer m40675t() {
        return this.f38072h;
    }

    /* JADX INFO: renamed from: u */
    public void m40676u(Integer num) {
        if (num != null && num.intValue() < 3) {
            throw new IllegalArgumentException("closingFenceLength needs to be >= 3");
        }
        m40671p(this.f38072h, num);
        this.f38073i = num;
    }

    /* JADX INFO: renamed from: v */
    public void m40677v(String str) {
        this.f38071g = str;
    }

    /* JADX INFO: renamed from: w */
    public void m40678w(int i10) {
        this.f38074j = i10;
    }

    /* JADX INFO: renamed from: x */
    public void m40679x(String str) {
        this.f38075k = str;
    }

    /* JADX INFO: renamed from: y */
    public void m40680y(String str) {
        this.f38076l = str;
    }

    /* JADX INFO: renamed from: z */
    public void m40681z(Integer num) {
        if (num != null && num.intValue() < 3) {
            throw new IllegalArgumentException("openingFenceLength needs to be >= 3");
        }
        m40671p(num, this.f38073i);
        this.f38072h = num;
    }
}
