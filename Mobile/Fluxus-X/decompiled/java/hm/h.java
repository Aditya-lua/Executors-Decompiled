package hm;

import com.roblox.protocols.nativeadsplatforminterface.generated.LoadAdFailureReason;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import zt.l;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhm/g;", "Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;", "a", "(Lhm/g;)Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;", "universalapp_googleProdRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class h {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18292a;

        static {
            int[] iArr = new int[g.values().length];
            try {
                iArr[g.NOT_INSTALLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g.NOT_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g.GENERATE_SIGNAL_FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[g.SERVE_AD_FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[g.NO_FILL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[g.LOAD_FAILED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[g.TIMED_OUT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f18292a = iArr;
        }
    }

    @NotNull
    public static final LoadAdFailureReason a(@Nullable g gVar) {
        switch (gVar == null ? -1 : a.f18292a[gVar.ordinal()]) {
            case -1:
                return LoadAdFailureReason.UNDEFINED;
            case 0:
            default:
                throw new l();
            case 1:
                return LoadAdFailureReason.NOTINSTALLED;
            case 2:
                return LoadAdFailureReason.NOTINITIALIZED;
            case 3:
                return LoadAdFailureReason.GENERATESIGNALFAILED;
            case 4:
                return LoadAdFailureReason.SERVEADFAILED;
            case 5:
                return LoadAdFailureReason.NOFILL;
            case 6:
                return LoadAdFailureReason.LOADFAILED;
            case 7:
                return LoadAdFailureReason.TIMEDOUT;
        }
    }
}
