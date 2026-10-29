package mp;

import androidx.activity.result.ActivityResult;
import kotlin.Metadata;
import mu.EnumC8666a;
import nu.C9578i0;
import nu.InterfaceC9564b0;
import nu.InterfaceC9574g0;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p315nt.InterfaceC9557b;

/* JADX INFO: renamed from: mp.g0 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\u0018\u0000 \u00072\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ \u0010\f\u001a\u00020\u000b2\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\tH\u0096A¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, m31665d2 = {"Lmp/g0;", "Lnu/g0;", "Landroidx/activity/result/ActivityResult;", "<init>", "()V", "activityResult", "", "b", "(Landroidx/activity/result/ActivityResult;)Z", "Lnu/i;", "collector", "", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "a", "launchers_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C8622g0 implements InterfaceC9574g0<ActivityResult> {

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final InterfaceC9564b0<ActivityResult> f31609c = C9578i0.m37758b(0, 1, EnumC8666a.DROP_OLDEST, 1, null);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC9564b0<ActivityResult> f31610a = f31609c;

    /* JADX INFO: renamed from: b */
    public final boolean m34679b(@Nullable ActivityResult activityResult) {
        return f31609c.mo37707a(activityResult);
    }

    @Override // nu.InterfaceC9574g0, nu.InterfaceC9575h
    @Nullable
    public Object collect(@NotNull InterfaceC9577i<? super ActivityResult> interfaceC9577i, @NotNull InterfaceC9557b<?> interfaceC9557b) {
        return this.f31610a.collect(interfaceC9577i, interfaceC9557b);
    }
}
