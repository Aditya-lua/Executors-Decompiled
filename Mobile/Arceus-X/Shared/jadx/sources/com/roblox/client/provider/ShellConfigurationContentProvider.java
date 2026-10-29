package com.roblox.client.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.roblox.client.personasdk.BuildConfig;
import dj.C4625d;
import dj.C4626e;
import dj.C4627f;
import dj.C4628g;
import dj.C4629h;
import dj.C4631j;
import dj.InterfaceC4630i;
import gh.C6098c;
import gh.EnumC6096a;
import java.util.Objects;
import p015ak.C0347x;
import p048cj.C1671c;
import p151gk.C6124q;
import p308nh.C9476b;
import sg.C11295a1;
import sg.C11347q0;
import th.C11657f;

/* JADX INFO: loaded from: classes2.dex */
public class ShellConfigurationContentProvider extends ContentProvider {

    /* JADX INFO: renamed from: b */
    public UriMatcher f11967b;

    /* JADX INFO: renamed from: d */
    public C6098c f11969d;

    /* JADX INFO: renamed from: e */
    public C6098c.a f11970e;

    /* JADX INFO: renamed from: a */
    public final String f11966a = "rbx.config";

    /* JADX INFO: renamed from: c */
    public SparseArray<InterfaceC4630i> f11968c = new SparseArray<>();

    /* JADX INFO: renamed from: a */
    public final boolean m15349a() {
        if (C9476b.m37333a()) {
            return true;
        }
        String callingPackage = getCallingPackage();
        if (callingPackage != null) {
            return callingPackage.startsWith(BuildConfig.APPLICATION_ID) || callingPackage.startsWith("com.tencent.roblox");
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public String m15350b(Context context) {
        return context.getPackageName() + context.getString(C11347q0.f39910E1);
    }

    /* JADX INFO: renamed from: c */
    public C6098c.a m15351c() {
        return this.f11970e;
    }

    /* JADX INFO: renamed from: d */
    public C6098c m15352d() {
        return this.f11969d;
    }

    @Override // android.content.ContentProvider
    public int delete(@NonNull Uri uri, String str, String[] strArr) {
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public final void m15353e(String str, InterfaceC4630i interfaceC4630i) {
        m15354f(str, interfaceC4630i, interfaceC4630i.mo22845a(InterfaceC4630i.a.GET));
        m15354f(str, interfaceC4630i, interfaceC4630i.mo22845a(InterfaceC4630i.a.POST));
    }

    /* JADX INFO: renamed from: f */
    public final void m15354f(String str, InterfaceC4630i interfaceC4630i, EnumC6096a enumC6096a) {
        if (enumC6096a != null) {
            this.f11967b.addURI(str, enumC6096a.f23428a, enumC6096a.f23429b);
            this.f11968c.put(enumC6096a.f23429b, interfaceC4630i);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m15355g() {
        this.f11967b = new UriMatcher(-1);
        String strM15350b = m15350b(getContext());
        m15353e(strM15350b, new C4628g());
        m15353e(strM15350b, new C4625d(this, getContext()));
        m15353e(strM15350b, new C4631j(getContext()));
        m15353e(strM15350b, new C4627f(getContext()));
        m15353e(strM15350b, new C4626e(this, getContext()));
        m15353e(strM15350b, new C4629h());
    }

    @Override // android.content.ContentProvider
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(@NonNull Uri uri, ContentValues contentValues) {
        if (!m15349a()) {
            return null;
        }
        C6124q.m27063h("rbx.config", "insert() called with uri: " + uri);
        InterfaceC4630i interfaceC4630i = this.f11968c.get(this.f11967b.match(uri));
        if (interfaceC4630i != null) {
            interfaceC4630i.mo22842c(uri, contentValues);
            return uri;
        }
        C6124q.m27066k("rbx.config", "No handler found for insert");
        return uri;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Context context = getContext();
        Objects.requireNonNull(context);
        Context applicationContext = context.getApplicationContext();
        C1671c c1671c = new C1671c(context);
        this.f11970e = c1671c;
        C6098c c6098c = c1671c.read();
        this.f11969d = c6098c;
        C11295a1.m42403K0(c6098c);
        C0347x.m1349m().m1355F(applicationContext);
        C11657f.f41211a.m43399p(C11295a1.m42422U(applicationContext));
        C0347x.m1349m().m1354E();
        m15355g();
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(@NonNull Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (!m15349a()) {
            return null;
        }
        C6124q.m27063h("rbx.config", "query() called with uri: " + uri);
        InterfaceC4630i interfaceC4630i = this.f11968c.get(this.f11967b.match(uri));
        if (interfaceC4630i != null) {
            return interfaceC4630i.mo22846b(uri);
        }
        C6124q.m27066k("rbx.config", "No handler found for query");
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
