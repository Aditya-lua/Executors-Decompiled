package ae;

import android.content.res.AssetManager;
import java.io.File;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yd.b f347a;
    public XmlPullParser b;

    public m(yd.b bVar) {
        this.f347a = bVar;
    }

    public final long a() throws XmlPullParserException, IOException {
        int next;
        if (this.b == null) {
            throw new XmlPullParserException("Manifest file needs to be loaded before parsing.");
        }
        do {
            next = this.b.next();
            if (next == 2) {
                if (!this.b.getName().equals("manifest")) {
                    break;
                }
                String attributeValue = this.b.getAttributeValue("http://schemas.android.com/apk/res/android", "versionCode");
                String attributeValue2 = this.b.getAttributeValue("http://schemas.android.com/apk/res/android", "versionCodeMajor");
                if (attributeValue == null) {
                    throw new XmlPullParserException("Manifest entry doesn't contain 'versionCode' attribute.");
                }
                try {
                    int i10 = Integer.parseInt(attributeValue);
                    if (attributeValue2 == null) {
                        return i10;
                    }
                    try {
                        return (((long) Integer.parseInt(attributeValue2)) << 32) | (((long) i10) & 4294967295L);
                    } catch (NumberFormatException e10) {
                        throw new XmlPullParserException(String.format("Couldn't parse versionCodeMajor to int: %s", e10.getMessage()));
                    }
                } catch (NumberFormatException e11) {
                    throw new XmlPullParserException(String.format("Couldn't parse versionCode to int: %s", e11.getMessage()));
                }
            }
        } while (next != 1);
        throw new XmlPullParserException("Couldn't find manifest entry at top-level.");
    }

    public final void b(AssetManager assetManager, File file) {
        this.b = assetManager.openXmlResourceParser(yd.b.c(assetManager, file), "AndroidManifest.xml");
    }
}
