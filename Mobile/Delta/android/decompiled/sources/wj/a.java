package wj;

import android.content.Context;
import android.text.TextUtils;
import gk.p;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f34403a;

    public a(Context context) {
        this.f34403a = context;
    }

    public String a() {
        try {
            String strH = h();
            if (strH == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(strH);
            JSONObject jSONObject2 = new JSONObject();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject2.put(next, jSONObject.getString(next));
            }
            return jSONObject2.toString();
        } catch (JSONException e10) {
            p.f("rbx.settings.local", "Failed to construct overridePayload", e10);
            return null;
        }
    }

    public void b() {
        File fileG = g();
        if (fileG.exists()) {
            p.b("rbx.settings.local", "saveLocalSettings: file: " + fileG.getName() + ", DeletedOK = " + fileG.delete());
        }
    }

    public String c() {
        return e("FStringAuthCookie");
    }

    public final File d() {
        return new File("/data/local/tmp/ClientAppSettings.json");
    }

    public final String e(String str) {
        try {
            String strH = h();
            if (strH == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(strH);
            if (jSONObject.has(str)) {
                return jSONObject.getString(str);
            }
            p.k("rbx.settings.local", "getFlagValueFromSettings: '" + str + "' key not found in settings");
            return null;
        } catch (JSONException e10) {
            p.f("rbx.settings.local", "getFlagValueFromSettings: Failed to parse JSON", e10);
            return null;
        }
    }

    public final File f() {
        return this.f34403a.getApplicationContext().getFilesDir();
    }

    public final File g() {
        return new File(f(), "exe/ClientSettings/ClientAppSettings.json");
    }

    public String h() {
        try {
            return new JSONObject(i(d())).toString();
        } catch (JSONException unused) {
            p.e("rbx.settings.local", "Failed to read external JSON");
            return null;
        }
    }

    public final String i(File file) {
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
            p.e("rbx.settings.local", "Exception caught when readLocalSettings: file: " + file.getName() + ": " + e10);
        }
        return sb2.toString();
    }

    public String j() {
        File fileG = g();
        if (fileG.exists()) {
            return i(fileG);
        }
        return null;
    }

    public void k(String str) {
        if (TextUtils.isEmpty(str)) {
            b();
            p.d("Clear the existing settings.");
            return;
        }
        try {
            String string = new JSONObject(str).toString();
            File file = new File(f(), "exe/ClientSettings/");
            if (!file.exists() && !file.mkdirs()) {
                p.e("rbx.settings.local", "Failed to create the directory to hold Local settings.");
                return;
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(g());
                fileOutputStream.write(string.getBytes());
                fileOutputStream.close();
            } catch (IOException e10) {
                p.e("rbx.settings.local", "File writing failed: " + e10.toString());
            }
        } catch (JSONException unused) {
            p.d("The input is not a valid JSON string");
        }
    }
}
