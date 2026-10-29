package p260l1;

import android.util.Range;
import p115f1.AbstractC5234a;
import p140g0.C5931r1;
import p183i1.AbstractC6601a;
import p282m1.AbstractC8336a;
import p296n0.EnumC8723a4;
import p533x2.InterfaceC12638h;

/* JADX INFO: renamed from: l1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C7961d implements InterfaceC12638h<AbstractC8336a> {

    /* JADX INFO: renamed from: a */
    public final String f29846a;

    /* JADX INFO: renamed from: b */
    public final int f29847b;

    /* JADX INFO: renamed from: c */
    public final AbstractC5234a f29848c;

    /* JADX INFO: renamed from: d */
    public final AbstractC6601a f29849d;

    /* JADX INFO: renamed from: e */
    public final EnumC8723a4 f29850e;

    public C7961d(String str, int i10, EnumC8723a4 enumC8723a4, AbstractC5234a abstractC5234a, AbstractC6601a abstractC6601a) {
        this.f29846a = str;
        this.f29847b = i10;
        this.f29850e = enumC8723a4;
        this.f29848c = abstractC5234a;
        this.f29849d = abstractC6601a;
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // p533x2.InterfaceC12638h
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC8336a get() {
        Range<Integer> rangeMo24219b = this.f29848c.mo24219b();
        C5931r1.m26561a("AudioEncCfgDefaultRslvr", "Using fallback AUDIO bitrate");
        return AbstractC8336a.m33888d().mo33904h(this.f29846a).mo33905i(this.f29847b).mo33903g(this.f29850e).mo33901e(this.f29849d.mo28513f()).mo33900d(this.f29849d.mo28512e()).mo33902f(this.f29849d.mo28514g()).mo33899c(C7959b.m32967h(156000, this.f29849d.mo28513f(), 2, this.f29849d.mo28514g(), 48000, rangeMo24219b)).m33898b();
    }
}
