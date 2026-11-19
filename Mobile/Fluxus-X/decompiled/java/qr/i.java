package qr;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004R\u0014\u0010\b\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\u000e\u001a\u00020\t8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0001\b\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c¨\u0006\u001dÀ\u0006\u0003"}, d2 = {"Lqr/i;", "Lqr/d;", "Lqr/w;", "Lqr/h0;", "Lqr/u2;", BuildConfig.FLAVOR, "getName", "()Ljava/lang/String;", "name", BuildConfig.FLAVOR, "Y0", "()Z", "b", "(Z)V", "wasTapped", "getAutoSubmitCountdownText", "autoSubmitCountdownText", BuildConfig.FLAVOR, "getAutoSubmitIntervalSeconds", "()Ljava/lang/Integer;", "autoSubmitIntervalSeconds", "Lqr/a;", "Lqr/j;", "Lqr/n;", "Lqr/p;", "Lqr/s2;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/f;", "Lqr/p5;", "Lqr/d6;", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface i extends d, w, h0, u2 {
    boolean Y0();

    void b(boolean z10);

    @Override // qr.d
    @Nullable
    String getAutoSubmitCountdownText();

    @Nullable
    Integer getAutoSubmitIntervalSeconds();

    @Override // qr.x5
    @NotNull
    String getName();
}
