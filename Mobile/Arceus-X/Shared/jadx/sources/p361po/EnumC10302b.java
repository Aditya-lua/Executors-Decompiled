package p361po;

import io.EnumC6879j2;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7690k0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p229jt.C7345l;
import p229jt.C7352s;
import p394qt.C10708b;
import p394qt.InterfaceC10707a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 po.b, still in use, count: 1, list:
  (r0v0 po.b) from 0x0144: INVOKE ("dl"), (r0v0 po.b) STATIC call: jt.s.a(java.lang.Object, java.lang.Object):kotlin.Pair A[MD:<A, B>:(A, B):kotlin.Pair<A, B> (m), WRAPPED]
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: po.b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\u0005j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b ¨\u0006!"}, m31665d2 = {"Lpo/b;", "", "<init>", "(Ljava/lang/String;I)V", "Lio/j2;", "c", "()Lio/j2;", "a", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class EnumC10302b {
    DriverLicense,
    StateID,
    Keypass,
    MilitaryID,
    MyNumberCard,
    NRIC,
    OFWID,
    Passport,
    PermanentResidentCard,
    ResidencyPermit,
    StudentPermit,
    SocialSecurityID,
    UMID,
    VoterID,
    PassportCard,
    PostalID,
    Visa,
    WorkPermit,
    CitizenshipCertificate,
    ConsularID,
    ForeignerID,
    HealthInsuranceCard,
    LongTermPass,
    NBICertificate,
    PermanentAccountNumber,
    Unknown;


    /* JADX INFO: renamed from: D */
    public static final /* synthetic */ InterfaceC10707a f37017D = C10708b.m40805a(m39577a());

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Map<String, EnumC10302b> f37019b = C7690k0.m31798m(C7352s.m30477a("dl", new EnumC10302b()), C7352s.m30477a("id", new EnumC10302b()), C7352s.m30477a("keyp", new EnumC10302b()), C7352s.m30477a("mid", new EnumC10302b()), C7352s.m30477a("myn", new EnumC10302b()), C7352s.m30477a("nric", new EnumC10302b()), C7352s.m30477a("ofw", new EnumC10302b()), C7352s.m30477a("pp", new EnumC10302b()), C7352s.m30477a("pr", new EnumC10302b()), C7352s.m30477a("rp", new EnumC10302b()), C7352s.m30477a("sp", new EnumC10302b()), C7352s.m30477a("sss", new EnumC10302b()), C7352s.m30477a("umid", new EnumC10302b()), C7352s.m30477a("vid", new EnumC10302b()), C7352s.m30477a("ppc", new EnumC10302b()), C7352s.m30477a("pid", new EnumC10302b()), C7352s.m30477a("visa", new EnumC10302b()), C7352s.m30477a("wp", new EnumC10302b()), C7352s.m30477a("cct", new EnumC10302b()), C7352s.m30477a("cid", new EnumC10302b()), C7352s.m30477a("foid", new EnumC10302b()), C7352s.m30477a("hic", new EnumC10302b()), C7352s.m30477a("ltpass", new EnumC10302b()), C7352s.m30477a("nbi", new EnumC10302b()), C7352s.m30477a("pan", new EnumC10302b()));

    /* JADX INFO: renamed from: po.b$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m31665d2 = {"Lpo/b$a;", "", "<init>", "()V", "", "abbr", "Lpo/b;", "a", "(Ljava/lang/String;)Lpo/b;", "KeyAutoClassification", "Ljava/lang/String;", "", "codes", "Ljava/util/Map;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: po.b.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final EnumC10302b m39580a(@NotNull String abbr) {
            Intrinsics.checkNotNullParameter(abbr, "abbr");
            EnumC10302b enumC10302b = (EnumC10302b) EnumC10302b.f37019b.get(abbr);
            return enumC10302b == null ? EnumC10302b.Unknown : enumC10302b;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX INFO: renamed from: po.b$b */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f37044a;

        static {
            int[] iArr = new int[EnumC10302b.values().length];
            try {
                iArr[EnumC10302b.DriverLicense.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC10302b.StateID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC10302b.Keypass.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC10302b.MilitaryID.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC10302b.MyNumberCard.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC10302b.NRIC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC10302b.OFWID.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC10302b.Passport.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EnumC10302b.PermanentResidentCard.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[EnumC10302b.ResidencyPermit.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[EnumC10302b.StudentPermit.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[EnumC10302b.SocialSecurityID.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[EnumC10302b.UMID.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[EnumC10302b.VoterID.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[EnumC10302b.PassportCard.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[EnumC10302b.PostalID.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[EnumC10302b.Visa.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[EnumC10302b.WorkPermit.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[EnumC10302b.CitizenshipCertificate.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[EnumC10302b.ConsularID.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[EnumC10302b.ForeignerID.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[EnumC10302b.HealthInsuranceCard.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[EnumC10302b.LongTermPass.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[EnumC10302b.NBICertificate.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[EnumC10302b.PermanentAccountNumber.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[EnumC10302b.Unknown.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            f37044a = iArr;
        }
    }

    static {
    }

    public EnumC10302b() {
        super(str, i);
    }

    public static EnumC10302b valueOf(String str) {
        return (EnumC10302b) Enum.valueOf(EnumC10302b.class, str);
    }

    public static EnumC10302b[] values() {
        return (EnumC10302b[]) f37016C.clone();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final EnumC6879j2 m39579c() {
        switch (b.f37044a[ordinal()]) {
            case 1:
                return EnumC6879j2.Card;
            case 2:
                return EnumC6879j2.Flag;
            case 3:
                return EnumC6879j2.Card;
            case 4:
                return EnumC6879j2.Card;
            case 5:
                return EnumC6879j2.Card;
            case 6:
                return EnumC6879j2.Card;
            case 7:
                return EnumC6879j2.Card;
            case 8:
                return EnumC6879j2.World;
            case 9:
                return EnumC6879j2.House;
            case 10:
                return EnumC6879j2.House;
            case 11:
                return EnumC6879j2.Card;
            case 12:
                return EnumC6879j2.Card;
            case 13:
                return EnumC6879j2.Card;
            case 14:
                return EnumC6879j2.Card;
            case 15:
                return EnumC6879j2.World;
            case 16:
                return EnumC6879j2.Card;
            case 17:
                return EnumC6879j2.World;
            case 18:
                return EnumC6879j2.Card;
            case 19:
                return EnumC6879j2.Card;
            case 20:
                return EnumC6879j2.Card;
            case 21:
                return EnumC6879j2.Card;
            case 22:
                return EnumC6879j2.Card;
            case 23:
                return EnumC6879j2.Card;
            case 24:
                return EnumC6879j2.Card;
            case 25:
                return EnumC6879j2.Card;
            case 26:
                throw new RuntimeException("IdClass is 'UNKNOWN'.");
            default:
                throw new C7345l();
        }
    }
}
