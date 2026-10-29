package p303n7;

import android.graphics.Path;
import p121f7.C5451h0;
import p121f7.C5452i;
import p162h7.C6301h;
import p162h7.InterfaceC6296c;
import p288m7.C8454b;
import p288m7.C8455c;
import p288m7.C8456d;
import p288m7.C8458f;
import p324o7.AbstractC9709b;

/* JADX INFO: renamed from: n7.e */
/* JADX INFO: loaded from: classes3.dex */
public class C8899e implements InterfaceC8897c {

    /* JADX INFO: renamed from: a */
    public final EnumC8901g f32419a;

    /* JADX INFO: renamed from: b */
    public final Path.FillType f32420b;

    /* JADX INFO: renamed from: c */
    public final C8455c f32421c;

    /* JADX INFO: renamed from: d */
    public final C8456d f32422d;

    /* JADX INFO: renamed from: e */
    public final C8458f f32423e;

    /* JADX INFO: renamed from: f */
    public final C8458f f32424f;

    /* JADX INFO: renamed from: g */
    public final String f32425g;

    /* JADX INFO: renamed from: h */
    public final C8454b f32426h;

    /* JADX INFO: renamed from: i */
    public final C8454b f32427i;

    /* JADX INFO: renamed from: j */
    public final boolean f32428j;

    public C8899e(String str, EnumC8901g enumC8901g, Path.FillType fillType, C8455c c8455c, C8456d c8456d, C8458f c8458f, C8458f c8458f2, C8454b c8454b, C8454b c8454b2, boolean z10) {
        this.f32419a = enumC8901g;
        this.f32420b = fillType;
        this.f32421c = c8455c;
        this.f32422d = c8456d;
        this.f32423e = c8458f;
        this.f32424f = c8458f2;
        this.f32425g = str;
        this.f32426h = c8454b;
        this.f32427i = c8454b2;
        this.f32428j = z10;
    }

    @Override // p303n7.InterfaceC8897c
    /* JADX INFO: renamed from: a */
    public InterfaceC6296c mo34242a(C5451h0 c5451h0, C5452i c5452i, AbstractC9709b abstractC9709b) {
        return new C6301h(c5451h0, c5452i, abstractC9709b, this);
    }

    /* JADX INFO: renamed from: b */
    public C8458f m35850b() {
        return this.f32424f;
    }

    /* JADX INFO: renamed from: c */
    public Path.FillType m35851c() {
        return this.f32420b;
    }

    /* JADX INFO: renamed from: d */
    public C8455c m35852d() {
        return this.f32421c;
    }

    /* JADX INFO: renamed from: e */
    public EnumC8901g m35853e() {
        return this.f32419a;
    }

    /* JADX INFO: renamed from: f */
    public String m35854f() {
        return this.f32425g;
    }

    /* JADX INFO: renamed from: g */
    public C8456d m35855g() {
        return this.f32422d;
    }

    /* JADX INFO: renamed from: h */
    public C8458f m35856h() {
        return this.f32423e;
    }

    /* JADX INFO: renamed from: i */
    public boolean m35857i() {
        return this.f32428j;
    }
}
