package p531x0;

import p563y1.C12997c;

/* JADX INFO: renamed from: x0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C12575a extends C12613t.b {

    /* JADX INFO: renamed from: a */
    public final int f44797a;

    /* JADX INFO: renamed from: b */
    public final int f44798b;

    /* JADX INFO: renamed from: c */
    public final C12997c.a<Void> f44799c;

    public C12575a(int i10, int i11, C12997c.a<Void> aVar) {
        this.f44797a = i10;
        this.f44798b = i11;
        if (aVar == null) {
            throw new NullPointerException("Null completer");
        }
        this.f44799c = aVar;
    }

    @Override // p531x0.C12613t.b
    /* JADX INFO: renamed from: a */
    public C12997c.a<Void> mo46924a() {
        return this.f44799c;
    }

    @Override // p531x0.C12613t.b
    /* JADX INFO: renamed from: b */
    public int mo46925b() {
        return this.f44797a;
    }

    @Override // p531x0.C12613t.b
    /* JADX INFO: renamed from: c */
    public int mo46926c() {
        return this.f44798b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C12613t.b) {
            C12613t.b bVar = (C12613t.b) obj;
            if (this.f44797a == bVar.mo46925b() && this.f44798b == bVar.mo46926c() && this.f44799c.equals(bVar.mo46924a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f44797a ^ 1000003) * 1000003) ^ this.f44798b) * 1000003) ^ this.f44799c.hashCode();
    }

    public String toString() {
        return "PendingSnapshot{jpegQuality=" + this.f44797a + ", rotationDegrees=" + this.f44798b + ", completer=" + this.f44799c + "}";
    }
}
