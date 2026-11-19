package lj;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.roblox.client.provider.ShellConfigurationContentProvider;

/* JADX INFO: loaded from: classes2.dex */
public class e extends lj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShellConfigurationContentProvider f22266a;
    public Context b;

    public class a extends kj.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f22267a;
        public final /* synthetic */ String b;

        public a(String str, String str2) {
            this.f22267a = str;
            this.b = str2;
        }

        @Override // kj.a, android.database.AbstractCursor, android.database.Cursor
        public String[] getColumnNames() {
            return new String[]{"dev_branch", "dev_commit"};
        }

        @Override // kj.a, android.database.AbstractCursor, android.database.Cursor
        public String getString(int i10) {
            if (i10 == getColumnIndex("dev_branch")) {
                return this.f22267a;
            }
            if (i10 == getColumnIndex("dev_commit")) {
                return this.b;
            }
            return null;
        }
    }

    public e(ShellConfigurationContentProvider shellConfigurationContentProvider, Context context) {
        this.f22266a = shellConfigurationContentProvider;
        this.b = context;
    }

    @Override // lj.i
    public Cursor a(Uri uri) {
        return new a(this.f22266a.d().e(), this.f22266a.d().f());
    }

    @Override // lj.i
    public ph.a b(i.a aVar) {
        if (aVar == i.a.GET) {
            return ph.a.GetDevBranchAndCommit;
        }
        return null;
    }
}
