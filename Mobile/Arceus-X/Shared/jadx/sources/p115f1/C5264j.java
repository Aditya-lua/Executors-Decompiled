package p115f1;

import android.util.Size;
import java.util.List;

/* JADX INFO: renamed from: f1.j */
/* JADX INFO: loaded from: classes.dex */
public final class C5264j extends C5306x.b {

    /* JADX INFO: renamed from: j */
    public final int f20376j;

    /* JADX INFO: renamed from: k */
    public final int f20377k;

    /* JADX INFO: renamed from: l */
    public final String f20378l;

    /* JADX INFO: renamed from: m */
    public final List<Size> f20379m;

    public C5264j(int i10, int i11, String str, List<Size> list) {
        this.f20376j = i10;
        this.f20377k = i11;
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f20378l = str;
        if (list == null) {
            throw new NullPointerException("Null typicalSizes");
        }
        this.f20379m = list;
    }

    @Override // p115f1.C5306x.b
    /* JADX INFO: renamed from: c */
    public int mo24323c() {
        return this.f20377k;
    }

    @Override // p115f1.C5306x.b
    /* JADX INFO: renamed from: d */
    public String mo24324d() {
        return this.f20378l;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5306x.b) {
            C5306x.b bVar = (C5306x.b) obj;
            if (this.f20376j == bVar.mo24326g() && this.f20377k == bVar.mo24323c() && this.f20378l.equals(bVar.mo24324d()) && this.f20379m.equals(bVar.mo24325f())) {
                return true;
            }
        }
        return false;
    }

    @Override // p115f1.C5306x.b
    /* JADX INFO: renamed from: f */
    public List<Size> mo24325f() {
        return this.f20379m;
    }

    @Override // p115f1.C5306x.b
    /* JADX INFO: renamed from: g */
    public int mo24326g() {
        return this.f20376j;
    }

    public int hashCode() {
        return ((((((this.f20376j ^ 1000003) * 1000003) ^ this.f20377k) * 1000003) ^ this.f20378l.hashCode()) * 1000003) ^ this.f20379m.hashCode();
    }

    public String toString() {
        return "ConstantQuality{value=" + this.f20376j + ", highSpeedValue=" + this.f20377k + ", name=" + this.f20378l + ", typicalSizes=" + this.f20379m + "}";
    }
}
