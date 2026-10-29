package p562y0;

import java.util.List;
import p531x0.C12602n0;

/* JADX INFO: renamed from: y0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C12978b extends C12994r.b {

    /* JADX INFO: renamed from: a */
    public final C12602n0 f45943a;

    /* JADX INFO: renamed from: b */
    public final C12602n0 f45944b;

    /* JADX INFO: renamed from: c */
    public final List<AbstractC12980d> f45945c;

    public C12978b(C12602n0 c12602n0, C12602n0 c12602n1, List<AbstractC12980d> list) {
        if (c12602n0 == null) {
            throw new NullPointerException("Null primarySurfaceEdge");
        }
        this.f45943a = c12602n0;
        if (c12602n1 == null) {
            throw new NullPointerException("Null secondarySurfaceEdge");
        }
        this.f45944b = c12602n1;
        if (list == null) {
            throw new NullPointerException("Null outConfigs");
        }
        this.f45945c = list;
    }

    @Override // p562y0.C12994r.b
    /* JADX INFO: renamed from: a */
    public List<AbstractC12980d> mo48254a() {
        return this.f45945c;
    }

    @Override // p562y0.C12994r.b
    /* JADX INFO: renamed from: b */
    public C12602n0 mo48255b() {
        return this.f45943a;
    }

    @Override // p562y0.C12994r.b
    /* JADX INFO: renamed from: c */
    public C12602n0 mo48256c() {
        return this.f45944b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C12994r.b) {
            C12994r.b bVar = (C12994r.b) obj;
            if (this.f45943a.equals(bVar.mo48255b()) && this.f45944b.equals(bVar.mo48256c()) && this.f45945c.equals(bVar.mo48254a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f45943a.hashCode() ^ 1000003) * 1000003) ^ this.f45944b.hashCode()) * 1000003) ^ this.f45945c.hashCode();
    }

    public String toString() {
        return "In{primarySurfaceEdge=" + this.f45943a + ", secondarySurfaceEdge=" + this.f45944b + ", outConfigs=" + this.f45945c + "}";
    }
}
