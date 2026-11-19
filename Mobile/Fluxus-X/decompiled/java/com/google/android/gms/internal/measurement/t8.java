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
public final class t8 implements x8 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ConcurrentMap f6846i = new ConcurrentHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String[] f6847j = {"key", "value"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContentResolver f6848a;
    public final Uri b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f6849c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile Map f6853g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ContentObserver f6850d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f6851e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f6852f = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f6854h = new ArrayList();

    public t8(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        je.n.l(contentResolver);
        je.n.l(uri);
        this.f6848a = contentResolver;
        this.b = uri;
        this.f6849c = runnable;
    }

    public static t8 c(final ContentResolver contentResolver, final Uri uri, final Runnable runnable) {
        t8 t8Var = (t8) f6846i.computeIfAbsent(uri, new Function() { // from class: com.google.android.gms.internal.measurement.s8
            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                return t8.g(contentResolver, uri, runnable, (Uri) obj);
            }
        });
        try {
            if (!t8Var.f6851e) {
                return t8Var;
            }
            synchronized (t8Var) {
                try {
                    if (t8Var.f6851e) {
                        q8 q8Var = new q8(t8Var, null);
                        t8Var.f6848a.registerContentObserver(t8Var.b, false, q8Var);
                        t8Var.f6850d = q8Var;
                        t8Var.f6851e = false;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return t8Var;
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static void f() {
        Iterator it = f6846i.values().iterator();
        while (it.hasNext()) {
            t8 t8Var = (t8) it.next();
            synchronized (t8Var) {
                try {
                    if (t8Var.f6851e) {
                        t8Var.f6851e = false;
                    } else {
                        ContentObserver contentObserver = t8Var.f6850d;
                        if (contentObserver != null) {
                            t8Var.f6848a.unregisterContentObserver(contentObserver);
                            t8Var.f6850d = null;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            it.remove();
        }
    }

    public static /* synthetic */ t8 g(ContentResolver contentResolver, Uri uri, Runnable runnable, Uri uri2) {
        return new t8(contentResolver, uri, runnable);
    }

    @Override // com.google.android.gms.internal.measurement.x8
    public final /* bridge */ /* synthetic */ Object b(String str) {
        return (String) d().get(str);
    }

    public final Map d() {
        Map map;
        Map map2 = this.f6853g;
        if (map2 == null) {
            synchronized (this.f6852f) {
                map2 = this.f6853g;
                if (map2 == null) {
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            map = (Map) x8.a(new w8() { // from class: com.google.android.gms.internal.measurement.r8
                                @Override // com.google.android.gms.internal.measurement.w8
                                public final /* synthetic */ Object zza() {
                                    return this.f6806a.h();
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
                    this.f6853g = map;
                    map2 = map;
                }
            }
        }
        return map2 != null ? map2 : Collections.EMPTY_MAP;
    }

    public final void e() {
        synchronized (this.f6852f) {
            this.f6853g = null;
            this.f6849c.run();
        }
        synchronized (this) {
            try {
                Iterator it = this.f6854h.iterator();
                while (it.hasNext()) {
                    ((u8) it.next()).zza();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final /* synthetic */ Map h() {
        ContentResolver contentResolver = this.f6848a;
        Uri uri = this.b;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        try {
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                Log.w("ConfigurationContentLdr", "Unable to acquire ContentProviderClient, using default values");
                return Collections.EMPTY_MAP;
            }
            try {
                Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, f6847j, null, null, null);
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
