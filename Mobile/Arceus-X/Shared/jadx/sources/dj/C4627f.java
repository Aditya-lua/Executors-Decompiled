package dj;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import gh.EnumC6096a;
import p048cj.C1669a;
import sg.C11355t;

/* JADX INFO: renamed from: dj.f */
/* JADX INFO: loaded from: classes2.dex */
public class C4627f extends AbstractC4622a {

    /* JADX INFO: renamed from: a */
    public Context f18999a;

    /* JADX INFO: renamed from: dj.f$a */
    public class a extends C1669a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f19000a;

        public a(String str) {
            this.f19000a = str;
        }

        @Override // p048cj.C1669a, android.database.AbstractCursor, android.database.Cursor
        public String[] getColumnNames() {
            return new String[]{"dev_rpc_ip_port_override"};
        }

        @Override // p048cj.C1669a, android.database.AbstractCursor, android.database.Cursor
        public String getString(int i10) {
            return this.f19000a;
        }
    }

    public C4627f(Context context) {
        this.f18999a = context;
    }

    @Override // dj.InterfaceC4630i
    /* JADX INFO: renamed from: a */
    public EnumC6096a mo22845a(InterfaceC4630i.a aVar) {
        if (aVar == InterfaceC4630i.a.GET) {
            return EnumC6096a.GetDevRpcIpAndPort;
        }
        return null;
    }

    @Override // dj.InterfaceC4630i
    /* JADX INFO: renamed from: b */
    public Cursor mo22846b(Uri uri) {
        return new a(C11355t.m42526b(this.f18999a));
    }
}
