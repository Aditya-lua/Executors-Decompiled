package p303n7;

import p121f7.C5451h0;
import p121f7.C5452i;
import p162h7.C6309p;
import p162h7.InterfaceC6296c;
import p288m7.C8454b;
import p288m7.C8466n;
import p324o7.AbstractC9709b;

/* JADX INFO: renamed from: n7.m */
/* JADX INFO: loaded from: classes3.dex */
public class C8907m implements InterfaceC8897c {

    /* JADX INFO: renamed from: a */
    public final String f32502a;

    /* JADX INFO: renamed from: b */
    public final C8454b f32503b;

    /* JADX INFO: renamed from: c */
    public final C8454b f32504c;

    /* JADX INFO: renamed from: d */
    public final C8466n f32505d;

    /* JADX INFO: renamed from: e */
    public final boolean f32506e;

    public C8907m(String str, C8454b c8454b, C8454b c8454b2, C8466n c8466n, boolean z10) {
        this.f32502a = str;
        this.f32503b = c8454b;
        this.f32504c = c8454b2;
        this.f32505d = c8466n;
        this.f32506e = z10;
    }

    @Override // p303n7.InterfaceC8897c
    /* JADX INFO: renamed from: a */
    public InterfaceC6296c mo34242a(C5451h0 c5451h0, C5452i c5452i, AbstractC9709b abstractC9709b) {
        return new C6309p(c5451h0, abstractC9709b, this);
    }

    /* JADX INFO: renamed from: b */
    public C8454b m35902b() {
        return this.f32503b;
    }

    /* JADX INFO: renamed from: c */
    public String m35903c() {
        return this.f32502a;
    }

    /* JADX INFO: renamed from: d */
    public C8454b m35904d() {
        return this.f32504c;
    }

    /* JADX INFO: renamed from: e */
    public C8466n m35905e() {
        return this.f32505d;
    }

    /* JADX INFO: renamed from: f */
    public boolean m35906f() {
        return this.f32506e;
    }
}
