package com.roblox.client.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import bj.d;
import bj.e;
import bj.f;
import bj.g;
import bj.h;
import bj.i;
import bj.j;
import com.roblox.client.personasdk.BuildConfig;
import ek.q;
import fh.a;
import fh.c;
import java.util.Objects;
import mh.b;
import rg.a1;
import rg.q0;
import yj.x;

/* JADX INFO: loaded from: classes2.dex */
public class ShellConfigurationContentProvider extends ContentProvider {
    public UriMatcher b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f9253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c.a f9254e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9251a = "rbx.config";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SparseArray<i> f9252c = new SparseArray<>();

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
        return this.f9254e;
    }

    public c d() {
        return this.f9253d;
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
            this.b.addURI(str, aVar.f17277a, aVar.b);
            this.f9252c.put(aVar.b, iVar);
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
        i iVar = this.f9252c.get(this.b.match(uri));
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
        aj.c cVar = new aj.c(context);
        this.f9254e = cVar;
        c cVar2 = cVar.read();
        this.f9253d = cVar2;
        a1.L0(cVar2);
        x.m().F(applicationContext);
        rh.f.f30722a.p(a1.U(applicationContext));
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
        i iVar = this.f9252c.get(this.b.match(uri));
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
