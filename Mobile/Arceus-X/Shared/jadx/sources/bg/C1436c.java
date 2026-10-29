package bg;

import androidx.annotation.NonNull;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import p128ff.C5590e;

/* JADX INFO: renamed from: bg.c */
/* JADX INFO: loaded from: classes2.dex */
public class C1436c {

    /* JADX INFO: renamed from: a */
    public File f5625a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final C5590e f5626b;

    /* JADX INFO: renamed from: bg.c$a */
    public enum a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public C1436c(@NonNull C5590e c5590e) {
        this.f5626b = c5590e;
    }

    /* JADX INFO: renamed from: a */
    public final File m7419a() {
        if (this.f5625a == null) {
            synchronized (this) {
                try {
                    if (this.f5625a == null) {
                        this.f5625a = new File(this.f5626b.m25268j().getFilesDir(), "PersistedInstallation." + this.f5626b.m25271o() + ".json");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f5625a;
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public AbstractC1437d m7420b(@NonNull AbstractC1437d abstractC1437d) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", abstractC1437d.mo7396d());
            jSONObject.put("Status", abstractC1437d.mo7399g().ordinal());
            jSONObject.put("AuthToken", abstractC1437d.mo7394b());
            jSONObject.put("RefreshToken", abstractC1437d.mo7398f());
            jSONObject.put("TokenCreationEpochInSecs", abstractC1437d.mo7400h());
            jSONObject.put("ExpiresInSecs", abstractC1437d.mo7395c());
            jSONObject.put("FisError", abstractC1437d.mo7397e());
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", this.f5626b.m25268j().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!fileCreateTempFile.renameTo(m7419a())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
        return abstractC1437d;
    }

    /* JADX INFO: renamed from: c */
    public final JSONObject m7421c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(m7419a());
            while (true) {
                try {
                    int i10 = fileInputStream.read(bArr, 0, 16384);
                    if (i10 < 0) {
                        JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                        fileInputStream.close();
                        return jSONObject;
                    }
                    byteArrayOutputStream.write(bArr, 0, i10);
                } catch (Throwable th2) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        } catch (IOException | JSONException unused) {
            return new JSONObject();
        }
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public AbstractC1437d m7422d() {
        JSONObject jSONObjectM7421c = m7421c();
        String strOptString = jSONObjectM7421c.optString("Fid", null);
        int iOptInt = jSONObjectM7421c.optInt("Status", a.ATTEMPT_MIGRATION.ordinal());
        String strOptString2 = jSONObjectM7421c.optString("AuthToken", null);
        String strOptString3 = jSONObjectM7421c.optString("RefreshToken", null);
        long jOptLong = jSONObjectM7421c.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObjectM7421c.optLong("ExpiresInSecs", 0L);
        return AbstractC1437d.m7424a().mo7405d(strOptString).mo7408g(a.values()[iOptInt]).mo7403b(strOptString2).mo7407f(strOptString3).mo7409h(jOptLong).mo7404c(jOptLong2).mo7406e(jSONObjectM7421c.optString("FisError", null)).mo7402a();
    }
}
