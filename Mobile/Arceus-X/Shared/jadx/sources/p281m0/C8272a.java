package p281m0;

import android.graphics.Bitmap;
import p531x0.AbstractC12578b0;

/* JADX INFO: renamed from: m0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C8272a extends C8302k.b {

    /* JADX INFO: renamed from: a */
    public final AbstractC12578b0<Bitmap> f30580a;

    /* JADX INFO: renamed from: b */
    public final int f30581b;

    public C8272a(AbstractC12578b0<Bitmap> abstractC12578b0, int i10) {
        if (abstractC12578b0 == null) {
            throw new NullPointerException("Null packet");
        }
        this.f30580a = abstractC12578b0;
        this.f30581b = i10;
    }

    @Override // p281m0.C8302k.b
    /* JADX INFO: renamed from: a */
    public int mo33659a() {
        return this.f30581b;
    }

    @Override // p281m0.C8302k.b
    /* JADX INFO: renamed from: b */
    public AbstractC12578b0<Bitmap> mo33660b() {
        return this.f30580a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8302k.b) {
            C8302k.b bVar = (C8302k.b) obj;
            if (this.f30580a.equals(bVar.mo33660b()) && this.f30581b == bVar.mo33659a()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f30580a.hashCode() ^ 1000003) * 1000003) ^ this.f30581b;
    }

    public String toString() {
        return "In{packet=" + this.f30580a + ", jpegQuality=" + this.f30581b + "}";
    }
}
