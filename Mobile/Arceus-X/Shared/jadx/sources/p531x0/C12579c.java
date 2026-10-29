package p531x0;

import java.util.List;
import p590z0.AbstractC13677f;

/* JADX INFO: renamed from: x0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C12579c extends C12618v0.b {

    /* JADX INFO: renamed from: a */
    public final C12602n0 f44808a;

    /* JADX INFO: renamed from: b */
    public final List<AbstractC13677f> f44809b;

    public C12579c(C12602n0 c12602n0, List<AbstractC13677f> list) {
        if (c12602n0 == null) {
            throw new NullPointerException("Null surfaceEdge");
        }
        this.f44808a = c12602n0;
        if (list == null) {
            throw new NullPointerException("Null outConfigs");
        }
        this.f44809b = list;
    }

    @Override // p531x0.C12618v0.b
    /* JADX INFO: renamed from: a */
    public List<AbstractC13677f> mo46940a() {
        return this.f44809b;
    }

    @Override // p531x0.C12618v0.b
    /* JADX INFO: renamed from: b */
    public C12602n0 mo46941b() {
        return this.f44808a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C12618v0.b) {
            C12618v0.b bVar = (C12618v0.b) obj;
            if (this.f44808a.equals(bVar.mo46941b()) && this.f44809b.equals(bVar.mo46940a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f44808a.hashCode() ^ 1000003) * 1000003) ^ this.f44809b.hashCode();
    }

    public String toString() {
        return "In{surfaceEdge=" + this.f44808a + ", outConfigs=" + this.f44809b + "}";
    }
}
