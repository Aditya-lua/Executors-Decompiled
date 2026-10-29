package p185i3;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p117f3.AbstractC5332f;
import p143g3.AbstractC5980e;

/* JADX INFO: renamed from: i3.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\n\u0018\u0000 \f2\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m31665d2 = {"Li3/a;", "Lf3/f;", "Lg3/e;", "domError", "", "errorMessage", "<init>", "(Lg3/e;Ljava/lang/CharSequence;)V", "d", "Lg3/e;", "getDomError", "()Lg3/e;", "e", "a", "credentials_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C6634a extends AbstractC5332f {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final AbstractC5980e domError;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6634a(@NotNull AbstractC5980e domError, @NotNull CharSequence errorMessage) {
        super("androidx.credentials.TYPE_CREATE_RESTORE_CREDENTIAL_DOM_EXCEPTION/" + domError.getCom.appsflyer.sdk_base.referrer.Payload.TYPE java.lang.String(), errorMessage);
        Intrinsics.checkNotNullParameter(domError, "domError");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.domError = domError;
    }
}
