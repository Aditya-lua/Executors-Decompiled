package p281m0;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Size;
import androidx.camera.core.AbstractC0492b;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import ne.InterfaceFutureC9440x;
import p140g0.AbstractC5913n;
import p140g0.C5890h0;
import p296n0.AbstractC8830u1;
import p296n0.C8757g2;
import p296n0.C8785l1;
import p296n0.C8802o3;
import p296n0.InterfaceC8763h2;
import p296n0.InterfaceC8780k1;
import p296n0.InterfaceC8790m1;
import p347p0.C10085a0;
import p347p0.C10110z;
import p366q0.C10417c;
import p480v0.C11987b;
import p503w0.C12272b;
import p531x0.C12623y;
import p533x2.C12633c;

/* JADX INFO: renamed from: m0.d0 */
/* JADX INFO: loaded from: classes.dex */
public class C8282d0 {

    /* JADX INFO: renamed from: f */
    public static int f30597f;

    /* JADX INFO: renamed from: g */
    public static final C11987b f30598g = new C11987b();

    /* JADX INFO: renamed from: a */
    public final C8757g2 f30599a;

    /* JADX INFO: renamed from: b */
    public final C8785l1 f30600b;

    /* JADX INFO: renamed from: c */
    public final C8330x f30601c;

    /* JADX INFO: renamed from: d */
    public final C8325u0 f30602d;

    /* JADX INFO: renamed from: e */
    public final C8330x.c f30603e;

    public C8282d0(C8757g2 c8757g2, Size size, CameraCharacteristics cameraCharacteristics, AbstractC5913n abstractC5913n, boolean z10, AbstractC8303k0 abstractC8303k0) {
        C10110z.m39008b();
        this.f30599a = c8757g2;
        this.f30600b = C8785l1.a.m35252j(c8757g2).m35261h();
        C8330x c8330x = new C8330x();
        this.f30601c = c8330x;
        Executor executorM35128m0 = c8757g2.m35128m0(C10417c.m40083d());
        Objects.requireNonNull(executorM35128m0);
        C8325u0 c8325u0 = new C8325u0(executorM35128m0, cameraCharacteristics, abstractC5913n != null ? new C12623y(abstractC5913n) : null);
        this.f30602d = c8325u0;
        ArrayList arrayList = new ArrayList();
        if (c8757g2.m35145Z() != 0) {
            arrayList.add(32);
            arrayList.add(256);
        } else {
            arrayList.add(Integer.valueOf(m33705i()));
        }
        C8330x.c cVarM33846n = C8330x.c.m33846n(size, c8757g2.mo26767p(), arrayList, z10, c8757g2.m35127l0(), abstractC8303k0);
        this.f30603e = cVarM33846n;
        c8325u0.m33800r(c8330x.m33842s(cVarM33846n));
    }

    /* JADX INFO: renamed from: a */
    public void m33697a() {
        C10110z.m39008b();
        this.f30601c.m33837n();
        this.f30602d.m33796n();
    }

