package dj;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.roblox.client.provider.ShellConfigurationContentProvider;
import gh.EnumC6096a;
import p048cj.C1669a;

/* JADX INFO: renamed from: dj.e */
/* JADX INFO: loaded from: classes2.dex */
public class C4626e extends AbstractC4622a {

    /* JADX INFO: renamed from: a */
    public final ShellConfigurationContentProvider f18994a;

    /* JADX INFO: renamed from: b */
    public Context f18995b;

    /* JADX INFO: renamed from: dj.e$a */
    public class a extends C1669a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f18996a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f18997b;

        public a(String str, String str2) {
            this.f18996a = str;
            this.f18997b = str2;
        }

        @Override // p048cj.C1669a, android.database.AbstractCursor, android.database.Cursor
        public String[] getColumnNames() {
            return new String[]{"dev_branch", "dev_commit"};
        }

        @Override // p048cj.C1669a, android.database.AbstractCursor, android.database.Cursor
        public String getString(int i10) {
            if (i10 == getColumnIndex("dev_branch")) {
                return this.f18996a;
            }
            if (i10 == getColumnIndex("dev_commit")) {
                return this.f18997b;
            }
            return null;
        }
    }

    public C4626e(ShellConfigurationContentProvider shellConfigurationContentProvider, Context context) {
        this.f18994a = shellConfigurationContentProvider;
        this.f18995b = context;
    }

    @Override // dj.InterfaceC4630i
    /* JADX INFO: renamed from: a */
    public EnumC6096a mo22845a(InterfaceC4630i.a aVar) {
        if (aVar == InterfaceC4630i.a.GET) {
            return EnumC6096a.GetDevBranchAndCommit;
        }
        return null;
    }

    @Override // dj.InterfaceC4630i
    /* JADX INFO: renamed from: b */
    public Cursor mo22846b(Uri uri) {
        return new a(this.f18994a.m15352d().m26981e(), this.f18994a.m15352d().m26982f());
    }
}
