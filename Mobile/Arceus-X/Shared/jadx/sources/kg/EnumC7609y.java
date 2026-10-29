package kg;

import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.internal.NumberLimits;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.math.BigDecimal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: kg.y */
/* JADX INFO: loaded from: classes2.dex */
public abstract class EnumC7609y implements InterfaceC7610z {

    /* JADX INFO: renamed from: a */
    public static final EnumC7609y f29127a = new a("DOUBLE", 0);

    /* JADX INFO: renamed from: b */
    public static final EnumC7609y f29128b = new EnumC7609y("LAZILY_PARSED_NUMBER", 1) { // from class: kg.y.b
        {
            a aVar = null;
        }

        @Override // kg.InterfaceC7610z
        /* JADX INFO: renamed from: a */
        public Number mo31493a(JsonReader jsonReader) {
            return new LazilyParsedNumber(jsonReader.nextString());
        }
    };

    /* JADX INFO: renamed from: c */
    public static final EnumC7609y f29129c = new EnumC7609y("LONG_OR_DOUBLE", 2) { // from class: kg.y.c
        {
            a aVar = null;
        }

        @Override // kg.InterfaceC7610z
        /* JADX INFO: renamed from: a */
        public Number mo31493a(JsonReader jsonReader) throws IOException {
            String strNextString = jsonReader.nextString();
            if (strNextString.indexOf(46) >= 0) {
                return m31495c(strNextString, jsonReader);
            }
            try {
                return Long.valueOf(Long.parseLong(strNextString));
            } catch (NumberFormatException unused) {
                return m31495c(strNextString, jsonReader);
            }
        }

        /* JADX INFO: renamed from: c */
        public final Number m31495c(String str, JsonReader jsonReader) throws MalformedJsonException {
            try {
                Double dValueOf = Double.valueOf(str);
                if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                    if (!jsonReader.isLenient()) {
                        throw new MalformedJsonException("JSON forbids NaN and infinities: " + dValueOf + "; at path " + jsonReader.getPreviousPath());
                    }
                }
                return dValueOf;
            } catch (NumberFormatException e10) {
                throw new C7600p("Cannot parse " + str + "; at path " + jsonReader.getPreviousPath(), e10);
            }
        }
    };

    /* JADX INFO: renamed from: d */
    public static final EnumC7609y f29130d = new EnumC7609y("BIG_DECIMAL", 3) { // from class: kg.y.d
        {
            a aVar = null;
        }

        /* JADX DEBUG: Method merged with bridge method: a(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Number; */
        @Override // kg.InterfaceC7610z
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public BigDecimal mo31493a(JsonReader jsonReader) throws IOException {
            String strNextString = jsonReader.nextString();
            try {
                return NumberLimits.parseBigDecimal(strNextString);
            } catch (NumberFormatException e10) {
                throw new C7600p("Cannot parse " + strNextString + "; at path " + jsonReader.getPreviousPath(), e10);
            }
        }
    };

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ EnumC7609y[] f29131e = m31492b();

    /* JADX INFO: renamed from: kg.y$a */
    public final enum a extends EnumC7609y {
        public a(String str, int i10) {
            super(str, i10, null);
        }

        /* JADX DEBUG: Method merged with bridge method: a(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Number; */
        @Override // kg.InterfaceC7610z
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Double mo31493a(JsonReader jsonReader) {
            return Double.valueOf(jsonReader.nextDouble());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public EnumC7609y(String str, int i10) {
        super(str, i10);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ EnumC7609y[] m31492b() {
        return new EnumC7609y[]{f29127a, f29128b, f29129c, f29130d};
    }

    public static EnumC7609y valueOf(String str) {
        return (EnumC7609y) Enum.valueOf(EnumC7609y.class, str);
    }

    public static EnumC7609y[] values() {
        return (EnumC7609y[]) f29131e.clone();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 int) A[MD:(java.lang.String, int):void (m)] (LINE:2) call: kg.y.<init>(java.lang.String, int):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ EnumC7609y(String str, int i10, a aVar) {
        this(str, i10);
    }
}
