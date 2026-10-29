package p390qp;

import com.withpersona.sdk2.inquiry.nfc.PassportNfcReaderOutput;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mu.EnumC8666a;
import nu.C9578i0;
import nu.InterfaceC9564b0;
import nu.InterfaceC9574g0;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p315nt.InterfaceC9557b;

/* JADX INFO: renamed from: qp.i */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0096A¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, m31665d2 = {"Lqp/i;", "Lnu/g0;", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;", "<init>", "()V", "output", "", "b", "(Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;)Z", "Lnu/i;", "collector", "", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "a", "nfc_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C10695i implements InterfaceC9574g0<PassportNfcReaderOutput> {

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final InterfaceC9564b0<PassportNfcReaderOutput> f38219c = C9578i0.m37758b(0, 1, EnumC8666a.DROP_OLDEST, 1, null);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC9564b0<PassportNfcReaderOutput> f38220a = f38219c;

    /* JADX INFO: renamed from: b */
    public final boolean m40770b(@NotNull PassportNfcReaderOutput output) {
        Intrinsics.checkNotNullParameter(output, "output");
        return f38219c.mo37707a(output);
    }

    @Override // nu.InterfaceC9574g0, nu.InterfaceC9575h
    @Nullable
    public Object collect(@NotNull InterfaceC9577i<? super PassportNfcReaderOutput> interfaceC9577i, @NotNull InterfaceC9557b<?> interfaceC9557b) {
        return this.f38220a.collect(interfaceC9577i, interfaceC9557b);
    }
}
