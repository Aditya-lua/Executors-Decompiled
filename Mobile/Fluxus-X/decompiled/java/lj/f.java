package lj;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import bh.t;

/* JADX INFO: loaded from: classes2.dex */
public class f extends lj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f22269a;

    public class a extends kj.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f22270a;

        public a(String str) {
            this.f22270a = str;
        }

        @Override // kj.a, android.database.AbstractCursor, android.database.Cursor
        public String[] getColumnNames() {
            return new String[]{"dev_rpc_ip_port_override"};
        }

        @Override // kj.a, android.database.AbstractCursor, android.database.Cursor
        public String getString(int i10) {
            return this.f22270a;
        }
    }

    public f(Context context) {
        this.f22269a = context;
    }

    @Override // lj.i
    public Cursor a(Uri uri) {
        return new a(t.b(this.f22269a));
    }

    @Override // lj.i
    public ph.a b(i.a aVar) {
        if (aVar == i.a.GET) {
            return ph.a.GetDevRpcIpAndPort;
        }
        return null;
    }
}
