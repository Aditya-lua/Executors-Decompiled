package p303n7;

import p121f7.C5451h0;
import p121f7.C5452i;
import p162h7.C6311r;
import p162h7.InterfaceC6296c;
import p288m7.C8460h;
import p324o7.AbstractC9709b;

/* JADX INFO: renamed from: n7.r */
/* JADX INFO: loaded from: classes3.dex */
public class C8912r implements InterfaceC8897c {

    /* JADX INFO: renamed from: a */
    public final String f32521a;

    /* JADX INFO: renamed from: b */
    public final int f32522b;

    /* JADX INFO: renamed from: c */
    public final C8460h f32523c;

    /* JADX INFO: renamed from: d */
    public final boolean f32524d;

    public C8912r(String str, int i10, C8460h c8460h, boolean z10) {
        this.f32521a = str;
        this.f32522b = i10;
        this.f32523c = c8460h;
        this.f32524d = z10;
    }

    @Override // p303n7.InterfaceC8897c
    /* JADX INFO: renamed from: a */
    public InterfaceC6296c mo34242a(C5451h0 c5451h0, C5452i c5452i, AbstractC9709b abstractC9709b) {
        return new C6311r(c5451h0, abstractC9709b, this);
    }

    /* JADX INFO: renamed from: b */
    public String m35923b() {
        return this.f32521a;
    }

    /* JADX INFO: renamed from: c */
    public C8460h m35924c() {
        return this.f32523c;
    }

    /* JADX INFO: renamed from: d */
    public boolean m35925d() {
        return this.f32524d;
    }

    public String toString() {
        return "ShapePath{name=" + this.f32521a + ", index=" + this.f32522b + '}';
    }
}
