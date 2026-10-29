package ee;

/* JADX INFO: renamed from: ee.a0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5057a0 implements InterfaceC5107z {

    /* JADX INFO: renamed from: a */
    public final Object f19878a;

    public C5057a0(Object obj) {
        this.f19878a = obj;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC5107z m23768b(Object obj) {
        if (obj != null) {
            return new C5057a0(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // ee.InterfaceC5066e0
    /* JADX INFO: renamed from: a */
    public final Object mo23769a() {
        return this.f19878a;
    }
}
