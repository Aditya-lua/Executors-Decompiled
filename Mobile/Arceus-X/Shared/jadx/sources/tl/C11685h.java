package tl;

import com.roblox.protocols.nativeadsplatforminterface.generated.LoadAdFailureReason;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7345l;

/* JADX INFO: renamed from: tl.h */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m31665d2 = {"Ltl/g;", "Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;", "a", "(Ltl/g;)Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;", "universalapp_googleProdRelease"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C11685h {

    /* JADX INFO: renamed from: tl.h$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f41316a;

        static {
            int[] iArr = new int[EnumC11683g.values().length];
            try {
                iArr[EnumC11683g.NOT_INSTALLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC11683g.NOT_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC11683g.GENERATE_SIGNAL_FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC11683g.SERVE_AD_FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC11683g.NO_FILL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC11683g.LOAD_FAILED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC11683g.TIMED_OUT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f41316a = iArr;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final LoadAdFailureReason m43896a(@Nullable EnumC11683g enumC11683g) {
        switch (enumC11683g == null ? -1 : a.f41316a[enumC11683g.ordinal()]) {
            case -1:
                return LoadAdFailureReason.UNDEFINED;
            case 0:
            default:
                throw new C7345l();
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
