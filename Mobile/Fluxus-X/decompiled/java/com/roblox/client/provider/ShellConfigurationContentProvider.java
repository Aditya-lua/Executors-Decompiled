package com.roblox.client.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import bh.a1;
import bh.q0;
import ik.x;
import java.util.Objects;
import lj.d;
import lj.e;
import lj.f;
import lj.g;
import lj.h;
import lj.i;
import lj.j;
import ok.q;
import ph.a;
import ph.c;
import wh.b;

/* JADX INFO: loaded from: classes2.dex */
public class ShellConfigurationContentProvider extends ContentProvider {
    public UriMatcher b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f9070d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c.a f9071e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9068a = "rbx.config";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SparseArray<i> f9069c = new SparseArray<>();

    public final boolean a() {
        if (b.a()) {
            return true;
        }
        String callingPackage = getCallingPackage();
        if (callingPackage != null) {
            return callingPackage.startsWith("com.roblox.client") || callingPackage.startsWith("com.tencent.roblox");
        }
        return false;
    }

    public String b(Context context) {
        return context.getPackageName() + context.getString(q0.O1);
    }

    public c.a c() {
        return this.f9071e;
    }

    public c d() {
        return this.f9070d;
    }

    @Override // android.content.ContentProvider
    public int delete(@NonNull Uri uri, String str, String[] strArr) {
        return 0;
    }

    public final void e(String str, i iVar) {
        f(str, iVar, iVar.b(i.a.GET));
        f(str, iVar, iVar.b(i.a.POST));
    }

    public final void f(String str, i iVar, a aVar) {
        if (aVar != null) {
            this.b.addURI(str, aVar.f29163a, aVar.b);
            this.f9069c.put(aVar.b, iVar);
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
        q.h("rbx.config", "insert() called with uri: " + uri);
        i iVar = this.f9069c.get(this.b.match(uri));
        if (iVar != null) {
            iVar.c(uri, contentValues);
            return uri;
        }
        q.k("rbx.config", "No handler found for insert");
        return uri;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Context context = getContext();
        Objects.requireNonNull(context);
        Context applicationContext = context.getApplicationContext();
        kj.c cVar = new kj.c(context);
        this.f9071e = cVar;
        c cVar2 = cVar.read();
        this.f9070d = cVar2;
        a1.L0(cVar2);
        x.m().F(applicationContext);
        bi.f.f4423a.p(a1.U(applicationContext));
        x.m().E();
        g();
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(@NonNull Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (!a()) {
            return null;
        }
        q.h("rbx.config", "query() called with uri: " + uri);
        i iVar = this.f9069c.get(this.b.match(uri));
        if (iVar != null) {
            return iVar.a(uri);
        }
        q.k("rbx.config", "No handler found for query");
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
