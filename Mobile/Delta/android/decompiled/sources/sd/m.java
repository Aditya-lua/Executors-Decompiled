package sd;

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
    public final de.t0 f30656a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f30657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f30658d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d1 f30659e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final de.f f30660f;

    public m(Context context, de.t0 t0Var, t tVar, d1 d1Var) {
        this.b = context.getPackageName();
        this.f30656a = t0Var;
        this.f30658d = tVar;
        this.f30659e = d1Var;
        this.f30657c = context;
        if (de.j.b(context)) {
            this.f30660f = new de.f(context, t0Var, "IntegrityService", n.f30661a, new de.a1() { // from class: sd.i
                @Override // de.a1
                public final Object a(IBinder iBinder) {
                    return de.p0.s2(iBinder);
                }
            }, null);
        } else {
            t0Var.a("Phonesky is not installed.", new Object[0]);
            this.f30660f = null;
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
        de.g0.b(3, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(de.g0.a(arrayList)));
        return bundle;
    }

    public final Task b(IntegrityTokenRequest integrityTokenRequest) {
        if (this.f30660f == null) {
            return sb.m.e(new a(-2, null));
        }
        if (de.j.a(this.f30657c) < 82380000) {
            return sb.m.e(new a(-14, null));
        }
        try {
            byte[] bArrDecode = Base64.decode(integrityTokenRequest.b(), 10);
            Long lA = integrityTokenRequest.a();
            if (integrityTokenRequest instanceof q) {
            }
            this.f30656a.c("requestIntegrityToken(%s)", integrityTokenRequest);
            sb.k kVar = new sb.k();
            this.f30660f.t(new j(this, kVar, bArrDecode, lA, null, kVar, integrityTokenRequest), kVar);
            return kVar.a();
        } catch (IllegalArgumentException e10) {
            return sb.m.e(new a(-13, e10));
        }
    }
}
