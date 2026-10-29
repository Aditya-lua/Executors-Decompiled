package p365q;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: renamed from: q.c */
/* JADX INFO: loaded from: classes.dex */
public class C10361c extends DataSetObservable {

    /* JADX INFO: renamed from: m */
    public static final String f37254m = "c";

    /* JADX INFO: renamed from: n */
    public static final Object f37255n = new Object();

    /* JADX INFO: renamed from: o */
    public static final Map<String, C10361c> f37256o = new HashMap();

    /* JADX INFO: renamed from: d */
    public final Context f37260d;

    /* JADX INFO: renamed from: e */
    public final String f37261e;

    /* JADX INFO: renamed from: f */
    public Intent f37262f;

    /* JADX INFO: renamed from: a */
    public final Object f37257a = new Object();

    /* JADX INFO: renamed from: b */
    public final List<a> f37258b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final List<d> f37259c = new ArrayList();

    /* JADX INFO: renamed from: g */
    public b f37263g = new c();

    /* JADX INFO: renamed from: h */
    public int f37264h = 50;

    /* JADX INFO: renamed from: i */
    public boolean f37265i = true;

    /* JADX INFO: renamed from: j */
    public boolean f37266j = false;

    /* JADX INFO: renamed from: k */
    public boolean f37267k = true;

    /* JADX INFO: renamed from: l */
    public boolean f37268l = false;

    /* JADX INFO: renamed from: q.c$a */
    public static final class a implements Comparable<a> {

        /* JADX INFO: renamed from: a */
        public final ResolveInfo f37269a;

        /* JADX INFO: renamed from: b */
        public float f37270b;

        public a(ResolveInfo resolveInfo) {
            this.f37269a = resolveInfo;
        }

        /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            return Float.floatToIntBits(aVar.f37270b) - Float.floatToIntBits(this.f37270b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && a.class == obj.getClass() && Float.floatToIntBits(this.f37270b) == Float.floatToIntBits(((a) obj).f37270b);
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f37270b) + 31;
        }

