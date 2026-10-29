package p303n7;

import android.graphics.PointF;
import p121f7.C5451h0;
import p121f7.C5452i;
import p162h7.C6299f;
import p162h7.InterfaceC6296c;
import p288m7.C8458f;
import p288m7.InterfaceC8467o;
import p324o7.AbstractC9709b;

/* JADX INFO: renamed from: n7.b */
/* JADX INFO: loaded from: classes3.dex */
public class C8896b implements InterfaceC8897c {

    /* JADX INFO: renamed from: a */
    public final String f32412a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC8467o<PointF, PointF> f32413b;

    /* JADX INFO: renamed from: c */
    public final C8458f f32414c;

    /* JADX INFO: renamed from: d */
    public final boolean f32415d;

    /* JADX INFO: renamed from: e */
    public final boolean f32416e;

    public C8896b(String str, InterfaceC8467o<PointF, PointF> interfaceC8467o, C8458f c8458f, boolean z10, boolean z11) {
        this.f32412a = str;
        this.f32413b = interfaceC8467o;
        this.f32414c = c8458f;
        this.f32415d = z10;
        this.f32416e = z11;
    }

    @Override // p303n7.InterfaceC8897c
    /* JADX INFO: renamed from: a */
    public InterfaceC6296c mo34242a(C5451h0 c5451h0, C5452i c5452i, AbstractC9709b abstractC9709b) {
        return new C6299f(c5451h0, abstractC9709b, this);
    }

    /* JADX INFO: renamed from: b */
    public String m35838b() {
        return this.f32412a;
    }

    /* JADX INFO: renamed from: c */
    public InterfaceC8467o<PointF, PointF> m35839c() {
        return this.f32413b;
    }

    /* JADX INFO: renamed from: d */
    public C8458f m35840d() {
        return this.f32414c;
    }

    /* JADX INFO: renamed from: e */
    public boolean m35841e() {
        return this.f32416e;
    }

    /* JADX INFO: renamed from: f */
    public boolean m35842f() {
        return this.f32415d;
    }
}
