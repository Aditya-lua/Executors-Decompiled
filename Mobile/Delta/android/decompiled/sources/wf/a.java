package wf;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34482a;
    public final List<String> b;

    public a(String str, List<String> list) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f34482a = str;
        if (list == null) {
            throw new NullPointerException("Null usedDates");
        }
        this.b = list;
    }

    @Override // wf.q
    public List<String> b() {
        return this.b;
    }

    @Override // wf.q
    public String c() {
        return this.f34482a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.f34482a.equals(qVar.c()) && this.b.equals(qVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f34482a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f34482a + ", usedDates=" + this.b + "}";
    }
}
