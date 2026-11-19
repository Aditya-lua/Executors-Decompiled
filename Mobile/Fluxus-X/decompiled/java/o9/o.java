package o9;

import androidx.annotation.NonNull;
import com.github.luben.zstd.BuildConfig;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class o {
    public static final k b = new k("LibraryVersion", BuildConfig.FLAVOR);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o f26999c = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f27000a = new ConcurrentHashMap();

    @NonNull
    public static o a() {
        return f26999c;
    }

    @NonNull
    @Deprecated
    public String b(@NonNull String str) throws Throwable {
        String str2;
        InputStream resourceAsStream;
        s.g(str, "Please provide a valid libraryName");
        ConcurrentHashMap concurrentHashMap = this.f27000a;
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
                resourceAsStream = o.class.getResourceAsStream(String.format("/%s.properties", str));
                try {
                    if (resourceAsStream != null) {
                        properties.load(resourceAsStream);
                        property = properties.getProperty("version", null);
                        k kVar = b;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 12 + String.valueOf(property).length());
                        sb2.append(str);
                        sb2.append(" version is ");
                        sb2.append(property);
                        kVar.g("LibraryVersion", sb2.toString());
                    } else {
                        k kVar2 = b;
                        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 43);
                        sb3.append("Failed to get app version for libraryName: ");
                        sb3.append(str);
                        kVar2.h("LibraryVersion", sb3.toString());
                    }
                } catch (IOException e10) {
                    e = e10;
                    str2 = property;
                    inputStream = resourceAsStream;
                    k kVar3 = b;
                    StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 43);
                    sb4.append("Failed to get app version for libraryName: ");
                    sb4.append(str);
                    kVar3.e("LibraryVersion", sb4.toString(), e);
                    resourceAsStream = inputStream;
                    property = str2;
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = resourceAsStream;
                    if (inputStream != null) {
                        v9.l.a(inputStream);
                    }
                    throw th;
                }
            } catch (IOException e11) {
                e = e11;
                str2 = null;
            }
            if (resourceAsStream != null) {
                v9.l.a(resourceAsStream);
            }
            if (property == null) {
                b.b("LibraryVersion", ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used");
                property = "UNKNOWN";
            }
            this.f27000a.put(str, property);
            return property;
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
