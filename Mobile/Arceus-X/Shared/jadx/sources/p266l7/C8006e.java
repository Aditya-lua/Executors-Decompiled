package p266l7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l7.e */
/* JADX INFO: loaded from: classes3.dex */
public class C8006e {

    /* JADX INFO: renamed from: c */
    public static final C8006e f29957c = new C8006e("COMPOSITION");

    /* JADX INFO: renamed from: a */
    public final List<String> f29958a;

    /* JADX INFO: renamed from: b */
    public InterfaceC8007f f29959b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C8006e(String... strArr) {
        this.f29958a = Arrays.asList(strArr);
    }

    /* JADX INFO: renamed from: a */
    public C8006e m33076a(String str) {
        C8006e c8006e = new C8006e(this);
        c8006e.f29958a.add(str);
        return c8006e;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m33077b() {
        List<String> list = this.f29958a;
        return list.get(list.size() - 1).equals("**");
    }

    /* JADX INFO: renamed from: c */
    public boolean m33078c(String str, int i10) {
        if (i10 >= this.f29958a.size()) {
            return false;
        }
        boolean z10 = i10 == this.f29958a.size() - 1;
        String str2 = this.f29958a.get(i10);
        if (!str2.equals("**")) {
            return (z10 || (i10 == this.f29958a.size() + (-2) && m33077b())) && (str2.equals(str) || str2.equals("*"));
        }
        if (!z10 && this.f29958a.get(i10 + 1).equals(str)) {
            return i10 == this.f29958a.size() + (-2) || (i10 == this.f29958a.size() + (-3) && m33077b());
        }
        if (z10) {
            return true;
        }
        int i11 = i10 + 1;
        if (i11 < this.f29958a.size() - 1) {
            return false;
        }
        return this.f29958a.get(i11).equals(str);
    }

    /* JADX INFO: renamed from: d */
    public InterfaceC8007f m33079d() {
        return this.f29959b;
    }

    /* JADX INFO: renamed from: e */
    public int m33080e(String str, int i10) {
        if (m33081f(str)) {
            return 0;
        }
        if (this.f29958a.get(i10).equals("**")) {
            return (i10 != this.f29958a.size() - 1 && this.f29958a.get(i10 + 1).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C8006e c8006e = (C8006e) obj;
            if (!this.f29958a.equals(c8006e.f29958a)) {
                return false;
            }
            InterfaceC8007f interfaceC8007f = this.f29959b;
            InterfaceC8007f interfaceC8007f2 = c8006e.f29959b;
            if (interfaceC8007f != null) {
                return interfaceC8007f.equals(interfaceC8007f2);
            }
            if (interfaceC8007f2 == null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m33081f(String str) {
        return "__container".equals(str);
    }

    /* JADX INFO: renamed from: g */
    public boolean m33082g(String str, int i10) {
        if (m33081f(str)) {
            return true;
        }
        if (i10 >= this.f29958a.size()) {
            return false;
        }
        return this.f29958a.get(i10).equals(str) || this.f29958a.get(i10).equals("**") || this.f29958a.get(i10).equals("*");
    }

    /* JADX INFO: renamed from: h */
    public boolean m33083h(String str, int i10) {
        return "__container".equals(str) || i10 < this.f29958a.size() - 1 || this.f29958a.get(i10).equals("**");
    }

    public int hashCode() {
        int iHashCode = this.f29958a.hashCode() * 31;
        InterfaceC8007f interfaceC8007f = this.f29959b;
        return iHashCode + (interfaceC8007f != null ? interfaceC8007f.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i */
    public C8006e m33084i(InterfaceC8007f interfaceC8007f) {
        C8006e c8006e = new C8006e(this);
        c8006e.f29959b = interfaceC8007f;
        return c8006e;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("KeyPath{keys=");
        sb2.append(this.f29958a);
        sb2.append(",resolved=");
        sb2.append(this.f29959b != null);
        sb2.append('}');
        return sb2.toString();
    }

    public C8006e(C8006e c8006e) {
        this.f29958a = new ArrayList(c8006e.f29958a);
        this.f29959b = c8006e.f29959b;
    }
}
