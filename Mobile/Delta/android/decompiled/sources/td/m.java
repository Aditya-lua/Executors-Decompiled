package td;

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
    public final ee.t0 f32265a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f32266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f32267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d1 f32268e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ee.f f32269f;

    public m(Context context, ee.t0 t0Var, t tVar, d1 d1Var) {
        this.b = context.getPackageName();
        this.f32265a = t0Var;
        this.f32267d = tVar;
        this.f32268e = d1Var;
        this.f32266c = context;
        if (ee.j.b(context)) {
            this.f32269f = new ee.f(context, t0Var, "IntegrityService", n.f32270a, new ee.a1() { // from class: td.i
                @Override // ee.a1
                public final Object a(IBinder iBinder) {
                    return ee.p0.s2(iBinder);
                }
            }, null);
        } else {
            t0Var.a("Phonesky is not installed.", new Object[0]);
            this.f32269f = null;
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
        ee.g0.b(3, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(ee.g0.a(arrayList)));
        return bundle;
    }

    public final Task b(IntegrityTokenRequest integrityTokenRequest) {
        if (this.f32269f == null) {
            return sb.m.e(new a(-2, null));
        }
        if (ee.j.a(this.f32266c) < 82380000) {
            return sb.m.e(new a(-14, null));
        }
        try {
            byte[] bArrDecode = Base64.decode(integrityTokenRequest.b(), 10);
            Long lA = integrityTokenRequest.a();
            if (integrityTokenRequest instanceof q) {
            }
            this.f32265a.c("requestIntegrityToken(%s)", integrityTokenRequest);
            sb.k kVar = new sb.k();
            this.f32269f.t(new j(this, kVar, bArrDecode, lA, null, kVar, integrityTokenRequest), kVar);
            return kVar.a();
        } catch (IllegalArgumentException e10) {
            return sb.m.e(new a(-13, e10));
        }
    }
}
