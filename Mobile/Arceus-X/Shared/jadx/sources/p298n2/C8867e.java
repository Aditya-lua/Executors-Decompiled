package p298n2;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p088e.C4711j0;
import p206j2.C7025g;
import p482v2.C12002e;

/* JADX INFO: renamed from: n2.e */
/* JADX INFO: loaded from: classes.dex */
public class C8867e {

    /* JADX INFO: renamed from: n2.e$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static int m35639a(TypedArray typedArray, int i10) {
            return typedArray.getType(i10);
        }
    }

    /* JADX INFO: renamed from: n2.e$b */
    public interface b {
    }

    /* JADX INFO: renamed from: n2.e$c */
    public static final class c implements b {

        /* JADX INFO: renamed from: a */
        public final d[] f32268a;

        public c(d[] dVarArr) {
            this.f32268a = dVarArr;
        }

        /* JADX INFO: renamed from: a */
        public d[] m35640a() {
            return this.f32268a;
        }
    }

    /* JADX INFO: renamed from: n2.e$d */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public final String f32269a;

        /* JADX INFO: renamed from: b */
        public final int f32270b;

        /* JADX INFO: renamed from: c */
        public final boolean f32271c;

        /* JADX INFO: renamed from: d */
        public final String f32272d;

        /* JADX INFO: renamed from: e */
        public final int f32273e;

        /* JADX INFO: renamed from: f */
        public final int f32274f;

        public d(String str, int i10, boolean z10, String str2, int i11, int i12) {
            this.f32269a = str;
            this.f32270b = i10;
            this.f32271c = z10;
            this.f32272d = str2;
            this.f32273e = i11;
            this.f32274f = i12;
        }

        /* JADX INFO: renamed from: a */
        public String m35641a() {
            return this.f32269a;
        }

        /* JADX INFO: renamed from: b */
        public int m35642b() {
            return this.f32274f;
        }

        /* JADX INFO: renamed from: c */
        public int m35643c() {
            return this.f32273e;
        }

        /* JADX INFO: renamed from: d */
        public String m35644d() {
            return this.f32272d;
        }

        /* JADX INFO: renamed from: e */
        public int m35645e() {
            return this.f32270b;
        }

