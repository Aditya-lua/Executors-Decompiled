package p515we;

import af.C0218f0;
import af.EnumC0238p0;
import com.google.crypto.tink.shaded.protobuf.AbstractC2920h;
import java.security.GeneralSecurityException;
import p102ef.C5109a;

/* JADX INFO: renamed from: we.l0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C12380l0 implements InterfaceC12388p0 {

    /* JADX INFO: renamed from: a */
    public final String f44305a;

    /* JADX INFO: renamed from: b */
    public final C5109a f44306b;

    /* JADX INFO: renamed from: c */
    public final AbstractC2920h f44307c;

    /* JADX INFO: renamed from: d */
    public final C0218f0.c f44308d;

    /* JADX INFO: renamed from: e */
    public final EnumC0238p0 f44309e;

    /* JADX INFO: renamed from: f */
    public final Integer f44310f;

    public C12380l0(String str, C5109a c5109a, AbstractC2920h abstractC2920h, C0218f0.c cVar, EnumC0238p0 enumC0238p0, Integer num) {
        this.f44305a = str;
        this.f44306b = c5109a;
        this.f44307c = abstractC2920h;
        this.f44308d = cVar;
        this.f44309e = enumC0238p0;
        this.f44310f = num;
    }

    /* JADX INFO: renamed from: b */
    public static C12380l0 m46391b(String str, AbstractC2920h abstractC2920h, C0218f0.c cVar, EnumC0238p0 enumC0238p0, Integer num) throws GeneralSecurityException {
        if (enumC0238p0 == EnumC0238p0.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new C12380l0(str, C12394s0.m46449b(str), abstractC2920h, cVar, enumC0238p0, num);
    }

    @Override // p515we.InterfaceC12388p0
    /* JADX INFO: renamed from: a */
    public C5109a mo46392a() {
        return this.f44306b;
    }

    /* JADX INFO: renamed from: c */
    public Integer m46393c() {
        return this.f44310f;
    }

    /* JADX INFO: renamed from: d */
    public C0218f0.c m46394d() {
        return this.f44308d;
    }

    /* JADX INFO: renamed from: e */
    public EnumC0238p0 m46395e() {
        return this.f44309e;
    }

    /* JADX INFO: renamed from: f */
    public String m46396f() {
        return this.f44305a;
    }

    /* JADX INFO: renamed from: g */
    public AbstractC2920h m46397g() {
        return this.f44307c;
    }
}
