package p290m9;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.google.android.gms.common.data.DataHolder;
import p305n9.C8953m;

/* JADX INFO: renamed from: m9.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8473d {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final DataHolder f31185a;

    /* JADX INFO: renamed from: b */
    public int f31186b;

    /* JADX INFO: renamed from: c */
    public int f31187c;

    public AbstractC8473d(@NonNull DataHolder dataHolder, int i10) {
        this.f31185a = (DataHolder) C8953m.m36047l(dataHolder);
        m34265o(i10);
    }

    /* JADX INFO: renamed from: a */
    public boolean m34257a(@NonNull String str) {
        return this.f31185a.m9194a(str, this.f31186b, this.f31187c);
    }

    /* JADX INFO: renamed from: f */
    public float m34258f(@NonNull String str) {
        return this.f31185a.m9191D3(str, this.f31186b, this.f31187c);
    }

    /* JADX INFO: renamed from: g */
    public int m34259g(@NonNull String str) {
        return this.f31185a.m9195v3(str, this.f31186b, this.f31187c);
    }

    /* JADX INFO: renamed from: i */
    public long m34260i(@NonNull String str) {
        return this.f31185a.m9196w3(str, this.f31186b, this.f31187c);
    }

    @NonNull
    /* JADX INFO: renamed from: j */
    public String m34261j(@NonNull String str) {
        return this.f31185a.m9199z3(str, this.f31186b, this.f31187c);
    }

    /* JADX INFO: renamed from: k */
    public boolean m34262k(@NonNull String str) {
        return this.f31185a.m9189B3(str);
    }

    /* JADX INFO: renamed from: m */
    public boolean m34263m(@NonNull String str) {
        return this.f31185a.m9190C3(str, this.f31186b, this.f31187c);
    }

    /* JADX INFO: renamed from: n */
    public Uri m34264n(@NonNull String str) {
        String strM9199z3 = this.f31185a.m9199z3(str, this.f31186b, this.f31187c);
        if (strM9199z3 == null) {
            return null;
        }
        return Uri.parse(strM9199z3);
    }

    /* JADX INFO: renamed from: o */
    public final void m34265o(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f31185a.getCount()) {
            z10 = true;
        }
        C8953m.m36051p(z10);
        this.f31186b = i10;
        this.f31187c = this.f31185a.m9188A3(i10);
    }
}
