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
import java.lang.ref.WeakReference;
import java.util.HashMap;
import mm.C8595l;
import mm.InterfaceC8592i;
import mm.InterfaceC8593j;
import mm.InterfaceC8596m;
import org.json.JSONException;
import org.json.JSONObject;
import p088e.ActivityC4722p;
import p139g.AbstractC5854c;
import p139g.C5859h;
import p139g.InterfaceC5852a;
import p154h.C6253f;
import p274ll.InterfaceC8166f;

/* JADX INFO: loaded from: classes2.dex */
public class MediaPickerProtocol {

    /* JADX INFO: renamed from: f */
    public static final HashMap<String, C6253f.h> f12647f = new C3326a();

    /* JADX INFO: renamed from: a */
    public InterfaceC8596m f12648a;

    /* JADX INFO: renamed from: b */
    public String f12649b;

    /* JADX INFO: renamed from: c */
    public WeakReference<Activity> f12650c;

    /* JADX INFO: renamed from: d */
    public AbstractC5854c<C5859h> f12651d;

    /* JADX INFO: renamed from: e */
    public InterfaceC8166f f12652e;

    /* JADX INFO: renamed from: com.roblox.protocols.mediapicker.MediaPickerProtocol$a */
    public class C3326a extends HashMap<String, C6253f.h> {
        public C3326a() {
            put(MediaPickerProtocol.getAssetTypeImages(), C6253f.d.f23773a);
            put(MediaPickerProtocol.getAssetTypeVideos(), C6253f.g.f23774a);
        }
    }

    /* JADX INFO: renamed from: com.roblox.protocols.mediapicker.MediaPickerProtocol$b */
    public class C3327b implements InterfaceC8592i {
        public C3327b() {
        }

        @Override // mm.InterfaceC8592i
        /* JADX INFO: renamed from: a */
        public C8595l mo15880a(JSONObject jSONObject) {
            C8595l c8595l = new C8595l();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(MediaPickerProtocol.getAvailableParamName(), true);
                c8595l.f31556a = jSONObject2;
                return c8595l;
            } catch (JSONException e10) {
                Log.e("MediaPickerProtocol", "Indicating available on Android failed with error: " + e10.getMessage());
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: com.roblox.protocols.mediapicker.MediaPickerProtocol$c */
    public static class C3328c {

        /* JADX INFO: renamed from: a */
        public static final MediaPickerProtocol f12654a = new MediaPickerProtocol();
    }

    /* JADX INFO: renamed from: com.roblox.protocols.mediapicker.MediaPickerProtocol$d */
    public class C3329d implements InterfaceC8593j {
        public C3329d() {
        }

        @Override // mm.InterfaceC8593j
        /* JADX INFO: renamed from: a */
        public void mo15882a(JSONObject jSONObject, InterfaceC8596m interfaceC8596m) {
            MediaPickerProtocol.this.f12648a = interfaceC8596m;
            if (MediaPickerProtocol.this.f12650c == null || MediaPickerProtocol.this.f12650c.get() == null) {
                Log.e("MediaPickerProtocol", "No Activity found while checking permissions");
                return;
            }
            try {
                MediaPickerProtocol.this.f12649b = jSONObject.getString(MediaPickerProtocol.getAssetTypeParamName());
                if (!C6253f.m27462c()) {
                    MediaPickerProtocol.this.f12652e.mo1373a();
                } else {
                    Log.i("MediaPickerProtocol", "Permissions already granted for photo album");
                    MediaPickerProtocol.this.m15879n();
                }
            } catch (JSONException unused) {
                Log.e("MediaPickerProtocol", "Error parsing asset type.");
            }
        }
    }

    public MediaPickerProtocol() {
        MessageBus.m16016f().m16027q(getProtocolName(), getPickMediaId(), new C3329d());
        MessageBus.m16016f().m16026p(getProtocolName(), getIsAvailableId(), new C3327b());
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

    /* JADX INFO: renamed from: o */
    public static synchronized MediaPickerProtocol m15873o() {
        return C3328c.f12654a;
    }

    public static native void onMediaPickerResponse(long j10, byte[] bArr, String str);

    /* JADX INFO: renamed from: i */
    public final String m15874i(Uri uri) {
        Cursor cursorQuery;
        int columnIndex;
        WeakReference<Activity> weakReference = this.f12650c;
        String string = null;
        if (weakReference == null || weakReference.get() == null) {
            Log.e("MediaPickerProtocol", "No Activity found while checking permissions");
            return null;
        }
        Activity activity = this.f12650c.get();
        if (C6253f.m27462c()) {
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

    /* JADX INFO: renamed from: j */
    public void m15875j(Uri uri) {
        if (uri == null) {
            Log.d("MediaPickerProtocol", "No media selected");
            C8595l c8595l = new C8595l();
            c8595l.f31558c = 1;
            try {
                c8595l.f31556a.put(getAssetTypeParamName(), this.f12649b);
                c8595l.f31556a.put(getAssetFilePathParamName(), "");
                c8595l.f31556a.put(getErrorParamName(), "");
                c8595l.f31556a.put(getPermissionsParamName(), true);
            } catch (JSONException unused) {
                Log.e("MediaPickerProtocol", "Exception while writing response for pick media request");
            }
            this.f12648a.mo34618a(c8595l);
            return;
        }
        String strM15874i = m15874i(uri);
        Log.d("MediaPickerProtocol", "Selected file path: " + strM15874i);
        C8595l c8595l2 = new C8595l();
        try {
            c8595l2.f31556a.put(getAssetTypeParamName(), this.f12649b);
            c8595l2.f31556a.put(getAssetFilePathParamName(), strM15874i);
            c8595l2.f31556a.put(getErrorParamName(), "");
            c8595l2.f31556a.put(getPermissionsParamName(), true);
        } catch (JSONException unused2) {
            Log.e("MediaPickerProtocol", "Exception while handling pick media request");
        }
        this.f12648a.mo34618a(c8595l2);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m15876k(C6253f.h hVar) {
        this.f12651d.m26240b(new C5859h.a().m26279d(hVar).m26276a());
    }

    /* JADX INFO: renamed from: l */
    public void m15877l(ActivityC4722p activityC4722p) {
        this.f12650c = new WeakReference<>(activityC4722p);
        this.f12651d = activityC4722p.mo4671h(new C6253f(), new InterfaceC5852a() { // from class: ll.a
            @Override // p139g.InterfaceC5852a
            /* JADX INFO: renamed from: a */
            public final void mo4481a(Object obj) {
                this.f30332a.m15875j((Uri) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public void m15878m(ActivityC4722p activityC4722p, InterfaceC8166f interfaceC8166f) {
        this.f12650c = new WeakReference<>(activityC4722p);
        this.f12652e = interfaceC8166f;
        initializeMediaPickerProtocol();
    }

    /* JADX INFO: renamed from: n */
    public final void m15879n() {
        final C6253f.h hVar = f12647f.get(this.f12649b);
        if (hVar == null) {
            Log.e("MediaPickerProtocol", "Media Type must be either IMAGES or VIDEOS");
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: ll.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f30333a.m15876k(hVar);
                }
            });
        }
    }
}
