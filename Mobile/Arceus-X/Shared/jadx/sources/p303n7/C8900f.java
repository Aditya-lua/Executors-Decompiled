package p303n7;

import java.util.List;
import p121f7.C5451h0;
import p121f7.C5452i;
import p162h7.C6302i;
import p162h7.InterfaceC6296c;
import p288m7.C8454b;
import p288m7.C8455c;
import p288m7.C8456d;
import p288m7.C8458f;
import p324o7.AbstractC9709b;

/* JADX INFO: renamed from: n7.f */
/* JADX INFO: loaded from: classes3.dex */
public class C8900f implements InterfaceC8897c {

    /* JADX INFO: renamed from: a */
    public final String f32429a;

    /* JADX INFO: renamed from: b */
    public final EnumC8901g f32430b;

    /* JADX INFO: renamed from: c */
    public final C8455c f32431c;

    /* JADX INFO: renamed from: d */
    public final C8456d f32432d;

    /* JADX INFO: renamed from: e */
    public final C8458f f32433e;

    /* JADX INFO: renamed from: f */
    public final C8458f f32434f;

    /* JADX INFO: renamed from: g */
    public final C8454b f32435g;

    /* JADX INFO: renamed from: h */
    public final C8913s.a f32436h;

    /* JADX INFO: renamed from: i */
    public final C8913s.b f32437i;

    /* JADX INFO: renamed from: j */
    public final float f32438j;

    /* JADX INFO: renamed from: k */
    public final List<C8454b> f32439k;

    /* JADX INFO: renamed from: l */
    public final C8454b f32440l;

    /* JADX INFO: renamed from: m */
    public final boolean f32441m;

    public C8900f(String str, EnumC8901g enumC8901g, C8455c c8455c, C8456d c8456d, C8458f c8458f, C8458f c8458f2, C8454b c8454b, C8913s.a aVar, C8913s.b bVar, float f10, List<C8454b> list, C8454b c8454b2, boolean z10) {
        this.f32429a = str;
        this.f32430b = enumC8901g;
        this.f32431c = c8455c;
        this.f32432d = c8456d;
        this.f32433e = c8458f;
        this.f32434f = c8458f2;
        this.f32435g = c8454b;
        this.f32436h = aVar;
        this.f32437i = bVar;
        this.f32438j = f10;
        this.f32439k = list;
        this.f32440l = c8454b2;
        this.f32441m = z10;
    }

    @Override // p303n7.InterfaceC8897c
    /* JADX INFO: renamed from: a */
    public InterfaceC6296c mo34242a(C5451h0 c5451h0, C5452i c5452i, AbstractC9709b abstractC9709b) {
        return new C6302i(c5451h0, abstractC9709b, this);
    }

    /* JADX INFO: renamed from: b */
    public C8913s.a m35858b() {
        return this.f32436h;
    }

    /* JADX INFO: renamed from: c */
    public C8454b m35859c() {
        return this.f32440l;
    }

    /* JADX INFO: renamed from: d */
    public C8458f m35860d() {
        return this.f32434f;
    }

    /* JADX INFO: renamed from: e */
    public C8455c m35861e() {
        return this.f32431c;
    }

    /* JADX INFO: renamed from: f */
    public EnumC8901g m35862f() {
        return this.f32430b;
    }

    /* JADX INFO: renamed from: g */
    public C8913s.b m35863g() {
        return this.f32437i;
    }

    /* JADX INFO: renamed from: h */
    public List<C8454b> m35864h() {
        return this.f32439k;
    }

    /* JADX INFO: renamed from: i */
    public float m35865i() {
        return this.f32438j;
    }

    /* JADX INFO: renamed from: j */
    public String m35866j() {
        return this.f32429a;
    }

    /* JADX INFO: renamed from: k */
    public C8456d m35867k() {
        return this.f32432d;
    }

    /* JADX INFO: renamed from: l */
    public C8458f m35868l() {
        return this.f32433e;
    }

    /* JADX INFO: renamed from: m */
    public C8454b m35869m() {
        return this.f32435g;
    }

    /* JADX INFO: renamed from: n */
    public boolean m35870n() {
        return this.f32441m;
    }
}
