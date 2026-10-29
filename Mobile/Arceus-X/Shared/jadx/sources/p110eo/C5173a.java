package p110eo;

import android.content.Context;
import com.withpersona.sdk2.inquiry.BuildConfig;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Text;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7693m;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C7797x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p477ut.C11958c;

/* JADX INFO: renamed from: eo.a */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 \u00162\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u0004\u0018\u00010\r*\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u0004\u0018\u00010\r*\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001c\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0019\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010!¨\u0006#"}, m31665d2 = {"Leo/a;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "error", "", "g", "(Ljava/lang/Throwable;)V", "a", "()V", "", "e", "()Ljava/lang/String;", "", "f", "()Z", "Ljava/io/File;", "d", "()Ljava/io/File;", "b", "(Ljava/lang/Throwable;)Ljava/lang/String;", "c", "file", "h", "(Ljava/io/File;)V", "i", "(Ljava/io/File;)Ljava/lang/String;", Text.type, "j", "(Ljava/io/File;Ljava/lang/String;)V", "Ljava/io/File;", "errDir", "inquiry-dynamic-feature_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C5173a {

    /* JADX INFO: renamed from: c */
    public static final Charset f20129c = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final File errDir;

    public C5173a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.errDir = new File(new File(context.getFilesDir(), ".com.withpersona.sdk2.inquiry"), "errors");
    }

    /* JADX INFO: renamed from: a */
    public final void m24048a() {
        m24051d().delete();
    }

    /* JADX INFO: renamed from: b */
    public final String m24049b(Throwable th2) {
        while (th2 != null) {
            StackTraceElement[] stackTrace = th2.getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
            for (StackTraceElement stackTraceElement : stackTrace) {
                String className = stackTraceElement.getClassName();
                Intrinsics.checkNotNullExpressionValue(className, "getClassName(...)");
                if (C7797x.m32309T(className, BuildConfig.LIBRARY_PACKAGE_NAME, false, 2, null)) {
                    return stackTraceElement.getClassName() + " in " + stackTraceElement.getMethodName() + " at line " + stackTraceElement.getLineNumber();
                }
            }
            th2 = th2.getCause();
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final String m24050c(Throwable th2) {
        StackTraceElement[] stackTrace = th2.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
        StackTraceElement stackTraceElement = (StackTraceElement) C7693m.m31843L(stackTrace);
        if (stackTraceElement == null) {
            return null;
        }
        return stackTraceElement.getClassName() + " in " + stackTraceElement.getMethodName() + " at line " + stackTraceElement.getLineNumber();
    }

    /* JADX INFO: renamed from: d */
    public final File m24051d() {
        return new File(this.errDir, "last_error.txt");
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final String m24052e() {
        return m24056i(m24051d());
    }

    /* JADX INFO: renamed from: f */
    public final boolean m24053f() {
        return m24051d().exists();
    }

    /* JADX INFO: renamed from: g */
    public final void m24054g(@NotNull Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        m24055h(this.errDir);
        File fileM24051d = m24051d();
        if (fileM24051d.isDirectory()) {
            fileM24051d.delete();
        }
        String canonicalName = error.getClass().getCanonicalName();
        String strM24049b = m24049b(error);
        if (strM24049b == null) {
            strM24049b = m24050c(error);
        }
        m24057j(fileM24051d, canonicalName + " in " + strM24049b);
    }

    /* JADX INFO: renamed from: h */
    public final void m24055h(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                return;
            } else {
                file.delete();
            }
        }
        file.mkdirs();
    }

    /* JADX INFO: renamed from: i */
    public final String m24056i(File file) {
        if (!file.exists() || !file.isFile()) {
            return null;
        }
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i10 = fileInputStream.read(bArr);
                if (i10 <= 0) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
                    Charset UTF_8 = f20129c;
                    Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                    String str = new String(byteArray, UTF_8);
                    C11958c.m44629a(fileInputStream, null);
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    C11958c.m44629a(fileInputStream, th2);
                    throw th3;
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m24057j(File file, String text) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f20129c);
        try {
            outputStreamWriter.write(text);
            Unit unit = Unit.f29331a;
            C11958c.m44629a(outputStreamWriter, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                C11958c.m44629a(outputStreamWriter, th2);
                throw th3;
            }
        }
    }
}
