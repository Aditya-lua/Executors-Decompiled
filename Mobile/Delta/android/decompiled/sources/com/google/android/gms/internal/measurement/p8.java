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

/* JADX INFO: loaded from: classes.dex */
public final class p8 implements t8 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ConcurrentMap f6726i = new ConcurrentHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String[] f6727j = {"key", "value"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContentResolver f6728a;
    public final Uri b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f6729c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile Map f6733g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ContentObserver f6730d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f6731e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f6732f = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f6734h = new ArrayList();

    public p8(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        ge.n.l(contentResolver);
        ge.n.l(uri);
        this.f6728a = contentResolver;
        this.b = uri;
        this.f6729c = runnable;
    }

    public static p8 c(final ContentResolver contentResolver, final Uri uri, final Runnable runnable) {
        p8 p8Var = (p8) f6726i.computeIfAbsent(uri, new Function() { // from class: com.google.android.gms.internal.measurement.o8
            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                return p8.g(contentResolver, uri, runnable, (Uri) obj);
            }
        });
        try {
            if (!p8Var.f6731e) {
                return p8Var;
            }
            synchronized (p8Var) {
                try {
                    if (p8Var.f6731e) {
                        m8 m8Var = new m8(p8Var, null);
                        p8Var.f6728a.registerContentObserver(p8Var.b, false, m8Var);
                        p8Var.f6730d = m8Var;
                        p8Var.f6731e = false;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return p8Var;
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static void f() {
        Iterator it = f6726i.values().iterator();
        while (it.hasNext()) {
            p8 p8Var = (p8) it.next();
            synchronized (p8Var) {
                try {
                    if (p8Var.f6731e) {
                        p8Var.f6731e = false;
                    } else {
                        ContentObserver contentObserver = p8Var.f6730d;
                        if (contentObserver != null) {
                            p8Var.f6728a.unregisterContentObserver(contentObserver);
                            p8Var.f6730d = null;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            it.remove();
        }
    }

    public static /* synthetic */ p8 g(ContentResolver contentResolver, Uri uri, Runnable runnable, Uri uri2) {
        return new p8(contentResolver, uri, runnable);
    }

    @Override // com.google.android.gms.internal.measurement.t8
    public final /* bridge */ /* synthetic */ Object b(String str) {
        return (String) d().get(str);
    }

    public final Map d() {
        Map map;
        Map map2 = this.f6733g;
        if (map2 == null) {
            synchronized (this.f6732f) {
                map2 = this.f6733g;
                if (map2 == null) {
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            map = (Map) t8.a(new s8() { // from class: com.google.android.gms.internal.measurement.n8
                                @Override // com.google.android.gms.internal.measurement.s8
                                public final /* synthetic */ Object zza() {
                                    return this.f6683a.h();
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
                    this.f6733g = map;
                    map2 = map;
                }
            }
        }
        return map2 != null ? map2 : Collections.EMPTY_MAP;
    }

    public final void e() {
        synchronized (this.f6732f) {
            this.f6733g = null;
            this.f6729c.run();
        }
        synchronized (this) {
            try {
                Iterator it = this.f6734h.iterator();
                while (it.hasNext()) {
                    ((q8) it.next()).zza();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final /* synthetic */ Map h() {
        ContentResolver contentResolver = this.f6728a;
        Uri uri = this.b;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        try {
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                Log.w("ConfigurationContentLdr", "Unable to acquire ContentProviderClient, using default values");
                return Collections.EMPTY_MAP;
            }
            try {
                Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, f6727j, null, null, null);
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
                    Map aVar = count <= 256 ? new w1.a(count) : new HashMap(count, 1.0f);
                    while (cursorQuery.moveToNext()) {
                        aVar.put(cursorQuery.getString(0), cursorQuery.getString(1));
                    }
                    if (cursorQuery.isAfterLast()) {
                        cursorQuery.close();
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        return aVar;
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
