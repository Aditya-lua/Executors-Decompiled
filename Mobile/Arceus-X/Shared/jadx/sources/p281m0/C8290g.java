package p281m0;

import java.util.List;
import p531x0.C12615u;

/* JADX INFO: renamed from: m0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C8290g extends C8325u0.a {

    /* JADX INFO: renamed from: a */
    public final C12615u<C8325u0.b> f30619a;

    /* JADX INFO: renamed from: b */
    public final C12615u<C8325u0.b> f30620b;

    /* JADX INFO: renamed from: c */
    public final int f30621c;

    /* JADX INFO: renamed from: d */
    public final List<Integer> f30622d;

    public C8290g(C12615u<C8325u0.b> c12615u, C12615u<C8325u0.b> c12615u2, int i10, List<Integer> list) {
        if (c12615u == null) {
            throw new NullPointerException("Null edge");
        }
        this.f30619a = c12615u;
        if (c12615u2 == null) {
            throw new NullPointerException("Null postviewEdge");
        }
        this.f30620b = c12615u2;
        this.f30621c = i10;
        if (list == null) {
            throw new NullPointerException("Null outputFormats");
        }
        this.f30622d = list;
    }

    @Override // p281m0.C8325u0.a
    /* JADX INFO: renamed from: a */
    public C12615u<C8325u0.b> mo33727a() {
        return this.f30619a;
    }

    @Override // p281m0.C8325u0.a
    /* JADX INFO: renamed from: b */
    public int mo33728b() {
        return this.f30621c;
    }

    @Override // p281m0.C8325u0.a
    /* JADX INFO: renamed from: c */
    public List<Integer> mo33729c() {
        return this.f30622d;
    }

    @Override // p281m0.C8325u0.a
    /* JADX INFO: renamed from: d */
    public C12615u<C8325u0.b> mo33730d() {
        return this.f30620b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8325u0.a) {
            C8325u0.a aVar = (C8325u0.a) obj;
            if (this.f30619a.equals(aVar.mo33727a()) && this.f30620b.equals(aVar.mo33730d()) && this.f30621c == aVar.mo33728b() && this.f30622d.equals(aVar.mo33729c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f30619a.hashCode() ^ 1000003) * 1000003) ^ this.f30620b.hashCode()) * 1000003) ^ this.f30621c) * 1000003) ^ this.f30622d.hashCode();
    }

    public String toString() {
        return "In{edge=" + this.f30619a + ", postviewEdge=" + this.f30620b + ", inputFormat=" + this.f30621c + ", outputFormats=" + this.f30622d + "}";
    }
}
