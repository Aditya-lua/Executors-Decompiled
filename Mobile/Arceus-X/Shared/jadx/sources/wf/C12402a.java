package wf;

import java.util.List;

/* JADX INFO: renamed from: wf.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C12402a extends AbstractC12418q {

    /* JADX INFO: renamed from: a */
    public final String f44368a;

    /* JADX INFO: renamed from: b */
    public final List<String> f44369b;

    public C12402a(String str, List<String> list) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f44368a = str;
        if (list == null) {
            throw new NullPointerException("Null usedDates");
        }
        this.f44369b = list;
    }

    @Override // wf.AbstractC12418q
    /* JADX INFO: renamed from: b */
    public List<String> mo46480b() {
        return this.f44369b;
    }

    @Override // wf.AbstractC12418q
    /* JADX INFO: renamed from: c */
    public String mo46481c() {
        return this.f44368a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC12418q) {
            AbstractC12418q abstractC12418q = (AbstractC12418q) obj;
            if (this.f44368a.equals(abstractC12418q.mo46481c()) && this.f44369b.equals(abstractC12418q.mo46480b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f44368a.hashCode() ^ 1000003) * 1000003) ^ this.f44369b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f44368a + ", usedDates=" + this.f44369b + "}";
    }
}
