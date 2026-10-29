package p176ho;

import com.withpersona.sdk2.inquiry.featureflag.network.FeatureFlagResponse;
import kotlin.Metadata;
import mv.InterfaceC8697f;
import mv.InterfaceC8700i;
import mv.InterfaceC8711t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p231jv.C7396x;
import p315nt.InterfaceC9557b;

/* JADX INFO: renamed from: ho.a */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J0\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, m31665d2 = {"Lho/a;", "", "", "sessionToken", "", "gateId", "Ljv/x;", "Lcom/withpersona/sdk2/inquiry/featureflag/network/FeatureFlagResponse;", "a", "(Ljava/lang/String;[Ljava/lang/String;Lnt/b;)Ljava/lang/Object;", "feature-flag_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface InterfaceC6474a {
    @InterfaceC8697f("/api/internal/verify/v1/feature-flags")
    @Nullable
    /* JADX INFO: renamed from: a */
    Object m28225a(@InterfaceC8700i("Authorization") @NotNull String str, @InterfaceC8711t("gates[]") @NotNull String[] strArr, @NotNull InterfaceC9557b<? super C7396x<FeatureFlagResponse>> interfaceC9557b);
}
