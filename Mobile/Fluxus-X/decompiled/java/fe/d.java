package fe;

import de.q1;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q1 f15943c = new q1("LocalTestingConfigParser");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final XmlPullParser f15944a;
    public final u b = v.c();

    public d(XmlPullParser xmlPullParser) {
        this.f15944a = xmlPullParser;
    }

    public static v a(File file) {
        File file2 = new File(file, "local_testing_config.xml");
        if (!file2.exists()) {
            return v.f15977a;
        }
        try {
            FileReader fileReader = new FileReader(file2);
            try {
                XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
                xmlPullParserNewPullParser.setInput(fileReader);
                final d dVar = new d(xmlPullParserNewPullParser);
                dVar.e("local-testing-config", new z() { // from class: fe.y
                    @Override // fe.z
                    public final void zza() throws XmlPullParserException, IOException {
                        this.f15980a.d();
                    }
                });
                v vVarE = dVar.b.e();
                fileReader.close();
                return vVarE;
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
            f15943c.e("%s can not be parsed, using default. Error: %s", "local_testing_config.xml", e10.getMessage());
            return v.f15977a;
        }
    }

    public static /* synthetic */ void b(final d dVar) throws XmlPullParserException, IOException {
        for (int i10 = 0; i10 < dVar.f15944a.getAttributeCount(); i10++) {
            if ("defaultErrorCode".equals(dVar.f15944a.getAttributeName(i10))) {
                dVar.b.a(ee.a.a(dVar.f15944a.getAttributeValue(i10)));
            }
        }
        dVar.e("split-install-error", new z() { // from class: fe.w
            @Override // fe.z
            public final void zza() throws XmlPullParserException {
                d.c(this.f15978a);
            }
        });
    }

    public static /* synthetic */ void c(d dVar) throws XmlPullParserException {
        String attributeValue = null;
        String attributeValue2 = null;
        for (int i10 = 0; i10 < dVar.f15944a.getAttributeCount(); i10++) {
            if ("module".equals(dVar.f15944a.getAttributeName(i10))) {
                attributeValue = dVar.f15944a.getAttributeValue(i10);
            }
            if ("errorCode".equals(dVar.f15944a.getAttributeName(i10))) {
                attributeValue2 = dVar.f15944a.getAttributeValue(i10);
            }
        }
        if (attributeValue == null || attributeValue2 == null) {
            throw new XmlPullParserException(String.format("'%s' element does not contain 'module'/'errorCode' attributes.", "split-install-error"), dVar.f15944a, null);
        }
        dVar.b.d().put(attributeValue, Integer.valueOf(ee.a.a(attributeValue2)));
        while (dVar.f15944a.next() != 3) {
        }
    }

    public final /* synthetic */ void d() throws XmlPullParserException, IOException {
        e("split-install-errors", new z() { // from class: fe.x
            @Override // fe.z
            public final void zza() throws XmlPullParserException, IOException {
                d.b(this.f15979a);
            }
        });
    }

    public final void e(String str, z zVar) throws XmlPullParserException, IOException {
        while (true) {
            int next = this.f15944a.next();
            if (next == 3 || next == 1) {
                return;
            }
            if (this.f15944a.getEventType() == 2) {
                if (!this.f15944a.getName().equals(str)) {
                    throw new XmlPullParserException(String.format("Expected '%s' tag but found '%s'.", str, this.f15944a.getName()), this.f15944a, null);
                }
                zVar.zza();
            }
        }
    }
}
