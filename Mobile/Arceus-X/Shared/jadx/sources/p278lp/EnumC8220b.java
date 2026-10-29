package p278lp;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p394qt.C10708b;
import p394qt.InterfaceC10707a;

/* JADX INFO: renamed from: lp.b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fj\u0002\b\u000ej\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, m31665d2 = {"Llp/b;", "", "", "rawValue", "", "requiredPasswordCount", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "I", "d", "()I", "e", "f", "g", "h", "i", "j", "k", "jp-my-number_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public enum EnumC8220b {
    MnSignForAuth("mn_sign_for_auth", 1),
    MnSign("mn_sign", 1),
    MnReadWithVerNumberB("mn_read_with_ver_number_b", 1),
    MnRead("mn_read", 1),
    DlRead("dl_read", 2),
    MnDlRead("mn_dl_read", 1),
    MnDlCombinedRead("mn_dl_combined_read", 2),
    ResRead("res_read", 1);


    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String rawValue;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int requiredPasswordCount;

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ InterfaceC10707a f30490m = C10708b.m40805a(m33556a());

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: lp.b$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"Llp/b$a;", "", "<init>", "()V", "", "rawValue", "Llp/b;", "a", "(Ljava/lang/String;)Llp/b;", "jp-my-number_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: lp.b.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public final EnumC8220b m33560a(@Nullable String rawValue) {
            EnumC8220b next;
            Iterator<EnumC8220b> it = EnumC8220b.m33557b().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (Intrinsics.m31980c(next.getRawValue(), rawValue)) {
                    return next;
                }
            }
            next = null;
            return next;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    EnumC8220b(String str, int i10) {
        this.rawValue = str;
        this.requiredPasswordCount = i10;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static InterfaceC10707a<EnumC8220b> m33557b() {
        return f30490m;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getRawValue() {
        return this.rawValue;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getRequiredPasswordCount() {
        return this.requiredPasswordCount;
    }
}
