package p203j;

import android.util.AttributeSet;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Deque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: j.p */
/* JADX INFO: loaded from: classes.dex */
public class C7006p {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final Deque<WeakReference<XmlPullParser>> f27403a = new ArrayDeque();

    /* JADX INFO: renamed from: b */
    public static boolean m29626b(XmlPullParser xmlPullParser) {
        if (xmlPullParser != null) {
            try {
                if (xmlPullParser.getEventType() != 3 && xmlPullParser.getEventType() != 1) {
                    return false;
                }
            } catch (XmlPullParserException unused) {
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static XmlPullParser m29627c(@NonNull Deque<WeakReference<XmlPullParser>> deque) {
        while (!deque.isEmpty()) {
            XmlPullParser xmlPullParser = deque.peek().get();
            if (!m29626b(xmlPullParser)) {
                return xmlPullParser;
            }
            deque.pop();
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m29628d(@NonNull XmlPullParser xmlPullParser, XmlPullParser xmlPullParser2) {
        if (xmlPullParser2 == null || xmlPullParser == xmlPullParser2) {
            return false;
        }
        try {
            if (xmlPullParser2.getEventType() == 2) {
                return "include".equals(xmlPullParser2.getName());
            }
            return false;
        } catch (XmlPullParserException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m29629a(@NonNull AttributeSet attributeSet) {
        if (!(attributeSet instanceof XmlPullParser)) {
            return false;
        }
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        if (xmlPullParser.getDepth() != 1) {
            return false;
        }
        XmlPullParser xmlPullParserM29627c = m29627c(this.f27403a);
        this.f27403a.push(new WeakReference<>(xmlPullParser));
        return m29628d(xmlPullParser, xmlPullParserM29627c);
    }
}
