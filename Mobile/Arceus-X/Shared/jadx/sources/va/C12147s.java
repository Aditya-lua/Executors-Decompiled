package va;

/* JADX INFO: renamed from: va.s */
/* JADX INFO: loaded from: classes.dex */
public final class C12147s implements InterfaceC12145r {

    /* JADX INFO: renamed from: a */
    public volatile InterfaceC12145r f42766a;

    public C12147s(InterfaceC12145r interfaceC12145r) {
        this.f42766a = interfaceC12145r;
    }

    public final String toString() {
        Object obj = this.f42766a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Suppliers.memoize(");
        if (obj == null) {
            obj = "<supplier that returned " + ((Object) null) + ">";
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
