package p305n9;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import p462u9.C11821l;

/* JADX INFO: renamed from: n9.j */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class C8944j {

    /* JADX INFO: renamed from: b */
    public static final C8935g f32611b = new C8935g("LibraryVersion", "");

    /* JADX INFO: renamed from: c */
    public static final C8944j f32612c = new C8944j();

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f32613a = new ConcurrentHashMap();

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C8944j m36020a() {
        return f32612c;
    }

    @NonNull
    @Deprecated
    /* JADX INFO: renamed from: b */
    public String m36021b(@NonNull String str) throws Throwable {
        String str2;
        InputStream resourceAsStream;
        C8953m.m36042g(str, "Please provide a valid libraryName");
        ConcurrentHashMap concurrentHashMap = this.f32613a;
        if (concurrentHashMap.containsKey(str)) {
            return (String) concurrentHashMap.get(str);
        }
        Properties properties = new Properties();
        InputStream inputStream = null;
        property = null;
        String property = null;
        inputStream = null;
        try {
            try {
                resourceAsStream = C8944j.class.getResourceAsStream(String.format("/%s.properties", str));
                try {
                    if (resourceAsStream != null) {
                        properties.load(resourceAsStream);
                        property = properties.getProperty("version", null);
                        C8935g c8935g = f32611b;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 12 + String.valueOf(property).length());
                        sb2.append(str);
                        sb2.append(" version is ");
                        sb2.append(property);
                        c8935g.m36007g("LibraryVersion", sb2.toString());
                    } else {
                        C8935g c8935g2 = f32611b;
                        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 43);
                        sb3.append("Failed to get app version for libraryName: ");
                        sb3.append(str);
                        c8935g2.m36008h("LibraryVersion", sb3.toString());
                    }
                } catch (IOException e10) {
                    e = e10;
                    str2 = property;
                    inputStream = resourceAsStream;
                    C8935g c8935g3 = f32611b;
                    StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 43);
                    sb4.append("Failed to get app version for libraryName: ");
                    sb4.append(str);
                    c8935g3.m36005e("LibraryVersion", sb4.toString(), e);
                    resourceAsStream = inputStream;
                    property = str2;
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = resourceAsStream;
                    if (inputStream != null) {
                        C11821l.m44193a(inputStream);
                    }
                    throw th;
                }
            } catch (IOException e11) {
                e = e11;
                str2 = null;
            }
            if (resourceAsStream != null) {
                C11821l.m44193a(resourceAsStream);
            }
            if (property == null) {
                f32611b.m36002b("LibraryVersion", ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used");
                property = "UNKNOWN";
            }
            this.f32613a.put(str, property);
            return property;
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
