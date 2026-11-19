package lg;

import java.io.IOException;
import java.math.BigDecimal;
import ng.c0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public abstract class y implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f22152a = new a("DOUBLE", 0);
    public static final y b = new y("LAZILY_PARSED_NUMBER", 1) { // from class: lg.y.b
        {
            a aVar = null;
        }

        @Override // lg.z
        public Number a(tg.a aVar) {
            return new ng.a0(aVar.N());
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y f22153c = new y("LONG_OR_DOUBLE", 2) { // from class: lg.y.c
        {
            a aVar = null;
        }

        @Override // lg.z
        public Number a(tg.a aVar) throws IOException {
            String strN = aVar.N();
            if (strN.indexOf(46) >= 0) {
                return c(strN, aVar);
            }
            try {
                return Long.valueOf(Long.parseLong(strN));
            } catch (NumberFormatException unused) {
                return c(strN, aVar);
            }
        }

        public final Number c(String str, tg.a aVar) throws tg.d {
            try {
                Double dValueOf = Double.valueOf(str);
                if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                    if (!aVar.r()) {
                        throw new tg.d("JSON forbids NaN and infinities: " + dValueOf + "; at path " + aVar.n());
                    }
                }
                return dValueOf;
            } catch (NumberFormatException e10) {
                throw new p("Cannot parse " + str + "; at path " + aVar.n(), e10);
            }
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final y f22154d = new y("BIG_DECIMAL", 3) { // from class: lg.y.d
        {
            a aVar = null;
        }

        @Override // lg.z
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public BigDecimal a(tg.a aVar) throws IOException {
            String strN = aVar.N();
            try {
                return c0.b(strN);
            } catch (NumberFormatException e10) {
                throw new p("Cannot parse " + strN + "; at path " + aVar.n(), e10);
            }
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ y[] f22155e = b();

    public final enum a extends y {
        public a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // lg.z
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Double a(tg.a aVar) {
            return Double.valueOf(aVar.y());
        }
    }

    public y(String str, int i10) {
        super(str, i10);
    }

    public static /* synthetic */ y[] b() {
        return new y[]{f22152a, b, f22153c, f22154d};
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) f22155e.clone();
    }

    public /* synthetic */ y(String str, int i10, a aVar) {
        this(str, i10);
    }
}
