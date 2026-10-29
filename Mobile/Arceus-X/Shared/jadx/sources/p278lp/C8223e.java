package p278lp;

import com.withpersona.sdk2.inquiry.jpmynumber.C3763a;
import com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcReaderConfig;
import com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcReaderOutput;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mp.C8624h0;
import org.jetbrains.annotations.NotNull;
import p139g.InterfaceC5852a;

/* JADX INFO: renamed from: lp.e */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31665d2 = {"Lmp/h0;", "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcReaderConfig;", "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcReaderOutput;", "b", "()Lmp/h0;", "jp-my-number_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C8223e {
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final C8624h0<JpMyNumberNfcReaderConfig, JpMyNumberNfcReaderOutput> m33563b() {
        return new C8624h0<>(new C3763a(), new InterfaceC5852a() { // from class: lp.d
            @Override // p139g.InterfaceC5852a
            /* JADX INFO: renamed from: a */
            public final void mo4481a(Object obj) {
                C8223e.m33564c((JpMyNumberNfcReaderOutput) obj);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static final void m33564c(JpMyNumberNfcReaderOutput result) {
        Intrinsics.checkNotNullParameter(result, "result");
        new C8225g().m33568b(result);
    }
}
