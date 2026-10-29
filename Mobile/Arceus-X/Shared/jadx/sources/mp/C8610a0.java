package mp;

import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import kotlin.Metadata;
import mu.EnumC8666a;
import nu.C9578i0;
import nu.InterfaceC9564b0;
import nu.InterfaceC9574g0;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p315nt.InterfaceC9557b;

/* JADX INFO: renamed from: mp.a0 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0096A¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m31665d2 = {"Lmp/a0;", "Lnu/g0;", "", "<init>", "()V", InquiryField.BooleanField.TYPE, "b", "(Z)Z", "Lnu/i;", "collector", "", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "a", "launchers_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C8610a0 implements InterfaceC9574g0<Boolean> {

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final InterfaceC9564b0<Boolean> f31596c = C9578i0.m37758b(0, 1, EnumC8666a.DROP_OLDEST, 1, null);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC9564b0<Boolean> f31597a = f31596c;

    /* JADX INFO: renamed from: b */
    public final boolean m34659b(boolean z10) {
        return f31596c.mo37707a(Boolean.valueOf(z10));
    }

    @Override // nu.InterfaceC9574g0, nu.InterfaceC9575h
    @Nullable
    public Object collect(@NotNull InterfaceC9577i<? super Boolean> interfaceC9577i, @NotNull InterfaceC9557b<?> interfaceC9557b) {
        return this.f31597a.collect(interfaceC9577i, interfaceC9557b);
    }
}
