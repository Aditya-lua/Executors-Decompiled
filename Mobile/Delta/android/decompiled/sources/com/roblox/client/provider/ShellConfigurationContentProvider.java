package com.roblox.client.provider;

import ak.x;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.roblox.client.personasdk.BuildConfig;
import dj.d;
import dj.e;
import dj.f;
import dj.g;
import dj.h;
import dj.i;
import dj.j;
import gh.a;
import gh.c;
import gk.p;
import java.util.Objects;
import nh.b;
import sg.a1;
import sg.q0;

/* JADX INFO: loaded from: classes2.dex */
public class ShellConfigurationContentProvider extends ContentProvider {
    public UriMatcher b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f9180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c.a f9181e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9178a = "rbx.config";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SparseArray<i> f9179c = new SparseArray<>();

    public final boolean a() {
        if (b.a()) {
            return true;
        }
        String callingPackage = getCallingPackage();
        if (callingPackage != null) {
            return callingPackage.startsWith(BuildConfig.APPLICATION_ID) || callingPackage.startsWith("com.tencent.roblox");
        }
        return false;
    }

    public String b(Context context) {
        return context.getPackageName() + context.getString(q0.E1);
    }

    public c.a c() {
        return this.f9181e;
    }

    public c d() {
        return this.f9180d;
    }

    @Override // android.content.ContentProvider
    public int delete(@NonNull Uri uri, String str, String[] strArr) {
        return 0;
    }

    public final void e(String str, i iVar) {
        f(str, iVar, iVar.a(i.a.GET));
        f(str, iVar, iVar.a(i.a.POST));
    }

    public final void f(String str, i iVar, a aVar) {
        if (aVar != null) {
            this.b.addURI(str, aVar.f18218a, aVar.b);
            this.f9179c.put(aVar.b, iVar);
        }
    }

    public final void g() {
        this.b = new UriMatcher(-1);
        String strB = b(getContext());
        e(strB, new g());
        e(strB, new d(this, getContext()));
        e(strB, new j(getContext()));
        e(strB, new f(getContext()));
        e(strB, new e(this, getContext()));
        e(strB, new h());
    }

    @Override // android.content.ContentProvider
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(@NonNull Uri uri, ContentValues contentValues) {
        if (!a()) {
            return null;
        }
        p.h("rbx.config", "insert() called with uri: " + uri);
        i iVar = this.f9179c.get(this.b.match(uri));
        if (iVar != null) {
            iVar.c(uri, contentValues);
            return uri;
        }
        p.k("rbx.config", "No handler found for insert");
        return uri;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Context context = getContext();
        Objects.requireNonNull(context);
        Context applicationContext = context.getApplicationContext();
        cj.c cVar = new cj.c(context);
        this.f9181e = cVar;
        c cVar2 = cVar.read();
        this.f9180d = cVar2;
        a1.K0(cVar2);
        x.m().F(applicationContext);
        th.f.f31815a.p(a1.U(applicationContext));
        x.m().E();
        g();
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(@NonNull Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (!a()) {
            return null;
        }
        p.h("rbx.config", "query() called with uri: " + uri);
        i iVar = this.f9179c.get(this.b.match(uri));
        if (iVar != null) {
            return iVar.b(uri);
        }
        p.k("rbx.config", "No handler found for query");
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
