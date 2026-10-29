package kg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: kg.v */
/* JADX INFO: loaded from: classes2.dex */
public abstract class EnumC7606v {

    /* JADX INFO: renamed from: a */
    public static final EnumC7606v f29115a = new a("DEFAULT", 0);

    /* JADX INFO: renamed from: b */
    public static final EnumC7606v f29116b = new EnumC7606v("STRING", 1) { // from class: kg.v.b
        {
            a aVar = null;
        }
    };

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumC7606v[] f29117c = m31488a();

    /* JADX INFO: renamed from: kg.v$a */
    public final enum a extends EnumC7606v {
        public a(String str, int i10) {
            super(str, i10, null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public EnumC7606v(String str, int i10) {
        super(str, i10);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ EnumC7606v[] m31488a() {
        return new EnumC7606v[]{f29115a, f29116b};
    }

    public static EnumC7606v valueOf(String str) {
        return (EnumC7606v) Enum.valueOf(EnumC7606v.class, str);
    }

    public static EnumC7606v[] values() {
        return (EnumC7606v[]) f29117c.clone();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 int) A[MD:(java.lang.String, int):void (m)] (LINE:2) call: kg.v.<init>(java.lang.String, int):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ EnumC7606v(String str, int i10, a aVar) {
        this(str, i10);
    }
}
