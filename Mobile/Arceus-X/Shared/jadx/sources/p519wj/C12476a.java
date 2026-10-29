package p519wj;

import android.content.Context;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import p151gk.C6124q;

/* JADX INFO: renamed from: wj.a */
/* JADX INFO: loaded from: classes2.dex */
public class C12476a {

    /* JADX INFO: renamed from: a */
    public Context f44603a;

    public C12476a(Context context) {
        this.f44603a = context;
    }

    /* JADX INFO: renamed from: a */
    public String m46729a() {
        try {
            String strM46736h = m46736h();
            if (strM46736h == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(strM46736h);
            JSONObject jSONObject2 = new JSONObject();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject2.put(next, jSONObject.getString(next));
            }
            return jSONObject2.toString();
        } catch (JSONException e10) {
            C6124q.m27061f("rbx.settings.local", "Failed to construct overridePayload", e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m46730b() {
        File fileM46735g = m46735g();
        if (fileM46735g.exists()) {
            C6124q.m27057b("rbx.settings.local", "saveLocalSettings: file: " + fileM46735g.getName() + ", DeletedOK = " + fileM46735g.delete());
        }
    }

    /* JADX INFO: renamed from: c */
    public String m46731c() {
        return m46733e("FStringAuthCookie");
    }

    /* JADX INFO: renamed from: d */
    public final File m46732d() {
        return new File("/data/local/tmp/ClientAppSettings.json");
    }

    /* JADX INFO: renamed from: e */
    public final String m46733e(String str) {
        try {
            String strM46736h = m46736h();
            if (strM46736h == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(strM46736h);
            if (jSONObject.has(str)) {
                return jSONObject.getString(str);
            }
            C6124q.m27066k("rbx.settings.local", "getFlagValueFromSettings: '" + str + "' key not found in settings");
            return null;
        } catch (JSONException e10) {
            C6124q.m27061f("rbx.settings.local", "getFlagValueFromSettings: Failed to parse JSON", e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public final File m46734f() {
        return this.f44603a.getApplicationContext().getFilesDir();
    }

    /* JADX INFO: renamed from: g */
    public final File m46735g() {
        return new File(m46734f(), "exe/ClientSettings/ClientAppSettings.json");
    }

    /* JADX INFO: renamed from: h */
    public String m46736h() {
        try {
            return new JSONObject(m46737i(m46732d())).toString();
        } catch (JSONException unused) {
            C6124q.m27060e("rbx.settings.local", "Failed to read external JSON");
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public final String m46737i(File file) {
        StringBuilder sb2 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb2.append(line);
                sb2.append('\n');
            }
            bufferedReader.close();
        } catch (IOException e10) {
            C6124q.m27060e("rbx.settings.local", "Exception caught when readLocalSettings: file: " + file.getName() + ": " + e10);
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: j */
    public String m46738j() {
        File fileM46735g = m46735g();
        if (fileM46735g.exists()) {
            return m46737i(fileM46735g);
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public void m46739k(String str) {
        if (TextUtils.isEmpty(str)) {
            m46730b();
            C6124q.m27059d("Clear the existing settings.");
            return;
        }
        try {
            String string = new JSONObject(str).toString();
            File file = new File(m46734f(), "exe/ClientSettings/");
            if (!file.exists() && !file.mkdirs()) {
                C6124q.m27060e("rbx.settings.local", "Failed to create the directory to hold Local settings.");
                return;
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(m46735g());
                fileOutputStream.write(string.getBytes());
                fileOutputStream.close();
            } catch (IOException e10) {
                C6124q.m27060e("rbx.settings.local", "File writing failed: " + e10.toString());
            }
        } catch (JSONException unused) {
            C6124q.m27059d("The input is not a valid JSON string");
        }
    }
}
