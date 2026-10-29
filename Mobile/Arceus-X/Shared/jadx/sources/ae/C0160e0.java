package ae;

import android.util.Log;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: ae.e0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0160e0 {
    /* JADX INFO: renamed from: a */
    public static final C0178n0 m516a(XmlPullParser xmlPullParser, C0174l0 c0174l0) {
        while (xmlPullParser.next() != 1) {
            try {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("splits")) {
                        while (xmlPullParser.next() != 3) {
                            if (xmlPullParser.getEventType() == 2) {
                                if (xmlPullParser.getName().equals("module")) {
                                    String strM517b = m517b("name", xmlPullParser, c0174l0);
                                    if (strM517b != null) {
                                        while (xmlPullParser.next() != 3) {
                                            if (xmlPullParser.getEventType() == 2) {
                                                if (xmlPullParser.getName().equals("language")) {
                                                    while (xmlPullParser.next() != 3) {
                                                        if (xmlPullParser.getEventType() == 2) {
                                                            if (xmlPullParser.getName().equals("entry")) {
                                                                String strM517b2 = m517b("key", xmlPullParser, c0174l0);
                                                                String strM517b3 = m517b("split", xmlPullParser, c0174l0);
                                                                m518c(xmlPullParser, c0174l0);
                                                                if (strM517b2 != null && strM517b3 != null) {
                                                                    c0174l0.m529a(strM517b, strM517b2, strM517b3);
                                                                }
                                                            } else {
                                                                m518c(xmlPullParser, c0174l0);
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    m518c(xmlPullParser, c0174l0);
                                                }
                                            }
                                        }
                                    } else {
                                        m518c(xmlPullParser, c0174l0);
                                    }
                                } else {
                                    m518c(xmlPullParser, c0174l0);
                                }
                            }
                        }
                    } else {
                        m518c(xmlPullParser, c0174l0);
                    }
                }
            } catch (IOException | IllegalStateException | XmlPullParserException e10) {
                Log.e("SplitInstall", "Error while parsing splits.xml", e10);
                return null;
            }
        }
        return c0174l0.m530b();
    }

    /* JADX INFO: renamed from: b */
    public static final String m517b(String str, XmlPullParser xmlPullParser, C0174l0 c0174l0) {
        for (int i10 = 0; i10 < xmlPullParser.getAttributeCount(); i10++) {
            if (xmlPullParser.getAttributeName(i10).equals(str)) {
                return xmlPullParser.getAttributeValue(i10);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static final void m518c(XmlPullParser xmlPullParser, C0174l0 c0174l0) throws XmlPullParserException, IOException {
        int i10 = 1;
        while (i10 != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }
}
