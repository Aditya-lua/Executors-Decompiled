package p303n7;

import p121f7.C5451h0;
import p121f7.C5452i;
import p162h7.C6314u;
import p162h7.InterfaceC6296c;
import p288m7.C8454b;
import p324o7.AbstractC9709b;

/* JADX INFO: renamed from: n7.t */
/* JADX INFO: loaded from: classes3.dex */
public class C8914t implements InterfaceC8897c {

    /* JADX INFO: renamed from: a */
    public final String f32543a;

    /* JADX INFO: renamed from: b */
    public final a f32544b;

    /* JADX INFO: renamed from: c */
    public final C8454b f32545c;

    /* JADX INFO: renamed from: d */
    public final C8454b f32546d;

    /* JADX INFO: renamed from: e */
    public final C8454b f32547e;

    /* JADX INFO: renamed from: f */
    public final boolean f32548f;

    /* JADX INFO: renamed from: n7.t$a */
    public enum a {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        /* JADX INFO: renamed from: b */
        public static a m35947b(int i10) {
            if (i10 == 1) {
                return SIMULTANEOUSLY;
            }
            if (i10 == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException("Unknown trim path type " + i10);
        }
    }

    public C8914t(String str, a aVar, C8454b c8454b, C8454b c8454b2, C8454b c8454b3, boolean z10) {
        this.f32543a = str;
        this.f32544b = aVar;
        this.f32545c = c8454b;
        this.f32546d = c8454b2;
        this.f32547e = c8454b3;
        this.f32548f = z10;
    }

    @Override // p303n7.InterfaceC8897c
    /* JADX INFO: renamed from: a */
    public InterfaceC6296c mo34242a(C5451h0 c5451h0, C5452i c5452i, AbstractC9709b abstractC9709b) {
        return new C6314u(abstractC9709b, this);
    }

    /* JADX INFO: renamed from: b */
    public C8454b m35940b() {
        return this.f32546d;
    }

    /* JADX INFO: renamed from: c */
    public String m35941c() {
        return this.f32543a;
    }

    /* JADX INFO: renamed from: d */
    public C8454b m35942d() {
        return this.f32547e;
    }

    /* JADX INFO: renamed from: e */
    public C8454b m35943e() {
        return this.f32545c;
    }

    /* JADX INFO: renamed from: f */
    public a m35944f() {
        return this.f32544b;
    }

    /* JADX INFO: renamed from: g */
    public boolean m35945g() {
        return this.f32548f;
    }

    public String toString() {
        return "Trim Path: {start: " + this.f32545c + ", end: " + this.f32546d + ", offset: " + this.f32547e + "}";
    }
}
