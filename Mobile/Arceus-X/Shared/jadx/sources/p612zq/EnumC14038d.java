package p612zq;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import p394qt.C10708b;
import p394qt.InterfaceC10707a;

/* JADX INFO: renamed from: zq.d */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001b\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u000b\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, m31665d2 = {"Lzq/d;", "", "", "key", "message", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "d", "e", "f", "g", "sna_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public enum EnumC14038d {
    IntegrationError("integration_error", "Silent Network Authentication implementation is not available. Please ensure sna-impl module is included."),
    InvalidCheckUrlError("invalid_check_url", "Silent Network Authentication check_url is missing or invalid."),
    ParsingError("parsing_error", null, 2, null),
    UnknownError("unknown_error", null, 2, null),
    TimeoutError("timeout_error", null, 2, null);


    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ InterfaceC10707a f49067i = C10708b.m40805a(m50721a());

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String key;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String message;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    EnumC14038d(String str, String str2) {
        this.key = str;
        this.message = str2;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
      (r1v0 java.lang.String)
      (r2v0 int)
      (r3v0 java.lang.String)
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
     A[MD:(java.lang.String, int, java.lang.String, java.lang.String):void (m)] (LINE:2) call: zq.d.<init>(java.lang.String, int, java.lang.String, java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* synthetic */ EnumC14038d(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? "" : str2);
    }
}
