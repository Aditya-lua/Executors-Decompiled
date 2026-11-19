package hr;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import com.github.luben.zstd.BuildConfig;
import com.google.android.gms.tasks.Task;
import gu.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;
import zt.o;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/content/Context;", "context", "Lhr/b;", "a", "(Landroid/content/Context;Leu/b;)Ljava/lang/Object;", BuildConfig.FLAVOR, "b", "(Landroid/content/Context;)Z", "shared_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class f {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsUtilsKt", f = "GpsUtils.kt", l = {25}, m = "getLocationAndPrecision")
    public static final class a extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f18539t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f18540u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f18541v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f18542w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public /* synthetic */ Object f18543x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f18544y;

        public a(eu.b<? super a> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f18543x = obj;
            this.f18544y |= Integer.MIN_VALUE;
            return f.a(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0090 A[Catch: Exception -> 0x00a3, TryCatch #0 {Exception -> 0x00a3, blocks: (B:12:0x0032, B:32:0x008a, B:34:0x0090, B:40:0x009d, B:36:0x0095, B:17:0x004a, B:21:0x0056, B:28:0x0066), top: B:44:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0095 A[Catch: Exception -> 0x00a3, TryCatch #0 {Exception -> 0x00a3, blocks: (B:12:0x0032, B:32:0x008a, B:34:0x0090, B:40:0x009d, B:36:0x0095, B:17:0x004a, B:21:0x0056, B:28:0x0066), top: B:44:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0098  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final Object a(@NotNull Context context, @NotNull eu.b<? super GpsData> bVar) {
        a aVar;
        int i10;
        int i11;
        int i12;
        int i13;
        Location location;
        c cVar;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i14 = aVar.f18544y;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f18544y = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(bVar);
            }
        } else {
            aVar = new a(bVar);
        }
        Object objA = aVar.f18543x;
        Object objE = fu.c.e();
        int i15 = aVar.f18544y;
        try {
            if (i15 == 0) {
                o.b(objA);
                mb.b bVarA = mb.f.a(context);
                Intrinsics.checkNotNullExpressionValue(bVarA, "getFusedLocationProviderClient(...)");
                i10 = l2.b.a(context, "android.permission.ACCESS_FINE_LOCATION") == 0 ? 1 : 0;
                i11 = l2.b.a(context, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? 1 : 0;
                if (i10 == 0 && i11 == 0) {
                    location = null;
                } else {
                    Task lastLocation = bVarA.getLastLocation();
                    Intrinsics.checkNotNullExpressionValue(lastLocation, "getLastLocation(...)");
                    aVar.f18539t = l.a(context);
                    aVar.f18540u = l.a(bVarA);
                    aVar.f18541v = i10;
                    aVar.f18542w = i11;
                    aVar.f18544y = 1;
                    objA = lv.b.a(lastLocation, aVar);
                    if (objA == objE) {
                        return objE;
                    }
                    i12 = i10;
                    i13 = i11;
                }
                if (i10 != 0) {
                    cVar = c.PRECISE;
                } else if (i11 != 0) {
                    cVar = c.ROUGH;
                } else {
                    cVar = null;
                }
                if (location != null && cVar != null) {
                    return new GpsData(location, cVar);
                }
                return null;
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i13 = aVar.f18542w;
            i12 = aVar.f18541v;
            o.b(objA);
            location = (Location) objA;
            i11 = i13;
            i10 = i12;
            if (i10 != 0) {
                cVar = c.PRECISE;
            } else if (i11 != 0) {
                cVar = c.ROUGH;
            } else {
                cVar = null;
            }
            if (location != null) {
                return new GpsData(location, cVar);
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
