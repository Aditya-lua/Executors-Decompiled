package com.appsflyer.share;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import qt.a;
import qt.b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v3 com.appsflyer.share.MediationNetwork[], still in use, count: 1, list:
  (r0v3 com.appsflyer.share.MediationNetwork[]) from 0x00b8: INVOKE (r0v3 com.appsflyer.share.MediationNetwork[]) STATIC call: qt.b.a(java.lang.Enum[]):qt.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):qt.a<E extends java.lang.Enum<E>> (m), WRAPPED]
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017"}, d2 = {"Lcom/appsflyer/share/MediationNetwork;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "IRONSOURCE", "APPLOVIN_MAX", "GOOGLE_ADMOB", "FYBER", "APPODEAL", "ADMOST", "TOPON", "TRADPLUS", "YANDEX", "CHARTBOOST", "UNITY", "TOPON_PTE", "CUSTOM_MEDIATION", "DIRECT_MONETIZATION_NETWORK"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MediationNetwork {
    IRONSOURCE("ironsource"),
    APPLOVIN_MAX("applovinmax"),
    GOOGLE_ADMOB("googleadmob"),
    FYBER("fyber"),
    APPODEAL("appodeal"),
    ADMOST("Admost"),
    TOPON("Topon"),
    TRADPLUS("Tradplus"),
    YANDEX("Yandex"),
    CHARTBOOST("chartboost"),
    UNITY("Unity"),
    TOPON_PTE("toponpte"),
    CUSTOM_MEDIATION("customMediation"),
    DIRECT_MONETIZATION_NETWORK("directMonetizationNetwork");

    private static final /* synthetic */ a AFLogger;

    @NotNull
    private final String value;

    static {
        AFLogger = b.a(mediationNetworkArr);
    }

    private MediationNetwork(String str) {
        super(str, i);
        this.value = str;
    }

    @NotNull
    public static a<MediationNetwork> getEntries() {
        return AFLogger;
    }

    public static MediationNetwork valueOf(String str) {
        return (MediationNetwork) Enum.valueOf(MediationNetwork.class, str);
    }

    public static MediationNetwork[] values() {
        return (MediationNetwork[]) unregisterClient.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
