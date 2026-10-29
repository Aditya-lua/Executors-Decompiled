package p146g6;

import android.net.NetworkRequest;
import android.os.Build;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: g6.t */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u0015\u0010\t\u001a\u00020\u0000*\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\n"}, m31665d2 = {"", "a", "[I", "defaultCapabilities", "Landroid/net/NetworkRequest;", "c", "(Landroid/net/NetworkRequest;)[I", "transportTypesCompat", "b", "capabilitiesCompat", "work-runtime_release"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C6040t {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final int[] f23320a = {13, 15, 14};

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final int[] m26854b(@NotNull NetworkRequest networkRequest) {
        Intrinsics.checkNotNullParameter(networkRequest, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            return C6038r.f23316a.m26848a(networkRequest);
        }
        int[] iArr = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 36, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 30; i10++) {
            int i11 = iArr[i10];
            if (C6037q.f23315a.m26846c(networkRequest, i11)) {
                arrayList.add(Integer.valueOf(i11));
            }
        }
        return CollectionsKt.m31686L0(arrayList);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final int[] m26855c(@NotNull NetworkRequest networkRequest) {
        Intrinsics.checkNotNullParameter(networkRequest, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            return C6038r.f23316a.m26849b(networkRequest);
        }
        int[] iArr = {2, 0, 3, 6, 10, 9, 8, 4, 1, 5};
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 10; i10++) {
            int i11 = iArr[i10];
            if (C6037q.f23315a.m26847d(networkRequest, i11)) {
                arrayList.add(Integer.valueOf(i11));
            }
        }
        return CollectionsKt.m31686L0(arrayList);
    }
}