    /* JADX INFO: renamed from: b */
    public final C8310n m33698b(int i10, InterfaceC8780k1 interfaceC8780k1, AbstractC8307l1 abstractC8307l1, InterfaceC8274a1 interfaceC8274a1) {
        ArrayList arrayList = new ArrayList();
        String strValueOf = String.valueOf(interfaceC8780k1.hashCode());
        List<InterfaceC8790m1> listMo26488a = interfaceC8780k1.mo26488a();
        Objects.requireNonNull(listMo26488a);
        for (InterfaceC8790m1 interfaceC8790m1 : listMo26488a) {
            C8785l1.a aVar = new C8785l1.a();
            aVar.m35273v(this.f30600b.m35248k());
            aVar.m35258e(this.f30600b.m35244g());
            aVar.m35254a(abstractC8307l1.mo33745q());
            aVar.m35259f(this.f30603e.m33851l());
            if (this.f30603e.mo33674e().size() > 1 && this.f30603e.m33850j() != null) {
                aVar.m35259f(this.f30603e.m33850j());
            }
            boolean zM33708l = m33708l();
            if (zM33708l) {
                AbstractC8830u1 abstractC8830u1M33848g = this.f30603e.m33848g();
                Objects.requireNonNull(abstractC8830u1M33848g);
                aVar.m35259f(abstractC8830u1M33848g);
            }
            aVar.m35271t(zM33708l);
            if (C12272b.m45561j(this.f30603e.mo33673d()) || C12272b.m45562k(this.f30603e.mo33673d())) {
                if (f30598g.m44739a()) {
                    aVar.m35257d(C8785l1.f31943i, Integer.valueOf(abstractC8307l1.mo33742n()));
                }
                aVar.m35257d(C8785l1.f31944j, Integer.valueOf(m33703g(abstractC8307l1)));
            }
            aVar.m35258e(interfaceC8790m1.mo35280a().m35244g());
            aVar.m35260g(strValueOf, Integer.valueOf(interfaceC8790m1.getId()));
            aVar.m35269r(i10);
            aVar.m35256c(this.f30603e.m33847a());
            if (this.f30603e.mo33674e().size() > 1 && this.f30603e.m33849i() != null) {
                aVar.m35256c(this.f30603e.m33849i());
            }
            arrayList.add(aVar.m35261h());
        }
        return new C8310n(arrayList, interfaceC8274a1);
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC8780k1 m33699c() {
        InterfaceC8780k1 interfaceC8780k1M35123h0 = this.f30599a.m35123h0(C5890h0.m26487b());
        Objects.requireNonNull(interfaceC8780k1M35123h0);
        return interfaceC8780k1M35123h0;
    }

    /* JADX INFO: renamed from: d */
    public final C8327v0 m33700d(int i10, InterfaceC8780k1 interfaceC8780k1, AbstractC8307l1 abstractC8307l1, InterfaceC8274a1 interfaceC8274a1, InterfaceFutureC9440x<Void> interfaceFutureC9440x) {
        return new C8327v0(interfaceC8780k1, abstractC8307l1, interfaceC8274a1, interfaceFutureC9440x, i10);
    }

    /* JADX INFO: renamed from: e */
    public C12633c<C8310n, C8327v0> m33701e(AbstractC8307l1 abstractC8307l1, InterfaceC8274a1 interfaceC8274a1, InterfaceFutureC9440x<Void> interfaceFutureC9440x) {
        C10110z.m39008b();
        InterfaceC8780k1 interfaceC8780k1M33699c = m33699c();
        int i10 = f30597f;
        f30597f = i10 + 1;
        return new C12633c<>(m33698b(i10, interfaceC8780k1M33699c, abstractC8307l1, interfaceC8274a1), m33700d(i10, interfaceC8780k1M33699c, abstractC8307l1, interfaceC8274a1, interfaceFutureC9440x));
    }

    /* JADX INFO: renamed from: f */
    public C8802o3.b m33702f(Size size) {
        C8802o3.b bVarM35312r = C8802o3.b.m35312r(this.f30599a, size);
        bVarM35312r.m35323h(this.f30603e.m33851l());
        if (this.f30603e.mo33674e().size() > 1 && this.f30603e.m33850j() != null) {
            bVarM35312r.m35323h(this.f30603e.m33850j());
        }
        if (this.f30603e.m33848g() != null) {
            bVarM35312r.m35339y(this.f30603e.m33848g());
        }
        return bVarM35312r;
    }

    /* JADX INFO: renamed from: g */
    public int m33703g(AbstractC8307l1 abstractC8307l1) {
        boolean z10 = abstractC8307l1.mo33740l() != null;
        boolean zM38880h = C10085a0.m38880h(abstractC8307l1.mo33737i(), this.f30603e.mo33677k());
        if (z10 && zM38880h) {
            return abstractC8307l1.mo33736h() == 0 ? 100 : 95;
        }
        return abstractC8307l1.mo33739k();
    }

    /* JADX INFO: renamed from: h */
    public int m33704h() {
        C10110z.m39008b();
        return this.f30601c.m33832i();
    }

    /* JADX INFO: renamed from: i */
    public final int m33705i() {
        Integer num = (Integer) this.f30599a.mo35030h(C8757g2.f31834T, null);
        if (num != null) {
            return num.intValue();
        }
        Integer num2 = (Integer) this.f30599a.mo35030h(InterfaceC8763h2.f31863j, null);
        if (num2 == null || num2.intValue() != 4101) {
            return (num2 == null || num2.intValue() != 32) ? 256 : 32;
        }
        return 4101;
    }

    /* JADX INFO: renamed from: j */
    public void m33706j(InterfaceC8277b1.a aVar) {
        C10110z.m39008b();
        this.f30603e.mo33671b().accept(aVar);
    }

    /* JADX INFO: renamed from: k */
    public void m33707k(AbstractC0492b.a aVar) {
        C10110z.m39008b();
        this.f30601c.m33841r(aVar);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m33708l() {
        return this.f30603e.m33848g() != null;
    }

    /* JADX INFO: renamed from: m */
    public void m33709m(C8327v0 c8327v0) {
        C10110z.m39008b();
        this.f30603e.mo33676h().accept(c8327v0);
    }
}
