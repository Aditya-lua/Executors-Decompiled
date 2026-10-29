package p096e7;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p568y6.InterfaceC13102a;
import p568y6.Size;

/* JADX INFO: renamed from: e7.t */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\u000bB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000e"}, m31665d2 = {"Le7/t;", "Le7/o;", "Le7/u;", "logger", "<init>", "(Le7/u;)V", "Ly6/g;", "size", "", "b", "(Ly6/g;)Z", "a", "()Z", "Le7/u;", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4874t implements InterfaceC4869o {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final InterfaceC4875u logger;

    public C4874t(@Nullable InterfaceC4875u interfaceC4875u) {
        this.logger = interfaceC4875u;
    }

    @Override // p096e7.InterfaceC4869o
    /* JADX INFO: renamed from: a */
    public boolean getAllowHardware() {
        return C4865k.f19555a.m23468b(this.logger);
    }

    @Override // p096e7.InterfaceC4869o
    /* JADX INFO: renamed from: b */
    public boolean mo23476b(@NotNull Size size) {
        InterfaceC13102a interfaceC13102aM48711d = size.m48711d();
        if ((interfaceC13102aM48711d instanceof InterfaceC13102a.a ? ((InterfaceC13102a.a) interfaceC13102aM48711d).getPx() : Integer.MAX_VALUE) <= 100) {
            return false;
        }
        InterfaceC13102a interfaceC13102aM48710c = size.m48710c();
        return (interfaceC13102aM48710c instanceof InterfaceC13102a.a ? ((InterfaceC13102a.a) interfaceC13102aM48710c).getPx() : Integer.MAX_VALUE) > 100;
    }
}
