package p303n7;

import p121f7.C5451h0;
import p121f7.C5452i;
import p162h7.C6310q;
import p162h7.InterfaceC6296c;
import p288m7.InterfaceC8467o;
import p324o7.AbstractC9709b;

/* JADX INFO: renamed from: n7.n */
/* JADX INFO: loaded from: classes3.dex */
public class C8908n implements InterfaceC8897c {

    /* JADX INFO: renamed from: a */
    public final String f32507a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC8467o<Float, Float> f32508b;

    public C8908n(String str, InterfaceC8467o<Float, Float> interfaceC8467o) {
        this.f32507a = str;
        this.f32508b = interfaceC8467o;
    }

    @Override // p303n7.InterfaceC8897c
    /* JADX INFO: renamed from: a */
    public InterfaceC6296c mo34242a(C5451h0 c5451h0, C5452i c5452i, AbstractC9709b abstractC9709b) {
        return new C6310q(c5451h0, abstractC9709b, this);
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC8467o<Float, Float> m35907b() {
        return this.f32508b;
    }

    /* JADX INFO: renamed from: c */
    public String m35908c() {
        return this.f32507a;
    }
}
