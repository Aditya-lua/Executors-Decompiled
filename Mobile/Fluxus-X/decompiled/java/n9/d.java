package n9;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.google.android.gms.common.data.DataHolder;
import o9.s;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final DataHolder f25493a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25494c;

    public d(@NonNull DataHolder dataHolder, int i10) {
        this.f25493a = (DataHolder) s.l(dataHolder);
        o(i10);
    }

    public boolean a(@NonNull String str) {
        return this.f25493a.a(str, this.b, this.f25494c);
    }

    public float f(@NonNull String str) {
        return this.f25493a.I3(str, this.b, this.f25494c);
    }

    public int g(@NonNull String str) {
        return this.f25493a.A3(str, this.b, this.f25494c);
    }

    public long i(@NonNull String str) {
        return this.f25493a.B3(str, this.b, this.f25494c);
    }

    @NonNull
    public String j(@NonNull String str) {
        return this.f25493a.E3(str, this.b, this.f25494c);
    }

    public boolean k(@NonNull String str) {
        return this.f25493a.G3(str);
    }

    public boolean l(@NonNull String str) {
        return this.f25493a.H3(str, this.b, this.f25494c);
    }

    public Uri n(@NonNull String str) {
        String strE3 = this.f25493a.E3(str, this.b, this.f25494c);
        if (strE3 == null) {
            return null;
        }
        return Uri.parse(strE3);
    }

    public final void o(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f25493a.getCount()) {
            z10 = true;
        }
        s.p(z10);
        this.b = i10;
        this.f25494c = this.f25493a.F3(i10);
    }
}
