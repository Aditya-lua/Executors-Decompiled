package uh;

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
    public static OutputStream t(String str) {
        File externalStoragePublicDirectory;
        Uri uriInsert;
        String strU = u(str);
        if (Build.VERSION.SDK_INT < 29) {
            if (strU.startsWith("image/")) {
                externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
            } else {
                externalStoragePublicDirectory = strU.startsWith("video/") ? Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES) : Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
            }
            return new FileOutputStream(new File(externalStoragePublicDirectory, str));
        }
        ContentResolver contentResolver = RobloxApplication.f().getContentResolver();
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str);
        contentValues.put("mime_type", strU);
        contentValues.put("relative_path", Environment.DIRECTORY_PICTURES);
        if (strU.startsWith("image/")) {
            uriInsert = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
        } else {
            uriInsert = strU.startsWith("video/") ? contentResolver.insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, contentValues) : contentResolver.insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, contentValues);
        }
        Objects.requireNonNull(uriInsert);
        return contentResolver.openOutputStream(uriInsert);
    }

    public static String u(String str) {
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    public static void v(String str) {
        boolean z10;
        String str2;
        String name = new File(str).getName();
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            OutputStream outputStreamT = t(name);
            byte[] bArr = new byte[8192];
            while (true) {
                int i10 = fileInputStream.read(bArr);
                if (i10 <= 0) {
                    break;
                } else {
                    outputStreamT.write(bArr, 0, i10);
                }
            }
            fileInputStream.close();
            outputStreamT.close();
            str2 = "";
            z10 = true;
        } catch (IOException e10) {
            ek.q.k("DataModelJavaCallback", "saveImageToAlbum: Failed to save image with exception: \n" + e10);
            String message = e10.getMessage();
            z10 = false;
            str2 = message;
        }
        if (rh.h.a().F5() && u(name).equals("video/mp4")) {
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
            s().e();
        }
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    public void d() {
        x0 x0VarS = s();
        if (x0VarS != null) {
            x0VarS.a();
        }
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    public void g(String str) {
        x0 x0VarS = s();
        if (x0VarS != null) {
            x0VarS.d(str);
        }
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    public void h() {
        x0 x0VarS = s();
        if (x0VarS != null) {
            x0VarS.c();
        }
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    public void p(String str) {
        v(str);
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    public void r(long j10, boolean z10, byte[] bArr, NativeTextBoxInfo nativeTextBoxInfo) {
        x0 x0VarS = s();
        if (x0VarS != null) {
            x0VarS.b(j10, z10, new String(bArr, Charset.forName("UTF-8")), nativeTextBoxInfo);
        }
    }

    public abstract x0 s();
}
