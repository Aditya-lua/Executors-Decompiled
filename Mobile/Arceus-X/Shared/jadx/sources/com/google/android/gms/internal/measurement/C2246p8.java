package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;
import p169he.C6384n;
import p504w1.C12277a;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.p8 */
/* JADX INFO: loaded from: classes.dex */
public final class C2246p8 implements InterfaceC2318t8 {

    /* JADX INFO: renamed from: i */
    public static final ConcurrentMap f8559i = new ConcurrentHashMap();

    /* JADX INFO: renamed from: j */
    public static final String[] f8560j = {"key", "value"};

    /* JADX INFO: renamed from: a */
    public final ContentResolver f8561a;

    /* JADX INFO: renamed from: b */
    public final Uri f8562b;

    /* JADX INFO: renamed from: c */
    public final Runnable f8563c;

    /* JADX INFO: renamed from: g */
    public volatile Map f8567g;

    /* JADX INFO: renamed from: d */
    public ContentObserver f8564d = null;

    /* JADX INFO: renamed from: e */
    public volatile boolean f8565e = true;

    /* JADX INFO: renamed from: f */
    public final Object f8566f = new Object();

    /* JADX INFO: renamed from: h */
    public final List f8568h = new ArrayList();

    public C2246p8(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        C6384n.m27928l(contentResolver);
        C6384n.m27928l(uri);
        this.f8561a = contentResolver;
        this.f8562b = uri;
        this.f8563c = runnable;
    }

    /* JADX INFO: renamed from: c */
    public static C2246p8 m10529c(final ContentResolver contentResolver, final Uri uri, final Runnable runnable) {
        C2246p8 c2246p8 = (C2246p8) f8559i.computeIfAbsent(uri, new Function() { // from class: com.google.android.gms.internal.measurement.o8
            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                return C2246p8.m10531g(contentResolver, uri, runnable, (Uri) obj);
            }
        });
        try {
            if (!c2246p8.f8565e) {
                return c2246p8;
            }
            synchronized (c2246p8) {
                try {
                    if (c2246p8.f8565e) {
                        C2192m8 c2192m8 = new C2192m8(c2246p8, null);
                        c2246p8.f8561a.registerContentObserver(c2246p8.f8562b, false, c2192m8);
                        c2246p8.f8564d = c2192m8;
                        c2246p8.f8565e = false;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return c2246p8;
        } catch (SecurityException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m10530f() {
        Iterator it = f8559i.values().iterator();
        while (it.hasNext()) {
            C2246p8 c2246p8 = (C2246p8) it.next();
            synchronized (c2246p8) {
                try {
                    if (c2246p8.f8565e) {
                        c2246p8.f8565e = false;
                    } else {
                        ContentObserver contentObserver = c2246p8.f8564d;
                        if (contentObserver != null) {
                            c2246p8.f8561a.unregisterContentObserver(contentObserver);
                            c2246p8.f8564d = null;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            it.remove();
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r0v0 android.content.ContentResolver), (r1v0 android.net.Uri), (r2v0 java.lang.Runnable) A[MD:(android.content.ContentResolver, android.net.Uri, java.lang.Runnable):void (m)] call: com.google.android.gms.internal.measurement.p8.<init>(android.content.ContentResolver, android.net.Uri, java.lang.Runnable):void type: CONSTRUCTOR */
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ C2246p8 m10531g(ContentResolver contentResolver, Uri uri, Runnable runnable, Uri uri2) {
        return new C2246p8(contentResolver, uri, runnable);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2318t8
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo10430b(String str) {
        return (String) m10532d().get(str);
    }

    /* JADX INFO: renamed from: d */
    public final Map m10532d() {
        Map map;
        Map map2 = this.f8567g;
        if (map2 == null) {
            synchronized (this.f8566f) {
                map2 = this.f8567g;
                if (map2 == null) {
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            map = (Map) InterfaceC2318t8.m10767a(new InterfaceC2300s8() { // from class: com.google.android.gms.internal.measurement.n8
                                @Override // com.google.android.gms.internal.measurement.InterfaceC2300s8
                                public final /* synthetic */ Object zza() {
                                    return this.f8508a.m10534h();
                                }
                            });
                        } catch (Throwable th2) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th2;
                        }
                    } catch (SQLiteException | IllegalStateException | SecurityException e10) {
                        Log.w("ConfigurationContentLdr", "Unable to query ContentProvider, using default values", e10);
                        map = Collections.EMPTY_MAP;
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    this.f8567g = map;
                    map2 = map;
                }
            }
        }
        return map2 != null ? map2 : Collections.EMPTY_MAP;
    }

    /* JADX INFO: renamed from: e */
    public final void m10533e() {
        synchronized (this.f8566f) {
            this.f8567g = null;
            this.f8563c.run();
        }
        synchronized (this) {
            try {
                Iterator it = this.f8568h.iterator();
                while (it.hasNext()) {
                    ((InterfaceC2264q8) it.next()).zza();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Map m10534h() {
        ContentResolver contentResolver = this.f8561a;
        Uri uri = this.f8562b;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        try {
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                Log.w("ConfigurationContentLdr", "Unable to acquire ContentProviderClient, using default values");
                return Collections.EMPTY_MAP;
            }
            try {
                Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, f8560j, null, null, null);
                try {
                    if (cursorQuery == null) {
                        Log.w("ConfigurationContentLdr", "ContentProvider query returned null cursor, using default values");
                        Map map = Collections.EMPTY_MAP;
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        return map;
                    }
                    int count = cursorQuery.getCount();
                    if (count == 0) {
                        Map map2 = Collections.EMPTY_MAP;
                        cursorQuery.close();
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        return map2;
                    }
                    Map c12277a = count <= 256 ? new C12277a(count) : new HashMap(count, 1.0f);
                    while (cursorQuery.moveToNext()) {
                        c12277a.put(cursorQuery.getString(0), cursorQuery.getString(1));
                    }
                    if (cursorQuery.isAfterLast()) {
                        cursorQuery.close();
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        return c12277a;
                    }
                    Log.w("ConfigurationContentLdr", "Cursor read incomplete (ContentProvider dead?), using default values");
                    Map map3 = Collections.EMPTY_MAP;
                    cursorQuery.close();
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    return map3;
                } catch (Throwable th2) {
                    if (cursorQuery == null) {
                        throw th2;
                    }
                    try {
                        cursorQuery.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            } catch (RemoteException e10) {
                Log.w("ConfigurationContentLdr", "ContentProvider query failed, using default values", e10);
                Map map4 = Collections.EMPTY_MAP;
                contentProviderClientAcquireUnstableContentProviderClient.release();
                return map4;
            }
        } catch (Throwable th4) {
            contentProviderClientAcquireUnstableContentProviderClient.release();
            throw th4;
        }
    }
}
