package dj;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.roblox.client.provider.ShellConfigurationContentProvider;

/* JADX INFO: loaded from: classes2.dex */
public class e extends dj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShellConfigurationContentProvider f14730a;
    public Context b;

    public class a extends cj.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f14731a;
        public final /* synthetic */ String b;

        public a(String str, String str2) {
            this.f14731a = str;
            this.b = str2;
        }

        @Override // cj.a, android.database.AbstractCursor, android.database.Cursor
        public String[] getColumnNames() {
            return new String[]{"dev_branch", "dev_commit"};
        }

        @Override // cj.a, android.database.AbstractCursor, android.database.Cursor
        public String getString(int i10) {
            if (i10 == getColumnIndex("dev_branch")) {
                return this.f14731a;
            }
            if (i10 == getColumnIndex("dev_commit")) {
                return this.b;
            }
            return null;
        }
    }

    public e(ShellConfigurationContentProvider shellConfigurationContentProvider, Context context) {
        this.f14730a = shellConfigurationContentProvider;
        this.b = context;
    }

    @Override // dj.i
    public gh.a a(i.a aVar) {
        if (aVar == i.a.GET) {
            return gh.a.GetDevBranchAndCommit;
        }
        return null;
    }

    @Override // dj.i
    public Cursor b(Uri uri) {
        return new a(this.f14730a.d().e(), this.f14730a.d().f());
    }
}
