package p102ef;

import p076df.C4599u;
import pe.C10218d0;

/* JADX INFO: renamed from: ef.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C5111c {

    /* JADX INFO: renamed from: a */
    public final C5109a f19930a;

    public C5111c(C5109a c5109a) {
        this.f19930a = c5109a;
    }

    /* JADX INFO: renamed from: a */
    public static C5111c m23853a(byte[] bArr, C10218d0 c10218d0) {
        if (c10218d0 != null) {
            return new C5111c(C5109a.m23847a(bArr));
        }
        throw new NullPointerException("SecretKeyAccess required");
    }

    /* JADX INFO: renamed from: b */
    public static C5111c m23854b(int i10) {
        return new C5111c(C5109a.m23847a(C4599u.m22724a(i10)));
    }

    /* JADX INFO: renamed from: c */
    public int m23855c() {
        return this.f19930a.m23849c();
    }

    /* JADX INFO: renamed from: d */
    public byte[] m23856d(C10218d0 c10218d0) {
        if (c10218d0 != null) {
            return this.f19930a.m23850d();
        }
        throw new NullPointerException("SecretKeyAccess required");
    }
}
