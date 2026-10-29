package m9;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.google.android.gms.common.data.DataHolder;
import n9.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final DataHolder f24043a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24044c;

    public d(@NonNull DataHolder dataHolder, int i10) {
        this.f24043a = (DataHolder) m.l(dataHolder);
        o(i10);
    }

    public boolean a(@NonNull String str) {
        return this.f24043a.a(str, this.b, this.f24044c);
    }

    public float f(@NonNull String str) {
        return this.f24043a.D3(str, this.b, this.f24044c);
    }

    public int g(@NonNull String str) {
        return this.f24043a.v3(str, this.b, this.f24044c);
    }

    public long i(@NonNull String str) {
        return this.f24043a.w3(str, this.b, this.f24044c);
    }

    @NonNull
    public String j(@NonNull String str) {
        return this.f24043a.z3(str, this.b, this.f24044c);
    }

    public boolean k(@NonNull String str) {
        return this.f24043a.B3(str);
    }

    public boolean m(@NonNull String str) {
        return this.f24043a.C3(str, this.b, this.f24044c);
    }

    public Uri n(@NonNull String str) {
        String strZ3 = this.f24043a.z3(str, this.b, this.f24044c);
        if (strZ3 == null) {
            return null;
        }
        return Uri.parse(strZ3);
    }

    public final void o(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f24043a.getCount()) {
            z10 = true;
        }
        m.p(z10);
        this.b = i10;
        this.f24044c = this.f24043a.A3(i10);
    }
}
