package p260l1;

import p115f1.AbstractC5234a;
import p140g0.C5931r1;
import p183i1.AbstractC6601a;
import p282m1.AbstractC8336a;
import p296n0.EnumC8723a4;
import p296n0.InterfaceC8721a2;
import p533x2.InterfaceC12638h;

/* JADX INFO: renamed from: l1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C7960c implements InterfaceC12638h<AbstractC8336a> {

    /* JADX INFO: renamed from: a */
    public final String f29840a;

    /* JADX INFO: renamed from: b */
    public final EnumC8723a4 f29841b;

    /* JADX INFO: renamed from: c */
    public final int f29842c;

    /* JADX INFO: renamed from: d */
    public final AbstractC5234a f29843d;

    /* JADX INFO: renamed from: e */
    public final AbstractC6601a f29844e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC8721a2.a f29845f;

    public C7960c(String str, int i10, EnumC8723a4 enumC8723a4, AbstractC5234a abstractC5234a, AbstractC6601a abstractC6601a, InterfaceC8721a2.a aVar) {
        this.f29840a = str;
        this.f29842c = i10;
        this.f29841b = enumC8723a4;
        this.f29843d = abstractC5234a;
        this.f29844e = abstractC6601a;
        this.f29845f = aVar;
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // p533x2.InterfaceC12638h
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC8336a get() {
        C5931r1.m26561a("AudioEncAdPrflRslvr", "Using resolved AUDIO bitrate from AudioProfile");
        return AbstractC8336a.m33888d().mo33904h(this.f29840a).mo33905i(this.f29842c).mo33903g(this.f29841b).mo33901e(this.f29844e.mo28513f()).mo33900d(this.f29844e.mo28512e()).mo33902f(this.f29844e.mo28514g()).mo33899c(C7959b.m32967h(this.f29845f.mo34980b(), this.f29844e.mo28513f(), this.f29845f.mo34981c(), this.f29844e.mo28514g(), this.f29845f.mo34985g(), this.f29843d.mo24219b())).m33898b();
    }
}
