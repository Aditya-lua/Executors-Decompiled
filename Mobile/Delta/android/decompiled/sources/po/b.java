package po;

import io.j2;
import java.util.Map;
import jt.l;
import jt.s;
import kotlin.Metadata;
import kotlin.collections.k0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 po.b, still in use, count: 1, list:
  (r0v0 po.b) from 0x0144: INVOKE ("dl"), (r0v0 po.b) STATIC call: jt.s.a(java.lang.Object, java.lang.Object):kotlin.Pair A[MD:<A, B>:(A, B):kotlin.Pair<A, B> (m), WRAPPED]
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\u0005j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b ¨\u0006!"}, d2 = {"Lpo/b;", "", "<init>", "(Ljava/lang/String;I)V", "Lio/j2;", "c", "()Lio/j2;", "a", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b {
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

    public static final /* synthetic */ qt.a D = qt.b.a(a());

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Map<String, b> b = k0.m(s.a("dl", new b()), s.a("id", new b()), s.a("keyp", new b()), s.a("mid", new b()), s.a("myn", new b()), s.a("nric", new b()), s.a("ofw", new b()), s.a("pp", new b()), s.a("pr", new b()), s.a("rp", new b()), s.a("sp", new b()), s.a("sss", new b()), s.a("umid", new b()), s.a("vid", new b()), s.a("ppc", new b()), s.a("pid", new b()), s.a("visa", new b()), s.a("wp", new b()), s.a("cct", new b()), s.a("cid", new b()), s.a("foid", new b()), s.a("hic", new b()), s.a("ltpass", new b()), s.a("nbi", new b()), s.a("pan", new b()));

    /* JADX INFO: renamed from: po.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lpo/b$a;", "", "<init>", "()V", "", "abbr", "Lpo/b;", "a", "(Ljava/lang/String;)Lpo/b;", "KeyAutoClassification", "Ljava/lang/String;", "", "codes", "Ljava/util/Map;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final b a(@NotNull String abbr) {
            Intrinsics.checkNotNullParameter(abbr, "abbr");
            b bVar = (b) b.b.get(abbr);
            return bVar == null ? b.Unknown : bVar;
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: po.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C0500b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28765a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.DriverLicense.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.StateID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.Keypass.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.MilitaryID.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[b.MyNumberCard.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[b.NRIC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[b.OFWID.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[b.Passport.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[b.PermanentResidentCard.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[b.ResidencyPermit.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[b.StudentPermit.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[b.SocialSecurityID.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[b.UMID.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[b.VoterID.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[b.PassportCard.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[b.PostalID.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[b.Visa.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[b.WorkPermit.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[b.CitizenshipCertificate.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[b.ConsularID.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[b.ForeignerID.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[b.HealthInsuranceCard.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[b.LongTermPass.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[b.NBICertificate.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[b.PermanentAccountNumber.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[b.Unknown.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            f28765a = iArr;
        }
    }

    static {
    }

    public b() {
        super(str, i);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) C.clone();
    }

    @NotNull
    public final j2 c() {
        switch (C0500b.f28765a[ordinal()]) {
            case 1:
                return j2.Card;
            case 2:
                return j2.Flag;
            case 3:
                return j2.Card;
            case 4:
                return j2.Card;
            case 5:
                return j2.Card;
            case 6:
                return j2.Card;
            case 7:
                return j2.Card;
            case 8:
                return j2.World;
            case 9:
                return j2.House;
            case 10:
                return j2.House;
            case 11:
                return j2.Card;
            case 12:
                return j2.Card;
            case 13:
                return j2.Card;
            case 14:
                return j2.Card;
            case 15:
                return j2.World;
            case 16:
                return j2.Card;
            case 17:
                return j2.World;
            case 18:
                return j2.Card;
            case 19:
                return j2.Card;
            case 20:
                return j2.Card;
            case 21:
                return j2.Card;
            case 22:
                return j2.Card;
            case 23:
                return j2.Card;
            case 24:
                return j2.Card;
            case 25:
                return j2.Card;
            case 26:
                throw new RuntimeException("IdClass is 'UNKNOWN'.");
            default:
                throw new l();
        }
    }
}
