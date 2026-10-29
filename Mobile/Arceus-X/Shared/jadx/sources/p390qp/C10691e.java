package p390qp;

import com.withpersona.sdk2.inquiry.nfc.PassportNfcReaderConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p139g.AbstractC5854c;

/* JADX INFO: renamed from: qp.e */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\n"}, m31665d2 = {"Lqp/e;", "", "Lg/c;", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderConfig;", "passportNfcReaderLauncher", "<init>", "(Lg/c;)V", "a", "()Lg/c;", "Lg/c;", "nfc_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C10691e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final AbstractC5854c<PassportNfcReaderConfig> passportNfcReaderLauncher;

    public C10691e(@NotNull AbstractC5854c<PassportNfcReaderConfig> passportNfcReaderLauncher) {
        Intrinsics.checkNotNullParameter(passportNfcReaderLauncher, "passportNfcReaderLauncher");
        this.passportNfcReaderLauncher = passportNfcReaderLauncher;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final AbstractC5854c<PassportNfcReaderConfig> m40763a() {
        return this.passportNfcReaderLauncher;
    }
}
