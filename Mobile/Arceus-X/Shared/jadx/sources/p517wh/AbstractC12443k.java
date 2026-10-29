package p517wh;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.webkit.MimeTypeMap;
import com.roblox.client.RobloxApplication;
import com.roblox.engine.jni.EngineJavaCallback2;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.model.NativeTextBoxInfo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Objects;
import p151gk.C6124q;
import th.C11659h;

/* JADX INFO: renamed from: wh.k */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC12443k extends EngineJavaCallback2 {
    /* JADX INFO: renamed from: s */
    public static OutputStream m46667s(String str) {
        File externalStoragePublicDirectory;
        Uri uriInsert;
        String strM46668t = m46668t(str);
        if (Build.VERSION.SDK_INT < 29) {
            if (strM46668t.startsWith("image/")) {
                externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
            } else {
                externalStoragePublicDirectory = strM46668t.startsWith("video/") ? Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES) : Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
            }
            return new FileOutputStream(new File(externalStoragePublicDirectory, str));
        }
        ContentResolver contentResolver = RobloxApplication.m14834f().getContentResolver();
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str);
        contentValues.put("mime_type", strM46668t);
        contentValues.put("relative_path", Environment.DIRECTORY_PICTURES);
        if (strM46668t.startsWith("image/")) {
            uriInsert = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
        } else {
            uriInsert = strM46668t.startsWith("video/") ? contentResolver.insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, contentValues) : contentResolver.insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, contentValues);
        }
        Objects.requireNonNull(uriInsert);
        return contentResolver.openOutputStream(uriInsert);
    }

    /* JADX INFO: renamed from: t */
    public static String m46668t(String str) {
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    /* JADX INFO: renamed from: u */
    public static void m46669u(String str) {
        boolean z10;
        String str2;
        String name = new File(str).getName();
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            OutputStream outputStreamM46667s = m46667s(name);
            byte[] bArr = new byte[8192];
            while (true) {
                int i10 = fileInputStream.read(bArr);
                if (i10 <= 0) {
                    break;
                } else {
                    outputStreamM46667s.write(bArr, 0, i10);
                }
            }
            fileInputStream.close();
            outputStreamM46667s.close();
            str2 = "";
            z10 = true;
        } catch (IOException e10) {
            C6124q.m27066k("DataModelJavaCallback", "saveImageToAlbum: Failed to save image with exception: \n" + e10);
            String message = e10.getMessage();
            z10 = false;
            str2 = message;
        }
        if (C11659h.m43403a().mo43417B5() && m46668t(name).equals("video/mp4")) {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
        }
        NativeGLInterface.nativeImageSavedToAlbumFinished(name, z10, str2);
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    /* JADX INFO: renamed from: c */
    public void mo15782c(int i10) {
        if (i10 == 3) {
            mo15227r().mo15260e();
        }
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    /* JADX INFO: renamed from: d */
    public void mo15783d() {
        InterfaceC12468w0 interfaceC12468w0Mo15227r = mo15227r();
        if (interfaceC12468w0Mo15227r != null) {
            interfaceC12468w0Mo15227r.mo15256a();
        }
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    /* JADX INFO: renamed from: g */
    public void mo15784g(String str) {
        InterfaceC12468w0 interfaceC12468w0Mo15227r = mo15227r();
        if (interfaceC12468w0Mo15227r != null) {
            interfaceC12468w0Mo15227r.mo15259d(str);
        }
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    /* JADX INFO: renamed from: h */
    public void mo15785h() {
        InterfaceC12468w0 interfaceC12468w0Mo15227r = mo15227r();
        if (interfaceC12468w0Mo15227r != null) {
            interfaceC12468w0Mo15227r.mo15258c();
        }
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    /* JADX INFO: renamed from: o */
    public void mo15787o(String str) {
        m46669u(str);
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    /* JADX INFO: renamed from: q */
    public void mo15788q(long j10, boolean z10, byte[] bArr, NativeTextBoxInfo nativeTextBoxInfo) {
        InterfaceC12468w0 interfaceC12468w0Mo15227r = mo15227r();
        if (interfaceC12468w0Mo15227r != null) {
            interfaceC12468w0Mo15227r.mo15257b(j10, z10, new String(bArr, Charset.forName("UTF-8")), nativeTextBoxInfo);
        }
    }

    /* JADX INFO: renamed from: r */
    public abstract InterfaceC12468w0 mo15227r();
}
