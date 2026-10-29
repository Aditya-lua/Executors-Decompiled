package p388qn;

/* JADX INFO: renamed from: qn.v */
/* JADX INFO: loaded from: classes3.dex */
public class C10626v extends AbstractC10621q {

    /* JADX INFO: renamed from: h */
    public String f38101h;

    /* JADX INFO: renamed from: i */
    public Integer f38102i;

    @Override // p388qn.AbstractC10623s
    /* JADX INFO: renamed from: a */
    public void mo40637a(InterfaceC10608d0 interfaceC10608d0) {
        interfaceC10608d0.mo40666z(this);
    }

    /* JADX INFO: renamed from: r */
    public String m40709r() {
        return this.f38101h;
    }

    /* JADX INFO: renamed from: s */
    public Integer m40710s() {
        return this.f38102i;
    }

    @Deprecated
    /* JADX INFO: renamed from: t */
    public int m40711t() {
        Integer num = this.f38102i;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: u */
    public void m40712u(String str) {
        this.f38101h = str;
    }

    /* JADX INFO: renamed from: v */
    public void m40713v(Integer num) {
        this.f38102i = num;
    }

    @Deprecated
    /* JADX INFO: renamed from: w */
    public void m40714w(int i10) {
        this.f38102i = i10 != 0 ? Integer.valueOf(i10) : null;
    }
}
