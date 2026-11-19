package backtraceio.library.common.serialization;

import java.io.IOException;
import lg.a0;
import tg.a;
import tg.b;
import tg.c;

/* JADX INFO: loaded from: classes.dex */
public class StackTraceElementTypeAdapter extends a0<StackTraceElement> {
    @Override // lg.a0
    public StackTraceElement read(a aVar) throws IOException {
        if (aVar.Q() == b.NULL) {
            aVar.K();
            return null;
        }
        aVar.c();
        int iZ = -1;
        String strN = null;
        String strN2 = null;
        String strN3 = null;
        while (aVar.p()) {
            String strE = aVar.E();
            strE.getClass();
            switch (strE) {
                case "file-name":
                    if (aVar.Q() != b.NULL) {
                        strN3 = aVar.N();
                        break;
                    } else {
                        aVar.K();
                        strN3 = null;
                        break;
                    }
                    break;
                case "line-number":
                    iZ = aVar.z();
                    break;
                case "method-name":
                    strN2 = aVar.N();
                    break;
                case "declaring-class":
                    strN = aVar.N();
                    break;
                default:
                    aVar.n0();
                    break;
            }
        }
        aVar.h();
        return new StackTraceElement(strN, strN2, strN3, iZ);
    }

    @Override // lg.a0
    public void write(c cVar, StackTraceElement stackTraceElement) throws IOException {
        if (stackTraceElement == null) {
            cVar.s();
            return;
        }
        cVar.e();
        cVar.p("declaring-class").Y(stackTraceElement.getClassName());
        cVar.p("method-name").Y(stackTraceElement.getMethodName());
        cVar.p("file-name").Y(stackTraceElement.getFileName());
        cVar.p("line-number").O(stackTraceElement.getLineNumber());
        cVar.h();
    }
}
