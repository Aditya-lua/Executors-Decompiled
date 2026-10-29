package p303n7;

import android.graphics.Path;
import p121f7.C5451h0;
import p121f7.C5452i;
import p162h7.C6300g;
import p162h7.InterfaceC6296c;
import p288m7.C8453a;
import p288m7.C8456d;
import p324o7.AbstractC9709b;

/* JADX INFO: renamed from: n7.p */
/* JADX INFO: loaded from: classes3.dex */
public class C8910p implements InterfaceC8897c {

    /* JADX INFO: renamed from: a */
    public final boolean f32512a;

    /* JADX INFO: renamed from: b */
    public final Path.FillType f32513b;

    /* JADX INFO: renamed from: c */
    public final String f32514c;

    /* JADX INFO: renamed from: d */
    public final C8453a f32515d;

    /* JADX INFO: renamed from: e */
    public final C8456d f32516e;

    /* JADX INFO: renamed from: f */
    public final boolean f32517f;

    public C8910p(String str, boolean z10, Path.FillType fillType, C8453a c8453a, C8456d c8456d, boolean z11) {
        this.f32514c = str;
        this.f32512a = z10;
        this.f32513b = fillType;
        this.f32515d = c8453a;
        this.f32516e = c8456d;
        this.f32517f = z11;
    }

    @Override // p303n7.InterfaceC8897c
    /* JADX INFO: renamed from: a */
    public InterfaceC6296c mo34242a(C5451h0 c5451h0, C5452i c5452i, AbstractC9709b abstractC9709b) {
        return new C6300g(c5451h0, abstractC9709b, this);
    }

    /* JADX INFO: renamed from: b */
    public C8453a m35915b() {
        return this.f32515d;
    }

    /* JADX INFO: renamed from: c */
    public Path.FillType m35916c() {
        return this.f32513b;
    }

    /* JADX INFO: renamed from: d */
    public String m35917d() {
        return this.f32514c;
    }

    /* JADX INFO: renamed from: e */
    public C8456d m35918e() {
        return this.f32516e;
    }

    /* JADX INFO: renamed from: f */
    public boolean m35919f() {
        return this.f32517f;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f32512a + '}';
    }
}
