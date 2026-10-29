package p303n7;

import android.graphics.PointF;
import p121f7.C5451h0;
import p121f7.C5452i;
import p162h7.C6307n;
import p162h7.InterfaceC6296c;
import p288m7.C8454b;
import p288m7.InterfaceC8467o;
import p324o7.AbstractC9709b;

/* JADX INFO: renamed from: n7.k */
/* JADX INFO: loaded from: classes3.dex */
public class C8905k implements InterfaceC8897c {

    /* JADX INFO: renamed from: a */
    public final String f32482a;

    /* JADX INFO: renamed from: b */
    public final a f32483b;

    /* JADX INFO: renamed from: c */
    public final C8454b f32484c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC8467o<PointF, PointF> f32485d;

    /* JADX INFO: renamed from: e */
    public final C8454b f32486e;

    /* JADX INFO: renamed from: f */
    public final C8454b f32487f;

    /* JADX INFO: renamed from: g */
    public final C8454b f32488g;

    /* JADX INFO: renamed from: h */
    public final C8454b f32489h;

    /* JADX INFO: renamed from: i */
    public final C8454b f32490i;

    /* JADX INFO: renamed from: j */
    public final boolean f32491j;

    /* JADX INFO: renamed from: k */
    public final boolean f32492k;

    /* JADX INFO: renamed from: n7.k$a */
    public enum a {
        STAR(1),
        POLYGON(2);


        /* JADX INFO: renamed from: a */
        public final int f32496a;

        a(int i10) {
            this.f32496a = i10;
        }

        /* JADX INFO: renamed from: b */
        public static a m35896b(int i10) {
            for (a aVar : values()) {
                if (aVar.f32496a == i10) {
                    return aVar;
                }
            }
            return null;
        }
    }

    public C8905k(String str, a aVar, C8454b c8454b, InterfaceC8467o<PointF, PointF> interfaceC8467o, C8454b c8454b2, C8454b c8454b3, C8454b c8454b4, C8454b c8454b5, C8454b c8454b6, boolean z10, boolean z11) {
        this.f32482a = str;
        this.f32483b = aVar;
        this.f32484c = c8454b;
        this.f32485d = interfaceC8467o;
        this.f32486e = c8454b2;
        this.f32487f = c8454b3;
        this.f32488g = c8454b4;
        this.f32489h = c8454b5;
        this.f32490i = c8454b6;
        this.f32491j = z10;
        this.f32492k = z11;
    }

    @Override // p303n7.InterfaceC8897c
    /* JADX INFO: renamed from: a */
    public InterfaceC6296c mo34242a(C5451h0 c5451h0, C5452i c5452i, AbstractC9709b abstractC9709b) {
        return new C6307n(c5451h0, abstractC9709b, this);
    }

    /* JADX INFO: renamed from: b */
    public C8454b m35884b() {
        return this.f32487f;
    }

    /* JADX INFO: renamed from: c */
    public C8454b m35885c() {
        return this.f32489h;
    }

    /* JADX INFO: renamed from: d */
    public String m35886d() {
        return this.f32482a;
    }

    /* JADX INFO: renamed from: e */
    public C8454b m35887e() {
        return this.f32488g;
    }

    /* JADX INFO: renamed from: f */
    public C8454b m35888f() {
        return this.f32490i;
    }

    /* JADX INFO: renamed from: g */
    public C8454b m35889g() {
        return this.f32484c;
    }

    /* JADX INFO: renamed from: h */
    public InterfaceC8467o<PointF, PointF> m35890h() {
        return this.f32485d;
    }

    /* JADX INFO: renamed from: i */
    public C8454b m35891i() {
        return this.f32486e;
    }

    /* JADX INFO: renamed from: j */
    public a m35892j() {
        return this.f32483b;
    }

    /* JADX INFO: renamed from: k */
    public boolean m35893k() {
        return this.f32491j;
    }

    /* JADX INFO: renamed from: l */
    public boolean m35894l() {
        return this.f32492k;
    }
}
