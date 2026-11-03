package com.roblox.protocols.mediapicker;

import android.app.Activity;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.util.Log;
import com.roblox.universalapp.messagebus.MessageBus;
import e.p;
import g.h;
import h.f;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import km.i;
import km.j;
import km.l;
import km.m;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class MediaPickerProtocol {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final HashMap<String, f.h> f9783f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f9784a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WeakReference<Activity> f9785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g.c<h> f9786d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public jl.f f9787e;

    public class a extends HashMap<String, f.h> {
        public a() {
            put(MediaPickerProtocol.getAssetTypeImages(), f.d.f18973a);
            put(MediaPickerProtocol.getAssetTypeVideos(), f.g.f18974a);
        }
    }

    public class b implements i {
        public b() {
        }

        @Override // km.i
        public l a(JSONObject jSONObject) {
            l lVar = new l();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(MediaPickerProtocol.getAvailableParamName(), true);
                lVar.f22909a = jSONObject2;
                return lVar;
            } catch (JSONException e10) {
                Log.e("MediaPickerProtocol", "Indicating available on Android failed with error: " + e10.getMessage());
                return null;
            }
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MediaPickerProtocol f9789a = new MediaPickerProtocol();
    }

    public class d implements j {
        public d() {
        }

        @Override // km.j
        public void a(JSONObject jSONObject, m mVar) {
            MediaPickerProtocol.this.f9784a = mVar;
            if (MediaPickerProtocol.this.f9785c == null || MediaPickerProtocol.this.f9785c.get() == null) {
                Log.e("MediaPickerProtocol", "No Activity found while checking permissions");
                return;
            }
            try {
                MediaPickerProtocol.this.b = jSONObject.getString(MediaPickerProtocol.getAssetTypeParamName());
                if (!f.c()) {
                    MediaPickerProtocol.this.f9787e.a();
                } else {
                    Log.i("MediaPickerProtocol", "Permissions already granted for photo album");
                    MediaPickerProtocol.this.n();
                }
            } catch (JSONException unused) {
                Log.e("MediaPickerProtocol", "Error parsing asset type.");
            }
        }
    }

    public MediaPickerProtocol() {
        MessageBus.f().q(getProtocolName(), getPickMediaId(), new d());
        MessageBus.f().p(getProtocolName(), getIsAvailableId(), new b());
    }

    private static native String getAssetFilePathParamName();

    public static native String getAssetTypeImages();

    /* JADX INFO: Access modifiers changed from: private */
    public static native String getAssetTypeParamName();

    public static native String getAssetTypeVideos();

    /* JADX INFO: Access modifiers changed from: private */
    public static native String getAvailableParamName();

    private static native String getErrorParamName();

    private static native String getIsAvailableId();

    private static native String getPermissionsParamName();

    private static native String getPickMediaId();

    private static native String getProtocolName();

    public static native String getSourceTypeCamera();

    public static native void initializeMediaPickerProtocol();

    public static synchronized MediaPickerProtocol o() {
        return c.f9789a;
    }

    public static native void onMediaPickerResponse(long j10, byte[] bArr, String str);

    public final String i(Uri uri) {
        Cursor cursorQuery;
        int columnIndex;
        WeakReference<Activity> weakReference = this.f9785c;
        String string = null;
        if (weakReference == null || weakReference.get() == null) {
            Log.e("MediaPickerProtocol", "No Activity found while checking permissions");
            return null;
        }
        Activity activity = this.f9785c.get();
        if (f.c()) {
            cursorQuery = activity.getContentResolver().query(uri, null, null, null, null);
        } else {
            String[] strArrSplit = DocumentsContract.getDocumentId(uri).split(":");
            String str = strArrSplit[0];
            String str2 = strArrSplit[1];
            if ("image".equals(str)) {
                cursorQuery = activity.getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, null, "_id=?", new String[]{str2}, null);
            } else {
                cursorQuery = "video".equals(str) ? activity.getContentResolver().query(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, null, "_id=?", new String[]{str2}, null) : null;
            }
        }
        if (cursorQuery == null) {
            Log.e("MediaPickerProtocol", "Picked URI is invalid");
            return null;
        }
        if (cursorQuery.moveToFirst() && (columnIndex = cursorQuery.getColumnIndex("_data")) != -1) {
            string = cursorQuery.getString(columnIndex);
        }
        cursorQuery.close();
        return string;
    }

    public void j(Uri uri) {
        if (uri == null) {
            Log.d("MediaPickerProtocol", "No media selected");
            l lVar = new l();
            lVar.f22910c = 1;
            try {
                lVar.f22909a.put(getAssetTypeParamName(), this.b);
                lVar.f22909a.put(getAssetFilePathParamName(), "");
                lVar.f22909a.put(getErrorParamName(), "");
                lVar.f22909a.put(getPermissionsParamName(), true);
            } catch (JSONException unused) {
                Log.e("MediaPickerProtocol", "Exception while writing response for pick media request");
            }
            this.f9784a.a(lVar);
            return;
        }
        String strI = i(uri);
        Log.d("MediaPickerProtocol", "Selected file path: " + strI);
        l lVar2 = new l();
        try {
            lVar2.f22909a.put(getAssetTypeParamName(), this.b);
            lVar2.f22909a.put(getAssetFilePathParamName(), strI);
            lVar2.f22909a.put(getErrorParamName(), "");
            lVar2.f22909a.put(getPermissionsParamName(), true);
        } catch (JSONException unused2) {
            Log.e("MediaPickerProtocol", "Exception while handling pick media request");
        }
        this.f9784a.a(lVar2);
    }

    public final /* synthetic */ void k(f.h hVar) {
        this.f9786d.b(new h.a().d(hVar).a());
    }

    public void l(p pVar) {
        this.f9785c = new WeakReference<>(pVar);
        this.f9786d = pVar.h(new f(), new g.a() { // from class: jl.a
            @Override // g.a
            public final void a(Object obj) {
                this.f22015a.j((Uri) obj);
            }
        });
    }

    public void m(p pVar, jl.f fVar) {
        this.f9785c = new WeakReference<>(pVar);
        this.f9787e = fVar;
        initializeMediaPickerProtocol();
    }

    public final void n() {
        final f.h hVar = f9783f.get(this.b);
        if (hVar == null) {
            Log.e("MediaPickerProtocol", "Media Type must be either IMAGES or VIDEOS");
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: jl.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22016a.k(hVar);
                }
            });
        }
    }
}
