package p065d2;

/* JADX INFO: renamed from: d2.g */
/* JADX INFO: loaded from: classes.dex */
public class C4413g extends C4412f {

    /* JADX INFO: renamed from: m */
    public int f18347m;

    public C4413g(AbstractC4422p abstractC4422p) {
        super(abstractC4422p);
        if (abstractC4422p instanceof C4418l) {
            this.f18330e = C4412f.a.HORIZONTAL_DIMENSION;
        } else {
            this.f18330e = C4412f.a.VERTICAL_DIMENSION;
        }
    }

    @Override // p065d2.C4412f
    /* JADX INFO: renamed from: d */
    public void mo22178d(int i10) {
        if (this.f18335j) {
            return;
        }
        this.f18335j = true;
        this.f18332g = i10;
        for (InterfaceC4410d interfaceC4410d : this.f18336k) {
            interfaceC4410d.mo22153a(interfaceC4410d);
        }
    }
}
