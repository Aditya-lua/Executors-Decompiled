package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p394qt.C10708b;
import p394qt.InterfaceC10707a;

/* JADX INFO: renamed from: kotlin.text.m */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u001b\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, m31665d2 = {"Lkotlin/text/m;", "Lkotlin/text/d;", "", "", "value", "mask", "<init>", "(Ljava/lang/String;III)V", "a", "I", "getValue", "()I", "b", "getMask", "c", "d", "e", "f", "g", "h", "i", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public enum EnumC7786m implements InterfaceC7777d {
    IGNORE_CASE(2, 0, 2, null),
    MULTILINE(8, 0, 2, null),
    LITERAL(16, 0, 2, null),
    UNIX_LINES(1, 0, 2, null),
    COMMENTS(4, 0, 2, null),
    DOT_MATCHES_ALL(32, 0, 2, null),
    CANON_EQ(128, 0, 2, null);


    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ InterfaceC10707a f29575k = C10708b.m40805a(m32271a());

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int value;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int mask;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    EnumC7786m(int i10, int i11) {
        this.value = i10;
        this.mask = i11;
    }

    @Override // kotlin.text.InterfaceC7777d
    public int getValue() {
        return this.value;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
      (r1v0 java.lang.String)
      (r2v0 int)
      (r3v0 int)
      (wrap int:?: TERNARY null = ((wrap int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (r3v0 int) : (r4v0 int))
     A[MD:(java.lang.String, int, int, int):void (m)] (LINE:2) call: kotlin.text.m.<init>(java.lang.String, int, int, int):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* synthetic */ EnumC7786m(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i12 & 2) != 0 ? i10 : i11);
    }
}
