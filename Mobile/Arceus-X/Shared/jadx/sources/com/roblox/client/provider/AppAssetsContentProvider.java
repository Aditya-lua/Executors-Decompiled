package com.roblox.client.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.webkit.MimeTypeMap;
import com.roblox.client.personasdk.BuildConfig;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import p151gk.C6124q;
import th.C11659h;

/* JADX INFO: loaded from: classes2.dex */
public class AppAssetsContentProvider extends ContentProvider {

    /* JADX INFO: renamed from: b */
    public static final String[] f11964b = {"_display_name", "_size"};

    /* JADX INFO: renamed from: a */
    public final String f11965a = "AppAssetsContentProvider";

    /* JADX INFO: renamed from: a */
    public final boolean m15348a() {
        if (!C11659h.m43403a().mo43469J1()) {
            return true;
        }
        String callingPackage = getCallingPackage();
        if (callingPackage != null) {
            return callingPackage.startsWith(BuildConfig.APPLICATION_ID) || callingPackage.startsWith("com.tencent.roblox");
        }
        return false;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        C6124q.m27057b("AppAssetsContentProvider", "getType: " + uri.toString());
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(uri.toString()));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public AssetFileDescriptor openAssetFile(Uri uri, String str) throws FileNotFoundException {
        C6124q.m27057b("AppAssetsContentProvider", "openAssetFile: " + uri.toString());
        if (!m15348a()) {
            return null;
        }
        File file = new File(getContext().getFilesDir().getParentFile(), uri.getPath());
        try {
            if (!file.getCanonicalPath().startsWith(getContext().getFilesDir().getCanonicalPath())) {
                throw new SecurityException();
            }
            if (file.exists()) {
                return new AssetFileDescriptor(ParcelFileDescriptor.open(file, 268435456), 0L, -1L);
            }
            throw new FileNotFoundException();
        } catch (IOException unused) {
            throw new IllegalArgumentException();
        }
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i10;
        C6124q.m27057b("AppAssetsContentProvider", "query: " + uri.toString());
        if (!m15348a()) {
            return null;
        }
        if (strArr == null) {
            strArr = f11964b;
        }
        File file = new File(getContext().getFilesDir().getParentFile(), uri.getPath());
        long length = file.exists() ? file.length() : 0L;
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i11 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i11] = "_display_name";
                i10 = i11 + 1;
                objArr[i11] = uri.getLastPathSegment();
            } else {
                if ("_size".equals(str3)) {
                    strArr3[i11] = "_size";
                    i10 = i11 + 1;
                    objArr[i11] = Long.valueOf(length);
                }
            }
            i11 = i10;
        }
        MatrixCursor matrixCursor = new MatrixCursor(strArr3, 1);
        matrixCursor.addRow(objArr);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
