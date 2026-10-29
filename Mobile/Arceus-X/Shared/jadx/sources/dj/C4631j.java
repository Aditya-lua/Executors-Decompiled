package dj;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import gh.EnumC6096a;
import p048cj.C1669a;
import sg.C11295a1;

/* JADX INFO: renamed from: dj.j */
/* JADX INFO: loaded from: classes2.dex */
public class C4631j extends AbstractC4622a {

    /* JADX INFO: renamed from: a */
    public Context f19006a;

    /* JADX INFO: renamed from: dj.j$a */
    public class a extends C1669a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f19007a;

        public a(String str) {
            this.f19007a = str;
        }

        @Override // p048cj.C1669a, android.database.AbstractCursor, android.database.Cursor
        public String[] getColumnNames() {
            return new String[]{"user_agent_param"};
        }

        @Override // p048cj.C1669a, android.database.AbstractCursor, android.database.Cursor
        public String getString(int i10) {
            return this.f19007a;
        }
    }

    public C4631j(Context context) {
        this.f19006a = context;
    }

    @Override // dj.InterfaceC4630i
    /* JADX INFO: renamed from: a */
    public EnumC6096a mo22845a(InterfaceC4630i.a aVar) {
        if (aVar == InterfaceC4630i.a.GET) {
            return EnumC6096a.GetUserAgent;
        }
        return null;
    }

    @Override // dj.InterfaceC4630i
    /* JADX INFO: renamed from: b */
    public Cursor mo22846b(Uri uri) {
        String queryParameter = uri.getQueryParameter("user_agent_param");
        C11295a1.m42417R0(this.f19006a);
        if (queryParameter == null) {
            queryParameter = "google";
        }
        return new a(C11295a1.m42464n(this.f19006a, queryParameter));
    }
}
