package p115f1;

import p533x2.C12637g;

/* JADX INFO: renamed from: f1.b2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5241b2 {

    /* JADX INFO: renamed from: a */
    public final AbstractC5297u f20301a;

    /* JADX INFO: renamed from: b */
    public final AbstractC5254f1 f20302b;

    /* JADX INFO: renamed from: f1.b2$a */
    public static final class a extends AbstractC5241b2 {

        /* JADX INFO: renamed from: c */
        public final AbstractC5300v f20303c;

        /* JADX INFO: renamed from: d */
        public final int f20304d;

        /* JADX INFO: renamed from: e */
        public final Throwable f20305e;

        public a(AbstractC5297u abstractC5297u, AbstractC5254f1 abstractC5254f1, AbstractC5300v abstractC5300v, int i10, Throwable th2) {
            super(abstractC5297u, abstractC5254f1);
            this.f20303c = abstractC5300v;
            this.f20304d = i10;
            this.f20305e = th2;
        }

        /* JADX INFO: renamed from: h */
        public static String m24257h(int i10) {
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

        /* JADX INFO: renamed from: i */
        public Throwable m24258i() {
            return this.f20305e;
        }

        /* JADX INFO: renamed from: j */
        public int m24259j() {
            return this.f20304d;
        }

        /* JADX INFO: renamed from: k */
        public boolean m24260k() {
            return this.f20304d != 0;
        }
    }

    /* JADX INFO: renamed from: f1.b2$b */
    public static final class b extends AbstractC5241b2 {
        public b(AbstractC5297u abstractC5297u, AbstractC5254f1 abstractC5254f1) {
            super(abstractC5297u, abstractC5254f1);
        }
    }

    /* JADX INFO: renamed from: f1.b2$c */
    public static final class c extends AbstractC5241b2 {
        public c(AbstractC5297u abstractC5297u, AbstractC5254f1 abstractC5254f1) {
            super(abstractC5297u, abstractC5254f1);
        }
    }

    /* JADX INFO: renamed from: f1.b2$d */
    public static final class d extends AbstractC5241b2 {
        public d(AbstractC5297u abstractC5297u, AbstractC5254f1 abstractC5254f1) {
            super(abstractC5297u, abstractC5254f1);
        }
    }

    /* JADX INFO: renamed from: f1.b2$e */
    public static final class e extends AbstractC5241b2 {
        public e(AbstractC5297u abstractC5297u, AbstractC5254f1 abstractC5254f1) {
            super(abstractC5297u, abstractC5254f1);
        }
    }

    public AbstractC5241b2(AbstractC5297u abstractC5297u, AbstractC5254f1 abstractC5254f1) {
        this.f20301a = (AbstractC5297u) C12637g.m47075g(abstractC5297u);
        this.f20302b = (AbstractC5254f1) C12637g.m47075g(abstractC5254f1);
    }

    /* JADX INFO: renamed from: a */
    public static a m24250a(AbstractC5297u abstractC5297u, AbstractC5254f1 abstractC5254f1, AbstractC5300v abstractC5300v) {
        return new a(abstractC5297u, abstractC5254f1, abstractC5300v, 0, null);
    }

    /* JADX INFO: renamed from: b */
    public static a m24251b(AbstractC5297u abstractC5297u, AbstractC5254f1 abstractC5254f1, AbstractC5300v abstractC5300v, int i10, Throwable th2) {
        C12637g.m47070b(i10 != 0, "An error type is required.");
        return new a(abstractC5297u, abstractC5254f1, abstractC5300v, i10, th2);
    }

    /* JADX INFO: renamed from: d */
    public static b m24252d(AbstractC5297u abstractC5297u, AbstractC5254f1 abstractC5254f1) {
        return new b(abstractC5297u, abstractC5254f1);
    }

    /* JADX INFO: renamed from: e */
    public static c m24253e(AbstractC5297u abstractC5297u, AbstractC5254f1 abstractC5254f1) {
        return new c(abstractC5297u, abstractC5254f1);
    }

    /* JADX INFO: renamed from: f */
    public static d m24254f(AbstractC5297u abstractC5297u, AbstractC5254f1 abstractC5254f1) {
        return new d(abstractC5297u, abstractC5254f1);
    }

    /* JADX INFO: renamed from: g */
    public static e m24255g(AbstractC5297u abstractC5297u, AbstractC5254f1 abstractC5254f1) {
        return new e(abstractC5297u, abstractC5254f1);
    }

    /* JADX INFO: renamed from: c */
    public AbstractC5297u m24256c() {
        return this.f20301a;
    }
}
