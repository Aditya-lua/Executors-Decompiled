package de;

import ae.C0171k;
import ae.C0194v0;
import be.C1369v0;
import be.InterfaceC1376y0;
import java.io.File;

/* JADX INFO: renamed from: de.t */
/* JADX INFO: loaded from: classes2.dex */
public final class C4570t implements InterfaceC1376y0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1376y0 f18708a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1376y0 f18709b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1376y0 f18710c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC1376y0 f18711d;

    public C4570t(InterfaceC1376y0 interfaceC1376y0, InterfaceC1376y0 interfaceC1376y1, InterfaceC1376y0 interfaceC1376y2, InterfaceC1376y0 interfaceC1376y3) {
        this.f18708a = interfaceC1376y0;
        this.f18709b = interfaceC1376y1;
        this.f18710c = interfaceC1376y2;
        this.f18711d = interfaceC1376y3;
    }

    @Override // be.InterfaceC1376y0
    public final /* bridge */ /* synthetic */ Object zza() {
        return new C4551a(((C0171k) this.f18708a).m527a(), (File) this.f18709b.zza(), (C0194v0) this.f18710c.zza(), C1369v0.m7224a(this.f18711d));
    }
}
