package vd;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ge.t0 f34299a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f34300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f34301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d1 f34302e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ge.f f34303f;

    public m(Context context, ge.t0 t0Var, t tVar, d1 d1Var) {
        this.b = context.getPackageName();
        this.f34299a = t0Var;
        this.f34301d = tVar;
        this.f34302e = d1Var;
        this.f34300c = context;
        if (ge.j.b(context)) {
            this.f34303f = new ge.f(context, t0Var, "IntegrityService", n.f34304a, new ge.a1() { // from class: vd.i
                @Override // ge.a1
                public final Object a(IBinder iBinder) {
                    return ge.p0.s2(iBinder);
                }
            }, null);
        } else {
            t0Var.a("Phonesky is not installed.", new Object[0]);
            this.f34303f = null;
        }
    }

    public static /* bridge */ /* synthetic */ Bundle a(m mVar, byte[] bArr, Long l10, Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", mVar.b);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 4);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l10 != null) {
            bundle.putLong("cloud.prj", l10.longValue());
        }
        if (parcelable != null) {
            bundle.putParcelable("network", parcelable);
        }
        ArrayList arrayList = new ArrayList();
        ge.g0.b(3, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(ge.g0.a(arrayList)));
        return bundle;
    }

    public final Task b(IntegrityTokenRequest integrityTokenRequest) {
        if (this.f34303f == null) {
            return tb.m.e(new a(-2, null));
        }
        if (ge.j.a(this.f34300c) < 82380000) {
            return tb.m.e(new a(-14, null));
        }
        try {
            byte[] bArrDecode = Base64.decode(integrityTokenRequest.b(), 10);
            Long lA = integrityTokenRequest.a();
            if (integrityTokenRequest instanceof q) {
            }
            this.f34299a.c("requestIntegrityToken(%s)", integrityTokenRequest);
            tb.k kVar = new tb.k();
            this.f34303f.t(new j(this, kVar, bArrDecode, lA, null, kVar, integrityTokenRequest), kVar);
            return kVar.a();
        } catch (IllegalArgumentException e10) {
            return tb.m.e(new a(-13, e10));
        }
    }
}
