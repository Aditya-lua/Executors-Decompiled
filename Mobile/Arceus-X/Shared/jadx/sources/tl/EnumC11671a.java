package tl;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import p394qt.C10708b;
import p394qt.InterfaceC10707a;

/* JADX INFO: renamed from: tl.a */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m31665d2 = {"Ltl/a;", "", "", "wireCode", "<init>", "(Ljava/lang/String;II)V", "a", "I", "b", "()I", "c", "d", "universalapp_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public enum EnumC11671a {
    Rewarded(0),
    Interstitial(1);


    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int wireCode;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ InterfaceC10707a f41270f = C10708b.m40805a(m43826a());

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: tl.a$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"Ltl/a$a;", "", "<init>", "()V", "", "wireCode", "Ltl/a;", "a", "(I)Ltl/a;", "universalapp_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: tl.a.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final EnumC11671a m43828a(int wireCode) {
            EnumC11671a enumC11671a = EnumC11671a.Rewarded;
            if (wireCode != enumC11671a.getWireCode()) {
                EnumC11671a enumC11671a2 = EnumC11671a.Interstitial;
                if (wireCode == enumC11671a2.getWireCode()) {
                    return enumC11671a2;
                }
            }
            return enumC11671a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    EnumC11671a(int i10) {
        this.wireCode = i10;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getWireCode() {
        return this.wireCode;
    }
}
