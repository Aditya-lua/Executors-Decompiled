package jg;

import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.internal.NumberLimits;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.math.BigDecimal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public abstract class y implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f21451a = new a("DOUBLE", 0);
    public static final y b = new y("LAZILY_PARSED_NUMBER", 1) { // from class: jg.y.b
        {
            a aVar = null;
        }

        @Override // jg.z
        public Number a(JsonReader jsonReader) {
            return new LazilyParsedNumber(jsonReader.nextString());
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y f21452c = new y("LONG_OR_DOUBLE", 2) { // from class: jg.y.c
        {
            a aVar = null;
        }

        @Override // jg.z
        public Number a(JsonReader jsonReader) throws IOException {
            String strNextString = jsonReader.nextString();
            if (strNextString.indexOf(46) >= 0) {
                return c(strNextString, jsonReader);
            }
            try {
                return Long.valueOf(Long.parseLong(strNextString));
            } catch (NumberFormatException unused) {
                return c(strNextString, jsonReader);
            }
        }

        public final Number c(String str, JsonReader jsonReader) throws MalformedJsonException {
            try {
                Double dValueOf = Double.valueOf(str);
                if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                    if (!jsonReader.isLenient()) {
                        throw new MalformedJsonException("JSON forbids NaN and infinities: " + dValueOf + "; at path " + jsonReader.getPreviousPath());
                    }
                }
                return dValueOf;
            } catch (NumberFormatException e10) {
                throw new p("Cannot parse " + str + "; at path " + jsonReader.getPreviousPath(), e10);
            }
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final y f21453d = new y("BIG_DECIMAL", 3) { // from class: jg.y.d
        {
            a aVar = null;
        }

        @Override // jg.z
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public BigDecimal a(JsonReader jsonReader) throws IOException {
            String strNextString = jsonReader.nextString();
            try {
                return NumberLimits.parseBigDecimal(strNextString);
            } catch (NumberFormatException e10) {
                throw new p("Cannot parse " + strNextString + "; at path " + jsonReader.getPreviousPath(), e10);
            }
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ y[] f21454e = b();

    public final enum a extends y {
        public a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // jg.z
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Double a(JsonReader jsonReader) {
            return Double.valueOf(jsonReader.nextDouble());
        }
    }

    public y(String str, int i10) {
        super(str, i10);
    }

    public static /* synthetic */ y[] b() {
        return new y[]{f21451a, b, f21452c, f21453d};
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) f21454e.clone();
    }

    public /* synthetic */ y(String str, int i10, a aVar) {
        this(str, i10);
    }
}
