package mp;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p502w.C12268d;

/* JADX INFO: renamed from: mp.c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\t\u0010\u000f¨\u0006\u0010"}, m31665d2 = {"Lmp/c;", "Lmp/b;", "Lw/d;", "intent", "", "url", "packageName", "<init>", "(Lw/d;Ljava/lang/String;Ljava/lang/String;)V", "a", "Lw/d;", "b", "()Lw/d;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "launchers_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C8613c implements InterfaceC8611b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C12268d intent;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String url;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final String packageName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C8613c(@NotNull C12268d intent, @NotNull String url, @Nullable String str) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(url, "url");
        this.intent = intent;
        this.url = url;
        this.packageName = str;
    }

    @Override // mp.InterfaceC8611b
    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public String getPackageName() {
        return this.packageName;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final C12268d getIntent() {
        return this.intent;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
      (r1v0 w.d)
      (r2v0 java.lang.String)
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
     A[MD:(w.d, java.lang.String, java.lang.String):void (m)] (LINE:5) call: mp.c.<init>(w.d, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ C8613c(C12268d c12268d, String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(c12268d, str, (i10 & 4) != 0 ? null : str2);
    }
}
