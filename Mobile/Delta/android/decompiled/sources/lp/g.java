package lp;

import com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcReaderOutput;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nu.b0;
import nu.g0;
import nu.i0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0096A¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Llp/g;", "Lnu/g0;", "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcReaderOutput;", "<init>", "()V", "output", "", "b", "(Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcReaderOutput;)Z", "Lnu/i;", "collector", "", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "a", "jp-my-number_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements g0<JpMyNumberNfcReaderOutput> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final b0<JpMyNumberNfcReaderOutput> f23496c = i0.b(0, 1, mu.a.DROP_OLDEST, 1, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0<JpMyNumberNfcReaderOutput> f23497a = f23496c;

    public final boolean b(@NotNull JpMyNumberNfcReaderOutput output) {
        Intrinsics.checkNotNullParameter(output, "output");
        return f23496c.a(output);
    }

    @Override // nu.g0, nu.h
    @Nullable
    public Object collect(@NotNull nu.i<? super JpMyNumberNfcReaderOutput> iVar, @NotNull nt.b<?> bVar) {
        return this.f23497a.collect(iVar, bVar);
    }
}
