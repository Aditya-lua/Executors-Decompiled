package n2;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import e.j0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class e {

    public static class a {
        public static int a(TypedArray typedArray, int i10) {
            return typedArray.getType(i10);
        }
    }

    public interface b {
    }

    public static final class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d[] f25295a;

        public c(d[] dVarArr) {
            this.f25295a = dVarArr;
        }

        public d[] a() {
            return this.f25295a;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f25296a;
        public final int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f25297c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f25298d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f25299e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f25300f;

        public d(String str, int i10, boolean z10, String str2, int i11, int i12) {
            this.f25296a = str;
            this.b = i10;
            this.f25297c = z10;
            this.f25298d = str2;
            this.f25299e = i11;
            this.f25300f = i12;
        }

        public String a() {
            return this.f25296a;
        }

        public int b() {
            return this.f25300f;
        }

        public int c() {
            return this.f25299e;
        }

        public String d() {
            return this.f25298d;
        }

        public int e() {
            return this.b;
        }

        public boolean f() {
            return this.f25297c;
        }
    }

    /* JADX INFO: renamed from: n2.e$e, reason: collision with other inner class name */
    public static final class C0489e implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<v2.e> f25301a;
        public final int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f25302c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f25303d;

        public C0489e(List<v2.e> list, int i10, int i11, String str) {
            this.f25301a = list;
            this.f25302c = i10;
            this.b = i11;
            this.f25303d = str;
        }

        public int a() {
            return this.f25302c;
        }

        public List<v2.e> b() {
            return this.f25301a;
        }

        public String c() {
            return this.f25303d;
        }

        public int d() {
            return this.b;
        }
    }

    public static int a(TypedArray typedArray, int i10) {
        return a.a(typedArray, i10);
    }

    public static b b(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return e(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List<List<byte[]>> c(Resources resources, int i10) {
        if (i10 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i10);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (a(typedArrayObtainTypedArray, 0) == 1) {
                for (int i11 = 0; i11 < typedArrayObtainTypedArray.length(); i11++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i11, 0);
                    if (resourceId != 0) {
                        arrayList.add(i(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(i(resources.getStringArray(i10)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static v2.e d(XmlPullParser xmlPullParser, Resources resources, String str, String str2, List<List<byte[]>> list) throws Exception {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), j2.g.B);
        try {
            String string = typedArrayObtainAttributes.getString(j2.g.C);
            String string2 = typedArrayObtainAttributes.getString(j2.g.D);
            String string3 = typedArrayObtainAttributes.getString(j2.g.E);
            if (string == null) {
                throw new XmlPullParserException("query attribute must be set in fallback element");
            }
            while (xmlPullParser.next() != 3) {
                h(xmlPullParser);
            }
            v2.e eVar = new v2.e(str, str2, string, list, string2, string3);
            j0.a(typedArrayObtainAttributes);
            return eVar;
        } catch (Throwable th2) {
            if (typedArrayObtainAttributes == null) {
                throw th2;
            }
            try {
                j0.a(typedArrayObtainAttributes);
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public static b e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return f(xmlPullParser, resources);
        }
        h(xmlPullParser);
        return null;
    }

    public static b f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), j2.g.f20035h);
        String string = typedArrayObtainAttributes.getString(j2.g.f20036i);
        String string2 = typedArrayObtainAttributes.getString(j2.g.f20041n);
        String string3 = typedArrayObtainAttributes.getString(j2.g.f20042o);
        String string4 = typedArrayObtainAttributes.getString(j2.g.f20038k);
        int resourceId = typedArrayObtainAttributes.getResourceId(j2.g.f20037j, 0);
        int integer = typedArrayObtainAttributes.getInteger(j2.g.f20039l, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(j2.g.f20040m, 500);
        String string5 = typedArrayObtainAttributes.getString(j2.g.f20043p);
        typedArrayObtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(g(xmlPullParser, resources));
                    } else {
                        h(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new c((d[]) arrayList.toArray(new d[0]));
        }
        List<List<byte[]>> listC = c(resources, resourceId);
        ArrayList arrayList2 = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("fallback")) {
                    arrayList2.add(d(xmlPullParser, resources, string, string2, listC));
                } else {
                    h(xmlPullParser);
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            return new C0489e(arrayList2, integer, integer2, string5);
        }
        if (string3 == null) {
            throw new IllegalArgumentException("The provider font XML requires query attribute or fallback children.");
        }
        arrayList2.add(new v2.e(string, string2, string3, listC, null, null));
        if (string4 != null) {
            arrayList2.add(new v2.e(string, string2, string4, listC, null, null));
        }
        return new C0489e(arrayList2, integer, integer2, string5);
    }

    public static d g(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), j2.g.f20044q);
        int i10 = typedArrayObtainAttributes.getInt(typedArrayObtainAttributes.hasValue(j2.g.f20053z) ? j2.g.f20053z : j2.g.f20046s, 400);
        boolean z10 = 1 == typedArrayObtainAttributes.getInt(typedArrayObtainAttributes.hasValue(j2.g.f20051x) ? j2.g.f20051x : j2.g.f20047t, 0);
        int i11 = typedArrayObtainAttributes.hasValue(j2.g.A) ? j2.g.A : j2.g.f20048u;
        String string = typedArrayObtainAttributes.getString(typedArrayObtainAttributes.hasValue(j2.g.f20052y) ? j2.g.f20052y : j2.g.f20049v);
        int i12 = typedArrayObtainAttributes.getInt(i11, 0);
        int i13 = typedArrayObtainAttributes.hasValue(j2.g.f20050w) ? j2.g.f20050w : j2.g.f20045r;
        int resourceId = typedArrayObtainAttributes.getResourceId(i13, 0);
        String string2 = typedArrayObtainAttributes.getString(i13);
        typedArrayObtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            h(xmlPullParser);
        }
        return new d(string2, i10, z10, string, i12, resourceId);
    }

    public static void h(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
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

    public static List<byte[]> i(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
