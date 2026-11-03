package bj;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import rg.t;

/* JADX INFO: loaded from: classes2.dex */
public class f extends bj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f4325a;

    public class a extends aj.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f4326a;

        public a(String str) {
            this.f4326a = str;
        }

        @Override // aj.a, android.database.AbstractCursor, android.database.Cursor
        public String[] getColumnNames() {
            return new String[]{"dev_rpc_ip_port_override"};
        }

        @Override // aj.a, android.database.AbstractCursor, android.database.Cursor
        public String getString(int i10) {
            return this.f4326a;
        }
    }

    public f(Context context) {
        this.f4325a = context;
    }

    @Override // bj.i
    public Cursor a(Uri uri) {
        return new a(t.b(this.f4325a));
    }

    @Override // bj.i
    public fh.a b(i.a aVar) {
        if (aVar == i.a.GET) {
            return fh.a.GetDevRpcIpAndPort;
        }
        return null;
    }
}
