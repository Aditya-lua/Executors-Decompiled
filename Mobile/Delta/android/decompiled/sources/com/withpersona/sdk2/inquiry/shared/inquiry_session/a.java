package com.withpersona.sdk2.inquiry.shared.inquiry_session;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import com.google.android.gms.tasks.Task;
import gt.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lt.b;
import mt.c;
import nt.d;
import nt.f;
import nt.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rq.GpsData;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/content/Context;", "context", "Lrq/a;", "a", "(Landroid/content/Context;Llt/b;)Ljava/lang/Object;", "", "b", "(Landroid/content/Context;)Z", "shared_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.shared.inquiry_session.a$a, reason: collision with other inner class name */
    @f(c = "com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsUtilsKt", f = "GpsUtils.kt", l = {25}, m = "getLocationAndPrecision")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class C0250a extends d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f13289t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f13290u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f13291v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f13292w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public /* synthetic */ Object f13293x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f13294y;

        public C0250a(b<? super C0250a> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f13293x = obj;
            this.f13294y |= Integer.MIN_VALUE;
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
        C0250a c0250a;
        int i10;
        int i11;
        int i12;
        int i13;
        Location location;
        rq.b bVar2;
        if (bVar instanceof C0250a) {
            c0250a = (C0250a) bVar;
            int i14 = c0250a.f13294y;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c0250a.f13294y = i14 - Integer.MIN_VALUE;
            } else {
                c0250a = new C0250a(bVar);
            }
        } else {
            c0250a = new C0250a(bVar);
        }
        Object objA = c0250a.f13293x;
        Object objE = c.e();
        int i15 = c0250a.f13294y;
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
                    c0250a.f13289t = l.a(context);
                    c0250a.f13290u = l.a(bVarA);
                    c0250a.f13291v = i10;
                    c0250a.f13292w = i11;
                    c0250a.f13294y = 1;
                    objA = tu.b.a(lastLocation, c0250a);
                    if (objA == objE) {
                        return objE;
                    }
                    i12 = i10;
                    i13 = i11;
                }
                if (i10 != 0) {
                    bVar2 = rq.b.PRECISE;
                } else if (i11 != 0) {
                    bVar2 = rq.b.ROUGH;
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
            i13 = c0250a.f13292w;
            i12 = c0250a.f13291v;
            o.b(objA);
            location = (Location) objA;
            i11 = i13;
            i10 = i12;
            if (i10 != 0) {
                bVar2 = rq.b.PRECISE;
            } else if (i11 != 0) {
                bVar2 = rq.b.ROUGH;
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
