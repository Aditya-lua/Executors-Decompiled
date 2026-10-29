package q;

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

/* JADX INFO: loaded from: classes.dex */
public class c extends DataSetObservable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f28934m = "c";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Object f28935n = new Object();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Map<String, c> f28936o = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f28939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f28940e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Intent f28941f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f28937a = new Object();
    public final List<a> b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<d> f28938c = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f28942g = new C0509c();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f28943h = 50;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f28944i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f28945j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f28946k = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f28947l = false;

    public static final class a implements Comparable<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ResolveInfo f28948a;
        public float b;

        public a(ResolveInfo resolveInfo) {
            this.f28948a = resolveInfo;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            return Float.floatToIntBits(aVar.b) - Float.floatToIntBits(this.b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && a.class == obj.getClass() && Float.floatToIntBits(this.b) == Float.floatToIntBits(((a) obj).b);
        }

        public int hashCode() {
            return Float.floatToIntBits(this.b) + 31;
        }

        public String toString() {
            return "[resolveInfo:" + this.f28948a.toString() + "; weight:" + new BigDecimal(this.b) + "]";
        }
    }

    public interface b {
        void a(Intent intent, List<a> list, List<d> list2);
    }

    /* JADX INFO: renamed from: q.c$c, reason: collision with other inner class name */
    public static final class C0509c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<ComponentName, a> f28949a = new HashMap();

        @Override // q.c.b
        public void a(Intent intent, List<a> list, List<d> list2) {
            Map<ComponentName, a> map = this.f28949a;
            map.clear();
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                a aVar = list.get(i10);
                aVar.b = 0.0f;
                ActivityInfo activityInfo = aVar.f28948a.activityInfo;
                map.put(new ComponentName(activityInfo.packageName, activityInfo.name), aVar);
            }
            float f10 = 1.0f;
            for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
                d dVar = list2.get(size2);
                a aVar2 = map.get(dVar.f28950a);
                if (aVar2 != null) {
                    aVar2.b += dVar.f28951c * f10;
                    f10 *= 0.95f;
                }
            }
            Collections.sort(list);
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ComponentName f28950a;
        public final long b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f28951c;

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
            ComponentName componentName = this.f28950a;
            if (componentName == null) {
                if (dVar.f28950a != null) {
                    return false;
                }
            } else if (!componentName.equals(dVar.f28950a)) {
                return false;
            }
            return this.b == dVar.b && Float.floatToIntBits(this.f28951c) == Float.floatToIntBits(dVar.f28951c);
        }

        public int hashCode() {
            ComponentName componentName = this.f28950a;
            int iHashCode = componentName == null ? 0 : componentName.hashCode();
            long j10 = this.b;
            return ((((iHashCode + 31) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Float.floatToIntBits(this.f28951c);
        }

        public String toString() {
            return "[; activity:" + this.f28950a + "; time:" + this.b + "; weight:" + new BigDecimal(this.f28951c) + "]";
        }

        public d(ComponentName componentName, long j10, float f10) {
            this.f28950a = componentName;
            this.b = j10;
            this.f28951c = f10;
        }
    }

    public final class e extends AsyncTask<Object, Void, Void> {
        public e() {
        }

        /* JADX WARN: Code duplicated, block: B:44:0x0076 A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Object... objArr) {
            List list = (List) objArr[0];
            String str = (String) objArr[1];
            try {
                FileOutputStream fileOutputStreamOpenFileOutput = c.this.f28939d.openFileOutput(str, 0);
                XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
                try {
                    xmlSerializerNewSerializer.setOutput(fileOutputStreamOpenFileOutput, null);
                    xmlSerializerNewSerializer.startDocument("UTF-8", Boolean.TRUE);
                    xmlSerializerNewSerializer.startTag(null, "historical-records");
                    int size = list.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        d dVar = (d) list.remove(0);
                        xmlSerializerNewSerializer.startTag(null, "historical-record");
                        xmlSerializerNewSerializer.attribute(null, "activity", dVar.f28950a.flattenToString());
                        xmlSerializerNewSerializer.attribute(null, "time", String.valueOf(dVar.b));
                        xmlSerializerNewSerializer.attribute(null, "weight", String.valueOf(dVar.f28951c));
                        xmlSerializerNewSerializer.endTag(null, "historical-record");
                    }
                    xmlSerializerNewSerializer.endTag(null, "historical-records");
                    xmlSerializerNewSerializer.endDocument();
                } catch (IOException e10) {
                    Log.e(c.f28934m, "Error writing historical record file: " + c.this.f28940e, e10);
                } catch (IllegalStateException e11) {
                    Log.e(c.f28934m, "Error writing historical record file: " + c.this.f28940e, e11);
                } catch (IllegalArgumentException e12) {
                    Log.e(c.f28934m, "Error writing historical record file: " + c.this.f28940e, e12);
                } finally {
                    c.this.f28944i = true;
                    if (fileOutputStreamOpenFileOutput != null) {
                        try {
                            fileOutputStreamOpenFileOutput.close();
                        } catch (IOException unused) {
                        }
                    }
                }
                return null;
            } catch (FileNotFoundException e13) {
                Log.e(c.f28934m, "Error writing historical record file: " + str, e13);
                return null;
            }
        }
    }

    public c(Context context, String str) {
        this.f28939d = context.getApplicationContext();
        if (TextUtils.isEmpty(str) || str.endsWith(".xml")) {
            this.f28940e = str;
            return;
        }
        this.f28940e = str + ".xml";
    }

    public static c d(Context context, String str) {
        c cVar;
        synchronized (f28935n) {
            try {
                Map<String, c> map = f28936o;
                cVar = map.get(str);
                if (cVar == null) {
                    cVar = new c(context, str);
                    map.put(str, cVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    public final boolean a(d dVar) {
        boolean zAdd = this.f28938c.add(dVar);
        if (zAdd) {
            this.f28946k = true;
            l();
            k();
            p();
            notifyChanged();
        }
        return zAdd;
    }

    public Intent b(int i10) {
        synchronized (this.f28937a) {
            try {
                if (this.f28941f == null) {
                    return null;
                }
                c();
                ActivityInfo activityInfo = this.b.get(i10).f28948a.activityInfo;
                ComponentName componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
                Intent intent = new Intent(this.f28941f);
                intent.setComponent(componentName);
                a(new d(componentName, System.currentTimeMillis(), 1.0f));
                return intent;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c() {
        boolean zJ = j() | m();
        l();
        if (zJ) {
            p();
            notifyChanged();
        }
    }

    public ResolveInfo e(int i10) {
        ResolveInfo resolveInfo;
        synchronized (this.f28937a) {
            c();
            resolveInfo = this.b.get(i10).f28948a;
        }
        return resolveInfo;
    }

    public int f() {
        int size;
        synchronized (this.f28937a) {
            c();
            size = this.b.size();
        }
        return size;
    }

    public int g(ResolveInfo resolveInfo) {
        synchronized (this.f28937a) {
            try {
                c();
                List<a> list = this.b;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (list.get(i10).f28948a == resolveInfo) {
                        return i10;
                    }
                }
                return -1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public ResolveInfo h() {
        synchronized (this.f28937a) {
            try {
                c();
                if (this.b.isEmpty()) {
                    return null;
                }
                return this.b.get(0).f28948a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int i() {
        int size;
        synchronized (this.f28937a) {
            c();
            size = this.f28938c.size();
        }
        return size;
    }

    public final boolean j() {
        if (!this.f28947l || this.f28941f == null) {
            return false;
        }
        this.f28947l = false;
        this.b.clear();
        List<ResolveInfo> listQueryIntentActivities = this.f28939d.getPackageManager().queryIntentActivities(this.f28941f, 0);
        int size = listQueryIntentActivities.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.b.add(new a(listQueryIntentActivities.get(i10)));
        }
        return true;
    }

    public final void k() {
        if (!this.f28945j) {
            throw new IllegalStateException("No preceding call to #readHistoricalData");
        }
        if (this.f28946k) {
            this.f28946k = false;
            if (TextUtils.isEmpty(this.f28940e)) {
                return;
            }
            new e().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new ArrayList(this.f28938c), this.f28940e);
        }
    }

    public final void l() {
        int size = this.f28938c.size() - this.f28943h;
        if (size <= 0) {
            return;
        }
        this.f28946k = true;
        for (int i10 = 0; i10 < size; i10++) {
            this.f28938c.remove(0);
        }
    }

    public final boolean m() throws IOException {
        if (!this.f28944i || !this.f28946k || TextUtils.isEmpty(this.f28940e)) {
            return false;
        }
        this.f28944i = false;
        this.f28945j = true;
        n();
        return true;
    }

    public final void n() throws IOException {
        try {
            FileInputStream fileInputStreamOpenFileInput = this.f28939d.openFileInput(this.f28940e);
            try {
                try {
                    XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                    xmlPullParserNewPullParser.setInput(fileInputStreamOpenFileInput, "UTF-8");
                    for (int next = 0; next != 1 && next != 2; next = xmlPullParserNewPullParser.next()) {
                    }
                    if (!"historical-records".equals(xmlPullParserNewPullParser.getName())) {
                        throw new XmlPullParserException("Share records file does not start with historical-records tag.");
                    }
                    List<d> list = this.f28938c;
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
                    Log.e(f28934m, "Error reading historical recrod file: " + this.f28940e, e10);
                    if (fileInputStreamOpenFileInput == null) {
                        return;
                    }
                    fileInputStreamOpenFileInput.close();
                } catch (XmlPullParserException e11) {
                    Log.e(f28934m, "Error reading historical recrod file: " + this.f28940e, e11);
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

    public void o(int i10) {
        synchronized (this.f28937a) {
            try {
                c();
                a aVar = this.b.get(i10);
                a aVar2 = this.b.get(0);
                float f10 = aVar2 != null ? (aVar2.b - aVar.b) + 5.0f : 1.0f;
                ActivityInfo activityInfo = aVar.f28948a.activityInfo;
                a(new d(new ComponentName(activityInfo.packageName, activityInfo.name), System.currentTimeMillis(), f10));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean p() {
        if (this.f28942g == null || this.f28941f == null || this.b.isEmpty() || this.f28938c.isEmpty()) {
            return false;
        }
        this.f28942g.a(this.f28941f, this.b, Collections.unmodifiableList(this.f28938c));
        return true;
    }
}
