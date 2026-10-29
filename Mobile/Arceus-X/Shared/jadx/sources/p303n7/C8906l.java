package p303n7;

import android.graphics.PointF;
import p121f7.C5451h0;
import p121f7.C5452i;
import p162h7.C6308o;
import p162h7.InterfaceC6296c;
import p288m7.C8454b;
import p288m7.InterfaceC8467o;
import p324o7.AbstractC9709b;

/* JADX INFO: renamed from: n7.l */
/* JADX INFO: loaded from: classes3.dex */
public class C8906l implements InterfaceC8897c {

    /* JADX INFO: renamed from: a */
    public final String f32497a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC8467o<PointF, PointF> f32498b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC8467o<PointF, PointF> f32499c;

    /* JADX INFO: renamed from: d */
    public final C8454b f32500d;

    /* JADX INFO: renamed from: e */
    public final boolean f32501e;

    public C8906l(String str, InterfaceC8467o<PointF, PointF> interfaceC8467o, InterfaceC8467o<PointF, PointF> interfaceC8467o2, C8454b c8454b, boolean z10) {
        this.f32497a = str;
        this.f32498b = interfaceC8467o;
        this.f32499c = interfaceC8467o2;
        this.f32500d = c8454b;
        this.f32501e = z10;
    }

    @Override // p303n7.InterfaceC8897c
    /* JADX INFO: renamed from: a */
    public InterfaceC6296c mo34242a(C5451h0 c5451h0, C5452i c5452i, AbstractC9709b abstractC9709b) {
        return new C6308o(c5451h0, abstractC9709b, this);
    }

    /* JADX INFO: renamed from: b */
    public C8454b m35897b() {
        return this.f32500d;
    }

    /* JADX INFO: renamed from: c */
    public String m35898c() {
        return this.f32497a;
    }

    /* JADX INFO: renamed from: d */
    public InterfaceC8467o<PointF, PointF> m35899d() {
        return this.f32498b;
    }

    /* JADX INFO: renamed from: e */
    public InterfaceC8467o<PointF, PointF> m35900e() {
        return this.f32499c;
    }

    /* JADX INFO: renamed from: f */
    public boolean m35901f() {
        return this.f32501e;
    }

    public String toString() {
        return "RectangleShape{position=" + this.f32498b + ", size=" + this.f32499c + '}';
    }
}
