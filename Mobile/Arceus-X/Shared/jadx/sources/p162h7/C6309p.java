package p162h7;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import p121f7.C5451h0;
import p121f7.InterfaceC5465o0;
import p189i7.AbstractC6643a;
import p189i7.C6646d;
import p189i7.C6658p;
import p266l7.C8006e;
import p303n7.C8907m;
import p324o7.AbstractC9709b;
import p431s7.C11186b;
import p431s7.C11194j;
import p444t7.C11552c;

/* JADX INFO: renamed from: h7.p */
/* JADX INFO: loaded from: classes3.dex */
public class C6309p implements InterfaceC6298e, InterfaceC6306m, InterfaceC6303j, AbstractC6643a.b, InterfaceC6304k {

    /* JADX INFO: renamed from: a */
    public final Matrix f23998a = new Matrix();

    /* JADX INFO: renamed from: b */
    public final Path f23999b = new Path();

    /* JADX INFO: renamed from: c */
    public final C5451h0 f24000c;

    /* JADX INFO: renamed from: d */
    public final AbstractC9709b f24001d;

    /* JADX INFO: renamed from: e */
    public final String f24002e;

    /* JADX INFO: renamed from: f */
    public final boolean f24003f;

    /* JADX INFO: renamed from: g */
    public final AbstractC6643a<Float, Float> f24004g;

    /* JADX INFO: renamed from: h */
    public final AbstractC6643a<Float, Float> f24005h;

    /* JADX INFO: renamed from: i */
    public final C6658p f24006i;

    /* JADX INFO: renamed from: j */
    public C6297d f24007j;

    public C6309p(C5451h0 c5451h0, AbstractC9709b abstractC9709b, C8907m c8907m) {
        this.f24000c = c5451h0;
        this.f24001d = abstractC9709b;
        this.f24002e = c8907m.m35903c();
        this.f24003f = c8907m.m35906f();
        C6646d c6646dMo34233a = c8907m.m35902b().mo34233a();
        this.f24004g = c6646dMo34233a;
        abstractC9709b.m38353j(c6646dMo34233a);
        c6646dMo34233a.m28661a(this);
        C6646d c6646dMo34233a2 = c8907m.m35904d().mo34233a();
        this.f24005h = c6646dMo34233a2;
        abstractC9709b.m38353j(c6646dMo34233a2);
        c6646dMo34233a2.m28661a(this);
        C6658p c6658pM34243b = c8907m.m35905e().m34243b();
        this.f24006i = c6658pM34243b;
        c6658pM34243b.m28717a(abstractC9709b);
        c6658pM34243b.m28718b(this);
    }

    @Override // p189i7.AbstractC6643a.b
    /* JADX INFO: renamed from: a */
    public void mo27575a() {
        this.f24000c.invalidateSelf();
    }

    @Override // p162h7.InterfaceC6296c
    /* JADX INFO: renamed from: b */
    public void mo27576b(List<InterfaceC6296c> list, List<InterfaceC6296c> list2) {
        this.f24007j.mo27576b(list, list2);
    }

    @Override // p266l7.InterfaceC8007f
    /* JADX INFO: renamed from: c */
    public <T> void mo27577c(T t8, C11552c<T> c11552c) {
        if (this.f24006i.m28719c(t8, c11552c)) {
            return;
        }
        if (t8 == InterfaceC5465o0.f21181u) {
            this.f24004g.m28675o(c11552c);
        } else if (t8 == InterfaceC5465o0.f21182v) {
            this.f24005h.m28675o(c11552c);
        }
    }

    @Override // p162h7.InterfaceC6298e
    /* JADX INFO: renamed from: e */
    public void mo27578e(RectF rectF, Matrix matrix, boolean z10) {
        this.f24007j.mo27578e(rectF, matrix, z10);
    }

    @Override // p162h7.InterfaceC6303j
    /* JADX INFO: renamed from: f */
    public void mo27602f(ListIterator<InterfaceC6296c> listIterator) {
        if (this.f24007j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f24007j = new C6297d(this.f24000c, this.f24001d, "Repeater", this.f24003f, arrayList, null);
    }

    @Override // p162h7.InterfaceC6296c
    public String getName() {
        return this.f24002e;
    }

    @Override // p162h7.InterfaceC6306m
    public Path getPath() {
        Path path = this.f24007j.getPath();
        this.f23999b.reset();
        float fFloatValue = this.f24004g.mo28668h().floatValue();
        float fFloatValue2 = this.f24005h.mo28668h().floatValue();
        for (int i10 = ((int) fFloatValue) - 1; i10 >= 0; i10--) {
            this.f23998a.set(this.f24006i.m28723g(i10 + fFloatValue2));
            this.f23999b.addPath(path, this.f23998a);
        }
        return this.f23999b;
    }

    @Override // p266l7.InterfaceC8007f
    /* JADX INFO: renamed from: h */
    public void mo27580h(C8006e c8006e, int i10, List<C8006e> list, C8006e c8006e2) {
        C11194j.m42193k(c8006e, i10, list, c8006e2, this);
        for (int i11 = 0; i11 < this.f24007j.m27589k().size(); i11++) {
            InterfaceC6296c interfaceC6296c = this.f24007j.m27589k().get(i11);
            if (interfaceC6296c instanceof InterfaceC6304k) {
                C11194j.m42193k(c8006e, i10, list, c8006e2, (InterfaceC6304k) interfaceC6296c);
            }
        }
    }

    @Override // p162h7.InterfaceC6298e
    /* JADX INFO: renamed from: i */
    public void mo27581i(Canvas canvas, Matrix matrix, int i10, C11186b c11186b) {
        float fFloatValue = this.f24004g.mo28668h().floatValue();
        float fFloatValue2 = this.f24005h.mo28668h().floatValue();
        float fFloatValue3 = this.f24006i.m28725i().mo28668h().floatValue() / 100.0f;
        float fFloatValue4 = this.f24006i.m28721e().mo28668h().floatValue() / 100.0f;
        for (int i11 = ((int) fFloatValue) - 1; i11 >= 0; i11--) {
            this.f23998a.set(matrix);
            float f10 = i11;
            this.f23998a.preConcat(this.f24006i.m28723g(f10 + fFloatValue2));
            this.f24007j.mo27581i(canvas, this.f23998a, (int) (i10 * C11194j.m42191i(fFloatValue3, fFloatValue4, f10 / fFloatValue)), c11186b);
        }
    }
}
