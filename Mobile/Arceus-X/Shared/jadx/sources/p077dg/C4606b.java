package p077dg;

/* JADX INFO: renamed from: dg.b */
/* JADX INFO: loaded from: classes2.dex */
public class C4606b implements InterfaceC4605a {

    /* JADX INFO: renamed from: a */
    public static C4606b f18869a;

    /* JADX INFO: renamed from: b */
    public static C4606b m22746b() {
        if (f18869a == null) {
            f18869a = new C4606b();
        }
        return f18869a;
    }

    @Override // p077dg.InterfaceC4605a
    /* JADX INFO: renamed from: a */
    public long mo22745a() {
        return System.currentTimeMillis();
    }
}
