package com.roblox.protocols.mediapicker;

import android.app.Activity;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.util.Log;
import com.github.luben.zstd.BuildConfig;
import com.roblox.universalapp.messagebus.MessageBus;
import com.roblox.universalapp.messagebus.RequestHandler;
import com.roblox.universalapp.messagebus.RequestHandlerAsync;
import com.roblox.universalapp.messagebus.Response;
import com.roblox.universalapp.messagebus.ResponseCallback;
import e.p;
import g.j;
import h.f;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class MediaPickerProtocol {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final HashMap<String, f.h> f9722f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ResponseCallback f9723a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WeakReference<Activity> f9724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g.d<j> f9725d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public zl.f f9726e;

    public class a extends HashMap<String, f.h> {
        public a() {
            put(MediaPickerProtocol.getAssetTypeImages(), f.d.f18001a);
            put(MediaPickerProtocol.getAssetTypeVideos(), f.g.f18002a);
        }
    }

    public class b implements RequestHandler {
        public b() {
        }

        @Override // com.roblox.universalapp.messagebus.RequestHandler
        public Response run(JSONObject jSONObject) {
            Response response = new Response();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(MediaPickerProtocol.getAvailableParamName(), true);
                response.params = jSONObject2;
                return response;
            } catch (JSONException e10) {
                Log.e("MediaPickerProtocol", "Indicating available on Android failed with error: " + e10.getMessage());
                return null;
            }
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MediaPickerProtocol f9728a = new MediaPickerProtocol();
    }

    public class d implements RequestHandlerAsync {
        public d() {
        }

        @Override // com.roblox.universalapp.messagebus.RequestHandlerAsync
        public void run(JSONObject jSONObject, ResponseCallback responseCallback) {
            MediaPickerProtocol.this.f9723a = responseCallback;
            if (MediaPickerProtocol.this.f9724c == null || MediaPickerProtocol.this.f9724c.get() == null) {
                Log.e("MediaPickerProtocol", "No Activity found while checking permissions");
                return;
            }
            try {
                MediaPickerProtocol.this.b = jSONObject.getString(MediaPickerProtocol.getAssetTypeParamName());
                if (!f.c()) {
                    MediaPickerProtocol.this.f9726e.a();
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
        MessageBus.getInstance().setRequestHandler(getProtocolName(), getPickMediaId(), new d());
        MessageBus.getInstance().setRequestHandler(getProtocolName(), getIsAvailableId(), new b());
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
        return c.f9728a;
    }

    public static native void onMediaPickerResponse(long j10, byte[] bArr, String str);

    public final String i(Uri uri) {
        Cursor cursorQuery;
        int columnIndex;
        WeakReference<Activity> weakReference = this.f9724c;
        String string = null;
        if (weakReference == null || weakReference.get() == null) {
            Log.e("MediaPickerProtocol", "No Activity found while checking permissions");
            return null;
        }
        Activity activity = this.f9724c.get();
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
            Response response = new Response();
            response.telemetryResponseCode = 1;
            try {
                response.params.put(getAssetTypeParamName(), this.b);
                response.params.put(getAssetFilePathParamName(), BuildConfig.FLAVOR);
                response.params.put(getErrorParamName(), BuildConfig.FLAVOR);
                response.params.put(getPermissionsParamName(), true);
            } catch (JSONException unused) {
                Log.e("MediaPickerProtocol", "Exception while writing response for pick media request");
            }
            this.f9723a.run(response);
            return;
        }
        String strI = i(uri);
        Log.d("MediaPickerProtocol", "Selected file path: " + strI);
        Response response2 = new Response();
        try {
            response2.params.put(getAssetTypeParamName(), this.b);
            response2.params.put(getAssetFilePathParamName(), strI);
            response2.params.put(getErrorParamName(), BuildConfig.FLAVOR);
            response2.params.put(getPermissionsParamName(), true);
        } catch (JSONException unused2) {
            Log.e("MediaPickerProtocol", "Exception while handling pick media request");
        }
        this.f9723a.run(response2);
    }

    public final /* synthetic */ void k(f.h hVar) {
        this.f9725d.b(new j.a().d(hVar).a());
    }

    public void l(p pVar) {
        this.f9724c = new WeakReference<>(pVar);
        this.f9725d = pVar.h(new f(), new g.b() { // from class: zl.a
            @Override // g.b
            public final void a(Object obj) {
                this.f39324a.j((Uri) obj);
            }
        });
    }

    public void m(p pVar, zl.f fVar) {
        this.f9724c = new WeakReference<>(pVar);
        this.f9726e = fVar;
        initializeMediaPickerProtocol();
    }

    public final void n() {
        final f.h hVar = f9722f.get(this.b);
        if (hVar == null) {
            Log.e("MediaPickerProtocol", "Media Type must be either IMAGES or VIDEOS");
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: zl.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f39325a.k(hVar);
                }
            });
        }
    }
}
