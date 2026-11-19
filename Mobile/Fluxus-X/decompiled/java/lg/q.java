package lg;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import ng.h0;

/* JADX INFO: loaded from: classes2.dex */
public final class q {
    public static l a(Reader reader) {
        try {
            tg.a aVar = new tg.a(reader);
            l lVarB = b(aVar);
            if (!lVarB.n() && aVar.Q() != tg.b.END_DOCUMENT) {
                throw new u("Did not consume the entire document.");
            }
            return lVarB;
        } catch (IOException e10) {
            throw new m(e10);
        } catch (NumberFormatException | tg.d e11) {
            throw new u(e11);
        }
    }

    public static l b(tg.a aVar) {
        x xVarO = aVar.o();
        if (xVarO == x.LEGACY_STRICT) {
            aVar.e0(x.LENIENT);
        }
        try {
            try {
                l lVarA = h0.a(aVar);
                aVar.e0(xVarO);
                return lVarA;
            } catch (Throwable th2) {
                aVar.e0(xVarO);
                throw th2;
            }
        } catch (OutOfMemoryError | StackOverflowError e10) {
            throw new p("Failed parsing JSON source: " + aVar + " to Json", e10);
        }
    }

    public static l c(String str) {
        return a(new StringReader(str));
    }
}
