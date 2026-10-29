package com.withpersona.sdk2.inquiry.shared.inquiry_session;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import com.google.android.gms.tasks.Task;
import jt.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nt.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.c;
import pt.d;
import pt.f;
import pt.l;
import tq.GpsData;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/content/Context;", "context", "Ltq/a;", "a", "(Landroid/content/Context;Lnt/b;)Ljava/lang/Object;", "", "b", "(Landroid/content/Context;)Z", "shared_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.shared.inquiry_session.a$a, reason: collision with other inner class name */
    @f(c = "com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsUtilsKt", f = "GpsUtils.kt", l = {25}, m = "getLocationAndPrecision")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class C0247a extends d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f13208t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f13209u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f13210v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f13211w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public /* synthetic */ Object f13212x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f13213y;

        public C0247a(b<? super C0247a> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f13212x = obj;
            this.f13213y |= Integer.MIN_VALUE;
            return a.a(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0090 A[Catch: Exception -> 0x00a3, TryCatch #0 {Exception -> 0x00a3, blocks: (B:12:0x0032, B:32:0x008a, B:34:0x0090, B:40:0x009d, B:36:0x0095, B:17:0x004a, B:21:0x0056, B:28:0x0066), top: B:44:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0095 A[Catch: Exception -> 0x00a3, TryCatch #0 {Exception -> 0x00a3, blocks: (B:12:0x0032, B:32:0x008a, B:34:0x0090, B:40:0x009d, B:36:0x0095, B:17:0x004a, B:21:0x0056, B:28:0x0066), top: B:44:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0098  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final Object a(@NotNull Context context, @NotNull b<? super GpsData> bVar) {
        C0247a c0247a;
        int i10;
        int i11;
        int i12;
        int i13;
        Location location;
        tq.b bVar2;
        if (bVar instanceof C0247a) {
            c0247a = (C0247a) bVar;
            int i14 = c0247a.f13213y;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c0247a.f13213y = i14 - Integer.MIN_VALUE;
            } else {
                c0247a = new C0247a(bVar);
            }
        } else {
            c0247a = new C0247a(bVar);
        }
        Object objA = c0247a.f13212x;
        Object objE = c.e();
        int i15 = c0247a.f13213y;
        try {
            if (i15 == 0) {
                o.b(objA);
                lb.b bVarA = lb.f.a(context);
                Intrinsics.checkNotNullExpressionValue(bVarA, "getFusedLocationProviderClient(...)");
                i10 = l2.b.a(context, "android.permission.ACCESS_FINE_LOCATION") == 0 ? 1 : 0;
                i11 = l2.b.a(context, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? 1 : 0;
                if (i10 == 0 && i11 == 0) {
                    location = null;
                } else {
                    Task lastLocation = bVarA.getLastLocation();
                    Intrinsics.checkNotNullExpressionValue(lastLocation, "getLastLocation(...)");
                    c0247a.f13208t = l.a(context);
                    c0247a.f13209u = l.a(bVarA);
                    c0247a.f13210v = i10;
                    c0247a.f13211w = i11;
                    c0247a.f13213y = 1;
                    objA = vu.b.a(lastLocation, c0247a);
                    if (objA == objE) {
                        return objE;
                    }
                    i12 = i10;
                    i13 = i11;
                }
                if (i10 != 0) {
                    bVar2 = tq.b.PRECISE;
                } else if (i11 != 0) {
                    bVar2 = tq.b.ROUGH;
                } else {
                    bVar2 = null;
                }
                if (location != null && bVar2 != null) {
                    return new GpsData(location, bVar2);
                }
                return null;
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i13 = c0247a.f13211w;
            i12 = c0247a.f13210v;
            o.b(objA);
            location = (Location) objA;
            i11 = i13;
            i10 = i12;
            if (i10 != 0) {
                bVar2 = tq.b.PRECISE;
            } else if (i11 != 0) {
                bVar2 = tq.b.ROUGH;
            } else {
                bVar2 = null;
            }
            if (location != null) {
                return new GpsData(location, bVar2);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static final boolean b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("location");
        Intrinsics.d(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        return ((LocationManager) systemService).isProviderEnabled("gps");
    }
}
