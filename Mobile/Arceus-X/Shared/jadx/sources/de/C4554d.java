package de;

import be.C1355q1;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p047ce.C1628a;

/* JADX INFO: renamed from: de.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C4554d {

    /* JADX INFO: renamed from: c */
    public static final C1355q1 f18668c = new C1355q1("LocalTestingConfigParser");

    /* JADX INFO: renamed from: a */
    public final XmlPullParser f18669a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4571u f18670b = AbstractC4572v.m22632c();

    public C4554d(XmlPullParser xmlPullParser) {
        this.f18669a = xmlPullParser;
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC4572v m22623a(File file) {
        File file2 = new File(file, "local_testing_config.xml");
        if (!file2.exists()) {
            return AbstractC4572v.f18712a;
        }
        try {
            FileReader fileReader = new FileReader(file2);
            try {
                XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
                xmlPullParserNewPullParser.setInput(fileReader);
                final C4554d c4554d = new C4554d(xmlPullParserNewPullParser);
                c4554d.m22627e("local-testing-config", new InterfaceC4576z() { // from class: de.y
                    @Override // de.InterfaceC4576z
                    public final void zza() throws XmlPullParserException, IOException {
                        this.f18715a.m22626d();
                    }
                });
                AbstractC4572v abstractC4572vM22631e = c4554d.f18670b.m22631e();
                fileReader.close();
                return abstractC4572vM22631e;
            } catch (Throwable th2) {
                try {
                    fileReader.close();
                } catch (Throwable th3) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                    } catch (Exception unused) {
                    }
                }
                throw th2;
            }
        } catch (IOException | RuntimeException | XmlPullParserException e10) {
            f18668c.m7211e("%s can not be parsed, using default. Error: %s", "local_testing_config.xml", e10.getMessage());
            return AbstractC4572v.f18712a;
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m22624b(final C4554d c4554d) throws XmlPullParserException, IOException {
        for (int i10 = 0; i10 < c4554d.f18669a.getAttributeCount(); i10++) {
            if ("defaultErrorCode".equals(c4554d.f18669a.getAttributeName(i10))) {
                c4554d.f18670b.mo22619a(C1628a.m8225a(c4554d.f18669a.getAttributeValue(i10)));
            }
        }
        c4554d.m22627e("split-install-error", new InterfaceC4576z() { // from class: de.w
            @Override // de.InterfaceC4576z
            public final void zza() throws XmlPullParserException {
                C4554d.m22625c(this.f18713a);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m22625c(C4554d c4554d) throws XmlPullParserException {
        String attributeValue = null;
        String attributeValue2 = null;
        for (int i10 = 0; i10 < c4554d.f18669a.getAttributeCount(); i10++) {
            if ("module".equals(c4554d.f18669a.getAttributeName(i10))) {
                attributeValue = c4554d.f18669a.getAttributeValue(i10);
            }
            if ("errorCode".equals(c4554d.f18669a.getAttributeName(i10))) {
                attributeValue2 = c4554d.f18669a.getAttributeValue(i10);
            }
        }
        if (attributeValue == null || attributeValue2 == null) {
            throw new XmlPullParserException(String.format("'%s' element does not contain 'module'/'errorCode' attributes.", "split-install-error"), c4554d.f18669a, null);
        }
        c4554d.f18670b.mo22622d().put(attributeValue, Integer.valueOf(C1628a.m8225a(attributeValue2)));
        while (c4554d.f18669a.next() != 3) {
        }
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m22626d() throws XmlPullParserException, IOException {
        m22627e("split-install-errors", new InterfaceC4576z() { // from class: de.x
            @Override // de.InterfaceC4576z
            public final void zza() throws XmlPullParserException, IOException {
                C4554d.m22624b(this.f18714a);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public final void m22627e(String str, InterfaceC4576z interfaceC4576z) throws XmlPullParserException, IOException {
        while (true) {
            int next = this.f18669a.next();
            if (next == 3 || next == 1) {
                return;
            }
            if (this.f18669a.getEventType() == 2) {
                if (!this.f18669a.getName().equals(str)) {
                    throw new XmlPullParserException(String.format("Expected '%s' tag but found '%s'.", str, this.f18669a.getName()), this.f18669a, null);
                }
                interfaceC4576z.zza();
            }
        }
    }
}
