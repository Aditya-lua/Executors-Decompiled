package p162h7;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import p121f7.C5451h0;
import p121f7.C5452i;
import p189i7.AbstractC6643a;
import p189i7.C6658p;
import p266l7.C8006e;
import p266l7.InterfaceC8007f;
import p288m7.C8466n;
import p303n7.C8911q;
import p303n7.InterfaceC8897c;
import p324o7.AbstractC9709b;
import p431s7.C11186b;
import p431s7.C11196l;
import p444t7.C11552c;

/* JADX INFO: renamed from: h7.d */
/* JADX INFO: loaded from: classes3.dex */
public class C6297d implements InterfaceC6298e, InterfaceC6306m, AbstractC6643a.b, InterfaceC8007f {

    /* JADX INFO: renamed from: a */
    public final C11196l.a f23898a;

    /* JADX INFO: renamed from: b */
    public final RectF f23899b;

    /* JADX INFO: renamed from: c */
    public final C11196l f23900c;

    /* JADX INFO: renamed from: d */
    public final Matrix f23901d;

    /* JADX INFO: renamed from: e */
    public final Path f23902e;

    /* JADX INFO: renamed from: f */
    public final RectF f23903f;

    /* JADX INFO: renamed from: g */
    public final String f23904g;

    /* JADX INFO: renamed from: h */
    public final boolean f23905h;

    /* JADX INFO: renamed from: i */
    public final List<InterfaceC6296c> f23906i;

    /* JADX INFO: renamed from: j */
    public final C5451h0 f23907j;

    /* JADX INFO: renamed from: k */
    public List<InterfaceC6306m> f23908k;

    /* JADX INFO: renamed from: l */
    public C6658p f23909l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6297d(C5451h0 c5451h0, AbstractC9709b abstractC9709b, C8911q c8911q, C5452i c5452i) {
        this(c5451h0, abstractC9709b, c8911q.m35921c(), c8911q.m35922d(), m27587f(c5451h0, c5452i, abstractC9709b, c8911q.m35920b()), m27588j(c8911q.m35920b()));
    }

    /* JADX INFO: renamed from: f */
    public static List<InterfaceC6296c> m27587f(C5451h0 c5451h0, C5452i c5452i, AbstractC9709b abstractC9709b, List<InterfaceC8897c> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            InterfaceC6296c interfaceC6296cMo34242a = list.get(i10).mo34242a(c5451h0, c5452i, abstractC9709b);
            if (interfaceC6296cMo34242a != null) {
                arrayList.add(interfaceC6296cMo34242a);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public static C8466n m27588j(List<InterfaceC8897c> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            InterfaceC8897c interfaceC8897c = list.get(i10);
            if (interfaceC8897c instanceof C8466n) {
                return (C8466n) interfaceC8897c;
            }
        }
        return null;
    }

    @Override // p189i7.AbstractC6643a.b
    /* JADX INFO: renamed from: a */
    public void mo27575a() {
        this.f23907j.invalidateSelf();
    }

    @Override // p162h7.InterfaceC6296c
    /* JADX INFO: renamed from: b */
    public void mo27576b(List<InterfaceC6296c> list, List<InterfaceC6296c> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f23906i.size());
        arrayList.addAll(list);
        for (int size = this.f23906i.size() - 1; size >= 0; size--) {
            InterfaceC6296c interfaceC6296c = this.f23906i.get(size);
            interfaceC6296c.mo27576b(arrayList, this.f23906i.subList(0, size));
            arrayList.add(interfaceC6296c);
        }
    }

    @Override // p266l7.InterfaceC8007f
    /* JADX INFO: renamed from: c */
    public <T> void mo27577c(T t8, C11552c<T> c11552c) {
        C6658p c6658p = this.f23909l;
        if (c6658p != null) {
            c6658p.m28719c(t8, c11552c);
        }
    }

