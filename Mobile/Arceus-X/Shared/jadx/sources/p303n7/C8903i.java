package p303n7;

import p288m7.C8456d;
import p288m7.C8460h;

/* JADX INFO: renamed from: n7.i */
/* JADX INFO: loaded from: classes3.dex */
public class C8903i {

    /* JADX INFO: renamed from: a */
    public final a f32464a;

    /* JADX INFO: renamed from: b */
    public final C8460h f32465b;

    /* JADX INFO: renamed from: c */
    public final C8456d f32466c;

    /* JADX INFO: renamed from: d */
    public final boolean f32467d;

    /* JADX INFO: renamed from: n7.i$a */
    public enum a {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public C8903i(a aVar, C8460h c8460h, C8456d c8456d, boolean z10) {
        this.f32464a = aVar;
        this.f32465b = c8460h;
        this.f32466c = c8456d;
        this.f32467d = z10;
    }

    /* JADX INFO: renamed from: a */
    public a m35874a() {
        return this.f32464a;
    }

    /* JADX INFO: renamed from: b */
    public C8460h m35875b() {
        return this.f32465b;
    }

    /* JADX INFO: renamed from: c */
    public C8456d m35876c() {
        return this.f32466c;
    }

    /* JADX INFO: renamed from: d */
    public boolean m35877d() {
        return this.f32467d;
    }
}
