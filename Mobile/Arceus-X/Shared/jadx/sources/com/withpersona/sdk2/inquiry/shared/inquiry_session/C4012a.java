package com.withpersona.sdk2.inquiry.shared.inquiry_session;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.gms.tasks.Task;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lb.C8099b;
import lb.C8103f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7348o;
import p261l2.C7975b;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p450tq.EnumC11739b;
import p450tq.GpsData;
import pt.AbstractC10342d;
import pt.C10350l;
import pt.InterfaceC10344f;
import vu.C12264b;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.shared.inquiry_session.a */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31665d2 = {"Landroid/content/Context;", "context", "Ltq/a;", "a", "(Landroid/content/Context;Lnt/b;)Ljava/lang/Object;", "", "b", "(Landroid/content/Context;)Z", "shared_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4012a {

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.shared.inquiry_session.a$a */
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsUtilsKt", m39664f = "GpsUtils.kt", m39665l = {25}, m39666m = "getLocationAndPrecision")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f16942t;

        /* JADX INFO: renamed from: u */
        public Object f16943u;

        /* JADX INFO: renamed from: v */
        public int f16944v;

        /* JADX INFO: renamed from: w */
        public int f16945w;

        /* JADX INFO: renamed from: x */
        public /* synthetic */ Object f16946x;

        /* JADX INFO: renamed from: y */
        public int f16947y;

        public a(InterfaceC9557b<? super a> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f16946x = obj;
            this.f16947y |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C4012a.m20430a(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0090 A[Catch: Exception -> 0x00a3, TryCatch #0 {Exception -> 0x00a3, blocks: (B:12:0x0032, B:32:0x008a, B:34:0x0090, B:40:0x009d, B:36:0x0095, B:17:0x004a, B:21:0x0056, B:28:0x0066), top: B:44:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0095 A[Catch: Exception -> 0x00a3, TryCatch #0 {Exception -> 0x00a3, blocks: (B:12:0x0032, B:32:0x008a, B:34:0x0090, B:40:0x009d, B:36:0x0095, B:17:0x004a, B:21:0x0056, B:28:0x0066), top: B:44:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0098  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final Object m20430a(@NotNull Context context, @NotNull InterfaceC9557b<? super GpsData> interfaceC9557b) {
        a aVar;
        int i10;
        int i11;
        int i12;
        int i13;
        Location location;
        EnumC11739b enumC11739b;
        if (interfaceC9557b instanceof a) {
            aVar = (a) interfaceC9557b;
            int i14 = aVar.f16947y;
            if ((i14 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                aVar.f16947y = i14 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                aVar = new a(interfaceC9557b);
            }
        } else {
            aVar = new a(interfaceC9557b);
        }
        Object objM45512a = aVar.f16946x;
        Object objM38805e = C10047c.m38805e();
        int i15 = aVar.f16947y;
        try {
            if (i15 == 0) {
                C7348o.m30470b(objM45512a);
                C8099b c8099bM33322a = C8103f.m33322a(context);
                Intrinsics.checkNotNullExpressionValue(c8099bM33322a, "getFusedLocationProviderClient(...)");
                i10 = C7975b.m33003a(context, "android.permission.ACCESS_FINE_LOCATION") == 0 ? 1 : 0;
                i11 = C7975b.m33003a(context, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? 1 : 0;
                if (i10 == 0 && i11 == 0) {
                    location = null;
                } else {
                    Task lastLocation = c8099bM33322a.getLastLocation();
                    Intrinsics.checkNotNullExpressionValue(lastLocation, "getLastLocation(...)");
                    aVar.f16942t = C10350l.m39676a(context);
                    aVar.f16943u = C10350l.m39676a(c8099bM33322a);
                    aVar.f16944v = i10;
                    aVar.f16945w = i11;
                    aVar.f16947y = 1;
                    objM45512a = C12264b.m45512a(lastLocation, aVar);
                    if (objM45512a == objM38805e) {
                        return objM38805e;
                    }
                    i12 = i10;
                    i13 = i11;
                }
                if (i10 != 0) {
                    enumC11739b = EnumC11739b.PRECISE;
                } else if (i11 != 0) {
                    enumC11739b = EnumC11739b.ROUGH;
                } else {
                    enumC11739b = null;
                }
                if (location != null && enumC11739b != null) {
                    return new GpsData(location, enumC11739b);
                }
                return null;
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i13 = aVar.f16945w;
            i12 = aVar.f16944v;
            C7348o.m30470b(objM45512a);
            location = (Location) objM45512a;
            i11 = i13;
            i10 = i12;
            if (i10 != 0) {
                enumC11739b = EnumC11739b.PRECISE;
            } else if (i11 != 0) {
                enumC11739b = EnumC11739b.ROUGH;
            } else {
                enumC11739b = null;
            }
            if (location != null) {
                return new GpsData(location, enumC11739b);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m20431b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("location");
        Intrinsics.m31981d(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        return ((LocationManager) systemService).isProviderEnabled("gps");
    }
}
