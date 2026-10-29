package p306nb;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.internal.measurement.InterfaceC2383x1;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.mlkit.common.MlKitException;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import okhttp3.internal.p336ws.RealWebSocket;
import p213j9.C7091d;
import p305n9.C8953m;
import p401r4.AbstractC10783a;
import p462u9.C11815f;
import p511w9.C12327c;

/* JADX INFO: renamed from: nb.ve */
/* JADX INFO: loaded from: classes.dex */
public final class C9341ve extends AbstractC9159k8 {

    /* JADX INFO: renamed from: i */
    public static final String[] f33574i = {"firebase_", "google_", "ga_"};

    /* JADX INFO: renamed from: j */
    public static final String[] f33575j = {"_err"};

    /* JADX INFO: renamed from: c */
    public SecureRandom f33576c;

    /* JADX INFO: renamed from: d */
    public final AtomicLong f33577d;

    /* JADX INFO: renamed from: e */
    public int f33578e;

    /* JADX INFO: renamed from: f */
    public AbstractC10783a f33579f;

    /* JADX INFO: renamed from: g */
    public Boolean f33580g;

    /* JADX INFO: renamed from: h */
    public Integer f33581h;

    public C9341ve(C9094g7 c9094g7) {
        super(c9094g7);
        this.f33581h = null;
        this.f33577d = new AtomicLong(0L);
    }

