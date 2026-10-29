package p562y0;

import p590z0.AbstractC13677f;

/* JADX INFO: renamed from: y0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C12977a extends AbstractC12980d {

    /* JADX INFO: renamed from: a */
    public final AbstractC13677f f45941a;

    /* JADX INFO: renamed from: b */
    public final AbstractC13677f f45942b;

    public C12977a(AbstractC13677f abstractC13677f, AbstractC13677f abstractC13677f2) {
        if (abstractC13677f == null) {
            throw new NullPointerException("Null primaryOutConfig");
        }
        this.f45941a = abstractC13677f;
        if (abstractC13677f2 == null) {
            throw new NullPointerException("Null secondaryOutConfig");
        }
        this.f45942b = abstractC13677f2;
    }

    @Override // p562y0.AbstractC12980d
    /* JADX INFO: renamed from: a */
    public AbstractC13677f mo48252a() {
        return this.f45941a;
    }

    @Override // p562y0.AbstractC12980d
    /* JADX INFO: renamed from: b */
    public AbstractC13677f mo48253b() {
        return this.f45942b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC12980d) {
            AbstractC12980d abstractC12980d = (AbstractC12980d) obj;
            if (this.f45941a.equals(abstractC12980d.mo48252a()) && this.f45942b.equals(abstractC12980d.mo48253b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f45941a.hashCode() ^ 1000003) * 1000003) ^ this.f45942b.hashCode();
    }

    public String toString() {
        return "DualOutConfig{primaryOutConfig=" + this.f45941a + ", secondaryOutConfig=" + this.f45942b + "}";
    }
}
