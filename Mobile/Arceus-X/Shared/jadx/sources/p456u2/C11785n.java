package p456u2;

import android.p017os.OutcomeReceiver;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p315nt.InterfaceC9557b;

/* JADX INFO: renamed from: u2.n */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31665d2 = {"R", "", "E", "Lnt/b;", "Landroid/os/OutcomeReceiver;", "a", "(Lnt/b;)Landroid/os/OutcomeReceiver;", "core-ktx_release"}, m31666k = 2, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C11785n {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <R, E extends Throwable> OutcomeReceiver m44080a(@NotNull InterfaceC9557b<? super R> interfaceC9557b) {
        return new ContinuationOutcomeReceiver(interfaceC9557b);
    }
}
