package p306nb;

import java.util.Objects;

/* JADX INFO: renamed from: nb.je */
/* JADX INFO: loaded from: classes.dex */
public final class C9149je {

    /* JADX INFO: renamed from: a */
    public final String f33089a;

    /* JADX INFO: renamed from: b */
    public long f33090b;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 nb.me), (r2v0 java.lang.String) A[MD:(nb.me, java.lang.String):void (m)] (LINE:1) call: nb.je.<init>(nb.me, java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C9149je(C9197me c9197me, String str, byte[] bArr) {
        this(c9197me, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C9149je(C9197me c9197me, String str) {
        Objects.requireNonNull(c9197me);
        this.f33089a = str;
        this.f33090b = c9197me.mo36325e().mo44176b();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
      (r1v0 nb.me)
      (wrap java.lang.String:0x0004: INVOKE (wrap nb.ve:0x0000: INVOKE (r1v0 nb.me) VIRTUAL call: nb.me.N0():nb.ve A[MD:():nb.ve (m), WRAPPED] (LINE:4)) VIRTUAL call: nb.ve.l0():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:4))
     A[MD:(nb.me, java.lang.String):void (m)] (LINE:4) call: nb.je.<init>(nb.me, java.lang.String):void type: THIS */
    public /* synthetic */ C9149je(C9197me c9197me, byte[] bArr) {
        this(c9197me, c9197me.m36521N0().m36965l0());
    }
}
