package p146g6;

import android.net.NetworkRequest;
import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p536x5.EnumC12734x;

/* JADX INFO: renamed from: g6.u */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m31665d2 = {"Lx5/x;", "Landroid/net/NetworkRequest;", "a", "(Lx5/x;)Landroid/net/NetworkRequest;", "work-runtime_release"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C6041u {

    /* JADX INFO: renamed from: g6.u$a */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f23321a;

        static {
            int[] iArr = new int[EnumC12734x.values().length];
            try {
                iArr[EnumC12734x.METERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC12734x.UNMETERED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC12734x.NOT_ROAMING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f23321a = iArr;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static final NetworkRequest m26856a(@NotNull EnumC12734x enumC12734x) {
        Intrinsics.checkNotNullParameter(enumC12734x, "<this>");
        if (enumC12734x == EnumC12734x.NOT_REQUIRED) {
            return null;
        }
        NetworkRequest.Builder builderRemoveCapability = new NetworkRequest.Builder().addCapability(12).addCapability(16).removeCapability(15).removeCapability(13);
        if (Build.VERSION.SDK_INT >= 30 && enumC12734x == EnumC12734x.TEMPORARILY_UNMETERED) {
            return builderRemoveCapability.addCapability(25).build();
        }
        int i10 = a.f23321a[enumC12734x.ordinal()];
        if (i10 == 1) {
            builderRemoveCapability = builderRemoveCapability.addTransportType(0);
        } else if (i10 == 2) {
            builderRemoveCapability = builderRemoveCapability.addCapability(11);
        } else if (i10 == 3) {
            builderRemoveCapability = builderRemoveCapability.addCapability(18);
        }
        return builderRemoveCapability.build();
    }
}
