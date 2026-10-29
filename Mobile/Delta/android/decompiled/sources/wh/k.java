package wh;

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

/* JADX INFO: loaded from: classes2.dex */
public abstract class k extends EngineJavaCallback2 {
    public static OutputStream s(String str) {
        File externalStoragePublicDirectory;
        Uri uriInsert;
        String strT = t(str);
        if (Build.VERSION.SDK_INT < 29) {
            if (strT.startsWith("image/")) {
                externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
            } else {
                externalStoragePublicDirectory = strT.startsWith("video/") ? Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES) : Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
            }
            return new FileOutputStream(new File(externalStoragePublicDirectory, str));
        }
        ContentResolver contentResolver = RobloxApplication.f().getContentResolver();
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str);
        contentValues.put("mime_type", strT);
        contentValues.put("relative_path", Environment.DIRECTORY_PICTURES);
        if (strT.startsWith("image/")) {
            uriInsert = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
        } else {
            uriInsert = strT.startsWith("video/") ? contentResolver.insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, contentValues) : contentResolver.insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, contentValues);
        }
        Objects.requireNonNull(uriInsert);
        return contentResolver.openOutputStream(uriInsert);
    }

    public static String t(String str) {
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    public static void u(String str) {
        boolean z10;
        String str2;
        String name = new File(str).getName();
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            OutputStream outputStreamS = s(name);
            byte[] bArr = new byte[8192];
            while (true) {
                int i10 = fileInputStream.read(bArr);
                if (i10 <= 0) {
                    break;
                } else {
                    outputStreamS.write(bArr, 0, i10);
                }
            }
            fileInputStream.close();
            outputStreamS.close();
            str2 = "";
            z10 = true;
        } catch (IOException e10) {
            gk.p.k("DataModelJavaCallback", "saveImageToAlbum: Failed to save image with exception: \n" + e10);
            String message = e10.getMessage();
            z10 = false;
            str2 = message;
        }
        if (th.h.a().v5() && t(name).equals("video/mp4")) {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
        }
        NativeGLInterface.nativeImageSavedToAlbumFinished(name, z10, str2);
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    public void c(int i10) {
        if (i10 == 3) {
            r().e();
        }
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    public void d() {
        w0 w0VarR = r();
        if (w0VarR != null) {
            w0VarR.a();
        }
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    public void g(String str) {
        w0 w0VarR = r();
        if (w0VarR != null) {
            w0VarR.d(str);
        }
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    public void h() {
        w0 w0VarR = r();
        if (w0VarR != null) {
            w0VarR.c();
        }
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    public void o(String str) {
        u(str);
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    public void q(long j10, boolean z10, byte[] bArr, NativeTextBoxInfo nativeTextBoxInfo) {
        w0 w0VarR = r();
        if (w0VarR != null) {
            w0VarR.b(j10, z10, new String(bArr, Charset.forName("UTF-8")), nativeTextBoxInfo);
        }
    }

    public abstract w0 r();
}