        public String toString() {
            return "[resolveInfo:" + this.f37269a.toString() + "; weight:" + new BigDecimal(this.f37270b) + "]";
        }
    }

    /* JADX INFO: renamed from: q.c$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo39791a(Intent intent, List<a> list, List<d> list2);
    }

    /* JADX INFO: renamed from: q.c$c */
    public static final class c implements b {

        /* JADX INFO: renamed from: a */
        public final Map<ComponentName, a> f37271a = new HashMap();

        @Override // p365q.C10361c.b
        /* JADX INFO: renamed from: a */
        public void mo39791a(Intent intent, List<a> list, List<d> list2) {
            Map<ComponentName, a> map = this.f37271a;
            map.clear();
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                a aVar = list.get(i10);
                aVar.f37270b = 0.0f;
                ActivityInfo activityInfo = aVar.f37269a.activityInfo;
                map.put(new ComponentName(activityInfo.packageName, activityInfo.name), aVar);
            }
            float f10 = 1.0f;
            for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
                d dVar = list2.get(size2);
                a aVar2 = map.get(dVar.f37272a);
                if (aVar2 != null) {
                    aVar2.f37270b += dVar.f37274c * f10;
                    f10 *= 0.95f;
                }
            }
            Collections.sort(list);
        }
    }

    /* JADX INFO: renamed from: q.c$d */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public final ComponentName f37272a;

        /* JADX INFO: renamed from: b */
        public final long f37273b;

        /* JADX INFO: renamed from: c */
        public final float f37274c;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public d(String str, long j10, float f10) {
            this(ComponentName.unflattenFromString(str), j10, f10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            ComponentName componentName = this.f37272a;
            if (componentName == null) {
                if (dVar.f37272a != null) {
                    return false;
                }
            } else if (!componentName.equals(dVar.f37272a)) {
                return false;
            }
            return this.f37273b == dVar.f37273b && Float.floatToIntBits(this.f37274c) == Float.floatToIntBits(dVar.f37274c);
        }

        public int hashCode() {
            ComponentName componentName = this.f37272a;
            int iHashCode = componentName == null ? 0 : componentName.hashCode();
            long j10 = this.f37273b;
            return ((((iHashCode + 31) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Float.floatToIntBits(this.f37274c);
        }

        public String toString() {
            return "[; activity:" + this.f37272a + "; time:" + this.f37273b + "; weight:" + new BigDecimal(this.f37274c) + "]";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public d(ComponentName componentName, long j10, float f10) {
            this.f37272a = componentName;
            this.f37273b = j10;
            this.f37274c = f10;
        }
    }

    /* JADX INFO: renamed from: q.c$e */
    public final class e extends AsyncTask<Object, Void, Void> {
        public e() {
        }

        /* JADX DEBUG: Method merged with bridge method: doInBackground([Ljava/lang/Object;)Ljava/lang/Object; */
        /* JADX WARN: Code duplicated, block: B:44:0x0076 A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Object... objArr) {
            List list = (List) objArr[0];
            String str = (String) objArr[1];
            try {
                FileOutputStream fileOutputStreamOpenFileOutput = C10361c.this.f37260d.openFileOutput(str, 0);
                XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
                try {
                    xmlSerializerNewSerializer.setOutput(fileOutputStreamOpenFileOutput, null);
                    xmlSerializerNewSerializer.startDocument("UTF-8", Boolean.TRUE);
                    xmlSerializerNewSerializer.startTag(null, "historical-records");
                    int size = list.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        d dVar = (d) list.remove(0);
                        xmlSerializerNewSerializer.startTag(null, "historical-record");
                        xmlSerializerNewSerializer.attribute(null, "activity", dVar.f37272a.flattenToString());
                        xmlSerializerNewSerializer.attribute(null, "time", String.valueOf(dVar.f37273b));
                        xmlSerializerNewSerializer.attribute(null, "weight", String.valueOf(dVar.f37274c));
                        xmlSerializerNewSerializer.endTag(null, "historical-record");
                    }
                    xmlSerializerNewSerializer.endTag(null, "historical-records");
                    xmlSerializerNewSerializer.endDocument();
                } catch (IOException e10) {
                    Log.e(C10361c.f37254m, "Error writing historical record file: " + C10361c.this.f37261e, e10);
                } catch (IllegalStateException e11) {
                    Log.e(C10361c.f37254m, "Error writing historical record file: " + C10361c.this.f37261e, e11);
                } catch (IllegalArgumentException e12) {
                    Log.e(C10361c.f37254m, "Error writing historical record file: " + C10361c.this.f37261e, e12);
                } finally {
                    C10361c.this.f37265i = true;
                    if (fileOutputStreamOpenFileOutput != null) {
                        try {
                            fileOutputStreamOpenFileOutput.close();
                        } catch (IOException unused) {
                        }
                    }
                }
                return null;
            } catch (FileNotFoundException e13) {
                Log.e(C10361c.f37254m, "Error writing historical record file: " + str, e13);
                return null;
            }
        }
    }

    public C10361c(Context context, String str) {
        this.f37260d = context.getApplicationContext();
        if (TextUtils.isEmpty(str) || str.endsWith(".xml")) {
            this.f37261e = str;
            return;
        }
        this.f37261e = str + ".xml";
    }

    /* JADX INFO: renamed from: d */
    public static C10361c m39774d(Context context, String str) {
        C10361c c10361c;
        synchronized (f37255n) {
            try {
                Map<String, C10361c> map = f37256o;
                c10361c = map.get(str);
                if (c10361c == null) {
                    c10361c = new C10361c(context, str);
                    map.put(str, c10361c);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c10361c;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m39775a(d dVar) {
        boolean zAdd = this.f37259c.add(dVar);
        if (zAdd) {
            this.f37267k = true;
            m39785l();
            m39784k();
            m39789p();
            notifyChanged();
        }
        return zAdd;
    }

    /* JADX INFO: renamed from: b */
    public Intent m39776b(int i10) {
        synchronized (this.f37257a) {
            try {
                if (this.f37262f == null) {
                    return null;
                }
                m39777c();
                ActivityInfo activityInfo = this.f37258b.get(i10).f37269a.activityInfo;
                ComponentName componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
                Intent intent = new Intent(this.f37262f);
                intent.setComponent(componentName);
                m39775a(new d(componentName, System.currentTimeMillis(), 1.0f));
                return intent;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m39777c() {
        boolean zM39783j = m39783j() | m39786m();
        m39785l();
        if (zM39783j) {
            m39789p();
            notifyChanged();
        }
    }

    /* JADX INFO: renamed from: e */
    public ResolveInfo m39778e(int i10) {
        ResolveInfo resolveInfo;
        synchronized (this.f37257a) {
            m39777c();
            resolveInfo = this.f37258b.get(i10).f37269a;
        }
        return resolveInfo;
    }

    /* JADX INFO: renamed from: f */
    public int m39779f() {
        int size;
        synchronized (this.f37257a) {
            m39777c();
            size = this.f37258b.size();
        }
        return size;
    }

    /* JADX INFO: renamed from: g */
    public int m39780g(ResolveInfo resolveInfo) {
        synchronized (this.f37257a) {
            try {
                m39777c();
                List<a> list = this.f37258b;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (list.get(i10).f37269a == resolveInfo) {
                        return i10;
                    }
                }
                return -1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public ResolveInfo m39781h() {
        synchronized (this.f37257a) {
            try {
                m39777c();
                if (this.f37258b.isEmpty()) {
                    return null;
                }
                return this.f37258b.get(0).f37269a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public int m39782i() {
        int size;
        synchronized (this.f37257a) {
            m39777c();
            size = this.f37259c.size();
        }
        return size;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m39783j() {
        if (!this.f37268l || this.f37262f == null) {
            return false;
        }
        this.f37268l = false;
        this.f37258b.clear();
        List<ResolveInfo> listQueryIntentActivities = this.f37260d.getPackageManager().queryIntentActivities(this.f37262f, 0);
        int size = listQueryIntentActivities.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f37258b.add(new a(listQueryIntentActivities.get(i10)));
        }
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final void m39784k() {
        if (!this.f37266j) {
            throw new IllegalStateException("No preceding call to #readHistoricalData");
        }
        if (this.f37267k) {
            this.f37267k = false;
            if (TextUtils.isEmpty(this.f37261e)) {
                return;
            }
            new e().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new ArrayList(this.f37259c), this.f37261e);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m39785l() {
        int size = this.f37259c.size() - this.f37264h;
        if (size <= 0) {
            return;
        }
        this.f37267k = true;
        for (int i10 = 0; i10 < size; i10++) {
            this.f37259c.remove(0);
        }
    }

    /* JADX INFO: renamed from: m */
    public final boolean m39786m() throws IOException {
        if (!this.f37265i || !this.f37267k || TextUtils.isEmpty(this.f37261e)) {
            return false;
        }
        this.f37265i = false;
        this.f37266j = true;
        m39787n();
        return true;
    }

    /* JADX INFO: renamed from: n */
    public final void m39787n() throws IOException {
        try {
            FileInputStream fileInputStreamOpenFileInput = this.f37260d.openFileInput(this.f37261e);
            try {
                try {
                    XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                    xmlPullParserNewPullParser.setInput(fileInputStreamOpenFileInput, "UTF-8");
                    for (int next = 0; next != 1 && next != 2; next = xmlPullParserNewPullParser.next()) {
                    }
                    if (!"historical-records".equals(xmlPullParserNewPullParser.getName())) {
                        throw new XmlPullParserException("Share records file does not start with historical-records tag.");
                    }
                    List<d> list = this.f37259c;
                    list.clear();
                    while (true) {
                        int next2 = xmlPullParserNewPullParser.next();
                        if (next2 == 1) {
                            if (fileInputStreamOpenFileInput != null) {
                                fileInputStreamOpenFileInput.close();
                                return;
                            }
                            return;
                        } else if (next2 != 3 && next2 != 4) {
                            if (!"historical-record".equals(xmlPullParserNewPullParser.getName())) {
                                throw new XmlPullParserException("Share records file not well-formed.");
                            }
                            list.add(new d(xmlPullParserNewPullParser.getAttributeValue(null, "activity"), Long.parseLong(xmlPullParserNewPullParser.getAttributeValue(null, "time")), Float.parseFloat(xmlPullParserNewPullParser.getAttributeValue(null, "weight"))));
                        }
                    }
                } catch (IOException e10) {
                    Log.e(f37254m, "Error reading historical recrod file: " + this.f37261e, e10);
                    if (fileInputStreamOpenFileInput == null) {
                        return;
                    }
                    fileInputStreamOpenFileInput.close();
                } catch (XmlPullParserException e11) {
                    Log.e(f37254m, "Error reading historical recrod file: " + this.f37261e, e11);
                    if (fileInputStreamOpenFileInput == null) {
                        return;
                    }
                    fileInputStreamOpenFileInput.close();
                }
            } catch (Throwable th2) {
                if (fileInputStreamOpenFileInput != null) {
                    try {
                        fileInputStreamOpenFileInput.close();
                    } catch (IOException unused) {
                    }
                }
                throw th2;
            }
        } catch (FileNotFoundException | IOException unused2) {
        }
    }

    /* JADX INFO: renamed from: o */
    public void m39788o(int i10) {
        synchronized (this.f37257a) {
            try {
                m39777c();
                a aVar = this.f37258b.get(i10);
                a aVar2 = this.f37258b.get(0);
                float f10 = aVar2 != null ? (aVar2.f37270b - aVar.f37270b) + 5.0f : 1.0f;
                ActivityInfo activityInfo = aVar.f37269a.activityInfo;
                m39775a(new d(new ComponentName(activityInfo.packageName, activityInfo.name), System.currentTimeMillis(), f10));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final boolean m39789p() {
        if (this.f37263g == null || this.f37262f == null || this.f37258b.isEmpty() || this.f37259c.isEmpty()) {
            return false;
        }
        this.f37263g.mo39791a(this.f37262f, this.f37258b, Collections.unmodifiableList(this.f37259c));
        return true;
    }
}
