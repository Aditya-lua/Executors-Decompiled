package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.j8 */
/* JADX INFO: loaded from: classes.dex */
public final class C2138j8 implements InterfaceC2064f8 {

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f8341a = new AtomicBoolean();

    /* JADX INFO: renamed from: b */
    public HashMap f8342b = null;

    /* JADX INFO: renamed from: c */
    public final HashMap f8343c = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: d */
    public final HashMap f8344d = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: e */
    public final HashMap f8345e = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: f */
    public final HashMap f8346f = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: g */
    public Object f8347g = null;

    /* JADX INFO: renamed from: h */
    public boolean f8348h = false;

    /* JADX INFO: renamed from: i */
    public final String[] f8349i = new String[0];

    @Override // com.google.android.gms.internal.measurement.InterfaceC2064f8
    /* JADX INFO: renamed from: a */
    public final String mo10007a(ContentResolver contentResolver, String str, String str2) {
        String string;
        if (contentResolver == null) {
            throw new IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
        }
        synchronized (this) {
            try {
                String str3 = null;
                if (this.f8342b == null) {
                    this.f8341a.set(false);
                    this.f8342b = new HashMap(16, 1.0f);
                    this.f8347g = new Object();
                    contentResolver.registerContentObserver(C2045e8.f8159a, true, new C2102h8(this, null));
                } else if (this.f8341a.getAndSet(false)) {
                    this.f8342b.clear();
                    this.f8343c.clear();
                    this.f8344d.clear();
                    this.f8345e.clear();
                    this.f8346f.clear();
                    this.f8347g = new Object();
                    this.f8348h = false;
                }
                Object obj = this.f8347g;
                if (this.f8342b.containsKey(str)) {
                    String str4 = (String) this.f8342b.get(str);
                    if (str4 != null) {
                        str3 = str4;
                    }
                    return str3;
                }
                try {
                    Uri uri = C2045e8.f8159a;
                    ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
                    try {
                        if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                            throw new C2121i8("Unable to acquire ContentProviderClient");
                        }
                        try {
                            Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, null, new String[]{str}, null);
                            try {
                                if (cursorQuery == null) {
                                    throw new C2121i8("ContentProvider query returned null cursor");
                                }
                                if (cursorQuery.moveToFirst()) {
                                    string = cursorQuery.getString(1);
                                    cursorQuery.close();
                                    contentProviderClientAcquireUnstableContentProviderClient.release();
                                } else {
                                    cursorQuery.close();
                                    contentProviderClientAcquireUnstableContentProviderClient.release();
                                    string = null;
                                }
                                if (string != null && string.equals(null)) {
                                    string = null;
                                }
                                synchronized (this) {
                                    try {
                                        if (obj == this.f8347g) {
                                            this.f8342b.put(str, string);
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                                if (string != null) {
                                    return string;
                                }
                                return null;
                            } catch (Throwable th3) {
                                if (cursorQuery == null) {
                                    throw th3;
                                }
                                try {
                                    cursorQuery.close();
                                    throw th3;
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                    throw th3;
                                }
                            }
                        } catch (RemoteException e10) {
                            throw new C2121i8("ContentProvider query failed", e10);
                        }
                    } catch (Throwable th5) {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        throw th5;
                    }
                } catch (C2121i8 unused) {
                    return null;
                }
            } catch (Throwable th6) {
                throw th6;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AtomicBoolean m10300b() {
        return this.f8341a;
    }
}
