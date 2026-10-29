package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class j8 implements f8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f6557a = new AtomicBoolean();
    public HashMap b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f6558c = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f6559d = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f6560e = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f6561f = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f6562g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f6563h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String[] f6564i = new String[0];

    @Override // com.google.android.gms.internal.measurement.f8
    public final String a(ContentResolver contentResolver, String str, String str2) {
        String string;
        if (contentResolver == null) {
            throw new IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
        }
        synchronized (this) {
            try {
                String str3 = null;
                if (this.b == null) {
                    this.f6557a.set(false);
                    this.b = new HashMap(16, 1.0f);
                    this.f6562g = new Object();
                    contentResolver.registerContentObserver(e8.f6426a, true, new h8(this, null));
                } else if (this.f6557a.getAndSet(false)) {
                    this.b.clear();
                    this.f6558c.clear();
                    this.f6559d.clear();
                    this.f6560e.clear();
                    this.f6561f.clear();
                    this.f6562g = new Object();
                    this.f6563h = false;
                }
                Object obj = this.f6562g;
                if (this.b.containsKey(str)) {
                    String str4 = (String) this.b.get(str);
                    if (str4 != null) {
                        str3 = str4;
                    }
                    return str3;
                }
                try {
                    Uri uri = e8.f6426a;
                    ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
                    try {
                        if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                            throw new i8("Unable to acquire ContentProviderClient");
                        }
                        try {
                            Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, null, new String[]{str}, null);
                            try {
                                if (cursorQuery == null) {
                                    throw new i8("ContentProvider query returned null cursor");
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
                                        if (obj == this.f6562g) {
                                            this.b.put(str, string);
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
                            throw new i8("ContentProvider query failed", e10);
                        }
                    } catch (Throwable th5) {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        throw th5;
                    }
                } catch (i8 unused) {
                    return null;
                }
            } catch (Throwable th6) {
                throw th6;
            }
        }
    }

    public final /* synthetic */ AtomicBoolean b() {
        return this.f6557a;
    }
}
