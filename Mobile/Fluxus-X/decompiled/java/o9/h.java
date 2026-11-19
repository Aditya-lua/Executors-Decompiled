package o9;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: loaded from: classes.dex */
public class h extends p9.a {

    @NonNull
    public static final Parcelable.Creator<h> CREATOR = new o1();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Scope[] f26963t = new Scope[0];

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final k9.d[] f26964u = new k9.d[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f26965f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f26966g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f26967h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f26968i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public IBinder f26969j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Scope[] f26970k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Bundle f26971l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Account f26972m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public k9.d[] f26973n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public k9.d[] f26974o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f26975p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f26976q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f26977r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f26978s;

    public h(int i10, int i11, int i12, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, k9.d[] dVarArr, k9.d[] dVarArr2, boolean z10, int i13, boolean z11, String str2) {
        scopeArr = scopeArr == null ? f26963t : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        dVarArr = dVarArr == null ? f26964u : dVarArr;
        dVarArr2 = dVarArr2 == null ? f26964u : dVarArr2;
        this.f26965f = i10;
        this.f26966g = i11;
        this.f26967h = i12;
        if ("com.google.android.gms".equals(str)) {
            this.f26968i = "com.google.android.gms";
        } else {
            this.f26968i = str;
        }
        if (i10 < 2) {
            this.f26972m = iBinder != null ? a.t2(l.a.s2(iBinder)) : null;
        } else {
            this.f26969j = iBinder;
            this.f26972m = account;
        }
        this.f26970k = scopeArr;
        this.f26971l = bundle;
        this.f26973n = dVarArr;
        this.f26974o = dVarArr2;
        this.f26975p = z10;
        this.f26976q = i13;
        this.f26977r = z11;
        this.f26978s = str2;
    }

    public String A3() {
        return this.f26978s;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        o1.a(this, parcel, i10);
    }
}
