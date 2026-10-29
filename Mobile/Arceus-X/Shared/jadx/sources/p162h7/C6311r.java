package p162h7;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import p121f7.C5451h0;
import p121f7.InterfaceC5465o0;
import p189i7.AbstractC6643a;
import p189i7.C6655m;
import p266l7.C8006e;
import p303n7.C8912r;
import p303n7.C8914t;
import p324o7.AbstractC9709b;
import p431s7.C11194j;
import p444t7.C11552c;

/* JADX INFO: renamed from: h7.r */
/* JADX INFO: loaded from: classes3.dex */
public class C6311r implements InterfaceC6306m, AbstractC6643a.b, InterfaceC6304k {

    /* JADX INFO: renamed from: b */
    public final String f24013b;

    /* JADX INFO: renamed from: c */
    public final boolean f24014c;

    /* JADX INFO: renamed from: d */
    public final C5451h0 f24015d;

    /* JADX INFO: renamed from: e */
    public final C6655m f24016e;

    /* JADX INFO: renamed from: f */
    public boolean f24017f;

    /* JADX INFO: renamed from: a */
    public final Path f24012a = new Path();

    /* JADX INFO: renamed from: g */
    public final C6295b f24018g = new C6295b();

    public C6311r(C5451h0 c5451h0, AbstractC9709b abstractC9709b, C8912r c8912r) {
        this.f24013b = c8912r.m35923b();
        this.f24014c = c8912r.m35925d();
        this.f24015d = c5451h0;
        C6655m c6655mMo34233a = c8912r.m35924c().mo34233a();
        this.f24016e = c6655mMo34233a;
        abstractC9709b.m38353j(c6655mMo34233a);
        c6655mMo34233a.m28661a(this);
    }

    /* JADX INFO: renamed from: f */
    private void m27615f() {
        this.f24017f = false;
        this.f24015d.invalidateSelf();
    }

    @Override // p189i7.AbstractC6643a.b
    /* JADX INFO: renamed from: a */
    public void mo27575a() {
        m27615f();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:12:0x002a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0039 A[SYNTHETIC] */
    @Override // p162h7.InterfaceC6296c
    /* JADX INFO: renamed from: b */
    public void mo27576b(List<InterfaceC6296c> list, List<InterfaceC6296c> list2) {
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            InterfaceC6296c interfaceC6296c = list.get(i10);
            if (interfaceC6296c instanceof C6314u) {
                C6314u c6314u = (C6314u) interfaceC6296c;
                if (c6314u.m27620k() == C8914t.a.SIMULTANEOUSLY) {
                    this.f24018g.m27585a(c6314u);
                    c6314u.m27616c(this);
                } else if (!(interfaceC6296c instanceof InterfaceC6312s)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    InterfaceC6312s interfaceC6312s = (InterfaceC6312s) interfaceC6296c;
                    interfaceC6312s.mo27612g(this);
                    arrayList.add(interfaceC6312s);
                }
            } else if (!(interfaceC6296c instanceof InterfaceC6312s)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                InterfaceC6312s interfaceC6312s2 = (InterfaceC6312s) interfaceC6296c;
                interfaceC6312s2.mo27612g(this);
                arrayList.add(interfaceC6312s2);
            }
        }
        this.f24016e.m28709s(arrayList);
    }

    @Override // p266l7.InterfaceC8007f
    /* JADX INFO: renamed from: c */
    public <T> void mo27577c(T t8, C11552c<T> c11552c) {
        if (t8 == InterfaceC5465o0.f21160P) {
            this.f24016e.m28675o(c11552c);
        }
    }

    @Override // p162h7.InterfaceC6296c
    public String getName() {
        return this.f24013b;
    }

    @Override // p162h7.InterfaceC6306m
    public Path getPath() {
        if (this.f24017f && !this.f24016e.m28671k()) {
            return this.f24012a;
        }
        this.f24012a.reset();
        if (this.f24014c) {
            this.f24017f = true;
            return this.f24012a;
        }
        Path pathMo28668h = this.f24016e.mo28668h();
        if (pathMo28668h == null) {
            return this.f24012a;
        }
        this.f24012a.set(pathMo28668h);
        this.f24012a.setFillType(Path.FillType.EVEN_ODD);
        this.f24018g.m27586b(this.f24012a);
        this.f24017f = true;
        return this.f24012a;
    }

    @Override // p266l7.InterfaceC8007f
    /* JADX INFO: renamed from: h */
    public void mo27580h(C8006e c8006e, int i10, List<C8006e> list, C8006e c8006e2) {
        C11194j.m42193k(c8006e, i10, list, c8006e2, this);
    }
}