    @Override // p162h7.InterfaceC6298e
    /* JADX INFO: renamed from: e */
    public void mo27578e(RectF rectF, Matrix matrix, boolean z10) {
        this.f23901d.set(matrix);
        C6658p c6658p = this.f23909l;
        if (c6658p != null) {
            this.f23901d.preConcat(c6658p.m28722f());
        }
        this.f23903f.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f23906i.size() - 1; size >= 0; size--) {
            InterfaceC6296c interfaceC6296c = this.f23906i.get(size);
            if (interfaceC6296c instanceof InterfaceC6298e) {
                ((InterfaceC6298e) interfaceC6296c).mo27578e(this.f23903f, this.f23901d, z10);
                rectF.union(this.f23903f);
            }
        }
    }

    @Override // p162h7.InterfaceC6296c
    public String getName() {
        return this.f23904g;
    }

    @Override // p162h7.InterfaceC6306m
    public Path getPath() {
        this.f23901d.reset();
        C6658p c6658p = this.f23909l;
        if (c6658p != null) {
            this.f23901d.set(c6658p.m28722f());
        }
        this.f23902e.reset();
        if (this.f23905h) {
            return this.f23902e;
        }
        for (int size = this.f23906i.size() - 1; size >= 0; size--) {
            InterfaceC6296c interfaceC6296c = this.f23906i.get(size);
            if (interfaceC6296c instanceof InterfaceC6306m) {
                this.f23902e.addPath(((InterfaceC6306m) interfaceC6296c).getPath(), this.f23901d);
            }
        }
        return this.f23902e;
    }

    @Override // p266l7.InterfaceC8007f
    /* JADX INFO: renamed from: h */
    public void mo27580h(C8006e c8006e, int i10, List<C8006e> list, C8006e c8006e2) {
        if (c8006e.m33082g(getName(), i10) || "__container".equals(getName())) {
            if (!"__container".equals(getName())) {
                c8006e2 = c8006e2.m33076a(getName());
                if (c8006e.m33078c(getName(), i10)) {
                    list.add(c8006e2.m33084i(this));
                }
            }
            if (c8006e.m33083h(getName(), i10)) {
                int iM33080e = i10 + c8006e.m33080e(getName(), i10);
                for (int i11 = 0; i11 < this.f23906i.size(); i11++) {
                    InterfaceC6296c interfaceC6296c = this.f23906i.get(i11);
                    if (interfaceC6296c instanceof InterfaceC8007f) {
                        ((InterfaceC8007f) interfaceC6296c).mo27580h(c8006e, iM33080e, list, c8006e2);
                    }
                }
            }
        }
    }

    @Override // p162h7.InterfaceC6298e
    /* JADX INFO: renamed from: i */
    public void mo27581i(Canvas canvas, Matrix matrix, int i10, C11186b c11186b) {
        if (this.f23905h) {
            return;
        }
        this.f23901d.set(matrix);
        C6658p c6658p = this.f23909l;
        if (c6658p != null) {
            this.f23901d.preConcat(c6658p.m28722f());
            i10 = (int) (((((this.f23909l.m28724h() == null ? 100 : this.f23909l.m28724h().mo28668h().intValue()) / 100.0f) * i10) / 255.0f) * 255.0f);
        }
        boolean z10 = (this.f23907j.m25003f0() && m27592n() && i10 != 255) || (c11186b != null && this.f23907j.m25004g0() && m27592n());
        int i11 = z10 ? 255 : i10;
        if (z10) {
            this.f23899b.set(0.0f, 0.0f, 0.0f, 0.0f);
            mo27578e(this.f23899b, matrix, true);
            C11196l.a aVar = this.f23898a;
            aVar.f39515a = i10;
            if (c11186b != null) {
                c11186b.m42137b(aVar);
                c11186b = null;
            } else {
                aVar.f39518d = null;
            }
            canvas = this.f23900c.m42204j(canvas, this.f23899b, this.f23898a);
        } else if (c11186b != null) {
            C11186b c11186b2 = new C11186b(c11186b);
            c11186b2.m42144i(i11);
            c11186b = c11186b2;
        }
        for (int size = this.f23906i.size() - 1; size >= 0; size--) {
            InterfaceC6296c interfaceC6296c = this.f23906i.get(size);
            if (interfaceC6296c instanceof InterfaceC6298e) {
                ((InterfaceC6298e) interfaceC6296c).mo27581i(canvas, this.f23901d, i11, c11186b);
            }
        }
        if (z10) {
            this.f23900c.m42199e();
        }
    }

    /* JADX INFO: renamed from: k */
    public List<InterfaceC6296c> m27589k() {
        return this.f23906i;
    }

    /* JADX INFO: renamed from: l */
    public List<InterfaceC6306m> m27590l() {
        if (this.f23908k == null) {
            this.f23908k = new ArrayList();
            for (int i10 = 0; i10 < this.f23906i.size(); i10++) {
                InterfaceC6296c interfaceC6296c = this.f23906i.get(i10);
                if (interfaceC6296c instanceof InterfaceC6306m) {
                    this.f23908k.add((InterfaceC6306m) interfaceC6296c);
                }
            }
        }
        return this.f23908k;
    }

    /* JADX INFO: renamed from: m */
    public Matrix m27591m() {
        C6658p c6658p = this.f23909l;
        if (c6658p != null) {
            return c6658p.m28722f();
        }
        this.f23901d.reset();
        return this.f23901d;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m27592n() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f23906i.size(); i11++) {
            if ((this.f23906i.get(i11) instanceof InterfaceC6298e) && (i10 = i10 + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    public C6297d(C5451h0 c5451h0, AbstractC9709b abstractC9709b, String str, boolean z10, List<InterfaceC6296c> list, C8466n c8466n) {
        this.f23898a = new C11196l.a();
        this.f23899b = new RectF();
        this.f23900c = new C11196l();
        this.f23901d = new Matrix();
        this.f23902e = new Path();
        this.f23903f = new RectF();
        this.f23904g = str;
        this.f23907j = c5451h0;
        this.f23905h = z10;
        this.f23906i = list;
        if (c8466n != null) {
            C6658p c6658pM34243b = c8466n.m34243b();
            this.f23909l = c6658pM34243b;
            c6658pM34243b.m28717a(abstractC9709b);
            this.f23909l.m28718b(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            InterfaceC6296c interfaceC6296c = list.get(size);
            if (interfaceC6296c instanceof InterfaceC6303j) {
                arrayList.add((InterfaceC6303j) interfaceC6296c);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((InterfaceC6303j) arrayList.get(size2)).mo27602f(list.listIterator(list.size()));
        }
    }
}
