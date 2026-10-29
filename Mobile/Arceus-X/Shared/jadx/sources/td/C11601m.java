package td;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import ee.AbstractBinderC5088p0;
import ee.C5067f;
import ee.C5070g0;
import ee.C5075j;
import ee.C5096t0;
import ee.InterfaceC5058a1;
import java.util.ArrayList;
import sb.C11264k;
import sb.C11268m;

/* JADX INFO: renamed from: td.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C11601m {

    /* JADX INFO: renamed from: a */
    public final C5096t0 f40980a;

    /* JADX INFO: renamed from: b */
    public final String f40981b;

    /* JADX INFO: renamed from: c */
    public final Context f40982c;

    /* JADX INFO: renamed from: d */
    public final C11622t f40983d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC11576d1 f40984e;

    /* JADX INFO: renamed from: f */
    public final C5067f f40985f;

    public C11601m(Context context, C5096t0 c5096t0, C11622t c11622t, InterfaceC11576d1 interfaceC11576d1) {
        this.f40981b = context.getPackageName();
        this.f40980a = c5096t0;
        this.f40983d = c11622t;
        this.f40984e = interfaceC11576d1;
        this.f40982c = context;
        if (C5075j.m23809b(context)) {
            this.f40985f = new C5067f(context, c5096t0, "IntegrityService", C11604n.f40987a, new InterfaceC5058a1() { // from class: td.i
                @Override // ee.InterfaceC5058a1
                /* JADX INFO: renamed from: a */
                public final Object mo23770a(IBinder iBinder) {
                    return AbstractBinderC5088p0.m23830s2(iBinder);
                }
            }, null);
        } else {
            c5096t0.m23839a("Phonesky is not installed.", new Object[0]);
            this.f40985f = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ Bundle m43263a(C11601m c11601m, byte[] bArr, Long l10, Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", c11601m.f40981b);
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
        C5070g0.m23802b(3, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(C5070g0.m23801a(arrayList)));
        return bundle;
    }

    /* JADX INFO: renamed from: b */
    public final Task m43267b(IntegrityTokenRequest integrityTokenRequest) {
        if (this.f40985f == null) {
            return C11268m.m42335e(new C11565a(-2, null));
        }
        if (C5075j.m23808a(this.f40982c) < 82380000) {
            return C11268m.m42335e(new C11565a(-14, null));
        }
        try {
            byte[] bArrDecode = Base64.decode(integrityTokenRequest.mo13348b(), 10);
            Long lMo13347a = integrityTokenRequest.mo13347a();
            if (integrityTokenRequest instanceof C11613q) {
            }
            this.f40980a.m23841c("requestIntegrityToken(%s)", integrityTokenRequest);
            C11264k c11264k = new C11264k();
            this.f40985f.m23793t(new C11592j(this, c11264k, bArrDecode, lMo13347a, null, c11264k, integrityTokenRequest), c11264k);
            return c11264k.m42326a();
        } catch (IllegalArgumentException e10) {
            return C11268m.m42335e(new C11565a(-13, e10));
        }
    }
}
