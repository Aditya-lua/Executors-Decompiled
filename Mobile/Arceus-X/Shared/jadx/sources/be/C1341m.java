package be;

import android.content.res.AssetManager;
import java.io.File;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p601zd.C13773b;

/* JADX INFO: renamed from: be.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C1341m {

    /* JADX INFO: renamed from: a */
    public final C13773b f5384a;

    /* JADX INFO: renamed from: b */
    public XmlPullParser f5385b;

    public C1341m(C13773b c13773b) {
        this.f5384a = c13773b;
    }

    /* JADX INFO: renamed from: a */
    public final long m7185a() throws XmlPullParserException, IOException {
        int next;
        if (this.f5385b == null) {
            throw new XmlPullParserException("Manifest file needs to be loaded before parsing.");
        }
        do {
            next = this.f5385b.next();
            if (next == 2) {
                if (!this.f5385b.getName().equals("manifest")) {
                    break;
                }
                String attributeValue = this.f5385b.getAttributeValue("http://schemas.android.com/apk/res/android", "versionCode");
                String attributeValue2 = this.f5385b.getAttributeValue("http://schemas.android.com/apk/res/android", "versionCodeMajor");
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

    /* JADX INFO: renamed from: b */
    public final void m7186b(AssetManager assetManager, File file) {
        this.f5385b = assetManager.openXmlResourceParser(C13773b.m50200c(assetManager, file), "AndroidManifest.xml");
    }
}