        /* JADX INFO: renamed from: f */
        public boolean m35646f() {
            return this.f32271c;
        }
    }

    /* JADX INFO: renamed from: n2.e$e */
    public static final class e implements b {

        /* JADX INFO: renamed from: a */
        public final List<C12002e> f32275a;

        /* JADX INFO: renamed from: b */
        public final int f32276b;

        /* JADX INFO: renamed from: c */
        public final int f32277c;

        /* JADX INFO: renamed from: d */
        public final String f32278d;

        public e(List<C12002e> list, int i10, int i11, String str) {
            this.f32275a = list;
            this.f32277c = i10;
            this.f32276b = i11;
            this.f32278d = str;
        }

        /* JADX INFO: renamed from: a */
        public int m35647a() {
            return this.f32277c;
        }

        /* JADX INFO: renamed from: b */
        public List<C12002e> m35648b() {
            return this.f32275a;
        }

        /* JADX INFO: renamed from: c */
        public String m35649c() {
            return this.f32278d;
        }

        /* JADX INFO: renamed from: d */
        public int m35650d() {
            return this.f32276b;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m35630a(TypedArray typedArray, int i10) {
        return a.m35639a(typedArray, i10);
    }

    /* JADX INFO: renamed from: b */
    public static b m35631b(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m35634e(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX INFO: renamed from: c */
    public static List<List<byte[]>> m35632c(Resources resources, int i10) {
        if (i10 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i10);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (m35630a(typedArrayObtainTypedArray, 0) == 1) {
                for (int i11 = 0; i11 < typedArrayObtainTypedArray.length(); i11++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i11, 0);
                    if (resourceId != 0) {
                        arrayList.add(m35638i(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m35638i(resources.getStringArray(i10)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    /* JADX INFO: renamed from: d */
    public static C12002e m35633d(XmlPullParser xmlPullParser, Resources resources, String str, String str2, List<List<byte[]>> list) throws Exception {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C7025g.f27537B);
        try {
            String string = typedArrayObtainAttributes.getString(C7025g.f27538C);
            String string2 = typedArrayObtainAttributes.getString(C7025g.f27539D);
            String string3 = typedArrayObtainAttributes.getString(C7025g.f27540E);
            if (string == null) {
                throw new XmlPullParserException("query attribute must be set in fallback element");
            }
            while (xmlPullParser.next() != 3) {
                m35637h(xmlPullParser);
            }
            C12002e c12002e = new C12002e(str, str2, string, list, string2, string3);
            C4711j0.m23003a(typedArrayObtainAttributes);
            return c12002e;
        } catch (Throwable th2) {
            if (typedArrayObtainAttributes == null) {
                throw th2;
            }
            try {
                C4711j0.m23003a(typedArrayObtainAttributes);
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static b m35634e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return m35635f(xmlPullParser, resources);
        }
        m35637h(xmlPullParser);
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static b m35635f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C7025g.f27564h);
        String string = typedArrayObtainAttributes.getString(C7025g.f27565i);
        String string2 = typedArrayObtainAttributes.getString(C7025g.f27570n);
        String string3 = typedArrayObtainAttributes.getString(C7025g.f27571o);
        String string4 = typedArrayObtainAttributes.getString(C7025g.f27567k);
        int resourceId = typedArrayObtainAttributes.getResourceId(C7025g.f27566j, 0);
        int integer = typedArrayObtainAttributes.getInteger(C7025g.f27568l, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(C7025g.f27569m, 500);
        String string5 = typedArrayObtainAttributes.getString(C7025g.f27572p);
        typedArrayObtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(m35636g(xmlPullParser, resources));
                    } else {
                        m35637h(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new c((d[]) arrayList.toArray(new d[0]));
        }
        List<List<byte[]>> listM35632c = m35632c(resources, resourceId);
        ArrayList arrayList2 = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("fallback")) {
                    arrayList2.add(m35633d(xmlPullParser, resources, string, string2, listM35632c));
                } else {
                    m35637h(xmlPullParser);
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            return new e(arrayList2, integer, integer2, string5);
        }
        if (string3 == null) {
            throw new IllegalArgumentException("The provider font XML requires query attribute or fallback children.");
        }
        arrayList2.add(new C12002e(string, string2, string3, listM35632c, null, null));
        if (string4 != null) {
            arrayList2.add(new C12002e(string, string2, string4, listM35632c, null, null));
        }
        return new e(arrayList2, integer, integer2, string5);
    }

    /* JADX INFO: renamed from: g */
    public static d m35636g(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C7025g.f27573q);
        int i10 = C7025g.f27582z;
        if (!typedArrayObtainAttributes.hasValue(i10)) {
            i10 = C7025g.f27575s;
        }
        int i11 = typedArrayObtainAttributes.getInt(i10, 400);
        int i12 = C7025g.f27580x;
        if (!typedArrayObtainAttributes.hasValue(i12)) {
            i12 = C7025g.f27576t;
        }
        boolean z10 = 1 == typedArrayObtainAttributes.getInt(i12, 0);
        int i13 = C7025g.f27536A;
        if (!typedArrayObtainAttributes.hasValue(i13)) {
            i13 = C7025g.f27577u;
        }
        int i14 = C7025g.f27581y;
        if (!typedArrayObtainAttributes.hasValue(i14)) {
            i14 = C7025g.f27578v;
        }
        String string = typedArrayObtainAttributes.getString(i14);
        int i15 = typedArrayObtainAttributes.getInt(i13, 0);
        int i16 = C7025g.f27579w;
        if (!typedArrayObtainAttributes.hasValue(i16)) {
            i16 = C7025g.f27574r;
        }
        int resourceId = typedArrayObtainAttributes.getResourceId(i16, 0);
        String string2 = typedArrayObtainAttributes.getString(i16);
        typedArrayObtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            m35637h(xmlPullParser);
        }
        return new d(string2, i11, z10, string, i15, resourceId);
    }

    /* JADX INFO: renamed from: h */
    public static void m35637h(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i10 = 1;
        while (i10 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static List<byte[]> m35638i(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
