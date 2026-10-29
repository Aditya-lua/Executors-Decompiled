package p589z;

import android.util.Size;
import java.util.List;
import p296n0.AbstractC8827t3;
import p296n0.C8802o3;
import p296n0.InterfaceC8771i4;
import p296n0.InterfaceC8777j4;

/* JADX INFO: renamed from: z.d */
/* JADX INFO: loaded from: classes.dex */
public final class C13499d extends C13631u0.k {

    /* JADX INFO: renamed from: a */
    public final String f47244a;

    /* JADX INFO: renamed from: b */
    public final Class<?> f47245b;

    /* JADX INFO: renamed from: c */
    public final C8802o3 f47246c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC8771i4<?> f47247d;

    /* JADX INFO: renamed from: e */
    public final Size f47248e;

    /* JADX INFO: renamed from: f */
    public final AbstractC8827t3 f47249f;

    /* JADX INFO: renamed from: g */
    public final List<InterfaceC8777j4.b> f47250g;

    public C13499d(String str, Class<?> cls, C8802o3 c8802o3, InterfaceC8771i4<?> interfaceC8771i4, Size size, AbstractC8827t3 abstractC8827t3, List<InterfaceC8777j4.b> list) {
        if (str == null) {
            throw new NullPointerException("Null useCaseId");
        }
        this.f47244a = str;
        if (cls == null) {
            throw new NullPointerException("Null useCaseType");
        }
        this.f47245b = cls;
        if (c8802o3 == null) {
            throw new NullPointerException("Null sessionConfig");
        }
        this.f47246c = c8802o3;
        if (interfaceC8771i4 == null) {
            throw new NullPointerException("Null useCaseConfig");
        }
        this.f47247d = interfaceC8771i4;
        this.f47248e = size;
        this.f47249f = abstractC8827t3;
        this.f47250g = list;
    }

    @Override // p589z.C13631u0.k
    /* JADX INFO: renamed from: c */
    public List<InterfaceC8777j4.b> mo49205c() {
        return this.f47250g;
    }

    @Override // p589z.C13631u0.k
    /* JADX INFO: renamed from: d */
    public C8802o3 mo49206d() {
        return this.f47246c;
    }

    @Override // p589z.C13631u0.k
    /* JADX INFO: renamed from: e */
    public AbstractC8827t3 mo49207e() {
        return this.f47249f;
    }

    public boolean equals(Object obj) {
        Size size;
        AbstractC8827t3 abstractC8827t3;
        List<InterfaceC8777j4.b> list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C13631u0.k) {
            C13631u0.k kVar = (C13631u0.k) obj;
            if (this.f47244a.equals(kVar.mo49210h()) && this.f47245b.equals(kVar.mo49211i()) && this.f47246c.equals(kVar.mo49206d()) && this.f47247d.equals(kVar.mo49209g()) && ((size = this.f47248e) != null ? size.equals(kVar.mo49208f()) : kVar.mo49208f() == null) && ((abstractC8827t3 = this.f47249f) != null ? abstractC8827t3.equals(kVar.mo49207e()) : kVar.mo49207e() == null) && ((list = this.f47250g) != null ? list.equals(kVar.mo49205c()) : kVar.mo49205c() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // p589z.C13631u0.k
    /* JADX INFO: renamed from: f */
    public Size mo49208f() {
        return this.f47248e;
    }

    @Override // p589z.C13631u0.k
    /* JADX INFO: renamed from: g */
    public InterfaceC8771i4<?> mo49209g() {
        return this.f47247d;
    }

    @Override // p589z.C13631u0.k
    /* JADX INFO: renamed from: h */
    public String mo49210h() {
        return this.f47244a;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f47244a.hashCode() ^ 1000003) * 1000003) ^ this.f47245b.hashCode()) * 1000003) ^ this.f47246c.hashCode()) * 1000003) ^ this.f47247d.hashCode()) * 1000003;
        Size size = this.f47248e;
        int iHashCode2 = (iHashCode ^ (size == null ? 0 : size.hashCode())) * 1000003;
        AbstractC8827t3 abstractC8827t3 = this.f47249f;
        int iHashCode3 = (iHashCode2 ^ (abstractC8827t3 == null ? 0 : abstractC8827t3.hashCode())) * 1000003;
        List<InterfaceC8777j4.b> list = this.f47250g;
        return iHashCode3 ^ (list != null ? list.hashCode() : 0);
    }

    @Override // p589z.C13631u0.k
    /* JADX INFO: renamed from: i */
    public Class<?> mo49211i() {
        return this.f47245b;
    }

    public String toString() {
        return "UseCaseInfo{useCaseId=" + this.f47244a + ", useCaseType=" + this.f47245b + ", sessionConfig=" + this.f47246c + ", useCaseConfig=" + this.f47247d + ", surfaceResolution=" + this.f47248e + ", streamSpec=" + this.f47249f + ", captureTypes=" + this.f47250g + "}";
    }
}