    /* JADX INFO: renamed from: C */
    public static MessageDigest m36922C() {
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                if (messageDigest != null) {
                    return messageDigest;
                }
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: D */
    public static long m36923D(byte[] bArr) {
        C8953m.m36047l(bArr);
        int length = bArr.length;
        int i10 = 0;
        C8953m.m36051p(length > 0);
        long j10 = 0;
        for (int i11 = length - 1; i11 >= 0 && i11 >= bArr.length - 8; i11--) {
            j10 += (((long) bArr[i11]) & 255) << i10;
            i10 += 8;
        }
        return j10;
    }

    /* JADX INFO: renamed from: E */
    public static boolean m36924E(Context context, boolean z10) {
        C8953m.m36047l(context);
        return m36925F(context, "com.google.android.gms.measurement.AppMeasurementJobService");
    }

    /* JADX INFO: renamed from: F */
    public static boolean m36925F(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) == null || !serviceInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* JADX INFO: renamed from: N */
    public static boolean m36926N(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    /* JADX INFO: renamed from: O */
    public static boolean m36927O(String str, String[] strArr) {
        C8953m.m36047l(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: U */
    public static boolean m36928U(String str) {
        return !f33575j[0].equals(str);
    }

    /* JADX INFO: renamed from: h0 */
    public static ArrayList m36929h0(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzah zzahVar = (zzah) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", zzahVar.f9489f);
            bundle.putString("origin", zzahVar.f9490g);
            bundle.putLong("creation_timestamp", zzahVar.f9492i);
            bundle.putString("name", zzahVar.f9491h.f9519g);
            C9191m8.m36479a(bundle, C8953m.m36047l(zzahVar.f9491h.zza()));
            bundle.putBoolean("active", zzahVar.f9493j);
            String str = zzahVar.f9494k;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            zzbg zzbgVar = zzahVar.f9495l;
            if (zzbgVar != null) {
                bundle.putString("timed_out_event_name", zzbgVar.f9502f);
                zzbe zzbeVar = zzbgVar.f9503g;
                if (zzbeVar != null) {
                    bundle.putBundle("timed_out_event_params", zzbeVar.m11882y3());
                }
            }
            bundle.putLong("trigger_timeout", zzahVar.f9496m);
            zzbg zzbgVar2 = zzahVar.f9497n;
            if (zzbgVar2 != null) {
                bundle.putString("triggered_event_name", zzbgVar2.f9502f);
                zzbe zzbeVar2 = zzbgVar2.f9503g;
                if (zzbeVar2 != null) {
                    bundle.putBundle("triggered_event_params", zzbeVar2.m11882y3());
                }
            }
            bundle.putLong("triggered_timestamp", zzahVar.f9491h.f9520h);
            bundle.putLong("time_to_live", zzahVar.f9498o);
            zzbg zzbgVar3 = zzahVar.f9499p;
            if (zzbgVar3 != null) {
                bundle.putString("expired_event_name", zzbgVar3.f9502f);
                zzbe zzbeVar3 = zzbgVar3.f9503g;
                if (zzbeVar3 != null) {
                    bundle.putBundle("expired_event_params", zzbeVar3.m11882y3());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: j0 */
    public static boolean m36930j0(Context context) {
        ActivityInfo receiverInfo;
        C8953m.m36047l(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null || !receiverInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static void m36931k0(C9014bb c9014bb, Bundle bundle, boolean z10) {
        if (bundle != null && c9014bb != null) {
            if (!bundle.containsKey("_sc") || z10) {
                String str = c9014bb.f32724a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = c9014bb.f32725b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", c9014bb.f32726c);
                return;
            }
            z10 = false;
        }
        if (bundle != null && c9014bb == null && z10) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    /* JADX INFO: renamed from: m0 */
    public static final boolean m36932m0(Bundle bundle, int i10) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i10);
        return true;
    }

    /* JADX INFO: renamed from: r0 */
    public static boolean m36933r0(String str) {
        C8953m.m36041f(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    /* JADX INFO: renamed from: A */
    public final void m36934A(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
            C9094g7 c9094g7 = this.f33067a;
            c9094g7.mo36321a().m37008t().m36913c("Not putting event parameter. Invalid value type. name, type", c9094g7.m36309D().m36621b(str), simpleName);
        }
    }

    /* JADX INFO: renamed from: A0 */
    public final int m36935A0(String str) {
        if (!m36979u0("event param", str)) {
            return 3;
        }
        if (!m36981v0("event param", null, null, str)) {
            return 14;
        }
        this.f33067a.m36338w();
        return !m36983w0("event param", 40, str) ? 3 : 0;
    }

    /* JADX INFO: renamed from: B */
    public final void m36936B(InterfaceC9325ue interfaceC9325ue, String str, int i10, String str2, String str3, int i11) {
        Bundle bundle = new Bundle();
        m36932m0(bundle, i10);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i10 == 6 || i10 == 7 || i10 == 2) {
            bundle.putLong("_el", i11);
        }
        interfaceC9325ue.mo36347a(str, "_err", bundle);
    }

    /* JADX INFO: renamed from: B0 */
    public final boolean m36937B0(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    /* JADX INFO: renamed from: C0 */
    public final boolean m36938C0(String str, String str2, int i10, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String string = obj.toString();
            if (string.codePointCount(0, string.length()) > i10) {
                this.f33067a.mo36321a().m37008t().m36914d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(string.length()));
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: D0 */
    public final void m36939D0(String str, String str2, String str3, Bundle bundle, List list, boolean z10) {
        int iM36989z0;
        String str4;
        int iM36973r;
        list = list;
        if (bundle == null) {
            return;
        }
        C9094g7 c9094g7 = this.f33067a;
        int i10 = true != c9094g7.m36338w().f33067a.m36308C().m36952V(231100000, true) ? 0 : 35;
        int i11 = 0;
        boolean z11 = false;
        for (String str5 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str5)) {
                iM36989z0 = !z10 ? m36989z0(str5) : 0;
                if (iM36989z0 == 0) {
                    iM36989z0 = m36935A0(str5);
                }
            } else {
                iM36989z0 = 0;
            }
            if (iM36989z0 != 0) {
                m36984x(bundle, iM36989z0, str5, iM36989z0 == 3 ? str5 : null);
                bundle.remove(str5);
            } else {
                if (m36937B0(bundle.get(str5))) {
                    c9094g7.mo36321a().m37008t().m36914d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str5);
                    iM36973r = 22;
                    str4 = null;
                } else {
                    str4 = null;
                    iM36973r = m36973r(str, str2, str5, bundle.get(str5), bundle, list, z10, false);
                }
                if (iM36973r != 0 && !"_ev".equals(str5)) {
                    m36984x(bundle, iM36973r, str5, bundle.get(str5));
                    bundle.remove(str5);
                } else if (m36933r0(str5) && !m36927O(str5, C9287s8.f33462d)) {
                    i11++;
                    if (!m36952V(231100000, true)) {
                        c9094g7.mo36321a().m37005q().m36913c("Item array not supported on client's version of Google Play Services (Android Only)", c9094g7.m36309D().m36620a(str2), c9094g7.m36309D().m36624e(bundle));
                        m36932m0(bundle, 23);
                        bundle.remove(str5);
                    } else if (i11 > i10) {
                        if (!c9094g7.m36338w().m36406H(str4, C9395z4.f33774f1) || !z11) {
                            C9316u5 c9316u5M37005q = c9094g7.mo36321a().m37005q();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 55);
                            sb2.append("Item can't contain more than ");
                            sb2.append(i10);
                            sb2.append(" item-scoped custom params");
                            c9316u5M37005q.m36913c(sb2.toString(), c9094g7.m36309D().m36620a(str2), c9094g7.m36309D().m36624e(bundle));
                        }
                        m36932m0(bundle, 28);
                        bundle.remove(str5);
                        z11 = true;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public final boolean m36940G() {
        mo36088h();
        return m36943J() == 1;
    }

    /* JADX INFO: renamed from: H */
    public final AbstractC10783a m36941H() {
        if (this.f33579f == null) {
            this.f33579f = AbstractC10783a.m41106a(this.f33067a.mo36324d());
        }
        return this.f33579f;
    }

    /* JADX INFO: renamed from: I */
    public final int m36942I() {
        if (Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
            return 0;
        }
        return SdkExtensions.getExtensionVersion(1000000);
    }

    /* JADX INFO: renamed from: J */
    public final long m36943J() {
        long j10;
        mo36088h();
        if (!m36945L(this.f33067a.m36317L().m36432q())) {
            return 0L;
        }
        if (Build.VERSION.SDK_INT < 30) {
            j10 = 4;
        } else if (SdkExtensions.getExtensionVersion(30) < 4) {
            j10 = 8;
        } else {
            C9094g7 c9094g7 = this.f33067a;
            int iM36942I = m36942I();
            c9094g7.m36338w();
            j10 = iM36942I < ((Integer) C9395z4.f33794m0.m37079b(null)).intValue() ? 16L : 0L;
        }
        if (!m36946M("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j10 |= 2;
        }
        if (j10 == 0 && !m36944K()) {
            j10 = 64;
        }
        if (j10 == 0) {
            return 1L;
        }
        return j10;
    }

    @TargetApi(30)
    /* JADX INFO: renamed from: K */
    public final boolean m36944K() {
        Object e10;
        Integer num;
        if (this.f33580g == null) {
            AbstractC10783a abstractC10783aM36941H = m36941H();
            boolean z10 = false;
            if (abstractC10783aM36941H == null) {
                return false;
            }
            try {
                num = abstractC10783aM36941H.mo41107b().get(10000L, TimeUnit.MILLISECONDS);
                if (num != null) {
                    try {
                        if (num.intValue() == 1) {
                            z10 = true;
                        }
                    } catch (InterruptedException e11) {
                        e10 = e11;
                        this.f33067a.mo36321a().m37006r().m36912b("Measurement manager api exception", e10);
                        this.f33580g = Boolean.FALSE;
                    } catch (CancellationException e12) {
                        e10 = e12;
                        this.f33067a.mo36321a().m37006r().m36912b("Measurement manager api exception", e10);
                        this.f33580g = Boolean.FALSE;
                    } catch (ExecutionException e13) {
                        e10 = e13;
                        this.f33067a.mo36321a().m37006r().m36912b("Measurement manager api exception", e10);
                        this.f33580g = Boolean.FALSE;
                    } catch (TimeoutException e14) {
                        e10 = e14;
                        this.f33067a.mo36321a().m37006r().m36912b("Measurement manager api exception", e10);
                        this.f33580g = Boolean.FALSE;
                    }
                }
                this.f33580g = Boolean.valueOf(z10);
            } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e15) {
                e10 = e15;
                num = null;
            }
            this.f33067a.mo36321a().m37011w().m36912b("Measurement manager api status result", num);
        }
        return this.f33580g.booleanValue();
    }

    /* JADX INFO: renamed from: L */
    public final boolean m36945L(String str) {
        String str2 = (String) C9395z4.f33806s0.m37079b(null);
        return str2.equals("*") || Arrays.asList(str2.split(",")).contains(str);
    }

    /* JADX INFO: renamed from: M */
    public final boolean m36946M(String str) {
        mo36088h();
        C9094g7 c9094g7 = this.f33067a;
        if (C12327c.m46181a(c9094g7.mo36324d()).m46174a(str) == 0) {
            return true;
        }
        c9094g7.mo36321a().m37010v().m36912b("Permission not granted", str);
        return false;
    }

    /* JADX INFO: renamed from: P */
    public final boolean m36947P(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C9094g7 c9094g7 = this.f33067a;
        String strM36417i = c9094g7.m36338w().m36417i();
        c9094g7.mo36323c();
        return strM36417i.equals(str);
    }

    /* JADX INFO: renamed from: Q */
    public final Bundle m36948Q(Bundle bundle, String str) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                Object objM36974s = m36974s(str2, bundle.get(str2));
                if (objM36974s == null) {
                    C9094g7 c9094g7 = this.f33067a;
                    c9094g7.mo36321a().m37008t().m36912b("Param value can't be null", c9094g7.m36309D().m36621b(str2));
                } else {
                    m36934A(bundle2, str2, objM36974s);
                }
            }
        }
        return bundle2;
    }

    /* JADX INFO: renamed from: R */
    public final zzbg m36949R(String str, String str2, Bundle bundle, String str3, long j10, boolean z10, boolean z11) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (m36985x0(str2) != 0) {
            C9094g7 c9094g7 = this.f33067a;
            c9094g7.mo36321a().m37003o().m36912b("Invalid conditional property event name", c9094g7.m36309D().m36622c(str2));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str3);
        Bundle bundleM36976t = m36976t(str, str2, bundle2, C11815f.m44177a("_o"), true);
        if (z10) {
            bundleM36976t = m36948Q(bundleM36976t, str);
        }
        C8953m.m36047l(bundleM36976t);
        return new zzbg(str2, new zzbe(bundleM36976t), str3, j10);
    }

    /* JADX INFO: renamed from: S */
    public final boolean m36950S(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfoM46178e = C12327c.m46181a(context).m46178e(str, 64);
            if (packageInfoM46178e == null || (signatureArr = packageInfoM46178e.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e10) {
            this.f33067a.mo36321a().m37003o().m36912b("Package name not found", e10);
            return true;
        } catch (CertificateException e11) {
            this.f33067a.mo36321a().m37003o().m36912b("Error obtaining certificate", e11);
            return true;
        }
    }

    /* JADX INFO: renamed from: T */
    public final byte[] m36951T(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    /* JADX INFO: renamed from: V */
    public final boolean m36952V(int i10, boolean z10) {
        Boolean boolM36906x = this.f33067a.m36315J().m36906x();
        if (m36953W() < i10 / 1000) {
            return (boolM36906x == null || boolM36906x.booleanValue()) ? false : true;
        }
        return true;
    }

    /* JADX INFO: renamed from: W */
    public final int m36953W() {
        if (this.f33581h == null) {
            this.f33581h = Integer.valueOf(C7091d.m29876f().m29877a(this.f33067a.mo36324d()) / 1000);
        }
        return this.f33581h.intValue();
    }

    /* JADX INFO: renamed from: X */
    public final int m36954X(int i10) {
        return C7091d.m29876f().mo29855h(this.f33067a.mo36324d(), 12451000);
    }

    /* JADX INFO: renamed from: Y */
    public final long m36955Y(long j10, long j11) {
        return (j10 + (j11 * RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS)) / 86400000;
    }

    /* JADX INFO: renamed from: Z */
    public final void m36956Z(Bundle bundle, long j10) {
        long j11 = bundle.getLong("_et");
        if (j11 != 0) {
            this.f33067a.mo36321a().m37006r().m36912b("Params already contained engagement", Long.valueOf(j11));
        } else {
            j11 = 0;
        }
        bundle.putLong("_et", j10 + j11);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m36957a0(InterfaceC2383x1 interfaceC2383x1, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            interfaceC2383x1.mo10588l(bundle);
        } catch (RemoteException e10) {
            this.f33067a.mo36321a().m37006r().m36912b("Error returning string value to wrapper", e10);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m36958b0(InterfaceC2383x1 interfaceC2383x1, long j10) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j10);
        try {
            interfaceC2383x1.mo10588l(bundle);
        } catch (RemoteException e10) {
            this.f33067a.mo36321a().m37006r().m36912b("Error returning long value to wrapper", e10);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m36959c0(InterfaceC2383x1 interfaceC2383x1, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i10);
        try {
            interfaceC2383x1.mo10588l(bundle);
        } catch (RemoteException e10) {
            this.f33067a.mo36321a().m37006r().m36912b("Error returning int value to wrapper", e10);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final void m36960d0(InterfaceC2383x1 interfaceC2383x1, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            interfaceC2383x1.mo10588l(bundle);
        } catch (RemoteException e10) {
            this.f33067a.mo36321a().m37006r().m36912b("Error returning byte array to wrapper", e10);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m36961e0(InterfaceC2383x1 interfaceC2383x1, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z10);
        try {
            interfaceC2383x1.mo10588l(bundle);
        } catch (RemoteException e10) {
            this.f33067a.mo36321a().m37006r().m36912b("Error returning boolean value to wrapper", e10);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m36962f0(InterfaceC2383x1 interfaceC2383x1, Bundle bundle) {
        try {
            interfaceC2383x1.mo10588l(bundle);
        } catch (RemoteException e10) {
            this.f33067a.mo36321a().m37006r().m36912b("Error returning bundle value to wrapper", e10);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final void m36963g0(InterfaceC2383x1 interfaceC2383x1, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            interfaceC2383x1.mo10588l(bundle);
        } catch (RemoteException e10) {
            this.f33067a.mo36321a().m37006r().m36912b("Error returning bundle list to wrapper", e10);
        }
    }

    @Override // p306nb.AbstractC9159k8
    /* JADX INFO: renamed from: i */
    public final boolean mo36257i() {
        return true;
    }

    /* JADX INFO: renamed from: i0 */
    public final URL m36964i0(long j10, String str, String str2, long j11, String str3) {
        try {
            C8953m.m36041f(str2);
            C8953m.m36041f(str);
            String strConcat = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", 133005L, Integer.valueOf(m36953W())), str2, str, Long.valueOf(j11));
            if (str.equals(this.f33067a.m36338w().m36418j())) {
                strConcat = strConcat.concat("&ddl_test=1");
            }
            if (!str3.isEmpty()) {
                if (str3.charAt(0) != '&') {
                    strConcat = strConcat.concat("&");
                }
                strConcat = strConcat.concat(str3);
            }
            return new URL(strConcat);
        } catch (IllegalArgumentException e10) {
            e = e10;
            this.f33067a.mo36321a().m37003o().m36912b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        } catch (MalformedURLException e11) {
            e = e11;
            this.f33067a.mo36321a().m37003o().m36912b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    @Override // p306nb.AbstractC9159k8
    /* JADX INFO: renamed from: j */
    public final void mo36441j() {
        mo36088h();
        SecureRandom secureRandom = new SecureRandom();
        long jNextLong = secureRandom.nextLong();
        if (jNextLong == 0) {
            jNextLong = secureRandom.nextLong();
            if (jNextLong == 0) {
                this.f33067a.mo36321a().m37006r().m36911a("Utils falling back to Random for random id");
            }
        }
        this.f33577d.set(jNextLong);
    }

    /* JADX INFO: renamed from: l0 */
    public final String m36965l0() {
        byte[] bArr = new byte[16];
        m36972q0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    /* JADX INFO: renamed from: n0 */
    public final Object m36966n0(int i10, Object obj, boolean z10, boolean z11, String str) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return m36971q(obj.toString(), i10, z10);
        }
        if (!z11 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle bundleM36948Q = m36948Q((Bundle) parcelable, null);
                if (!bundleM36948Q.isEmpty()) {
                    arrayList.add(bundleM36948Q);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m36967o(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f33067a.mo36321a().m37005q().m36911a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            return false;
        }
        C8953m.m36047l(str);
        if (str.matches("^1:\\d+:android:[a-f0-9]+$")) {
            return true;
        }
        this.f33067a.mo36321a().m37005q().m36912b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", C9348w5.m36998x(str));
        return false;
    }

    /* JADX INFO: renamed from: o0 */
    public final int m36968o0(String str) {
        if ("_ldl".equals(str)) {
            this.f33067a.m36338w();
            return 2048;
        }
        if ("_id".equals(str)) {
            this.f33067a.m36338w();
            return 256;
        }
        if ("_lgclid".equals(str)) {
            this.f33067a.m36338w();
            return 100;
        }
        this.f33067a.m36338w();
        return 36;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m36969p(String str, String str2) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean zIsEmpty2 = TextUtils.isEmpty(str2);
        if (!zIsEmpty && !zIsEmpty2) {
            C8953m.m36047l(str);
            if (!str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: p0 */
    public final long m36970p0() {
        long andIncrement;
        long j10;
        AtomicLong atomicLong = this.f33577d;
        if (atomicLong.get() != 0) {
            AtomicLong atomicLong2 = this.f33577d;
            synchronized (atomicLong2) {
                atomicLong2.compareAndSet(-1L, 1L);
                andIncrement = atomicLong2.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (atomicLong) {
            long jNextLong = new Random(System.nanoTime() ^ this.f33067a.mo36325e().mo44175a()).nextLong();
            int i10 = this.f33578e + 1;
            this.f33578e = i10;
            j10 = jNextLong + ((long) i10);
        }
        return j10;
    }

    /* JADX INFO: renamed from: q */
    public final String m36971q(String str, int i10, boolean z10) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i10) {
            return str;
        }
        if (z10) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i10))).concat("...");
        }
        return null;
    }

    /* JADX INFO: renamed from: q0 */
    public final SecureRandom m36972q0() {
        mo36088h();
        if (this.f33576c == null) {
            this.f33576c = new SecureRandom();
        }
        return this.f33576c;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a2  */
    /* JADX INFO: renamed from: r */
    public final int m36973r(String str, String str2, String str3, Object obj, Bundle bundle, List list, boolean z10, boolean z11) {
        int i10;
        int size;
        mo36088h();
        if (!m36937B0(obj)) {
            i10 = 0;
        } else {
            if (!z11) {
                return 21;
            }
            if (!m36927O(str3, C9287s8.f33461c)) {
                return 20;
            }
            C9307tc c9307tcM36315J = this.f33067a.m36315J();
            c9307tcM36315J.mo36088h();
            c9307tcM36315J.m36121j();
            if (c9307tcM36315J.m36907y() && c9307tcM36315J.f33067a.m36308C().m36953W() < 200900) {
                return 25;
            }
            C9094g7 c9094g7 = this.f33067a;
            c9094g7.m36338w();
            boolean z12 = obj instanceof Parcelable[];
            if (z12) {
                size = ((Parcelable[]) obj).length;
            } else if (obj instanceof ArrayList) {
                size = ((ArrayList) obj).size();
            } else {
                i10 = 0;
            }
            if (size > 200) {
                c9094g7.mo36321a().m37008t().m36914d("Parameter array is too long; discarded. Value kind, name, array length", "param", str3, Integer.valueOf(size));
                c9094g7.m36338w();
                if (z12) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    if (parcelableArr.length > 200) {
                        bundle.putParcelableArray(str3, (Parcelable[]) Arrays.copyOf(parcelableArr, MlKitException.CODE_SCANNER_UNAVAILABLE));
                    }
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    if (arrayList.size() > 200) {
                        bundle.putParcelableArrayList(str3, new ArrayList<>(arrayList.subList(0, MlKitException.CODE_SCANNER_UNAVAILABLE)));
                    }
                }
                i10 = 17;
            } else {
                i10 = 0;
            }
        }
        if (!m36938C0("param", str3, (m36926N(str2) || m36926N(str3)) ? this.f33067a.m36338w().m36428y(null, false) : this.f33067a.m36338w().m36427x(null, false), obj)) {
            if (!z11) {
                return 4;
            }
            if (obj instanceof Bundle) {
                m36939D0(str, str2, str3, (Bundle) obj, list, z10);
                return i10;
            }
            if (obj instanceof Parcelable[]) {
                for (Parcelable parcelable : (Parcelable[]) obj) {
                    if (!(parcelable instanceof Bundle)) {
                        this.f33067a.mo36321a().m37008t().m36913c("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable.getClass(), str3);
                        return 4;
                    }
                    m36939D0(str, str2, str3, (Bundle) parcelable, list, z10);
                }
            } else {
                if (!(obj instanceof ArrayList)) {
                    return 4;
                }
                ArrayList arrayList2 = (ArrayList) obj;
                int size2 = arrayList2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    Object obj2 = arrayList2.get(i11);
                    if (!(obj2 instanceof Bundle)) {
                        this.f33067a.mo36321a().m37008t().m36913c("All ArrayList elements must be of type Bundle. Value type, name", obj2 != null ? obj2.getClass() : "null", str3);
                        return 4;
                    }
                    m36939D0(str, str2, str3, (Bundle) obj2, list, z10);
                }
            }
        }
        return i10;
    }

    /* JADX INFO: renamed from: s */
    public final Object m36974s(String str, Object obj) {
        if ("_ev".equals(str)) {
            return m36966n0(this.f33067a.m36338w().m36428y(null, false), obj, true, true, null);
        }
        return m36966n0(m36926N(str) ? this.f33067a.m36338w().m36428y(null, false) : this.f33067a.m36338w().m36427x(null, false), obj, false, true, null);
    }

    /* JADX INFO: renamed from: s0 */
    public final Bundle m36975s0(Uri uri) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        String queryParameter7;
        String queryParameter8;
        String queryParameter9;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                queryParameter = uri.getQueryParameter("utm_campaign");
                queryParameter2 = uri.getQueryParameter("utm_source");
                queryParameter3 = uri.getQueryParameter("utm_medium");
                queryParameter4 = uri.getQueryParameter("gclid");
                queryParameter5 = uri.getQueryParameter("gbraid");
                queryParameter6 = uri.getQueryParameter("utm_id");
                queryParameter7 = uri.getQueryParameter("dclid");
                queryParameter8 = uri.getQueryParameter("srsltid");
                queryParameter9 = uri.getQueryParameter("sfmc_id");
            } else {
                queryParameter = null;
                queryParameter2 = null;
                queryParameter3 = null;
                queryParameter4 = null;
                queryParameter5 = null;
                queryParameter6 = null;
                queryParameter7 = null;
                queryParameter8 = null;
                queryParameter9 = null;
            }
            if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3) && TextUtils.isEmpty(queryParameter4) && TextUtils.isEmpty(queryParameter5) && TextUtils.isEmpty(queryParameter6) && TextUtils.isEmpty(queryParameter7) && TextUtils.isEmpty(queryParameter8) && TextUtils.isEmpty(queryParameter9)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("campaign", queryParameter);
            }
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString(Payload.SOURCE, queryParameter2);
            }
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("medium", queryParameter3);
            }
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("gclid", queryParameter4);
            }
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("gbraid", queryParameter5);
            }
            String queryParameter10 = uri.getQueryParameter("gad_source");
            if (!TextUtils.isEmpty(queryParameter10)) {
                bundle.putString("gad_source", queryParameter10);
            }
            String queryParameter11 = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter11)) {
                bundle.putString("term", queryParameter11);
            }
            String queryParameter12 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter12)) {
                bundle.putString("content", queryParameter12);
            }
            String queryParameter13 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter13)) {
                bundle.putString("aclid", queryParameter13);
            }
            String queryParameter14 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter14)) {
                bundle.putString("cp1", queryParameter14);
            }
            String queryParameter15 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter15)) {
                bundle.putString("anid", queryParameter15);
            }
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString(Payload.CAMPAIGN_ID, queryParameter6);
            }
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("dclid", queryParameter7);
            }
            String queryParameter16 = uri.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter16)) {
                bundle.putString("source_platform", queryParameter16);
            }
            String queryParameter17 = uri.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter17)) {
                bundle.putString("creative_format", queryParameter17);
            }
            String queryParameter18 = uri.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter18)) {
                bundle.putString("marketing_tactic", queryParameter18);
            }
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("srsltid", queryParameter8);
            }
            if (!TextUtils.isEmpty(queryParameter9)) {
                bundle.putString("sfmc_id", queryParameter9);
            }
            for (String str : uri.getQueryParameterNames()) {
                if (str.startsWith("gad_")) {
                    String queryParameter19 = uri.getQueryParameter(str);
                    if (!TextUtils.isEmpty(queryParameter19)) {
                        bundle.putString(str, queryParameter19);
                    }
                }
            }
            return bundle;
        } catch (UnsupportedOperationException e10) {
            this.f33067a.mo36321a().m37006r().m36912b("Install referrer url isn't a hierarchical URI", e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: t */
    public final Bundle m36976t(String str, String str2, Bundle bundle, List list, boolean z10) {
        int iM36989z0;
        boolean zM36927O = m36927O(str2, C9271r8.f33436d);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        C9094g7 c9094g7 = this.f33067a;
        int iM36425v = c9094g7.m36338w().m36425v();
        int i10 = 0;
        boolean z11 = false;
        for (String str3 : new TreeSet(bundle.keySet())) {
            if (list == 0 || !list.contains(str3)) {
                iM36989z0 = !z10 ? m36989z0(str3) : 0;
                if (iM36989z0 == 0) {
                    iM36989z0 = m36935A0(str3);
                }
            } else {
                iM36989z0 = 0;
            }
            if (iM36989z0 != 0) {
                m36984x(bundle2, iM36989z0, str3, iM36989z0 == 3 ? str3 : null);
                bundle2.remove(str3);
            } else {
                int iM36973r = m36973r(str, str2, str3, bundle.get(str3), bundle2, list, z10, zM36927O);
                if (iM36973r == 17) {
                    m36984x(bundle2, 17, str3, Boolean.FALSE);
                } else if (iM36973r != 0 && !"_ev".equals(str3)) {
                    m36984x(bundle2, iM36973r, iM36973r == 21 ? str2 : str3, bundle.get(str3));
                    bundle2.remove(str3);
                }
                if (m36933r0(str3) && (i10 = i10 + 1) > iM36425v) {
                    if (!c9094g7.m36338w().m36406H(null, C9395z4.f33774f1) || !z11) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(iM36425v).length() + 37);
                        sb2.append("Event can't contain more than ");
                        sb2.append(iM36425v);
                        sb2.append(" params");
                        c9094g7.mo36321a().m37005q().m36913c(sb2.toString(), c9094g7.m36309D().m36620a(str2), c9094g7.m36309D().m36624e(bundle));
                    }
                    m36932m0(bundle2, 5);
                    bundle2.remove(str3);
                    z11 = true;
                }
            }
        }
        return bundle2;
    }

    /* JADX INFO: renamed from: t0 */
    public final boolean m36977t0(String str, String str2) {
        if (str2 == null) {
            this.f33067a.mo36321a().m37005q().m36912b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.f33067a.mo36321a().m37005q().m36912b("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            this.f33067a.mo36321a().m37005q().m36913c("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                this.f33067a.mo36321a().m37005q().m36913c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    /* JADX INFO: renamed from: u */
    public final void m36978u(C9364x5 c9364x5, int i10) {
        Bundle bundle = c9364x5.f33634d;
        int i11 = 0;
        boolean z10 = false;
        for (String str : new TreeSet(bundle.keySet())) {
            if (m36933r0(str) && (i11 = i11 + 1) > i10) {
                C9094g7 c9094g7 = this.f33067a;
                if (!c9094g7.m36338w().m36406H(null, C9395z4.f33774f1) || !z10) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 37);
                    sb2.append("Event can't contain more than ");
                    sb2.append(i10);
                    sb2.append(" params");
                    c9094g7.mo36321a().m37005q().m36913c(sb2.toString(), c9094g7.m36309D().m36620a(c9364x5.f33631a), c9094g7.m36309D().m36624e(bundle));
                    m36932m0(bundle, 5);
                }
                bundle.remove(str);
                z10 = true;
            }
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final boolean m36979u0(String str, String str2) {
        if (str2 == null) {
            this.f33067a.mo36321a().m37005q().m36912b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.f33067a.mo36321a().m37005q().m36912b("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            if (iCodePointAt != 95) {
                this.f33067a.mo36321a().m37005q().m36913c("Name must start with a letter or _ (underscore). Type, name", str, str2);
                return false;
            }
            iCodePointAt = 95;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                this.f33067a.mo36321a().m37005q().m36913c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    /* JADX INFO: renamed from: v */
    public final void m36980v(Parcelable[] parcelableArr, int i10) {
        C8953m.m36047l(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i11 = 0;
            boolean z10 = false;
            for (String str : new TreeSet(bundle.keySet())) {
                if (m36933r0(str) && !m36927O(str, C9287s8.f33462d) && (i11 = i11 + 1) > i10) {
                    C9094g7 c9094g7 = this.f33067a;
                    if (!c9094g7.m36338w().m36406H(null, C9395z4.f33774f1) || !z10) {
                        C9316u5 c9316u5M37005q = c9094g7.mo36321a().m37005q();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 60);
                        sb2.append("Param can't contain more than ");
                        sb2.append(i10);
                        sb2.append(" item-scoped custom parameters");
                        c9316u5M37005q.m36913c(sb2.toString(), c9094g7.m36309D().m36621b(str), c9094g7.m36309D().m36624e(bundle));
                    }
                    m36932m0(bundle, 28);
                    bundle.remove(str);
                    z10 = true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final boolean m36981v0(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            this.f33067a.mo36321a().m37005q().m36912b("Name is required and can't be null. Type", str);
            return false;
        }
        C8953m.m36047l(str2);
        String[] strArr3 = f33574i;
        for (int i10 = 0; i10 < 3; i10++) {
            if (str2.startsWith(strArr3[i10])) {
                this.f33067a.mo36321a().m37005q().m36913c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !m36927O(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && m36927O(str2, strArr2)) {
            return true;
        }
        this.f33067a.mo36321a().m37005q().m36913c("Name is reserved. Type, name", str, str2);
        return false;
    }

    /* JADX INFO: renamed from: w */
    public final void m36982w(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                this.f33067a.m36308C().m36934A(bundle, str, bundle2.get(str));
            }
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final boolean m36983w0(String str, int i10, String str2) {
        if (str2 == null) {
            this.f33067a.mo36321a().m37005q().m36912b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i10) {
            return true;
        }
        this.f33067a.mo36321a().m37005q().m36914d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i10), str2);
        return false;
    }

    /* JADX INFO: renamed from: x */
    public final void m36984x(Bundle bundle, int i10, String str, Object obj) {
        if (m36932m0(bundle, i10)) {
            this.f33067a.m36338w();
            bundle.putString("_ev", m36971q(str, 40, true));
            if (obj != null) {
                C8953m.m36047l(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final int m36985x0(String str) {
        if (!m36979u0(NotificationCompat.CATEGORY_EVENT, str)) {
            return 2;
        }
        if (!m36981v0(NotificationCompat.CATEGORY_EVENT, C9271r8.f33433a, C9271r8.f33434b, str)) {
            return 13;
        }
        this.f33067a.m36338w();
        return !m36983w0(NotificationCompat.CATEGORY_EVENT, 40, str) ? 2 : 0;
    }

    /* JADX INFO: renamed from: y */
    public final int m36986y(String str, Object obj) {
        return "_ldl".equals(str) ? m36938C0("user property referrer", str, m36968o0(str), obj) : m36938C0("user property", str, m36968o0(str), obj) ? 0 : 7;
    }

    /* JADX INFO: renamed from: y0 */
    public final int m36987y0(String str) {
        if (!m36979u0("user property", str)) {
            return 6;
        }
        if (!m36981v0("user property", C9303t8.f33498a, null, str)) {
            return 15;
        }
        this.f33067a.m36338w();
        return !m36983w0("user property", 24, str) ? 6 : 0;
    }

    /* JADX INFO: renamed from: z */
    public final Object m36988z(String str, Object obj) {
        return "_ldl".equals(str) ? m36966n0(m36968o0(str), obj, true, false, null) : m36966n0(m36968o0(str), obj, false, false, null);
    }

    /* JADX INFO: renamed from: z0 */
    public final int m36989z0(String str) {
        if (!m36977t0("event param", str)) {
            return 3;
        }
        if (!m36981v0("event param", null, null, str)) {
            return 14;
        }
        this.f33067a.m36338w();
        return !m36983w0("event param", 40, str) ? 3 : 0;
    }
}
