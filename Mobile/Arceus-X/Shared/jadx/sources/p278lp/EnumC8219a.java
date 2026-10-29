package p278lp;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p394qt.C10708b;
import p394qt.InterfaceC10707a;

/* JADX INFO: renamed from: lp.a */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\bj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m31665d2 = {"Llp/a;", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "d", "e", "jp-my-number_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public enum EnumC8219a {
    Sha256("sha256"),
    Sha384("sha384"),
    Sha512("sha512");


    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String rawValue;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ InterfaceC10707a f30478g = C10708b.m40805a(m33552a());

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: lp.a$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"Llp/a$a;", "", "<init>", "()V", "", "rawValue", "Llp/a;", "a", "(Ljava/lang/String;)Llp/a;", "jp-my-number_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: lp.a.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public final EnumC8219a m33555a(@Nullable String rawValue) {
            EnumC8219a next;
            Iterator<EnumC8219a> it = EnumC8219a.m33553b().iterator();
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

    EnumC8219a(String str) {
        this.rawValue = str;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static InterfaceC10707a<EnumC8219a> m33553b() {
        return f30478g;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getRawValue() {
        return this.rawValue;
    }
}
