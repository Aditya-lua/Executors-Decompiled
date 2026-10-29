package dj;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import sg.t;

/* JADX INFO: loaded from: classes2.dex */
public class f extends dj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f14733a;

    public class a extends cj.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f14734a;

        public a(String str) {
            this.f14734a = str;
        }

        @Override // cj.a, android.database.AbstractCursor, android.database.Cursor
        public String[] getColumnNames() {
            return new String[]{"dev_rpc_ip_port_override"};
        }

        @Override // cj.a, android.database.AbstractCursor, android.database.Cursor
        public String getString(int i10) {
            return this.f14734a;
        }
    }

    public f(Context context) {
        this.f14733a = context;
    }

    @Override // dj.i
    public gh.a a(i.a aVar) {
        if (aVar == i.a.GET) {
            return gh.a.GetDevRpcIpAndPort;
        }
        return null;
    }

    @Override // dj.i
    public Cursor b(Uri uri) {
        return new a(t.b(this.f14733a));
    }
}
