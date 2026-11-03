package on;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends s {
    @Override // on.s
    public void k(s sVar) {
        if (!(sVar instanceof a)) {
            throw new IllegalArgumentException("Parent of block must also be block (can not be inline)");
        }
        super.k(sVar);
    }

    @Override // on.s
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public a g() {
        return (a) super.g();
    }
}
