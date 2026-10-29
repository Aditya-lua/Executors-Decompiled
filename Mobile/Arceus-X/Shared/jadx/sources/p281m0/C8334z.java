package p281m0;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;
import java.util.UUID;
import p140g0.C5883f1;
import p140g0.C5891h1;
import p347p0.C10091g;

/* JADX INFO: renamed from: m0.z */
/* JADX INFO: loaded from: classes.dex */
public final class C8334z {
    /* JADX INFO: renamed from: a */
    public static Uri m33872a(File file, File file2) throws C5891h1 {
        if (file2.exists()) {
            file2.delete();
        }
        if (file.renameTo(file2)) {
            return Uri.fromFile(file2);
        }
        throw new C5891h1(1, "Failed to overwrite the file: " + file2.getAbsolutePath(), null);
    }

    /* JADX INFO: renamed from: b */
    public static Uri m33873b(File file, C5883f1.h hVar) throws Throwable {
        ContentResolver contentResolverM26431a = hVar.m26431a();
        Objects.requireNonNull(contentResolverM26431a);
        ContentValues contentValues = hVar.m26432b() != null ? new ContentValues(hVar.m26432b()) : new ContentValues();
        m33882k(contentValues, 1);
        Uri uri = null;
        try {
            try {
                Uri uriInsert = contentResolverM26431a.insert(hVar.m26436f(), contentValues);
                try {
                    if (uriInsert == null) {
                        throw new C5891h1(1, "Failed to insert a MediaStore URI.", null);
                    }
                    m33875d(file, uriInsert, contentResolverM26431a);
                    m33884m(uriInsert, contentResolverM26431a, 0);
                    return uriInsert;
                } catch (IOException e10) {
                    e = e10;
                    uri = uriInsert;
                    throw new C5891h1(1, "Failed to write to MediaStore URI: " + uri, e);
                } catch (SecurityException e11) {
                    e = e11;
                    uri = uriInsert;
                    throw new C5891h1(1, "Failed to write to MediaStore URI: " + uri, e);
                } catch (Throwable th2) {
                    th = th2;
                    uri = uriInsert;
                    if (uri != null) {
                        m33884m(uri, contentResolverM26431a, 0);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e12) {
            e = e12;
        } catch (SecurityException e13) {
            e = e13;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m33874c(File file, OutputStream outputStream) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i10 = fileInputStream.read(bArr);
                if (i10 <= 0) {
                    fileInputStream.close();
                    return;
                }
                outputStream.write(bArr, 0, i10);
            }
        } catch (Throwable th2) {
            try {
                fileInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m33875d(File file, Uri uri, ContentResolver contentResolver) throws IOException {
        OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uri);
        try {
            if (outputStreamOpenOutputStream != null) {
                m33874c(file, outputStreamOpenOutputStream);
                outputStreamOpenOutputStream.close();
            } else {
                throw new FileNotFoundException(uri + " cannot be resolved.");
            }
        } catch (Throwable th2) {
            if (outputStreamOpenOutputStream != null) {
                try {
                    outputStreamOpenOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: e */
    public static File m33876e(C5883f1.h hVar) {
        try {
            File fileM26433c = hVar.m26433c();
            if (fileM26433c == null) {
                return File.createTempFile("CameraX", ".tmp");
            }
            return new File(fileM26433c.getParent(), "CameraX" + UUID.randomUUID().toString() + m33877f(fileM26433c));
        } catch (IOException e10) {
            throw new C5891h1(1, "Failed to create temp file.", e10);
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m33877f(File file) {
        String name = file.getName();
        int iLastIndexOf = name.lastIndexOf(46);
        return iLastIndexOf >= 0 ? name.substring(iLastIndexOf) : "";
    }

    /* JADX INFO: renamed from: g */
    public static boolean m33878g(C5883f1.h hVar) {
        return hVar.m26433c() != null;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m33879h(C5883f1.h hVar) {
        return (hVar.m26436f() == null || hVar.m26431a() == null || hVar.m26432b() == null) ? false : true;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m33880i(C5883f1.h hVar) {
        return hVar.m26435e() != null;
    }

    /* JADX INFO: renamed from: j */
    public static Uri m33881j(File file, C5883f1.h hVar) {
        Uri uriM33872a = null;
        try {
            try {
                if (m33879h(hVar)) {
                    uriM33872a = m33873b(file, hVar);
                } else if (m33880i(hVar)) {
                    OutputStream outputStreamM26435e = hVar.m26435e();
                    Objects.requireNonNull(outputStreamM26435e);
                    m33874c(file, outputStreamM26435e);
                } else if (m33878g(hVar)) {
                    File fileM26433c = hVar.m26433c();
                    Objects.requireNonNull(fileM26433c);
                    uriM33872a = m33872a(file, fileM26433c);
                }
                file.delete();
                return uriM33872a;
            } catch (IOException unused) {
                throw new C5891h1(1, "Failed to write to OutputStream.", null);
            }
        } catch (Throwable th2) {
            file.delete();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m33882k(ContentValues contentValues, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            contentValues.put("is_pending", Integer.valueOf(i10));
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m33883l(File file, C10091g c10091g, C5883f1.h hVar, int i10) {
        try {
            C10091g c10091gM38921h = C10091g.m38921h(file);
            c10091g.m38929g(c10091gM38921h);
            if (c10091gM38921h.m38936s() == 0 && i10 != 0) {
                c10091gM38921h.m38943z(i10);
            }
            C5883f1.e eVarM26434d = hVar.m26434d();
            if (eVarM26434d.m26421b()) {
                c10091gM38921h.m38930l();
            }
            if (eVarM26434d.m26422c()) {
                c10091gM38921h.m38931m();
            }
            if (eVarM26434d.m26420a() != null) {
                c10091gM38921h.m38928b(eVarM26434d.m26420a());
            }
            c10091gM38921h.m38926A();
        } catch (IOException e10) {
            throw new C5891h1(1, "Failed to update Exif data", e10);
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m33884m(Uri uri, ContentResolver contentResolver, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            ContentValues contentValues = new ContentValues();
            m33882k(contentValues, i10);
            contentResolver.update(uri, contentValues, null, null);
        }
    }
}
