package dj;

import android.database.Cursor;
import android.net.Uri;
import gh.EnumC6096a;
import p048cj.C1669a;

/* JADX INFO: renamed from: dj.g */
/* JADX INFO: loaded from: classes2.dex */
public class C4628g extends AbstractC4622a {
    @Override // dj.InterfaceC4630i
    /* JADX INFO: renamed from: a */
    public EnumC6096a mo22845a(InterfaceC4630i.a aVar) {
        if (aVar == InterfaceC4630i.a.GET) {
            return EnumC6096a.GetPing;
        }
        return null;
    }

    @Override // dj.InterfaceC4630i
    /* JADX INFO: renamed from: b */
    public Cursor mo22846b(Uri uri) {
        return new C1669a();
    }
}
