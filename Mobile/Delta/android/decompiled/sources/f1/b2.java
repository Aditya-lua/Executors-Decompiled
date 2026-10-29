package f1;

/* JADX INFO: loaded from: classes.dex */
public abstract class b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f15810a;
    public final f1 b;

    public static final class a extends b2 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final v f15811c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f15812d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Throwable f15813e;

        public a(u uVar, f1 f1Var, v vVar, int i10, Throwable th2) {
            super(uVar, f1Var);
            this.f15811c = vVar;
            this.f15812d = i10;
            this.f15813e = th2;
        }

        public static String h(int i10) {
            switch (i10) {
                case 0:
                    return "ERROR_NONE";
                case 1:
                    return "ERROR_UNKNOWN";
                case 2:
                    return "ERROR_FILE_SIZE_LIMIT_REACHED";
                case 3:
                    return "ERROR_INSUFFICIENT_STORAGE";
                case 4:
                    return "ERROR_SOURCE_INACTIVE";
                case 5:
                    return "ERROR_INVALID_OUTPUT_OPTIONS";
                case 6:
                    return "ERROR_ENCODING_FAILED";
                case 7:
                    return "ERROR_RECORDER_ERROR";
                case 8:
                    return "ERROR_NO_VALID_DATA";
                case 9:
                    return "ERROR_DURATION_LIMIT_REACHED";
                case 10:
                    return "ERROR_RECORDING_GARBAGE_COLLECTED";
                default:
                    return "Unknown(" + i10 + ")";
            }
        }

        public Throwable i() {
            return this.f15813e;
        }

        public int j() {
            return this.f15812d;
        }

        public boolean k() {
            return this.f15812d != 0;
        }
    }

    public static final class b extends b2 {
        public b(u uVar, f1 f1Var) {
            super(uVar, f1Var);
        }
    }

    public static final class c extends b2 {
        public c(u uVar, f1 f1Var) {
            super(uVar, f1Var);
        }
    }

    public static final class d extends b2 {
        public d(u uVar, f1 f1Var) {
            super(uVar, f1Var);
        }
    }

    public static final class e extends b2 {
        public e(u uVar, f1 f1Var) {
            super(uVar, f1Var);
        }
    }

    public b2(u uVar, f1 f1Var) {
        this.f15810a = (u) x2.g.g(uVar);
        this.b = (f1) x2.g.g(f1Var);
    }

    public static a a(u uVar, f1 f1Var, v vVar) {
        return new a(uVar, f1Var, vVar, 0, null);
    }

    public static a b(u uVar, f1 f1Var, v vVar, int i10, Throwable th2) {
        x2.g.b(i10 != 0, "An error type is required.");
        return new a(uVar, f1Var, vVar, i10, th2);
    }

    public static b d(u uVar, f1 f1Var) {
        return new b(uVar, f1Var);
    }

    public static c e(u uVar, f1 f1Var) {
        return new c(uVar, f1Var);
    }

    public static d f(u uVar, f1 f1Var) {
        return new d(uVar, f1Var);
    }

    public static e g(u uVar, f1 f1Var) {
        return new e(uVar, f1Var);
    }

    public u c() {
        return this.f15810a;
    }
}
