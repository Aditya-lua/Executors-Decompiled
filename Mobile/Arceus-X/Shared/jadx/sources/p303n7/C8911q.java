package p303n7;

import java.util.Arrays;
import java.util.List;
import p121f7.C5451h0;
import p121f7.C5452i;
import p162h7.C6297d;
import p162h7.InterfaceC6296c;
import p324o7.AbstractC9709b;

/* JADX INFO: renamed from: n7.q */
/* JADX INFO: loaded from: classes3.dex */
public class C8911q implements InterfaceC8897c {

    /* JADX INFO: renamed from: a */
    public final String f32518a;

    /* JADX INFO: renamed from: b */
    public final List<InterfaceC8897c> f32519b;

    /* JADX INFO: renamed from: c */
    public final boolean f32520c;

    public C8911q(String str, List<InterfaceC8897c> list, boolean z10) {
        this.f32518a = str;
        this.f32519b = list;
        this.f32520c = z10;
    }

    @Override // p303n7.InterfaceC8897c
    /* JADX INFO: renamed from: a */
    public InterfaceC6296c mo34242a(C5451h0 c5451h0, C5452i c5452i, AbstractC9709b abstractC9709b) {
        return new C6297d(c5451h0, abstractC9709b, this, c5452i);
    }

    /* JADX INFO: renamed from: b */
    public List<InterfaceC8897c> m35920b() {
        return this.f32519b;
    }

    /* JADX INFO: renamed from: c */
    public String m35921c() {
        return this.f32518a;
    }

    /* JADX INFO: renamed from: d */
    public boolean m35922d() {
        return this.f32520c;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.f32518a + "' Shapes: " + Arrays.toString(this.f32519b.toArray()) + '}';
    }
}
